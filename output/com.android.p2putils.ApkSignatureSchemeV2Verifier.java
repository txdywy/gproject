package com.android.p2putils;

import android.support.v4.h.a;
import android.util.Pair;
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
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

private static class ApkSignatureSchemeV2Verifier
{

    private static int a(int p0) {
        switch (p0) {
            case 257:
                v0 = 1;
                break;
            case 258:
                v0 = 2;
                break;
            case 259:
                v0 = 1;
                break;
            case 260:
                v0 = 2;
                break;
            case 513:
                v0 = 1;
                break;
            case 514:
                v0 = 2;
                break;
            case 769:
                v0 = 1;
                break;
            default:
                v0 = String.valueOf(Long.toHexString((long)(p0 & -1)));
                if (v0.length() != 0)
                    v0 = "Unknown signature algorithm: 0x".concat(v0);
                else
                    v0 = new String("Unknown signature algorithm: 0x");
                throw new IllegalArgumentException(v0);
        }
        return v0;
    }

    private static ByteBuffer a(ByteBuffer p0) {
        if (p0.remaining() < 4)
            throw new IOException(93 + "Remaining buffer too short to contain length of length-prefixed field. Remaining: " + p0.remaining());
        v0 = p0.getInt();
        if (v0 < 0)
            throw new IllegalArgumentException("Negative length");
        if (v0 > p0.remaining())
            throw new IOException(101 + "Length-prefixed field longer than remaining buffer. Field length: " + v0 + ", remaining: " + p0.remaining());
        return ApkSignatureSchemeV2Verifier.b(p0, v0);
    }

    private static ByteBuffer a(ByteBuffer p0, int p1) {
        if (p1 < 8)
            throw new IllegalArgumentException(38 + "end < start: " + p1 + " < 8");
        if (p1 > p0.capacity())
            throw new IllegalArgumentException(41 + "end > capacity: " + p1 + " > " + p0.capacity());
        v1 = p0.limit();
        v2 = p0.position();
        try {
            p0.position(0);
            p0.limit(p1);
            p0.position(8);
            v0 = p0.slice();
            v0.order(p0.order());
        }
        catch (Throwable ex) {
            p0.position(0);
            p0.limit(v1);
            p0.position(v2);
            throw ex;
        }
        p0.position(0);
        p0.limit(v1);
        p0.position(v2);
        return v0;
    }

    private static void a(int p0, byte[] p1) {
        p1[1] = (byte)(p0 & 255);
        p1[2] = (byte)(p0 >>> 8 & 255);
        p1[3] = (byte)(p0 >>> 16 & 255);
        p1[4] = (byte)(p0 >>> 24 & 255);
    }

    private static void a(Map p0, FileChannel p1, long p2, long p4, long p6, ByteBuffer p8) {
        if (p0.isEmpty())
            throw new SecurityException("No digests provided");
        v1 = p8.duplicate();
        v1.order(ByteOrder.LITTLE_ENDIAN);
        com.android.p2putils.g.c(v1);
        if (p2 < 0 || p2 > 4294967295)
            throw new IllegalArgumentException(47 + "uint32 value of out range: " + p2);
        v1.putInt(v1.position() + 16 + v1.position(), (int)p2);
        v4 = new com.android.p2putils.a(v1);
        v5 = new int[p0.size()];
        v6 = p0.keySet().iterator();
        v3 = 0;
        while (v6.hasNext()) {
            v5[v3] = ((Integer)v6.next()).intValue();
            v3 = v3 + 1;
        }
        try {
            v1 = new b[3];
            v1[0] = new com.android.p2putils.c(p1, 0, p2);
            v1[1] = new com.android.p2putils.c(p1, p4, p6 - p4);
            v1[2] = v4;
            v2 = ApkSignatureSchemeV2Verifier.a(v5, v1);
        }
        catch (DigestException ex) {
            throw new SecurityException("Failed to compute digest(s) of contents", ex);
        }
        v1 = 0;
        while (v1 < v5.length) {
            if (!MessageDigest.isEqual((byte[])p0.get(Integer.valueOf(v5[v1])), v2[v1]))
                throw new SecurityException(String.valueOf(ApkSignatureSchemeV2Verifier.b(v5[v1])).concat(" digest of contents did not verify"));
            v1 = v1 + 1;
        }
    }

