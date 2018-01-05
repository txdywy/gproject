package org.keyczar;

import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.json.JSONObject;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.UnsupportedTypeException;
import org.keyczar.p569a.C7982d;
import org.keyczar.p571c.C7986f;
import org.keyczar.p572d.C7996b;

public final class C8012t extends C8000q {
    public RSAPublicKey f41052a;
    public final String f41053b;
    public final String f41054c;
    public final C7982d f41055d;
    public final byte[] f41056e = new byte[4];

    static C8012t m38246a(String str) {
        try {
            return C8012t.m38247a(new JSONObject(str));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static C8012t m38247a(JSONObject jSONObject) {
        C8012t c8012t = new C8012t(jSONObject.getInt("size"), jSONObject.getString("modulus"), jSONObject.getString("publicExponent"), (C7982d) C7996b.m38190a(C7982d.class, jSONObject.optString("padding")));
        if (C7994c.RSA_PUB == C7994c.RSA_PUB) {
            return c8012t.m38251e();
        }
        throw new UnsupportedTypeException(C7994c.RSA_PUB);
    }

    final JSONObject mo6650b() {
        try {
            return new JSONObject().put("size", this.h).put("modulus", this.f41053b).put("publicExponent", this.f41054c).put("padding", this.f41055d != null ? this.f41055d.name() : null);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final byte[] mo6649a() {
        return this.f41056e;
    }

    protected final C7986f mo6651c() {
        C7986f c7986f = (C7986f) this.j.poll();
        return c7986f != null ? c7986f : new C8013u(this);
    }

    private C8012t(int i, String str, String str2, C7982d c7982d) {
        super(i);
        this.f41053b = str;
        this.f41054c = str2;
        this.f41055d = c7982d;
    }

    final C8012t m38251e() {
        try {
            Object a;
            this.f41052a = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(C7996b.m38191a(this.f41053b), C7996b.m38191a(this.f41054c)));
            C7982d f = m38252f();
            RSAPublicKey rSAPublicKey = this.f41052a;
            switch (f.ordinal()) {
                case 0:
                    a = C7996b.m38196a(C7996b.m38195a(rSAPublicKey.getModulus().toByteArray()), C7996b.m38195a(rSAPublicKey.getPublicExponent().toByteArray()));
                    break;
                case 1:
                    a = C7996b.m38196a(rSAPublicKey.getModulus().toByteArray(), rSAPublicKey.getPublicExponent().toByteArray());
                    break;
                default:
                    throw new KeyczarException("Bug! Unknown padding type");
            }
            System.arraycopy(a, 0, this.f41056e, 0, this.f41056e.length);
            return this;
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final C7982d m38252f() {
        if (this.f41055d == null || this.f41055d == C7982d.OAEP) {
            return C7982d.OAEP;
        }
        return C7982d.PKCS;
    }
}
