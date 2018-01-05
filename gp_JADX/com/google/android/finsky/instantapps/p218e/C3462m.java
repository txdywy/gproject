package com.google.android.finsky.instantapps.p218e;

import android.content.Context;
import android.content.SharedPreferences;

final class C3462m implements C3452a {
    public final SharedPreferences f17649a;

    C3462m(Context context) {
        this.f17649a = context.getSharedPreferences("aiaMetadata", 0);
    }

    public final void mo3532a(String str, String str2) {
        this.f17649a.edit().putString(C3462m.m17021c(str), str2).apply();
    }

    public final void mo3534b(String str, String str2) {
        this.f17649a.edit().putString(C3462m.m17022d(str), str2).apply();
    }

    public final String mo3531a(String str) {
        return this.f17649a.getString(C3462m.m17021c(str), null);
    }

    public final String mo3533b(String str) {
        return this.f17649a.getString(C3462m.m17022d(str), null);
    }

    private static String m17021c(String str) {
        return String.valueOf(str).concat("-title");
    }

    private static String m17022d(String str) {
        return String.valueOf(str).concat("-iconUrl");
    }
}
