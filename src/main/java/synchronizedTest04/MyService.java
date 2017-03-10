package synchronizedTest04;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyService {
    private boolean hasValue =false;
    public  void product(){
        synchronized (this) {
            try {
                while (hasValue == true) {
                    this.wait();
                }
                System.out.println("生产");
                hasValue = true;
                this.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void consumer(){
        synchronized (this) {
            try {
                while (hasValue == false) {
                    this.wait();
                }
                System.out.println("消费");
                hasValue = false;
                this.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
