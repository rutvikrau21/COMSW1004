public class Car{
    private int fuel;
    // fe is fuel efficiency
    private int fe;
    
    public Car(int x){
        fuel = 0;
        fe = x;
    }
    
    public void addGas(int x){
        // Adds gasoline to tank
        fuel+=x;
    }
    
    public void drive(int x){
        // Amount of fuel needed to drive x miles
        int y = (x/fe);
        // Deduct fuel to drive
        fuel-=y;
    }
    
    public int getGasInTank(){
        // Amt gasoline in tank
        return fuel;
    }
}