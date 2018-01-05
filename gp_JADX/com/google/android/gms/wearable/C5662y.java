package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

final class C5662y implements Runnable {
    public /* synthetic */ DataHolder f28718a;
    public /* synthetic */ C5657t f28719b;

    C5662y(C5657t c5657t, DataHolder dataHolder) {
        this.f28719b = c5657t;
        this.f28718a = dataHolder;
    }

    public final void run() {
        C5616d c5616d = new C5616d(this.f28718a);
        try {
            this.f28719b.f28717b.mo4383a(c5616d);
        } finally {
            c5616d.mo4500a();
        }
    }
}
