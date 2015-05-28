package ch7

object RefactoringImperativeStyleCode {
  def main(args: Array[String]): Unit = {
    def printMultiTable() {
      var i = 1
      // only i in scope here
      while (i <= 10) {
        var j = 1
        // both i and j in scope here
        while (j <= 10) {
          val prod = (i * j).toString
          // i, j, and prod in scope here
          var k = prod.length
          // i, j, prod, and k in scope here
          while (k < 4) {
            print(" ")
            k += 1
          }
          print(prod)
          j += 1
        }
        // i and j still in scope; prod and k out of scope
        println()
        i += 1
      }
      // i still in scope; j, prod, and k out of scope
    }

    printMultiTable()

    // Returns a row as a sequence

    def makeRowSeq(row: Int) =
      for (col <- 1 to 10) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        padding + prod
      }

    def makeRow(row: Int) = makeRowSeq(row).mkString

    def multiTable() = {
      val tableSeq = for (row <- 1 to 10) yield (makeRow(row))
      tableSeq.mkString("\n")
    }

    println(multiTable())

    for (i <- 1 to 10) {
      for (j <- 1 to 10) {
        print(String.format("% 4d", Integer.valueOf(i*j)))
      }
      println()
    }

  }
}