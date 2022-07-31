//question1
println("Question 1")
def interest(deposit:Double):Double=deposit match{
    case x if x<0 => 0
    case x if x<20000 => x*0.02
    case x if x<200000 => x*0.04
    case x if x<2000000 => x*0.035
    case x if x>2000000 => x*0.065
}

println(interest(0))
println(interest(10000))
println(interest(100000))
println(interest(1000000))
println(interest(10000000))


//question2
println("Question 2")
print("Enter an integer : ")
var x = scala.io.StdIn.readInt()

def state(x:Int):Any=x match{
    case x if x<0=>println("Negative")
    case x if x==0 =>println("Zero")
    case x if x%2==0 =>println("Even number is given")
    case x if x%2==1 =>println("Odd number is given")
}

state(x)


//question3
println("Question 3")
def toUpper(s:String):String={
    s.toUpperCase()
}

 def toLower(s:String):String={
    s.toLowerCase()
}

 def formatNames(name:String)(func:String =>String):String={
    func(name)
}

 println(formatNames("Benny")(toUpper(_)))
 println(formatNames("Ni")(toUpper(_))+formatNames("roshan")(toLower(_)))
 println(formatNames("Saman")(toLower(_)))
 println(formatNames("K")(toUpper(_))+formatNames("umar")(toLower(_))+formatNames("a")(toUpper(_)))