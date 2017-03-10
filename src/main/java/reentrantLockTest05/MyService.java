package reentrantLockTest05;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhanglei32 on 2016/6/24.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA(){
        try{
            lock.lock();
            System.out.println("begin awaitA的时间为："+System.currentTimeMillis());
            conditionA.await();
            System.out.println("end awaitA的时间为："+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void awaitB(){
        try{
            lock.lock();
            System.out.println("begin awaitB的时间为："+System.currentTimeMillis());
            conditionB.await();
            System.out.println("end awaitB的时间为："+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signal_A(){
        try{
            lock.lock();
            System.out.println("signal_A的时间为："+System.currentTimeMillis());
            conditionA.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signal_B(){
        try{
            lock.lock();
            System.out.println("signal_B的时间为："+System.currentTimeMillis());
            conditionB.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
