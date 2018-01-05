package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class ym extends yk {
    ym(String str, Integer num) {
        super(str, num);
    }

    public final /* synthetic */ Object mo4952a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f27734a, ((Integer) this.f27735b).intValue()));
    }
}
