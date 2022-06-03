//정기 예금 계좌 클래스
//일반계좌 클래스를 부모클래스로 둔다. (상속)
public class SavingAccount extends BankAccount{

    public void deposit(int amount) {
    }

    //출금기능의 메서드
    public void withdraw(int amount) {
        balance -= amount;
    }

}
