package synchronizedTest04;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MainClass {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA myThreadA = new MyThreadA(myService);
        MyThreadB myThreadB = new MyThreadB(myService);
        myThreadA.start();
        myThreadB.start();
    }
}
