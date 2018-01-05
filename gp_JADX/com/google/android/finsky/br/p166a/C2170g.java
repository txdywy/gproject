package com.google.android.finsky.br.p166a;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.dfemodel.Document;

final class C2170g extends C2164h {
    C2170g() {
        super();
    }

    public final Intent mo2719a(Context context, Document document, String str) {
        return m11338a(str);
    }

    public final Intent mo2720a(Context context, String str) {
        return m11338a(str);
    }

    protected final Intent mo2723a(String str, String str2) {
        return m11338a(str2);
    }

    private final Intent m11338a(String str) {
        Intent intent = new Intent("android.intent.action.MAIN");
        C2164h.m11312a(intent, "authAccount", str);
        intent.setFlags(268435456);
        intent.setPackage(mo2721a());
        return intent;
    }

    public final String mo2721a() {
        return "com.google.android.play.games";
    }
}