    private static X509Certificate[] a(ByteBuffer p0, Map p1, CertificateFactory p2) {
  0:    v9 = ApkSignatureSchemeV2Verifier.a(p0);
  4:    v3 = ApkSignatureSchemeV2Verifier.a(p0);
  8:    v10 = ApkSignatureSchemeV2Verifier.b(p0);
 12:    v0 = 0;
 13:    v7 = -1;
 14:    v6 = 0;
 17:    v11 = new ArrayList();
 24:    if (!v3.hasRemaining()) goto 218;
 26:    v2 = v0 + 1;
 28:    try {
 28:        v4 = ApkSignatureSchemeV2Verifier.a(v3);
 38:        if (v4.remaining() < 8)
 47:            throw new SecurityException("Signature record too short");
        }
        catch (IOException ex) {
 48:        v0 = ex;
 75:        throw new SecurityException(45 + "Failed to parse signature record #" + v2, v0);
        }
        catch (BufferUnderflowException ex) {
138:        v0 = ex;
139:        throw new SecurityException(45 + "Failed to parse signature record #" + v2, v0);
        }
 39:    goto 76;
 48:    v0 = ex;
 75:    throw new SecurityException(45 + "Failed to parse signature record #" + v2, v0);
 76:    v1 = v4.getInt();
 84:    v11.add(Integer.valueOf(v1));
 87:    switch (v1) {
            case 257:
 87:            goto 95;
            case 258:
 87:            goto 95;
            case 259:
 87:            goto 95;
            case 260:
 87:            goto 95;
            case 513:
 87:            goto 95;
            case 514:
 87:            goto 95;
            case 769:
 87:            goto 95;
            default:
        }
 90:    v0 = 0;
 91:    if (v0 != 0) goto 97;
 93:    v0 = v2;
 94:    goto 20;
 95:    v0 = 1;
 96:    goto 91;
 98:    if (v7 == -1) goto 173;
100:    v0 = ApkSignatureSchemeV2Verifier.a(v1);
104:    v5 = ApkSignatureSchemeV2Verifier.a(v7);
108:    switch (v0) {
            case 1:
108:            goto 140;
            case 2:
108:            goto 184;
            default:
        }
137:    throw new IllegalArgumentException(37 + "Unknown digestAlgorithm1: " + v0);
138:    v0 = ex;
139:    throw new SecurityException(45 + "Failed to parse signature record #" + v2, v0);
140:    switch (v5) {
            case 1:
140:            goto 170;
            case 2:
140:            goto 182;
            default:
        }
169:    throw new IllegalArgumentException(37 + "Unknown digestAlgorithm2: " + v5);
170:    v0 = 0;
171:    if (v0 <= 0) goto 806;
173:    v0 = ApkSignatureSchemeV2Verifier.b(v4);
177:    v6 = v0;
178:    v7 = v1;
179:    v0 = v2;
180:    goto 20;
182:    v0 = -1;
183:    goto 171;
184:    switch (v5) {
            case 1:
214:            v0 = 1;
815:            break;
            case 2:
216:            v0 = 0;
815:            break;
            default:
213:            throw new IllegalArgumentException(37 + "Unknown digestAlgorithm2: " + v5);
        }
219:    if (v7 == -1) {
221:        if (v0 == 0)
230:            throw new SecurityException("No signatures found");
238:        throw new SecurityException("No supported signatures found");
        }
239:    switch (v7) {
            case 257:
273:            v8 = "RSA";
815:            break;
            case 258:
273:            v8 = "RSA";
815:            break;
            case 259:
273:            v8 = "RSA";
815:            break;
            case 260:
273:            v8 = "RSA";
815:            break;
            case 513:
308:            v8 = "EC";
815:            break;
            case 514:
308:            v8 = "EC";
815:            break;
            case 769:
312:            v8 = "DSA";
815:            break;
            default:
253:            v0 = String.valueOf(Long.toHexString((long)(v7 & -1)));
261:            if (v0.length() != 0)
263:                v0 = "Unknown signature algorithm: 0x".concat(v0);
                else
316:                v0 = new String("Unknown signature algorithm: 0x");
270:            throw new IllegalArgumentException(v0);
        }
274:    switch (v7) {
            case 257:
340:            v1 = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
815:            break;
            case 258:
419:            v1 = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
815:            break;
            case 259:
428:            v1 = Pair.create("SHA256withRSA", 0);
815:            break;
            case 260:
437:            v1 = Pair.create("SHA512withRSA", 0);
815:            break;
            case 513:
446:            v1 = Pair.create("SHA256withECDSA", 0);
815:            break;
            case 514:
455:            v1 = Pair.create("SHA512withECDSA", 0);
815:            break;
            case 769:
464:            v1 = Pair.create("SHA256withDSA", 0);
815:            break;
            default:
288:            v0 = String.valueOf(Long.toHexString((long)(v7 & -1)));
296:            if (v0.length() != 0)
298:                v0 = "Unknown signature algorithm: 0x".concat(v0);
                else
468:                v0 = new String("Unknown signature algorithm: 0x");
305:            throw new IllegalArgumentException(v0);
        }
343:    v0 = (String)v1.first;
349:    try {
362:        v3 = Signature.getInstance(v0);
366:        v3.initVerify(KeyFactory.getInstance(v8).generatePublic(new X509EncodedKeySpec(v10)));
369:        if ((AlgorithmParameterSpec)v1.second != 0)
371:            v3.setParameter((AlgorithmParameterSpec)v1.second);
374:        v3.update(v9);
        }
        catch (NoSuchAlgorithmException ex) {
791:        v1 = ex;
792:        throw new SecurityException((String.valueOf(v0).length() + 27) + "Failed to verify " + v0 + " signature", v1);
        }
        catch (InvalidKeySpecException ex) {
800:        v1 = ex;
801:        throw new SecurityException((String.valueOf(v0).length() + 27) + "Failed to verify " + v0 + " signature", v1);
        }
        catch (InvalidKeyException ex) {
794:        v1 = ex;
795:        throw new SecurityException((String.valueOf(v0).length() + 27) + "Failed to verify " + v0 + " signature", v1);
        }
        catch (InvalidAlgorithmParameterException ex) {
473:        v1 = ex;
514:        throw new SecurityException((String.valueOf(v0).length() + 27) + "Failed to verify " + v0 + " signature", v1);
        }
        catch (SignatureException ex) {
797:        v1 = ex;
798:        throw new SecurityException((String.valueOf(v0).length() + 27) + "Failed to verify " + v0 + " signature", v1);
        }
381:    if (!v3.verify(v6))
398:        throw new SecurityException(String.valueOf(v0).concat(" signature did not verify"));
382:    goto 515;
515:    v1 = 0;
516:    v9.clear();
519:    v3 = ApkSignatureSchemeV2Verifier.a(v9);
525:    v4 = new ArrayList();
528:    v0 = 0;
529:    while (true) {
533:        if (!v3.hasRemaining()) {
609:            if (!v11.equals(v4))
618:                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
619:            v2 = ApkSignatureSchemeV2Verifier.a(v7);
631:            v0 = (byte[])p1.put(Integer.valueOf(v2), v1);
633:            if (v0 != 0 && !MessageDigest.isEqual(v0, v1))
660:                throw new SecurityException(String.valueOf(ApkSignatureSchemeV2Verifier.b(v2)).concat(" contents digest does not match the digest specified by a preceding signer"));
661:            v2 = ApkSignatureSchemeV2Verifier.a(v9);
667:            v3 = new ArrayList();
670:            v0 = 0;
671:            while (v2.hasRemaining()) {
679:                v4 = ApkSignatureSchemeV2Verifier.b(v2);
683:                try {
                    }
                    catch (CertificateException ex) {
731:                    throw new SecurityException(41 + "Failed to decode certificate #" + v1, ex);
                    }
699:                v3.add(new com.android.p2putils.e((X509Certificate)p2.generateCertificate(new ByteArrayInputStream(v4)), v4));
702:                v0 = v0 + 1;
                }
736:            if (v3.isEmpty())
745:                throw new SecurityException("No certificates listed");
765:            if (!Arrays.equals(v10, ((X509Certificate)v3.get(0)).getPublicKey().getEncoded()))
774:                throw new SecurityException("Public key mismatch between certificate and signature record");
787:            return (X509Certificate[])v3.toArray(new X509Certificate[v3.size()]);
            }
535:        v2 = v0 + 1;
537:        try {
537:            v0 = ApkSignatureSchemeV2Verifier.a(v3);
547:            if (v0.remaining() < 8)
556:                throw new IOException("Record too short");
            }
            catch (IOException ex) {
557:            v0 = ex;
584:            throw new IOException(42 + "Failed to parse digest record #" + v2, v0);
            }
            catch (BufferUnderflowException ex) {
788:            v0 = ex;
789:            throw new IOException(42 + "Failed to parse digest record #" + v2, v0);
            }
585:        try {
585:            v5 = v0.getInt();
593:            v4.add(Integer.valueOf(v5));
596:            if (v5 == v7)
598:                v0 = ApkSignatureSchemeV2Verifier.b(v0);
                else
803:                v0 = v1;
            }
            catch (IOException ex) {
557:            v0 = ex;
584:            throw new IOException(42 + "Failed to parse digest record #" + v2, v0);
            }
            catch (BufferUnderflowException ex) {
788:            v0 = ex;
789:            throw new IOException(42 + "Failed to parse digest record #" + v2, v0);
            }
602:        v1 = v0;
603:        v0 = v2;
        }
604:    goto -1;
806:    v0 = v6;
807:    v1 = v7;
808:    goto 177;
813:    try
            run 76...214
        catch (IOException ex) {
 76:        goto 48;
        }
        catch (BufferUnderflowException ex) {
 76:        goto 138;
        }
    }

