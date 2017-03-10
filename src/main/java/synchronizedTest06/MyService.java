package synchronizedTest06;

/**
 * Created by zhanglei32 on 2016/6/24.
 *
 */
public class MyService {

    public synchronized void insert(Thread thread) throws InterruptedException{
        try {
            System.out.println(thread.getName()+"得到了锁");
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println(thread.getName()+"释放了锁");
        }
    }
}
