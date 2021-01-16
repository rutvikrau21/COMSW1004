public class CarTester{
    public static void main(String[] args){
    //Construct object
    Car myHybrid = new Car(50); // 50 miles per gallon 
    myHybrid.addGas(20); // Add 20 gallons to tank
    myHybrid.drive(100); // Drive 100 miles
    double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank
    System.out.println("Gas left in fuel tank is " + gasLeft);
    }
  
}