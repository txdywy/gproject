package com.google.android.gms.internal;

import com.squareup.haha.perflib.HprofParser;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class sp implements oh {
    public final byte[] f27470a;
    public final byte[] f27471b;
    public final SecretKeySpec f27472c;
    public final int f27473d;

    public sp(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f27473d = i;
            this.f27472c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f27472c);
            this.f27470a = m25561a(instance.doFinal(new byte[16]));
            this.f27471b = m25561a(this.f27470a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private final byte[] m25560a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m25562b(bArr2, this.f27470a));
        }
        byte[] b;
        int i5 = 0;
        byte[] doFinal = cipher.doFinal(bArr2);
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2 + i5, i2 + i3);
        if (copyOfRange.length == 16) {
            b = m25562b(copyOfRange, this.f27470a);
        } else {
            bArr2 = Arrays.copyOf(this.f27471b, 16);
            while (i4 < copyOfRange.length) {
                bArr2[i4] = (byte) (bArr2[i4] ^ copyOfRange[i4]);
                i4++;
            }
            bArr2[copyOfRange.length] = (byte) (bArr2[copyOfRange.length] ^ 128);
            b = bArr2;
        }
        return cipher.doFinal(m25562b(doFinal, b));
    }

    private static byte[] m25561a(byte[] bArr) {
        int i;
        int i2 = 0;
        byte[] bArr2 = new byte[16];
        for (i = 0; i < 15; i++) {
            bArr2[i] = (byte) ((bArr[i] << 1) ^ ((bArr[i + 1] & HprofParser.ROOT_UNKNOWN) >>> 7));
        }
        i = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i2 = 135;
        }
        bArr2[15] = (byte) (i2 ^ i);
        return bArr2;
    }

    private static byte[] m25562b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public final byte[] mo4862a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        if (bArr.length > (Integer.MAX_VALUE - this.f27473d) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Object obj = new byte[((this.f27473d + bArr.length) + 16)];
        Object a = ti.m25580a(this.f27473d);
        System.arraycopy(a, 0, obj, 0, this.f27473d);
        Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
        instance.init(1, this.f27472c);
        byte[] a2 = m25560a(instance, 0, a, 0, a.length);
        byte[] a3 = m25560a(instance, 1, bArr2, 0, bArr2.length);
        Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
        instance2.init(1, this.f27472c, new IvParameterSpec(a2));
        instance2.doFinal(bArr, 0, bArr.length, obj, this.f27473d);
        byte[] a4 = m25560a(instance, 2, obj, this.f27473d, bArr.length);
        int length = bArr.length + this.f27473d;
        while (i < 16) {
            obj[length + i] = (byte) ((a3[i] ^ a2[i]) ^ a4[i]);
            i++;
        }
        return obj;
    }
}
