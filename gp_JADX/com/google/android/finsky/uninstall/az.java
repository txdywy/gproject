package com.google.android.finsky.uninstall;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0956c;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dt.C2887a;
import com.google.android.finsky.dt.C2888b;
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

public final class az implements C2887a, C2888b, C1003o {
    public static az f23521a;
    public static final C0956c f23522b;
    public static final C0957n f23523c;
    public static final C0957n f23524d = f23522b.m5754a("failed_package_names", new HashSet());
    public final C2471a f23525e = C1473m.f7980a.aR();
    public C1061b f23526f;

    private az() {
    }

    public static synchronized az m21336a() {
        az azVar;
        synchronized (az.class) {
            if (bl.m21377a().m21383b() && C1473m.f7980a.dj().mo2294a(12610437)) {
                if (f23521a == null) {
                    f23521a = new az();
                    C1473m.f7980a.bw().mo3481a(f23521a);
                }
                azVar = f23521a;
            } else {
                azVar = null;
            }
        }
        return azVar;
    }

    public final void mo4281a(String str, String str2) {
        Object obj = (Set) f23524d.m5760a();
        if (!obj.contains(str2)) {
            Object obj2 = (Set) f23523c.m5760a();
            if (obj2.contains(str2)) {
                obj2.remove(str2);
                f23523c.m5763a(obj2);
                obj.add(str2);
                f23524d.m5763a(obj);
                if (obj2.isEmpty()) {
                    m21337c();
                    obj.clear();
                    f23524d.m5763a(obj);
                    return;
                }
                return;
            }
            Context context = C1473m.f7980a.f7981b;
            String string = context.getString(C7582R.string.internal_space_single_failure_title, new Object[]{str});
            String string2 = context.getString(C7582R.string.internal_space_single_failure_message, new Object[]{str});
            String string3 = context.getString(C7582R.string.internal_space_single_failure_bar, new Object[]{str});
            C2495w a = this.f23525e.m13183a(C1473m.f7980a.mo2029I().f18022b.mo2657a(str2).m11120d());
            if (this.f23526f == null || this.f23526f.mo1349a(str2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                String str3 = str2;
                String str4 = string;
                String str5 = string2;
                C1473m.f7980a.mo2259r().mo3794a("1.high-priority-notifications", str3, string3, str4, str5, C3820u.m18262a(C1473m.f7980a.bo().mo2755a(C1289l.m7694a(str2))).m18268a("failed_installations_package_names", arrayList).m18265a(), "err", C1608h.m9251b(3), context.getString(C7582R.string.internal_space_action_button), 910, a);
                return;
            }
            this.f23526f.mo1350a(str2, string, string2, 3, a);
        }
    }

    public final void mo1205a(C3369m c3369m) {
        Object obj = (Set) f23523c.m5760a();
        if (c3369m.f17273c.f17153d == 2 || c3369m.f17273c.f17153d == 1 || (c3369m.f17273c.f17153d == 3 && c3369m.m16820b() != 908)) {
            obj.remove(c3369m.m16819a());
            f23523c.m5763a(obj);
            if (obj.isEmpty()) {
                obj = (Set) f23524d.m5760a();
                if (!obj.isEmpty()) {
                    m21337c();
                    obj.clear();
                    f23524d.m5763a(obj);
                }
            }
        }
    }

    private final void m21337c() {
        ArrayList arrayList = new ArrayList((Collection) f23524d.m5760a());
        C2495w a = this.f23525e.m13183a(C1473m.f7980a.mo2029I().f18022b.mo2657a((String) arrayList.get(0)).m11120d());
        if (this.f23526f == null || !this.f23526f.mo1348a()) {
            Context context = C1473m.f7980a.f7981b;
            C1473m.f7980a.mo2259r().mo3794a("1.high-priority-notifications", "aggregatedFailedUpdates", context.getString(C7582R.string.internal_space_multiple_failures_bar), context.getString(C7582R.string.internal_space_multiple_failures_title), context.getString(C7582R.string.internal_space_multiple_failures_message), C3820u.m18262a(C1473m.f7980a.bo().mo2754a()).m18268a("failed_installations_package_names", arrayList).m18265a(), "err", C1608h.m9251b(3), context.getString(C7582R.string.internal_space_action_button), 911, a);
            return;
        }
        this.f23526f.mo1352a(arrayList, a);
    }

    public final void mo4280a(String str) {
        Object obj = (Set) f23523c.m5760a();
        obj.add(str);
        f23523c.m5763a(obj);
    }

    public final void mo4282b() {
        f23523c.m5763a(new HashSet());
        f23524d.m5763a(new HashSet());
    }

    static {
        C0956c c0956c = new C0956c("notification_helper_preferences");
        f23522b = c0956c;
        f23523c = c0956c.m5754a("pending_package_names", new HashSet());
    }
}
