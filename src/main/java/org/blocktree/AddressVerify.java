package org.blocktree;

import org.blocktree.constant.Coin;

import java.lang.reflect.Method;

public class AddressVerify {
    public static boolean Verify(String coinTag, String Params) throws Exception {
        try {
            Class<?> coinClass = Class.forName("org.blocktree.coin." + coinTag.toLowerCase() + ".Verify");
            Method method = coinClass.getMethod("Verify", String.class, String.class);
            Object result = method.invoke(coinClass.newInstance(), coinTag, Params);
            boolean resultBoolean = (Boolean) result;
            return resultBoolean;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Temporary support:" + e.getMessage());
        }

    }
}
