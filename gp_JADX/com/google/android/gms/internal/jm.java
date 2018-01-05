package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class jm {
    public static Cipher f27063a = null;
    public static final Object f27064b = new Object();
    public static final Object f27065c = new Object();

    public static String m24959a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 16) {
            throw new zzcy();
        }
        try {
            byte[] doFinal;
            byte[] iv;
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f27064b) {
                m24960a().init(1, secretKeySpec, null);
                doFinal = m24960a().doFinal(bArr2);
                iv = m24960a().getIV();
            }
            int length = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            doFinal = new byte[length];
            allocate.get(doFinal);
            return eb.m24315a(doFinal, false);
        } catch (Throwable e) {
            throw new zzcy(e);
        } catch (Throwable e2) {
            throw new zzcy(e2);
        } catch (Throwable e22) {
            throw new zzcy(e22);
        } catch (Throwable e222) {
            throw new zzcy(e222);
        } catch (Throwable e2222) {
            throw new zzcy(e2222);
        }
    }

    private static Cipher m24960a() {
        Cipher cipher;
        synchronized (f27065c) {
            if (f27063a == null) {
                f27063a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f27063a;
        }
        return cipher;
    }

    public static byte[] m24961a(String str) {
        try {
            byte[] a = eb.m24316a(str, false);
            if (a.length != 32) {
                throw new zzcy();
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            for (int i = 0; i < 16; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            return bArr;
        } catch (Throwable e) {
            throw new zzcy(e);
        }
    }

    public static byte[] m24962a(byte[] bArr, String str) {
        if (bArr.length != 16) {
            throw new zzcy();
        }
        try {
            byte[] a = eb.m24316a(str, false);
            if (a.length <= 16) {
                throw new zzcy();
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            a = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(a);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f27064b) {
                m24960a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                a = m24960a().doFinal(a);
            }
            return a;
        } catch (Throwable e) {
            throw new zzcy(e);
        } catch (Throwable e2) {
            throw new zzcy(e2);
        } catch (Throwable e22) {
            throw new zzcy(e22);
        } catch (Throwable e222) {
            throw new zzcy(e222);
        } catch (Throwable e2222) {
            throw new zzcy(e2222);
        } catch (Throwable e22222) {
            throw new zzcy(e22222);
        } catch (Throwable e222222) {
            throw new zzcy(e222222);
        }
    }
}
