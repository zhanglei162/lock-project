package reentrantLockTest06;

/**
 * Created by zhanglei32 on 2016/6/24.
 */
public class MyThread extends Thread{
    private MyService myService;
    public MyThread(MyService myService) {
        this.myService = myService;
    }
    @Override
    public void run() {

        try {
            myService.insert(Thread.currentThread());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"被中断");
        }
    }
}
