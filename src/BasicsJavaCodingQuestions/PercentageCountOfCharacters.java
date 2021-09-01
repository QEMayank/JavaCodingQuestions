package BasicsJavaCodingQuestions;

import java.text.DecimalFormat;

public class PercentageCountOfCharacters {


    public static void getPercentageCount(String str){
        int len=str.length();

        int upperCaseCount=0;
        int lowerCaseCount=0;
        int digitCaseCount=0;
        int specCaseCount=0;

        for(int i=0;i<len;i++) {
          char[] a=  str.toCharArray();
          char ch=a[i];
    //        char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch))
                digitCaseCount++;

            else {
                specCaseCount++;

            }


        }
        double upperCasePercentage=(upperCaseCount*100.0)/len;
        double lowerCasePercentage=(lowerCaseCount*100.0)/len;
        double digitCasePercentage=(digitCaseCount*100.0)/len;
        double specCasePercentage= (specCaseCount*100.0)/len;


        DecimalFormat formmater=new DecimalFormat("##.##");

        System.out.println("Percentage of characters in String" + str);
        System.out.println("Percentage of UpperCase--->" +formmater.format(upperCasePercentage));
        System.out.println("Percentage of lowerCase--->" + formmater.format(lowerCasePercentage));
        System.out.println("Percentage of digitCase--->" +formmater.format(digitCasePercentage));
        System.out.println("Percentage of specCase--->" +formmater.format(specCasePercentage));
        System.out.println(upperCasePercentage+lowerCasePercentage+digitCasePercentage+specCasePercentage);

        System.out.println("----------------------------------------------------");



    }

    public static void main(String[] args){
        getPercentageCount("MayankNaman123*&*&");

    }
}
