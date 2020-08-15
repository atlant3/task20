import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entry numbers Fibonachi: ");
        int o = sc.nextInt();

        MyThread myt = new MyThread();
        RunnableThread rt = new RunnableThread();
        rt.setJ(o);
        myt.setJ(o);
        Thread t = new Thread(rt);
        myt.start();
        try {
            myt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
