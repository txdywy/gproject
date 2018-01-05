package com.google.android.finsky.verifier.impl.p262a;

import android.content.Context;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0704v;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.p259a.p260a.C4712p;
import com.google.android.finsky.verifier.p259a.p260a.C4715s;
import com.google.android.finsky.verifier.p259a.p260a.C4716t;
import com.google.protobuf.nano.C0757i;

public final class C4733e extends C4730b {
    public C4733e(Context context, C2495w c2495w, String str, C0660x c0660x, C0657w c0657w, C4715s c4715s) {
        super(context, c2495w, str, c0660x, c0657w, c4715s);
    }

    public final C0704v mo4339a(byte[] bArr) {
        try {
            C4712p[] c4712pArr = ((C4716t) C0757i.m4905a(new C4716t(), bArr)).f24260a;
            Object obj = new C4735g[((C4715s) this.q).f24252b.length];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < c4712pArr.length; i3++) {
                if (((c4712pArr[i3].f24231b & 2) != 0 ? 1 : 0) != 0) {
                    try {
                        obj[Integer.parseInt(new String(c4712pArr[i3].f24235f, "UTF-8"), 16)] = C4735g.m22044a(c4712pArr[i3]);
                    } catch (NumberFormatException e) {
                        i2++;
                    } catch (Throwable e2) {
                        throw new RuntimeException(e2);
                    }
                }
                i++;
            }
            if (i2 > 0) {
                FinskyLog.m21659a("Got %d responses with an invalid request id", Integer.valueOf(i2));
            }
            if (i > 0) {
                FinskyLog.m21659a("Got %d responses with a blank request id", Integer.valueOf(i));
            }
            return C0704v.m4517a(obj, null);
        } catch (Throwable e22) {
            return C0704v.m4516a(new VolleyError(e22));
        }
    }
}
