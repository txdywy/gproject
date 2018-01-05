package com.google.android.finsky.du;

import android.content.Context;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import p002a.C0002a;

public final class C2896d implements C0983h {
    public final Context f15399a;
    public final C0002a f15400b;
    public final C0002a f15401c;
    public final C0002a f15402d;
    public final C0002a f15403e;
    public final C0002a f15404f;
    public C2719i f15405g;

    public C2896d(Context context, C0002a c0002a, C0002a c0002a2, C0002a c0002a3, C0002a c0002a4, C0002a c0002a5, C3851f c3851f) {
        this.f15399a = context;
        this.f15400b = c0002a;
        this.f15401c = c0002a2;
        this.f15402d = c0002a3;
        this.f15403e = c0002a4;
        this.f15404f = c0002a5;
        c3851f.mo3818a((C0983h) this);
    }

    public final void mo1175b(String str, boolean z) {
    }

    public final void mo1176c(String str, boolean z) {
        if (!z) {
            ((C2206c) this.f15402d.mo1a()).mo2815a(new C2897e(this, str));
        }
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }
}
