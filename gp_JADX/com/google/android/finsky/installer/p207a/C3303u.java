package com.google.android.finsky.installer.p207a;

import android.os.AsyncTask;
import com.google.android.finsky.download.C2845h;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

final class C3303u extends AsyncTask {
    public final /* synthetic */ C3301s f17098a;

    C3303u(C3301s c3301s) {
        this.f17098a = c3301s;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        int i;
        List arrayList;
        ArrayList arrayList2;
        int size;
        int i2 = 0;
        List<C2845h> list = (List) obj;
        if (list != null) {
            if (this.f17098a.m16622d()) {
                this.f17098a.m16614b(new C3304v(this, list));
                i = 0;
                if (i != 0) {
                    C3301s c3301s = this.f17098a;
                    List<C3647b> a = c3301s.f17072b.m17245a();
                    arrayList = new ArrayList(a.size());
                    for (C3647b c3647b : a) {
                        arrayList.add(c3647b.f18026a);
                    }
                    c3301s.f17079i.mo2851a(arrayList);
                    c3301s.f17093w = true;
                    c3301s.f17094x = false;
                    c3301s.m16607a(true);
                    arrayList2 = c3301s.f17095y;
                    size = arrayList2.size();
                    while (i2 < size) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((Runnable) obj2).run();
                    }
                }
            }
            C3301s c3301s2 = this.f17098a;
            int i3 = 0;
            for (C2845h c2845h : list) {
                FinskyLog.m21659a("Attempt recovery of %s %d", c2845h.f15276a, Integer.valueOf(c2845h.f15279d));
                if (i3 == 0 && c3301s2.m16608a(c2845h.f15276a, c2845h.f15279d)) {
                    i3 = true;
                } else {
                    FinskyLog.m21659a("Releasing %s %d", c2845h.f15276a, Integer.valueOf(c2845h.f15279d));
                    c3301s2.f17073c.mo3179c(c2845h.f15276a);
                }
            }
        }
        boolean z = true;
        if (i != 0) {
            C3301s c3301s3 = this.f17098a;
            List<C3647b> a2 = c3301s3.f17072b.m17245a();
            arrayList = new ArrayList(a2.size());
            while (r5.hasNext()) {
                arrayList.add(c3647b.f18026a);
            }
            c3301s3.f17079i.mo2851a(arrayList);
            c3301s3.f17093w = true;
            c3301s3.f17094x = false;
            c3301s3.m16607a(true);
            arrayList2 = c3301s3.f17095y;
            size = arrayList2.size();
            while (i2 < size) {
                Object obj22 = arrayList2.get(i2);
                i2++;
                ((Runnable) obj22).run();
            }
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        File file = new File(this.f17098a.f17071a.getCacheDir(), "patches");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                for (File delete : listFiles) {
                    if (!delete.delete()) {
                        FinskyLog.m21665c("failed to delete file from cache dir: '%s'", listFiles[r0].getAbsolutePath());
                    }
                }
            }
        }
        this.f17098a.m16641q("copies");
        this.f17098a.f17072b.f18022b.m11209c();
        return this.f17098a.f17073c.mo3172a();
    }
}
