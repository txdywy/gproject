package com.google.android.finsky.br.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.br.a.f extends com.google.android.finsky.br.a.h
{

    f() {
        com.google.android.finsky.br.a.h(0);
    }

    public final Intent a(Context p0, Document p1, String p2) {
        v0 = new Intent("com.google.android.music.PLAY");
        v0.putExtra("storeId", p1.a.d);
        com.google.android.finsky.br.a.f.a(v0, "authAccount", p2);
        v0.setFlags(268435456);
        return v0;
    }

    public final Intent a(Context p0, String p1) {
        v0 = p0.getPackageManager().getLaunchIntentForPackage("com.google.android.music");
        v0.setAction("android.intent.action.VIEW");
        com.google.android.finsky.br.a.f.a(v0, "authAccount", p1);
        v0.setFlags(268435456);
        return v0;
    }

    public final String a() {
        return "com.google.android.music";
    }

}
