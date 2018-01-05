package com.google.android.gms.internal;

import android.content.SharedPreferences;

final class yo extends yk {
    yo(String str, Float f) {
        super(str, f);
    }

    public final /* synthetic */ Object mo4952a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.f27734a, ((Float) this.f27735b).floatValue()));
    }
}
