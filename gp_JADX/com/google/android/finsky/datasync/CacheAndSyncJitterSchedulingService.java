package com.google.android.finsky.datasync;

import android.content.Context;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.gcm.C0946b;
import com.google.android.gms.gcm.C5195a;
import com.google.android.gms.gcm.C5205l;
import java.util.List;

public class CacheAndSyncJitterSchedulingService extends C0946b {
    public C2531s f13464a;
    public C1461c f13465b;
    public C2530p f13466c;

    public void onCreate() {
        ((C1374t) C3947d.m18649a(C1374t.class)).mo1798a(this);
        this.f13466c = new C2530p(this, this.f13464a, this.f13465b, true);
        super.onCreate();
    }

    public final int mo1162a(C5205l c5205l) {
        List c = this.f13464a.m13485c();
        if (c.isEmpty()) {
            return 2;
        }
        if (C5095d.m23655a((Context) this) != 0) {
            this.f13464a.m13480a(c);
            return 2;
        }
        this.f13466c.m13473a(C5195a.m23967a((Context) this));
        return 0;
    }
}
