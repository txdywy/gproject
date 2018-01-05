package com.google.android.finsky.externalreferrer;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.C4678i;
import com.google.wireless.android.a.a.a.a.ar;

public final class C3024o extends C3023r {
    public final Context f15801a;
    public final C2127b f15802b;
    public final C1500a f15803c;
    public final C0988c f15804d;
    public final C3011c f15805e;
    public final C1463g f15806f;

    C3024o(Context context, C3011c c3011c, C2127b c2127b, C1500a c1500a, C0988c c0988c, C1463g c1463g) {
        this.f15801a = context;
        this.f15805e = c3011c;
        this.f15802b = c2127b;
        this.f15803c = c1500a;
        this.f15804d = c0988c;
        this.f15806f = c1463g;
    }

    public final Bundle mo3274a(Bundle bundle) {
        Object obj = (bundle == null || TextUtils.isEmpty(bundle.getString("package_name"))) ? null : 1;
        if (obj == null) {
            m15610a(560, null, "dropped_invalid_input", null, null, GetInstallReferrerService.f15751a, GetInstallReferrerService.f15751a, null);
            return C3024o.m15609a(GetInstallReferrerService.f15751a);
        }
        String str;
        String string = bundle.getString("package_name");
        String[] packagesForUid = this.f15801a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null || packagesForUid.length == 0) {
            obj = null;
        } else {
            for (String str2 : packagesForUid) {
                if (str2.equals(string)) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
        }
        if (obj == null) {
            String str3 = "dropped_invalid_caller";
            Long l = GetInstallReferrerService.f15751a;
            Long l2 = GetInstallReferrerService.f15751a;
            String[] packagesForUid2 = this.f15801a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            String str4 = "";
            if (packagesForUid2 != null) {
                for (String str5 : packagesForUid2) {
                    str4 = String.valueOf(str4);
                    str4 = new StringBuilder((String.valueOf(str4).length() + 1) + String.valueOf(str5).length()).append(str4).append(str5).append(",").toString();
                }
            }
            m15610a(560, string, str3, null, null, l, l2, str4);
            return C3024o.m15609a(GetInstallReferrerService.f15751a);
        }
        long longValue;
        C2129c a = this.f15802b.mo2657a(string);
        ExternalReferrerStatus a2 = this.f15805e.m15588a(string, a);
        if (a == null) {
            longValue = GetInstallReferrerService.f15751a.longValue();
        } else {
            longValue = a.f10800G;
        }
        l2 = Long.valueOf(longValue);
        if (a2 == null) {
            m15610a(561, string, "delivered_organic", null, null, GetInstallReferrerService.f15751a, l2, null);
            return C3024o.m15609a(l2);
        }
        l = a2.m15583a();
        if (l.longValue() > 0) {
            if (((Long) C0955b.ai.m28964b()).longValue() + l.longValue() < C4678i.m21812a()) {
                m15610a(560, string, "dropped_expired", null, null, l, l2, null);
                return C3024o.m15609a(l2);
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("referrer_click_timestamp_seconds", l.longValue() / 1000);
        bundle2.putLong("install_begin_timestamp_seconds", l2.longValue() / 1000);
        obj = (a == null || !this.f15803c.m8819a(this.f15804d.mo2240e(a.f10815i))) ? null : 1;
        boolean c = this.f15803c.m8823c();
        if (obj != null || c) {
            bundle2.putString("install_referrer", (String) C0955b.ah.m28964b());
            m15610a(561, string, "delivered_managed_account", null, null, l, l2, null);
            return bundle2;
        }
        str2 = a2.f15750a.f15761c;
        if (TextUtils.isEmpty(str2)) {
            bundle2.putString("install_referrer", (String) C0955b.ah.m28964b());
            m15610a(561, string, "delivered_notset", null, a2.f15750a.f15762d, l, l2, null);
            return bundle2;
        }
        bundle2.putString("install_referrer", str2);
        m15610a(561, string, "delivered_external", str2, a2.f15750a.f15762d, l, l2, null);
        return bundle2;
    }

    private static Bundle m15609a(Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("install_referrer", (String) C0955b.af.m28964b());
        bundle.putLong("referrer_click_timestamp_seconds", GetInstallReferrerService.f15751a.longValue());
        bundle.putLong("install_begin_timestamp_seconds", l.longValue() / 1000);
        return bundle;
    }

    private final void m15610a(int i, String str, String str2, String str3, String str4, Long l, Long l2, String str5) {
        C2474c b = new C2474c(i).m13236a(str).m13244b(str2);
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        ar arVar = new ar();
        if (!TextUtils.isEmpty(str3)) {
            if (str3 == null) {
                throw new NullPointerException();
            }
            arVar.a |= 1;
            arVar.b = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            if (str4 == null) {
                throw new NullPointerException();
            }
            arVar.a |= 2;
            arVar.c = str4;
        }
        arVar.a |= 4;
        arVar.d = longValue;
        arVar.a |= 8;
        arVar.e = longValue2;
        if (!TextUtils.isEmpty(str5)) {
            if (str5 == null) {
                throw new NullPointerException();
            }
            arVar.a |= 16;
            arVar.f = str5;
        }
        b.f13342a.aD = arVar;
        this.f15806f.dc().m13319a(b.f13342a, null);
    }
}
