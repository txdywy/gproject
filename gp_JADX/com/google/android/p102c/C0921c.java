package com.google.android.p102c;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;
import java.util.HashMap;

public class C0921c implements BaseColumns {
    public static HashMap f5692a = new HashMap();

    private static C0924f m5644a(ContentResolver contentResolver, Uri uri) {
        C0924f c0924f = (C0924f) f5692a.get(uri);
        if (c0924f == null) {
            c0924f = new C0924f();
            f5692a.put(uri, c0924f);
            contentResolver.registerContentObserver(uri, true, new C0922d(c0924f));
            return c0924f;
        } else if (!c0924f.f5697c.getAndSet(false)) {
            return c0924f;
        } else {
            synchronized (c0924f) {
                c0924f.f5695a.clear();
                c0924f.f5696b = new Object();
            }
            return c0924f;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String m5645a(android.content.ContentResolver r9, android.net.Uri r10, java.lang.String r11) {
        /*
        r6 = 0;
        r1 = com.google.android.p102c.C0921c.class;
        monitor-enter(r1);
        r7 = com.google.android.p102c.C0921c.m5644a(r9, r10);	 Catch:{ all -> 0x001e }
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        monitor-enter(r7);
        r8 = r7.f5696b;	 Catch:{ all -> 0x004c }
        r0 = r7.f5695a;	 Catch:{ all -> 0x004c }
        r0 = r0.containsKey(r11);	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0021;
    L_0x0014:
        r0 = r7.f5695a;	 Catch:{ all -> 0x004c }
        r0 = r0.get(r11);	 Catch:{ all -> 0x004c }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x004c }
        monitor-exit(r7);	 Catch:{ all -> 0x004c }
    L_0x001d:
        return r0;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        throw r0;
    L_0x0021:
        monitor-exit(r7);	 Catch:{ all -> 0x004c }
        r0 = 1;
        r2 = new java.lang.String[r0];	 Catch:{ SQLException -> 0x005d }
        r0 = 0;
        r1 = "value";
        r2[r0] = r1;	 Catch:{ SQLException -> 0x005d }
        r3 = "name=?";
        r0 = 1;
        r4 = new java.lang.String[r0];	 Catch:{ SQLException -> 0x005d }
        r0 = 0;
        r4[r0] = r11;	 Catch:{ SQLException -> 0x005d }
        r5 = 0;
        r0 = r9;
        r1 = r10;
        r2 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ SQLException -> 0x005d }
        if (r2 == 0) goto L_0x0041;
    L_0x003b:
        r0 = r2.moveToFirst();	 Catch:{ SQLException -> 0x008e, all -> 0x008b }
        if (r0 != 0) goto L_0x004f;
    L_0x0041:
        r0 = 0;
        com.google.android.p102c.C0921c.m5646a(r7, r8, r11, r0);	 Catch:{ SQLException -> 0x008e, all -> 0x008b }
        if (r2 == 0) goto L_0x004a;
    L_0x0047:
        r2.close();
    L_0x004a:
        r0 = r6;
        goto L_0x001d;
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x004c }
        throw r0;
    L_0x004f:
        r0 = 0;
        r0 = r2.getString(r0);	 Catch:{ SQLException -> 0x008e, all -> 0x008b }
        com.google.android.p102c.C0921c.m5646a(r7, r8, r11, r0);	 Catch:{ SQLException -> 0x0093, all -> 0x008b }
        if (r2 == 0) goto L_0x001d;
    L_0x0059:
        r2.close();
        goto L_0x001d;
    L_0x005d:
        r0 = move-exception;
        r1 = r0;
        r0 = r6;
    L_0x0060:
        r2 = "GoogleSettings";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0084 }
        r4 = "Can't get key ";
        r3.<init>(r4);	 Catch:{ all -> 0x0084 }
        r3 = r3.append(r11);	 Catch:{ all -> 0x0084 }
        r4 = " from ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0084 }
        r3 = r3.append(r10);	 Catch:{ all -> 0x0084 }
        r3 = r3.toString();	 Catch:{ all -> 0x0084 }
        android.util.Log.e(r2, r3, r1);	 Catch:{ all -> 0x0084 }
        if (r6 == 0) goto L_0x001d;
    L_0x0080:
        r6.close();
        goto L_0x001d;
    L_0x0084:
        r0 = move-exception;
    L_0x0085:
        if (r6 == 0) goto L_0x008a;
    L_0x0087:
        r6.close();
    L_0x008a:
        throw r0;
    L_0x008b:
        r0 = move-exception;
        r6 = r2;
        goto L_0x0085;
    L_0x008e:
        r0 = move-exception;
        r1 = r0;
        r0 = r6;
        r6 = r2;
        goto L_0x0060;
    L_0x0093:
        r1 = move-exception;
        r6 = r2;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.c.c.a(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }

    private static void m5646a(C0924f c0924f, Object obj, String str, String str2) {
        synchronized (c0924f) {
            if (obj == c0924f.f5696b) {
                c0924f.f5695a.put(str, str2);
            }
        }
    }

    public static Uri m5643a(Uri uri, String str) {
        return Uri.withAppendedPath(uri, str);
    }
}
