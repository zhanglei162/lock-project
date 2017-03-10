package reentrantLockTest05;

/**
 * Created by zhanglei32 on 2016/6/24.
 */
public class MainClass {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            MyThreadA myThreadA = new MyThreadA(myService);
            MyThreadB myThreadB = new MyThreadB(myService);
            myThreadA.start();
            myThreadB.start();
            Thread.sleep(3000);
            myService.signal_A();
            myService.signal_B();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
