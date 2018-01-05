package com.google.android.play.image;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.x;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public final class as {
    public final BlockingDeque f32019a = new LinkedBlockingDeque();
    public at[] f32020b = new at[2];
    public Handler f32021c = new Handler(Looper.getMainLooper());
    public ag f32022d;
    public Map f32023e = new HashMap();

    public as(ag agVar) {
        this.f32022d = agVar;
    }

    public final void m29235a(String str, ao aoVar, int i, int i2, x xVar) {
        try {
            aw awVar = new aw(str, aoVar, i, i2, xVar);
            this.f32023e.put(xVar, awVar);
            this.f32019a.putLast(awVar);
        } catch (InterruptedException e) {
        }
    }

    public final boolean m29236a(x xVar) {
        if (xVar != null) {
            aw awVar = (aw) this.f32023e.remove(xVar);
            if (awVar != null) {
                return this.f32019a.remove(awVar);
            }
        }
        return false;
    }

    public final void m29234a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f32020b.length; i2++) {
            if (this.f32020b[i2] != null) {
                at atVar = this.f32020b[i2];
                atVar.f32026c = true;
                atVar.interrupt();
            }
        }
        while (!this.f32019a.isEmpty()) {
            this.f32019a.remove();
        }
        while (i < this.f32020b.length) {
            this.f32020b[i] = new at(this, this.f32019a, this.f32023e);
            this.f32020b[i].start();
            i++;
        }
    }

    static {
        Object obj = new Object();
    }
}
