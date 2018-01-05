package com.google.android.finsky.br.p166a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.Document;

final class C2165b extends C2164h {
    public final /* synthetic */ C2163a f10937a;

    C2165b(C2163a c2163a) {
        this.f10937a = c2163a;
        super();
    }

    public final Intent mo2720a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.books");
        launchIntentForPackage.setAction("android.intent.action.MAIN");
        launchIntentForPackage.setFlags(268435456);
        C2164h.m11312a(launchIntentForPackage, "authAccount", str);
        return launchIntentForPackage;
    }

    public final Intent mo2719a(Context context, Document document, String str) {
        String str2;
        boolean z = this.f10937a.f10927g.dj().mo2294a(12633045) && document.f14885a.f12098e == 64;
        if (z) {
            str2 = "https://play.google.com/books/ab";
        } else {
            str2 = (String) C0955b.f5905u.m28964b();
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2).buildUpon().appendQueryParameter("id", document.f14885a.f12097d).build());
        intent.setPackage("com.google.android.apps.books");
        C2164h.m11312a(intent, "authAccount", str);
        if (z) {
            intent.putExtra("android.intent.extra.START_PLAYBACK", true);
        }
        if (this.f10937a.f10930j.m11647a(document, this.f10937a.f10924d)) {
            intent.setFlags(268435456);
        } else {
            intent.putExtra("preview", true);
        }
        for (bl blVar : document.f14885a.f12107n) {
            boolean z2;
            if ((blVar.f11912b & 512) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                intent.putExtra("offerType", blVar.f11926p);
                break;
            }
        }
        intent.putExtra("books:addToMyEBooks", false);
        return intent;
    }

    public final String mo2721a() {
        return "com.google.android.apps.books";
    }
}
