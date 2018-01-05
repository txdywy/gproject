package com.google.android.finsky.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import com.google.android.finsky.installer.b.a.e;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.z.e;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class com.google.android.finsky.activities.dy implements com.google.android.finsky.z.f
{

    public final com.google.android.finsky.activities.dx a;

    dy(com.google.android.finsky.activities.dx p0) {
        this.a = p0;
    }

    public final void a(com.google.android.finsky.z.e p0) {
        if (!p0.isCancelled() && this.a.l() && !this.a.h().isFinishing()) {
            try {
                v0 = (List)p0.get();
                if (v0 != 0) {
                    if (v0.size() == 1) {
                        if (com.google.android.finsky.installqueue.m.a.contains(Integer.valueOf(((com.google.android.finsky.installqueue.m)v0.get(0)).c.d))) {
                            this.a.h().setResult(-1);
                            this.a.h().startActivity(this.a.x_());
                            this.a.h().finish();
                        }
                    }
                }
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                FinskyLog.b(ex, "Failed to go to post purchase dialog", new Object[0]);
            }
            catch (ExecutionException ex) {
                FinskyLog.b(ex, "Failed to go to post purchase dialog", new Object[0]);
            }
        }
    }

}
