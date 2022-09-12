var allaccounts:List[Account] = List()

def createaccount(NIC:String, Id: Int):Unit = {
    val acc = new Account(NIC, Id)
    allaccounts = allaccounts ::: acc :: Nil
    
}

//define methods
val find = (x:Int,y:List[Account]) => y.filter(account => account.Id.equals(x))
val overdraft = (y:List[Account]) => y.filter(account => account.balance < 0.0)
val total = (y:List[Account]) => y.foldLeft(0.0)((a,b) => a + b.balance)
val interest = (y:List[Account]) => y.map(account => if(account.balance > 0) account.balance+account.balance*0.05 else account.balance+account.balance*0.1)

//create accounts
createaccount("1",1)
createaccount("2",2)
println(allaccounts)

//deposit 
find(1, allaccounts)(0).deposit(1000)
println("money deposited "+find(1, allaccounts)(0))

//transfer 
find(1, allaccounts)(0).transfer(2, 100.0)
println("money tranfered "+find(2, allaccounts)(0))

//accounts with negative balances
println("overdraft accounts "+overdraft(allaccounts))

//sum of all account balances
println("total of all accounts "+total(allaccounts))

//final balances of all accounts after apply the interest
println("account balance with interest "+interest(allaccounts))


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
        else {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

    override def toString = "[NIC : "+NIC+"  Acc ID : "+Id +"  Balance : "+ balance+"]"
}

//input

val choice= scala.io.StdIn.readLine("enter your choice : 1.overdrafted accounts  2.total deposits  3.total balance  ").toInt

def call(x:Int)=x match{
    case 1=>println(overdraft(allaccounts))
    case 2=>println(total(allaccounts))
    case 3=>println(interest(allaccounts))    
}

call(choice)

