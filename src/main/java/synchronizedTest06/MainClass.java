package synchronizedTest06;

/**
 * Created by zhanglei32 on 2016/6/24.
 */
public class MainClass {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            MyThread thread1 = new MyThread(myService);
            MyThread thread2 = new MyThread(myService);
            thread1.start();
            Thread.sleep(1000);
            thread2.start();
            Thread.sleep(2000);
            thread2.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
