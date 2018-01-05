package com.google.android.gms.internal;

import android.util.Log;

public final class xt {
    public final byte[] f27719a;
    public int f27720b;
    public int f27721c;
    public int[] f27722d;
    public /* synthetic */ xs f27723e;

    xt(xs xsVar, byte[] bArr) {
        this.f27723e = xsVar;
        this.f27719a = bArr;
    }

    public final synchronized void m25986a() {
        try {
            if (this.f27723e.f27718b) {
                this.f27723e.f27717a.mo4883a(this.f27719a);
                this.f27723e.f27717a.mo4881a(this.f27720b);
                this.f27723e.f27717a.mo4885b(this.f27721c);
                this.f27723e.f27717a.mo4884a(this.f27722d);
                this.f27723e.f27717a.mo4880a();
            }
        } catch (Throwable e) {
            String str = "Clearcut log failed";
            if (C5329o.m25250a()) {
                Log.v("Ads", str, e);
            }
        }
    }
}
