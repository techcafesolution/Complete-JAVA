package Chellange10;

public class TestBankAccount {
    public static void main(String[] args) {
        SampleBankAccount sa=new SampleBankAccount("Sanjeeb","SBA546",1000);
        System.out.println(sa.getCustomerName());
        System.out.println(sa.getAccountNumber());
        System.out.println(sa.getAccountBalance());
        sa.showBalance();
        sa.depositMoney(2000);
        sa.showBalance();
        sa.withdrawalMoney(1000);
        sa.showBalance();
        sa.depositMoney(-4538);
        sa.withdrawalMoney(5000);
    }
}
