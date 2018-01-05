package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import android.util.Log;

final class C5561t extends C5550i {
    private final Integer m26550b(SharedPreferences sharedPreferences) {
        try {
            return Integer.valueOf((int) sharedPreferences.getLong(this.e, 0));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "PhenotypeFlag";
            String str2 = "Invalid integer value in SharedPreferences for ";
            String valueOf = String.valueOf(this.e);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    private final Integer m26551b(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            String str2 = this.e;
            Log.e("PhenotypeFlag", new StringBuilder((String.valueOf(str2).length() + 28) + String.valueOf(str).length()).append("Invalid integer value for ").append(str2).append(": ").append(str).toString());
            return null;
        }
    }

    public final /* synthetic */ Object mo5049a(SharedPreferences sharedPreferences) {
        return m26550b(sharedPreferences);
    }

    public final /* synthetic */ Object mo5050a(String str) {
        return m26551b(str);
    }

    C5561t(C5551j c5551j, String str, Integer num) {
        super(c5551j, str, num);
    }
}
