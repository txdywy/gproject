package com.google.android.finsky.uninstall;

import android.os.AsyncTask;
import android.os.Environment;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.dl;
import com.google.android.finsky.dk.C2830g;

final class C4602p extends AsyncTask {
    public long f23648a;
    public final /* synthetic */ C4597k f23649b;

    C4602p(C4597k c4597k) {
        this.f23649b = c4597k;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f23649b.f23631g = this.f23648a;
        this.f23649b.f23625a = true;
        this.f23649b.m21407b();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        long intValue;
        if (C1473m.f7980a.dj().mo2294a(12612210)) {
            C2441n N = this.f23649b.f23633i.m14625N();
            C2322b a = C1473m.f7980a.mo2029I().f18023c.mo2854a(N.f13171k);
            int i = a != null ? a.f11419d : -1;
            long j = 0;
            for (dl dlVar : N.f13174n) {
                if (i < dlVar.f12155d && (!(dlVar.f12154c == 1 || dlVar.f12154c == 2) || Environment.isExternalStorageEmulated())) {
                    j += dlVar.f12156e;
                }
            }
            intValue = ((long) (((Integer) C0955b.aY.m28964b()).intValue() / 100)) * j;
        } else {
            intValue = (((long) ((Integer) C0955b.aY.m28964b()).intValue()) * this.f23649b.f23633i.m14670y()) / 100;
        }
        C1473m.f7980a.bD();
        this.f23648a = intValue + C1473m.f7980a.bD().m14974a(C2830g.m14971g());
        return null;
    }
}
