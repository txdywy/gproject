package com.google.archivepatcher.p406a;

import java.io.File;
import java.io.OutputStream;
import java.util.List;

public final class C6871g {
    public static List m31242a(List list, File file, OutputStream outputStream) {
        Throwable th;
        C6873i c6873i = new C6873i(outputStream);
        C6877m c6877m;
        try {
            c6877m = new C6877m(file);
            try {
                long j = 0;
                for (C6879o c6879o : list) {
                    long j2 = c6879o.f33989a - j;
                    if (j2 > 0) {
                        c6877m.m31246a(j, j2);
                        c6873i.m31244a(c6877m, C6874j.COPY);
                    }
                    c6877m.m31246a(c6879o.f33989a, c6879o.f33990b);
                    c6873i.m31244a(c6877m, C6874j.UNCOMPRESS_NOWRAP);
                    j = c6879o.f33989a + c6879o.f33990b;
                }
                long j3 = c6877m.f33987e - j;
                if (j3 > 0) {
                    c6877m.m31246a(j, j3);
                    c6873i.m31244a(c6877m, C6874j.COPY);
                }
                try {
                    c6877m.close();
                } catch (Exception e) {
                }
                try {
                    c6873i.close();
                } catch (Exception e2) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                try {
                    c6877m.close();
                } catch (Exception e3) {
                }
                try {
                    c6873i.close();
                } catch (Exception e4) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c6877m = null;
            c6877m.close();
            c6873i.close();
            throw th;
        }
    }
}
