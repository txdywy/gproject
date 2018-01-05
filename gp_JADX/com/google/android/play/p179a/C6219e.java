package com.google.android.play.p179a;

import com.google.android.play.p179a.p352a.C6201l;
import com.google.android.play.p179a.p352a.ad;
import java.util.Arrays;
import java.util.Objects;

public final class C6219e {
    public long[] f31089a = null;
    public long[] f31090b = null;
    public C6201l f31091c = null;
    public C6201l f31092d = null;
    public ad f31093e = null;

    public C6219e(long[] jArr, long[] jArr2, C6201l c6201l, C6201l c6201l2) {
        this.f31089a = jArr;
        this.f31090b = jArr2;
        this.f31092d = c6201l2;
        this.f31091c = c6201l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6219e)) {
            return false;
        }
        C6219e c6219e = (C6219e) obj;
        if (Arrays.equals(this.f31089a, c6219e.f31089a) && Arrays.equals(this.f31090b, c6219e.f31090b) && Objects.equals(this.f31092d, c6219e.f31092d) && Objects.equals(this.f31091c, c6219e.f31091c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31089a)), Integer.valueOf(Arrays.hashCode(this.f31090b)), this.f31091c, this.f31092d});
    }
}
