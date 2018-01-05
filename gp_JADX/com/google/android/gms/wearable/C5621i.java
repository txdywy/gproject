package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.nx;
import com.google.android.gms.internal.ny;
import com.google.android.gms.internal.nz;
import com.google.android.gms.internal.zzfyy;
import java.util.ArrayList;
import java.util.List;

public final class C5621i {
    public final Uri f28576a;
    public final C5620h f28577b;

    public C5621i(C5617e c5617e) {
        this.f28576a = c5617e.mo5123b();
        this.f28577b = C5621i.m26665a((C5617e) c5617e.mo5065a());
    }

    private static C5620h m26665a(C5617e c5617e) {
        Throwable e;
        if (c5617e.mo5124c() == null && c5617e.mo5125d().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        } else if (c5617e.mo5124c() == null) {
            return new C5620h();
        } else {
            try {
                List arrayList = new ArrayList();
                int size = c5617e.mo5125d().size();
                for (int i = 0; i < size; i++) {
                    C5618f c5618f = (C5618f) c5617e.mo5125d().get(Integer.toString(i));
                    if (c5618f == null) {
                        String valueOf = String.valueOf(c5617e);
                        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(valueOf).toString());
                    }
                    arrayList.add(Asset.m26608a(c5618f.mo5066b()));
                }
                return nx.m25242a(new ny(nz.m25246a(c5617e.mo5124c()), arrayList));
            } catch (zzfyy e2) {
                e = e2;
            } catch (NullPointerException e3) {
                e = e3;
            }
        }
        valueOf = String.valueOf(c5617e.mo5123b());
        String encodeToString = Base64.encodeToString(c5617e.mo5124c(), 0);
        Log.w("DataItem", new StringBuilder((String.valueOf(valueOf).length() + 50) + String.valueOf(encodeToString).length()).append("Unable to parse datamap from dataItem. uri=").append(valueOf).append(", data=").append(encodeToString).toString());
        encodeToString = String.valueOf(c5617e.mo5123b());
        throw new IllegalStateException(new StringBuilder(String.valueOf(encodeToString).length() + 44).append("Unable to parse datamap from dataItem.  uri=").append(encodeToString).toString(), e);
    }
}
