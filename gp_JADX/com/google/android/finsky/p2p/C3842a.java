package com.google.android.finsky.p2p;

import android.support.v4.p037h.C0305a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import com.google.android.finsky.p108z.C4817d;
import java.util.Map;

public final class C3842a {
    public C1202e f19220a;
    public C4817d f19221b;

    public C3842a(C1203f c1203f, C4817d c4817d) {
        this.f19221b = c4817d;
        Map c0305a = new C0305a(2);
        c0305a.put("apk_path", "TEXT");
        c0305a.put("frosting_id", "INTEGER");
        c0305a.put("last_updated", "INTEGER");
        C1201d c1201d = new C1201d("frosting", "TEXT", c0305a);
        C1201d[] c1201dArr = new C1201d[]{c1201d};
        this.f19220a = c1203f.mo1517a(c1203f.mo1516a("frosting.db", c1201dArr), "frosting", new C3843b(), new C3844c(), new C3845d(), 0, new C3846e());
    }
}
