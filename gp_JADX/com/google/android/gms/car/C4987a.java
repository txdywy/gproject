package com.google.android.gms.car;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5085j;
import com.google.android.gms.common.api.C5089p;

public final class C4987a {
    public static final C5085j f25483a = new C5085j();
    public static final C4931e f25484b = new C5008x();
    public static final C5053a f25485c = new C5053a("Car.API", f25484b, f25483a);
    public static final C4989c f25486d = new C4992g();

    public static C5058o m23135a(Context context, C1632q c1632q, C1634r c1634r, C1636d c1636d) {
        return new C5089p(context).m23648a(f25485c, new C4990e(new C4991f(c1636d))).m23646a(new Handler(context.getMainLooper())).m23649a(c1632q).m23650a(c1634r).m23652b();
    }

    static /* synthetic */ void m23136a(C5058o c5058o) {
        if (c5058o == null) {
            throw new NullPointerException("GoogleApiClient is null");
        }
    }

    static {
        C4993h c4993h = new C4993h();
    }
}
