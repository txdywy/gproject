package com.google.android.gms.internal;

import com.squareup.haha.perflib.HprofParser;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class sh implements qm {
    public static final byte[] f27458a = new byte[0];
    public final su f27459b;
    public final String f27460c;
    public final byte[] f27461d;
    public final st f27462e;
    public final sf f27463f;

    public sh(ECPublicKey eCPublicKey, byte[] bArr, String str, rg rgVar, pm pmVar) {
        st stVar;
        sr.m25567a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f27459b = new su(eCPublicKey);
        this.f27461d = bArr;
        this.f27460c = str;
        switch (pmVar) {
            case COMPRESSED:
                stVar = st.COMPRESSED;
                break;
            case UNCOMPRESSED:
                stVar = st.UNCOMPRESSED;
                break;
            default:
                String valueOf = String.valueOf(pmVar);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(valueOf).length() + 25).append("Unsupported point format:").append(valueOf).toString());
        }
        this.f27462e = stVar;
        this.f27463f = new sf(rgVar);
    }

    public final byte[] mo4863a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i = 1;
        su suVar = this.f27459b;
        String str = this.f27460c;
        byte[] bArr4 = this.f27461d;
        int i2 = this.f27463f.f27452b;
        st stVar = this.f27462e;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) sx.f27489f.m25570a("EC");
        keyPairGenerator.initialize(suVar.f27479a.getParams());
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        sr.m25567a(suVar.f27479a.getW(), suVar.f27479a.getParams().getCurve());
        KeyAgreement keyAgreement = (KeyAgreement) sx.f27488e.m25570a("ECDH");
        keyAgreement.init(eCPrivateKey);
        keyAgreement.doPhase(suVar.f27479a, true);
        byte[] generateSecret = keyAgreement.generateSecret();
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        sr.m25567a(w, curve);
        int bitLength = (sr.m25565a(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        Object obj;
        switch (ss.f27475a[stVar.ordinal()]) {
            case 1:
                obj = new byte[((bitLength * 2) + 1)];
                Object toByteArray = w.getAffineX().toByteArray();
                Object toByteArray2 = w.getAffineY().toByteArray();
                System.arraycopy(toByteArray2, 0, obj, ((bitLength * 2) + 1) - toByteArray2.length, toByteArray2.length);
                System.arraycopy(toByteArray, 0, obj, (bitLength + 1) - toByteArray.length, toByteArray.length);
                obj[0] = (byte) 4;
                bArr3 = obj;
                break;
            case 2:
                bArr3 = new byte[(bitLength + 1)];
                obj = w.getAffineX().toByteArray();
                System.arraycopy(obj, 0, bArr3, (bitLength + 1) - obj.length, obj.length);
                bArr3[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                break;
            default:
                String valueOf = String.valueOf(stVar);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(valueOf).length() + 15).append("invalid format:").append(valueOf).toString());
        }
        generateSecret = tj.m25583a(bArr3, generateSecret);
        Mac mac = (Mac) sx.f27487d.m25570a(str);
        if (i2 > mac.getMacLength() * HprofParser.ROOT_UNKNOWN) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr4 == null || bArr4.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr4, str));
        }
        toByteArray2 = new byte[i2];
        mac.init(new SecretKeySpec(mac.doFinal(generateSecret), str));
        generateSecret = new byte[0];
        int i3 = 0;
        while (true) {
            mac.update(generateSecret);
            mac.update(bArr2);
            mac.update((byte) i);
            generateSecret = mac.doFinal();
            if (generateSecret.length + i3 < i2) {
                System.arraycopy(generateSecret, 0, toByteArray2, i3, generateSecret.length);
                i3 += generateSecret.length;
                i++;
            } else {
                oh ohVar;
                System.arraycopy(generateSecret, 0, toByteArray2, i3, i2 - i3);
                sv svVar = new sv(bArr3, toByteArray2);
                sf sfVar = this.f27463f;
                bArr3 = svVar.f27481b;
                if (sfVar.f27451a == sg.f27456a) {
                    ohVar = (oh) rb.f27387a.m25445b("type.googleapis.com/google.cloud.crypto.tink.AesGcmKey", (pf) ((pg) pf.m25359a().m25314a(sfVar.f27453c)).m25366a(ud.m25653a(bArr3)).m25317d());
                } else if (sfVar.f27451a == sg.f27457b) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr3, 0, sfVar.f27455e);
                    ohVar = (oh) rb.f27387a.m25445b("type.googleapis.com/google.cloud.crypto.tink.AesCtrHmacAeadKey", (oj) oj.m25300d().m25320a(sfVar.f27454d.f27259a).m25321a((op) ((oq) op.m25332b().m25314a(sfVar.f27454d.m25301a())).m25337a(ud.m25653a(copyOfRange)).m25317d()).m25322a((qf) ((qg) qf.m25406b().m25314a(sfVar.f27454d.m25304b())).m25411a(ud.m25653a(Arrays.copyOfRange(bArr3, sfVar.f27455e, sfVar.f27452b))).m25317d()).m25317d());
                } else {
                    throw new GeneralSecurityException("unknown DEM key type");
                }
                byte[] a = ohVar.mo4862a(bArr, f27458a);
                bArr3 = svVar.f27480a;
                return ByteBuffer.allocate(bArr3.length + a.length).put(bArr3).put(a).array();
            }
        }
    }
}
