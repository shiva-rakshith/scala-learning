import scala.collection.mutable._

object Sample {
  def main(args : Array[String]): Unit ={

    val list : ListBuffer[Int] = ListBuffer(1,2,3,4,5,6,7,8,9,10)

    list += 11
    println("After adding new number 11: "+list)

    list -= 1
    println("After removing number 1: "+list)

    val evenList = list.filter(_%2 == 0)
    println("Even number from list: "+evenList)

    println("Displaying modified list: "+ list.map{x => x*5})

    val numbers = List(1,2,3,4)
    val chars = List('a', 'b', 'c', 'd')
    val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))
    println(combinations)

  }
}