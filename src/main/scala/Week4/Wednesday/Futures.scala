package Week4.Wednesday

import Week3.Friday.Either.{NewError, isOdd}

import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.util.{Failure, Success}


object Futures extends App {

  // What are futures?
  // These represent values that are not yet ready - but they will be in the future.

  // Why do we use them?
  // If we didn't use them, sometimes our programme would pause and wait for long operations to complete, (for example, fetching data from a database or an API.
  //The future allows us to run tasks in the background (like fetching data), without stopping the whole programme.


  //How do we create them
  val futureHelloWorld: Future[String] = Future {
    Thread.sleep(2000) // pausing the thread for 2 seconds
    "Hello World"

  }

  //How can we print these Futures?

  //  //NOT LIKE THIS
  //  println("Standard print line: " + futureHelloWorld) // This is printing the future itself, rather than the value.
  //
  //  //1st way - use .foreach as a callback
  //  futureHelloWorld.foreach(result => println(s"Using .foreach $result"))
  //
  //  // 2nd way - use onComplete (use this when we want to handle success and failure)
  //  futureHelloWorld.onComplete{
  //    case Success(result) => println(s"Using onComplete $result")
  //    case Failure(exception) => println(s"Failure with onComplete: ${exception.getMessage}")
  //
  //  }
  //
  //  // 3rd way - using Await.result
  //  val waitTime: FiniteDuration =  Duration(5, TimeUnit.SECONDS) // wait 5 seconds, if you don't receive the value in 5 seconds, time out.
  //  println("Using await: " + Await.result(futureHelloWorld, waitTime))
  //  // This will BLOCK THE THREAD ( and therefore future cannot be used in parallel)


  println("I am printed after the futures are called.") //This is printed straight away

  //Thread.sleep(3000) //This ensures the object thread doesnt finish before the future has completed.


  def additionInTheFuture(a: Int, b: Int): Future[Int] = Future {
    Thread.sleep(2000)
    a + b

  }

  additionInTheFuture(5, 5).foreach(result => println(result))

  additionInTheFuture(5, 5).onComplete {
    case Success(result) => println(s"Using onComplete $result")
    case Failure(exception) => println(s"Failure with onComplete: ${exception.getMessage}")
  }
    val waitTime: FiniteDuration =  Duration(5, TimeUnit.SECONDS)
  //  println("Using await: " + Await.result(additionInTheFuture(5,5), waitTime))


  def fetchIsOddOrErrorInTheFuture(x: Int): Future[Either[NewError, String]] = Future {

    Thread.sleep(1000)
    isOdd(x)
  }

  // why val? - Because the method it is calling is already future, and i don't need to make a new one.
  val eventualIsOddError: Future[Either[NewError, String]] = fetchIsOddOrErrorInTheFuture(5)


  Thread.sleep(1200) //This will force the thread to sleep before it gets to the .value in the pattern match which forces it to get the future immediately.


  //This function only cares about deciding if the future completed or not. It will not let us out of the Either. If it completes and receives either Left or Right, it will be a success. If the future didn't complete due to a timeout, it will hit the None. This is better than the code crashing.
  //What is .value is immediately checking the value before the future has had time to complete
  val result = eventualIsOddError.value match {
    case Some(Success(complete)) => s"Future completed: $complete"
    case None => "Future did not complete in the given time"
  }

  println("isOddOrError" + result)


  // Combine futures?
  // we do this when we want multiple tasks done at once
  //Not force them to sleep; this means they will run asynchronously, in parallel on separate threads.

  val futureInt1: Future[Int] = Future {
    100
  }

  val futureInt2: Future[Int] = Future {
    8
  }

  val combinedFutureInt = for {//for comprehension will wait for all results to be back before it yields the final result.
    number1 <- futureInt1
    number2 <- futureInt2
  } yield number1 + number2

  println(Await.result(combinedFutureInt, waitTime))




  val futureName: Future[String] = Future {
    Thread.sleep(scala.util.Random.nextInt(5000))
    "User: Alice"
  }

  val futureOrder: Future[String] = Future {
    Thread.sleep(scala.util.Random.nextInt(5000))
    " Order: Pizza"
  }

  val combinedFutureOrder = for {
    name1 <- futureName
    order1 <- futureOrder
  } yield name1 + order1


  println(Await.result(combinedFutureOrder, waitTime))

  //capture start time somehow

//  combinedFutureOrder.onComplete{
    //    case Success(result) => println(s"Using onComplete $result")
    //    case Failure(exception) => println(s"Failure with onComplete: ${exception.getMessage}")
    //
    //  }



  Thread.sleep(3000)


}
