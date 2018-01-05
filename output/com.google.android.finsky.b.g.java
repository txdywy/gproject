package com.google.android.finsky.b;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.f;
import com.android.volley.r;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.b.g implements Runnable
{

    public final Context a;
    public final Document b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final com.google.android.finsky.b.f g;

    g(com.google.android.finsky.b.f p0, Context p1, Document p2, String p3, String p4, String p5, int p6) {
        this.g = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
    }

    public final void run() {
        v2 = this.g.a(this.a, this.c, this.d, this.e);
        if (TextUtils.isEmpty(v2)) {
            v2 = new Object[1];
            v2[0] = this.b.a.c;
            FinskyLog.d("Empty URL for docid: %s", v2);
        }
        else {
            v12 = new com.google.android.finsky.b.e;
            v12.<init>(this.a, v2, new com.google.android.finsky.b.d(v2, this.g.a.c), new com.google.android.finsky.b.a(this.b, v2, this.f, this.g.a.a, this.g.a.b, this.g.a.c, this.g.a.d), new com.android.volley.f(2500, 1, 1065353216), this.g.a.c);
            this.g.f.a(v12);
        }
    }

}
