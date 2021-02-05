public class BankAccount {
    int balance;
    BankPerson owner; // Person class를 자료형으로.

    // 파라미터 : 입금할 액수를 받음, 리턴은 성공 여부를 받을 예정임.
    boolean deposit (int amount) {
        if (amount <0 || owner.cashAmount < amount) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount+"원");
            System.out.println(false);
            return false;
        }
        balance += amount;
        owner.cashAmount -= amount;

        System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount+"원");
        System.out.println(true);
        return true;
    }

    // 파라미터 : 출금할 액수를 받음, 리턴은 성공 여부를 받을 예정임.
    boolean withdraw (int amount) {
        if (amount <0 || balance < amount) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount+"원");
            System.out.println(false);
            return false;
        }
        balance -= amount;
        owner.cashAmount += amount;

        System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount+"원");
        System.out.println(true);
        return true;
    }

//    // 파라미터 : 받는 사람, 이체할 금액 , 리턴은 성공 여부를 받을 예정
//    boolean transfer(BankPerson to, int amount) {
//
//    }
}
