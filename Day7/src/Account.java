abstract class Account {
    protected int accountNumber; // 계좌 번호
    protected double balance;

    public Account(int accountNumber ) {
        this.accountNumber = 1000;
        this.balance = 0.0;
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {        // 입금
        if (amount > 0) {
            this.balance += amount;  // 입금 금액을 잔액에 더함
            System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("입금 금액은 0보다 커야 합니다.");
        }
    }

    public abstract void withdraw(double amount);   // 출금 (출금 방식은 계좌 타입마다 다르므로 추상 메소드로 선언)

    public void checkBalance() {
        System.out.println("현재 잔액: " +  balance  + "원");
    }

    public String toString() {
        return "Account 번호: " + accountNumber;
    }
}
