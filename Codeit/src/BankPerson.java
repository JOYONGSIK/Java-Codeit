public class BankPerson {
    String name;
    private int age;
    int cashAmount;
    BankAccount account;

    public void setAge (int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }
}
