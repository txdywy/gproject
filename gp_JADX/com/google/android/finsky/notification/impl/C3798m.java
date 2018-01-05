package com.google.android.finsky.notification.impl;

import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.google.android.finsky.utils.ai;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import org.tensorflow.a.a.b;
import org.tensorflow.a.a.c;

public final class C3798m {
    public static final Integer[] f19079c = new Integer[]{Integer.valueOf(900), Integer.valueOf(903), Integer.valueOf(904)};
    public static final Integer[] f19080d = new Integer[]{Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6)};
    public static final Integer[] f19081e = new Integer[]{Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(17), Integer.valueOf(18), Integer.valueOf(19), Integer.valueOf(20), Integer.valueOf(21), Integer.valueOf(22), Integer.valueOf(23)};
    public static final String[] f19082f = new String[]{"us", "gb", "ru", "jp", "br", "es", "id", "fr", "it", "de", "kr", "tr", "in", "ae", "th", "tw", "mx", "pl", "ca", "vn"};
    public static final Integer[] f19083g = new Integer[]{Integer.valueOf(0), Integer.valueOf(1)};
    public static final float[] f19084h = new float[]{17.0f, 22.0f, 24.0f};
    public static final float[] f19085i = new float[]{1.0f};
    public static final float[] f19086j = new float[]{5.0f, 15.0f, 25.0f, 35.0f, 50.0f, 75.0f};
    public ai f19087a;
    public TelephonyManager f19088b;

    public C3798m(ai aiVar, TelephonyManager telephonyManager) {
        this.f19087a = aiVar;
        this.f19088b = telephonyManager;
    }

    static void m18156a(Map map, String str, int i, ArrayList arrayList) {
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = new float[1][];
            obj[0] = new float[]{0.0f};
            String stringBuilder = new StringBuilder(String.valueOf(str).length() + 11).append(str).append(i).toString();
            if (map.containsKey(stringBuilder)) {
                c cVar;
                float[] fArr = obj[0];
                b bVar = (b) map.get(stringBuilder);
                if (bVar.a == 1) {
                    cVar = bVar.c;
                } else {
                    cVar = null;
                }
                fArr[0] = cVar.a[0];
            }
            arrayList.add(obj);
        }
    }

    static void m18152a(int i, Map map) {
        C3798m.m18154a("notification_type_", f19079c, Integer.valueOf(i), map);
    }

    static void m18155a(Map map) {
        C3798m.m18154a("day_of_week_", f19080d, Integer.valueOf(Calendar.getInstance().get(7) - 1), map);
    }

    static void m18157b(Map map) {
        Calendar instance = Calendar.getInstance();
        C3798m.m18154a("hour_of_day_", f19081e, Integer.valueOf((instance.get(13) + ((instance.get(11) * 3600) + (instance.get(12) * 60))) / 3600), map);
    }

    static void m18158c(Map map) {
        C3798m.m18153a("sdk_version_", f19084h, (float) VERSION.SDK_INT, map);
    }

    private static b m18151a() {
        float[] fArr = new float[]{1.0f};
        b bVar = new b();
        c cVar = new c();
        cVar.a = fArr;
        bVar.a = -1;
        bVar.a = 1;
        bVar.c = cVar;
        return bVar;
    }

    static void m18154a(String str, Object[] objArr, Object obj, Map map) {
        int length = objArr.length;
        int i = 0;
        while (i < objArr.length) {
            if (objArr[i].equals(obj)) {
                break;
            }
            i++;
        }
        i = length;
        map.put(new StringBuilder(String.valueOf(str).length() + 11).append(str).append(i).toString(), C3798m.m18151a());
    }

    static void m18153a(String str, float[] fArr, float f, Map map) {
        int i = 0;
        while (i < fArr.length && f >= fArr[i]) {
            i++;
        }
        map.put(new StringBuilder(String.valueOf(str).length() + 11).append(str).append(i).toString(), C3798m.m18151a());
    }
}
