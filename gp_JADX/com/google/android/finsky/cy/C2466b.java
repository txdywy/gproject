package com.google.android.finsky.cy;

import android.content.Context;
import com.google.android.finsky.cl.C2292c;
import com.google.android.finsky.installqueue.C2291q;
import com.google.android.finsky.installqueue.C2465r;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.utils.FinskyLog;
import p002a.C0002a;

public final class C2466b implements C2465r {
    public final Context f13289a;
    public final C4817d f13290b;
    public final C0002a f13291c;
    public final C0002a f13292d;
    public final C0002a f13293e;

    public C2466b(Context context, C4817d c4817d, C0002a c0002a, C0002a c0002a2, C0002a c0002a3) {
        this.f13289a = context;
        this.f13290b = c4817d;
        this.f13291c = c0002a;
        this.f13292d = c0002a2;
        this.f13293e = c0002a3;
    }

    public final C2291q mo2910a(InstallRequest installRequest) {
        switch (installRequest.f17171a.f17136f) {
            case 0:
                return new C2464a(this.f13290b);
            case 1:
                return new C2292c(this.f13289a, this.f13291c, this.f13292d, this.f13293e, this.f13290b);
            default:
                FinskyLog.m21669e("Unsupported RetryStrategy type for request: %s", installRequest);
                return new C2464a(this.f13290b);
        }
    }
}
