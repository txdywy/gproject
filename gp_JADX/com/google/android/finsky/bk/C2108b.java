package com.google.android.finsky.bk;

import com.google.android.finsky.download.C2839b;

final class C2108b implements Runnable {
    public final /* synthetic */ C2839b f10719a;
    public final /* synthetic */ C2107a f10720b;

    C2108b(C2107a c2107a, C2839b c2839b) {
        this.f10720b = c2107a;
        this.f10719a = c2839b;
    }

    public final void run() {
        C2109c b = this.f10720b.m11001b();
        if (this.f10719a.equals(this.f10720b.f10718g)) {
            this.f10720b.f10717f = b;
        }
    }
}
