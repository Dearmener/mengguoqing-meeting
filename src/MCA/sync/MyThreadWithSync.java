package MCA.sync;

public class MyThreadWithSync extends Thread{
    private String name;
    private MySync mySync;

    public MyThreadWithSync(String name, MySync mySync) {
        this.name = name;
        this.mySync = mySync;
    }

    @Override
    public void run() {
       for(int i = 0 ; i < 100 ;i ++)
       {
           synchronized (mySync){
               mySync.incrementCount();;
               System.out.println(this.name+"->"+this.mySync.getCount());
           }

           try {
               Thread.sleep(1000);
           }catch (Exception e)
           {
               e.printStackTrace();
           }
       }
    }
}
