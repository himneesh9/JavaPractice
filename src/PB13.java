class MyThread1 extends Thread {
      public void run(){
            System.out.println("Good Morning");
      }
}
class MyThread2 extends Thread{
    public void run(){
            System.out.println("Welcome");
    }
}
public class PB13 {
    public static void main(String[] args) {
      MyThread1 t1 = new MyThread1();
      MyThread2 t2 = new MyThread2();
      t1.start();
      t2.start();
      t1.setPriority(5);
      t2.setPriority(1);

      System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
