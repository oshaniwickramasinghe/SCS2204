val denom= scala.io.StdIn.readLine("enter the denuminator: ").toInt
val num= scala.io.StdIn.readLine("enter the numerator: ").toInt

val obj = new rational(denom,num)

class rational(x:Int,y:Int) {

    require(denom > 0, "Denominator>0")
    def numer = x
    def denom = y

    def neg = new rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
}

println("rational number = "+ denom+"/"+num)
println("negation of the rational number = "+obj.neg)