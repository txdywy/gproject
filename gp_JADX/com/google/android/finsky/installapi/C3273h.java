package com.google.android.finsky.installapi;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.di.C2745a;
import com.google.android.finsky.di.C2746b;
import com.google.android.finsky.di.C2748d;
import com.google.android.finsky.di.C2749e;
import com.google.android.finsky.di.C2750f;
import com.google.android.finsky.di.C2758n;
import com.google.android.finsky.installapi.p206a.C3256a;
import com.google.android.finsky.installapi.p206a.C3258c;
import com.google.android.finsky.installapi.p206a.C3260e;
import com.google.android.finsky.installapi.p206a.C3265j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.C5107g;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public final class C3273h extends C3268b {
    public final Context f16845a;
    public final C2748d f16846b;
    public final C3270d f16847c;

    C3273h(Context context, C3270d c3270d, C2748d c2748d) {
        this.f16845a = context;
        this.f16847c = c3270d;
        this.f16846b = c2748d;
    }

    public final Bundle mo3401a(String str, String str2, Bundle bundle) {
        FinskyLog.m21659a("installPackage: %s (%s)", str, str2);
        if (!((Boolean) C0955b.gz.m28964b()).booleanValue()) {
            return C3273h.m16387a(-3);
        }
        if (!C3273h.m16388a(this.f16845a, str)) {
            return C3273h.m16387a(-1);
        }
        C3272g c3272g = new C3272g(str, str2, bundle);
        C1473m c1473m = C1473m.f7980a;
        List arrayList = new ArrayList();
        arrayList.add(new C3260e(c1473m.f7981b, c1473m.mo2256o(), c1473m.ah(), c1473m.cZ(), c1473m.mo2041U()));
        C3270d c3270d = this.f16847c;
        arrayList.add(new C3256a(c3270d.f16823b, c3270d.f16824c, c3270d.f16827f, c3270d.f16828g, c3270d.f16830i));
        C3270d c3270d2 = this.f16847c;
        arrayList.add(new C3265j(c3270d2.f16822a, c3270d2.f16823b, c3270d2.f16825d.cZ(), c3270d2.f16824c, c3270d2.f16826e, c3270d2.f16828g));
        C3270d c3270d3 = this.f16847c;
        arrayList.add(new C3258c(c3270d3.f16822a, c3270d3.f16829h, c3270d3.f16824c, C5107g.m23705a(c3270d3.f16822a), c3270d3.f16828g, c3270d3.f16831j, c3270d3.f16826e));
        int size = arrayList.size();
        Bundle bundle2 = null;
        for (int i = 0; i < size; i++) {
            bundle2 = ((C3255f) arrayList.get(i)).mo3398a(c3272g);
            if (bundle2 != null) {
                break;
            }
        }
        if (bundle2 != null) {
            return bundle2;
        }
        FinskyLog.m21665c("No install policy found for calling package %s to install %s", str, str2);
        return C3273h.m16387a(-2);
    }

    private static Bundle m16387a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("status_code", i);
        return bundle;
    }

    public final Bundle mo3400a(String str, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, ResultReceiver resultReceiver) {
        Bundle a = this.f16846b.m14803a(str);
        if (a.getInt("status_code") != 0) {
            return a;
        }
        if (!C3273h.m16388a(this.f16845a, str)) {
            return new C2745a().m14795a(-1).m14794a();
        }
        if (resultReceiver == null) {
            return new C2745a().m14795a(-4).m14796a("ResultReceiver missing").m14794a();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                throw new InvalidParameterException("Package name missing");
            } else if (bundle == null) {
                throw new InvalidParameterException("Bundle parameters missing");
            } else {
                Object string = bundle.getString("split.name");
                if (TextUtils.isEmpty(string)) {
                    throw new InvalidParameterException("Split name missing.");
                } else if (parcelFileDescriptor == null) {
                    throw new InvalidParameterException("FileDescriptor missing");
                } else {
                    C2746b c2746b = new C2746b(str, string, parcelFileDescriptor);
                    C2748d c2748d = this.f16846b;
                    c2748d.f14985d.mo4403a(new C2749e(c2748d, c2746b)).mo4398a(new C3274i(resultReceiver));
                    return new C2745a().m14795a(0).m14794a();
                }
            }
        } catch (InvalidParameterException e) {
            return new C2745a().m14795a(-4).m14796a(e.getMessage()).m14797b(e.getClass().getSimpleName()).m14794a();
        }
    }

    public final Bundle mo3399a(String str, Bundle bundle) {
        Bundle a = this.f16846b.m14803a(str);
        if (a.getInt("status_code") != 0) {
            return a;
        }
        if (!C3273h.m16388a(this.f16845a, str)) {
            return new C2745a().m14795a(-1).m14794a();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                throw new InvalidParameterException("Package name missing");
            } else if (bundle == null) {
                throw new InvalidParameterException("Bundle parameters missing");
            } else {
                Object string = bundle.getString("split.name");
                if (TextUtils.isEmpty(string)) {
                    throw new InvalidParameterException("Split name missing.");
                }
                C2758n c2758n = new C2758n(str, string);
                C2748d c2748d = this.f16846b;
                c2748d.f14985d.mo4403a(new C2750f(c2748d, c2758n)).mo4398a(new C3275j());
                return new C2745a().m14795a(0).m14794a();
            }
        } catch (InvalidParameterException e) {
            return new C2745a().m14795a(-4).m14796a(e.getMessage()).m14797b(e.getClass().getSimpleName()).m14794a();
        }
    }

    private static boolean m16388a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21659a("Calling package is empty!", new Object[0]);
            return false;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null) {
            return false;
        }
        for (String equals : packagesForUid) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
