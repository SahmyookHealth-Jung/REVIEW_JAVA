class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber);
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (balance - amount < overdraftLimit) {
            System.out.println("출금 실패: 마이너스 한도를 초과했습니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원 출금 완료. 현재 잔액: " + balance + "원 입니다.");
        }
    }
}
