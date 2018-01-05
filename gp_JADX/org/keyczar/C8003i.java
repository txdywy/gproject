package org.keyczar;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.keyczar.p571c.C7986f;
import org.keyczar.p572d.C7995a;
import org.keyczar.p572d.C7996b;

public final class C8003i extends C7983p {
    public final String f41023a;
    public SecretKey f41024b;
    public final byte[] f41025c = new byte[4];

    private C8003i(int i, String str) {
        super(i);
        this.f41023a = str;
    }

    final void m38223e() {
        this.f41024b = new SecretKeySpec(C7995a.m38189a(this.f41023a), "HMACSHA1");
        System.arraycopy(C7996b.m38198b(r0), 0, this.f41025c, 0, this.f41025c.length);
    }

    final byte[] m38224f() {
        return this.f41024b.getEncoded();
    }

    protected final C7986f mo6651c() {
        C7986f c7986f = (C7986f) this.j.poll();
        return c7986f != null ? c7986f : new C8004j(this);
    }

    protected final byte[] mo6649a() {
        return this.f41025c;
    }

    static C8003i m38218a(String str) {
        try {
            C8003i a = C8003i.m38219a(new JSONObject(str));
            a.m38223e();
            return a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static C8003i m38219a(JSONObject jSONObject) {
        return new C8003i(jSONObject.getInt("size"), jSONObject.getString("hmacKeyString"));
    }

    final JSONObject mo6650b() {
        try {
            return new JSONObject().put("size", this.h).put("hmacKeyString", this.f41023a);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
