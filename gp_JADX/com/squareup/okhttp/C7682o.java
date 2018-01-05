package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

public final class C7682o {
    public static final C7679k[] f39776a = new C7679k[]{C7679k.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C7679k.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C7679k.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, C7679k.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, C7679k.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, C7679k.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C7679k.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C7679k.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, C7679k.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, C7679k.TLS_RSA_WITH_AES_128_GCM_SHA256, C7679k.TLS_RSA_WITH_AES_128_CBC_SHA, C7679k.TLS_RSA_WITH_AES_256_CBC_SHA, C7679k.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    public static final C7682o f39777b = new C7683p(true).m37003a(f39776a).m37002a(ao.TLS_1_2, ao.TLS_1_1, ao.TLS_1_0).m37001a().m37005b();
    public static final C7682o f39778c = new C7683p(f39777b).m37002a(ao.TLS_1_0).m37001a().m37005b();
    public static final C7682o f39779d = new C7683p(false).m37005b();
    public final boolean f39780e;
    public final boolean f39781f;
    public final String[] f39782g;
    public final String[] f39783h;

    C7682o(C7683p c7683p) {
        this.f39780e = c7683p.f39784a;
        this.f39782g = c7683p.f39785b;
        this.f39783h = c7683p.f39786c;
        this.f39781f = c7683p.f39787d;
    }

    public final boolean m37000a(SSLSocket sSLSocket) {
        if (!this.f39780e) {
            return false;
        }
        if (this.f39783h != null && !C7682o.m36999a(this.f39783h, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f39782g == null || C7682o.m36999a(this.f39782g, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    private static boolean m36999a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        for (String a : strArr) {
            if (k.a(strArr2, a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7682o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C7682o c7682o = (C7682o) obj;
        if (this.f39780e != c7682o.f39780e) {
            return false;
        }
        if (!this.f39780e || (Arrays.equals(this.f39782g, c7682o.f39782g) && Arrays.equals(this.f39783h, c7682o.f39783h) && this.f39781f == c7682o.f39781f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f39780e) {
            return 17;
        }
        return (this.f39781f ? 0 : 1) + ((((Arrays.hashCode(this.f39782g) + 527) * 31) + Arrays.hashCode(this.f39783h)) * 31);
    }

    public final String toString() {
        Object obj = null;
        int i = 0;
        if (!this.f39780e) {
            return "ConnectionSpec()";
        }
        String obj2;
        String obj3;
        if (this.f39782g != null) {
            Object obj4;
            if (this.f39782g == null) {
                obj4 = null;
            } else {
                C7679k[] c7679kArr = new C7679k[this.f39782g.length];
                for (int i2 = 0; i2 < this.f39782g.length; i2++) {
                    c7679kArr[i2] = C7679k.m36997a(this.f39782g[i2]);
                }
                obj4 = k.a(c7679kArr);
            }
            obj2 = obj4.toString();
        } else {
            obj2 = "[all enabled]";
        }
        if (this.f39783h != null) {
            if (this.f39783h != null) {
                ao[] aoVarArr = new ao[this.f39783h.length];
                while (i < this.f39783h.length) {
                    aoVarArr[i] = ao.m36667a(this.f39783h[i]);
                    i++;
                }
                obj = k.a(aoVarArr);
            }
            obj3 = obj.toString();
        } else {
            obj3 = "[all enabled]";
        }
        return "ConnectionSpec(cipherSuites=" + obj2 + ", tlsVersions=" + obj3 + ", supportsTlsExtensions=" + this.f39781f + ")";
    }
}
