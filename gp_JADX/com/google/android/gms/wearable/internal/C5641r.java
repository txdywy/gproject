package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.C5615c;
import com.google.android.gms.wearable.C5617e;

public final class C5641r implements C5615c {
    public int f28618a;
    public C5617e f28619b;

    public C5641r(C5615c c5615c) {
        this.f28618a = c5615c.mo5122c();
        this.f28619b = (C5617e) c5615c.mo5121b().mo5065a();
    }

    public final /* bridge */ /* synthetic */ Object mo5065a() {
        if (this != null) {
            return this;
        }
        throw null;
    }

    public final C5617e mo5121b() {
        return this.f28619b;
    }

    public final int mo5122c() {
        return this.f28618a;
    }

    public final String toString() {
        String str = this.f28618a == 1 ? "changed" : this.f28618a == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(this.f28619b);
        return new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(valueOf).length()).append("DataEventEntity{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}
