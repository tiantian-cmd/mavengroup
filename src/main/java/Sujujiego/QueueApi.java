package Sujujiego;

 public interface QueueApi<T> {
   boolean initQueue(int maxSize);
   boolean pushQueue(T t);
   T popQueue();
   T getTop();

}
