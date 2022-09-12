    val x = new rational(3,4)
    val y = new rational(5,8)
    val z = new rational(2,7)

    val a = x-y-z

    println(a)

class rational(x:Int,y:Int) {

    require(denom > 0, "Denominator>0")
    def numer = x
    def denom = y

    def neg = new rational(-this.numer, this.denom)

    def sub(r:rational) = new rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def -(r:rational) = this.sub(r.neg)

    override def toString(): String = numer + "/" + denom
}

