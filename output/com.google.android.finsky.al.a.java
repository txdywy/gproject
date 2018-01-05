package com.google.android.finsky.al;

import android.text.TextUtils;
import com.google.android.finsky.api.f;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.al.a implements com.google.android.finsky.al.i
{

    public final com.google.android.finsky.al.j a;

    a(com.google.android.finsky.al.j p0) {
        this.a = p0;
    }

    public final boolean a(Object p0) {
        return this.a.a((com.google.android.finsky.al.b)p0);
    }

    public final boolean a(String[] p0) {
        v0 = 0;
        if (p0 != 0) {
            try {
                if (p0.length == 3) {
                    if (Integer.parseInt(p0[2]) > 0)
                        v0 = 1;
                }
            }
            catch (NumberFormatException ex) {
            }
        }
        return v0;
    }

    public final Object b(String[] p0) {
        if (p0 != 0 && p0.length == 3)
            v0 = new com.google.android.finsky.al.b(p0[1], p0[2]);
        else
            v0 = com.google.android.finsky.al.b.c;
        return v0;
    }

    public final boolean b(Object p0) {
        if (TextUtils.equals((String)com.google.android.finsky.api.f.g.b(), ((com.google.android.finsky.al.b)p0).a) && TextUtils.equals((String)com.google.android.finsky.api.f.a.b(), ((com.google.android.finsky.al.b)p0).b))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
