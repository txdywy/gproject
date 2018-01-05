package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class yn extends yk {
    yn(String str, Long l) {
        super(str, l);
    }

    public final /* synthetic */ Object mo4952a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f27734a, ((Long) this.f27735b).longValue()));
    }
}
