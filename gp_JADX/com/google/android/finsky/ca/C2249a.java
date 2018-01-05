package com.google.android.finsky.ca;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.C0327a;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.df;
import com.google.wireless.android.finsky.dfe.nano.dg;
import java.util.List;

public final class C2249a {
    public final DevicePolicyManager f11170a;
    public final Context f11171b;
    public final C2127b f11172c;
    public final C1463g f11173d;
    public Intent f11174e;

    public C2249a(DevicePolicyManager devicePolicyManager, Context context, C2127b c2127b, C1463g c1463g) {
        this.f11170a = (DevicePolicyManager) aj.m21700a(devicePolicyManager);
        this.f11171b = (Context) aj.m21700a(context);
        this.f11172c = (C2127b) aj.m21700a(c2127b);
        this.f11173d = (C1463g) aj.m21700a(c1463g);
    }

    public final boolean m11681a() {
        if (m11682b()) {
            return true;
        }
        Intent intent;
        List<ComponentName> activeAdmins = this.f11170a.getActiveAdmins();
        if (activeAdmins != null) {
            for (ComponentName componentName : activeAdmins) {
                Intent intent2 = new Intent("com.android.vending.dpc.APPLICATION_RESTRICTIONS_PROXY");
                intent2.setPackage(componentName.getPackageName());
                if (this.f11171b.getPackageManager().resolveService(intent2, 0) != null) {
                    intent = intent2;
                    break;
                }
            }
        }
        intent = null;
        this.f11174e = intent;
        if (this.f11174e != null) {
            return true;
        }
        return false;
    }

    final boolean m11682b() {
        if (C0327a.m1721a()) {
            return this.f11170a.isCallerApplicationRestrictionsManagingPackage();
        }
        return false;
    }

    final Bundle m11679a(df[] dfVarArr) {
        aj.m21700a(dfVarArr);
        Bundle bundle = new Bundle(dfVarArr.length);
        for (df a : dfVarArr) {
            m11677a(bundle, a);
        }
        return bundle;
    }

    private final Bundle m11677a(Bundle bundle, df dfVar) {
        int i = 0;
        aj.m21700a(bundle);
        aj.m21700a(dfVar);
        String str = dfVar.d;
        if ((dfVar.a == 0 ? 1 : 0) != 0) {
            boolean z;
            if (dfVar.a == 0) {
                z = dfVar.e;
            }
            bundle.putBoolean(str, z);
        } else if (dfVar.a == 1) {
            if (dfVar.a == 1) {
                i = dfVar.f;
            }
            bundle.putInt(str, i);
        } else if (dfVar.a == 2) {
            String str2;
            if (dfVar.a == 2) {
                str2 = dfVar.g;
            } else {
                str2 = "";
            }
            bundle.putString(str, str2);
        } else if (dfVar.e() != null) {
            bundle.putStringArray(str, dfVar.e().a);
        } else if (dfVar.f() != null) {
            bundle.putBundle(str, m11679a(dfVar.f().b));
        } else if (dfVar.g() != null) {
            dg[] dgVarArr = dfVar.g().a;
            int length = dgVarArr.length;
            Parcelable[] parcelableArr = new Parcelable[length];
            while (i < length) {
                parcelableArr[i] = m11679a(dgVarArr[i].b);
                i++;
            }
            bundle.putParcelableArray(str, parcelableArr);
        } else {
            FinskyLog.m21669e("Unknown managed value type for key: '%s'", str);
        }
        return bundle;
    }

    final void m11680a(String str, int i, String str2, int i2, Exception exception, String str3) {
        aj.m21700a(str);
        this.f11173d.mo2242f(str).m13319a(new C2474c(i).m13244b(str2).m13238a((Throwable) exception).m13210a(i2).m13236a(str3).f13342a, null);
    }
}
