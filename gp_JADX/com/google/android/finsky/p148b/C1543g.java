package com.google.android.finsky.p148b;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.C0690f;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;

final class C1543g implements Runnable {
    public final /* synthetic */ Context f8294a;
    public final /* synthetic */ Document f8295b;
    public final /* synthetic */ String f8296c;
    public final /* synthetic */ String f8297d;
    public final /* synthetic */ String f8298e;
    public final /* synthetic */ int f8299f;
    public final /* synthetic */ C1542f f8300g;

    C1543g(C1542f c1542f, Context context, Document document, String str, String str2, String str3, int i) {
        this.f8300g = c1542f;
        this.f8294a = context;
        this.f8295b = document;
        this.f8296c = str;
        this.f8297d = str2;
        this.f8298e = str3;
        this.f8299f = i;
    }

    public final void run() {
        C1542f c1542f = this.f8300g;
        Context context = this.f8294a;
        Document document = this.f8295b;
        String a = this.f8300g.m8972a(this.f8294a, this.f8296c, this.f8297d, this.f8298e);
        int i = this.f8299f;
        if (TextUtils.isEmpty(a)) {
            FinskyLog.m21667d("Empty URL for docid: %s", document.f14885a.f12096c);
            return;
        }
        C1545i c1545i = c1542f.f8288a;
        C1540d c1540d = new C1540d(a, c1545i.f8309c);
        c1542f.f8293f.m4510a(new C1541e(context, a, c1540d, new C1537a(document, a, i, c1545i.f8307a, c1545i.f8308b, c1545i.f8309c, c1545i.f8310d), new C0690f(2500, 1, 1.0f), c1545i.f8309c));
    }
}
