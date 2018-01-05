package com.google.android.finsky.br.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri$Builder;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.br.a.b extends com.google.android.finsky.br.a.h
{

    public final com.google.android.finsky.br.a.a a;

    b(com.google.android.finsky.br.a.a p0) {
        this.a = p0;
        com.google.android.finsky.br.a.h(0);
    }

    public final Intent a(Context p0, Document p1, String p2) {
        if (this.a.g.dj().a(12633045) && p1.a.e == 64)
            v3 = 1;
        else
            v3 = 0;
        if (v3 != 0)
            v0 = "https://play.google.com/books/ab";
        else
            v0 = (String)com.google.android.finsky.aa.b.u.b();
        v4 = new Intent("android.intent.action.VIEW", Uri.parse(v0).buildUpon().appendQueryParameter("id", p1.a.d).build());
        v4.setPackage("com.google.android.apps.books");
        com.google.android.finsky.br.a.b.a(v4, "authAccount", p2);
        if (v3 != 0)
            v4.putExtra("android.intent.extra.START_PLAYBACK", 1);
        if (this.a.j.a(p1, this.a.d))
            v4.setFlags(268435456);
        else
            v4.putExtra("preview", 1);
        v3 = 0;
        while (true) {
            if (v3 >= p1.a.n.length) {
                v4.putExtra("books:addToMyEBooks", 0);
                return v4;
            }
            if (p1.a.n[v3].b & 512)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0)
                break;
            v3 = v3 + 1;
        }
        v4.putExtra("offerType", p1.a.n[v3].p);
        v4.putExtra("books:addToMyEBooks", 0);
        return v4;
    }

    public final Intent a(Context p0, String p1) {
        v0 = p0.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.books");
        v0.setAction("android.intent.action.MAIN");
        v0.setFlags(268435456);
        com.google.android.finsky.br.a.b.a(v0, "authAccount", p1);
        return v0;
    }

    public final String a() {
        return "com.google.android.apps.books";
    }

}
