public class BankDriver {
    public static void main(String[] args) {
        // 사람을 선언하자!
        BankPerson p1 = new BankPerson();
        p1.name = "조용식";
        p1.age = 24;
        p1.cashAmount = 30000;

        // 은행 계좌를 생성하자!
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;

        p1.account = a1;
        a1.owner = p1;

//        System.out.println(a1.owner.name);
//        System.out.println(p1.account.balance);

        BankPerson p2 = new BankPerson();
        p2.name = "조용식";
        p2.age = 24;
        p2.cashAmount = 100000;

        BankAccount a2 = new BankAccount();
        a2.balance = 500000;

        p2.account = a2;
        a2.owner = p2;

        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);
    }
}
