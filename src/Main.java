import MCA.sync.MySync;
import MCA.sync.MyThreadWithSync;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        MySync mySync = new MySync();
        MyThreadWithSync sync1 = new MyThreadWithSync("Thread1",mySync);
        MyThreadWithSync sync2 = new MyThreadWithSync("Thread2",mySync);
        sync1.start();
        sync2.start();
    }
}