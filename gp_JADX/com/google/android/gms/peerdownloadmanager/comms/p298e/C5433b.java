package com.google.android.gms.peerdownloadmanager.comms.p298e;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.crypto.SecretKey;

public final class C5433b {
    public final C5434c f28090a = new C5434c(this);
    public final C5435d f28091b = new C5435d(this);
    public final DataOutputStream f28092c;
    public final DataInputStream f28093d;
    public SecretKey f28094e;
    public C5432a f28095f;
    public C5432a f28096g;

    public C5433b(InputStream inputStream, OutputStream outputStream) {
        this.f28093d = new DataInputStream(inputStream);
        this.f28092c = new DataOutputStream(outputStream);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] m26258a() {
        /*
        r6 = this;
        r0 = r6.f28094e;
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r0 = new java.lang.IllegalStateException;
        r1 = "you may only call this once";
        r0.<init>(r1);
        throw r0;
    L_0x000c:
        r0 = "EC";
        r0 = java.security.KeyPairGenerator.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = new java.security.spec.ECGenParameterSpec;	 Catch:{ InvalidAlgorithmParameterException -> 0x00b5, NoSuchAlgorithmException -> 0x00c2, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = "prime256v1";
        r1.<init>(r2);	 Catch:{ InvalidAlgorithmParameterException -> 0x00b5, NoSuchAlgorithmException -> 0x00c2, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r0.initialize(r1);	 Catch:{ InvalidAlgorithmParameterException -> 0x00b5, NoSuchAlgorithmException -> 0x00c2, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
    L_0x001c:
        r0 = r0.generateKeyPair();	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = r0.getPublic();	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = r1.getEncoded();	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = r6.f28092c;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r3 = r1.length;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2.writeInt(r3);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = r6.f28092c;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2.write(r1);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = r6.f28092c;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1.flush();	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = r6.f28093d;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = r1.readInt();	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = new byte[r1];	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = r6.f28093d;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2.readFully(r1);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = "EC";
        r2 = java.security.KeyFactory.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r3 = new java.security.spec.X509EncodedKeySpec;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r3.<init>(r1);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = r2.generatePublic(r3);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = "ECDH";
        r2 = javax.crypto.KeyAgreement.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r0 = r0.getPrivate();	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2.init(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r0 = 1;
        r2.doPhase(r1, r0);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r0 = r2.generateSecret();	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = "AES";
        r1.<init>(r0, r2);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r6.f28094e = r1;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = "AES/CTR/NoPadding";
        r1 = javax.crypto.Cipher.getInstance(r1);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = 1;
        r3 = r6.f28094e;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1.init(r2, r3);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = new com.google.android.gms.peerdownloadmanager.comms.e.a;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2.<init>(r1);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r6.f28096g = r2;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = r6.f28092c;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = r1.getIV();	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2.write(r1);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = r6.f28092c;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1.flush();	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = 16;
        r1 = new byte[r1];	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = r6.f28093d;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2.readFully(r1);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = "AES/CTR/NoPadding";
        r2 = javax.crypto.Cipher.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r3 = 1;
        r4 = r6.f28094e;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r5 = new javax.crypto.spec.IvParameterSpec;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r5.<init>(r1);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2.init(r3, r4, r5);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1 = new com.google.android.gms.peerdownloadmanager.comms.e.a;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r1.<init>(r2);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r6.f28095f = r1;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        return r0;
    L_0x00b5:
        r1 = move-exception;
        r1 = new java.security.spec.ECGenParameterSpec;	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r2 = "secp256r1";
        r1.<init>(r2);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        r0.initialize(r1);	 Catch:{ NoSuchAlgorithmException -> 0x00c2, InvalidAlgorithmParameterException -> 0x00cb, InvalidKeyException -> 0x00cf, InvalidKeySpecException -> 0x00d1, NoSuchPaddingException -> 0x00cd }
        goto L_0x001c;
    L_0x00c2:
        r0 = move-exception;
    L_0x00c3:
        r1 = new java.lang.IllegalStateException;
        r2 = "unable to initialize cipher";
        r1.<init>(r2, r0);
        throw r1;
    L_0x00cb:
        r0 = move-exception;
        goto L_0x00c3;
    L_0x00cd:
        r0 = move-exception;
        goto L_0x00c3;
    L_0x00cf:
        r0 = move-exception;
        goto L_0x00c3;
    L_0x00d1:
        r0 = move-exception;
        goto L_0x00c3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.peerdownloadmanager.comms.e.b.a():byte[]");
    }
}
