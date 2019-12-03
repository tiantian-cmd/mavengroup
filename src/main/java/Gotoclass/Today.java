package Gotoclass;

public class Today {
    public static void main(String[] args){
        String[] title={"sun","mon","tue","wed","thu","fri","sts"};
        int DAY=5;
        for (int i=0;i<title.length;i++){
            System.out.printf("%4f",title[i]);

        }System.out.println();
        for (int i=0;i<DAY;i++){
            System.out.printf("%4f"," ");

        }
        for (int i=1;i<=30;i++){
            System.out.printf("%4d",i);
            if ((DAY+i)%7==0)
                System.out.println();
        }
    }
}
