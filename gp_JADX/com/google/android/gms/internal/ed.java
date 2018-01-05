package com.google.android.gms.internal;

import com.google.android.gms.ads.p270c.C4909c;
import com.squareup.haha.perflib.HprofParser;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class ed {
    public static boolean f26678a = false;
    public static MessageDigest f26679b = null;
    public static final Object f26680c = new Object();
    public static final Object f26681d = new Object();
    public static CountDownLatch f26682e = new CountDownLatch(1);

    static void m24322a() {
        synchronized (f26681d) {
            if (!f26678a) {
                f26678a = true;
                new Thread(new ee()).start();
            }
        }
    }

    public static byte[] m24323a(byte[] bArr) {
        byte[] digest;
        synchronized (f26680c) {
            MessageDigest b = m24326b();
            if (b == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            b.reset();
            b.update(bArr);
            digest = f26679b.digest();
        }
        return digest;
    }

    private static byte[] m24324a(byte[] bArr, String str) {
        Vector b = m24327b(bArr);
        if (b == null || b.size() == 0) {
            return m24325a(wz.m24212a(m24329c()), str, true);
        }
        wz ctVar = new ct();
        ctVar.f26646a = new byte[b.size()][];
        Iterator it = b.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            ctVar.f26646a[i] = m24325a((byte[]) it.next(), str, false);
            i = i2;
        }
        ctVar.f26647b = m24323a(bArr);
        return wz.m24212a(ctVar);
    }

    private static byte[] m24325a(byte[] bArr, String str, boolean z) {
        byte[] bArr2;
        byte[] array;
        int i = z ? 239 : HprofParser.ROOT_UNKNOWN;
        if (bArr.length > i) {
            bArr = wz.m24212a(m24329c());
        }
        if (bArr.length < i) {
            bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(m24323a(array)).put(array).array();
        }
        bArr2 = new byte[256];
        new eg().m24331a(array, bArr2);
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new tx(str.getBytes("UTF-8")).m25643a(bArr2);
        }
        return bArr2;
    }

    private static MessageDigest m24326b() {
        m24322a();
        boolean z = false;
        try {
            z = f26682e.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        return (z && f26679b != null) ? f26679b : null;
    }

    private static Vector m24327b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + HprofParser.ROOT_UNKNOWN) - 1) / HprofParser.ROOT_UNKNOWN;
        Vector vector = new Vector();
        int i = 0;
        while (i < length) {
            int i2 = i * HprofParser.ROOT_UNKNOWN;
            try {
                vector.add(Arrays.copyOfRange(bArr, i2, bArr.length - i2 > HprofParser.ROOT_UNKNOWN ? i2 + HprofParser.ROOT_UNKNOWN : bArr.length));
                i++;
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] m24328b(String str, String str2) {
        wz cmVar = new cm();
        try {
            cmVar.f26637a = str.length() < 3 ? str.getBytes("ISO-8859-1") : eb.m24316a(str, true);
            cmVar.f26638b = str2.length() < 3 ? str2.getBytes("ISO-8859-1") : eb.m24316a(str2, true);
            return wz.m24212a(cmVar);
        } catch (GeneralSecurityException e) {
            return null;
        } catch (UnsupportedEncodingException e2) {
            return null;
        }
    }

    private static ci m24329c() {
        ci ciVar = new ci();
        ciVar.f26598t = Long.valueOf(4096);
        return ciVar;
    }

    static String m24319a(ci ciVar, String str, boolean z) {
        byte[] a;
        byte[] a2 = wz.m24212a((wz) ciVar);
        if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27762r)).booleanValue()) {
            a = z ? m24325a(a2, str, true) : m24324a(a2, str);
        } else if (ef.f26683a == null) {
            throw new GeneralSecurityException();
        } else {
            a = ef.f26683a.mo4863a(a2, str != null ? str.getBytes() : new byte[0]);
            wz ctVar = new ct();
            ctVar.f26646a = new byte[][]{a};
            ctVar.f26649d = Integer.valueOf(2);
            a = wz.m24212a(ctVar);
        }
        return eb.m24315a(a, true);
    }

    static String m24320a(String str, String str2) {
        ((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27752h)).booleanValue();
        byte[] b = m24328b(str, str2);
        return b != null ? eb.m24315a(b, true) : Integer.toString(7);
    }
}
