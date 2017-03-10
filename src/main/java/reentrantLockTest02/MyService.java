package reentrantLockTest02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void testA() {
        lock.lock();//获取锁
        try {
            System.out.println("methodA begin ThreadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end ThreadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//释放锁
        }
    }

    public void testB() {
        lock.lock();//获取锁
        try {
            System.out.println("methodB begin ThreadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end ThreadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//释放锁
        }
    }
}