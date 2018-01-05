package android.support.v4.p013b;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

class C0275g extends C0274j {
    C0275g() {
    }

    private static File m1569a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo368a(android.content.Context r7, android.support.v4.p035f.C0295h[] r8, int r9) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r8.length;
        if (r1 > 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r1 = android.support.v4.p013b.C0274j.m1564a(r8, r9);
        r2 = r7.getContentResolver();
        r1 = r1.f1680a;	 Catch:{ IOException -> 0x0050 }
        r3 = "r";
        r4 = 0;
        r3 = r2.openFileDescriptor(r1, r3, r4);	 Catch:{ IOException -> 0x0050 }
        r1 = android.support.v4.p013b.C0275g.m1569a(r3);	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        if (r1 == 0) goto L_0x0022;
    L_0x001c:
        r2 = r1.canRead();	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        if (r2 != 0) goto L_0x005e;
    L_0x0022:
        r4 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        r1 = r3.getFileDescriptor();	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        r4.<init>(r1);	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        r1 = android.support.v4.p013b.C0274j.m1563a(r7, r4);	 Catch:{ Throwable -> 0x0039, all -> 0x0072 }
        r4.close();	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        if (r3 == 0) goto L_0x0037;
    L_0x0034:
        r3.close();	 Catch:{ IOException -> 0x0050 }
    L_0x0037:
        r0 = r1;
        goto L_0x0004;
    L_0x0039:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x003b }
    L_0x003b:
        r1 = move-exception;
    L_0x003c:
        if (r2 == 0) goto L_0x005a;
    L_0x003e:
        r4.close();	 Catch:{ Throwable -> 0x0052, all -> 0x0057 }
    L_0x0041:
        throw r1;	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
    L_0x0042:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0044 }
    L_0x0044:
        r2 = move-exception;
        r5 = r2;
        r2 = r1;
        r1 = r5;
    L_0x0048:
        if (r3 == 0) goto L_0x004f;
    L_0x004a:
        if (r2 == 0) goto L_0x006e;
    L_0x004c:
        r3.close();	 Catch:{ Throwable -> 0x0069 }
    L_0x004f:
        throw r1;	 Catch:{ IOException -> 0x0050 }
    L_0x0050:
        r1 = move-exception;
        goto L_0x0004;
    L_0x0052:
        r4 = move-exception;
        com.google.c.a.a.a.a.a.a(r2, r4);	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        goto L_0x0041;
    L_0x0057:
        r1 = move-exception;
        r2 = r0;
        goto L_0x0048;
    L_0x005a:
        r4.close();	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        goto L_0x0041;
    L_0x005e:
        r1 = android.graphics.Typeface.createFromFile(r1);	 Catch:{ Throwable -> 0x0042, all -> 0x0057 }
        if (r3 == 0) goto L_0x0067;
    L_0x0064:
        r3.close();	 Catch:{ IOException -> 0x0050 }
    L_0x0067:
        r0 = r1;
        goto L_0x0004;
    L_0x0069:
        r3 = move-exception;
        com.google.c.a.a.a.a.a.a(r2, r3);	 Catch:{ IOException -> 0x0050 }
        goto L_0x004f;
    L_0x006e:
        r3.close();	 Catch:{ IOException -> 0x0050 }
        goto L_0x004f;
    L_0x0072:
        r1 = move-exception;
        r2 = r0;
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.g.a(android.content.Context, android.support.v4.f.h[], int):android.graphics.Typeface");
    }
}
