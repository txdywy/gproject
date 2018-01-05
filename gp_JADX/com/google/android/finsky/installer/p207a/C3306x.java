package com.google.android.finsky.installer.p207a;

import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

final class C3306x implements Runnable {
    public final /* synthetic */ String f17103a;
    public final /* synthetic */ C3314d f17104b;
    public final /* synthetic */ int f17105c;
    public final /* synthetic */ int f17106d;
    public final /* synthetic */ List f17107e;
    public final /* synthetic */ C3301s f17108f;

    C3306x(C3301s c3301s, String str, C3314d c3314d, int i, int i2, List list) {
        this.f17108f = c3301s;
        this.f17103a = str;
        this.f17104b = c3314d;
        this.f17105c = i;
        this.f17106d = i2;
        this.f17107e = list;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList(this.f17108f.f17091u);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C1003o c1003o = (C1003o) arrayList.get(i);
            try {
                String str = this.f17103a;
                C3314d c3314d = this.f17104b;
                int i3 = this.f17105c;
                int i4 = this.f17106d;
                C3371p m = this.f17108f.mo3459m(this.f17103a);
                c1003o.mo1205a(new C3369m(str, c3314d, i3, i4, new C3371p(m.f17276a, m.f17277b, m.f17278c, m.f17279d, this.f17107e)));
                i = i2;
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Exception caught in InstallerListener", new Object[0]);
                i = i2;
            }
        }
    }
}
