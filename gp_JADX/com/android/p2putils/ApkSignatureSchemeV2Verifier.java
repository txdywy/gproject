package com.android.p2putils;

import android.support.v4.p037h.C0305a;
import android.util.Pair;
import com.squareup.haha.perflib.HprofParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class ApkSignatureSchemeV2Verifier {

    public class SignatureNotFoundException extends Exception {
        public SignatureNotFoundException(String str) {
            super(str);
        }
    }

    public static X509Certificate[][] m4194a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair a = C0600g.m4212a(randomAccessFile);
            if (a == null) {
                throw new SignatureNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
            }
            ByteBuffer byteBuffer = (ByteBuffer) a.first;
            long longValue = ((Long) a.second).longValue();
            if (C0600g.m4214a(randomAccessFile, longValue)) {
                throw new SignatureNotFoundException("ZIP64 APK not supported");
            }
            long a2 = C0600g.m4210a(byteBuffer);
            if (a2 >= longValue) {
                throw new SignatureNotFoundException("ZIP Central Directory offset out of range: " + a2 + ". ZIP End of Central Directory offset: " + longValue);
            } else if (C0600g.m4215b(byteBuffer) + a2 != longValue) {
                throw new SignatureNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
            } else if (a2 < 32) {
                throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + a2);
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(24);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                randomAccessFile.seek(a2 - ((long) allocate.capacity()));
                randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                    long j = allocate.getLong(0);
                    if (j < ((long) allocate.capacity()) || j > 2147483639) {
                        throw new SignatureNotFoundException("APK Signing Block size out of range: " + j);
                    }
                    int i = (int) (8 + j);
                    long j2 = a2 - ((long) i);
                    if (j2 < 0) {
                        throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j2);
                    }
                    allocate = ByteBuffer.allocate(i);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(j2);
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    long j3 = allocate.getLong(0);
                    if (j3 != j) {
                        throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j3 + " vs " + j);
                    }
                    Pair create = Pair.create(allocate, Long.valueOf(j2));
                    allocate = (ByteBuffer) create.first;
                    X509Certificate[][] a3 = m4195a(randomAccessFile.getChannel(), new C0597d(m4200c(allocate), ((Long) create.second).longValue(), a2, longValue, byteBuffer));
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                    }
                    return a3;
                }
                throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
            }
        }
    }

    private static X509Certificate[][] m4195a(FileChannel fileChannel, C0597d c0597d) {
        Throwable e;
        int i = 0;
        Map c0305a = new C0305a();
        List arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer a = m4188a(c0597d.f3934a);
                while (a.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m4192a(m4188a(a), c0305a, instance));
                    } catch (IOException e2) {
                        e = e2;
                    } catch (BufferUnderflowException e3) {
                        e = e3;
                    } catch (SecurityException e4) {
                        e = e4;
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (c0305a.isEmpty()) {
                    throw new SecurityException("No content digests found");
                } else {
                    m4191a(c0305a, fileChannel, c0597d.f3935b, c0597d.f3936c, c0597d.f3937d, c0597d.f3938e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                }
                throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
            } catch (Throwable e5) {
                throw new SecurityException("Failed to read list of signers", e5);
            }
        } catch (Throwable e52) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e52);
        }
    }

    private static X509Certificate[] m4192a(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        Object obj;
        int a;
        byte[] bArr;
        Throwable e;
        String valueOf;
        Throwable e2;
        ByteBuffer a2 = m4188a(byteBuffer);
        ByteBuffer a3 = m4188a(byteBuffer);
        byte[] b = m4198b(byteBuffer);
        int i = 0;
        int i2 = -1;
        byte[] bArr2 = null;
        List arrayList = new ArrayList();
        while (a3.hasRemaining()) {
            int i3;
            int i4 = i + 1;
            try {
                ByteBuffer a4 = m4188a(a3);
                if (a4.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                i3 = a4.getInt();
                arrayList.add(Integer.valueOf(i3));
                switch (i3) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                    case 513:
                    case 514:
                    case 769:
                        obj = 1;
                        break;
                    default:
                        obj = null;
                        break;
                }
                if (obj == null) {
                    i = i4;
                } else {
                    if (i2 != -1) {
                        i = m4187a(i3);
                        a = m4187a(i2);
                        switch (i) {
                            case 1:
                                switch (a) {
                                    case 1:
                                        obj = null;
                                        break;
                                    case 2:
                                        obj = -1;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown digestAlgorithm2: " + a);
                                }
                            case 2:
                                switch (a) {
                                    case 1:
                                        obj = 1;
                                        break;
                                    case 2:
                                        obj = null;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown digestAlgorithm2: " + a);
                                }
                            default:
                                throw new IllegalArgumentException("Unknown digestAlgorithm1: " + i);
                        }
                        if (obj <= null) {
                            bArr = bArr2;
                            i3 = i2;
                            bArr2 = bArr;
                            i2 = i3;
                            i = i4;
                        }
                    }
                    bArr = m4198b(a4);
                    bArr2 = bArr;
                    i2 = i3;
                    i = i4;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (BufferUnderflowException e4) {
                e = e4;
            }
        }
        if (i2 != -1) {
            String str;
            String str2;
            Pair create;
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                case 513:
                case 514:
                    str = "EC";
                    break;
                case 769:
                    str = "DSA";
                    break;
                default:
                    str2 = "Unknown signature algorithm: 0x";
                    valueOf = String.valueOf(Long.toHexString((long) (i2 & -1)));
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            switch (i2) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                case 513:
                    create = Pair.create("SHA256withECDSA", null);
                    break;
                case 514:
                    create = Pair.create("SHA512withECDSA", null);
                    break;
                case 769:
                    create = Pair.create("SHA256withDSA", null);
                    break;
                default:
                    str2 = "Unknown signature algorithm: 0x";
                    valueOf = String.valueOf(Long.toHexString((long) (i2 & -1)));
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    throw new IllegalArgumentException(valueOf);
            }
            valueOf = (String) create.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(b));
                Signature instance = Signature.getInstance(valueOf);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(a2);
                if (instance.verify(bArr2)) {
                    Object obj2 = null;
                    a2.clear();
                    a3 = m4188a(a2);
                    List arrayList2 = new ArrayList();
                    i = 0;
                    while (a3.hasRemaining()) {
                        i4 = i + 1;
                        try {
                            ByteBuffer a5 = m4188a(a3);
                            if (a5.remaining() < 8) {
                                throw new IOException("Record too short");
                            }
                            a = a5.getInt();
                            arrayList2.add(Integer.valueOf(a));
                            if (a == i2) {
                                obj = m4198b(a5);
                            } else {
                                obj = obj2;
                            }
                            obj2 = obj;
                            i = i4;
                        } catch (IOException e5) {
                            e = e5;
                        } catch (BufferUnderflowException e6) {
                            e = e6;
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        i4 = m4187a(i2);
                        bArr = (byte[]) map.put(Integer.valueOf(i4), obj2);
                        if (bArr == null || MessageDigest.isEqual(bArr, obj2)) {
                            ByteBuffer a6 = m4188a(a2);
                            List arrayList3 = new ArrayList();
                            i = 0;
                            while (a6.hasRemaining()) {
                                i3 = i + 1;
                                byte[] b2 = m4198b(a6);
                                try {
                                    arrayList3.add(new C0599e((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b2)), b2));
                                    i = i3;
                                } catch (Throwable e7) {
                                    throw new SecurityException("Failed to decode certificate #" + i3, e7);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(b, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        }
                        throw new SecurityException(String.valueOf(m4196b(i4)).concat(" contents digest does not match the digest specified by a preceding signer"));
                    }
                    throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                }
                throw new SecurityException(String.valueOf(valueOf).concat(" signature did not verify"));
            } catch (NoSuchAlgorithmException e8) {
                e2 = e8;
                throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Failed to verify ").append(valueOf).append(" signature").toString(), e2);
            } catch (InvalidKeySpecException e9) {
                e2 = e9;
                throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Failed to verify ").append(valueOf).append(" signature").toString(), e2);
            } catch (InvalidKeyException e10) {
                e2 = e10;
                throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Failed to verify ").append(valueOf).append(" signature").toString(), e2);
            } catch (InvalidAlgorithmParameterException e11) {
                e2 = e11;
                throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Failed to verify ").append(valueOf).append(" signature").toString(), e2);
            } catch (SignatureException e12) {
                e2 = e12;
                throw new SecurityException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Failed to verify ").append(valueOf).append(" signature").toString(), e2);
            }
        } else if (i == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
        throw new SecurityException("Failed to parse signature record #" + i4, e7);
        throw new IOException("Failed to parse digest record #" + i4, e7);
    }

    private static void m4191a(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        C0596c c0596c = new C0596c(fileChannel, 0, j);
        C0596c c0596c2 = new C0596c(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        C0600g.m4216c(duplicate);
        int position = duplicate.position() + 16;
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException("uint32 value of out range: " + j);
        }
        duplicate.putInt(position + duplicate.position(), (int) j);
        C0595a c0595a = new C0595a(duplicate);
        int[] iArr = new int[map.size()];
        position = 0;
        for (Integer intValue : map.keySet()) {
            iArr[position] = intValue.intValue();
            position++;
        }
        try {
            byte[][] a = m4193a(iArr, new C0594b[]{c0596c, c0596c2, c0595a});
            int i = 0;
            while (i < iArr.length) {
                position = iArr[i];
                if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(position)), a[i])) {
                    i++;
                } else {
                    throw new SecurityException(String.valueOf(m4196b(position)).concat(" digest of contents did not verify"));
                }
            }
        } catch (Throwable e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[][] m4193a(int[] iArr, C0594b[] c0594bArr) {
        int i;
        long j = 0;
        for (C0594b a : c0594bArr) {
            j += ((a.mo1016a() + 1048576) - 1) / 1048576;
        }
        if (j >= 2097151) {
            throw new DigestException("Too many chunks: " + j);
        }
        int i2 = (int) j;
        byte[][] bArr = new byte[iArr.length][];
        for (i = 0; i < iArr.length; i++) {
            byte[] bArr2 = new byte[((m4199c(iArr[i]) * i2) + 5)];
            bArr2[0] = (byte) 90;
            m4190a(i2, bArr2);
            bArr[i] = bArr2;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = (byte) -91;
        int i3 = 0;
        MessageDigest[] messageDigestArr = new MessageDigest[iArr.length];
        i = 0;
        while (i < iArr.length) {
            String b = m4196b(iArr[i]);
            try {
                messageDigestArr[i] = MessageDigest.getInstance(b);
                i++;
            } catch (Throwable e) {
                throw new RuntimeException(String.valueOf(b).concat(" digest not supported"), e);
            }
        }
        int length = c0594bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            C0594b c0594b = c0594bArr[i4];
            int i6 = i3;
            long j2 = 0;
            j = c0594b.mo1016a();
            while (j > 0) {
                i2 = (int) Math.min(j, 1048576);
                m4190a(i2, bArr3);
                for (MessageDigest update : messageDigestArr) {
                    update.update(bArr3);
                }
                try {
                    c0594b.mo1017a(messageDigestArr, j2, i2);
                    for (i = 0; i < iArr.length; i++) {
                        int i7 = iArr[i];
                        byte[] bArr4 = bArr[i];
                        i7 = m4199c(i7);
                        MessageDigest messageDigest = messageDigestArr[i];
                        int digest = messageDigest.digest(bArr4, (i6 * i7) + 5, i7);
                        if (digest != i7) {
                            b = messageDigest.getAlgorithm();
                            throw new RuntimeException(new StringBuilder(String.valueOf(b).length() + 46).append("Unexpected output size of ").append(b).append(" digest: ").append(digest).toString());
                        }
                    }
                    j2 += (long) i2;
                    i6++;
                    j -= (long) i2;
                } catch (Throwable e2) {
                    throw new DigestException("Failed to digest chunk #" + i6 + " of section #" + i5, e2);
                }
            }
            i4++;
            i5++;
            i3 = i6;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        i = 0;
        while (i < iArr.length) {
            int i8 = iArr[i];
            byte[] bArr6 = bArr[i];
            Object b2 = m4196b(i8);
            try {
                bArr5[i] = MessageDigest.getInstance(b2).digest(bArr6);
                i++;
            } catch (Throwable e22) {
                throw new RuntimeException(String.valueOf(b2).concat(" digest not supported"), e22);
            }
        }
        return bArr5;
    }

    private static int m4187a(int i) {
        switch (i) {
            case 257:
            case 259:
            case 513:
            case 769:
                return 1;
            case 258:
            case 260:
            case 514:
                return 2;
            default:
                String str = "Unknown signature algorithm: 0x";
                String valueOf = String.valueOf(Long.toHexString((long) (i & -1)));
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private static String m4196b(int i) {
        switch (i) {
            case 1:
                return "SHA-256";
            case 2:
                return "SHA-512";
            default:
                throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
    }

    private static int m4199c(int i) {
        switch (i) {
            case 1:
                return 32;
            case 2:
                return 64;
            default:
                throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
    }

    private static ByteBuffer m4189a(ByteBuffer byteBuffer, int i) {
        if (i < 8) {
            throw new IllegalArgumentException("end < start: " + i + " < 8");
        }
        int capacity = byteBuffer.capacity();
        if (i > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i + " > " + capacity);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    private static ByteBuffer m4197b(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("size: " + i);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = position + i;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer m4188a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            return m4197b(byteBuffer, i);
        } else {
            throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
        }
    }

    private static byte[] m4198b(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i > byteBuffer.remaining()) {
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        } else {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
    }

    private static void m4190a(int i, byte[] bArr) {
        bArr[1] = (byte) (i & HprofParser.ROOT_UNKNOWN);
        bArr[2] = (byte) ((i >>> 8) & HprofParser.ROOT_UNKNOWN);
        bArr[3] = (byte) ((i >>> 16) & HprofParser.ROOT_UNKNOWN);
        bArr[4] = (byte) ((i >>> 24) & HprofParser.ROOT_UNKNOWN);
    }

    private static ByteBuffer m4200c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        ByteBuffer a = m4189a(byteBuffer, byteBuffer.capacity() - 24);
        int i = 0;
        while (a.hasRemaining()) {
            i++;
            if (a.remaining() < 8) {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = a.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int position = a.position() + i2;
            if (i2 > a.remaining()) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + a.remaining());
            } else if (a.getInt() == 1896449818) {
                return m4197b(a, i2 - 4);
            } else {
                a.position(position);
            }
        }
        throw new SignatureNotFoundException("No APK Signature Scheme v2 block in APK Signing Block");
    }
}
