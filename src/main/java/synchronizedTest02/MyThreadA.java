package synchronizedTest02;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService){
        super();
        this.myService=myService;
    }

    public void run(){
        myService.testA();
    }
}
