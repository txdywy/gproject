package com.google.android.finsky.installqueue.p141a;

import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3362e;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.installqueue.InstallConstraint;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p002a.C0002a;

public final class C3341j extends C3340g {
    public final C0002a f17208a;
    public final C0002a f17209b;
    public final C0002a f17210c;
    public final C0002a f17211d;

    public C3341j(C0002a c0002a, C0002a c0002a2, C0002a c0002a3, C0002a c0002a4) {
        this.f17208a = c0002a;
        this.f17209b = c0002a2;
        this.f17210c = c0002a3;
        this.f17211d = c0002a4;
    }

    public final C4809e mo3479a(C3362e c3362e) {
        Object arrayList = new ArrayList();
        for (C3647b c3647b : ((C3646a) this.f17209b.mo1a()).m17245a()) {
            if ((c3362e.f17260c.isEmpty() || c3362e.f17260c.contains(c3647b.f18026a)) && (c3362e.f17258a.isEmpty() || c3362e.f17258a.contains(c3647b.f18029d.f10801H))) {
                int i;
                C3371p m = ((C3300k) this.f17208a.mo1a()).mo3459m(c3647b.f18026a);
                switch (m.f17276a) {
                    case 0:
                        i = -1;
                        break;
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 7;
                        break;
                    default:
                        FinskyLog.m21669e("Invalid InstallerState: %d", Integer.valueOf(m.f17276a));
                        i = -1;
                        break;
                }
                if (c3362e.f17259b.isEmpty() || c3362e.f17259b.contains(Integer.valueOf(i))) {
                    C3314d c3314d = c3647b.f18029d.f10806M;
                    if (c3314d == null) {
                        String str;
                        C2129c c2129c = c3647b.f18029d;
                        C2470a d = c2129c.m11120d();
                        if (d == null) {
                            d = new C2470a();
                        }
                        String str2 = c2129c.f10807a;
                        int i2 = c2129c.f10809c;
                        if (TextUtils.isEmpty(c2129c.f10818l)) {
                            str = "";
                        } else {
                            str = c2129c.f10818l;
                        }
                        C3366j c3366j = new C3366j(d, str2, i2, str);
                        if (!TextUtils.isEmpty(c2129c.f10815i)) {
                            c3366j.m16815b(c2129c.f10815i);
                        }
                        if (!TextUtils.isEmpty(c2129c.f10826t)) {
                            c3366j.m16817d(c2129c.f10826t);
                        }
                        if (!TextUtils.isEmpty(c2129c.f10796C)) {
                            c3366j.m16816c(c2129c.f10796C);
                        }
                        if (!TextUtils.isEmpty(c2129c.f10801H)) {
                            c3366j.m16810a(c2129c.f10801H);
                        }
                        int i3 = c2129c.f10819m;
                        if ((i3 & 16384) != 0) {
                            c3366j.m16814b(1);
                        } else if ((32768 & i3) != 0) {
                            c3366j.m16814b(2);
                        } else {
                            c3366j.m16814b(3);
                        }
                        C3361d c3361d = new C3361d();
                        if ((i3 & eq.FLAG_MOVED) != 0) {
                            c3361d.m16793a(2);
                        }
                        if ((1048576 & i3) != 0) {
                            c3361d.m16798d();
                        }
                        if ((4194304 & i3) != 0) {
                            c3361d.m16792a();
                        }
                        if ((2097152 & i3) != 0) {
                            c3361d.m16795b();
                        }
                        if ((131072 & i3) != 0) {
                            c3361d.m16797c();
                        }
                        c3366j.m16813a(c3361d.m16799e());
                        c3314d = c3366j.m16806a().f17171a;
                        c3314d.f17145o.m16675a((i3 & 16) == 0);
                        c3314d.f17145o.m16680c((i3 & 128) == 0);
                        c3314d.f17145o.m16679b((i3 & 1) == 0);
                    }
                    arrayList.add(new C3369m(c3647b.f18026a, c3314d, i, 0, m));
                }
            }
        }
        return ((C4817d) this.f17211d.mo1a()).mo4401a(arrayList);
    }

    public final void mo3481a(C1003o c1003o) {
        ((C3300k) this.f17208a.mo1a()).mo3429a(c1003o);
    }

    public final void mo3484b(C1003o c1003o) {
        ((C3300k) this.f17208a.mo1a()).mo3443b(c1003o);
    }

