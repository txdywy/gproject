package com.google.android.wallet.common.p367c.p368a;

import android.support.v4.h.a;
import android.util.Log;
import android.util.Pair;
import com.android.volley.ParseError;
import com.android.volley.a.n;
import com.android.volley.m;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.util.C6608t;
import com.google.protobuf.nano.i;
import java.io.IOException;
import java.util.Map;

public abstract class C6518g extends C6517c {
    public final Map f32583t;
    public final byte[] f32584u;
    public final UiConfig f32585v;
    public final C6568a f32586w;
    public final Class f32587x;

    public C6518g(C6568a c6568a, Map map, byte[] bArr, UiConfig uiConfig, Class cls, x xVar, w wVar) {
        super(null, xVar, wVar);
        this.f32586w = c6568a;
        this.f32583t = map;
        this.f32584u = bArr;
        this.f32585v = uiConfig;
        this.f32587x = cls;
        if (this.f32583t.isEmpty()) {
            throw new IllegalArgumentException("There must be at least an EES serialization header.");
        }
    }

    public abstract i mo5465u();

    public abstract String mo5466v();

    public final Map m29577h() {
        Map aVar = new a(this.f32583t.size() + this.f32586w.m29810b().size());
        aVar.putAll(this.f32586w.m29810b());
        aVar.putAll(this.f32583t);
        return aVar;
    }

    public final String m29578l() {
        return "application/protobuf";
    }

    public final byte[] m29579m() {
        i u = mo5465u();
        C6608t.m29985a(u, "SecureRequestProto=");
        return i.a(u);
    }

    public final String m29576d() {
        return this.f32586w.f32688c.buildUpon().appendEncodedPath(mo5466v()).appendQueryParameter("s7e_mode", "proto").toString();
    }

    protected final v m29575a(m mVar) {
        try {
            i iVar = (i) this.f32587x.cast(i.a((i) this.f32587x.newInstance(), mVar.b));
            C6608t.m29986b(iVar, d());
            return v.a(Pair.create(this, iVar), n.a(mVar));
        } catch (Throwable e) {
            throw new RuntimeException("Failed to instantiate proto object.", e);
        } catch (Throwable e2) {
            throw new RuntimeException("Failed to access proto constructor.", e2);
        } catch (IOException e3) {
            String str = "SecureRequest";
            String str2 = "Couldn't parse proto response for url=";
            String valueOf = String.valueOf(d());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return v.a(new ParseError(mVar));
        }
    }
}
