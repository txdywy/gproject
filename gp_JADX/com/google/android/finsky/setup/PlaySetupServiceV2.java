package com.google.android.finsky.setup;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p257t.C4562a;
import com.google.android.finsky.setup.p240a.C4126m;
import com.google.android.finsky.setup.p242d.C4146c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class PlaySetupServiceV2 extends Service {
    public C4126m f20558a;
    public C4562a f20559b;
    public C4191x f20560c;
    public C4146c f20561d;

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public void onCreate() {
        super.onCreate();
        this.f20558a = C1473m.f7980a.cN();
        this.f20559b = C1473m.f7980a.bJ();
        this.f20560c = new C4191x(getPackageManager());
        this.f20561d = C1473m.f7980a.cI();
    }

    public IBinder onBind(Intent intent) {
        if (!((Boolean) C0954a.bj.m5760a()).booleanValue()) {
            C1473m.f7980a.aS().mo3944a();
            C0954a.bj.m5763a(Boolean.valueOf(true));
        }
        return new C4192y(this);
    }

    final Bundle m19086a(Bundle bundle) {
        int i = 0;
        C0954a.aZ.m5763a(Boolean.valueOf(true));
        if (((Boolean) C0955b.hq.m28964b()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("reason", "disabled");
            Bundle bundle3 = new Bundle();
            bundle3.putBundle("error", bundle2);
            return bundle3;
        }
        m19088a(TextUtils.join(";", new String[]{(String) C0955b.hr.m28964b(), (String) C0955b.hs.m28964b()}));
        Map hashMap = new HashMap();
        List arrayList = new ArrayList();
        if (bundle.containsKey("documents_type") && bundle.getInt("documents_type") == 1) {
            C0954a.bg.m5763a(Boolean.valueOf(true));
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("documents");
        if (parcelableArray == null) {
            FinskyLog.m21665c("No documents provided to setupDocuments()", new Object[0]);
            return null;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        while (i < bundleArr.length) {
            if (bundleArr[i].getInt("doc_type") == 3) {
                hashMap.put(bundleArr[i].getString("package_name"), bundleArr[i]);
            } else {
                arrayList.add(bundleArr[i]);
            }
            i++;
        }
        C1473m.f7980a.cK().mo3928a((Context) this, arrayList, true);
        if (!hashMap.isEmpty()) {
            C1473m.f7980a.ah().mo2815a(new aa(this, hashMap));
        }
        return null;
    }

    final String m19087a(int i) {
        return getPackageManager().getNameForUid(i);
    }

    static String m19085b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString("caller_id");
    }

    public static Bundle m19083a(String str, String str2) {
        C1473m.f7980a.aS().mo3960b(str2, 2);
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("reason", str);
        bundle.putBundle("error", bundle2);
        return bundle;
    }

    final void m19088a(String str) {
        if (!this.f20560c.m19518a(getPackageManager().getPackagesForUid(Binder.getCallingUid()), str)) {
            throw new SecurityException(String.format(Locale.getDefault(), "No package in %s is authorized to call setup APIs", new Object[]{Arrays.toString(getPackageManager().getPackagesForUid(Binder.getCallingUid()))}));
        }
    }

    public static Bundle m19084b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("error", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("error", bundle);
        return bundle2;
    }
}
