package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C4925b;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.internal.ad;
import java.util.Arrays;

public final class ch {
    public final boolean f25796a = true;
    public final int f25797b;
    public final C5053a f25798c;
    public final C4925b f25799d;

    public ch(C5053a c5053a) {
        this.f25798c = c5053a;
        this.f25799d = null;
        this.f25797b = System.identityHashCode(this);
    }

    private ch(C5053a c5053a, C4925b c4925b) {
        this.f25798c = c5053a;
        this.f25799d = c4925b;
        this.f25797b = Arrays.hashCode(new Object[]{this.f25798c, this.f25799d});
    }

    public static ch m23529a(C5053a c5053a, C4925b c4925b) {
        return new ch(c5053a, c4925b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return !this.f25796a && !chVar.f25796a && ad.m23722a(this.f25798c, chVar.f25798c) && ad.m23722a(this.f25799d, chVar.f25799d);
    }

    public final int hashCode() {
        return this.f25797b;
    }
}
