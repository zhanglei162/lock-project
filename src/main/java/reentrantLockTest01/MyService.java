package reentrantLockTest01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhanglei32 on 2016/6/21.
 *
 */
public class MyService {
    private Lock lock =new ReentrantLock();
    public void testMethod(){
        lock.lock();//获取锁
        try{
            for(int i=0;i<5;i++){
                System.out.println("ThreadName="+Thread.currentThread().getName()+(" "+(i+1)));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();//释放锁
        }

    }
}
