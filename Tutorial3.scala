//Question 1
def AreaOfaDisk(r:Double):Double=r*r*math.Pi;

println("Question 1 \n Enter radius of the disk : ")
val  r:Double=scala.io.StdIn.readDouble()

println(AreaOfaDisk(r))

    
//Question 2
def convert(C:Double):Double=C*1.8+32;

println("\nQuestion 2 \n Enter temperature in Celcius : ")
val  C:Double=scala.io.StdIn.readDouble()

println("Temperature is "+convert(C)+" in fahrenheit")


//Question 3
def VolumeOfaSphere(r:Double):Double=4/3*math.Pi*r*r*r;

println("\nQuestion 3 \n Enter radius of the sphere : ")
val   x:Double=scala.io.StdIn.readDouble()

println(VolumeOfaSphere(x))


//Question 4
def PaymentForBooks(amount:Int):Double=24.95*amount;
def Discount(amount:Int):Double=PaymentForBooks(amount)*.4
def ShippingCost(amount:Int):Double=3*50+(amount-50)*.75
def TotalCost(amount:Int):Double=PaymentForBooks(amount)-Discount(amount)+ShippingCost(amount)

println("\nQuestion 4 \n Enter number of book copies : ")
val   amount:Int=scala.io.StdIn.readInt()

println(TotalCost(amount))

//Question 5
def EasyPace(l:Double):Double=l/8
def Tempo(k:Double):Double=k/7

println("\nQuestion 5")

println("Total running time = "+(EasyPace(2)+Tempo(3)+EasyPace(2)))
//println("Total running time is "+EasyPace(2)+Tempo(3)+EasyPace(2) + "minuites")