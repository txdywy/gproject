package com.google.android.play.article;

import android.os.Looper;
import android.support.v4.p037h.C0314i;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class C6248b {
    public static final String f31265a = C6248b.class.getSimpleName();
    public final boolean f31266b;
    public final boolean f31267c;
    public final C0314i f31268d;
    public final Map f31269e = new HashMap();
    public final Set f31270f = new HashSet();
    public final C6131i f31271g;

    public C6248b(C6133g c6133g) {
        this.f31271g = c6133g.mo5322a();
        this.f31266b = true;
        this.f31267c = false;
        this.f31268d = !this.f31266b ? null : new C6249c();
    }

    static String m28761a(String str) {
        return (TextUtils.isEmpty(str) || !str.contains("{")) ? str : str.substring(str.indexOf("{"));
    }

    public final void m28763a(String str, String str2) {
        Set<C6129j> set = (Set) this.f31269e.get(str);
        if (set != null) {
            for (C6129j a : set) {
                a.mo5319a(str2);
            }
            this.f31269e.remove(str);
        }
    }

    public static boolean m28762a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
