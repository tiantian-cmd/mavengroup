package suanfa;

public class Add {
    public static void main(String[] args){
        int[] arr={2,13,54,6,8,2};
        int sum=60;
        System.out.println(test(arr.length-1,sum,arr));
    }
    static boolean test(int i,int sum,int[] arr){
        if (sum==0){
            return true;
        }
        if (i==0){
            return arr[i]==sum;
        }
        if(arr[i]>sum){
            return test(i-1,sum,arr);

        }
        return test(i-1,sum-arr[i],arr)||test(i-1,sum,arr);
    }

}
