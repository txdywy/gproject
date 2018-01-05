package com.google.android.play.image;

import com.android.volley.ParseError;
import com.android.volley.f;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.q;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;

public class ap extends n {
    public final int f32011A;
    public final x f32012x;
    public final int f32013y;
    public final int f32014z;

    public ap(String str, x xVar, int i, int i2, int i3, w wVar) {
        super(0, str, wVar);
        this.m = new f(1000, 2, 2.0f);
        this.f32012x = xVar;
        this.f32013y = i;
        this.f32014z = i2;
        this.f32011A = i3;
    }

    public final String m29231e() {
        return d();
    }

    public final q m29232n() {
        return q.a;
    }

    public v m29228a(m mVar) {
        byte[] bArr = mVar.b;
        ao aoVar = new ao(bArr, this.f32013y, this.f32014z, this.f32011A);
        if (bArr == null || bArr.length == 0) {
            return v.a(new ParseError(mVar));
        }
        return v.a(aoVar, com.android.volley.a.n.a(mVar));
    }

    public void m29229a(ao aoVar) {
        this.f32012x.b_(aoVar);
    }
}
