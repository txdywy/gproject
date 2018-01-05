package com.google.android.finsky.uninstall.v2a;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0956c;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.notification.C1061b;
import com.google.android.finsky.notification.C3820u;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class C4632z implements C1003o {
    public static C4632z f23839a;
    public static final C0956c f23840b;
    public static final C0957n f23841c;
    public static final C0957n f23842d = f23840b.m5754a("failed_package_names", new HashSet());
    public final C2471a f23843e = C1473m.f7980a.aR();
    public C1061b f23844f;

    private C4632z() {
    }

    public static synchronized C4632z m21584a() {
        C4632z c4632z;
        synchronized (C4632z.class) {
            if (af.m21457a().m21462b() && C1473m.f7980a.dj().mo2294a(12620479)) {
                if (f23839a == null) {
                    f23839a = new C4632z();
                    C1473m.f7980a.bw().mo3481a(f23839a);
                }
                c4632z = f23839a;
            } else {
                c4632z = null;
            }
        }
        return c4632z;
    }

    public final void mo1205a(C3369m c3369m) {
        Object obj = (Set) f23841c.m5760a();
        if (c3369m.f17273c.f17153d == 2 || c3369m.f17273c.f17153d == 1 || (c3369m.f17273c.f17153d == 3 && c3369m.m16820b() != 908)) {
            obj.remove(c3369m.m16819a());
            f23841c.m5763a(obj);
            if (obj.isEmpty()) {
                Object obj2 = (Set) f23842d.m5760a();
                if (!obj2.isEmpty()) {
                    ArrayList arrayList = new ArrayList((Collection) f23842d.m5760a());
                    C2495w a = this.f23843e.m13183a(C1473m.f7980a.mo2029I().f18022b.mo2657a((String) arrayList.get(0)).m11120d());
                    if (this.f23844f == null || !this.f23844f.mo1348a()) {
                        Context context = C1473m.f7980a.f7981b;
                        C1473m.f7980a.mo2259r().mo3794a("1.high-priority-notifications", "aggregatedFailedUpdates", context.getString(C7582R.string.internal_space_multiple_failures_bar), context.getString(C7582R.string.internal_space_multiple_failures_title), context.getString(C7582R.string.internal_space_multiple_failures_message), C3820u.m18262a(C1473m.f7980a.bo().mo2754a()).m18268a("failed_installations_package_names", arrayList).m18265a(), "err", C1608h.m9251b(3), context.getString(C7582R.string.internal_space_action_button), 911, a);
                    } else {
                        this.f23844f.mo1352a(arrayList, a);
                    }
                    obj2.clear();
                    f23842d.m5763a(obj2);
                }
            }
        }
    }

    static {
        C0956c c0956c = new C0956c("notification_helper_preferences");
        f23840b = c0956c;
        f23841c = c0956c.m5754a("pending_package_names", new HashSet());
    }
}
