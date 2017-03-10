package reentrantLockTest04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhanglei32 on 2016/6/21.
 *
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();//写
    private Condition condition2 = lock.newCondition();//读
    private boolean hasValue =false;
    public void product(){
        try{
            lock.lock();
            while(hasValue==true){
                condition1.await();
            }
            System.out.println("生产");
            hasValue =true;
            condition2.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void consumer(){
        try{
            lock.lock();
            while(hasValue==false){
                condition2.await();
            }
            System.out.println("消费");
            hasValue =false;
            condition1.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
