package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.internal.ao;
import com.google.android.gms.internal.dl;

public final class C4953f {
    public static dl f25437a = new dl("GoogleSignInCommon", new String[0]);

    static void m23054a(Context context) {
        C4966t.m23100a(context).m23108c();
        for (C5058o d : C5058o.m23308a()) {
            d.mo4556d();
        }
        synchronized (ao.f25699f) {
            if (ao.f25700g != null) {
                ao aoVar = ao.f25700g;
                aoVar.f25708l.incrementAndGet();
                aoVar.f25713q.sendMessageAtFrontOfQueue(aoVar.f25713q.obtainMessage(10));
            }
        }
    }
}
