package com.google.android.finsky.br.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri$Builder;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.br.a.e extends com.google.android.finsky.br.a.h
{

    public final Uri a;
    public final Uri b;
    public final Uri c;
    public final Uri d;
    public final Uri e;

    e() {
        com.google.android.finsky.br.a.h(0);
        this.a = new Uri$Builder().scheme("http").authority("play.google.com").appendPath("magazines").appendPath("reader").build();
        this.b = this.a.buildUpon().appendPath("home").appendPath("carousel").build();
        this.c = this.a.buildUpon().appendPath("issue").build();
        this.d = this.a.buildUpon().appendPath("news").build();
        this.e = this.a.buildUpon().appendPath("verify_subscription").build();
    }

    private static Intent b() {
        return new Intent("android.intent.action.VIEW").setPackage("com.google.android.apps.magazines");
    }

    public final Intent a(Context p0, Document p1, String p2) {
        v0 = com.google.android.finsky.br.a.e.b();
        if (p1.a.e == 15) {
            v1 = Uri.parse(p1.a.w).getQueryParameter("doc");
            v0.setData(this.e.buildUpon().appendPath(v1.substring(v1.indexOf("-") + 1)).build());
        }
        else if (p1.a.e == 24 || p1.a.e == 25)
            v0.setData(this.d.buildUpon().appendPath(p1.a.d).build());
        else
            v0.setData(this.c.buildUpon().appendPath(p1.a.d).build());
        v0.setFlags(268435456);
        v0.addFlags(67108864);
        com.google.android.finsky.br.a.e.a(v0, "authAccount", p2);
        return v0;
    }

    public final Intent a(Context p0, String p1) {
        v0 = com.google.android.finsky.br.a.e.b();
        v0.setData(this.b);
        v0.setFlags(268435456);
        v0.addFlags(67108864);
        com.google.android.finsky.br.a.e.a(v0, "authAccount", p1);
        return v0;
    }

    public final String a() {
        return "com.google.android.apps.magazines";
    }

}
