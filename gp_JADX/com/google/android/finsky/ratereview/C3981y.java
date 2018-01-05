package com.google.android.finsky.ratereview;

import android.content.Context;
import android.net.Uri;

public final class C3981y {
    public final Context f20071a;

    public C3981y(Context context) {
        this.f20071a = context;
    }

    static String m18698a(String str, String str2) {
        String valueOf = String.valueOf(str2);
        String valueOf2 = String.valueOf(Uri.encode(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
