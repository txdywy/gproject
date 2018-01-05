package com.google.android.finsky.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public final class C4681l {
    public static byte[] m21820a(byte[] bArr) {
        Closeable gZIPOutputStream;
        IOException e;
        byte[] bArr2;
        Throwable th;
        Closeable closeable = null;
        try {
            Closeable byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (IOException e2) {
                e = e2;
                gZIPOutputStream = null;
                closeable = byteArrayOutputStream;
                try {
                    FinskyLog.m21665c("Unexpected %s", e);
                    bArr2 = new byte[0];
                    C4679j.m21814a(gZIPOutputStream);
                    C4679j.m21814a(closeable);
                    return bArr2;
                } catch (Throwable th2) {
                    th = th2;
                    C4679j.m21814a(gZIPOutputStream);
                    C4679j.m21814a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
                closeable = byteArrayOutputStream;
                C4679j.m21814a(gZIPOutputStream);
                C4679j.m21814a(closeable);
                throw th;
            }
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                bArr2 = byteArrayOutputStream.toByteArray();
                C4679j.m21814a(gZIPOutputStream);
                C4679j.m21814a(byteArrayOutputStream);
            } catch (IOException e3) {
                e = e3;
                closeable = byteArrayOutputStream;
                FinskyLog.m21665c("Unexpected %s", e);
                bArr2 = new byte[0];
                C4679j.m21814a(gZIPOutputStream);
                C4679j.m21814a(closeable);
                return bArr2;
            } catch (Throwable th4) {
                th = th4;
                closeable = byteArrayOutputStream;
                C4679j.m21814a(gZIPOutputStream);
                C4679j.m21814a(closeable);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            gZIPOutputStream = null;
            FinskyLog.m21665c("Unexpected %s", e);
            bArr2 = new byte[0];
            C4679j.m21814a(gZIPOutputStream);
            C4679j.m21814a(closeable);
            return bArr2;
        } catch (Throwable th5) {
            th = th5;
            gZIPOutputStream = null;
            C4679j.m21814a(gZIPOutputStream);
            C4679j.m21814a(closeable);
            throw th;
        }
        return bArr2;
    }
}
