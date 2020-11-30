public class AccountInfo{
  public static void main(String [] args){
    BankAccount s1= new BankAccount();
    BankAccount s2= new BankAccount();
    BankAccount s3= new BankAccount();
    s1.setName("John");
    s1.getName();
    s1.setAddress("Dhaka");
    s1.getAddress();
    s1.setAccountID("111111111");
    s1.getAccountID();
    s1.setBalance(9000);
    s1.getBalance();
    s1.addInterest();
    s2.setName("Mike");
    s2.getName();
    s2.setAddress("Rajshahi");
    s2.getAddress();
    s2.setAccountID("22222222");
    s2.getAccountID();
    s2.setBalance(10000);
    s2.getBalance();
    s3.setName("Carol");
    s3.getName();
    s3.setAddress("Chittagong");
    s3.getAddress();
    s3.setAccountID("3333333333");
    s3.getAccountID();
    s3.setBalance(12000);
    s3.getBalance();
    s3.addInterest();
    System.out.println(s1.name+" "+s1.address+" "+s1.accountID+" "+s1.balance);
    System.out.println(s2.name+" "+s2.address+" "+s2.accountID+" "+s2.balance);
    System.out.println(s3.name+" "+s3.address+" "+s3.accountID+" "+s3.balance);
  }
}