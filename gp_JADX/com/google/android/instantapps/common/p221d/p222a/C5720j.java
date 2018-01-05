package com.google.android.instantapps.common.p221d.p222a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.f.a.au;
import com.google.common.f.a.aw;

public final class C5720j {
    public long f28960a;
    public long f28961b;
    public volatile SharedPreferences f28962c;
    public final au f28963d;

    public C5720j(aw awVar, Context context) {
        this.f28963d = awVar.a(new C5721k(this, context));
    }

    final synchronized long m27016a() {
        this.f28960a++;
        if (this.f28960a > 1000000000) {
            this.f28960a = 1;
            m27015a(this.f28960a);
        } else if (this.f28960a == this.f28961b) {
            m27015a(this.f28960a);
        }
        return this.f28960a;
    }

    private final void m27015a(long j) {
        this.f28961b = Math.min(1000 + j, 1000000000);
        this.f28962c.edit().putLong("last_reserved_id", this.f28961b).apply();
    }

    final /* synthetic */ Void m27017a(Context context) {
        this.f28962c = context.getSharedPreferences("event_generator", 0);
        long j = this.f28962c.getLong("last_reserved_id", 0);
        synchronized (this) {
            this.f28960a = j;
            m27015a(j);
        }
        return null;
    }
}
