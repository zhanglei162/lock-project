package reentrantLockTest06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhanglei32 on 2016/6/24.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void insert(Thread thread) throws InterruptedException{
        lock.lockInterruptibly();
        try {
            System.out.println(thread.getName()+"得到了锁");
            while (true){

            }
        }
        finally {
            System.out.println(Thread.currentThread().getName()+"执行finally");
            lock.unlock();
            System.out.println(thread.getName()+"释放了锁");
        }
    }
}
