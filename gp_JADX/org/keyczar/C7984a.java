package org.keyczar;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.keyczar.p569a.C7979a;
import org.keyczar.p571c.C7986f;
import org.keyczar.p572d.C7995a;
import org.keyczar.p572d.C7996b;

public final class C7984a extends C7983p {
    public SecretKey f40987a;
    public final String f40988b;
    public final C8003i f40989c;
    public final C7979a f40990d;
    public final byte[] f40991e = new byte[4];

    private C7984a(int i, String str, C8003i c8003i, C7979a c7979a) {
        super(i);
        this.f40988b = str;
        this.f40989c = c8003i;
        this.f40990d = c7979a;
    }

    protected final byte[] mo6649a() {
        return this.f40991e;
    }

    static C7984a m38173a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C7984a c7984a = new C7984a(jSONObject.getInt("size"), jSONObject.getString("aesKeyString"), C8003i.m38219a(jSONObject.getJSONObject("hmacKey")), (C7979a) C7996b.m38190a(C7979a.class, jSONObject.getString("mode")));
            c7984a.f40989c.m38223e();
            byte[] a = C7995a.m38189a(c7984a.f40988b);
            c7984a.f40987a = new SecretKeySpec(a, "AES");
            Object b = C7996b.m38198b(C7996b.m38193a(a.length), a, c7984a.f40989c.m38224f());
            if (a.length != 16) {
                Object obj = new byte[4];
                System.arraycopy(C7996b.m38198b(C7996b.m38193a(16), a, c7984a.f40989c.m38224f()), 0, obj, 0, 4);
                c7984a.i.add(obj);
            }
            if (a[0] == (byte) 0) {
                a = C7996b.m38195a(a);
                Object b2 = C7996b.m38198b(C7996b.m38193a(a.length), a, c7984a.f40989c.m38224f());
                Object obj2 = new byte[4];
                System.arraycopy(b2, 0, obj2, 0, 4);
                c7984a.i.add(obj2);
            }
            System.arraycopy(b, 0, c7984a.f40991e, 0, c7984a.f40991e.length);
            return c7984a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    final JSONObject mo6650b() {
        try {
            return new JSONObject().put("size", this.h).put("aesKeyString", this.f40988b).put("hmacKey", this.f40989c != null ? this.f40989c.mo6650b() : null).put("mode", this.f40990d.name());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected final C7986f mo6651c() {
        C7986f c7986f = (C7986f) this.j.poll();
        return c7986f != null ? c7986f : new C7987b(this);
    }
}
