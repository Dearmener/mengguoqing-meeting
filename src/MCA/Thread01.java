package MCA;

public class Thread01 extends Thread {
   int num;
   int count = 0;
    public Thread01(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(num);
            incrementCount();
            try {
                Thread.sleep(1000);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public synchronized void incrementCount(){
        count++;
    }
}
