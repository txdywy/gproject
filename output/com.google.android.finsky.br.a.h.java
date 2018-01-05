package com.google.android.finsky.br.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.dfemodel.Document;

public class com.google.android.finsky.br.a.h
{

    h() {
    }

    h(byte p0) {
        com.google.android.finsky.br.a.h();
    }

    protected static final void a(Intent p0, String p1, String p2) {
        if (!TextUtils.isEmpty(p2))
            p0.putExtra(p1, p2);
    }

    public abstract Intent a(Context p0, Document p1, String p2);

    public abstract Intent a(Context p0, String p1);

    protected Intent a(String p0, String p1) {
        v0 = new Intent("android.intent.action.VIEW");
        v0.setData(Uri.parse(p0));
        v0.setPackage(this.a());
        com.google.android.finsky.br.a.h.a(v0, "authAccount", p1);
        return v0;
    }

    public abstract String a();

    public Intent b(Context p0, Document p1, String p2) {
        return this.a(p0, p1, p2);
    }

}
