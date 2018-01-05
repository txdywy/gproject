package com.google.android.libraries.p321b.p322a;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.p102c.C0925g;

final class C5853h extends C5847c {
    C5853h(C5854j c5854j, String str, Boolean bool) {
        super(c5854j, str, bool);
    }

    private final Boolean m27291b(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f, false));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "PhenotypeFlag";
            String str2 = "Invalid boolean value in SharedPreferences for ";
            String valueOf = String.valueOf(this.f);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    protected final /* synthetic */ Object mo5176a(SharedPreferences sharedPreferences) {
        return m27291b(sharedPreferences);
    }

    protected final /* synthetic */ Object mo5177a(String str) {
        if (C0925g.f5700c.matcher(str).matches()) {
            return Boolean.valueOf(true);
        }
        if (C0925g.f5701d.matcher(str).matches()) {
            return Boolean.valueOf(false);
        }
        String str2 = this.f;
        Log.e("PhenotypeFlag", new StringBuilder((String.valueOf(str2).length() + 28) + String.valueOf(str).length()).append("Invalid boolean value for ").append(str2).append(": ").append(str).toString());
        return null;
    }
}
