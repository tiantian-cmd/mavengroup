package suanfa;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5,6,7,8};
        List<Integer> resIndexList=binarySearch2(arr,0,arr.length-1,10);
        System.out.println("resIndexList="+resIndexList);

    }
    public static int binarySearch(int[] arr,int left,int right,int findVal){
        if(left>right){
            return  -1;
        }
        int mid=(left+right)/2;
        int midVal=arr[mid];
        if(findVal>midVal){
            return binarySearch(arr,mid+1,right,findVal);
        }
        else if(findVal<midVal){
            return binarySearch(arr, left, mid-1, findVal);
        }
        else {
            return mid;
        }
    }
    public static List<Integer> binarySearch2(int[] arr,int left,int right,int findVal){
        if(left>right){
            return new ArrayList<Integer>();

        }
        int mid=(left+right)/2;
        int midVal=arr[mid];
        if(findVal>midVal){
            return binarySearch2(arr,mid+1,right,findVal);

        }
        else if(findVal<midVal){
            return binarySearch2(arr,left,mid-1,findVal);
        }
        else {
            List<Integer> resIndexlist=new ArrayList<Integer>();
            int temp=mid-1;
            while (true){
                if(temp<0||arr[temp]!=findVal){
                    break;
                }
                resIndexlist.add(temp);
                temp=-1;
            }
            resIndexlist.add(mid);
            temp=mid+1;
            while (true){
                if (temp>arr.length-1||arr[temp]!=findVal){
                    break;
                }
                resIndexlist.add(temp);
                temp+=1;

            }
            return resIndexlist;
        }
    }
}
