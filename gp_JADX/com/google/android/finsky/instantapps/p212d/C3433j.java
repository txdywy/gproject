package com.google.android.finsky.instantapps.p212d;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.google.android.finsky.instantapps.appmanagement.C3394m;
import com.google.android.finsky.instantapps.p218e.C3453i;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p221d.p222a.af;
import p000c.p001a.C0000a;

public final class C3433j {
    public final C0000a f17570a;
    public final C0000a f17571b;
    public final C0000a f17572c;
    public final C0000a f17573d;
    public final C0000a f17574e;
    public final C0000a f17575f;
    public final C0000a f17576g;
    public final C0000a f17577h;
    public final C0000a f17578i;

    public C3433j(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4, C0000a c0000a5, C0000a c0000a6, C0000a c0000a7, C0000a c0000a8, C0000a c0000a9) {
        this.f17570a = (C0000a) C3433j.m16977a((Object) c0000a, 1);
        this.f17571b = (C0000a) C3433j.m16977a((Object) c0000a2, 2);
        this.f17572c = (C0000a) C3433j.m16977a((Object) c0000a3, 3);
        this.f17573d = (C0000a) C3433j.m16977a((Object) c0000a4, 4);
        this.f17574e = (C0000a) C3433j.m16977a((Object) c0000a5, 5);
        this.f17575f = (C0000a) C3433j.m16977a((Object) c0000a6, 6);
        this.f17576g = (C0000a) C3433j.m16977a((Object) c0000a7, 7);
        this.f17577h = (C0000a) C3433j.m16977a((Object) c0000a8, 8);
        this.f17578i = (C0000a) C3433j.m16977a((Object) c0000a9, 9);
    }

    public final C3425c m16978a(Activity activity, af afVar) {
        bf bfVar = (bf) C3433j.m16977a((bf) this.f17570a.mo1a(), 1);
        bf bfVar2 = (bf) C3433j.m16977a((bf) this.f17571b.mo1a(), 2);
        C3394m c3394m = (C3394m) C3433j.m16977a((C3394m) this.f17572c.mo1a(), 3);
        C5785k c5785k = (C5785k) C3433j.m16977a((C5785k) this.f17573d.mo1a(), 4);
        PackageManager packageManager = (PackageManager) C3433j.m16977a((PackageManager) this.f17574e.mo1a(), 5);
        C3600b c3600b = (C3600b) C3433j.m16977a((C3600b) this.f17575f.mo1a(), 6);
        C3453i c3453i = (C3453i) C3433j.m16977a((C3453i) this.f17576g.mo1a(), 7);
        C3433j.m16977a((C3422a) this.f17577h.mo1a(), 8);
        C3433j.m16977a((am) this.f17578i.mo1a(), 9);
        return new C3425c(bfVar, bfVar2, c3394m, c5785k, packageManager, c3600b, c3453i, (Activity) C3433j.m16977a((Object) activity, 10), (af) C3433j.m16977a((Object) afVar, 11));
    }

    private static Object m16977a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
