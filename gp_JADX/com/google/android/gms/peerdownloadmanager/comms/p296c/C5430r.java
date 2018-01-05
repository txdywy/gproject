package com.google.android.gms.peerdownloadmanager.comms.p296c;

import com.google.common.a.e;
import java.util.List;

final class C5430r implements e {
    public final Boolean[] f28085a;

    C5430r(Boolean... boolArr) {
        this.f28085a = boolArr;
    }

    public final /* synthetic */ Object m26243a(Object obj) {
        List list = (List) obj;
        if (list == null) {
            throw new IllegalArgumentException("objects is null");
        } else if (this.f28085a.length != list.size()) {
            throw new IllegalArgumentException("number of required results different than number of actual results");
        } else {
            int i = 0;
            while (i < this.f28085a.length) {
                if (this.f28085a[i].booleanValue() && !((Boolean) list.get(i)).booleanValue()) {
                    return Boolean.valueOf(false);
                }
                i++;
            }
            return Boolean.valueOf(true);
        }
    }
}
