package com.google.android.gms.p277c.p278a;

import com.google.android.gms.common.data.C4977g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ad;

public final class C4978c extends C4977g implements C4972a {
    public C4978c(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String mo4503a() {
        return m23122a("feature_name");
    }

    public final long mo4504b() {
        String str = "last_connection_timestamp";
        DataHolder dataHolder = this.f25476a;
        int i = this.f25477b;
        int i2 = this.f25478c;
        dataHolder.m23679a(str, i);
        return dataHolder.f25952d[i2].getLong(i, dataHolder.f25951c.getInt(str));
    }

    public final String toString() {
        return ad.m23721a(this).m23723a("FeatureName", m23122a("feature_name")).m23723a("Timestamp", Long.valueOf(mo4504b())).toString();
    }
}
