package com.google.android.finsky.billing.iab;

import com.google.wireless.android.finsky.dfe.nano.ax;

final class C1853i implements Runnable {
    public final /* synthetic */ ax f9531a;
    public final /* synthetic */ C1852h f9532b;

    C1853i(C1852h c1852h, ax axVar) {
        this.f9532b = c1852h;
        this.f9531a = axVar;
    }

    public final void run() {
        switch (this.f9531a.c) {
            case 0:
                this.f9532b.f9527a[0] = C1868x.RESULT_OK;
                break;
            case 1:
                this.f9532b.f9527a[0] = C1868x.RESULT_DEVELOPER_ERROR;
                break;
            case 2:
                this.f9532b.f9527a[0] = C1868x.RESULT_ITEM_NOT_OWNED;
                break;
            default:
                this.f9532b.f9527a[0] = C1868x.RESULT_ERROR;
                break;
        }
        this.f9532b.f9530d.m9946a(this.f9532b.f9527a[0], this.f9532b.f9528b);
        this.f9532b.f9529c.release();
    }
}
