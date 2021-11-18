package utils;

import java.math.BigInteger;

public class Finish implements IFinish {
    @Override
    public void done(BigInteger result, long theadId) {
        System.out.println("theadId: " + theadId + ", factorial result: " + result);
    }
}

