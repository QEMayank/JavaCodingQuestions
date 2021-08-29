package BasicsJavaCodingQuestions;

public class ArmStrongNumber {

    /*
    * Check given number is a Armstrong number or not->sum of its own digits each raised to the power of the number of digits.
    * For example 153=1^3 +5^3+3^3=153 hence it is a Armstrong Number
    * narcissistic Number
    * pluperfect digital invariant (PPDI) Number/
    * plus perfect Number
     */

    public static boolean isArmStringNumber(int num){
        if(num<0){
            return false;
        }
        if(num>=0 && num<=9){
            return true;
        }
        else {


            int power = power(num);
            int numCopy = num;

            int sum = 0;
            while (numCopy != 0) {
                int factor = 1;
                int lastDigit = numCopy % 10;
                for (int i = 0; i < power; i++) {
                    factor = factor * lastDigit;
                }
                sum = sum + factor;
                numCopy=numCopy/10;

            }
            if(sum==num){
                return true;
            }
        }
        return false;
    }

    public static int power(int num){
        int n=0;
        while(num!=0){
            n=n+1;
            num=num/10;
        }
        return n;
    }

    public static  void main(String[] args){
       System.out.println(isArmStringNumber(0));
//        System.out.println(isArmStringNumber(157));
        System.out.println(isArmStringNumber(153));
        System.out.println(isArmStringNumber(159));
        System.out.println(isArmStringNumber(407));
        System.out.println(isArmStringNumber(371));
        System.out.println(isArmStringNumber(567));
    }
}

