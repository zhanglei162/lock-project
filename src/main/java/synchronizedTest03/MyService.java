package synchronizedTest03;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyService {
    public void await() {
        synchronized (this) {
            try {
                System.out.println("await的时间为：" + System.currentTimeMillis());
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void signal() {
        synchronized (this) {
            try {
                System.out.println("signal的时间为：" + System.currentTimeMillis());
                this.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}