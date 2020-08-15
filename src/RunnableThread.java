public class RunnableThread implements Runnable {
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
        System.out.print("Runnable: ");
        for (int i=f.fibo.size()-1; i>-1; i--) {
            System.out.print(f.fibo.get(i)+", ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
