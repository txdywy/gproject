package com.google.android.wallet.common.util;

import android.content.Context;
import android.provider.Settings.Secure;
import android.util.Base64;
import com.squareup.haha.perflib.HprofParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public final class C6606r {
    public final String f32775a;

    public C6606r(Context context, String str) {
        this.f32775a = C6606r.m29972a(Secure.getString(context.getContentResolver(), "android_id"), str);
    }

    private static String m29972a(String str, String str2) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str2.getBytes("UTF-8"));
            instance.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(instance.digest(), 2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    public static SecretKey m29973a() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(256);
            return instance.generateKey();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] m29976a(Certificate certificate, SecretKey secretKey) {
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            try {
                instance.init(1, certificate.getPublicKey());
                try {
                    byte[] doFinal = instance.doFinal(secretKey.getEncoded());
                    C6606r.m29974a(doFinal);
                    return doFinal;
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                } catch (Throwable e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable e22) {
                throw new CertificateException(e22);
            }
        } catch (Throwable e222) {
            throw new RuntimeException(e222);
        } catch (Throwable e2222) {
            throw new RuntimeException(e2222);
        }
    }

    public static byte[] m29975a(long j, String str, String str2) {
        int i = (int) (j / 1000);
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            if (length != str.length()) {
                throw new IllegalArgumentException("Hashed device ID not 8 bits per char: " + length + " " + str.length());
            } else if (length > HprofParser.ROOT_UNKNOWN) {
                throw new IllegalArgumentException("Hashed device ID too long: " + length);
            } else {
                try {
                    byte[] bytes2 = str2.getBytes("UTF-16LE");
                    int length2 = str2.length();
                    if (length2 > HprofParser.ROOT_UNKNOWN) {
                        throw new IllegalArgumentException("Password too long: " + length2);
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(((length + 5) + 1) + bytes2.length);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    allocate.putInt(i);
                    allocate.put((byte) length);
                    allocate.put(bytes);
                    allocate.put((byte) length2);
                    allocate.put(bytes2);
                    return allocate.array();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] m29977a(SecretKey secretKey, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            try {
                instance.init(1, secretKey, new IvParameterSpec(new byte[16]));
                try {
                    return instance.doFinal(bArr);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                } catch (Throwable e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            } catch (Throwable e222) {
                throw new RuntimeException(e222);
            }
        } catch (Throwable e2222) {
            throw new RuntimeException(e2222);
        } catch (Throwable e22222) {
            throw new RuntimeException(e22222);
        }
    }

    private static void m29974a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int length = (bArr.length - 1) - i;
            byte b = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b;
        }
    }
}