    public final int mo3482b(String str) {
        return ((C3300k) this.f17208a.mo1a()).mo3458l(str);
    }

    public final C3371p mo3485c(String str) {
        return ((C3300k) this.f17208a.mo1a()).mo3459m(str);
    }

    public final C4809e mo3483b(Collection collection) {
        for (InstallRequest installRequest : collection) {
            if (installRequest.f17172b.size() != 1) {
                throw new UnsupportedOperationException("Only single InstallConstraint is currently supported");
            }
            InstallConstraint installConstraint = (InstallConstraint) installRequest.f17172b.get(0);
            if (installConstraint.f17170c != null) {
                throw new UnsupportedOperationException("timeWindow isn't currently supported");
            } else if (installConstraint.f17169b.f17120d) {
                throw new UnsupportedOperationException("requireCharging isn't currently supported");
            } else if (installConstraint.f17169b.f17119c == 3) {
                throw new UnsupportedOperationException("NOT_ROAMING isn't currently supported");
            }
        }
        for (InstallRequest installRequest2 : collection) {
            String str;
            String str2;
            InstallConstraint installConstraint2 = (InstallConstraint) installRequest2.f17172b.get(0);
            C3300k c3300k = (C3300k) this.f17208a.mo1a();
            c3300k.mo3440a(installRequest2.f17171a.f17133c, installRequest2.m16702a().f17270d.f17161b, installRequest2.m16702a().f17270d.f17162c, installRequest2.m16702a().f17270d.f17163d);
            c3300k.mo3439a(installRequest2.f17171a.f17133c, installRequest2.f17171a.f17142l);
            if (installRequest2.f17171a.f17143m) {
                c3300k.mo3454h(installRequest2.f17171a.f17133c);
            }
            if (installRequest2.f17171a.f17144n) {
                c3300k.mo3451e(installRequest2.f17171a.f17133c);
            }
            if (installRequest2.f17171a.f17146p != null) {
                c3300k.mo3437a(installRequest2.f17171a.f17133c, installRequest2.f17171a.f17146p);
            }
            switch (installConstraint2.f17169b.f17119c) {
                case 1:
                    c3300k.mo3448c(installRequest2.f17171a.f17133c);
                    break;
                case 2:
                    c3300k.mo3444b(installRequest2.f17171a.f17133c);
                    break;
                default:
                    FinskyLog.m21669e("Constraint has unexpected network type: %d", Integer.valueOf(installConstraint2.f17169b.f17119c));
                    break;
            }
            if (installConstraint2.f17169b.f17123g == 0) {
                c3300k.mo3452f(installRequest2.f17171a.f17133c);
            }
            if (installConstraint2.f17169b.f17124h == 0) {
                c3300k.mo3456j(installRequest2.f17171a.f17133c);
            }
            if (installConstraint2.f17169b.f17126j < 100) {
                c3300k.mo3453g(installRequest2.f17171a.f17133c);
            }
            if (installConstraint2.f17169b.f17127k == 0) {
                c3300k.mo3455i(installRequest2.f17171a.f17133c);
            }
            C2495w a = ((C2471a) this.f17210c.mo1a()).m13183a(installRequest2.f17171a.f17132b);
            if (TextUtils.isEmpty(installRequest2.f17171a.f17147q)) {
                str = a.f13432b;
            } else {
                str = installRequest2.f17171a.f17147q;
            }
            String str3 = installRequest2.f17171a.f17133c;
            int i = installRequest2.f17171a.f17134d;
            if (TextUtils.isEmpty(installRequest2.f17171a.f17137g)) {
                str2 = null;
            } else {
                str2 = installRequest2.f17171a.f17137g;
            }
            c3300k.mo3435a(str3, i, str2, installRequest2.f17171a.f17138h, installConstraint2.f17169b.f17122f, installRequest2.f17171a.f17139i, installRequest2.f17171a.f17140j, installRequest2.f17171a.f17141k, a, str, installRequest2.f17171a);
        }
        return ((C4817d) this.f17211d.mo1a()).mo4401a(null);
    }

    public final C4809e mo3480a(List list) {
        for (String o : list) {
            ((C3300k) this.f17208a.mo1a()).mo3461o(o);
        }
        return ((C4817d) this.f17211d.mo1a()).mo4401a(null);
    }
}
