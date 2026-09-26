class Task implements Runnable{
public void run(){
    // for (int i = 0; i <
    // 6; i++) {
        //  System.out.println(i);
         System.out.println(Thread.currentThread().getName()+"running");
        
    }

   
 }
// }

public class Main{
    public static void main(String[] args) {
        Task task=new Task();
        Thread t1=new Thread(task,"welcome fct1");
         Thread t2=new Thread(task,"welcome fct2");
          Thread t3=new Thread(task,"welcome fct3");
          t1.setPriority(Thread.MAX_PRIORITY);
          t2.setPriority(Thread.MIN_PRIORITY);
                    t3.setPriority(Thread.NORM_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
            
     
        System.out.println(t1.getName());
        
    } 
}