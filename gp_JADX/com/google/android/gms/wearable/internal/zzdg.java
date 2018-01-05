package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5618f;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class zzdg extends zza implements C5617e {
    public static final Creator CREATOR = new C5647x();
    public final Uri f28643a;
    public final Map f28644b;
    public byte[] f28645c;

    zzdg(Uri uri, Bundle bundle, byte[] bArr) {
        this.f28643a = uri;
        Map hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.f28644b = hashMap;
        this.f28645c = bArr;
    }

    public final /* bridge */ /* synthetic */ Object mo5065a() {
        if (this != null) {
            return this;
        }
        throw null;
    }

    public final Uri mo5123b() {
        return this.f28643a;
    }

    public final byte[] mo5124c() {
        return this.f28645c;
    }

    public final Map mo5125d() {
        return this.f28644b;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder stringBuilder = new StringBuilder("DataItemParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        String valueOf = String.valueOf(this.f28645c == null ? "null" : Integer.valueOf(this.f28645c.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 8).append(",dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.f28644b.size());
        valueOf = String.valueOf(this.f28643a);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 6).append(", uri=").append(valueOf).toString());
        if (isLoggable) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.f28644b.keySet()) {
                String valueOf3 = String.valueOf(this.f28644b.get(valueOf2));
                stringBuilder.append(new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length()).append("\n    ").append(valueOf2).append(": ").append(valueOf3).toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23842a(parcel, 2, this.f28643a, i);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Entry entry : this.f28644b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((C5618f) entry.getValue()));
        }
        C5130b.m23840a(parcel, 4, bundle);
        C5130b.m23847a(parcel, 5, this.f28645c);
        C5130b.m23853b(parcel, a);
    }
}
