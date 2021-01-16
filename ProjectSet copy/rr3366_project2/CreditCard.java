/**
 * Setup of the CreditCard class.
 * 
 * @Rau 
 */




public class CreditCard {
    
    //Declare varaibles
    private String cardno;
    private boolean checker;
    private int errorCode;
    
    public  CreditCard(String n){
        //Initialize variables
        cardno = n;
        checker = false;
        errorCode = 0;
    } 
    
    public boolean test1() {
        if (Integer.parseInt(cardno.valueOf(cardno.charAt(0))) == 4) { //Test1
            return true;
        }
        else {
            errorCode = 1;
            return false;
        }
    }
    
    public boolean test2() {
         if (Integer.parseInt(cardno.valueOf(cardno.charAt(3)))-
            Integer.parseInt(cardno.valueOf(cardno.charAt(5))) == 1) { //Test2
            return true;
        }
        else {
            errorCode = 2;
            return false;
        }
    }
    
    public boolean test3() {
         if (Integer.parseInt(cardno.valueOf(cardno.charAt(0))) * 
                Integer.parseInt(cardno.valueOf(cardno.charAt(5))) * 
                Integer.parseInt(cardno.valueOf(cardno.charAt(10))) == 24){ //Test3
            return true;
         }
        else {
            errorCode = 3;
            return false;
        }
    }
    
    public boolean test4() {
        int k = 0;
        for (int i = 0; i < cardno.length(); i++){  //Sum of all numbers
            if ( i==0|i==1|i==2|i==3|i==5|i==6|i==7|i==8|i==10|i==11|i==12|i==13){
                k+=Integer.parseInt(cardno.valueOf(cardno.charAt(i)));
                        }
                    }
        if (k%4 == 0) {  //Test 4
            return true;
        }
        else {
            errorCode = 4;
            return false;
        }
          
    }
    
    public boolean test5() {
        int m = 0;//Sum of last 4 numbers
        int l = 0;//Sum of first 4 numbers
       for (int i = 0; i < 4; i++) {
           l+=Integer.parseInt(cardno.valueOf(cardno.charAt(i)));
           }
       for (int i = 10; i < 14; i++) {
           m+=Integer.parseInt(cardno.valueOf(cardno.charAt(i))); //System.out.println("m is " + m);
       }
       if ( m-l == 1 ) { //Test 5
           return true;
       }
        else {
            errorCode = 5;
            return false;
        }
    }
        
    public boolean test6() {
        if (Integer.parseInt(cardno.valueOf(cardno.substring(0,2)))+ 
        Integer.parseInt(cardno.valueOf(cardno.substring(7,9))) == 100){ //Test 6
            return true;
        }
        else {
            errorCode = 6;
            return false;
        }
    }
    
    public void check() { //mutator method to check number
        if (test1() == true)
            if (test2() == true)
                if (test3() == true)
                    if (test4() == true)
                        if (test5() == true)
                            if (test6() == true)
                                checker = true;
                           
    }
    
    public boolean isValid() {
        return checker;
    }
    
    public int getErrorCode() {
        return errorCode;
    }
}

    
