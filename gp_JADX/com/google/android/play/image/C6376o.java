package com.google.android.play.image;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class C6376o {
    public final ThreadPoolExecutor f32120a;

    C6376o(int i) {
        int i2 = i;
        int i3 = i;
        this.f32120a = new ThreadPoolExecutor(i2, i3, 5000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), C6377p.f32121a);
    }
}
