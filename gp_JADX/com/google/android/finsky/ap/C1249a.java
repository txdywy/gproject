package com.google.android.finsky.ap;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class C1249a {
    public final C0988c f7414a;
    public final C0986a f7415b;
    public final C1461c f7416c;
    public final C3027b f7417d;
    public final Map f7418e = new HashMap();

    public C1249a(C0988c c0988c, C0986a c0986a, C1461c c1461c, C3027b c3027b) {
        this.f7414a = c0988c;
        this.f7415b = c0986a;
        this.f7416c = c1461c;
        this.f7417d = c3027b;
    }

    public final String m7250a(Document document, String str) {
        if (document.f14885a.f12098e != 1) {
            return this.f7414a.cZ();
        }
        String str2;
        String cf = document.cf();
        if (cf == null) {
            FinskyLog.m21669e("DetailsAccountHelper: PackageName can not be null", new Object[0]);
        }
        String cZ = this.f7414a.cZ();
        boolean z = !TextUtils.isEmpty(str);
        if (z) {
            str2 = str;
        } else {
            str = this.f7417d.m15626a(cf).m15620a(cZ);
            Set set = (Set) this.f7418e.get(cf);
            if (!this.f7416c.dj().mo2294a(12622972) || cZ.equals(str) || set == null || !set.contains(str)) {
                str2 = str;
            } else {
                str2 = cZ;
            }
        }
        if (!z && cZ.equals(str2)) {
            return str2;
        }
        FinskyLog.m21659a("Selecting account %s for package %s. overriding=[%s]", FinskyLog.m21655a(str2), cf, Boolean.valueOf(z));
        return str2;
    }

    public final Account m7251b(Document document, String str) {
        return this.f7415b.mo1183b(m7250a(document, str));
    }
}
