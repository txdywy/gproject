package com.google.android.finsky.application;

import android.os.Handler;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.m;
import com.google.android.finsky.setup.al;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.application.cz implements Runnable
{

    public final com.google.android.finsky.application.d a;

    cz(com.google.android.finsky.application.d p0) {
        this.a = p0;
    }

    public final void run() {
        if ((this.a.dj().a(12636767)) || this.a.dj().a(12637793))
            this.a.dy().postDelayed(new com.google.android.finsky.application.da(this), (long)((Integer)com.google.android.finsky.aa.b.gG.b()).intValue());
        else
            this.a.cK().a(this.a.b);
    }

}
