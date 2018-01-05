package com.google.android.finsky.br.p166a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.finsky.dfemodel.Document;

final class C2167d extends C2164h {
    public final Uri f10939a = new Builder().scheme("http").authority("play.google.com").appendPath("movies").appendPath("shows").build();

    C2167d() {
        super();
    }

    public final Intent mo2720a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.google.android.videos");
        launchIntentForPackage.setAction("android.intent.action.MAIN");
        launchIntentForPackage.setFlags(268435456);
        launchIntentForPackage.addFlags(67108864);
        C2164h.m11312a(launchIntentForPackage, "authAccount", str);
        return launchIntentForPackage;
    }

    public final Intent mo2722b(Context context, Document document, String str) {
        Intent a = mo2720a(context, str);
        if (document.f14885a.f12098e == 20) {
            Uri parse = Uri.parse(document.f14885a.f12116w);
            a.setData(this.f10939a.buildUpon().appendQueryParameter("dl", "true").appendQueryParameter("v", document.f14885a.f12097d).appendQueryParameter("se", C2167d.m11326b(parse.getQueryParameter("cdid"), "tvseason-")).appendQueryParameter("sh", C2167d.m11326b(parse.getQueryParameter("doc"), "tvshow-")).build());
        } else {
            a.putExtra("download_video_id", document.f14885a.f12097d);
        }
        return a;
    }

    public final Intent mo2719a(Context context, Document document, String str) {
        String str2;
        if (document.f14885a.f12099f == 4) {
            str2 = document.f14885a.f12085B;
        } else {
            str2 = null;
        }
        Intent intent = new Intent("com.google.android.videos.intent.action.VIEW", Uri.parse(str2));
        intent.setPackage("com.google.android.videos");
        intent.setFlags(268451840);
        C2164h.m11312a(intent, "authAccount", str);
        return intent;
    }

    public final String mo2721a() {
        return "com.google.android.videos";
    }

    private static String m11326b(String str, String str2) {
        if (str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return str;
    }
}
