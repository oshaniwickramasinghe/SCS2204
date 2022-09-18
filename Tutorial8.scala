object Point extends App{

    var p = Point(3,4)
    var q = Point(5,6)

    //add
    println(p.add(q))

    //move
    p.move(x=1,y=2)
    println(p)

    //distance
    var r= p.distance(q)
    println(r)

    //invert 
    q.invert()
    println(q)

}


case class Point(var x: Int,var y:Int){

    def add(p:Point) = new Point(this.x + p.x, this.y + p.y)

    def move(x:Int,y:Int):Unit = {

        this.x = this.x + x
        this.y = this.y + y

    }

    def distance(a:Point):Double = {

        var dx:Int = this.x - a.x
        var dy:Int = this.y - a.y
        var dist: Int = dx*dx + dy*dy
        scala.math.sqrt(dist)

    }

    def invert():Unit = {

        var temp = this.x
        this.x = this.y
        this.y = temp

    }

}

