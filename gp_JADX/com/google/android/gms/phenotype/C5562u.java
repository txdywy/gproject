package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.od;

final class C5562u extends C5550i {
    private final Boolean m26554b(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.e, false));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "PhenotypeFlag";
            String str2 = "Invalid boolean value in SharedPreferences for ";
            String valueOf = String.valueOf(this.e);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    public final /* synthetic */ Object mo5049a(SharedPreferences sharedPreferences) {
        return m26554b(sharedPreferences);
    }

    public final /* synthetic */ Object mo5050a(String str) {
        if (od.f27239c.matcher(str).matches()) {
            return Boolean.valueOf(true);
        }
        if (od.f27240d.matcher(str).matches()) {
            return Boolean.valueOf(false);
        }
        String str2 = this.e;
        Log.e("PhenotypeFlag", new StringBuilder((String.valueOf(str2).length() + 28) + String.valueOf(str).length()).append("Invalid boolean value for ").append(str2).append(": ").append(str).toString());
        return null;
    }

    C5562u(C5551j c5551j, String str, Boolean bool) {
        super(c5551j, str, bool);
    }
}
