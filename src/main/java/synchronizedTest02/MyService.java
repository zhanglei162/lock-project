package synchronizedTest02;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyService {
    public void testA() {
        synchronized (this) {
            try {
                System.out.println("methodA begin ThreadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("methodA end ThreadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void testB() {
        synchronized (this) {
            try {
                System.out.println("methodB begin ThreadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("methodB end ThreadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}