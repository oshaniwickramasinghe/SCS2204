def Even(n:Int):Boolean= n match{
    case 0 => true
    case _ => Odd(n-1)
}

def Odd(n:Int):Boolean = !(Even(n))

println("Enter value : ")
val  number:Int=scala.io.StdIn.readInt()

println(Even(number))
