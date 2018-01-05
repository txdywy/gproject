package com.google.android.finsky.uninstall.v2a;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

final class C4611d extends AsyncTask {
    public C3646a f23746a = C1473m.f7980a.mo2029I();
    public C2206c f23747b = C1473m.f7980a.ah();
    public final /* synthetic */ C4610c f23748c;

    C4611d(C4610c c4610c) {
        this.f23748c = c4610c;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Set<String> set = (Set) obj;
        List arrayList = new ArrayList();
        PackageManager packageManager = this.f23748c.f23744d.getPackageManager();
        for (String str : set) {
            C3026a a = C1473m.f7980a.bt().m15626a(str);
            if (a.m15623b() && !a.f15822j) {
                try {
                    am amVar = new am(str);
                    amVar.f23735b = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
                    arrayList.add(amVar);
                } catch (NameNotFoundException e) {
                    FinskyLog.m21667d("%s not found in PackageManager", str);
                }
            }
        }
        this.f23748c.m21521a(arrayList);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Collection<C2322b> a = C1473m.f7980a.mo2029I().f18023c.mo2855a();
        Collection arrayList = new ArrayList();
        for (C2322b c2322b : a) {
            if (!c2322b.f11422g) {
                arrayList.add(c2322b.f11416a);
            }
        }
        if (!this.f23747b.mo2816a()) {
            this.f23747b.mo2820c();
        }
        if (!this.f23746a.f18022b.m11208b()) {
            this.f23746a.f18022b.m11209c();
        }
        return this.f23746a.m17247a(this.f23747b, arrayList);
    }
}
