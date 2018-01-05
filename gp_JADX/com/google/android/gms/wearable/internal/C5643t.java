package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.C5618f;

public final class C5643t implements C5618f {
    public final String f28621a;
    public final String f28622b;

    public C5643t(C5618f c5618f) {
        this.f28621a = c5618f.mo5066b();
        this.f28622b = c5618f.mo5067c();
    }

    public final /* bridge */ /* synthetic */ Object mo5065a() {
        if (this != null) {
            return this;
        }
        throw null;
    }

    public final String mo5066b() {
        return this.f28621a;
    }

    public final String mo5067c() {
        return this.f28622b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetEntity[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.f28621a == null) {
            stringBuilder.append(",noid");
        } else {
            stringBuilder.append(",");
            stringBuilder.append(this.f28621a);
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.f28622b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
