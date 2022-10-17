package Quick_Access;
import java.util.*;
import java.math.*;

public class Numeric{
    //NUMEBERS
    public boolean isPrime(int n){
        if (n < 2)
            throw new IllegalArgumentException("Incompatible");
        int flag = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                flag++;
            }
        }
        if (flag == 2){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isComposite(int n){
        if (n < 2)
            throw new IllegalArgumentException("Incompatible");
        int flag = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                flag++;
            }
        }
        if (flag == 2){
            return false;
        }
        else {
            return true;
        }
    }

    public Integer[] digitExtract(int n){
        Integer digits[] = {};
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(digits));
        while (n != 0){
            linkedList.push(n % 10);
            n /= 10;
            digits = linkedList.toArray(digits); 
        }

        return digits;
    }

    public int digitNumber(int n){
        Integer digits[] = {};
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(digits));
        while (n != 0){
            linkedList.push(n % 10);
            n /= 10;
            digits = linkedList.toArray(digits); 
        }

        return digits.length;
    }

    public String toWord(int n){
        if (n < 0 || n > 9)
            throw new IllegalArgumentException("Incompatible");

        switch (n){
            case 0 :
                return "ZERO";

            case 1:
                return "ONE";

            case 2:
                return "TWO";

            case 3:
                return "THREE";

            case 4:
                return "FOUR";

            case 5:
                return "FIVE";

            case 6:
                return "SIX";

            case 7:
                return "SEVEN";

            case 8:
                return "EIGHT";

            case 9:
                return "NINE";
        }
        return null;
    }

    public Integer[] factorsExtract(int n){
        Integer factors[] = {};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(factors));
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                arrayList.add(i); 
                factors = arrayList.toArray(factors); 
            }
        } 

        return factors;
    }

    public int factorNumber(int n){
        Integer factors[] = {};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(factors));
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                arrayList.add(i); 
                factors = arrayList.toArray(factors); 
            }
        } 

        return factors.length;
    }

    public int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b % a, a);
    }

    public int lcm(int a, int b){
        int LCM = 0;
        LCM = (a > b) ? a : b;

        while(true){
            if(LCM % a == 0 && LCM % b == 0) {
                return LCM;
            }
            ++LCM;
        }
    }

    public boolean isCoPrime(int a, int b){
        if (gcd(a, b) == 1){
            return true;
        }
        else {
            return false;
        }
    }

    public int reverseNumber(int n){
        int rev = 0, a, x;
        a = n;
        while (a > 0){
            x = a % 10;
            rev = (rev * 10) + x;
            a /= 10;
        }
        return rev;
    }

    public boolean isPalindrome(int a, int b){
        int rev = 0, n, x;
        n = a;
        while (n > 0){
            x = n % 10;
            rev = (rev * 10) + x;
            n /= 10;
        }
        if (rev == b){
            return true; 
        }
        else {
            return false;
        }
    }
    
    public double middleNumber(int n){
        String num = Integer.toString(n);
        int length = num.length();
        if (length % 2 == 0){
            int mid1 = Character.getNumericValue(num.charAt(length / 2));
            int mid2 = Character.getNumericValue(num.charAt((length / 2) - 1));
            double averageMid = (mid1 + mid2) / 2.0;
            return averageMid;   
        }
        else {
            return Character.getNumericValue(num.charAt(length / 2));
        }
    }
    
    //SERIES
    public String genFactorial(int n){
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= n; ++i){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial.toString();
    }

    public String genFibonacci(int length){
        Long series[] = {};
        ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(series));
        list.add(Long.valueOf(0));
        list.add(Long.valueOf(1));
        long n1 = 0, n2 = 1, n3 = 0;
        for (int i = 2; i < length; i++){
            series = list.toArray(series); 
            list.add(series[i - 2] + series[i - 1]);
            series = list.toArray(series); 
        }
        return Arrays.toString(series);
    }        
    
    //ROUND
    public double round1(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double round2(double value, int places) {
        double reference = Math.pow(10, places);
        return Math.round(value * reference) / reference;
    }
    
    //RANDOM 
    public double randomDouble(double lower_value, double upper_value) {
        upper_value = (upper_value > lower_value) ? upper_value : lower_value;

        double random = (double)(Math.random() * (upper_value - lower_value + 1) + lower_value);
        return random;
    }

    public int randomInt(int lower_value, int upper_value) {
        upper_value = (upper_value > lower_value) ? upper_value : lower_value;

        int random_int = (int)(Math.random() * (upper_value - lower_value + 1) + lower_value);
        return random_int;
    }

    public boolean randomBool() {
        int upper_value = 1;
        int lower_value = 0;
        int random_int = (int)(Math.random() * (upper_value - lower_value + 1) + lower_value);
        switch (random_int){
            case 1:
                return true;
            case 0:
                return false;
        }
        return false;
    }
}

