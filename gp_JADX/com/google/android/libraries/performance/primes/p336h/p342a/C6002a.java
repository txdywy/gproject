package com.google.android.libraries.performance.primes.p336h.p342a;

import android.text.TextUtils;
import com.google.android.libraries.performance.primes.aa;
import com.google.android.libraries.performance.primes.au;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import d.a.a.a.a.a.at;
import d.a.a.a.a.a.bp;
import d.a.a.a.a.a.i;

public abstract class C6002a implements C5984a {
    public abstract void mo5358b(bp bpVar);

    public final void mo5248a(bp bpVar) {
        if (aa.f29616a && !TextUtils.isEmpty(bpVar.q)) {
            bpVar.c = bpVar.q;
            bpVar.q = null;
        }
        bpVar.b = TextUtils.isEmpty(bpVar.q) ? au.m27649a(bpVar.c) : null;
        bpVar.c = null;
        if (!(bpVar.j == null || bpVar.j.a == null)) {
            Long a;
            i iVar = bpVar.j.a;
            if (aa.f29616a && !TextUtils.isEmpty(iVar.d)) {
                iVar.c = iVar.d;
                iVar.d = null;
            }
            if (TextUtils.isEmpty(iVar.d)) {
                a = au.m27649a(iVar.c);
            } else {
                a = null;
            }
            iVar.b = a;
            iVar.c = null;
        }
        if (!(bpVar.i == null || bpVar.i.j == null)) {
            for (at atVar : bpVar.i.j) {
                if (!TextUtils.isEmpty(atVar.b)) {
                    String[] split = atVar.b.split("/+");
                    atVar.c = new long[split.length];
                    for (int i = 0; i < split.length; i++) {
                        atVar.c[i] = au.m27649a(split[i]).longValue();
                    }
                }
                atVar.b = null;
            }
        }
        mo5358b(bpVar);
    }
}
