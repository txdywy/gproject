package com.google.android.volley.ok;

import android.os.SystemClock;
import com.squareup.okhttp.ad;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

final class C6483i {
    public int f32482a = 10;
    public Map f32483b = new HashMap(10);
    public final ad f32484c;

    C6483i(ad adVar) {
        this.f32484c = adVar;
    }

    public final synchronized ad m29532a(int i) {
        ad adVar;
        C6484j c6484j = (C6484j) this.f32483b.get(Integer.valueOf(i));
        if (c6484j != null) {
            c6484j.f32486b = SystemClock.elapsedRealtime();
            adVar = c6484j.f32485a;
        } else {
            if (this.f32483b.size() >= this.f32482a) {
                long j = Long.MAX_VALUE;
                Integer num = null;
                for (Entry entry : this.f32483b.entrySet()) {
                    long j2;
                    Integer num2;
                    if (((C6484j) entry.getValue()).f32486b < j) {
                        j2 = ((C6484j) entry.getValue()).f32486b;
                        num2 = (Integer) entry.getKey();
                    } else {
                        num2 = num;
                        j2 = j;
                    }
                    j = j2;
                    num = num2;
                }
                this.f32483b.remove(num);
            }
            adVar = (ad) this.f32484c.clone();
            adVar.b((long) i, TimeUnit.MILLISECONDS);
            adVar.a((long) i, TimeUnit.MILLISECONDS);
            adVar.a(TimeUnit.MILLISECONDS);
            this.f32483b.put(Integer.valueOf(i), new C6484j(adVar));
        }
        return adVar;
    }
}
