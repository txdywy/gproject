package com.google.android.finsky.br.a;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.br.a.g extends com.google.android.finsky.br.a.h
{

    g() {
        com.google.android.finsky.br.a.h(0);
    }

    private final Intent a(String p0) {
        v0 = new Intent("android.intent.action.MAIN");
        com.google.android.finsky.br.a.g.a(v0, "authAccount", p0);
        v0.setFlags(268435456);
        v0.setPackage(this.a());
        return v0;
    }

    public final Intent a(Context p0, Document p1, String p2) {
        return this.a(p2);
    }

    public final Intent a(Context p0, String p1) {
        return this.a(p1);
    }

    protected final Intent a(String p0, String p1) {
        return this.a(p1);
    }

    public final String a() {
        return "com.google.android.play.games";
    }

}
