//define string with allowed characters
val alphabet = "abcdefghijklmnopqrstuvwxyz"

//input details
val key = (scala.io.StdIn.readLine("Enter key: ")).toInt
val string = scala.io.StdIn.readLine("Text: ")
var choice = scala.io.StdIn.readLine("Select option   1.Encrypt   2.Decrypt  : ").toInt 

//function to encrypt
val E=(c:Char,key:Int,s:String)=>
s((s.indexOf(c.toLower)+key)%s.size)

//function to decrypt
val D=(c:Char,key:Int,s:String)=>
s((s.indexOf(c.toLower)+key)%s.size)

//function to call the chosen option
val cipher=(algo:(Char,Int,String)=>
Char,string:String,key:Int,s:String)=>
string.map(algo(_,key,s))

//encrypted and decrypted strings of given text
val ct=cipher(E,string,key,alphabet)
val pt=cipher(D,string,(26-key),alphabet)

//function to print required result
def call(x:Int)=x match{
    case 1=>println(ct)
    case 2=>println(pt)
}

call(choice)