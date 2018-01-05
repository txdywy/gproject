package com.google.android.finsky.updatechecker.impl;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.updatechecker.C4640d;

public final class C4661t {
    public final Context f23990a;
    public final C2266a f23991b;
    public final C2206c f23992c;
    public final C3646a f23993d;
    public final C1627b f23994e;
    public final C4640d f23995f;
    public final C1502a f23996g;
    public final C3960a f23997h;

    public C4661t(Context context, C2266a c2266a, C2206c c2206c, C3646a c3646a, C1627b c1627b, C4640d c4640d, C1502a c1502a, C3960a c3960a) {
        this.f23990a = context;
        this.f23991b = c2266a;
        this.f23992c = c2206c;
        this.f23993d = c3646a;
        this.f23994e = c1627b;
        this.f23995f = c4640d;
        this.f23996g = c1502a;
        this.f23997h = c3960a;
    }

    public final boolean m21649a() {
        if (this.f23990a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", 0) != 0) {
            return false;
        }
        if (System.currentTimeMillis() - ((Long) C0954a.ah.m5760a()).longValue() > ((Long) C0955b.f5887do.m28964b()).longValue()) {
            return false;
        }
        return true;
    }

    public final boolean m21650b() {
        if (this.f23991b.m11722d() && !this.f23997h.m18669b()) {
            return false;
        }
        if (this.f23991b.m11720b()) {
            C2266a c2266a = this.f23991b;
            boolean z = C2266a.f11248a ? c2266a.m11720b() && c2266a.f11249b.isActiveNetworkMetered() : false;
            if (!z) {
                return false;
            }
        }
        if (this.f23991b.m11724f()) {
            return false;
        }
        if ((C1503a.m8830a(this.f23990a) || C1503a.m8831b(this.f23990a)) && this.f23991b.m11721c()) {
            return false;
        }
        return true;
    }

    public final void m21648a(Runnable runnable) {
        WakeLock newWakeLock = ((PowerManager) this.f23990a.getSystemService("power")).newWakeLock(1, "ReschedulerStrategy");
        Runnable c4662u = new C4662u(runnable, newWakeLock);
        newWakeLock.acquire();
        this.f23992c.mo2815a(c4662u);
        this.f23993d.m17248a(c4662u);
        this.f23994e.m9310a(c4662u);
    }

    public final void m21647a(C2239c c2239c, boolean z, int i, C2495w c2495w) {
        this.f23995f.mo4314a().mo4316a(c2239c, z, i, c2495w.m13375a("wifi_checker"));
    }

    public final void m21646a(C2239c c2239c, C2495w c2495w) {
        m21647a(c2239c, true, -1, c2495w);
    }
}
