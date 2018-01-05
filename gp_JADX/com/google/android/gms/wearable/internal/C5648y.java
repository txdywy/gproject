package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.C4977g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5618f;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class C5648y extends C4977g implements C5617e {
    public final int f28626d;

    public C5648y(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f28626d = i2;
    }

    public final /* synthetic */ Object mo5065a() {
        return new C5646w(this);
    }

    public final Uri mo5123b() {
        return Uri.parse(m23122a("path"));
    }

    public final byte[] mo5124c() {
        return this.f25476a.m23681b("data", this.f25477b, this.f25478c);
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] c = mo5124c();
        Map d = mo5125d();
        StringBuilder stringBuilder = new StringBuilder("DataItemRef{ ");
        String valueOf = String.valueOf(mo5123b());
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        String valueOf2 = String.valueOf(c == null ? "null" : Integer.valueOf(c.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf2).length() + 9).append(", dataSz=").append(valueOf2).toString());
        stringBuilder.append(", numAssets=" + d.size());
        if (isLoggable && !d.isEmpty()) {
            stringBuilder.append(", assets=[");
            String str = "";
            for (Entry entry : d.entrySet()) {
                String str2 = (String) entry.getKey();
                valueOf2 = ((C5618f) entry.getValue()).mo5066b();
                stringBuilder.append(new StringBuilder(((String.valueOf(str).length() + 2) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append(str).append(str2).append(": ").append(valueOf2).toString());
                str = ", ";
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public final Map mo5125d() {
        Map hashMap = new HashMap(this.f28626d);
        for (int i = 0; i < this.f28626d; i++) {
            C4977g c5645v = new C5645v(this.a, this.b + i);
            if (c5645v.m23122a("asset_key") != null) {
                hashMap.put(c5645v.m23122a("asset_key"), c5645v);
            }
        }
        return hashMap;
    }
}
