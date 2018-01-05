package com.google.android.finsky.installer.p207a;

import android.content.Context;
import android.net.Uri;
import com.google.android.finsky.installer.C3284c;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;

final class C3287e implements C3284c {
    public final int f17014a;
    public final int f17015b;
    public File f17016c;
    public File f17017d;
    public Uri f17018e;
    public Uri f17019f;
    public final Context f17020g;
    public final String f17021h;

    C3287e(String str, int i, int i2, Uri uri, Uri uri2, Context context) {
        this.f17021h = str;
        this.f17014a = i;
        this.f17015b = i2;
        this.f17018e = uri;
        this.f17019f = uri2;
        this.f17020g = context;
    }

    public final int mo3421a() {
        return this.f17014a;
    }

    public final int mo3422b() {
        return this.f17015b;
    }

    public final synchronized File mo3423c() {
        File file;
        if (this.f17014a < 0) {
            FinskyLog.m21669e("Main OBB File does not exist.", new Object[0]);
            file = null;
        } else if (this.f17016c != null) {
            file = this.f17016c;
        } else {
            Uri uri = this.f17018e;
            String valueOf = String.valueOf(this.f17014a);
            String str = this.f17021h;
            this.f17016c = m16513a(uri, new StringBuilder((String.valueOf(valueOf).length() + 10) + String.valueOf(str).length()).append("main.").append(valueOf).append(".").append(str).append(".obb").toString());
            file = this.f17016c;
        }
        return file;
    }

    public final synchronized File mo3424d() {
        File file;
        if (this.f17015b < 0) {
            FinskyLog.m21669e("Patch OBB File does not exist.", new Object[0]);
            file = null;
        } else if (this.f17017d != null) {
            file = this.f17017d;
        } else {
            Uri uri = this.f17019f;
            String valueOf = String.valueOf(this.f17014a);
            String str = this.f17021h;
            this.f17017d = m16513a(uri, new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(str).length()).append("patch.").append(valueOf).append(".").append(str).append(".obb").toString());
            file = this.f17017d;
        }
        return file;
    }

    public final String mo3425e() {
        if (this.f17014a >= 0) {
            return this.f17018e.toString();
        }
        FinskyLog.m21669e("Main OBB URI does not exist.", new Object[0]);
        return "";
    }

    public final String mo3426f() {
        if (this.f17015b >= 0) {
            return this.f17019f.toString();
        }
        FinskyLog.m21669e("Patch OBB URI does not exist.", new Object[0]);
        return "";
    }

    public final synchronized void mo3427g() {
        if (this.f17016c != null && this.f17016c.exists()) {
            this.f17016c.delete();
        }
        if (this.f17017d != null && this.f17017d.exists()) {
            this.f17017d.delete();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File m16513a(android.net.Uri r11, java.lang.String r12) {
        /*
        r10 = this;
        r0 = 0;
        r1 = r10.f17020g;
        r2 = r1.getCacheDir();
        r1 = r10.f17020g;	 Catch:{ IOException -> 0x002f, all -> 0x004c }
        r1 = r1.getContentResolver();	 Catch:{ IOException -> 0x002f, all -> 0x004c }
        r4 = r1.openInputStream(r11);	 Catch:{ IOException -> 0x002f, all -> 0x004c }
        if (r4 != 0) goto L_0x001a;
    L_0x0013:
        com.google.android.finsky.zapp.utils.C4865c.m22751a(r0);
        com.google.android.finsky.zapp.utils.C4865c.m22751a(r4);
    L_0x0019:
        return r0;
    L_0x001a:
        r1 = new java.io.File;	 Catch:{ IOException -> 0x0062, all -> 0x0057 }
        r1.<init>(r2, r12);	 Catch:{ IOException -> 0x0062, all -> 0x0057 }
        r3 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0067, all -> 0x0057 }
        r3.<init>(r1);	 Catch:{ IOException -> 0x0067, all -> 0x0057 }
        com.google.android.finsky.utils.C4692x.m21843a(r4, r3);	 Catch:{ IOException -> 0x006d, all -> 0x005c }
        com.google.android.finsky.zapp.utils.C4865c.m22751a(r3);
        com.google.android.finsky.zapp.utils.C4865c.m22751a(r4);
        r0 = r1;
        goto L_0x0019;
    L_0x002f:
        r1 = move-exception;
        r2 = r0;
        r3 = r0;
        r4 = r0;
    L_0x0033:
        r5 = "Copying cached apk for %s failed";
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x0060 }
        r7 = 0;
        r8 = r10.f17021h;	 Catch:{ all -> 0x0060 }
        r6[r7] = r8;	 Catch:{ all -> 0x0060 }
        com.google.android.finsky.utils.FinskyLog.m21660a(r1, r5, r6);	 Catch:{ all -> 0x0060 }
        if (r4 == 0) goto L_0x0045;
    L_0x0042:
        r4.delete();	 Catch:{ all -> 0x0060 }
    L_0x0045:
        com.google.android.finsky.zapp.utils.C4865c.m22751a(r2);
        com.google.android.finsky.zapp.utils.C4865c.m22751a(r3);
        goto L_0x0019;
    L_0x004c:
        r1 = move-exception;
        r2 = r0;
        r3 = r0;
        r0 = r1;
    L_0x0050:
        com.google.android.finsky.zapp.utils.C4865c.m22751a(r2);
        com.google.android.finsky.zapp.utils.C4865c.m22751a(r3);
        throw r0;
    L_0x0057:
        r1 = move-exception;
        r2 = r0;
        r3 = r4;
        r0 = r1;
        goto L_0x0050;
    L_0x005c:
        r0 = move-exception;
        r2 = r3;
        r3 = r4;
        goto L_0x0050;
    L_0x0060:
        r0 = move-exception;
        goto L_0x0050;
    L_0x0062:
        r1 = move-exception;
        r2 = r0;
        r3 = r4;
        r4 = r0;
        goto L_0x0033;
    L_0x0067:
        r2 = move-exception;
        r3 = r4;
        r4 = r1;
        r1 = r2;
        r2 = r0;
        goto L_0x0033;
    L_0x006d:
        r2 = move-exception;
        r9 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r1;
        r1 = r9;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.installer.a.e.a(android.net.Uri, java.lang.String):java.io.File");
    }
}
