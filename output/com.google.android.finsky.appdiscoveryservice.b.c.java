package com.google.android.finsky.appdiscoveryservice.b;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.x;

public final class com.google.android.finsky.appdiscoveryservice.b.c implements com.google.android.play.image.y
{

    public final com.google.android.finsky.appdiscoveryservice.b.d a;
    public final int b;
    public int c;

    c(int p0, com.google.android.finsky.appdiscoveryservice.b.d p1) {
        this.b = p0;
        this.a = p1;
        this.c = 0;
    }

    public final void a(com.google.android.play.image.x p0) {
        FinskyLog.b("ImageLoadedHandler result.", new Object[0]);
        this.c = this.c + 1;
        if (p0 == 0)
            FinskyLog.d("Error loading bitmap.", new Object[0]);
        if (this.c == this.b)
            this.a.a();
    }

    public final void b_(Object p0) {
        this.a((com.google.android.play.image.x)p0);
    }

}
