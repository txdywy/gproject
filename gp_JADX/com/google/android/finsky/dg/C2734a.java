package com.google.android.finsky.dg;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.utils.C4671b;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public final class C2734a {
    public final Set f14958a;
    public final Set f14959b;
    public final Handler f14960c;
    public final ContentObserver f14961d;
    public final C2736i f14962e;
    public final ContentResolver f14963f;
    public boolean f14964g;
    public C1503a f14965h;

    public C2734a(Context context) {
        this(context.getContentResolver(), new C1503a(context));
    }

    private C2734a(ContentResolver contentResolver, C1503a c1503a) {
        this.f14958a = Collections.newSetFromMap(new IdentityHashMap());
        this.f14959b = Collections.newSetFromMap(new IdentityHashMap());
        this.f14960c = new Handler(Looper.getMainLooper());
        this.f14961d = new C2735b(this, this.f14960c);
        this.f14962e = new C2737c(this);
        this.f14964g = false;
        this.f14963f = contentResolver;
        this.f14965h = c1503a;
    }

    @TargetApi(17)
    public final synchronized boolean m14775a() {
        if (!this.f14964g) {
            int i;
            boolean z;
            if ((((Boolean) C0955b.bu.m28964b()).booleanValue() & (this.f14965h.f8182f & C0327a.m1722b())) != 0) {
                i = Global.getInt(this.f14963f, "tv_user_setup_complete", 0);
            } else if (C4671b.m21784a()) {
                i = Global.getInt(this.f14963f, "device_provisioned", 0);
            } else {
                i = Secure.getInt(this.f14963f, "device_provisioned", 0);
            }
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f14964g = z;
        }
        return this.f14964g;
    }

    public final void m14773a(C2736i c2736i) {
        this.f14960c.post(new C2738d(this, c2736i));
    }

    public final boolean m14777b() {
        if (!C4671b.m21787d() || this.f14965h.f8182f) {
            m14778c();
            return true;
        } else if (!m14775a()) {
            return ((Boolean) C0954a.bb.m5760a()).booleanValue();
        } else {
            m14778c();
            return true;
        }
    }

    public final void m14778c() {
        C0954a.bb.m5763a(Boolean.valueOf(true));
        this.f14960c.post(new C2739e(this));
    }

    final void m14776b(C2736i c2736i) {
        if (this.f14958a.remove(c2736i) && this.f14958a.isEmpty()) {
            this.f14963f.unregisterContentObserver(this.f14961d);
        }
    }

    final void m14779c(C2736i c2736i) {
        this.f14960c.post(new C2741g(c2736i));
    }

    final void m14774a(C2743j c2743j) {
        this.f14960c.post(new C2742h(c2743j));
    }
}
