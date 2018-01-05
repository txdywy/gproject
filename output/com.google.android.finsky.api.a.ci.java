package com.google.android.finsky.api.a;

import com.google.wireless.android.finsky.dfe.nano.gf;
import java.util.Arrays;

public final class com.google.android.finsky.api.a.ci implements com.google.android.finsky.api.a.dc
{

    public String a;
    public final com.google.wireless.android.finsky.dfe.nano.gf b;

    ci(com.google.wireless.android.finsky.dfe.nano.gf p0) {
        this.b = p0;
    }

    public final String a(String p0) {
        if (this.a == 0) {
            v0 = new StringBuilder(p0).append("/billing=").append(this.b.b).append("/package=").append(this.b.c).append("/type=").append(this.b.d);
            if (this.b.f.length == 0)
                v0.append("/skuids=").append(Arrays.hashCode(this.b.e));
            else
                v0.append("/dynamicskus=").append(Arrays.hashCode(this.b.f));
            this.a = v0.toString();
        }
        return this.a;
    }

}
