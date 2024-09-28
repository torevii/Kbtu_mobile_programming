

fun main() {

    val person = Person("Torebek", 23, "azbergen@kbtu.kz")
    val employee = Employee("Tom", 24, "red@su.kz", 1500)
    person.displayInfo()
    employee.displayInfo()

    val account = BankAccount(1500)
    account.printBalance()
    account.deposit(500)
    account.withdraw(100)
    account.printBalance()
}