package suanfa;

public class JunpFloor {
    public int jumpfloor(int target){
        if(target==1||target==2)
            return  target;
        int pre1=1;
        int pre2=2;
        int total=pre1+pre2;
        for (int i=3;i<=target;i++){
            total=pre1+pre2;
            pre1=pre2;
            pre2=total;
        }
        return total;
    }
    public int jump(int target){
        if (target==1||target==2)
            return target;
        return jump(target-1)+jump(target-2);
    }
}
