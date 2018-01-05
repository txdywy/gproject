package com.google.android.finsky.billing.e;

import android.hardware.fingerprint.FingerprintManager;
import android.os.Build$VERSION;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.support.v4.c.a.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public final class com.google.android.finsky.billing.e.e
{

    public final android.support.v4.c.a.a a;

    e(android.support.v4.c.a.a p0) {
        this.a = p0;
    }

    public final boolean a() {
        if (this.b() && this.c())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean a(String p0) {
        if (((Boolean)com.google.android.finsky.billing.e.a.e.b(p0).a()).booleanValue() && this.e())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean b() {
        v0 = 1;
        try {
            if (Build$VERSION.SDK_INT >= 23) {
                v2 = android.support.v4.c.a.a.b(this.a.a);
                if (v2 != 0 && v2.isHardwareDetected()) {
                }
                else
                    v0 = 0;
            }
            else
                v0 = 0;
        }
        catch (Exception ex) {
            v0 = new Object[1];
            v0[0] = ex.getClass().getSimpleName();
            FinskyLog.c("%s was caught when detecting Fingerprint hardware", v0);
            v0 = 0;
        }
        return v0;
    }

    public final boolean c() {
        v0 = 1;
        try {
            if (Build$VERSION.SDK_INT >= 23) {
                v2 = android.support.v4.c.a.a.b(this.a.a);
                if (v2 != 0 && v2.hasEnrolledFingerprints()) {
                }
                else
                    v0 = 0;
            }
            else
                v0 = 0;
        }
        catch (Exception ex) {
            v0 = new Object[1];
            v0[0] = ex.getClass().getSimpleName();
            FinskyLog.c("%s was caught when accessing Fingerprint settings file", v0);
            v0 = 0;
        }
        return v0;
    }

    public final void d() {
        if (!this.a())
            return;
        try {
            KeyStore.getInstance("AndroidKeyStore").load(0);
            v0 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            v2 = new String[1];
            v2[0] = "PKCS7Padding";
            v1 = new KeyGenParameterSpec$Builder("FingerprintKey", 3).setEncryptionPaddings(v2);
            v2 = new String[1];
            v2[0] = "CBC";
            v0.init(v1.setBlockModes(v2).setUserAuthenticationRequired(1).build());
            v0.generateKey();
        }
        catch (KeyStoreException ex) {
            v0 = ex;
            throw new RuntimeException(v0);
        }
        catch (NoSuchProviderException ex) {
            v0 = ex;
            throw new RuntimeException(v0);
        }
        catch (NoSuchAlgorithmException ex) {
            v0 = ex;
            throw new RuntimeException(v0);
        }
        catch (InvalidAlgorithmParameterException ex) {
            v0 = ex;
            throw new RuntimeException(v0);
        }
        catch (CertificateException ex) {
            v0 = ex;
            throw new RuntimeException(v0);
        }
        catch (IOException ex) {
            v0 = ex;
            throw new RuntimeException(v0);
        }
        catch (IllegalStateException ex) {
            v0 = ex;
            throw new RuntimeException(v0);
        }
    }

    public final boolean e() {
  6:    if (this.a()) {
 12:        v0 = KeyStore.getInstance("AndroidKeyStore");
 23:        v0.load(0);
 33:        v0 = (SecretKey)v0.getKey("FingerprintKey", 0);
 35:        if (v0 == 0)
 37:            v0 = 1;
            else {
 40:            Cipher.getInstance("AES/CBC/PKCS7Padding").init(1, v0);
 43:            v0 = 1;
            }
 38:        return v0;
        }
  8:    v0 = 0;
  9:    return v0;
 12:    v0 = KeyStore.getInstance("AndroidKeyStore");
 23:    v0.load(0);
 33:    v0 = (SecretKey)v0.getKey("FingerprintKey", 0);
 35:    if (v0 == 0)
 37:        v0 = 1;
        else {
 40:        Cipher.getInstance("AES/CBC/PKCS7Padding").init(1, v0);
 43:        v0 = 1;
        }
 38:    return v0;
 46:    v0 = 0;
 47:    return v0;
 53:    FinskyLog.b(ex, "Exception encountered while trying to validate fingerprint key.", new Object[0]);
 56:    v0 = 0;
 57:    return v0;
 59:    goto 46;
 60:    try
            run 10...43
        catch (InvalidKeyException ex) {
 10:        goto 45;
        }
        catch (UnrecoverableKeyException ex) {
 10:        goto 58;
        }
        catch (Exception ex) {
 10:        goto 48;
        }
    }

}
