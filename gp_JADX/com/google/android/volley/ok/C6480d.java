package com.google.android.volley.ok;

import android.os.SystemClock;
import android.util.Pair;
import com.squareup.okhttp.ad;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

final class C6480d {
    public int f32476a = 10;
    public Map f32477b = new HashMap(10);
    public final ad f32478c;

    C6480d(ad adVar) {
        this.f32478c = adVar;
    }

    public final synchronized ad m29531a(int i) {
        ad adVar;
        C6481e c6481e = (C6481e) this.f32477b.get(new Pair(Integer.valueOf(i), Integer.valueOf(5000)));
        if (c6481e != null) {
            c6481e.f32480b = SystemClock.elapsedRealtime();
            adVar = c6481e.f32479a;
        } else {
            if (this.f32477b.size() >= this.f32476a) {
                long j = Long.MAX_VALUE;
                Pair pair = null;
                for (Entry entry : this.f32477b.entrySet()) {
                    long j2;
                    Pair pair2;
                    if (((C6481e) entry.getValue()).f32480b < j) {
                        j2 = ((C6481e) entry.getValue()).f32480b;
                        pair2 = (Pair) entry.getKey();
                    } else {
                        pair2 = pair;
                        j2 = j;
                    }
                    j = j2;
                    pair = pair2;
                }
                this.f32477b.remove(pair);
            }
            adVar = (ad) this.f32478c.clone();
            adVar.b((long) i, TimeUnit.MILLISECONDS);
            adVar.a((long) i, TimeUnit.MILLISECONDS);
            adVar.a(TimeUnit.MILLISECONDS);
            this.f32477b.put(new Pair(Integer.valueOf(i), Integer.valueOf(5000)), new C6481e(adVar));
        }
        return adVar;
    }
}
