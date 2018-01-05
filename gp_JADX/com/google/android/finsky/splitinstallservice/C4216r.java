package com.google.android.finsky.splitinstallservice;

import android.support.v7.widget.eq;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3367k;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.play.p122c.p246b.p247a.C6279c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final /* synthetic */ class C4216r implements ao {
    public final C4215q f21278a;
    public final String f21279b;
    public final C2322b f21280c;
    public final String[] f21281d;
    public final C6279c f21282e;

    C4216r(C4215q c4215q, String str, C2322b c2322b, String[] strArr, C6279c c6279c) {
        this.f21278a = c4215q;
        this.f21279b = str;
        this.f21280c = c2322b;
        this.f21281d = strArr;
        this.f21282e = c6279c;
    }

    public final void mo4017a(Object obj) {
        C4215q c4215q = this.f21278a;
        String str = this.f21279b;
        C2322b c2322b = this.f21280c;
        String[] strArr = this.f21281d;
        C6279c c6279c = this.f21282e;
        List<C4196a> list = (List) obj;
        long a = C4678i.m21812a() - C4215q.f21261a;
        c4215q.f21268h.m19560a().mo1523b(C1215q.m7189a(new C1215q("package_name", (Object) str), new C1215q().m7197b("creation_timestamp", Long.valueOf(a)), "AND"));
        List arrayList = new ArrayList();
        for (C4196a c4196a : list) {
            if (c4196a.f21146k >= a) {
                arrayList.add(c4196a);
            } else if (C4215q.m19604a()) {
                c4215q.f21275o.m19574a(c4196a.f21137b);
            }
        }
        List b = C4215q.m19607b(arrayList);
        InstallRequest a2 = c4215q.m19612a(str, c2322b, strArr);
        C4196a a3 = C4215q.m19599a(b, a2);
        if (a3 != null) {
            C4215q.m19601a(a3.f21137b, c6279c);
        } else if (b.size() >= ((Integer) C0955b.fS.m28964b()).intValue()) {
            c4215q.m19621b(c6279c, -1);
        } else {
            String absolutePath;
            int a4 = c4215q.f21267g.m19571a();
            if (C4215q.m19604a()) {
                try {
                    c4215q.f21275o.m19575b(a4).mkdirs();
                } catch (IOException e) {
                    c4215q.m19621b(c6279c, -100);
                    return;
                }
            }
            C3366j c3366j = new C3366j(a2);
            if (!C4671b.m21787d()) {
                File file = new File(c4215q.m19613a(str), String.valueOf(a4));
                file.mkdirs();
                absolutePath = file.getAbsolutePath();
            } else if (C4215q.m19604a()) {
                absolutePath = c4215q.f21275o.m19575b(a4).getAbsolutePath();
            } else {
                absolutePath = null;
            }
            if (absolutePath != null) {
                C3314d c3314d = c3366j.f17266b;
                if (absolutePath == null) {
                    throw new NullPointerException();
                }
                c3314d.f17131a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                c3314d.f17149s = absolutePath;
            }
            c4215q.f21277q.post(new ac(c4215q, str, c6279c, a4, c3366j.m16809a(C3367k.f17268b).m16806a()));
        }
    }
}
