package com.google.android.gms.internal;

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

public class od {
    public static Uri f27237a = Uri.parse("content://com.google.android.gsf.gservices");
    public static Uri f27238b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern f27239c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern f27240d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean f27241e = new AtomicBoolean();
    public static HashMap f27242f;
    public static HashMap f27243g = new HashMap();
    public static HashMap f27244h = new HashMap();
    public static HashMap f27245i = new HashMap();
    public static HashMap f27246j = new HashMap();
    public static Object f27247k;
    public static boolean f27248l;
    public static String[] f27249m = new String[0];

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m25262a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
        r1 = com.google.android.gms.internal.od.class;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.od.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public static String m25263a(ContentResolver contentResolver, String str) {
        String str2 = null;
        synchronized (od.class) {
            m25264a(contentResolver);
            Object obj = f27247k;
            String str3;
            if (f27242f.containsKey(str)) {
                str3 = (String) f27242f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                String[] strArr = f27249m;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (str.startsWith(strArr[i])) {
                        if (!f27248l || f27242f.isEmpty()) {
                            m25271c(contentResolver, f27249m);
                            if (f27242f.containsKey(str)) {
                                str3 = (String) f27242f.get(str);
                                if (str3 != null) {
                                    str2 = str3;
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
                Cursor query = contentResolver.query(f27237a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            if (str3 != null && str3.equals(null)) {
                                str3 = null;
                            }
                            m25266a(obj, str, str3);
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
                m25266a(obj, str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    private static void m25264a(ContentResolver contentResolver) {
        if (f27242f == null) {
            f27241e.set(false);
            f27242f = new HashMap();
            f27247k = new Object();
            f27248l = false;
            contentResolver.registerContentObserver(f27237a, true, new oe());
        } else if (f27241e.getAndSet(false)) {
            f27242f.clear();
            f27243g.clear();
            f27244h.clear();
            f27245i.clear();
            f27246j.clear();
            f27247k = new Object();
            f27248l = false;
        }
    }

    public static void m25265a(ContentResolver contentResolver, String... strArr) {
        if (strArr.length != 0) {
            synchronized (od.class) {
                String[] strArr2;
                m25264a(contentResolver);
                HashSet hashSet = new HashSet((((f27249m.length + strArr.length) << 2) / 3) + 1);
                hashSet.addAll(Arrays.asList(f27249m));
                ArrayList arrayList = new ArrayList();
                for (Object obj : strArr) {
                    if (hashSet.add(obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    strArr2 = new String[0];
                } else {
                    f27249m = (String[]) hashSet.toArray(new String[hashSet.size()]);
                    strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (!f27248l || f27242f.isEmpty()) {
                    m25271c(contentResolver, f27249m);
                } else if (strArr2.length != 0) {
                    m25271c(contentResolver, strArr2);
                }
            }
        }
    }

    private static void m25266a(Object obj, String str, String str2) {
        synchronized (od.class) {
            if (obj == f27247k) {
                f27242f.put(str, str2);
            }
        }
    }

    private static void m25267a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (od.class) {
            if (obj == f27247k) {
                hashMap.put(str, obj2);
                f27242f.remove(str);
            }
        }
    }

    public static long m25268b(ContentResolver contentResolver, String str) {
        Object b = m25269b(contentResolver);
        Long l = (Long) m25262a(f27245i, str, Long.valueOf(0));
        if (l != null) {
            return l.longValue();
        }
        Object obj;
        long j;
        String a = m25263a(contentResolver, str);
        if (a == null) {
            obj = l;
            j = 0;
        } else {
            Long valueOf;
            try {
                long parseLong = Long.parseLong(a);
                valueOf = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException e) {
                valueOf = l;
                j = 0;
            }
        }
        m25267a(b, f27245i, str, obj);
        return j;
    }

    private static Object m25269b(ContentResolver contentResolver) {
        Object obj;
        synchronized (od.class) {
            m25264a(contentResolver);
            obj = f27247k;
        }
        return obj;
    }

    private static Map m25270b(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f27238b, null, null, strArr, null);
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

    private static void m25271c(ContentResolver contentResolver, String[] strArr) {
        f27242f.putAll(m25270b(contentResolver, strArr));
        f27248l = true;
    }

    public static boolean m25272c(ContentResolver contentResolver, String str) {
        Object b = m25269b(contentResolver);
        Boolean bool = (Boolean) m25262a(f27243g, str, Boolean.valueOf(false));
        if (bool != null) {
            return bool.booleanValue();
        }
        Object obj;
        boolean z;
        Object a = m25263a(contentResolver, str);
        if (a == null || a.equals("")) {
            obj = bool;
            z = false;
        } else if (f27239c.matcher(a).matches()) {
            r1 = Boolean.valueOf(true);
            z = true;
        } else if (f27240d.matcher(a).matches()) {
            r1 = Boolean.valueOf(false);
            z = false;
        } else {
            Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a + "\") as boolean");
            r1 = bool;
            z = false;
        }
        m25267a(b, f27243g, str, obj);
        return z;
    }
}
