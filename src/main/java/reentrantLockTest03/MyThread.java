package reentrantLockTest03;



/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService){
        super();
        this.myService=myService;
    }

    public void run(){
        myService.await();
    }
}
