package com.google.android.finsky.zapp;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

public final class C4854m {
    public final Context f25155a;

    C4854m(Context context) {
        this.f25155a = context;
    }

    final String m22692a(C4843a c4843a) {
        File b = m22694b(c4843a);
        if (b.exists()) {
            return b.getAbsolutePath();
        }
        return null;
    }

    final C4843a m22690a(String str) {
        String b = C4843a.m22650b(str);
        SharedPreferences b2 = m22693b();
        if (!b2.contains(b)) {
            return null;
        }
        C4843a a = C4843a.m22649a(b2.getString(b, null));
        if (a != null) {
            return a;
        }
        return null;
    }

    final File m22694b(C4843a c4843a) {
        return new File(m22691a(), C4854m.m22689c(c4843a));
    }

    final File m22691a() {
        File dir = this.f25155a.getDir("zapp_modules", 0);
        dir.mkdir();
        if (dir.isDirectory()) {
            return dir;
        }
        dir.delete();
        if (dir.mkdir()) {
            return dir;
        }
        return null;
    }

    static String m22689c(C4843a c4843a) {
        return C4854m.m22688a(c4843a.f25120a, c4843a.f25121b);
    }

    static String m22688a(String str, String str2) {
        return new StringBuilder((String.valueOf(str).length() + 8) + String.valueOf(str2).length()).append("dl-").append(str).append("-").append(str2).append(".apk").toString();
    }

    final SharedPreferences m22693b() {
        return this.f25155a.getSharedPreferences("AndroidDynamicModules", 0);
    }
}
