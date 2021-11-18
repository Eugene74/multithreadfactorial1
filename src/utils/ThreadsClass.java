package utils;

import java.math.BigInteger;

public class ThreadsClass extends Thread {
    private IFinish finish;
    private BigInteger n;

    public ThreadsClass() {
    }

    public ThreadsClass(BigInteger n, IFinish finish) {
        this.n = n;
        this.finish = finish;
    }

    public IFinish getFinish() {
        return finish;
    }

    public void setFinish(IFinish finish) {
        this.finish = finish;
    }

    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    private BigInteger fact(BigInteger x) {
        if (x.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return x.multiply(fact(x.subtract(BigInteger.ONE)));
    }

    public void run() {
        BigInteger res = fact(n);
        if (finish != null)
            finish.done(res, this.getId());
    }
}
