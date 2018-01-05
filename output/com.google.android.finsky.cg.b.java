package com.google.android.finsky.cg;

import com.google.android.finsky.aa.b;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.c.d;

public final class com.google.android.finsky.cg.b implements com.google.android.play.image.bs
{

    public final com.google.android.finsky.cg.a a;

    b(com.google.android.finsky.cg.a p0) {
        this.a = p0;
    }

    public final int a() {
        if (this.a.b != 0)
            v0 = this.a.a();
        else {
            v2 = com.google.android.play.utils.c.d.a();
            if (v2 == -1)
                v0 = this.a.a();
            else if (v2 < ((Integer)com.google.android.finsky.aa.b.fH.b()).intValue() + this.a.d)
                v0 = 0;
            else if ((float)v2 < (float)((Integer)com.google.android.finsky.aa.b.fI.b()).intValue() * this.a.c)
                v0 = 1;
            else if ((float)v2 < (float)((Integer)com.google.android.finsky.aa.b.fJ.b()).intValue() * this.a.c)
                v0 = 2;
            else
                v0 = 3;
        }
        return v0;
    }

}
