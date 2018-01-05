package com.google.android.p102c;

import android.content.ContentResolver;

public abstract class C0927i {
    public static ContentResolver f5711a = null;
    public final String f5712b;
    public final Object f5713c;

    protected C0927i(String str, Object obj) {
        this.f5712b = str;
        this.f5713c = obj;
    }

    public abstract Object mo1160a();

    public static C0927i m5664a(String str, boolean z) {
        return new C0928j(str, Boolean.valueOf(z));
    }

    public static C0927i m5662a(String str, Long l) {
        return new C0929k(str, l);
    }

    public static C0927i m5661a(String str, Integer num) {
        return new C0930l(str, num);
    }

    public static C0927i m5663a(String str, String str2) {
        return new C0931m(str, str2);
    }
}
