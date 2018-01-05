package org.keyczar.p572d;

import com.squareup.haha.perflib.HprofParser;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.keyczar.exceptions.KeyczarException;

public final class C7996b {
    public static final ConcurrentLinkedQueue f41009a = new ConcurrentLinkedQueue();

    public static byte[] m38195a(byte[] bArr) {
        int i = 0;
        while (i < bArr.length && bArr[i] == (byte) 0) {
            i++;
        }
        if (i == 0) {
            return bArr;
        }
        Object obj = new byte[(bArr.length - i)];
        System.arraycopy(bArr, i, obj, 0, obj.length);
        return obj;
    }

    public static byte[] m38193a(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static byte[] m38196a(byte[]... bArr) {
        MessageDigest messageDigest = (MessageDigest) f41009a.poll();
        if (messageDigest == null) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-1");
            } catch (Throwable e) {
                throw new KeyczarException(e);
            }
        }
        for (byte[] bArr2 : bArr) {
            messageDigest.update(C7996b.m38193a(bArr2.length));
            messageDigest.update(bArr2);
        }
        byte[] digest = messageDigest.digest();
        f41009a.add(messageDigest);
        return digest;
    }

    public static byte[] m38198b(byte[]... bArr) {
        MessageDigest messageDigest = (MessageDigest) f41009a.poll();
        if (messageDigest == null) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-1");
            } catch (Throwable e) {
                throw new KeyczarException(e);
            }
        }
        for (byte[] update : bArr) {
            messageDigest.update(update);
        }
        byte[] digest = messageDigest.digest();
        f41009a.add(messageDigest);
        return digest;
    }

    public static int m38197b(byte[] bArr) {
        return (((((bArr[0] & HprofParser.ROOT_UNKNOWN) << 24) | 0) | ((bArr[1] & HprofParser.ROOT_UNKNOWN) << 16)) | ((bArr[2] & HprofParser.ROOT_UNKNOWN) << 8)) | (bArr[3] & HprofParser.ROOT_UNKNOWN);
    }

    public static boolean m38192a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            if (bArr == bArr2) {
                return true;
            }
            return false;
        } else if (bArr.length != bArr2.length) {
            return false;
        } else {
            int i = 0;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                i = (byte) (i | (bArr[i2] ^ bArr2[i2]));
            }
            if (i == 0) {
                return true;
            }
            return false;
        }
    }

    public static byte[] m38194a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static BigInteger m38191a(String str) {
        return new BigInteger(C7995a.m38189a(str));
    }

    public static Enum m38190a(Class cls, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return Enum.valueOf(cls, str);
    }

    static {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
    }
}
