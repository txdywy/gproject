package com.google.android.finsky.uninstall.v2a;

import android.os.AsyncTask;
import android.os.Environment;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.dl;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dk.C2830g;
import java.util.ArrayList;

final class C4622o extends AsyncTask {
    public long f23790a;
    public final /* synthetic */ C4613f f23791b;

    C4622o(C4613f c4613f) {
        this.f23791b = c4613f;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f23791b.f23764g = this.f23790a;
        this.f23791b.f23758a = true;
        this.f23791b.m21548g();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        ArrayList arrayList = this.f23791b.f23766i;
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            long j2;
            int i2 = i + 1;
            Document document = (Document) arrayList.get(i);
            if (C1473m.f7980a.dj().mo2294a(12612210)) {
                C2441n N = document.m14625N();
                C2322b a = C1473m.f7980a.mo2029I().f18023c.mo2854a(N.f13171k);
                int i3 = a != null ? a.f11419d : -1;
                j2 = 0;
                for (dl dlVar : N.f13174n) {
                    if (i3 < dlVar.f12155d && (!(dlVar.f12154c == 1 || dlVar.f12154c == 2) || Environment.isExternalStorageEmulated())) {
                        j2 += dlVar.f12156e;
                    }
                }
                j2 *= (long) (((Integer) C0955b.aY.m28964b()).intValue() / 100);
            } else {
                j2 = (document.m14670y() * ((long) ((Integer) C0955b.aY.m28964b()).intValue())) / 100;
            }
            j = j2 + j;
            i = i2;
        }
        C1473m.f7980a.bD();
        this.f23790a = C1473m.f7980a.bD().m14974a(C2830g.m14971g()) + j;
        return null;
    }
}
