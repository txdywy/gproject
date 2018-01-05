package com.google.android.instantapps.p309a.p310a;

import android.content.ContentResolver;
import com.google.android.p102c.C0925g;

public final class C5692g implements C5691f {
    public final ContentResolver f28847a;

    public C5692g(ContentResolver contentResolver) {
        this.f28847a = contentResolver;
    }

    public final Boolean mo5129a(String str, Boolean bool) {
        return Boolean.valueOf(C0925g.m5657a(this.f28847a, str, bool.booleanValue()));
    }

    public final Integer mo5130a(String str, Integer num) {
        return Integer.valueOf(C0925g.m5649a(this.f28847a, str, num.intValue()));
    }

    public final Long mo5131a(String str, Long l) {
        return Long.valueOf(C0925g.m5650a(this.f28847a, str, l.longValue()));
    }

    public final String mo5132a(String str, String str2) {
        return C0925g.m5653a(this.f28847a, str, str2);
    }
}
