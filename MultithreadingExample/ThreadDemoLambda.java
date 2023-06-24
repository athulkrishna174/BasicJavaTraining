public class ThreadDemoLambda {

    public static void main(String[] args) throws Exception{

        final int n = 5;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Hi");
                try{ Thread.sleep(1000); } catch(Exception e){}
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Hello");
                try{ Thread.sleep(1000); } catch(Exception e){}
            }
        });

        t1.start();
        try{ Thread.sleep(10); } catch(Exception e){}
        t2.start();


        t1.join();
        t2.join();

        System.out.println("Bye......");
    }
}
