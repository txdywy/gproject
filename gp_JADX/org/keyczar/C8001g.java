package org.keyczar;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import org.json.JSONObject;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p571c.C7986f;
import org.keyczar.p572d.C7995a;
import org.keyczar.p572d.C7996b;

public final class C8001g extends C8000q {
    public static boolean f41014a = Boolean.valueOf(System.getProperty("keyczar.strict_dsa_verification", "false")).booleanValue();
    public DSAPublicKey f41015b = null;
    public final byte[] f41016c = new byte[4];
    public final String f41017d;
    public final String f41018e;
    public final String f41019f;
    public final String f41020g;

    static C8001g m38209a(String str) {
        try {
            C8001g a = C8001g.m38210a(new JSONObject(str));
            a.m38214e();
            return a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static C8001g m38210a(JSONObject jSONObject) {
        return new C8001g(jSONObject.getInt("size"), jSONObject.getString("y"), jSONObject.getString("p"), jSONObject.getString("q"), jSONObject.getString("g"));
    }

    final JSONObject mo6650b() {
        try {
            return new JSONObject().put("size", this.h).put("y", this.f41017d).put("p", this.f41018e).put("q", this.f41019f).put("g", this.f41020g);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private C8001g(int i, String str, String str2, String str3, String str4) {
        super(i);
        this.f41017d = str;
        this.f41018e = str2;
        this.f41019f = str3;
        this.f41020g = str4;
    }

    protected final C7986f mo6651c() {
        C7986f c7986f = (C7986f) this.j.poll();
        return c7986f != null ? c7986f : new C8002h(this);
    }

    public final byte[] mo6649a() {
        return this.f41016c;
    }

    final void m38214e() {
        try {
            this.f41015b = (DSAPublicKey) KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(new BigInteger(C7995a.m38189a(this.f41017d)), new BigInteger(C7995a.m38189a(this.f41018e)), new BigInteger(C7995a.m38189a(this.f41019f)), new BigInteger(C7995a.m38189a(this.f41020g))));
            DSAParams params = this.f41015b.getParams();
            System.arraycopy(C7996b.m38196a(C7996b.m38195a(params.getP().toByteArray()), C7996b.m38195a(params.getQ().toByteArray()), C7996b.m38195a(params.getG().toByteArray()), C7996b.m38195a(this.f41015b.getY().toByteArray())), 0, this.f41016c, 0, this.f41016c.length);
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }
}
