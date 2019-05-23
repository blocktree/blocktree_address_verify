package org.blocktree.coin.lsk;

import org.blocktree.coin.CoinVerify;

import java.math.BigInteger;
import java.nio.charset.Charset;

public class Verify implements CoinVerify {
    public boolean Verify(String address, String params) {

        if (!address.endsWith("L")) {
            return false;
        }
        String target = address.replaceAll("L","");

        if(Utils.BigIntegerToBytes(new BigInteger(target)).length==8){
            return true;
        }
        return false;
    }
}
