package suanfa;

public class Select {
    public static void main(String[] args){
        int totalWeight=100;
        int[] weights={4,1,1,9,1};
        int[] opt=new int[weights.length];
        opt[0]=weights[0];
        opt[1]=Math.max(weights[0],weights[1]);
        for (int i=2;i<opt.length;i++){
            opt[i]=Math.max(opt[i-2]+weights[i],opt[i-1]);
        }
        System.out.println(opt[weights.length-1]);
    }
}
