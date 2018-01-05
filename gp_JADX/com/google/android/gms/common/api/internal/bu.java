package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.p037h.C0305a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class bu extends Fragment implements bg {
    public static WeakHashMap f25773a = new WeakHashMap();
    public Map f25774b = new C0305a();
    public int f25775c = 0;
    public Bundle f25776d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.internal.bu m23495a(android.support.v4.app.C0254u r3) {
        /*
        r0 = f25773a;
        r0 = r0.get(r3);
        r0 = (java.lang.ref.WeakReference) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r0.get();
        r0 = (com.google.android.gms.common.api.internal.bu) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r3.H_();	 Catch:{ ClassCastException -> 0x0046 }
        r1 = "SupportLifecycleFragmentImpl";
        r0 = r0.mo283a(r1);	 Catch:{ ClassCastException -> 0x0046 }
        r0 = (com.google.android.gms.common.api.internal.bu) r0;	 Catch:{ ClassCastException -> 0x0046 }
        if (r0 == 0) goto L_0x0025;
    L_0x0021:
        r1 = r0.f765v;
        if (r1 == 0) goto L_0x003b;
    L_0x0025:
        r0 = new com.google.android.gms.common.api.internal.bu;
        r0.<init>();
        r1 = r3.H_();
        r1 = r1.mo284a();
        r2 = "SupportLifecycleFragmentImpl";
        r1 = r1.mo328a(r0, r2);
        r1.mo336d();
    L_0x003b:
        r1 = f25773a;
        r2 = new java.lang.ref.WeakReference;
        r2.<init>(r0);
        r1.put(r3, r2);
        goto L_0x0012;
    L_0x0046:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.bu.a(android.support.v4.app.u):com.google.android.gms.common.api.internal.bu");
    }

    public final LifecycleCallback mo4586a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f25774b.get(str));
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        super.mo2342a(i, i2, intent);
        for (LifecycleCallback a : this.f25774b.values()) {
            a.mo4594a(i, i2, intent);
        }
    }

    public final void mo4587a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f25774b.containsKey(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
        }
        this.f25774b.put(str, lifecycleCallback);
        if (this.f25775c > 0) {
            new Handler(Looper.getMainLooper()).post(new bv(this, lifecycleCallback, str));
        }
    }

    public final void mo4590a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo4590a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f25774b.values()) {
            a.mo4600a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f25775c = 1;
        this.f25776d = bundle;
        for (Entry entry : this.f25774b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo4595a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final /* synthetic */ Activity cv_() {
        return m603h();
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        if (bundle != null) {
            for (Entry entry : this.f25774b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo4597b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void g_() {
        super.g_();
        this.f25775c = 2;
        for (LifecycleCallback b : this.f25774b.values()) {
            b.mo4596b();
        }
    }

    public final void h_() {
        super.h_();
        this.f25775c = 4;
        for (LifecycleCallback d : this.f25774b.values()) {
            d.mo4598d();
        }
    }

    public final void mo979u() {
        super.mo979u();
        this.f25775c = 3;
        for (LifecycleCallback c : this.f25774b.values()) {
            c.mo4605c();
        }
    }

    public final void mo1346w() {
        super.mo1346w();
        this.f25775c = 5;
        Iterator it = this.f25774b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
