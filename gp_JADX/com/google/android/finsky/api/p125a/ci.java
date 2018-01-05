package com.google.android.finsky.api.p125a;

import com.google.wireless.android.finsky.dfe.nano.gf;
import java.util.Arrays;

final class ci implements dc {
    public String f7450a;
    public final /* synthetic */ gf f7451b;

    ci(gf gfVar) {
        this.f7451b = gfVar;
    }

    public final String mo1537a(String str) {
        if (this.f7450a == null) {
            StringBuilder append = new StringBuilder(str).append("/billing=").append(this.f7451b.b).append("/package=").append(this.f7451b.c).append("/type=").append(this.f7451b.d);
            if (this.f7451b.f.length == 0) {
                append.append("/skuids=").append(Arrays.hashCode(this.f7451b.e));
            } else {
                append.append("/dynamicskus=").append(Arrays.hashCode(this.f7451b.f));
            }
            this.f7450a = append.toString();
        }
        return this.f7450a;
    }
}
