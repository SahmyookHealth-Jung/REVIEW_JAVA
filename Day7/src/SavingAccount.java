// amount - 꺼낼 금액
// balance - 잔고

class SavingAccount extends Account {
    private double withdrawalLimit;     // 한도

    public SavingAccount(int accountNumber, double balance ,double withdrawalLimit) {
        super(accountNumber, balance);// 부모 클래스의 생성자 호출!!
        this.withdrawalLimit = withdrawalLimit;
    }

    // 출금 기능 구현
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("출금 실패: 하루 출금 한도를 초과했습니다.");
        } else if (amount > balance) {
            System.out.println("출금 실패: 잔액이 부족합니다.");
        } else {
            balance = balance - amount;
            System.out.println(amount +"원 출금 완료. 현재 잔액: " + balance + "원 입니다.");
        }
    }
}
