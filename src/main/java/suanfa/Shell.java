package suanfa;

public class Shell {
    public static void shells(Comparable[] a){
        int k=0;
        while (3*k<a.length){
            k=3*k+1;
        }
        while (k>=1){
            for (int i=k+1;i<a.length;i++){
                for ( int j=i;j>k&&less(a[j],a[j-k]);j-=k){
                exch(a,j,j-k);}
            }
        }
        k=k/3;
    }

private static void exch(Comparable[] a,int i,int j){
        Comparable c=a[i];
        a[i]=a[j];
        a[j]=c;

}
      private static boolean less(Comparable c1,Comparable c2){
        return c1.compareTo(c2)<0;
      }
      public static void main(String[] args){
        Integer[] a={1,2,3,4,5,6,3,5,6,7,8};
        shells(a);
        for (Integer i:a){
            System.out.println(i);
        }

    }
}
