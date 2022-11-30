public class Bank {
    private int account;

    public Bank(){}

    public Bank(int account) {
        this.account = account;
    }

    public synchronized void inc(){
        for (int i = 1; i <= 200; i++) {
            account+=2;
            System.out.println("inc: " + account);
        }
    }

    public synchronized void dec(){
        for (int i = 1; i <= 200; i++) {
            account--;
            System.out.println("dec: " + account);
        }
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}
