//1.

//a
val nums:List[Int] = List(1,2,3,4,5)

//b
val numsMultiply3:List[Int] = nums.map(
  number => number * 3
)
//c
val firstseq: Seq[String] = Seq("Red", "Green", "Blue")

val firstseqdelete: Seq[String] = firstseq.filter(
  x => x != "Blue"
)

val firstseqdelete = firstseq.init

//d
val containOrange: Boolean = firstseq.contains("Orange")

//2.

val oddOrNot: List[Boolean] = nums.map(
  number => number % 2 != 0)

//3.

val davidsPets: Map[String, String] = Map(
  "Buddy" -> "Dog",
  "Susie" -> "Dog",
  "Nemo" -> "Fish",
  "Whiskers" -> "Cat"
)

val dogNames: Map[String, String] = davidsPets.filter(
  name => name._2 == "Dog"
)

//Extension
//1.

val numsSeq:Seq[Int] = Seq(1,2,3,4,5,6,7,8,9)

val seqFiltered: Seq[Int] = numsSeq.filter(
  n => n % 3 != 0 && n % 4 != 0
)

//2
val thirdsElement: Int = nums.tail.tail.head

//Research
//1.
// Sets are a collection of unique elements. they don't allow duplicates. Use when you need unique values. Sequences maintains insertion order and allows duplicates

//2.
List(3,4) == Seq(3,4)
//List is a subclass of seq and their contents are the same

//3.
List(3,4) == Set(3,4)

//Set is unordered so is not the same