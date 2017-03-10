package synchronizedTest04;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyThreadB extends Thread {
    private MyService myService;
    public MyThreadB(MyService myService){
        this.myService=myService;
    }
    public void run(){
        while(true) {
            myService.consumer();
        }
    }
}
