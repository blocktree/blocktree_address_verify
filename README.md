# Blocktree_address_verify

## 使用反射机制：添加一个区块链的时候只需要在org/blocktree.coin里面添加对应的包做验证地址即可。

### 必须创建java类，Verify。必须实现 CoinVerify接口：

```java
package org.blocktree.coin.lsk;

import org.blocktree.coin.CoinVerify;

public class Verify implements CoinVerify {
    public boolean Verify(String address, String params) {
        return false;
    }
}

```
