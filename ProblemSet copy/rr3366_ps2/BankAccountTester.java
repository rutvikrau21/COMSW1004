public class BankAccountTester{
    
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount("Rutvik",900703);
        
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.withdraw(400);
        
        System.out.println("Expected balance is $100.0");
        System.out.println("Current balance is $" + 
        myAccount.getBalance());
        
        
      
    }
}