package com.google.android.wallet.common.p367c.p368a;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.android.volley.ParseError;
import com.android.volley.a.n;
import com.android.volley.m;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.wallet.common.util.C6608t;
import com.google.protobuf.nano.i;
import java.io.IOException;
import java.util.Map;

public final class C6571e extends C6517c {
    public final i f32696t;
    public final C6568a f32697u;
    public final Class f32698v;

    public C6571e(String str, C6568a c6568a, i iVar, Class cls, x xVar, w wVar) {
        super(Uri.withAppendedPath(c6568a.f32687b, str).toString(), xVar, wVar);
        this.f32697u = c6568a;
        this.f32696t = C6608t.m29983a(iVar);
        this.f32698v = cls;
    }

    public final String m29816l() {
        return "application/protobuf";
    }

    public final byte[] m29817m() {
        C6608t.m29985a(this.f32696t, "ProtoRequestProto=");
        return i.a(this.f32696t);
    }

    public final Map m29815h() {
        return this.f32697u.m29810b();
    }

    public final int mo5463s() {
        return 0;
    }

    public final int mo5464t() {
        return 0;
    }

    protected final v m29814a(m mVar) {
        try {
            i iVar = (i) this.f32698v.cast(i.a((i) this.f32698v.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), mVar.b));
            C6608t.m29986b(iVar, d());
            return v.a(Pair.create(this, iVar), n.a(mVar));
        } catch (Throwable e) {
            throw new RuntimeException("Failed to create proto object.", e);
        } catch (Throwable e2) {
            throw new RuntimeException("Failed to create proto object.", e2);
        } catch (Throwable e22) {
            throw new RuntimeException("Failed to create proto object.", e22);
        } catch (Throwable e222) {
            throw new RuntimeException("Failed to create proto object.", e222);
        } catch (IOException e3) {
            String str = "ProtoRequest";
            String str2 = "Couldn't parse proto response for url=";
            String valueOf = String.valueOf(d());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return v.a(new ParseError(mVar));
        }
    }
}
