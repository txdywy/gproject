package com.google.android.finsky.billing.p131e;

import android.annotation.TargetApi;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build.VERSION;
import android.security.keystore.KeyGenParameterSpec.Builder;
import android.support.v4.p030c.p031a.C0282a;
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

public final class C1817e {
    public final C0282a f9378a;

    public C1817e(C0282a c0282a) {
        this.f9378a = c0282a;
    }

    public final boolean m9821a() {
        return m9823b() && m9824c();
    }

    public final boolean m9823b() {
        try {
            C0282a c0282a = this.f9378a;
            if (VERSION.SDK_INT < 23) {
                return false;
            }
            FingerprintManager b = C0282a.m1600b(c0282a.f1659a);
            if (b == null || !b.isHardwareDetected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            FinskyLog.m21665c("%s was caught when detecting Fingerprint hardware", e.getClass().getSimpleName());
            return false;
        }
    }

    public final boolean m9824c() {
        try {
            C0282a c0282a = this.f9378a;
            if (VERSION.SDK_INT < 23) {
                return false;
            }
            FingerprintManager b = C0282a.m1600b(c0282a.f1659a);
            if (b == null || !b.hasEnrolledFingerprints()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            FinskyLog.m21665c("%s was caught when accessing Fingerprint settings file", e.getClass().getSimpleName());
            return false;
        }
    }

    public final boolean m9822a(String str) {
        return ((Boolean) C1814a.f9375e.m5777b(str).m5760a()).booleanValue() && m9826e();
    }

    @TargetApi(23)
    public final void m9825d() {
        Throwable e;
        if (m9821a()) {
            try {
                KeyStore.getInstance("AndroidKeyStore").load(null);
                KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                instance.init(new Builder("FingerprintKey", 3).setEncryptionPaddings(new String[]{"PKCS7Padding"}).setBlockModes(new String[]{"CBC"}).setUserAuthenticationRequired(true).build());
                instance.generateKey();
            } catch (KeyStoreException e2) {
                e = e2;
                throw new RuntimeException(e);
            } catch (NoSuchProviderException e3) {
                e = e3;
                throw new RuntimeException(e);
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                throw new RuntimeException(e);
            } catch (InvalidAlgorithmParameterException e5) {
                e = e5;
                throw new RuntimeException(e);
            } catch (CertificateException e6) {
                e = e6;
                throw new RuntimeException(e);
            } catch (IOException e7) {
                e = e7;
                throw new RuntimeException(e);
            } catch (IllegalStateException e8) {
                e = e8;
                throw new RuntimeException(e);
            }
        }
    }

    @TargetApi(23)
    public final boolean m9826e() {
        if (!m9821a()) {
            return false;
        }
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.load(null);
            SecretKey secretKey = (SecretKey) instance.getKey("FingerprintKey", null);
            if (secretKey == null) {
                return true;
            }
            instance2.init(1, secretKey);
            return true;
        } catch (InvalidKeyException e) {
            return false;
        } catch (UnrecoverableKeyException e2) {
            return false;
        } catch (Throwable e3) {
            FinskyLog.m21663b(e3, "Exception encountered while trying to validate fingerprint key.", new Object[0]);
            return false;
        }
    }
}
