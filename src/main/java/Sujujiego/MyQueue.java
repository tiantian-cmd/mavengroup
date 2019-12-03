package Sujujiego;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyQueue {
    private Integer[] datas;
    private Integer head;
    private Integer tail;
    private Integer length;
    public MyQueue(){
        datas =new Integer[10];
        head=0;
        tail=0;
        length=10;
    }
    public void insert(Integer data){
        if(datas.length>=length){
            datas= Arrays.copyOf(datas,length+10);
            length=length+10;
        }
        datas[tail]=data;
        tail++;
    }

    public void showMyQueue(){
        if(head<tail){
            for (int i=head;i<tail;i++){
                System.out.println(datas[i]);
            }

            }
        else {
            System.out.println("空队列");
        }
    }
}

