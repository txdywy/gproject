package com.google.android.finsky.uninstall;

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

final class al extends AsyncTask {
    public long f23484a;
    public final /* synthetic */ ae f23485b;

    al(ae aeVar) {
        this.f23485b = aeVar;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f23485b.f23455g = this.f23484a;
        this.f23485b.f23452d = true;
        this.f23485b.m21288i();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        ArrayList arrayList = this.f23485b.f23457i;
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
        this.f23484a = this.f23485b.f23468t.m14974a(C2830g.m14971g()) + j;
        return null;
    }
}
