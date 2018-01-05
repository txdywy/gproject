package com.google.android.gms.common.util;

import android.support.v7.widget.eq;
import com.google.android.gms.common.internal.am;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class C5150e {
    public static long m23880a(InputStream inputStream, OutputStream outputStream) {
        am.m23733a((Object) inputStream);
        am.m23733a((Object) outputStream);
        byte[] bArr = new byte[eq.FLAG_APPEARED_IN_PRE_LAYOUT];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static void m23881a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
