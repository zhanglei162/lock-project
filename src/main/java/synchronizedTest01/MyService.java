package synchronizedTest01;

/**
 * Created by zhanglei32 on 2016/6/21.
 */
public class MyService {
    public  void testMethod() {
      //  synchronized (MyService.class){
            try {
                for (int i = 0; i <5; i++) {
                    Thread.sleep(1);
                    System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i + 1)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
  //  }
}