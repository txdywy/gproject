package com.google.android.finsky.api.p125a;

import android.text.TextUtils;
import com.google.wireless.android.finsky.dfe.nano.bv;
import com.google.wireless.android.finsky.dfe.nano.bw;
import com.google.wireless.android.finsky.dfe.nano.ca;
import java.util.Arrays;

final class ch implements dc {
    public String f7447a;
    public final /* synthetic */ bv f7448b;
    public final /* synthetic */ C1256d f7449c;

    ch(C1256d c1256d, bv bvVar) {
        this.f7449c = c1256d;
        this.f7448b = bvVar;
    }

    public final String mo1537a(String str) {
        if (this.f7447a == null) {
            StringBuilder append = new StringBuilder(str).append("/docidhash=").append(m7332a());
            if (!TextUtils.isEmpty(this.f7449c.f7560K.f7438q)) {
                append.append("/nodeId=").append(this.f7449c.f7560K.f7438q);
            }
            this.f7447a = append.toString();
        }
        return this.f7447a;
    }

    private final String m7332a() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        for (bw bwVar : this.f7448b.b) {
            ca caVar;
            j = (j * 31) + ((long) bwVar.d.hashCode());
            j2 = (j2 * 31) + ((long) bwVar.e);
            j3 = (j3 * 31) + ((long) bwVar.g);
            j4 = (j4 * 31) + bwVar.h;
            j5 = (j5 * 31) + ((long) Arrays.hashCode(bwVar.i));
            j6 = (j6 * 31) + ((long) (bwVar.f ? 1 : 0));
            j7 *= 31;
            if (bwVar.a == 0) {
                caVar = bwVar.j;
            } else {
                caVar = null;
            }
            j7 += (long) (caVar != null ? 1 : 0);
        }
        return j + j2 + j3 + j4 + j5 + j6 + j7;
    }
}
