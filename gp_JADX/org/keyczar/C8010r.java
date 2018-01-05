package org.keyczar;

import java.security.KeyFactory;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.json.JSONObject;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p571c.C7986f;
import org.keyczar.p572d.C7996b;

public final class C8010r extends C7983p {
    public final C8012t f41044a;
    public final String f41045b;
    public final String f41046c;
    public final String f41047d;
    public final String f41048e;
    public final String f41049f;
    public final String f41050g;

    static C8010r m38237a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C8010r(jSONObject.getInt("size"), C8012t.m38247a(jSONObject.getJSONObject("publicKey")), jSONObject.getString("privateExponent"), jSONObject.getString("primeP"), jSONObject.getString("primeQ"), jSONObject.getString("primeExponentP"), jSONObject.getString("primeExponentQ"), jSONObject.getString("crtCoefficient")).m38238e();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private C8010r(int i, C8012t c8012t, String str, String str2, String str3, String str4, String str5, String str6) {
        super(i);
        this.f41044a = c8012t;
        this.f41045b = str;
        this.f41046c = str2;
        this.f41047d = str3;
        this.f41048e = str4;
        this.f41049f = str5;
        this.f41050g = str6;
    }

    final JSONObject mo6650b() {
        try {
            return new JSONObject().put("size", this.h).put("publicKey", this.f41044a != null ? this.f41044a.mo6650b() : null).put("privateExponent", this.f41045b).put("primeP", this.f41046c).put("primeQ", this.f41047d).put("primeExponentP", this.f41048e).put("primeExponentQ", this.f41049f).put("crtCoefficient", this.f41050g);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected final C7986f mo6651c() {
        C7986f c7986f = (C7986f) this.j.poll();
        return c7986f != null ? c7986f : new C8011s(this);
    }

    protected final byte[] mo6649a() {
        return this.f41044a.mo6649a();
    }

    protected final Iterable mo6655d() {
        return this.f41044a.mo6655d();
    }

    private final C8010r m38238e() {
        this.f41044a.m38251e();
        try {
            KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(C7996b.m38191a(this.f41044a.f41053b), C7996b.m38191a(this.f41044a.f41054c), C7996b.m38191a(this.f41045b), C7996b.m38191a(this.f41046c), C7996b.m38191a(this.f41047d), C7996b.m38191a(this.f41048e), C7996b.m38191a(this.f41049f), C7996b.m38191a(this.f41050g)));
            return this;
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }
}
