package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5618f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class C5646w implements C5617e {
    public Uri f28623a;
    public byte[] f28624b;
    public Map f28625c;

    public C5646w(C5617e c5617e) {
        this.f28623a = c5617e.mo5123b();
        this.f28624b = c5617e.mo5124c();
        Map hashMap = new HashMap();
        for (Entry entry : c5617e.mo5125d().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put((String) entry.getKey(), (C5618f) ((C5618f) entry.getValue()).mo5065a());
            }
        }
        this.f28625c = Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ Object mo5065a() {
        if (this != null) {
            return this;
        }
        throw null;
    }

    public final Uri mo5123b() {
        return this.f28623a;
    }

    public final byte[] mo5124c() {
        return this.f28624b;
    }

    public final Map mo5125d() {
        return this.f28625c;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder stringBuilder = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.f28623a);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        valueOf = String.valueOf(this.f28624b == null ? "null" : Integer.valueOf(this.f28624b.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 9).append(", dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.f28625c.size());
        if (isLoggable && !this.f28625c.isEmpty()) {
            stringBuilder.append(", assets=[");
            String str = "";
            for (Entry entry : this.f28625c.entrySet()) {
                String str2 = (String) entry.getKey();
                valueOf = ((C5618f) entry.getValue()).mo5066b();
                stringBuilder.append(new StringBuilder(((String.valueOf(str).length() + 2) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append(str).append(str2).append(": ").append(valueOf).toString());
                str = ", ";
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
