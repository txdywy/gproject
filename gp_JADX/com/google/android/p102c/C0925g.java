package com.google.android.p102c;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class C0925g {
    public static final Uri f5698a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri f5699b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern f5700c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern f5701d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean f5702e = new AtomicBoolean();
    public static HashMap f5703f;
    public static final HashMap f5704g = new HashMap();
    public static final HashMap f5705h = new HashMap();
    public static final HashMap f5706i = new HashMap();
    public static final HashMap f5707j = new HashMap();
    public static Object f5708k;
    public static boolean f5709l;
    public static String[] f5710m = new String[0];

    private static void m5658b(ContentResolver contentResolver) {
        if (f5703f == null) {
            f5702e.set(false);
            f5703f = new HashMap();
            f5708k = new Object();
            f5709l = false;
            contentResolver.registerContentObserver(f5698a, true, new C0926h());
        } else if (f5702e.getAndSet(false)) {
            f5703f.clear();
            f5704g.clear();
            f5705h.clear();
            f5706i.clear();
            f5707j.clear();
            f5708k = new Object();
            f5709l = false;
        }
    }

    public static String m5653a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C0925g.class) {
            C0925g.m5658b(contentResolver);
            Object obj = f5708k;
            String str3;
            if (f5703f.containsKey(str)) {
                str3 = (String) f5703f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                String[] strArr = f5710m;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (str.startsWith(strArr[i])) {
                        if (!f5709l || f5703f.isEmpty()) {
                            C0925g.m5660c(contentResolver, f5710m);
                            if (f5703f.containsKey(str)) {
                                str3 = (String) f5703f.get(str);
                                if (str3 != null) {
                                    str2 = str3;
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
                Cursor query = contentResolver.query(f5698a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            if (str3 != null && str3.equals(str2)) {
                                str3 = str2;
                            }
                            C0925g.m5655a(obj, str, str3);
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (query != null) {
                                query.close();
                            }
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            query.close();
                        }
                    }
                }
                C0925g.m5655a(obj, str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    private static void m5655a(Object obj, String str, String str2) {
        synchronized (C0925g.class) {
            if (obj == f5708k) {
                f5703f.put(str, str2);
            }
        }
    }

    public static int m5649a(ContentResolver contentResolver, String str, int i) {
        Object a = C0925g.m5651a(contentResolver);
        Object obj = (Integer) C0925g.m5652a(f5705h, str, Integer.valueOf(i));
        if (obj != null) {
            return obj.intValue();
        }
        String a2 = C0925g.m5653a(contentResolver, str, null);
        if (a2 != null) {
            try {
                int parseInt = Integer.parseInt(a2);
                obj = Integer.valueOf(parseInt);
                i = parseInt;
            } catch (NumberFormatException e) {
            }
        }
        C0925g.m5656a(a, f5705h, str, obj);
        return i;
    }

    public static float m5648a(ContentResolver contentResolver, String str) {
        Object a = C0925g.m5651a(contentResolver);
        Float f = (Float) C0925g.m5652a(f5707j, str, Float.valueOf(0.95f));
        if (f != null) {
            return f.floatValue();
        }
        Object obj;
        float f2;
        String a2 = C0925g.m5653a(contentResolver, str, null);
        if (a2 == null) {
            obj = f;
            f2 = 0.95f;
        } else {
            Float valueOf;
            try {
                float parseFloat = Float.parseFloat(a2);
                valueOf = Float.valueOf(parseFloat);
                f2 = parseFloat;
            } catch (NumberFormatException e) {
                valueOf = f;
                f2 = 0.95f;
            }
        }
        C0925g.m5656a(a, f5707j, str, obj);
        return f2;
    }

    public static long m5650a(ContentResolver contentResolver, String str, long j) {
        Object a = C0925g.m5651a(contentResolver);
        Object obj = (Long) C0925g.m5652a(f5706i, str, Long.valueOf(j));
        if (obj != null) {
            return obj.longValue();
        }
        String a2 = C0925g.m5653a(contentResolver, str, null);
        if (a2 != null) {
            try {
                long parseLong = Long.parseLong(a2);
                obj = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException e) {
            }
        }
        C0925g.m5656a(a, f5706i, str, obj);
        return j;
    }

    public static boolean m5657a(ContentResolver contentResolver, String str, boolean z) {
        Object a = C0925g.m5651a(contentResolver);
        Object obj = (Boolean) C0925g.m5652a(f5704g, str, Boolean.valueOf(z));
        if (obj != null) {
            return obj.booleanValue();
        }
        Object a2 = C0925g.m5653a(contentResolver, str, null);
        if (!(a2 == null || a2.equals(""))) {
            if (f5700c.matcher(a2).matches()) {
                obj = Boolean.valueOf(true);
                z = true;
            } else if (f5701d.matcher(a2).matches()) {
                obj = Boolean.valueOf(false);
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a2 + "\") as boolean");
            }
        }
        C0925g.m5656a(a, f5704g, str, obj);
        return z;
    }

    public static Map m5654a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f5699b, null, null, strArr, null);
        Map treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    public static void m5659b(ContentResolver contentResolver, String... strArr) {
        if (strArr.length != 0) {
            synchronized (C0925g.class) {
                String[] strArr2;
                C0925g.m5658b(contentResolver);
                HashSet hashSet = new HashSet((((f5710m.length + strArr.length) * 4) / 3) + 1);
                hashSet.addAll(Arrays.asList(f5710m));
                ArrayList arrayList = new ArrayList();
                for (Object obj : strArr) {
                    if (hashSet.add(obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    strArr2 = new String[0];
                } else {
                    f5710m = (String[]) hashSet.toArray(new String[hashSet.size()]);
                    strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (!f5709l || f5703f.isEmpty()) {
                    C0925g.m5660c(contentResolver, f5710m);
                } else if (strArr2.length != 0) {
                    C0925g.m5660c(contentResolver, strArr2);
                }
            }
        }
    }

    private static void m5660c(ContentResolver contentResolver, String[] strArr) {
        f5703f.putAll(C0925g.m5654a(contentResolver, strArr));
        f5709l = true;
    }

    public static Object m5651a(ContentResolver contentResolver) {
        Object obj;
        synchronized (C0925g.class) {
            C0925g.m5658b(contentResolver);
            obj = f5708k;
        }
        return obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m5652a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
        r1 = com.google.android.p102c.C0925g.class;
        monitor-enter(r1);
        r0 = r2.containsKey(r3);	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x0013;
    L_0x0009:
        r0 = r2.get(r3);	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = r4;
        goto L_0x000f;
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        r0 = 0;
        goto L_0x0010;
    L_0x0016:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.c.g.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private static void m5656a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (C0925g.class) {
            if (obj == f5708k) {
                hashMap.put(str, obj2);
                f5703f.remove(str);
            }
        }
    }
}