    private static byte[][] a(int[] p0, b[] p1) {
        v6 = 0;
        v4 = 0;
        while (v4 < p1.length) {
            v6 = v6 + (p1[v4].a() + 1048576 - 1) / 1048576;
            v4 = v4 + 1;
        }
        if (v6 >= 2097151)
            throw new DigestException(37 + "Too many chunks: " + v6);
        v5 = (int)v6;
        v13 = new byte[p0.length][];
        v4 = 0;
        while (v4 < p0.length) {
            v6 = new byte[ApkSignatureSchemeV2Verifier.c(p0[v4]) * v5 + 5];
            v6[0] = 90;
            ApkSignatureSchemeV2Verifier.a(v5, v6);
            v13[v4] = v6;
            v4 = v4 + 1;
        }
        v14 = new byte[5];
        v14[0] = -91;
        v8 = 0;
        v15 = new MessageDigest[p0.length];
        v4 = 0;
        while (v4 < p0.length) {
            v5 = ApkSignatureSchemeV2Verifier.b(p0[v4]);
            try {
                v15[v4] = MessageDigest.getInstance(v5);
            }
            catch (NoSuchAlgorithmException ex) {
                throw new RuntimeException(String.valueOf(v5).concat(" digest not supported"), ex);
            }
            v4 = v4 + 1;
        }
        v0 = p1.length;
        v11 = 0;
        v12 = 0;
        while (true) {
            v0 = v0;
            if (v11 >= v0)
                break;
            v10 = v8;
            v8 = 0;
            v6 = p1[v11].a();
            while (v6 > 0) {
                v5 = (int)Math.min(v6, 1048576);
                ApkSignatureSchemeV2Verifier.a(v5, v14);
                v4 = 0;
                while (v4 < v15.length) {
                    v15[v4].update(v14);
                    v4 = v4 + 1;
                }
                try {
                    p1[v11].a(v15, v8, v5);
                }
                catch (IOException ex) {
                    throw new DigestException(59 + "Failed to digest chunk #" + v10 + " of section #" + v12, ex);
                }
                v4 = 0;
                while (true) {
                    v0 = p0.length;
                    if (v4 >= v0)
                        break;
                    v18 = ApkSignatureSchemeV2Verifier.c(p0[v4]);
                    v19 = v15[v4].digest(v13[v4], v10 * v18 + 5, v18);
                    if (v19 != v18) {
                        v5 = v15[v4].getAlgorithm();
                        throw new RuntimeException((String.valueOf(v5).length() + 46) + "Unexpected output size of " + v5 + " digest: " + v19);
                    }
                    v4 = v4 + 1;
                }
                v8 = v8 + (long)v5;
                v10 = v10 + 1;
                v6 = v6 - (long)v5;
            }
            v11 = v11 + 1;
            v12 = v12 + 1;
            v8 = v10;
        }
        v5 = new byte[p0.length][];
        v4 = 0;
        while (v4 < p0.length) {
            try {
            }
            catch (NoSuchAlgorithmException ex) {
                throw new RuntimeException(String.valueOf(v6).concat(" digest not supported"), ex);
            }
            v5[v4] = MessageDigest.getInstance(ApkSignatureSchemeV2Verifier.b(p0[v4])).digest(v13[v4]);
            v4 = v4 + 1;
        }
        return v5;
    }

