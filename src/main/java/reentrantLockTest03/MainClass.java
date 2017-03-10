package reentrantLockTest03;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MainClass {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            MyThread myThread = new MyThread(myService);
            myThread.start();
            Thread.sleep(3000);
            myService.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
