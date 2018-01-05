package com.google.android.finsky.installer.p207a;

import android.accounts.Account;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p189e.C2954i;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.FinskyLog;

final class ar extends AsyncTask {
    public final /* synthetic */ C3647b f16944a;
    public final /* synthetic */ ah f16945b;

    ar(ah ahVar, C3647b c3647b) {
        this.f16945b = ahVar;
        this.f16944a = c3647b;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String[] strArr;
        Object obj2;
        Account account;
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        Integer num4;
        Boolean bool = (Boolean) obj;
        ah ahVar = this.f16945b;
        C3647b c3647b = this.f16944a;
        if (bool.booleanValue()) {
            strArr = ah.f16868b;
        } else {
            strArr = ah.f16867a;
        }
        C2129c c2129c = c3647b.f18029d;
        String str2 = c2129c.f10807a;
        int i = c2129c.f10809c;
        if ((c2129c.f10819m & 65536) != 0) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        String str3 = c2129c.f10826t;
        Account account2 = null;
        String str4 = c2129c.f10822p;
        if (obj2 == null) {
            Object obj3;
            if (!TextUtils.isEmpty(str4)) {
                account2 = ahVar.f16916x.mo1183b(str4);
                if (account2 == null) {
                    FinskyLog.m21665c("Account %s for update of %s no longer exists.", FinskyLog.m21655a(str4), str2);
                    ahVar.f16900h.mo2674c(str2, null);
                }
            }
            if (account2 == null) {
                String str5 = c2129c.f10815i;
                obj3 = str5;
                account2 = ahVar.f16916x.mo1183b(str5);
            } else {
                String str6 = str4;
            }
            if (account2 == null) {
                if (((c2129c.f10819m & 1048576) != 0 ? 1 : null) != null) {
                    FinskyLog.m21659a("Unauthenticated delivery for %s.", str2);
                    account = account2;
                } else {
                    FinskyLog.m21659a("Invalid account %s", obj3);
                    ahVar.m16435a(false);
                    ahVar.m16433a(str2, 906);
                    return;
                }
            }
            account = account2;
        } else {
            account = null;
        }
        if (c3647b.f18028c == null || !((Boolean) C0955b.aZ.m28964b()).booleanValue()) {
            num = null;
            num2 = null;
        } else {
            Integer valueOf = Integer.valueOf(c3647b.f18028c.f11419d);
            if (c3647b.f18028c.f11420e != 0) {
                num = Integer.valueOf(c3647b.f18028c.f11420e);
                num2 = valueOf;
            } else {
                num = null;
                num2 = valueOf;
            }
        }
        Integer num5 = null;
        if (c2129c.f10802I != 0) {
            num5 = Integer.valueOf(c2129c.f10802I);
        }
        Long l = null;
        if (num2 != null && ahVar.f16911s.dj().mo2294a(12637130)) {
            l = Long.valueOf(c3647b.f18028c.f11421f);
        }
        if (c3647b.f18028c != null) {
            str6 = c3647b.f18028c.f11417b[0];
        } else {
            str6 = ahVar.m16444d();
        }
        if (!ahVar.m16450j() || ahVar.ac == null || ahVar.ac.mo3416c() == c2129c.f10809c) {
            str = str6;
            num3 = num;
            num4 = num2;
        } else {
            num2 = Integer.valueOf(ahVar.ac.mo3416c());
            num = Integer.valueOf(ahVar.ac.mo3417d());
            str = ahVar.ac.mo3418e();
            num3 = num;
            num4 = num2;
        }
        ahVar.f16903k.mo2842a(str2, 0, 0);
        C0660x asVar = new as(ahVar, str2);
        C0657w auVar = new au(ahVar, str2);
        String[] strArr2 = null;
        if (ahVar.m16452l()) {
            Object[] objArr;
            Object[] objArr2 = c2129c.f10805L;
            if (c3647b.f18028c != null) {
                objArr = c3647b.f18028c.f11430o;
            } else {
                objArr = null;
            }
            strArr2 = (String[]) C4672c.m21806a(objArr2, objArr);
        }
        if (obj2 != null) {
            FinskyLog.m21659a("Request earlyDelivery for %s", str2);
            String str7 = null;
            if (ahVar.f16912t.getPackageName().equals(str2)) {
                str7 = ahVar.f16918z.m13497a();
            }
            ahVar.f16917y.mo2017b().mo1589a(str2, Integer.valueOf(i), num4, num5, num3, l, strArr, ah.f16869c, str7, str, str3, strArr2, asVar, auVar);
        } else {
            C1254c a;
            byte[] f;
            if (account != null) {
                a = ahVar.f16917y.mo2016a(account.name);
            } else {
                a = ahVar.f16917y.mo2017b();
            }
            if (account != null) {
                f = ahVar.f16897e.mo2811a(account).mo2791f(C2229h.f11120a);
            } else {
                f = null;
            }
            a.mo1600a(str2, f, Integer.valueOf(i), num4, num5, num3, l, strArr, ah.f16869c, null, str, (c2129c.f10819m & 524288) != 0, str3, ahVar.f16893X.w, strArr2, asVar, auVar);
        }
        ahVar.m16439b(10, c2129c.f10814h);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        FinskyLog.m21659a("File-by-File compatibility check result: %s", Boolean.valueOf(C2954i.m15343a(this.f16945b.f16875F)));
        return Boolean.valueOf(C2954i.m15343a(this.f16945b.f16875F));
    }
}
