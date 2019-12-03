package Gotoclass;

import java.util.Scanner;

public class Tochar {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("please input a Hex");
        String s = in.nextLine();

        System.out.println(s + "'s decimal is " + hexTranslateToDecimal ( s.toUpperCase() ) );
    }
    private static int hexTranslateToDecimal(String s)
    {
        int decimal = 0;
        for( int i = 0; i < s.length(); i++)
        {
            char hexChar = s.charAt(i);
         System.out.println(hexChar);
            decimal = decimal * 16 + hexCharToDecimal(hexChar);
        }
        return decimal;
    }
    private static int hexCharToDecimal(char hexChar)
    {
        if (hexChar >= 'A' && hexChar <= 'F' )
            return hexChar - 'A' + 10 ;
        else
            return  hexChar - '0';
    }



}
