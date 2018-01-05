package com.google.android.finsky.br.p166a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.finsky.dfemodel.Document;

final class C2168e extends C2164h {
    public final Uri f10940a = new Builder().scheme("http").authority("play.google.com").appendPath("magazines").appendPath("reader").build();
    public final Uri f10941b = this.f10940a.buildUpon().appendPath("home").appendPath("carousel").build();
    public final Uri f10942c = this.f10940a.buildUpon().appendPath("issue").build();
    public final Uri f10943d = this.f10940a.buildUpon().appendPath("news").build();
    public final Uri f10944e = this.f10940a.buildUpon().appendPath("verify_subscription").build();

    C2168e() {
        super();
    }

    private static Intent m11331b() {
        return new Intent("android.intent.action.VIEW").setPackage("com.google.android.apps.magazines");
    }

    public final Intent mo2720a(Context context, String str) {
        Intent b = C2168e.m11331b();
        b.setData(this.f10941b);
        b.setFlags(268435456);
        b.addFlags(67108864);
        C2164h.m11312a(b, "authAccount", str);
        return b;
    }

    public final Intent mo2719a(Context context, Document document, String str) {
        Intent b = C2168e.m11331b();
        if (document.f14885a.f12098e == 15) {
            String queryParameter = Uri.parse(document.f14885a.f12116w).getQueryParameter("doc");
            b.setData(this.f10944e.buildUpon().appendPath(queryParameter.substring(queryParameter.indexOf("-") + 1)).build());
        } else if (document.f14885a.f12098e == 24 || document.f14885a.f12098e == 25) {
            b.setData(this.f10943d.buildUpon().appendPath(document.f14885a.f12097d).build());
        } else {
            b.setData(this.f10942c.buildUpon().appendPath(document.f14885a.f12097d).build());
        }
        b.setFlags(268435456);
        b.addFlags(67108864);
        C2164h.m11312a(b, "authAccount", str);
        return b;
    }

    public final String mo2721a() {
        return "com.google.android.apps.magazines";
    }
}
