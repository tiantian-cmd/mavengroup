package suanfa;

public class DPProblem {
    public static void main(String[] args){
        int[] cons=new int[12];
        for (int i=1;i<=11;i++){
            int cons1=i-1;
            int cons3=i-3;
            int cons5=i-5;
            int minCons=cons[cons1];
            int lastCons=cons1;
            if(cons3>=0&&cons[cons3]<minCons){
                minCons=cons[cons3];
                lastCons=cons3;
            }
            if(cons5>=0&&cons[cons5]<minCons){
                minCons=cons[cons5];
                lastCons=cons5;
            }
            cons[i]=minCons+1;
            System.out.println(i+":"+cons[i]);
        }

    }
}
