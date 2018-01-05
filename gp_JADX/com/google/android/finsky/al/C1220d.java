package com.google.android.finsky.al;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.common.http.C0935c;
import com.google.android.common.http.UrlRules;
import com.google.android.finsky.api.C1286g;

public final class C1220d implements C1216i {
    public static final String f7345a = C1286g.f7656a.toString();
    public final Context f7346b;
    public final C1051j f7347c;

    public C1220d(Context context, C1051j c1051j) {
        this.f7346b = context;
        this.f7347c = c1051j;
    }

    public final boolean mo1530a(String[] strArr) {
        return true;
    }

    public final /* synthetic */ boolean mo1529a(Object obj) {
        return this.f7347c == null || this.f7347c.mo1308a((C1221e) obj);
    }

    public final /* synthetic */ boolean mo1532b(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2 = ((C1221e) obj).f7349a;
        C0935c a = UrlRules.m5671a(this.f7346b.getContentResolver()).m5672a(f7345a);
        if (a == C0935c.f5727e) {
            charSequence = f7345a;
        } else {
            charSequence = a.m5673a(f7345a);
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public final /* synthetic */ Object mo1531b(String[] strArr) {
        String str = null;
        if (strArr == null || strArr.length < 3 || (strArr.length - 3) % 2 != 0) {
            return C1221e.f7348d;
        }
        String str2 = null;
        for (int i = 3; i < strArr.length; i += 2) {
            String str3 = strArr[i];
            int i2 = -1;
            switch (str3.hashCode()) {
                case -312917353:
                    if (str3.equals("Heterodyne")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case 79164:
                    if (str3.equals("PGS")) {
                        i2 = 0;
                        break;
                    }
                    break;
            }
            switch (i2) {
                case 0:
                    str = strArr[i + 1];
                    break;
                case 1:
                    str2 = strArr[i + 1];
                    break;
                default:
                    break;
            }
        }
        C1222f c1222f = new C1222f();
        c1222f.f7352a = strArr[1];
        c1222f.f7353b = str;
        c1222f.f7354c = str2;
        return c1222f.m7212a();
    }
}
