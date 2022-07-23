class Thread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
        System.out.println("thread 1 is running");
        System.out.println("i am happy");
        i++;
    }}
}
class Thread2 extends Thread{
    @Override
    public void run(){
        int i = 0 ;
        while(i<40000){
        System.out.println("thread 2  is running");
        System.out.println("i am sad");
        i++;
    }}
}

public class Multithreading {
    public static void main(String[] args) {
      Thread1 t1 = new Thread1();
      Thread2 t2 = new Thread2();
      t1.run();
      t2.run();
    }
}
