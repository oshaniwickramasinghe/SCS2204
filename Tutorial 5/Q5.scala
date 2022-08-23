def Even(n:Int):Boolean= n match{
    case 0 => true
    case _ => Odd(n-1)
}
def Odd(n:Int):Boolean = !(Even(n))

def AddEven(n:Int):Int =n match{
    case x if x==0 => 0
    case x if Even(x) => x+AddEven(x-1)
    case x => AddEven(x-1)
}

println("Enter value : ")
val  number:Int=scala.io.StdIn.readInt()

println(AddEven(number))

