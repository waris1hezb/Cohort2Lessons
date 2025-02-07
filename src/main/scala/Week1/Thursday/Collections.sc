
val firstlist: List[Int] = List(1, 2, 3, 4)


val firstseq: Seq[Int]= Seq(1,2,3,4,5 ,6 ,7)

val firstmap: Map[String,Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  "four" -> 4,
  "five" -> 5
)
// Map has key value pairs ( key -> value)
// Take in 2 parameters, must declare data types


/**
 * Accessing data
 */

val getSeqData: Int = firstseq(1)
val getSeqHead: Int = firstseq.head
val getSeqTail: Seq[Int] = firstseq.tail
val getSeqTail: Int = firstseq.last

//MAP

val getMapData= firstmap("one")

/**
 * Manipulating data - using map
 */

val tripledList: List[Int] = firstlist.map{
  number => number * 3
}

val tripledSeq: Seq[Int] = firstseq.map{
  _ * 3
}

val tripledMap: Map[String, Int] = firstmap.map{
  case (key, value) => (key, value * 3)
}

val changeMap: Map[String, Int] = firstmap.map{
  case (key, value) => (key.capitalize, value * 3)
}

/**
 * Manipulating data - filtering
 */

val filterseq: Seq[Int] = firstseq.filter(
  number => number % 2 == 0
)

val filterlist: Seq[Int] = firstlist.filter(
  number => number >= 2
)
filterlist == filterseq

val filtermap: Map[String, Int] = firstmap.filter(
  number => number._2 >= 2
)
// _1 is key _2 is value. when filtering

//Exists list and seq are the same

val existsSeq: Boolean = firstseq.exists(
  number => number >=2
)

val existsmap: Boolean = firstmap.exists(
  number => number._2 >=2
)

//Contains

val containsSeq: Boolean = firstseq.contains(2) || firstseq.contains(3)

val containsMap: Boolean = firstmap.contains("two") //checks only the key


//Task 1

val seqNames: Seq[String] = Seq("Waris", "Hezb", "Fang", "Roy", "r")

val mapColour: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green"
)
val filtermap1: Map[Int, String] = mapColour.filter(
  colour => colour._2 == "blue"
)
val addOne: List[Int] = firstlist.map{
  number => number + 1
}

val removeEven: Seq[Int] = firstseq.filter(
  number => number % 2 != 0)

val seqWithR: Boolean = seqNames.contains("r")

// Sets are a collection of unique elements. they dont allow duplicates. Use when you need unique values

//flatmap removes nested lists that could be created when using map. flatmap flattens the nested structure and returns a single list

val words: List[String] = List("Waris", "Hezb")
val chars: List[Char] = words.flatMap(word => word.toUpperCase)

println(chars)

//Prepend (start) append(end)

val x = 0 :: firstlist

val y =firstlist :+ 5

val y = 2+: firstlist :+ 5

val appendMap = firstmap + ("six" -> 6)

//To order use ListMap

/**
 * Deleting
 */

val deleteseq = filterseq.init

//Removing from Map

val removeValueInmAP = firstmap - ("three", "one")