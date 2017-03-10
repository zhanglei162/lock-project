package reentrantLockTest04;


/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyThreadA extends Thread {
    private MyService myService;
    public MyThreadA(MyService myService){
        this.myService=myService;
    }
    public void run(){
        while(true) {
            myService.product();
        }
    }
}
