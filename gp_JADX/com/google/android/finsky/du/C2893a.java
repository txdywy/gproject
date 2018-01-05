package com.google.android.finsky.du;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.cx.C1000f;
import com.google.android.finsky.cx.C2460b;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import p002a.C0002a;

public final class C2893a implements C1000f, C0983h {
    public final Context f15392a;
    public final C2460b f15393b;
    public final C0002a f15394c;
    public final C0002a f15395d;

    public C2893a(Context context, C0002a c0002a, C0002a c0002a2, C3851f c3851f, C2460b c2460b) {
        this.f15392a = context;
        this.f15394c = c0002a;
        this.f15395d = c0002a2;
        this.f15393b = c2460b;
        c3851f.mo3818a((C0983h) this);
        this.f15393b.m13163a(this);
    }

    public final void mo1175b(String str, boolean z) {
    }

    public final void mo1176c(String str, boolean z) {
        if (!z) {
            ((C3646a) this.f15395d.mo1a()).m17248a(new C2894b(this, str));
        }
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }

    public final void mo1212b(String str) {
    }

    public final void mo1208a(String str, boolean z) {
        if (z) {
            new Handler(Looper.getMainLooper()).post(new C2895c(this));
        }
    }
}
