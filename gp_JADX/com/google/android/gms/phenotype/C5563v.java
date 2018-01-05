package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import android.util.Log;

final class C5563v extends C5550i {
    private final String m26557b(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.e, null);
        } catch (Throwable e) {
            Throwable th = e;
            String str = "PhenotypeFlag";
            String str2 = "Invalid string value in SharedPreferences for ";
            String valueOf = String.valueOf(this.e);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    public final /* synthetic */ Object mo5049a(SharedPreferences sharedPreferences) {
        return m26557b(sharedPreferences);
    }

    public final /* synthetic */ Object mo5050a(String str) {
        return str;
    }

    C5563v(C5551j c5551j, String str, String str2) {
        super(c5551j, str, str2);
    }
}
