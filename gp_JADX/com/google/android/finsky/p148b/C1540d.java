package com.google.android.finsky.p148b;

import com.android.volley.C0660x;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;

final class C1540d implements C0660x {
    public final C1463g f8284a;
    public final String f8285b;

    C1540d(String str, C1463g c1463g) {
        this.f8285b = str;
        this.f8284a = c1463g;
    }

    public final /* synthetic */ void b_(Object obj) {
        FinskyLog.m21667d("URL[%s] was not redirected.", FinskyLog.m21655a(this.f8285b));
        this.f8284a.dc().m13327a(new C2474c(1107).m13210a(2).f13342a);
    }
}
