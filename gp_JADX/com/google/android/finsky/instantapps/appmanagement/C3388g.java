package com.google.android.finsky.instantapps.appmanagement;

import android.util.Log;
import com.google.android.finsky.instantapps.p214b.C3379a;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import java.util.List;

final class C3388g implements C3379a {
    public final C3396o f17369a;
    public final List f17370b;
    public final C5710a f17371c;

    C3388g(C3396o c3396o, C5710a c5710a, List list) {
        this.f17369a = c3396o;
        this.f17370b = list;
        this.f17371c = c5710a;
    }

    public final /* synthetic */ Object call() {
        String valueOf = String.valueOf(this.f17370b);
        Log.v("InstantAppBlacklister", new StringBuilder(String.valueOf(valueOf).length() + 43).append("Attempting to remove blacklisted packages: ").append(valueOf).toString());
        this.f17371c.mo5136a(2108);
        boolean a = this.f17369a.m16897a(this.f17370b);
        this.f17371c.mo5136a(2109);
        return Boolean.valueOf(a);
    }
}
