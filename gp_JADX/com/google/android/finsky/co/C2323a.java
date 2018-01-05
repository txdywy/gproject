package com.google.android.finsky.co;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.os.C0327a;
import com.google.android.finsky.utils.C4674e;
import java.lang.reflect.Method;
import java.util.UUID;

public final class C2323a {
    public static final UUID f11431a = UUID.fromString("41217664-9172-527a-b3d5-edabb50a7d69");
    public final Context f11432b;
    public final Object f11433c;
    public final Method f11434d;
    public final Method f11435e;
    public final Method f11436f;
    public final Method f11437g;
    public final Method f11438h;
    public final boolean f11439i;
    public final Handler f11440j;
    public Handler f11441k;

    public C2323a(Context context) {
        C2333k c2333k = new C2333k();
        this(context, (byte) 0);
    }

    private C2323a(Context context, byte b) {
        boolean z = true;
        this.f11432b = context.getApplicationContext();
        this.f11440j = new Handler(Looper.getMainLooper());
        if (C0327a.m1722b()) {
            this.f11433c = context.getSystemService("storagestats");
            if (this.f11433c == null) {
                this.f11434d = null;
            } else {
                this.f11434d = C2333k.m11896a(this.f11433c);
            }
            this.f11435e = C2333k.m11897a("getAppBytes");
            this.f11436f = C2333k.m11897a("getDataBytes");
            this.f11437g = C2333k.m11897a("getCacheBytes");
            if (this.f11433c == null || this.f11434d == null || this.f11435e == null || this.f11436f == null || this.f11437g == null) {
                z = false;
            }
            this.f11439i = z;
            this.f11438h = null;
            return;
        }
        this.f11438h = C2333k.m11895a(context);
        if (this.f11438h == null) {
            z = false;
        }
        this.f11439i = z;
        this.f11433c = null;
        this.f11434d = null;
        this.f11435e = null;
        this.f11436f = null;
        this.f11437g = null;
    }

    public final void m11892a(String str, C2332j c2332j) {
        if (!this.f11439i) {
            c2332j.mo3144a(str, 1600, null);
        }
        if (C0327a.m1722b()) {
            if (this.f11441k == null) {
                HandlerThread a = C4674e.m21808a("Package size fetching thread");
                a.start();
                this.f11441k = new Handler(a.getLooper());
            }
            this.f11441k.post(new C2324b(this, str, c2332j));
            return;
        }
        PackageManager packageManager = this.f11432b.getPackageManager();
        C2330h c2330h = new C2330h(this, c2332j, str);
        try {
            this.f11438h.invoke(packageManager, new Object[]{str, c2330h});
        } catch (Exception e) {
            this.f11440j.post(new C2325c(c2332j, str, e));
        }
    }
}
