
package L_06_ObjectAndClasses.BigFactorial;

import java.math.BigInteger;

public class Factarial {
    private int number;

    public Factarial(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
    public int setNumber(int number){
        this.number = number;
        return number;
    }
    public BigInteger result(){
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= number; i++) {
            BigInteger temp = new BigInteger(String.valueOf(i));
            result = result.multiply(temp);
        }
        return result;
    }
}
