package org.chromium.net;

import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import org.chromium.base.C7893j;
import org.chromium.base.annotations.CalledByNative;

public class AndroidKeyStore {
    @CalledByNative
    private static byte[] rawSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        Signature instance;
        byte[] bArr2 = null;
        try {
            String algorithm = privateKey.getAlgorithm();
            if ("RSA".equalsIgnoreCase(algorithm)) {
                instance = Signature.getInstance("NONEwithRSA");
            } else {
                if ("EC".equalsIgnoreCase(algorithm)) {
                    instance = Signature.getInstance("NONEwithECDSA");
                }
                instance = bArr2;
            }
        } catch (NoSuchAlgorithmException e) {
        }
        if (instance == null) {
            C7893j.m37818b("AndroidKeyStore", "Unsupported private key algorithm: " + privateKey.getAlgorithm(), new Object[0]);
        } else {
            try {
                instance.initSign(privateKey);
                instance.update(bArr);
                bArr2 = instance.sign();
            } catch (Exception e2) {
                C7893j.m37818b("AndroidKeyStore", "Exception while signing message with " + privateKey.getAlgorithm() + " private key: " + e2, new Object[0]);
            }
        }
        return bArr2;
    }

    private static Object m37836a(PrivateKey privateKey) {
        Method declaredMethod;
        if (privateKey == null) {
            C7893j.m37818b("AndroidKeyStore", "privateKey == null", new Object[0]);
            return null;
        } else if (privateKey instanceof RSAPrivateKey) {
            try {
                Class cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLRSAPrivateKey");
                if (cls.isInstance(privateKey)) {
                    try {
                        declaredMethod = cls.getDeclaredMethod("getOpenSSLKey", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Object invoke = declaredMethod.invoke(privateKey, new Object[0]);
                        declaredMethod.setAccessible(false);
                        if (invoke != null) {
                            return invoke;
                        }
                        C7893j.m37818b("AndroidKeyStore", "getOpenSSLKey() returned null", new Object[0]);
                        return null;
                    } catch (Exception e) {
                        C7893j.m37818b("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e, new Object[0]);
                        return null;
                    } catch (Throwable th) {
                        declaredMethod.setAccessible(false);
                    }
                }
                C7893j.m37818b("AndroidKeyStore", "Private key is not an OpenSSLRSAPrivateKey instance, its class name is:" + privateKey.getClass().getCanonicalName(), new Object[0]);
                return null;
            } catch (Exception e2) {
                C7893j.m37818b("AndroidKeyStore", "Cannot find system OpenSSLRSAPrivateKey class: " + e2, new Object[0]);
                return null;
            }
        } else {
            C7893j.m37818b("AndroidKeyStore", "does not implement RSAPrivateKey", new Object[0]);
            return null;
        }
    }

    @CalledByNative
    private static long getOpenSSLHandleForPrivateKey(PrivateKey privateKey) {
        Object a = m37836a(privateKey);
        if (a == null) {
            return 0;
        }
        try {
            Method declaredMethod = a.getClass().getDeclaredMethod("getPkeyContext", new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                long longValue = ((Number) declaredMethod.invoke(a, new Object[0])).longValue();
                declaredMethod.setAccessible(false);
                if (longValue != 0) {
                    return longValue;
                }
                C7893j.m37818b("AndroidKeyStore", "getPkeyContext() returned null", new Object[0]);
                return longValue;
            } catch (Exception e) {
                C7893j.m37818b("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e, new Object[0]);
                return 0;
            } catch (Throwable th) {
                declaredMethod.setAccessible(false);
            }
        } catch (Exception e2) {
            C7893j.m37818b("AndroidKeyStore", "No getPkeyContext() method on OpenSSLKey member:" + e2, new Object[0]);
            return 0;
        }
    }

    @CalledByNative
    private static Object getOpenSSLEngineForPrivateKey(PrivateKey privateKey) {
        try {
            Class cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLEngine");
            Object a = m37836a(privateKey);
            if (a == null) {
                return null;
            }
            try {
                Method declaredMethod = a.getClass().getDeclaredMethod("getEngine", new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    a = declaredMethod.invoke(a, new Object[0]);
                    declaredMethod.setAccessible(false);
                    if (a == null) {
                        C7893j.m37818b("AndroidKeyStore", "getEngine() returned null", new Object[0]);
                    }
                    if (cls.isInstance(a)) {
                        return a;
                    }
                    C7893j.m37818b("AndroidKeyStore", "Engine is not an OpenSSLEngine instance, its class name is:" + a.getClass().getCanonicalName(), new Object[0]);
                    return null;
                } catch (Exception e) {
                    C7893j.m37818b("AndroidKeyStore", "Exception while trying to retrieve OpenSSLEngine object: " + e, new Object[0]);
                    return null;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                }
            } catch (Exception e2) {
                C7893j.m37818b("AndroidKeyStore", "No getEngine() method on OpenSSLKey member:" + e2, new Object[0]);
                return null;
            }
        } catch (Exception e22) {
            C7893j.m37818b("AndroidKeyStore", "Cannot find system OpenSSLEngine class: " + e22, new Object[0]);
            return null;
        }
    }
}
