package com.google.android.finsky.volley.p263a;

import android.content.Context;
import android.net.Uri;
import com.android.volley.C0684b;
import com.android.volley.C0700r;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.volley.C1470a;
import com.google.android.finsky.volley.C4774e;
import p002a.C0002a;

public final class C4775b implements C4774e {
    public final Context f24726a;
    public final C1461c f24727b;
    public final C0002a f24728c;
    public final C0002a f24729d;
    public final C1470a f24730e;
    public final C0002a f24731f;
    public final C0002a f24732g;
    public final C0002a f24733h;
    public final C0002a f24734i;
    public final C0988c f24735j;

    public C4775b(Context context, C1461c c1461c, C0002a c0002a, C0988c c0988c, C0002a c0002a2, C0002a c0002a3, C0002a c0002a4, C1470a c1470a, C0002a c0002a5, C0002a c0002a6) {
        this.f24726a = context;
        this.f24727b = c1461c;
        this.f24728c = c0002a;
        this.f24735j = c0988c;
        this.f24730e = c1470a;
        this.f24733h = c0002a2;
        this.f24734i = c0002a3;
        this.f24729d = c0002a4;
        this.f24731f = c0002a5;
        this.f24732g = c0002a6;
    }

    public final void mo4380a(Runnable runnable, String str) {
        int i = 2;
        boolean a = this.f24727b.dj().mo2294a(12628818);
        if (a) {
            i = 1;
        }
        Runnable c4776c = new C4776c(i, runnable);
        ((C0700r) this.f24731f.mo1a()).m4510a(C4773a.m22387a(this.f24730e.dl(), c4776c));
        m22391b(str);
        if (!a) {
            ((C0700r) this.f24732g.mo1a()).m4510a(C4773a.m22387a(this.f24730e.dm(), c4776c));
        }
        ((C2531s) this.f24729d.mo1a()).m13479a(this.f24726a);
        this.f24729d.mo1a();
        C2531s.m13476b(str);
    }

    public final void mo4382b(Runnable runnable, String str) {
        ((C0700r) this.f24731f.mo1a()).m4510a(C4773a.m22387a(this.f24730e.dl(), runnable));
        m22391b(str);
        ((C2531s) this.f24729d.mo1a()).m13479a(this.f24726a);
        this.f24729d.mo1a();
        C2531s.m13476b(str);
    }

    public final boolean mo4381a(String str) {
        C1254c a = ((C1287h) this.f24728c.mo1a()).mo2015a();
        String a2 = ((C1289l) this.f24734i.mo1a()).m7699a(Uri.withAppendedPath(((C1289l) this.f24734i.mo1a()).f7683b, str).toString(), this.f24735j.cZ(), a.mo1646e(), a.mo1650f(), null);
        new Object[1][0] = a2;
        C0684b a3 = this.f24730e.dl().mo1064a(a2);
        return (a3 == null || a3.m4487a()) ? false : true;
    }

    private final void m22391b(String str) {
        ((C2482j) this.f24733h.mo1a()).m13319a(new C2474c(14).m13244b(str).f13342a, null);
    }
}
