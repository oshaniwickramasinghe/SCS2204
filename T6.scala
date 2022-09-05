val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val key = (scala.io.StdIn.readLine("Enter key: ").toInt + alphabet.size) % alphabet.size

val s = scala.io.StdIn.readLine("Secret Message: ")

var choice = scala.io.StdIn.readLine("select option/n 1.Encrypt/n2.Decrypt ").toInt

val E=(c:Char,key:Int,a:String)=>
a((a.indexOf(c.toUpper)+key)%a.size)

val D=(c:Char,key:Int,a:String)=>
a((a.indexOf(c.toUpper)-key)%a.size)

val cipher=(algo:(Char,Int,String)=>
Char,s:String,key:Int,a:String)=>
s.map(algo(_,key,a))

val ct=cipher(E,s,key,alphabet)
val pt=cipher(D,s,key,alphabet)

def call(x:Int)=x match{
    case 1=>println(ct)
    case 2=>println(pt)
}

call(choice)