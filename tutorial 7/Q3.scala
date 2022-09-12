class Account(NIC:String, val Id: Int, var balance: Double = 0.0){

    def withdrow(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(account:Int, amount:Double) : Unit = {

        val transferAcc = find(account, allaccounts)
        if (balance < 0.0) println("Insufficient balance")
        else 
        {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

    override def toString = "[NIC : "+NIC+"  Acc ID : "+Id +"  Balance : "+ balance+"]"
}

var allaccounts:List[Account] = List()

def createaccount(NIC:String, Id: Int):Unit = {
    val acc = new Account(NIC, Id)
    allaccounts = allaccounts ::: acc :: Nil   
}

val find = (a:Int, b:List[Account]) => b.filter(account => account.Id.equals(a))

createaccount("1",1)
createaccount("2",2)
println(allaccounts)

//deposit default
find(1, allaccounts)(0).deposit(1000)
println(find(1, allaccounts)(0))

//transfer default
find(1, allaccounts)(0).transfer(2, 500.0)
println(find(2, allaccounts)(0))

val choice= scala.io.StdIn.readLine("enter your choice : 1.withdrow  2.deposit  3.transfer ").toInt

def call(x:Int)=x match{
    case 1=>{val acc= scala.io.StdIn.readLine("enter account : ").toInt; 
             val amount= scala.io.StdIn.readLine("enter amount : ").toInt; 
             find(acc, allaccounts)(0).withdrow(amount); 
             println(find(acc, allaccounts)(0))}

    case 2=>{val acc= scala.io.StdIn.readLine("enter account : ").toInt; 
             val amount= scala.io.StdIn.readLine("enter amount : ").toInt; 
             find(acc, allaccounts)(0).deposit(amount); 
             println(find(acc, allaccounts)(0))}

    case 3=>{val from= scala.io.StdIn.readLine("from account : ").toInt; 
             val to= scala.io.StdIn.readLine("to account : ").toInt; 
             val amount= scala.io.StdIn.readLine("enter amount : ").toInt;
             find(from, allaccounts)(0).transfer(to, amount)
             println(find(to, allaccounts)(0))}
    
}

call(choice)

