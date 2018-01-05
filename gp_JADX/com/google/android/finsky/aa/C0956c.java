package com.google.android.finsky.aa;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

public final class C0956c {
    public static Context f5911a;
    public final String f5912b;
    public final int f5913c = 0;

    public C0956c(String str) {
        HashSet hashSet = new HashSet();
        this.f5912b = str;
    }

    public final SharedPreferences m5749a() {
        return f5911a.getSharedPreferences(this.f5912b, this.f5913c);
    }

    public final void m5759b() {
        m5749a().edit().clear().commit();
    }

    public final C0957n m5752a(String str, Long l) {
        return new C0958d(this, str, l);
    }

    public final C0957n m5753a(String str, String str2) {
        return new C0959e(this, str, str2);
    }

    public final C0957n m5754a(String str, Set set) {
        return new C0960f(this, str, set);
    }

    public final C0957n m5750a(String str, Boolean bool) {
        return new C0961g(this, str, bool);
    }

    public final C0957n m5751a(String str, Integer num) {
        return new C0962h(this, str, num);
    }

    public final C0963m m5757b(String str, Long l) {
        return new C0964i(this, this, str, l);
    }

    public final C0963m m5758b(String str, String str2) {
        return new C0965j(this, this, str, str2);
    }

    public final C0963m m5755b(String str, Boolean bool) {
        return new C0966k(this, this, str, bool);
    }

    public final C0963m m5756b(String str, Integer num) {
        return new C0967l(this, this, str, num);
    }
}
