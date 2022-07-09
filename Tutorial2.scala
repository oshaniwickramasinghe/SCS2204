//Question 1 ,2/////////////////
println("Question 1");
var k,i,j:Int=2;
var m,n:Int=5;
var f:Float=12.0f;
var g:Float=4.0f;
var C:Char ='X';

// a) k + 12 * m
println(k+12*m);

// b) m / j
println(m/j);

// c) n % j
println(n%j);

// d)  m / j * j
println(m/j*j);

// e) f + 10*5 +g
println(f+10*5+g);

// f) ++i * n
i=i+1;                        //because scala does not have pre increment operator
println(i*n);


//Question 3//////////////
println("Question 3");
var a:Int=2;
var b:Int=3;
var c:Int=4;
var d:Int=5;
var K:Float=4.3f;

// a) println( --b * a + c *d --)
b=b-1;                          //because scala does not have pre decrement operator
println( b * a + c *d );
d=d-1;                          //because scala does not have post decrement operator

// b) println(a++);
println(a);
a=a+1;                          //because scala does not have post increment operator

//c) println (-2 * ( g - k ) +c);
println (-2 *( g-K ) +c);

// d) println (c=c++);
println (c);
c=c+1;                          //because scala does not have post decrement operator

// e) println (c=++c*a++);
c=c+1;                          //because scala does not have pre increment operator
println (c*a);
c=c*a;                          //because c=++c*a++
println (c);
a=a+1;                          //because scala does not have post increment operator

//Question 4///////////////////
println("Question 4");
def pay(x:Int):Int=x*250;
def OT(y:Int):Int=y*85;
def total(x:Int,y:Int):Int=pay(x)+OT(y);
def tax(x:Int,y:Int):Float=total(x,y)*0.12f;
def salary(x:Int,y:Int):Float=total(x,y)-tax(x,y);

println("take home salary of an employee = Rs "+salary(40,30)+ "\n\n");

//assume price is fluctuated by a quantity of Rs.5.00
for(price<-0 to 40 by 5)
{
  def attendence(price:Int):Int=120-((price-15)/5*20);
  def cost(price:Int):Int=500+attendence(price)*3;
  def income(price:Int):Int=attendence(price)*price;
  def profit(price:Int):Int=income(price)-cost(price);

  println("profit from the movie theater  = Rs " +profit(price) + " if the ticket price is Rs "+price);
}
