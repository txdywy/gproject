package com.google.android.finsky.billing.iab;

import com.google.wireless.android.finsky.dfe.nano.ax;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.iab.i implements Runnable
{

    public final com.google.wireless.android.finsky.dfe.nano.ax a;
    public final com.google.android.finsky.billing.iab.h b;

    i(com.google.android.finsky.billing.iab.h p0, com.google.wireless.android.finsky.dfe.nano.ax p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        switch (this.a.c) {
            case 0:
                this.b.a[0] = com.google.android.finsky.billing.iab.x.a;
                break;
            case 1:
                this.b.a[0] = com.google.android.finsky.billing.iab.x.f;
                break;
            case 2:
                this.b.a[0] = com.google.android.finsky.billing.iab.x.i;
                break;
            default:
                this.b.a[0] = com.google.android.finsky.billing.iab.x.g;
                break;
        }
        this.b.d.a(this.b.a[0], this.b.b);
        this.b.c.release();
    }

}
