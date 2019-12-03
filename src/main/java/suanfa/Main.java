package suanfa;

public class Main {
    private static int Check(int[] money,int pay){
        int[] a=new int[pay+1];
        for (int i=1;i<=pay;i++){
            int cost=Integer.MAX_VALUE;
            if(i>=1)
                cost=Math.min(cost,a[i-1]+1);
            if(i>=5)
                cost=Math.min(cost,a[i-5]+5);
            if(i>=11)
                cost=Math.min(cost,a[i-11]+11);
            a[i]=cost;
        }
        return a[pay];
    }
    public static void main(String[] args){
        int[] money={1,5,11};
        int pay=15;
        System.out.println(Check(money,pay));
    }
}
