package com.google.android.gms.wearable;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PutDataRequest extends zza {
    public static final Creator CREATOR = new C5660w();
    public static final long f28567a = TimeUnit.MINUTES.toMillis(30);
    public final Uri f28568b;
    public final Bundle f28569c;
    public byte[] f28570d;
    public long f28571e;

    static {
        SecureRandom secureRandom = new SecureRandom();
    }

    private PutDataRequest(Uri uri) {
        this(uri, new Bundle(), null, f28567a);
    }

    PutDataRequest(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.f28568b = uri;
        this.f28569c = bundle;
        this.f28569c.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.f28570d = bArr;
        this.f28571e = j;
    }

    public static PutDataRequest m26609a(Uri uri) {
        return new PutDataRequest(uri);
    }

    public final PutDataRequest m26611a(String str, Asset asset) {
        am.m23733a((Object) str);
        am.m23733a((Object) asset);
        this.f28569c.putParcelable(str, asset);
        return this;
    }

    public final Map m26612a() {
        Map hashMap = new HashMap();
        for (String str : this.f28569c.keySet()) {
            hashMap.put(str, (Asset) this.f28569c.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23842a(parcel, 2, this.f28568b, i);
        C5130b.m23840a(parcel, 4, this.f28569c);
        C5130b.m23847a(parcel, 5, this.f28570d);
        C5130b.m23839a(parcel, 6, this.f28571e);
        C5130b.m23853b(parcel, a);
    }

    public static PutDataRequest m26610a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return m26609a(new Builder().scheme("wear").path(str).build());
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    public String toString() {
        boolean isLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder stringBuilder = new StringBuilder("PutDataRequest[");
        String valueOf = String.valueOf(this.f28570d == null ? "null" : Integer.valueOf(this.f28570d.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 7).append("dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.f28569c.size());
        valueOf = String.valueOf(this.f28568b);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 6).append(", uri=").append(valueOf).toString());
        stringBuilder.append(", syncDeadline=" + this.f28571e);
        if (isLoggable) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.f28569c.keySet()) {
                String valueOf3 = String.valueOf(this.f28569c.getParcelable(valueOf2));
                stringBuilder.append(new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length()).append("\n    ").append(valueOf2).append(": ").append(valueOf3).toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
