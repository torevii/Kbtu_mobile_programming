open class Person(val name: String, val age: Int, val email: String) {
    open fun displayInfo() {
        println("name: $name")
        println("age: $age")
        println("mail: $email")
    }
}
class Employee(name: String, age: Int, email: String, val salary: Int) : Person(name, age, email) {
    override fun displayInfo() {
        super.displayInfo()
        println("salary: $salary")
    }
}
class BankAccount(private var balance: Int) {

    fun deposit(p_amount: Int) {
        if (p_amount > 0) {
            balance += p_amount
            println("deposit = $p_amount")
        } else {
            println("err")
        }
    }
    fun withdraw(p_amount: Int) {
        if (p_amount > 0 && p_amount <= balance) {
            balance -= p_amount
            println("withdraw = $p_amount")
        } else {
            println("err")
        }
    }
    fun printBalance() {
        println("balance = $balance")
    }
}

