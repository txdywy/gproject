package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.internal.C5128s;
import com.google.android.gms.common.internal.C5131t;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.dynamic.C5164d;
import com.squareup.haha.perflib.HprofParser;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class C5139m extends C5131t {
    public int f26083a;

    protected C5139m(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 25) {
            String str;
            String str2 = "GoogleCertificates";
            int length = bArr.length;
            int length2 = bArr.length;
            if (bArr == null || bArr.length == 0 || length2 <= 0 || length2 > bArr.length) {
                str = null;
            } else {
                StringBuilder stringBuilder = new StringBuilder((((length2 + 16) - 1) / 16) * 57);
                int i = 0;
                int i2 = length2;
                int i3 = 0;
                while (i2 > 0) {
                    if (i3 == 0) {
                        if (length2 < 65536) {
                            stringBuilder.append(String.format("%04X:", new Object[]{Integer.valueOf(i)}));
                        } else {
                            stringBuilder.append(String.format("%08X:", new Object[]{Integer.valueOf(i)}));
                        }
                    } else if (i3 == 8) {
                        stringBuilder.append(" -");
                    }
                    stringBuilder.append(String.format(" %02X", new Object[]{Integer.valueOf(bArr[i] & HprofParser.ROOT_UNKNOWN)}));
                    int i4 = i2 - 1;
                    i2 = i3 + 1;
                    if (i2 == 16 || i4 == 0) {
                        stringBuilder.append('\n');
                        i2 = 0;
                    }
                    i++;
                    i3 = i2;
                    i2 = i4;
                }
                str = stringBuilder.toString();
            }
            Log.wtf(str2, new StringBuilder(String.valueOf(str).length() + 51).append("Cert hash data has incorrect length (").append(length).append("):\n").append(str).toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            if (bArr.length == 25) {
                z = true;
            }
            am.m23743b(z, "cert hash data has incorrect length. length=" + bArr.length);
        }
        this.f26083a = Arrays.hashCode(bArr);
    }

    protected static byte[] m23867a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final C5161a mo4624a() {
        return C5164d.m23906a(mo4627c());
    }

    public final int mo4625b() {
        return hashCode();
    }

    abstract byte[] mo4627c();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5128s)) {
            return false;
        }
        try {
            C5128s c5128s = (C5128s) obj;
            if (c5128s.mo4625b() != hashCode()) {
                return false;
            }
            C5161a a = c5128s.mo4624a();
            if (a == null) {
                return false;
            }
            return Arrays.equals(mo4627c(), (byte[]) C5164d.m23907a(a));
        } catch (Throwable e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public int hashCode() {
        return this.f26083a;
    }
}
