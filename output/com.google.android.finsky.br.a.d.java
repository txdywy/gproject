package com.google.android.finsky.br.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri$Builder;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.br.a.d extends com.google.android.finsky.br.a.h
{

    public final Uri a;

    d() {
        com.google.android.finsky.br.a.h(0);
        this.a = new Uri$Builder().scheme("http").authority("play.google.com").appendPath("movies").appendPath("shows").build();
    }

    private static String b(String p0, String p1) {
        if (p0.startsWith(p1))
            p0 = p0.substring(p1.length());
        return p0;
    }

    public final Intent a(Context p0, Document p1, String p2) {
        if (p1.a.f == 4)
            v0 = p1.a.B;
        else
            v0 = 0;
        v1 = new Intent("com.google.android.videos.intent.action.VIEW", Uri.parse(v0));
        v1.setPackage("com.google.android.videos");
        v1.setFlags(268451840);
        com.google.android.finsky.br.a.d.a(v1, "authAccount", p2);
        return v1;
    }

    public final Intent a(Context p0, String p1) {
        v0 = p0.getPackageManager().getLaunchIntentForPackage("com.google.android.videos");
        v0.setAction("android.intent.action.MAIN");
        v0.setFlags(268435456);
        v0.addFlags(67108864);
        com.google.android.finsky.br.a.d.a(v0, "authAccount", p1);
        return v0;
    }

    public final String a() {
        return "com.google.android.videos";
    }

    public final Intent b(Context p0, Document p1, String p2) {
        v0 = this.a(p0, p2);
        if (p1.a.e == 20) {
            v1 = Uri.parse(p1.a.w);
            v0.setData(this.a.buildUpon().appendQueryParameter("dl", "true").appendQueryParameter("v", p1.a.d).appendQueryParameter("se", com.google.android.finsky.br.a.d.b(v1.getQueryParameter("cdid"), "tvseason-")).appendQueryParameter("sh", com.google.android.finsky.br.a.d.b(v1.getQueryParameter("doc"), "tvshow-")).build());
        }
        else
            v0.putExtra("download_video_id", p1.a.d);
        return v0;
    }

}
