package com.google.android.finsky.setup.p242d.p244a;

import android.os.AsyncTask;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.ch;
import com.google.android.finsky.setup.PackageSetupStatus;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.bx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

final class C4158n extends AsyncTask {
    public final /* synthetic */ List f21020a;
    public final /* synthetic */ C4156l f21021b;

    C4158n(C4156l c4156l, List list) {
        this.f21021b = c4156l;
        this.f21020a = list;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List list = (List) obj;
        if (list != null) {
            this.f21021b.f21015g.mo3928a(this.f21021b.f21009a, list, false);
        }
        C4156l c4156l = this.f21021b;
        c4156l.f21018j--;
        this.f21021b.f21010b.mo3988a();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C4156l c4156l = this.f21021b;
        List<PackageSetupStatus> list = this.f21020a;
        Collection hashSet = new HashSet();
        for (PackageSetupStatus packageSetupStatus : list) {
            if (!(packageSetupStatus == null || packageSetupStatus.f20546a.f20899m == null)) {
                for (ch chVar : packageSetupStatus.f20546a.f20899m.f12312d) {
                    Object obj;
                    C2322b a = c4156l.f21012d.mo2854a(chVar.f12035c);
                    if ((a == null ? -1 : a.f11419d) >= chVar.f12036d) {
                        FinskyLog.m21659a("Should not restore dependency %s:%d because installed version is %d", chVar.f12035c, Integer.valueOf(chVar.f12036d), Integer.valueOf(a == null ? -1 : a.f11419d));
                        obj = null;
                    } else if (c4156l.f21011c.m19232b(chVar.f12035c) != null) {
                        FinskyLog.m21659a("Should not restore dependency %s:%d because already tracking", chVar.f12035c, Integer.valueOf(chVar.f12036d));
                        obj = null;
                    } else {
                        FinskyLog.m21659a("Should restore dependency %s:%d (installed=%d)", chVar.f12035c, Integer.valueOf(chVar.f12036d), Integer.valueOf(r0));
                        obj = 1;
                    }
                    if (obj != null) {
                        hashSet.add(chVar.f12035c);
                    }
                }
            }
        }
        List arrayList = new ArrayList(hashSet);
        if (arrayList.isEmpty()) {
            FinskyLog.m21659a("Checked %d packages, no dependencies need to be updated.", Integer.valueOf(list.size()));
            return null;
        }
        String b = ((PackageSetupStatus) list.get(0)).m19068b();
        bx a2 = c4156l.m19441a(b, arrayList);
        if (a2 == null) {
            FinskyLog.m21659a("Failed to getBulkDetails for %d dependencies", Integer.valueOf(arrayList.size()));
            return null;
        }
        c4156l.m19442a(a2, b);
        return C4156l.m19438a(a2, b, C4156l.m19439b(list));
    }
}
