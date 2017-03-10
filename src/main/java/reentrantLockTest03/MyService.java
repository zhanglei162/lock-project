package reentrantLockTest03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void await() {
        lock.lock();//获取锁
        try {
            System.out.println("await的时间为："+System.currentTimeMillis());
            condition.await();
            System.out.println("await结束的时间为："+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//释放锁
        }
    }

    public void signal() {
        lock.lock();//获取锁
        try {
            System.out.println("signal的时间为："+System.currentTimeMillis());
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//释放锁
        }
    }
}