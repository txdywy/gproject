package com.google.android.play.utils.p354b;

import android.content.Context;
import com.google.android.play.utils.b.b;
import com.google.android.play.utils.b.c;
import com.google.android.play.utils.b.d;
import com.google.android.play.utils.b.e;
import com.google.android.play.utils.b.f;
import com.google.android.play.utils.b.g;
import com.google.android.play.utils.b.h;
import com.google.android.play.utils.b.i;

public abstract class C6321a {
    public static volatile h f31569a = null;
    public final String f31570b;

    public static void m28961a(Context context, String[] strArr) {
        f31569a = new i(context.getContentResolver(), strArr);
    }

    public abstract Object m28964b();

    public static boolean m28962a() {
        return f31569a != null;
    }

    C6321a(String str) {
        this.f31570b = str;
    }

    public String toString() {
        String str = this.f31570b;
        String valueOf = String.valueOf(m28964b());
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()).append(str).append(":").append(valueOf).toString();
    }

    public static C6321a m28956a(String str, Boolean bool) {
        return new b(str, str, bool);
    }

    public static C6321a m28959a(String str, Long l) {
        return new c(str, str, l);
    }

    public static C6321a m28958a(String str, Integer num) {
        return new d(str, str, num);
    }

    public static C6321a m28957a(String str, Float f) {
        return new e(str, str, f);
    }

    public static C6321a m28960a(String str, String str2) {
        return new f(str, str, str2);
    }

    public static C6321a m28963b(String str, String str2) {
        return new g(str, str, str2);
    }
}
