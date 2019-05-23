package org.blocktree.coin.lsk;

import java.math.BigInteger;

public class Utils {
    public static byte[] BigIntegerToBytes(BigInteger bitInt) {
        byte[] result = bitInt.toByteArray();
        return result;
    }
}
