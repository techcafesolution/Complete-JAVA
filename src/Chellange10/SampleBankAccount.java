package Chellange10;

public class SampleBankAccount {
    private String customerName;
    private String accountNumber;
    private double accountBalance;

    SampleBankAccount(String customerName, String accountNumber, double accountBalance){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void showBalance(){
        System.out.println("Your Account Balance is:: "+accountBalance);
    }

    public void depositMoney(double addBalance){
        if(addBalance>0){
            accountBalance+=addBalance;
            System.out.println(addBalance+" rupees has been successfully deposit to your account....");
        }else{
            System.out.println("Invalid Deposit!!!");
        }
    }

    public void withdrawalMoney(double withdrawMoney){
        if(withdrawMoney<=0){
            System.out.println("Invalid Withdrawal!!!");
        }else if(withdrawMoney>accountBalance){
            System.out.println("In sufficient Amount!!!");
        }else{
            accountBalance-=withdrawMoney;
            System.out.println(withdrawMoney+" rupees has been successfully deducted from your account...");
        }
    }
}
