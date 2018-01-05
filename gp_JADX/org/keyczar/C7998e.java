package org.keyczar;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.spec.DSAPrivateKeySpec;
import org.json.JSONObject;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p571c.C7986f;
import org.keyczar.p572d.C7995a;

public final class C7998e extends C7983p {
    public final C8001g f41011a;
    public final String f41012b;

    static C7998e m38200a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C7998e(jSONObject.getInt("size"), C8001g.m38210a(jSONObject.getJSONObject("publicKey")), jSONObject.getString("x")).m38201e();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    final JSONObject mo6650b() {
        try {
            return new JSONObject().put("size", this.h).put("publicKey", this.f41011a != null ? this.f41011a.mo6650b() : null).put("x", this.f41012b);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private C7998e(int i, C8001g c8001g, String str) {
        super(i);
        this.f41011a = c8001g;
        this.f41012b = str;
    }

    protected final byte[] mo6649a() {
        return this.f41011a.mo6649a();
    }

    protected final Iterable mo6655d() {
        return this.f41011a.mo6655d();
    }

    protected final C7986f mo6651c() {
        C7986f c7986f = (C7986f) this.j.poll();
        return c7986f != null ? c7986f : new C7999f(this);
    }

    private final C7998e m38201e() {
        this.f41011a.m38214e();
        try {
            KeyFactory.getInstance("DSA").generatePrivate(new DSAPrivateKeySpec(new BigInteger(C7995a.m38189a(this.f41012b)), new BigInteger(C7995a.m38189a(this.f41011a.f41018e)), new BigInteger(C7995a.m38189a(this.f41011a.f41019f)), new BigInteger(C7995a.m38189a(this.f41011a.f41020g))));
            return this;
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }
}
