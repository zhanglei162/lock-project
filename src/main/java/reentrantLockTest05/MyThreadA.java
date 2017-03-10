package reentrantLockTest05;



/**
 * Created by zhanglei32 on 2016/6/24.
 */
public class MyThreadA extends Thread {
    private MyService  myService;

    public MyThreadA(MyService  myService){
        super();
        this.myService=myService;
    }

    public void run(){
        myService.awaitA();
    }
}
