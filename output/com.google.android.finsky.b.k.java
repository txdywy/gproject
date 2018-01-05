package com.google.android.finsky.b;

import android.os.RemoteException;
import android.view.MotionEvent;
import com.google.android.finsky.ct.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.ads.adshield.a;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.tm;

public final class com.google.android.finsky.b.k implements Runnable
{

    public final MotionEvent a;
    public final com.google.android.finsky.b.j b;

    k(com.google.android.finsky.b.j p0, MotionEvent p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        if (this.b.a.a()) {
            try {
                this.b.a.a.a.d(com.google.android.gms.dynamic.d.a(this.a));
            }
            catch (RemoteException ex) {
                v2 = new Object[1];
                v2[0] = ex;
                FinskyLog.d("Error accessing AdShield: %s", v2);
            }
        }
    }

}
