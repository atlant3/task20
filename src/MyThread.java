import java.util.Scanner;

public class MyThread extends Thread {
    private int j;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    @Override
    public void run() {

        System.out.println();
        Fibonachi f = new Fibonachi();
        f.numberF(j);
        System.out.print("Thread: ");
        for (int i=0; i<f.fibo.size(); i++) {
            System.out.print(f.fibo.get(i)+", ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
