package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class so implements tg {
    public final SecretKeySpec f27467a;
    public final int f27468b;
    public final int f27469c = ((Cipher) sx.f27486c.m25570a("AES/CTR/NoPadding")).getBlockSize();

    public so(byte[] bArr, int i) {
        this.f27467a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f27469c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f27468b = i;
    }

    public final byte[] mo4864a(byte[] bArr) {
        if (bArr.length > Integer.MAX_VALUE - this.f27468b) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f27468b));
        }
        Object obj = new byte[(this.f27468b + bArr.length)];
        Object a = ti.m25580a(this.f27468b);
        System.arraycopy(a, 0, obj, 0, this.f27468b);
        int length = bArr.length;
        int i = this.f27468b;
        Cipher cipher = (Cipher) sx.f27486c.m25570a("AES/CTR/NoPadding");
        Object obj2 = new byte[this.f27469c];
        System.arraycopy(a, 0, obj2, 0, this.f27468b);
        cipher.init(1, this.f27467a, new IvParameterSpec(obj2));
        if (cipher.doFinal(bArr, 0, length, obj, i) == length) {
            return obj;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
