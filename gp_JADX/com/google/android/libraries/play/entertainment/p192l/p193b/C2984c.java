package com.google.android.libraries.play.entertainment.p192l.p193b;

import com.android.volley.C0656n;
import com.android.volley.C0699q;
import com.android.volley.C0700r;
import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p192l.C2989f;
import com.google.android.libraries.play.entertainment.p192l.C6101b;
import com.google.android.libraries.play.entertainment.p192l.C6113c;
import com.google.android.libraries.play.entertainment.p344d.C6056i;

public abstract class C2984c extends C2983e {
    public final C0700r f15668a;

    public C2984c(C2989f c2989f, C0700r c0700r) {
        super(c2989f);
        this.f15668a = c0700r;
    }

    public abstract C0656n mo3214a(C6101b c6101b, String str, C6112d c6112d, C0699q c0699q);

    public final C6056i mo3213a(C6113c c6113c) {
        C0699q c0699q;
        switch (c6113c.f30286c) {
            case 0:
                c0699q = C0699q.IMMEDIATE;
                break;
            case 1:
                c0699q = C0699q.NORMAL;
                break;
            case 2:
                c0699q = C0699q.LOW;
                break;
            default:
                throw new IllegalStateException("Unexpected priority: " + c6113c.f30286c);
        }
        C6056i c6112d = new C6112d();
        C0656n a = mo3214a(c6113c.f30285b, m15420b(c6113c.f30285b), c6112d, c0699q);
        c6112d.f30283a = c6113c;
        this.f15668a.m4510a(a);
        return c6112d;
    }
}
