package suanfa;

public class cutCordone {
    public int Aftercord(int length){
        if (length<2)
            return 1;
        if (length==2)
            return 1;
        if (length==3)
            return 2;
        int time=length/3;
        if (length-time*3==1){
            time-=1;

        }
        int time1=(length-time*3)/2;
        return (int)(Math.pow(3,time))*(int)(Math.pow(2,time1));
    }
    public static void main(String[] args){
        cutCordone cord=new cutCordone();
        int max=cord.Aftercord(7);
        System.out.println(max);
    }

}
