package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class yl extends yk {
    yl(String str, Boolean bool) {
        super(str, bool);
    }

    public final /* synthetic */ Object mo4952a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f27734a, ((Boolean) this.f27735b).booleanValue()));
    }
}
