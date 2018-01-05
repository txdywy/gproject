package com.google.android.finsky.appdiscoveryservice.p128b;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.x;
import com.google.android.play.image.y;

final class C1313c implements y {
    public final C1311d f7798a;
    public final int f7799b;
    public int f7800c = 0;

    public C1313c(int i, C1311d c1311d) {
        this.f7799b = i;
        this.f7798a = c1311d;
    }

    public final void m7790a(x xVar) {
        FinskyLog.m21662b("ImageLoadedHandler result.", new Object[0]);
        this.f7800c++;
        if (xVar == null) {
            FinskyLog.m21667d("Error loading bitmap.", new Object[0]);
        }
        if (this.f7800c == this.f7799b) {
            this.f7798a.mo1684a();
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        m7790a((x) obj);
    }
}
