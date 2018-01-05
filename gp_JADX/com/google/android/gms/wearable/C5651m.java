package com.google.android.gms.wearable;

import android.util.Log;
import com.google.android.gms.internal.nx;
import com.google.android.gms.internal.ny;
import com.google.android.gms.internal.nz;
import com.google.android.gms.internal.wz;
import java.util.ArrayList;
import java.util.List;

public final class C5651m {
    public final PutDataRequest f28706a;
    public final C5620h f28707b = new C5620h();

    public C5651m(PutDataRequest putDataRequest, C5620h c5620h) {
        this.f28706a = putDataRequest;
        if (c5620h != null) {
            this.f28707b.m26638a(c5620h);
        }
    }

    public static C5651m m26837a(String str) {
        return new C5651m(PutDataRequest.m26610a(str), null);
    }

    public final PutDataRequest m26838a() {
        C5620h c5620h = this.f28707b;
        nz nzVar = new nz();
        List arrayList = new ArrayList();
        nzVar.f27216a = nx.m25245a(c5620h, arrayList);
        ny nyVar = new ny(nzVar, arrayList);
        this.f28706a.f28570d = wz.m24212a(nyVar.f27214a);
        int size = nyVar.f27215b.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = (Asset) nyVar.f27215b.get(i);
            String valueOf;
            if (num == null) {
                valueOf = String.valueOf(asset);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("asset key cannot be null: ").append(valueOf).toString());
            } else if (asset == null) {
                String str = "asset cannot be null: key=";
                valueOf = String.valueOf(num);
                throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            } else {
                if (Log.isLoggable("DataMap", 3)) {
                    String valueOf2 = String.valueOf(asset);
                    Log.d("DataMap", new StringBuilder((String.valueOf(num).length() + 33) + String.valueOf(valueOf2).length()).append("asPutDataRequest: adding asset: ").append(num).append(" ").append(valueOf2).toString());
                }
                this.f28706a.m26611a(num, asset);
                i++;
            }
        }
        return this.f28706a;
    }
}
