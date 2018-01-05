package com.google.android.finsky.br.p166a;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.dfemodel.Document;

final class C2169f extends C2164h {
    C2169f() {
        super();
    }

    public final Intent mo2719a(Context context, Document document, String str) {
        Intent intent = new Intent("com.google.android.music.PLAY");
        intent.putExtra("storeId", document.f14885a.f12097d);
        C2164h.m11312a(intent, "authAccount", str);
        intent.setFlags(268435456);
        return intent;
    }

    public final Intent mo2720a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.google.android.music");
        launchIntentForPackage.setAction("android.intent.action.VIEW");
        C2164h.m11312a(launchIntentForPackage, "authAccount", str);
        launchIntentForPackage.setFlags(268435456);
        return launchIntentForPackage;
    }

    public final String mo2721a() {
        return "com.google.android.music";
    }
}
