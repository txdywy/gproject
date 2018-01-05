package com.google.android.finsky.verifier.impl.p262a;

import android.content.Context;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0704v;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.finsky.verifier.p259a.p260a.C4712p;
import com.google.protobuf.nano.C0757i;

public final class C4734f extends C4730b {
    public C4734f(Context context, C2495w c2495w, String str, C0660x c0660x, C0657w c0657w, C4699c c4699c) {
        super(context, c2495w, str, c0660x, c0657w, c4699c);
    }

    public final C0704v mo4339a(byte[] bArr) {
        try {
            return C0704v.m4517a(C4735g.m22044a((C4712p) C0757i.m4905a(new C4712p(), bArr)), null);
        } catch (Throwable e) {
            return C0704v.m4516a(new VolleyError(e));
        }
    }
}
