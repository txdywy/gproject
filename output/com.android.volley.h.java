package com.android.volley;

import android.os.Handler;

public final class com.android.volley.h implements Executor
{

    public final Handler a;

    h(Handler p0) {
        this.a = p0;
    }

    public final void execute(Runnable p0) {
        this.a.post(p0);
    }

}
