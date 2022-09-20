package test1.training;

public class Acount {
    private String number;
    private String accountno;
    private  double balance;
    private  String customername;
    private String customeremailaddress;
    private String customerphonenumber;

    public Acount( String customername, String customeremailaddress, String customerphonenumber) {
       this("125634",25.3641,customername,customeremailaddress,customerphonenumber);
    }

    public Acount()
    {
        this("32564",0.00,"default name","Default address","default phoneno");
        System.out.println("emty constructor called");
    }
    public Acount(String number,double balance,String customername,String customeremailaddress,String customerphonenumber)
    {
        System.out.println("account with construtor called");
        this.number=number;
        this.balance=balance;
        this.customername=customername;
        this.customeremailaddress=customeremailaddress;
        this.customerphonenumber=customerphonenumber;
    }
    public void deposit(double depositedamount)
    {
        this.balance +=depositedamount;
        System.out.println("deposit amount of " +depositedamount+ " made .New balance is =" + this.balance);
    }
    public void withdrw(double withdrawamount)
    {
        if(this.balance -withdrawamount < 0){
            System.out.println("only " + balance +" available. withdrawal is not processed ");

    }
        else {
            balance -= withdrawamount;
            System.out.println("withdrwal of "+withdrawamount+ " processed .remaining balance ="+ balance);
        }
    }

    public String getAccountno() {
        return accountno;
    }
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

     public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeremailaddress() {
        return customeremailaddress;
    }

    public void setCustomeremailaddress(String customeremailaddress) {
        this.customeremailaddress = customeremailaddress;
    }

    public String getCustomerphonenumber() {
        return customerphonenumber;
    }

    public void setCustomerphonenumber(String customerphonenumber) {
        this.customerphonenumber = customerphonenumber;
    }
}
