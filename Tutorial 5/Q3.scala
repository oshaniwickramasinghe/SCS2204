def add(n:Int):Int= n match{
    case x if x==1 => 1
    case x if x>0 => x+add(x-1)
    case x => x+(x-1)
}

println("Enter value : ")
val  number:Int=scala.io.StdIn.readInt()

println(add(number))
