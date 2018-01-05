package com.google.android.wallet.ui.common;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.wallet.common.p376a.C6553f;
import java.util.Locale;

public final class C6790k implements bx {
    public final String f33674a;
    public final String f33675b;
    public final String f33676c;
    public final String f33677d;
    public final String f33678e;

    public C6790k(String str, String str2) {
        this.f33674a = str;
        this.f33675b = str2;
        String c = C6553f.m29745c(this.f33675b);
        if (TextUtils.isEmpty(c)) {
            Log.w("CountryCodeSelItem", String.format(Locale.US, "Unknown region code: %s", new Object[]{this.f33675b}));
            c = this.f33675b;
        }
        this.f33676c = c;
        this.f33677d = String.format(Locale.US, "+%s", new Object[]{this.f33674a});
        if (TextUtils.isEmpty(this.f33676c)) {
            this.f33678e = this.f33674a;
            return;
        }
        this.f33678e = String.format(Locale.US, "%s +%s", new Object[]{this.f33676c, this.f33674a});
    }

    public final String mo5618a() {
        return this.f33674a;
    }

    public final String toString() {
        return this.f33675b;
    }
}
