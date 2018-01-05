package com.google.android.finsky.updatechecker.impl;

import android.os.AsyncTask;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dr.C2883a;
import com.google.android.finsky.dv.C2905g;
import com.google.android.finsky.dv.C2906h;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.updatechecker.C4642f;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

final class C4665x extends AsyncTask {
    public final /* synthetic */ C2239c f24015a;
    public final /* synthetic */ C4642f f24016b;
    public final /* synthetic */ C4664w f24017c;

    C4665x(C4664w c4664w, C2239c c2239c, C4642f c4642f) {
        this.f24017c = c4664w;
        this.f24015a = c2239c;
        this.f24016b = c4642f;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List<String> list = (List) obj;
        if (list.isEmpty()) {
            FinskyLog.m21667d("No system apps, we should not be here!", new Object[0]);
            C4664w.m21652a(this.f24015a, false);
            return;
        }
        C2906h c2906h = this.f24017c.f24014f;
        C2335k c2905g = new C2905g(c2906h.f15451c, c2906h.f15452d, c2906h.f15450b, c2906h.f15455g);
        c2905g.m11918a(new C4666y(this, c2905g));
        c2905g.m11917a(new C4667z(this));
        List arrayList = new ArrayList(list.size());
        for (String str : list) {
            C2322b a = c2905g.f15444e.mo2854a(str);
            int i = -1;
            Integer num = null;
            Long l = null;
            String[] strArr = null;
            if (a != null) {
                Integer num2;
                Long l2;
                int i2 = a.f11419d;
                if (a.f11420e == 0) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(a.f11420e);
                }
                if (a.f11421f == 0) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(a.f11421f);
                }
                strArr = a.f11430o;
                l = l2;
                i = i2;
                num = num2;
            } else {
                FinskyLog.m21669e("Tried unauth requests for non-installed apps", new Object[0]);
            }
            arrayList.add(new C1283d(str, i, num, l, strArr, false, Boolean.valueOf(false)));
        }
        c2905g.m14759a(c2905g.f15443d.mo2017b(), arrayList, c2905g.f15448l);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C2322b a;
        Collection hashSet = new HashSet();
        if (C2883a.m15122b(this.f24017c.f24013e, this.f24017c.f24011c)) {
            a = this.f24017c.f24012d.mo2854a("com.google.android.gms");
            if (a != null && a.f11422g) {
                hashSet.add("com.google.android.gms");
            }
        }
        if (C2883a.m15120a(this.f24017c.f24013e, this.f24017c.f24011c)) {
            for (C2322b a2 : this.f24017c.f24012d.mo2855a()) {
                if (!a2.f11424i && a2.f11422g) {
                    hashSet.add(a2.f11416a);
                }
            }
        }
        return new ArrayList(hashSet);
    }
}
