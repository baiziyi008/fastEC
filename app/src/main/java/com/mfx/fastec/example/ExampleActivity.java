package com.mfx.fastec.example;

import com.mfx.latte.activities.ProxyActivity;
import com.mfx.latte.delegates.LatteDelegate;

/**
 * Created by mfx on 2018/8/27.
 */

public class ExampleActivity extends ProxyActivity {
    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
