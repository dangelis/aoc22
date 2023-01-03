package d1

import scala.collection.mutable.ListBuffer
import scala.io.Source

object d1pt2 extends App {

//  val lines = Source.fromFile("/Users/dangelis/Projects/dangelis/aoc22/src/main/scala/d1/testInput.txt").getLines.toList
  val lines = Source.fromFile("/Users/dangelis/Projects/dangelis/aoc22/src/main/scala/d1/input.txt").getLines.toList

  var masterList = new ListBuffer[List[Int]]()
  var elfList = new ListBuffer[Int]()

  // Is there a good way to split the list into lists of each elves calories in a scala way?
  lines.foreach(line => {
    println(line)
    line match {
      case "" => {
        masterList += elfList.toList
        elfList.clear()
      }
      case _ => {
        elfList += line.toInt
      }
    }
  })

  masterList += elfList.toList
  masterList.foreach(println)

  val max = println(masterList.map(_.sum).sortWith(_ > _).take(3).sum)

  //197291
}
