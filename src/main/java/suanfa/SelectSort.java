package suanfa;

import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args){
        System.out.println("请输入三个数：");
        Scanner in = new Scanner(System.in);
        int[] b=new int[3];
        for(int i=0;i<b.length;i++){
            b[i]=in.nextInt();
        }
        for (int i=0;i<b.length;i++){
            int max=0;
            for (int j=0;j<b.length-i;j++){
                if(b[max]<b[j]){
                    max=j;
                }
            }
            int temp=b[b.length-i-1];
            b[b.length-i-1]=b[max];
            b[max]=temp;
        }
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
