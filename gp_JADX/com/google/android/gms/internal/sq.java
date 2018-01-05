package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class sq implements oh {
    public final SecretKeySpec f27474a;

    public sq(byte[] bArr) {
        this.f27474a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] mo4862a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Object obj = new byte[((bArr.length + 12) + 16)];
        Object a = ti.m25580a(12);
        System.arraycopy(a, 0, obj, 0, 12);
        Cipher cipher = (Cipher) sx.f27486c.m25570a("AES/GCM/NoPadding");
        cipher.init(1, this.f27474a, new GCMParameterSpec(128, a));
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, obj, 12);
        return obj;
    }
}
