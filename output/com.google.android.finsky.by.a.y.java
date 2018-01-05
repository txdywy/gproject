package com.google.android.finsky.by.a;

import android.os.Handler;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.by.a.y implements Runnable
{

    public final com.google.android.finsky.by.a.w a;

    y(com.google.android.finsky.by.a.w p0) {
        this.a = p0;
    }

    public final void run() {
        if (this.a.b.j == 0)
            FinskyLog.e("Expected pending replication request.", new Object[0]);
        else {
            if (this.a.b.j.b != 0)
                this.a.b.d.post(this.a.b.j.b);
            this.a.b.j = 0;
            this.a.b.a(com.google.android.finsky.by.a.r.a);
        }
    }

}
