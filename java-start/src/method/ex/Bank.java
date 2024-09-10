package method.ex;

public class Bank {
    protected int balance;

    public Bank(){}
    public Bank(int balance){
        this.balance = balance;
    }

    protected void deposit(int amount){
        this.balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + this.balance);
    }

    protected void withdraw(int amount){
        if (this.balance >= amount){
            this.balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + this.balance + "원");
        }else{
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
    }

    protected void checkBalance(){
        System.out.println("현재 잔액: " + this.balance);
    }
}
