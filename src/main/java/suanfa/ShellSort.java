package suanfa;

public class ShellSort {
    static public int[] Sort(int[] a){
        int len=a.length;
        int dk=len/2;
        while (dk>=1){
            shellInsert(a,dk);
            dk/=2;
        }
        return a;
    }



    private static void shellInsert(int[] a,int dk){
        if(dk==0)
            throw new IllegalArgumentException("dk can't equals 0");
        int len =a.length;
        for(int i=dk;i<len;i++){
            int key =a[i];
            int j=i-dk;
            while (j>=0&&key<a[j]){
                a[j+dk]=a[j];
                j-=dk;

            }
            a[j+dk]=key;
        }
    }
}
