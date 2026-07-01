class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolder = "Siva";
        b.accountNumber = 12345;
        b.balance = 5000.50;
        b.display();
    }
}