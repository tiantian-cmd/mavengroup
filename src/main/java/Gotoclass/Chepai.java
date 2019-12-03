package Gotoclass;

import java.util.Random;
import java.util.Scanner;

public class Chepai {
    public static void main(String[] arrgs){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String b=in.nextLine();
        Random c=new Random(10);
        int d=c.nextInt();
        Random rand=new Random();
        System.out.println();
        StringBuffer license_plate_number =new StringBuffer();
        license_plate_number.append("赣D");
        char ch=(char)(rand.nextInt((26)+65));
        license_plate_number.append(ch);
        for (int i=0;i<4;i++){
            char digit=(char)(rand.nextInt(10)+48);
            license_plate_number.append(digit);

        }
        System.out.println(license_plate_number);
    }
}
