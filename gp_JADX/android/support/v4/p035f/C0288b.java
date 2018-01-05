package android.support.v4.p035f;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.support.v4.p013b.C0272e;
import android.support.v4.p013b.C0281n;
import android.support.v4.p028a.p029a.C0201a;
import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0314i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C0288b {
    public static final C0314i f1666a = new C0314i(16);
    public static final C0297j f1667b = new C0297j("fonts");
    public static final Object f1668c = new Object();
    public static final C0304u f1669d = new C0304u();
    public static final Comparator f1670e = new C0293f();

    static C0296i m1607a(Context context, C0287a c0287a, int i) {
        int i2 = -3;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = c0287a.f1660a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new NameNotFoundException("No package found for authority: " + str);
            } else if (resolveContentProvider.packageName.equals(c0287a.f1661b)) {
                List list;
                ProviderInfo providerInfo;
                C0294g c0294g;
                List a = C0288b.m1608a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(a, f1670e);
                if (c0287a.f1663d != null) {
                    list = c0287a.f1663d;
                } else {
                    list = C0201a.m1059a(resources, c0287a.f1664e);
                }
                for (int i3 = 0; i3 < list.size(); i3++) {
                    List arrayList = new ArrayList((Collection) list.get(i3));
                    Collections.sort(arrayList, f1670e);
                    if (C0288b.m1610a(a, arrayList)) {
                        providerInfo = resolveContentProvider;
                        break;
                    }
                }
                providerInfo = null;
                if (providerInfo == null) {
                    c0294g = new C0294g(1, null);
                } else {
                    c0294g = new C0294g(0, C0288b.m1611a(context, c0287a, providerInfo.authority));
                }
                if (c0294g.f1678a == 0) {
                    int i4;
                    Typeface a2 = C0272e.f1646a.mo368a(context, c0294g.f1679b, i);
                    if (a2 != null) {
                        i4 = 0;
                    } else {
                        i4 = -3;
                    }
                    return new C0296i(a2, i4);
                }
                if (c0294g.f1678a == 1) {
                    i2 = -2;
                }
                return new C0296i(null, i2);
            } else {
                throw new NameNotFoundException("Found content provider " + str + ", but package was not " + c0287a.f1661b);
            }
        } catch (NameNotFoundException e) {
            return new C0296i(null, -1);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m1606a(android.content.Context r6, android.support.v4.p035f.C0287a r7, android.support.v4.p028a.p029a.C0207g r8, boolean r9, int r10, int r11) {
        /*
        r2 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r7.f1665f;
        r0 = r0.append(r1);
        r1 = "-";
        r0 = r0.append(r1);
        r0 = r0.append(r11);
        r3 = r0.toString();
        r0 = f1666a;
        r0 = r0.m1692a(r3);
        r0 = (android.graphics.Typeface) r0;
        if (r0 == 0) goto L_0x002b;
    L_0x0024:
        if (r8 == 0) goto L_0x0029;
    L_0x0026:
        r8.mo755a(r0);
    L_0x0029:
        r2 = r0;
    L_0x002a:
        return r2;
    L_0x002b:
        if (r9 == 0) goto L_0x0046;
    L_0x002d:
        r0 = -1;
        if (r10 != r0) goto L_0x0046;
    L_0x0030:
        r0 = android.support.v4.p035f.C0288b.m1607a(r6, r7, r11);
        if (r8 == 0) goto L_0x003f;
    L_0x0036:
        r1 = r0.f1686b;
        if (r1 != 0) goto L_0x0042;
    L_0x003a:
        r1 = r0.f1685a;
        r8.m1069a(r1, r2);
    L_0x003f:
        r2 = r0.f1685a;
        goto L_0x002a;
    L_0x0042:
        r8.m1070a(r2);
        goto L_0x003f;
    L_0x0046:
        r4 = new android.support.v4.f.c;
        r4.<init>(r6, r7, r11, r3);
        if (r9 == 0) goto L_0x0058;
    L_0x004d:
        r0 = f1667b;	 Catch:{ InterruptedException -> 0x00a4 }
        r0 = r0.m1615a(r4, r10);	 Catch:{ InterruptedException -> 0x00a4 }
        r0 = (android.support.v4.p035f.C0296i) r0;	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = r0.f1685a;	 Catch:{ InterruptedException -> 0x00a4 }
        goto L_0x002a;
    L_0x0058:
        if (r8 != 0) goto L_0x0078;
    L_0x005a:
        r1 = r2;
    L_0x005b:
        r5 = f1668c;
        monitor-enter(r5);
        r0 = f1669d;	 Catch:{ all -> 0x0075 }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x0075 }
        if (r0 == 0) goto L_0x007f;
    L_0x0066:
        if (r1 == 0) goto L_0x0073;
    L_0x0068:
        r0 = f1669d;	 Catch:{ all -> 0x0075 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0075 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x0075 }
        r0.add(r1);	 Catch:{ all -> 0x0075 }
    L_0x0073:
        monitor-exit(r5);	 Catch:{ all -> 0x0075 }
        goto L_0x002a;
    L_0x0075:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0075 }
        throw r0;
    L_0x0078:
        r0 = new android.support.v4.f.d;
        r0.<init>(r8, r2);
        r1 = r0;
        goto L_0x005b;
    L_0x007f:
        if (r1 == 0) goto L_0x008e;
    L_0x0081:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0075 }
        r0.<init>();	 Catch:{ all -> 0x0075 }
        r0.add(r1);	 Catch:{ all -> 0x0075 }
        r1 = f1669d;	 Catch:{ all -> 0x0075 }
        r1.put(r3, r0);	 Catch:{ all -> 0x0075 }
    L_0x008e:
        monitor-exit(r5);	 Catch:{ all -> 0x0075 }
        r0 = f1667b;
        r1 = new android.support.v4.f.e;
        r1.<init>(r3);
        r3 = new android.os.Handler;
        r3.<init>();
        r5 = new android.support.v4.f.l;
        r5.<init>(r4, r3, r1);
        r0.m1616a(r5);
        goto L_0x002a;
    L_0x00a4:
        r0 = move-exception;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.b.a(android.content.Context, android.support.v4.f.a, android.support.v4.a.a.g, boolean, int, int):android.graphics.Typeface");
    }

    public static Map m1609a(Context context, C0295h[] c0295hArr) {
        Map hashMap = new HashMap();
        for (C0295h c0295h : c0295hArr) {
            if (c0295h.f1684e == 0) {
                Uri uri = c0295h.f1680a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0281n.m1594a(context, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static boolean m1610a(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List m1608a(Signature[] signatureArr) {
        List arrayList = new ArrayList();
        for (Signature toByteArray : signatureArr) {
            arrayList.add(toByteArray.toByteArray());
        }
        return arrayList;
    }

    private static C0295h[] m1611a(Context context, C0287a c0287a, String str) {
        Throwable th;
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme("content").authority(str).build();
        Uri build2 = new Builder().scheme("content").authority(str).appendPath("file").build();
        try {
            Cursor query;
            ArrayList arrayList2;
            if (VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0287a.f1662c}, null, null);
            } else {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0287a.f1662c}, null);
            }
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        int columnIndex = query.getColumnIndex("result_code");
                        arrayList2 = new ArrayList();
                        int columnIndex2 = query.getColumnIndex("_id");
                        int columnIndex3 = query.getColumnIndex("file_id");
                        int columnIndex4 = query.getColumnIndex("font_ttc_index");
                        int columnIndex5 = query.getColumnIndex("font_weight");
                        int columnIndex6 = query.getColumnIndex("font_italic");
                        while (query.moveToNext()) {
                            Uri withAppendedId;
                            int i = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                            int i2 = columnIndex4 != -1 ? query.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                            }
                            int i3 = columnIndex5 != -1 ? query.getInt(columnIndex5) : 400;
                            boolean z = columnIndex6 != -1 && query.getInt(columnIndex6) == 1;
                            arrayList2.add(new C0295h(withAppendedId, i2, i3, z, i));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return (C0295h[]) arrayList2.toArray(new C0295h[0]);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                }
            }
            arrayList2 = arrayList;
            if (query != null) {
                query.close();
            }
            return (C0295h[]) arrayList2.toArray(new C0295h[0]);
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
