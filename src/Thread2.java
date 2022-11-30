public class Thread2 extends Thread{
    private Bank bank;

    public Thread2(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank){
            for (int i = 1; i < 200; i++) {
                bank.setAccount(bank.getAccount() - 1);
                System.out.println("dec: " + bank.getAccount());
            }
        }
    }
}
