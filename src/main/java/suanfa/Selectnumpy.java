package suanfa;

public class Selectnumpy {
    public static void main(String[] args){
        int[] weights={1,2,4,1,7,8,3};
        System.out.println(get(weights.length-1,weights));
    }
    static int get(int i,int[] arr){
        if(i==0){
            return arr[0];

        }
        if(i==1){
            return Math.max(arr[0],arr[1]);
        }
        return Math.max(arr[i]+get(i-2,arr),get(i-1,arr));
    }
}
