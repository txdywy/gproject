package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import android.util.Log;

final class C5560s extends C5550i {
    private final Long m26546b(SharedPreferences sharedPreferences) {
        try {
            return Long.valueOf(sharedPreferences.getLong(this.e, 0));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "PhenotypeFlag";
            String str2 = "Invalid long value in SharedPreferences for ";
            String valueOf = String.valueOf(this.e);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    private final Long m26547b(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e) {
            String str2 = this.e;
            Log.e("PhenotypeFlag", new StringBuilder((String.valueOf(str2).length() + 25) + String.valueOf(str).length()).append("Invalid long value for ").append(str2).append(": ").append(str).toString());
            return null;
        }
    }

    public final /* synthetic */ Object mo5049a(SharedPreferences sharedPreferences) {
        return m26546b(sharedPreferences);
    }

    public final /* synthetic */ Object mo5050a(String str) {
        return m26547b(str);
    }

    C5560s(C5551j c5551j, String str, Long l) {
        super(c5551j, str, l);
    }
}