    public static X509Certificate[][] a(String p0) {
        v9 = new RandomAccessFile(p0, "r");
        try {
            v0 = com.android.p2putils.g.a(v9);
            if (v0 != 0) {
                try {
                    v8 = (ByteBuffer)v0.first;
                    v6 = ((Long)v0.second).longValue();
                    if (com.android.p2putils.g.a(v9, v6))
                        throw new Exception("ZIP64 APK not supported") {
                        };
                    v4 = com.android.p2putils.g.a(v8);
                    if (v4 >= v6)
                        throw new Exception(122 + "ZIP Central Directory offset out of range: " + v4 + ". ZIP End of Central Directory offset: " + v6) {
                        };
                    if (com.android.p2putils.g.b(v8) + v4 != v6)
                        throw new Exception("ZIP Central Directory is not immediately followed by End of Central Directory") {
                        };
                    if (v4 < 32)
                        throw new Exception(87 + "APK too small for APK Signing Block. ZIP Central Directory offset: " + v4) {
                        };
                    v0 = ByteBuffer.allocate(24);
                    v0.order(ByteOrder.LITTLE_ENDIAN);
                    v9.seek(v4 - (long)v0.capacity());
                    v9.readFully(v0.array(), v0.arrayOffset(), v0.capacity());
                    if (v0.getLong(8) != 2334950737559900225 || v0.getLong(16) != 3617552046287187010)
                        throw new Exception("No APK Signing Block before ZIP Central Directory") {
                        };
                    v2 = v0.getLong(0);
                    if (v2 < (long)v0.capacity() || v2 > 2147483639)
                        throw new Exception(57 + "APK Signing Block size out of range: " + v2) {
                        };
                    if (v4 - (long)(int)(8 + v2) < 0)
                        throw new Exception(59 + "APK Signing Block offset out of range: " + (v4 - (long)(int)(8 + v2))) {
                        };
                    v0 = ByteBuffer.allocate((int)(8 + v2));
                    v0.order(ByteOrder.LITTLE_ENDIAN);
                    v9.seek(v4 - (long)(int)(8 + v2));
                    v9.readFully(v0.array(), v0.arrayOffset(), v0.capacity());
                    v12 = v0.getLong(0);
                    if (v12 != v2)
                        throw new Exception(103 + "APK Signing Block sizes in header and footer do not match: " + v12 + " vs " + v2) {
                        };
                    v1 = Pair.create(v0, Long.valueOf(v4 - (long)(int)(8 + v2)));
                    v9.close();
                }
                catch (Throwable ex) {
                    try {
                        v9.close();
                    }
                    catch (IOException ex) {
                    }
                    throw ex;
                }
                try {
                    v9.close();
                }
                catch (IOException ex) {
                }
                return ApkSignatureSchemeV2Verifier.a(v9.getChannel(), new com.android.p2putils.d(ApkSignatureSchemeV2Verifier.c((ByteBuffer)v1.first), ((Long)v1.second).longValue(), v4, v6, v8));
            }
            throw new Exception("Not an APK file: ZIP End of Central Directory record not found") {
            };
        }
        catch (Throwable ex) {
            try {
                v9.close();
            }
            catch (IOException ex) {
            }
            throw ex;
        }
    }

