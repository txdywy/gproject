package com.google.android.finsky.p189e;

import android.content.Context;
import android.net.Uri;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bo.C2153a;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public final class C2952g {
    public final Context f15589a;
    public final C2153a f15590b;
    public final C1461c f15591c;
    public final C2376e f15592d;
    public final C0986a f15593e;
    public final C2946a f15594f;

    public C2952g(Context context, C2153a c2153a, C1461c c1461c, C2376e c2376e, C0986a c0986a, C2946a c2946a) {
        this.f15589a = context;
        this.f15590b = c2153a;
        this.f15591c = c1461c;
        this.f15592d = c2376e;
        this.f15593e = c0986a;
        this.f15594f = c2946a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final com.google.android.finsky.p189e.C2957l m15340a(com.google.android.finsky.au.C1518d r8, java.io.File r9, java.io.InputStream r10, java.io.OutputStream r11, java.lang.String r12, com.google.wireless.android.a.a.a.a.t r13) {
        /*
        r7 = this;
        r3 = 1;
        r4 = 0;
        r0 = 0;
        r1 = r8.f8214l;	 Catch:{ FileNotFoundException -> 0x0021 }
        r1 = r1.f;	 Catch:{ FileNotFoundException -> 0x0021 }
        r2 = 4;
        if (r1 == r2) goto L_0x0011;
    L_0x000a:
        r1 = r8.f8214l;	 Catch:{ FileNotFoundException -> 0x0021 }
        r1 = r1.f;	 Catch:{ FileNotFoundException -> 0x0021 }
        r2 = 5;
        if (r1 != r2) goto L_0x0036;
    L_0x0011:
        r1 = r9.exists();	 Catch:{ FileNotFoundException -> 0x0021 }
        if (r1 != 0) goto L_0x003d;
    L_0x0017:
        r0 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x0021 }
        r1 = r9.getPath();	 Catch:{ FileNotFoundException -> 0x0021 }
        r0.<init>(r1);	 Catch:{ FileNotFoundException -> 0x0021 }
        throw r0;	 Catch:{ FileNotFoundException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        r1 = "FileNotFoundException %s";
        r2 = new java.lang.Object[r3];
        r3 = r9.getPath();
        r2[r4] = r3;
        com.google.android.finsky.utils.FinskyLog.m21665c(r1, r2);
        r1 = "source-NameNotFoundException";
        r0 = r7.m15337b(r8, r13, r1, r0);
    L_0x0035:
        return r0;
    L_0x0036:
        r0 = new java.io.RandomAccessFile;	 Catch:{ FileNotFoundException -> 0x0021 }
        r1 = "r";
        r0.<init>(r9, r1);	 Catch:{ FileNotFoundException -> 0x0021 }
    L_0x003d:
        r1 = r8.f8214l;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r1 = r1.f;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        switch(r1) {
            case 1: goto L_0x006c;
            case 2: goto L_0x006c;
            case 3: goto L_0x007b;
            case 4: goto L_0x008e;
            case 5: goto L_0x008e;
            default: goto L_0x0044;
        };	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
    L_0x0044:
        r1 = "Package %s (%s): unexpected patch format (%d)";
        r2 = 3;
        r2 = new java.lang.Object[r2];	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r3 = 0;
        r4 = r8.f8208f;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r2[r3] = r4;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r3 = 1;
        r4 = r8.f8207e;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r2[r3] = r4;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r3 = 2;
        r4 = r8.f8214l;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r4 = r4.f;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r2[r3] = r4;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        com.google.android.finsky.utils.FinskyLog.m21669e(r1, r2);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r1 = 917; // 0x395 float:1.285E-42 double:4.53E-321;
        r1 = com.google.android.finsky.p189e.C2957l.m15347a(r1);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        com.google.android.finsky.utils.C4679j.m21814a(r0);
        r0 = r1;
        goto L_0x0035;
    L_0x006c:
        r2 = r8.f8209g;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        com.google.archivepatcher.applier.b.a.a(r0, r10, r11, r2);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r1 = 0;
        r1 = com.google.android.finsky.p189e.C2957l.m15348a(r1);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        com.google.android.finsky.utils.C4679j.m21814a(r0);
        r0 = r1;
        goto L_0x0035;
    L_0x007b:
        r2 = r8.f8209g;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r1 = java.lang.Long.valueOf(r2);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        com.google.archivepatcher.applier.a.b.a(r0, r11, r10, r1);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r1 = 0;
        r1 = com.google.android.finsky.p189e.C2957l.m15348a(r1);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        com.google.android.finsky.utils.C4679j.m21814a(r0);
        r0 = r1;
        goto L_0x0035;
    L_0x008e:
        r1 = r7.f15589a;	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r1 = r1.getCacheDir();	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        com.google.android.finsky.p189e.C2954i.m15342a(r9, r10, r11, r1);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        r1 = 0;
        r1 = com.google.android.finsky.p189e.C2957l.m15348a(r1);	 Catch:{ PatchFormatException -> 0x00a1, IOException -> 0x00d9, Exception -> 0x00e6 }
        com.google.android.finsky.utils.C4679j.m21814a(r0);
        r0 = r1;
        goto L_0x0035;
    L_0x00a1:
        r1 = move-exception;
        r2 = "my_downloads";
        r3 = "public_downloads";
        r2 = r12.replaceFirst(r2, r3);	 Catch:{ all -> 0x00f3 }
        r3 = r7.f15589a;	 Catch:{ all -> 0x00f3 }
        r3 = r3.getContentResolver();	 Catch:{ all -> 0x00f3 }
        r2 = android.net.Uri.parse(r2);	 Catch:{ all -> 0x00f3 }
        r2 = r3.getType(r2);	 Catch:{ all -> 0x00f3 }
        r3 = "Patch %s (%s) (content-type '%s') is invalid";
        r4 = 3;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00f3 }
        r5 = 0;
        r6 = r8.f8208f;	 Catch:{ all -> 0x00f3 }
        r4[r5] = r6;	 Catch:{ all -> 0x00f3 }
        r5 = 1;
        r6 = r8.f8207e;	 Catch:{ all -> 0x00f3 }
        r4[r5] = r6;	 Catch:{ all -> 0x00f3 }
        r5 = 2;
        r4[r5] = r2;	 Catch:{ all -> 0x00f3 }
        com.google.android.finsky.utils.FinskyLog.m21665c(r3, r4);	 Catch:{ all -> 0x00f3 }
        r2 = "applyPatch-FileFormatException";
        r1 = r7.m15337b(r8, r13, r2, r1);	 Catch:{ all -> 0x00f3 }
        com.google.android.finsky.utils.C4679j.m21814a(r0);
        r0 = r1;
        goto L_0x0035;
    L_0x00d9:
        r1 = move-exception;
        r2 = "applyPatch-IOException";
        r1 = r7.m15337b(r8, r13, r2, r1);	 Catch:{ all -> 0x00f3 }
        com.google.android.finsky.utils.C4679j.m21814a(r0);
        r0 = r1;
        goto L_0x0035;
    L_0x00e6:
        r1 = move-exception;
        r2 = "applyPatch-Exception";
        r1 = r7.m15337b(r8, r13, r2, r1);	 Catch:{ all -> 0x00f3 }
        com.google.android.finsky.utils.C4679j.m21814a(r0);
        r0 = r1;
        goto L_0x0035;
    L_0x00f3:
        r1 = move-exception;
        com.google.android.finsky.utils.C4679j.m21814a(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.e.g.a(com.google.android.finsky.au.d, java.io.File, java.io.InputStream, java.io.OutputStream, java.lang.String, com.google.wireless.android.a.a.a.a.t):com.google.android.finsky.e.l");
    }

    final C2957l m15339a(Context context, Uri uri, C1518d c1518d, t tVar) {
        try {
            Object gZIPInputStream;
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (C2952g.m15336a(c1518d)) {
                gZIPInputStream = new GZIPInputStream(openInputStream, 8192);
            } else {
                int i = (c1518d == null || c1518d.f8214l == null) ? 0 : c1518d.f8214l.f == 5 ? 1 : 0;
                if (i != 0) {
                    gZIPInputStream = this.f15594f.m15324a(openInputStream);
                } else {
                    InputStream inputStream = openInputStream;
                }
            }
            return C2957l.m15348a(gZIPInputStream);
        } catch (Exception e) {
            FinskyLog.m21665c("FileNotFoundException %s %s", uri, e.getMessage());
            return m15337b(c1518d, tVar, "patch-FileNotFoundException", e);
        } catch (Exception e2) {
            FinskyLog.m21665c("IOException %s %s", uri, e2.getMessage());
            return m15337b(c1518d, tVar, "patch-IOException", e2);
        }
    }

    public static boolean m15336a(C1518d c1518d) {
        if (c1518d == null || c1518d.f8214l == null) {
            return false;
        }
        if (c1518d.f8214l.f == 2 || c1518d.f8214l.f == 3 || c1518d.f8214l.f == 4) {
            return true;
        }
        return false;
    }

    private final C2957l m15334a(C1518d c1518d, t tVar, String str, Exception exception) {
        FinskyLog.m21665c("Copy error (%s) for %s (%s): %s", str, c1518d.f8208f, c1518d.f8207e, exception);
        this.f15590b.m11221a(c1518d.f8208f, new C2474c(127).m13244b(str).m13210a(963).m13238a((Throwable) exception).m13231a(tVar).m13236a(c1518d.f8208f).f13342a);
        return C2957l.m15347a(963);
    }

    private final C2957l m15337b(C1518d c1518d, t tVar, String str, Exception exception) {
        FinskyLog.m21665c("Patch error (%s) for %s (%s): %s", str, c1518d.f8208f, c1518d.f8207e, exception);
        this.f15590b.m11221a(c1518d.f8208f, new C2474c(108).m13244b(str).m13210a(917).m13238a((Throwable) exception).m13231a(tVar).m13236a(c1518d.f8208f).f13342a);
        return C2957l.m15347a(917);
    }
}
