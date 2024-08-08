// BankAccount Hierarchy

open class BankAccount(
    private val accountNumber: Int,
    var balance: Double = 0.0
) {
    fun deposit(amount: Double) {
        if (amount > 0) {
            println("Enter the account number $accountNumber")
            balance += amount
            println("Deposited $amount, new balance: $balance")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    open fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew $amount, new balance: $balance")
        } else if (amount > balance) {
            println("Insufficient balance.")
        } else {
            println("Withdrawal amount must be positive.")
        }
    }
}

class SavingsAccount(
    accountNumber: Int,
    balance: Double,
    private val interestRate: Double
) : BankAccount(accountNumber, balance) {

    fun applyInterest() {
        val interest = balance * interestRate
        deposit(interest)
        println("Applied interest: $interest, new balance: $balance")
    }
}

class CheckingAccount(
    accountNumber: Int,
    balance: Double,
    private val transactionFee: Double
) : BankAccount(accountNumber, balance) {

    override fun withdraw(amount: Double) {
        val totalAmount = amount + transactionFee
        if (totalAmount > balance) {
            println("Insufficient balance after applying transaction fee.")
        } else {
            super.withdraw(totalAmount)
            println("Transaction fee of $transactionFee applied.")
        }
    }
}

fun main() {
    val savingsAccount = SavingsAccount(12345, 1000.0, 0.05)
    savingsAccount.deposit(200.0)
    savingsAccount.applyInterest()
    savingsAccount.withdraw(100.0)

    val checkingAccount = CheckingAccount(67890, 500.0, 2.0)
    checkingAccount.deposit(150.0)
    checkingAccount.withdraw(50.0)
    checkingAccount.withdraw(600.0) // Should trigger insufficient balance
}
