package suanfa;

public class QuickSort {


    public static void main(String[] args) {
        int[] arr =new int[]{5,4,1,7,3,9,21,-1};
        sort(arr,0,7);
    }

    public static void sort(int[] arr,int l,int r){
        if(l>r) return;
        int start = l;
        int end = r;
        int key = arr[l];
        while(start<end){
            //从又向左找比基准值小的并交换位置
            while(start<end&&arr[end]>=key){
                end--;
            }
            if(start<end){
                int temp = arr[end];
                arr[end] = key;
                arr[start] =temp;
            }
            //从左向又找比基准值大的并交换位置
            while(start<end&&arr[start]<=key){
                start++;
            }
            if(start<end){
                int temp = arr[start];
                arr[start] = key;
                arr[end] = temp;
            }
        }
        System.out.println(start+" "+end);
        System.out.println(arr[0]+" "+arr[1]+"  "+arr[2]+"  "+arr[3]+"  "+arr[4]+"  "+arr[5]+"  "+arr[6]+"  "+arr[7]);
        sort(arr,l,start-1);
        sort(arr,start+1,r);
    }
}