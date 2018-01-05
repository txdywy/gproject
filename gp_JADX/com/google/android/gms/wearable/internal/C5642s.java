package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.C4977g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C5615c;
import com.google.android.gms.wearable.C5617e;

public final class C5642s extends C4977g implements C5615c {
    public final int f28620d;

    public C5642s(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f28620d = i2;
    }

    public final /* synthetic */ Object mo5065a() {
        return new C5641r(this);
    }

    public final C5617e mo5121b() {
        return new C5648y(this.a, this.b, this.f28620d);
    }

    public final int mo5122c() {
        String str = "event_type";
        DataHolder dataHolder = this.f25476a;
        int i = this.f25477b;
        int i2 = this.f25478c;
        dataHolder.m23679a(str, i);
        return dataHolder.f25952d[i2].getInt(i, dataHolder.f25951c.getInt(str));
    }

    public final String toString() {
        String str = mo5122c() == 1 ? "changed" : mo5122c() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(mo5121b());
        return new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("DataEventRef{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}
