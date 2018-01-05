package com.google.android.finsky.br.p166a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.dfemodel.Document;

abstract class C2164h {
    private C2164h() {
    }

    public abstract Intent mo2719a(Context context, Document document, String str);

    public abstract Intent mo2720a(Context context, String str);

    public abstract String mo2721a();

    public Intent mo2722b(Context context, Document document, String str) {
        return mo2719a(context, document, str);
    }

    protected Intent mo2723a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setPackage(mo2721a());
        C2164h.m11312a(intent, "authAccount", str2);
        return intent;
    }

    protected static final void m11312a(Intent intent, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(str, str2);
        }
    }
}
