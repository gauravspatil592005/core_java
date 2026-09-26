class Mythread extends Thread{
    public void run() {
        for (int i = 1; i <=5; i++){
System.out.println("child thread"+i);
         try {   
        Thread.sleep(500);
    }catch (Exception e){
        e.printStackTrace();

    }
   
}
}
}
public class Join_ex {
    public static void main(String[] args) throws InterruptedException {
        Mythread t1=new Mythread();
        t1.start();
        t1.join();
for (int i = 6; i <= 10; i++) {
    System.out.println("main thread:"+i);
    Thread.sleep(500);
}
        
    }

}
