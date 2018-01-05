package com.google.android.finsky.wear;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import java.util.ArrayList;

final class ad implements Runnable {
    public final /* synthetic */ C1254c f24771a;
    public final /* synthetic */ String f24772b;
    public final /* synthetic */ int f24773c;
    public final /* synthetic */ ArrayList f24774d;
    public final /* synthetic */ C0660x f24775e;
    public final /* synthetic */ C0657w f24776f;

    ad(C1254c c1254c, String str, int i, ArrayList arrayList, C0660x c0660x, C0657w c0657w) {
        this.f24771a = c1254c;
        this.f24772b = str;
        this.f24773c = i;
        this.f24774d = arrayList;
        this.f24775e = c0660x;
        this.f24776f = c0657w;
    }

    public final void run() {
        this.f24771a.mo1582a(this.f24772b, this.f24773c, this.f24774d, new int[0], new int[0], this.f24775e, this.f24776f);
    }
}
