public class Thread1 extends Thread{
    private Bank bank;

    public Thread1(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run() {
        synchronized (bank){
            for (int i = 1; i < 200; i++) {
                bank.setAccount(bank.getAccount() + 2);
                System.out.println("inc: " + bank.getAccount());
            }
        }
    }
}
