object Sample {
  def main(args : Array[String]): Unit ={

    val list1 = List(1,2,3,4,5)

    val list2 = list1 :+ 6
    println("After adding a number: " + list2)

    val list3 = list2.filter(_ != 2)
    println("After removing a number: " + list3)

    val evenList = list3.filter(_%2 == 0)
    println("Even number from list: "+evenList)

  }
}