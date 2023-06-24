class Q{
    private int num;
    private boolean setValue = false;

    public synchronized void put(int num){

        while(setValue){
            try{ wait(); } catch(InterruptedException e) {}
        }

        System.out.println("Put : " + num);
        this.num = num;

        setValue = true;
        notify();
    }

    public synchronized void get(){

        while(!setValue){
            try{ wait(); } catch(InterruptedException e) {}
        }

        System.out.println("Get : " + this.num);

        setValue = false;
        notify();
    }
}

class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;

        Thread t = new Thread(this, "Producer");
        t.start();
    }
    public void run(){
        int i = 0;
        while(true){
            this.q.put(i++);
            try{ Thread.sleep(1000); } catch(InterruptedException e) {}
        }
    }
    
}

class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;

        Thread t = new Thread(this, "Consumer");
        t.start();
    }
    public void run(){
        while(true){
            this.q.get();
            try{ Thread.sleep(1000); } catch(InterruptedException e) {}
        }
    }
    
}

public class ThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
