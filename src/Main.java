/*
1) Создайте сто потоков которые будут вычислять факториал
числа равного номеру этого потока и выводить результат на
экран.
 */

import utils.Finish;
import utils.ThreadsClass;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            ThreadsClass c = new ThreadsClass();
            c.setN(new BigInteger(String.valueOf(c.getId())));
            c.setFinish(new Finish());
            c.start();
        }
    }
}
