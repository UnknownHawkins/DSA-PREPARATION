///////////////////ENCASEPULATION///////////////////



// Create a BankAccount class
// Account balance should be private
// Allow only positive account balance
// Display account balance of all users

class BankAccount {
    private int balance;    //Step1 make Private Variables.
    public BankAccount(int initialBalance) {   //Step2 provide Public Constructor method
        if (initialBalance > 0) {   //Condition for positive balance.
            this.balance = initialBalance;   // assigning the value.
        } else {
            System.out.println("Invalid balance. Balance should be positive.");
            this.balance = 0;  //default Value Assigning if the intial value is non-positive.
        }
    }
    public void setBalance(int balance) {   //Step 3 provide Public Setter Method
        if (balance > 0) {  // Condition for positive balance.
            this.balance = balance;  // Assigning the Value.
        } else {
            System.out.println("Invalid balance. Balance Should be positive."); // Displaying error if condition is not met.
        }
    }
    public int getBalance() {   //Step 4 provide Public Getter Method.
        return balance;      // returning the value
    }
}
public class QUE_1_SOL {
    public static void main(String[] args) {
        BankAccount U1 = new BankAccount(10000);   // Step 5 Creating Objects and calling methods.
        BankAccount U2 = new BankAccount(25000);
        BankAccount U3 = new BankAccount(-500); // rejected
        System.out.println(U1.getBalance());   // Calling the Getter method.
        System.out.println(U2.getBalance());   // Calling the Getter method.
        System.out.println(U3.getBalance());   // Calling the Getter method.
    }
}
