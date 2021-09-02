package BasicsJavaCodingQuestions;

import sun.rmi.runtime.Log;

import java.util.HashMap;

public class FrequencyOfAllDigits {


    public static void frequencyOfDigits( int num){
       String str= Integer.toString(num);
       int[] arr = new int[str.length()];
       for(int i=0;i<str.length();i++){
           arr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
           
       }
        HashMap<Integer,Integer> hashMap=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(hashMap.containsKey(arr[i])){
               int key=hashMap.get(arr[i]);
               hashMap.put(arr[i],key+1);
           }
           else {
               hashMap.put(arr[i], 1);
           }
       }
        System.out.println(hashMap);
    }


    public static void frequencyOfDigitMethod2(long num){
        long val;

        HashMap<Long,Integer> hashMap=new HashMap<>();
        while(num!=0){
            val=num%10;
            if(hashMap.containsKey(val)){
                hashMap.put(val,hashMap.get(val)+1);
            }
            else{
                hashMap.put(val,1);

            }
            num=num/10;
        }
        System.out.println(hashMap);
    }



    public static void main(String[] args){
frequencyOfDigits(1122222333);
frequencyOfDigitMethod2(1122222333);

    }
}
