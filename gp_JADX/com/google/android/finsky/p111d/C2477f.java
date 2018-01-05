package com.google.android.finsky.p111d;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Random;

public final class C2477f {
    public static C2477f f13347f;
    public final long f13348a;
    public final long f13349b;
    public long f13350c;
    public long f13351d = (this.f13350c + 1);
    public final SharedPreferences f13352e;

    public static synchronized C2477f m13268a(Context context) {
        C2477f c2477f;
        synchronized (C2477f.class) {
            if (f13347f == null) {
                long longValue = ((Long) C0955b.gn.m28964b()).longValue();
                long longValue2 = ((Long) C0955b.go.m28964b()).longValue();
                if (longValue <= 0 || longValue2 <= 0) {
                    FinskyLog.m21665c("Inconsistent setup for event generator %d, %d. Using defaults", C0955b.gn.m28964b(), C0955b.go.m28964b());
                    longValue = 1000000000;
                    longValue2 = 1000;
                }
                f13347f = new C2477f(context, longValue, longValue2, 100000 * (new Random(System.currentTimeMillis()).nextInt(9000) + 1));
            }
            c2477f = f13347f;
        }
        return c2477f;
    }

    private C2477f(Context context, long j, long j2, int i) {
        this.f13352e = context.getSharedPreferences("event_generator", 0);
        this.f13348a = j;
        this.f13349b = j2;
        this.f13350c = this.f13352e.getLong("last_event_id", (long) i) + this.f13349b;
    }

    public final synchronized long m13269a() {
        this.f13350c++;
        if (this.f13350c > this.f13348a) {
            this.f13350c = 1;
            this.f13351d = this.f13349b + 1;
            this.f13352e.edit().putLong("last_event_id", this.f13351d).apply();
        } else if (this.f13350c == this.f13351d) {
            this.f13351d = Math.min(this.f13348a, this.f13351d + this.f13349b);
            this.f13352e.edit().putLong("last_event_id", this.f13351d).apply();
        }
        return this.f13350c;
    }
}
