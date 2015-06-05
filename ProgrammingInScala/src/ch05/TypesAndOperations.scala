package ch05

/**
 * @author Andrei
 */
object TypesAndOperations {

  def main(args: Array[String]) {
    //hex
    val hex = 0x5
    val hex2 = 0x00FF
    val magic = 0xcafebabe

    //dec
    val dec1 = 31
    val dec2 = 255
    val dec3 = 20

    //Long
    val prog = 0XCAFEBABEL
    val tower = 35L
    val of = 31l

    val little: Short = 367
    val littler: Byte = 38

    //Float
    val big = 1.234F
    val littleBigger = 3e5f

    //Double
    val anotherDouble = 3e5
    val yetAnother = 3e5D

    //Char
    val c = '\101'

    val backslash = '\\'
    
    val hello = "hello"
    
    val escapes = "\\\"\'"
    println(escapes)
    println("""Welcome to Ultamix 3000.
              Type "HELP" for help.""")
              
    println("""|Welcome to Ultamix 3000.
              |Type "HELP" for help.""".stripMargin)
              
              
           
    //Symbol
    def updateRecordByName(r:Symbol,value:Any){

    }
    
    updateRecordByName('favouriteAlbum,"OK Computer")
    
    val s = 'aSymbol
    println(s.name)
    
    //Boolean
    val bool = true
    val fool = false
    
    // infix operators +,indexOf
    val sum = 1+2 //(1).+(2)
    val longSum = 1 + 2L
    
    print("Hello, world!" indexOf 'o')
    
    //prefix operators +,-,!,~
    -2;!bool;~0xFF
    (2).unary_-
    
    //postfix operators
    7 toLong;
    (7).toLong
    
    
    
    
    
  }
}

 