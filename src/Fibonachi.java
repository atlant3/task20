import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonachi {

    List<Integer> fibo = new ArrayList<>();
    private int a=0;
    private int b=1;
    private int c;


    public void numberF(int k) {

        for (int i=1; i<=k; i++) {
            c=a+b;
            fibo.add(c);
            a=b;
            b=c;
        }


    }
}
