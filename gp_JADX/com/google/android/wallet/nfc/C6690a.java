package com.google.android.wallet.nfc;

import android.text.TextUtils;

public final class C6690a {
    public final String f33022a;
    public final int f33023b;
    public final int f33024c;
    public final String f33025d;

    public C6690a(String str, int i, int i2, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f33022a = str;
        this.f33023b = i;
        this.f33024c = i2;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        this.f33025d = str2;
    }

    public final boolean m30326a() {
        return !TextUtils.isEmpty(this.f33022a);
    }

    public final boolean m30327b() {
        return (this.f33023b == 0 || this.f33024c == 0) ? false : true;
    }

    public final boolean m30328c() {
        return !TextUtils.isEmpty(this.f33025d);
    }
}
