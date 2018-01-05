package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.p122c.p246b.p247a.C6279c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

final /* synthetic */ class ag implements ao {
    public final C4215q f21173a;
    public final C6279c f21174b;
    public final C2322b f21175c;
    public final int f21176d;
    public final String f21177e;

    ag(C4215q c4215q, C6279c c6279c, C2322b c2322b, int i, String str) {
        this.f21173a = c4215q;
        this.f21174b = c6279c;
        this.f21175c = c2322b;
        this.f21176d = i;
        this.f21177e = str;
    }

    public final void mo4017a(Object obj) {
        C4215q c4215q = this.f21173a;
        C6279c c6279c = this.f21174b;
        C2322b c2322b = this.f21175c;
        int i = this.f21176d;
        String str = this.f21177e;
        C4196a c4196a = (C4196a) obj;
        if (c4196a == null) {
            C4215q.m19610c(c6279c, -3);
        } else if (c4196a.f21142g != 3) {
            C4215q.m19610c(c6279c, -3);
        } else if (c2322b.f11419d == c4196a.f21139d && c2322b.f11420e == c4196a.f21140e) {
            Collection hashSet = new HashSet(Arrays.asList(c4196a.f21148m));
            if (hashSet.size() == 0) {
                c4215q.m19620b(c4196a.f21138c, i);
                C4215q.m19603a(c6279c, c4196a.f21137b);
                return;
            }
            boolean containsAll;
            C4201d c4201d = c4215q.f21275o;
            if (c4201d.m19575b(i).exists()) {
                containsAll = new HashSet(Arrays.asList(c4201d.m19575b(i).list())).containsAll(hashSet);
            } else {
                containsAll = false;
            }
            if (containsAll) {
                try {
                    c4215q.f21269i.m19588a(c4196a.f21138c, c4196a.f21145j, c4215q.f21275o.m19573a(i, hashSet), c4215q.f21271k.f21149a, new an(c4215q, c4196a, i, c6279c, str));
                    return;
                } catch (IOException e) {
                    String str2 = "Error in PackageInstaller session: ";
                    String valueOf = String.valueOf(e.getMessage());
                    FinskyLog.m21667d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    C4215q.m19610c(c6279c, -100);
                    c4215q.m19616a(str, i);
                    return;
                }
            }
            C4215q.m19610c(c6279c, -100);
            c4215q.m19616a(str, i);
        } else {
            C4215q.m19610c(c6279c, -3);
        }
    }
}
