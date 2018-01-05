package com.google.android.finsky.ec;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.finsky.aa.C0954a;

public final class C2968a {
    public static final Uri f15617a = new Builder().scheme("content").authority("com.google.android.wearable.settings").path("bluetooth_mode").build();
    public static C2968a f15618b;
    public int f15619c;
    public final Context f15620d;

    private C2968a(Context context) {
        this.f15620d = context;
    }

    public static C2968a m15380a(Context context) {
        if (f15618b == null) {
            f15618b = new C2968a(context);
        }
        return f15618b;
    }

    public final synchronized void m15382a() {
        this.f15619c = ((Integer) C0954a.aS.m5760a()).intValue();
        if (this.f15619c == 0) {
            this.f15619c = m15381d();
            C0954a.aS.m5763a(Integer.valueOf(this.f15619c));
        }
    }

    public final synchronized boolean m15383b() {
        boolean z = true;
        synchronized (this) {
            if (this.f15619c == 0) {
                m15382a();
            }
            if (this.f15619c != 1) {
                z = false;
            }
        }
        return z;
    }

    public final synchronized boolean m15384c() {
        if (this.f15619c == 0) {
            m15382a();
        }
        return this.f15619c == 2;
    }

    private final int m15381d() {
        Cursor query = this.f15620d.getContentResolver().query(f15617a, null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    if (query.getType(0) == 3 && "bluetooth_mode".equals(query.getString(0))) {
                        int i = query.getInt(1);
                        return i;
                    }
                } finally {
                    query.close();
                }
            }
            query.close();
        }
        return 0;
    }
}
