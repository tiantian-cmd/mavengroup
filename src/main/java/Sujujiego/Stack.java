package Sujujiego;

import sun.invoke.empty.Empty;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E> {
    private List<E> pool=new ArrayList<E>();
    public Stack(){}
    public void clear(){
        pool.clear();
    }
    private boolean isEmpty(){
        return pool.isEmpty();
    }
    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return pool.remove(pool.size()-1);
    }
    public void push(E e){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        pool.add(e);
    }
    public int getStackSize(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return pool.size();
    }


}