    private static X509Certificate[][] a(FileChannel p0, com.android.p2putils.d p1) {
        v1 = 0;
        v0 = new android.support.v4.h.a();
        v9 = new ArrayList();
        try {
            try {
                v3 = ApkSignatureSchemeV2Verifier.a(p1.a);
            }
            catch (IOException ex) {
                throw new SecurityException("Failed to read list of signers", ex);
            }
        }
        catch (CertificateException ex) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", ex);
        }
        while (true) {
            if (!v3.hasRemaining()) {
                if (v1 <= 0)
                    throw new SecurityException("No signers found");
                if (v0.isEmpty())
                    throw new SecurityException("No content digests found");
                ApkSignatureSchemeV2Verifier.a(v0, p0, p1.b, p1.c, p1.d, p1.e);
                return (X509Certificate[][])v9.toArray(new X509Certificate[v9.size()][]);
            }
            v1 = v1 + 1;
            try {
                v9.add(ApkSignatureSchemeV2Verifier.a(ApkSignatureSchemeV2Verifier.a(v3), v0, CertificateFactory.getInstance("X.509")));
            }
            catch (IOException ex) {
                v0 = ex;
                throw new SecurityException(48 + "Failed to parse/verify signer #" + v1 + " block", v0);
            }
            catch (BufferUnderflowException ex) {
                v0 = ex;
                throw new SecurityException(48 + "Failed to parse/verify signer #" + v1 + " block", v0);
            }
            catch (SecurityException ex) {
                v0 = ex;
                throw new SecurityException(48 + "Failed to parse/verify signer #" + v1 + " block", v0);
            }
        }
    }

    private static String b(int p0) {
        switch (p0) {
            case 1:
                v0 = "SHA-256";
                break;
            case 2:
                v0 = "SHA-512";
                break;
            default:
                throw new IllegalArgumentException(44 + "Unknown content digest algorthm: " + p0);
        }
        return v0;
    }

    private static ByteBuffer b(ByteBuffer p0, int p1) {
        if (p1 < 0)
            throw new IllegalArgumentException(17 + "size: " + p1);
        v1 = p0.limit();
        v0 = p0.position();
        v2 = v0 + p1;
        if (v2 < v0 || v2 > v1)
            throw new BufferUnderflowException();
        p0.limit(v2);
        try {
            v0 = p0.slice();
            v0.order(p0.order());
            p0.position(v2);
        }
        catch (Throwable ex) {
            p0.limit(v1);
            throw ex;
        }
        p0.limit(v1);
        return v0;
    }

    private static byte[] b(ByteBuffer p0) {
        v0 = p0.getInt();
        if (v0 < 0)
            throw new IOException("Negative length");
        if (v0 > p0.remaining())
            throw new IOException(90 + "Underflow while reading length-prefixed value. Length: " + v0 + ", available: " + p0.remaining());
        v0 = new byte[v0];
        p0.get(v0);
        return v0;
    }

    private static int c(int p0) {
        switch (p0) {
            case 1:
                v0 = 32;
                break;
            case 2:
                v0 = 64;
                break;
            default:
                throw new IllegalArgumentException(44 + "Unknown content digest algorthm: " + p0);
        }
        return v0;
    }

    private static ByteBuffer c(ByteBuffer p0) {
        if (p0.order() != ByteOrder.LITTLE_ENDIAN)
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        v1 = ApkSignatureSchemeV2Verifier.a(p0, p0.capacity() - 24);
        v0 = 0;
        while (v1.hasRemaining()) {
            v0 = v0 + 1;
            if (v1.remaining() < 8)
                throw new Exception(70 + "Insufficient data to read size of APK Signing Block entry #" + v0) {
                };
            v2 = v1.getLong();
            if (v2 < 4 || v2 > 2147483647)
                throw new Exception(76 + "APK Signing Block entry #" + v0 + " size out of range: " + v2) {
                };
            if ((int)v2 > v1.remaining())
                throw new Exception(91 + "APK Signing Block entry #" + v0 + " size out of range: " + (int)v2 + ", available: " + v1.remaining()) {
                };
            if (v1.getInt() == 1896449818)
                return ApkSignatureSchemeV2Verifier.b(v1, (int)v2 - 4);
            v1.position(v1.position() + (int)v2);
        }
        throw new Exception("No APK Signature Scheme v2 block in APK Signing Block") {
        };
    }

}
