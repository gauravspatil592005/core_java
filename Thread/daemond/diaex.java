class  Mythread extends Thread{
public void run()
{
if(Thread.currentThread().isDaemon()){
    System.out.println("deamon thread is runing ");

}else{
    System.out.println("user  thread is runing");
}
}
}
public class diaex {
    Mythread t1=new Mythread();
       Mythread t2=new Mythread();
       t1.setDeamon(true);
    
}
