package com.google.android.finsky.dfemodel;

import com.google.android.finsky.cv.p177a.ax;
import java.util.HashMap;
import java.util.Map;

public final class C2726q {
    public static final Map f14945a;

    public static String m14749a(String str) {
        if (str.startsWith("inapp:")) {
            return C2726q.m14756e(str);
        }
        return null;
    }

    public static String m14752b(String str) {
        if (str.startsWith("subs:")) {
            return C2726q.m14756e(str);
        }
        return null;
    }

    private static String m14756e(String str) {
        int indexOf = str.indexOf(58);
        int indexOf2 = str.indexOf(58, indexOf + 1);
        if (indexOf <= 0 || indexOf >= indexOf2 || indexOf2 >= str.length()) {
            return null;
        }
        return str.substring(indexOf + 1, indexOf2);
    }

    public static int m14754c(String str) {
        int length = str.length();
        if (length <= 0) {
            return -1;
        }
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '-' || charAt == ':') {
                Integer num = (Integer) f14945a.get(str.substring(0, i));
                return num != null ? num.intValue() : -1;
            } else {
                i++;
            }
        }
        return 3;
    }

    public static String m14755d(String str) {
        String str2 = "movie-";
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    public static ax m14747a(int i, int i2, String str) {
        ax axVar = new ax();
        axVar.f11835d = i;
        axVar.f11834c = i2;
        axVar.f11833b = str;
        return axVar;
    }

    public static boolean m14750a(int i) {
        return i == 11 || i == 66;
    }

    public static boolean m14753b(int i) {
        return i == 15 || i == 67;
    }

    public static boolean m14751a(ax axVar) {
        int i = axVar.f11835d;
        int i2 = axVar.f11834c;
        return i == 3 && (C2726q.m14750a(i2) || C2726q.m14753b(i2));
    }

    public static String m14748a(int i, String str) {
        return String.format("id-%d-%d-%s", new Object[]{Integer.valueOf(2), Integer.valueOf(i), str});
    }

    static {
        Map hashMap = new HashMap();
        f14945a = hashMap;
        hashMap.put("app", Integer.valueOf(3));
        f14945a.put("album", Integer.valueOf(2));
        f14945a.put("artist", Integer.valueOf(2));
        f14945a.put("book", Integer.valueOf(1));
        f14945a.put("device", Integer.valueOf(5));
        f14945a.put("magazine", Integer.valueOf(6));
        f14945a.put("magazineissue", Integer.valueOf(6));
        f14945a.put("newsedition", Integer.valueOf(6));
        f14945a.put("newsissue", Integer.valueOf(6));
        f14945a.put("movie", Integer.valueOf(4));
        f14945a.put("song", Integer.valueOf(2));
        f14945a.put("tvepisode", Integer.valueOf(7));
        f14945a.put("tvseason", Integer.valueOf(7));
        f14945a.put("tvshow", Integer.valueOf(7));
    }
}
