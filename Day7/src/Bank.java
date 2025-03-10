import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> accounts;
    private int accountNumber;
    private Scanner sc;

    public Bank() {
        accounts = new ArrayList<>();       // 모든 계좌 정보 저장
        accountNumber = 1000;
        sc = new Scanner(System.in);

    }

    public void startBankingSystem() {
        while (true) {
            System.out.println("\n=== 은행 시스템 ===");
            System.out.println("1. 계좌 개설");
            System.out.println("2. 계좌 검색");
            System.out.println("3. 종료");
            System.out.print("선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addAccount();
                    break;
                case 2:
                    findAccount();
                    break;
                case 3:
                    System.out.println("은행 시스템을 종료합니다!");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요!");
            }
        }
    }

    public void addAccount() {
        System.out.println("1. 예금 계좌 | 2. 당좌 계좌 ");
        System.out.print("계좌 유형 선택: ");
        String choice = sc.nextLine();

        Account newAccounts = null;

        double balance = 0.0;
        double withdrawalLimit = 0.0;  // 예금 계좌에만 해당하는 한도 변수
        double overdraftLimit = 0.0;   // 당좌 계좌에만 해당하는 한도 변수

        switch (choice) {
            case "1":
                System.out.print("초기 입금액을 입력하세요: ");
                balance = sc.nextDouble();
                System.out.print("출금 한도를 입력하세요: ");
                withdrawalLimit = sc.nextDouble();
                sc.nextLine();  // nextDouble 후 버퍼 비우기
                newAccounts = new SavingAccount(accountNumber++, balance, withdrawalLimit);
                break;
            case "2":
                System.out.print("초기 입금액을 입력하세요: ");
                balance = sc.nextDouble();
                System.out.print("오버드래프트 한도를 입력하세요: ");
                overdraftLimit = sc.nextDouble();
                sc.nextLine();  // nextDouble 후 버퍼 비우기
                newAccounts = new CheckingAccount(accountNumber++, balance, overdraftLimit);
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요!");
                return;
        }
        accounts.add(newAccounts);
        System.out.println("새 계좌가 계설되었습니다: " + newAccounts);
    }

    public void findAccount() {
        System.out.print("계좌 번호를 입력하시오 ");
        int searchNumber = sc.nextInt();
        sc.nextLine();

        for (Account account : accounts) {
            if (account.getAccountNumber() == searchNumber){
                System.out.println("계좌를 찾았습니다: " + account);
                return;
            }
        }
        System.out.println("계좌를 찾을 수 없습니다.");
    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.startBankingSystem();
    }
}
