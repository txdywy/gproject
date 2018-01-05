package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.am;
import java.util.Arrays;

public class C4977g {
    public final DataHolder f25476a;
    public int f25477b;
    public int f25478c;

    public C4977g(DataHolder dataHolder, int i) {
        this.f25476a = (DataHolder) am.m23733a((Object) dataHolder);
        boolean z = i >= 0 && i < this.f25476a.f25956h;
        am.m23738a(z);
        this.f25477b = i;
        this.f25478c = this.f25476a.m23676a(this.f25477b);
    }

    public final String m23122a(String str) {
        return this.f25476a.m23677a(str, this.f25477b, this.f25478c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4977g)) {
            return false;
        }
        C4977g c4977g = (C4977g) obj;
        return ad.m23722a(Integer.valueOf(c4977g.f25477b), Integer.valueOf(this.f25477b)) && ad.m23722a(Integer.valueOf(c4977g.f25478c), Integer.valueOf(this.f25478c)) && c4977g.f25476a == this.f25476a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25477b), Integer.valueOf(this.f25478c), this.f25476a});
    }
}
