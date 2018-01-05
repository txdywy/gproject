package com.google.android.libraries.p321b.p322a;

import android.content.SharedPreferences;
import android.util.Log;

final class C5852g extends C5847c {
    C5852g(C5854j c5854j, String str, Integer num) {
        super(c5854j, str, num);
    }

    private final Integer m27288c(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            String str2 = this.f;
            Log.e("PhenotypeFlag", new StringBuilder((String.valueOf(str2).length() + 28) + String.valueOf(str).length()).append("Invalid integer value for ").append(str2).append(": ").append(str).toString());
            return null;
        }
    }

    private final Integer m27287b(SharedPreferences sharedPreferences) {
        try {
            return Integer.valueOf((int) sharedPreferences.getLong(this.f, 0));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "PhenotypeFlag";
            String str2 = "Invalid integer value in SharedPreferences for ";
            String valueOf = String.valueOf(this.f);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    protected final /* synthetic */ Object mo5176a(SharedPreferences sharedPreferences) {
        return m27287b(sharedPreferences);
    }

    protected final /* synthetic */ Object mo5177a(String str) {
        return m27288c(str);
    }
}
