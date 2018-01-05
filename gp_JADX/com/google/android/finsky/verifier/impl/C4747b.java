package com.google.android.finsky.verifier.impl;

import android.content.pm.Signature;
import com.google.android.finsky.verifier.p259a.p260a.C4702f;
import com.google.android.finsky.verifier.p259a.p260a.C4710n;
import java.security.MessageDigest;
import java.util.HashSet;

public final class C4747b {
    public static byte[][] m22106a(Signature[] signatureArr) {
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        byte[][] bArr = new byte[signatureArr.length][];
        for (int i = 0; i < signatureArr.length; i++) {
            bArr[i] = signatureArr[i].toByteArray();
        }
        return bArr;
    }

    public static boolean m22105a(C4710n c4710n, C4710n c4710n2) {
        if (c4710n == null || c4710n2 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (C4702f c4702f : c4710n.f24226b) {
            hashSet.add(new Signature(c4702f.f24188b[0].f24191c));
        }
        HashSet hashSet2 = new HashSet();
        for (C4702f c4702f2 : c4710n2.f24226b) {
            hashSet2.add(new Signature(c4702f2.f24188b[0].f24191c));
        }
        return hashSet.equals(hashSet2);
    }

    public static byte[][] m22107b(Signature[] signatureArr) {
        if (signatureArr == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            if (signatureArr == null || signatureArr.length <= 0) {
                return null;
            }
            byte[][] bArr = new byte[signatureArr.length][];
            for (int i = 0; i < signatureArr.length; i++) {
                bArr[i] = instance.digest(signatureArr[i].toByteArray());
            }
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
