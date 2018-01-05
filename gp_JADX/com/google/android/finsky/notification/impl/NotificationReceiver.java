package com.google.android.finsky.notification.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.family.remoteescalation.p202a.C3081d;
import com.google.android.finsky.notification.C3820u;
import com.google.android.finsky.notification.C3822w;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.preregistration.C3934g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.a.a.a.a.cf;
import com.google.wireless.android.finsky.dfe.h.a.ae;
import com.google.wireless.android.finsky.dfe.j.a.d;
import com.google.wireless.android.finsky.dfe.j.a.f;
import com.google.wireless.android.finsky.dfe.j.a.h;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NotificationReceiver extends BroadcastReceiver {
    public static final Set f19004a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"com.android.vending.NEW_UPDATE_CLICKED", "com.android.vending.NEW_UPDATE_DELETED", "com.android.vending.NEW_UPDATE_NEED_APPROVAL_CLICKED", "com.android.vending.NEW_UPDATE_NEED_APPROVAL_DELETED", "com.android.vending.OUTSTANDING_UPDATE_CLICKED", "com.android.vending.OUTSTANDING_UPDATE_DELETED", "com.android.vending.PREREGISTRATION_RELEASED_CLICKED", "com.android.vending.PREREGISTRATION_RELEASED_DELETE", "com.android.vending.RICH_USER_NOTIFICATION_CLICKED", "com.android.vending.RICH_USER_NOTIFICATION_PRIMARY_ACTION_CLICKED", "com.android.vending.RICH_USER_NOTIFICATION_SECONDARY_ACTION_CLICKED", "com.android.vending.SUCCESSFULLY_INSTALLED_CLICKED", "com.android.vending.UPDATE_ALL_CLICKED"})));
    public final C2471a f19005b = C1473m.f7980a.aR();

    public static C3820u m18054a() {
        return C3820u.m18263b("com.android.vending.NEW_UPDATE_CLICKED").m18265a();
    }

    public static PendingIntent m18048a(C3820u c3820u, Context context, int i, C2495w c2495w) {
        if (f19004a.contains(c3820u.f19148a)) {
            return PendingIntent.getBroadcast(context, i, C3822w.m18272a(c3820u, context, NotificationReceiver.class, c2495w), 1342177280);
        }
        return null;
    }

    public static C3820u m18063b() {
        return C3820u.m18263b("com.android.vending.NEW_UPDATE_DELETED").m18265a();
    }

    public static Intent m18053a(String str, String str2, C2495w c2495w) {
        Intent putExtra = new Intent(C1473m.f7980a.f7981b, NotificationReceiver.class).setAction("com.android.vending.SUCCESSFULLY_INSTALLED_CLICKED").putExtra("package_name", str).putExtra("continue_url", str2);
        c2495w.m13376a(putExtra);
        return putExtra;
    }

    public static Intent m18052a(String str, C2495w c2495w) {
        Intent putExtra = new Intent(C1473m.f7980a.f7981b, NotificationReceiver.class).setAction("com.android.vending.SUCCESSFULLY_INSTALLED_DELETED").putExtra("package_name", str);
        c2495w.m13376a(putExtra);
        return putExtra;
    }

    public static Intent m18050a(C2495w c2495w) {
        Intent action = new Intent(C1473m.f7980a.f7981b, NotificationReceiver.class).setAction("com.android.vending.SUCCESSFULLY_UPDATED_CLICKED");
        c2495w.m13376a(action);
        return action;
    }

    public static Intent m18062b(C2495w c2495w) {
        Intent action = new Intent(C1473m.f7980a.f7981b, NotificationReceiver.class).setAction("com.android.vending.SUCCESSFULLY_UPDATED_DELETED");
        c2495w.m13376a(action);
        return action;
    }

    public static C3820u m18066c() {
        return C3820u.m18263b("com.android.vending.OUTSTANDING_UPDATE_CLICKED").m18265a();
    }

    public static C3820u m18069d() {
        return C3820u.m18263b("com.android.vending.OUTSTANDING_UPDATE_DELETED").m18265a();
    }

    public static C3820u m18070e() {
        return C3820u.m18263b("com.android.vending.NEW_UPDATE_NEED_APPROVAL_CLICKED").m18265a();
    }

    public static C3820u m18071f() {
        return C3820u.m18263b("com.android.vending.NEW_UPDATE_NEED_APPROVAL_DELETED").m18265a();
    }

    public static C3820u m18072g() {
        return C3820u.m18263b("com.android.vending.UPDATE_ALL_CLICKED").m18265a();
    }

    public static C3820u m18057a(String str, String str2) {
        return C3820u.m18263b("com.android.vending.PREREGISTRATION_RELEASED_CLICKED").m18267a("package_name", str).m18267a("account_name", str2).m18265a();
    }

    public static C3820u m18056a(String str) {
        return C3820u.m18263b("com.android.vending.PREREGISTRATION_RELEASED_DELETE").m18267a("package_name", str).m18265a();
    }

    public static Intent m18065c(C2495w c2495w) {
        Intent action = new Intent(C1473m.f7980a.f7981b, NotificationReceiver.class).setAction("com.android.vending.CONNECTION_RESTORED_CLICKED");
        c2495w.m13376a(action);
        return action;
    }

    public static Intent m18068d(C2495w c2495w) {
        Intent action = new Intent(C1473m.f7980a.f7981b, NotificationReceiver.class).setAction("com.android.vending.CONNECTION_RESTORED_DELETED");
        c2495w.m13376a(action);
        return action;
    }

    public static C3820u m18055a(f fVar) {
        return C3820u.m18263b("com.android.vending.RICH_USER_NOTIFICATION_CLICKED").m18270a("rich_user_notification_data", f.a(fVar)).m18265a();
    }

    public static C3820u m18064b(f fVar) {
        return C3820u.m18263b("com.android.vending.RICH_USER_NOTIFICATION_PRIMARY_ACTION_CLICKED").m18270a("rich_user_notification_data", f.a(fVar)).m18265a();
    }

    public static C3820u m18067c(f fVar) {
        return C3820u.m18263b("com.android.vending.RICH_USER_NOTIFICATION_SECONDARY_ACTION_CLICKED").m18270a("rich_user_notification_data", f.a(fVar)).m18265a();
    }

    public static Intent m18051a(ae aeVar, String str, String str2, C2495w c2495w) {
        Intent putExtra = new Intent(C1473m.f7980a.f7981b, NotificationReceiver.class).setAction(str).putExtra("remote_escalation_item", ParcelableProto.m21671a((C0757i) aeVar)).putExtra("account_name", str2);
        c2495w.m13376a(putExtra);
        return putExtra;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        C2495w a = this.f19005b.m13179a(intent.getExtras());
        boolean booleanExtra = intent.getBooleanExtra("from_notification_center", false);
        Intent flags;
        if ("com.android.vending.UPDATE_ALL_CLICKED".equals(action)) {
            try {
                PendingIntent.getBroadcast(context, 0, new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"), MemoryMappedFileBuffer.DEFAULT_SIZE).send();
            } catch (Throwable e) {
                FinskyLog.m21660a(e, "Error when broadcasting close system dialogs intent", new Object[0]);
            }
            C1473m.f7980a.mo2259r().mo3772a();
            m18059a(276, null, a);
            flags = C1473m.f7980a.bo().mo2758b(context).setFlags(268435456);
            if (booleanExtra) {
                flags.putExtra("clear_back_stack", false);
            }
            context.startActivity(flags);
        } else if ("com.android.vending.NEW_UPDATE_CLICKED".equals(action)) {
            m18059a(900, null, a);
            m18060a(context, a, booleanExtra);
        } else if ("com.android.vending.NEW_UPDATE_DELETED".equals(action)) {
            if (C1473m.f7980a.dj().mo2294a(12633476)) {
                m18059a(914, null, a);
            }
        } else if ("com.android.vending.SUCCESSFULLY_INSTALLED_CLICKED".equals(action)) {
            String stringExtra = intent.getStringExtra("package_name");
            r1 = intent.getStringExtra("continue_url");
            m18059a(901, stringExtra, a);
            if ("com.google.android.instantapps.supervisor".equals(stringExtra)) {
                context.startActivity(C1473m.f7980a.bo().mo2734a(context).setFlags(268435456));
            } else {
                flags = context.getPackageManager().getLaunchIntentForPackage(stringExtra);
                if (!TextUtils.isEmpty(r1)) {
                    flags = C1473m.f7980a.bn().mo2691a(stringExtra, r1);
                }
                if (flags == null) {
                    flags = C1473m.f7980a.bo().mo2750a(context, stringExtra, null, null, C1289l.m7694a(stringExtra), a);
                }
                context.startActivity(flags.setFlags(268435456));
            }
        } else if ("com.android.vending.SUCCESSFULLY_INSTALLED_DELETED".equals(action)) {
            action = intent.getStringExtra("package_name");
            if (C1473m.f7980a.dj().mo2294a(12633476)) {
                m18059a(915, action, a);
            }
        } else if ("com.android.vending.SUCCESSFULLY_UPDATED_CLICKED".equals(action)) {
            m18059a(902, null, a);
            C0954a.af.m5765c();
            m18060a(context, a, booleanExtra);
        } else if ("com.android.vending.SUCCESSFULLY_UPDATED_DELETED".equals(action)) {
            C0954a.af.m5765c();
            if (C1473m.f7980a.dj().mo2294a(12633476)) {
                m18059a(916, null, a);
            }
        } else if ("com.android.vending.OUTSTANDING_UPDATE_CLICKED".equals(action)) {
            m18059a(903, null, a);
            m18060a(context, a, booleanExtra);
        } else if ("com.android.vending.OUTSTANDING_UPDATE_DELETED".equals(action)) {
            if (C1473m.f7980a.dj().mo2294a(12633476)) {
                m18059a(917, null, a);
            }
        } else if ("com.android.vending.NEW_UPDATE_NEED_APPROVAL_CLICKED".equals(action)) {
            m18059a(904, null, a);
            m18060a(context, a, booleanExtra);
        } else if ("com.android.vending.NEW_UPDATE_NEED_APPROVAL_DELETED".equals(action)) {
            if (C1473m.f7980a.dj().mo2294a(12633476)) {
                m18059a(918, null, a);
            }
        } else if ("com.android.vending.PREREGISTRATION_RELEASED_CLICKED".equals(action)) {
            action = intent.getStringExtra("package_name");
            r1 = intent.getStringExtra("account_name");
            m18059a(905, action, a);
            C1473m.f7980a.mo2243f();
            C3934g.m18631b(action);
            flags = C1473m.f7980a.bo().mo2745a(context, C1289l.m7694a(action), a).setFlags(268435456);
            if (!(r1 == null || (booleanExtra && r1.equals(C1473m.f7980a.cZ())))) {
                flags.putExtra("authAccount", r1);
            }
            context.startActivity(flags);
        } else if ("com.android.vending.PREREGISTRATION_RELEASED_DELETE".equals(action)) {
            action = intent.getStringExtra("package_name");
            C1473m.f7980a.mo2243f();
            C3934g.m18631b(action);
        } else if ("com.android.vending.CONNECTION_RESTORED_CLICKED".equals(action)) {
            m18059a(919, null, a);
            context.startActivity(C1473m.f7980a.bo().mo2759b(context, a));
        } else if ("com.android.vending.CONNECTION_RESTORED_DELETED".equals(action)) {
            m18059a(920, null, a);
        } else if ("com.android.vending.DOWNLOAD_NOW_CLICKED".equals(action)) {
            action = intent.getStringExtra("package_name");
            m18059a(906, action, a);
            C1473m.f7980a.mo2256o().mo3462p(action);
        } else if ("com.android.vending.RICH_USER_NOTIFICATION_CLICKED".equals(action)) {
            action = C1473m.f7980a.cZ();
            f a2 = m18058a(intent);
            a.m13379b(new C2475d(null).m13256a(907).m13258a(a2.k));
            if (!TextUtils.isEmpty(a2.d())) {
                flags = C1473m.f7980a.bo().mo2742a(context, a2.d()).setFlags(268435456);
                if (booleanExtra) {
                    flags.putExtra("clear_back_stack", false);
                }
                context.startActivity(flags);
            } else if (a2.e().e()) {
                context.startActivity(m18049a(context, action, a2.e().d(), a).setFlags(268435456));
            } else {
                FinskyLog.m21667d("Unsupported notification landing page.", new Object[0]);
            }
        } else if ("com.android.vending.RICH_USER_NOTIFICATION_PRIMARY_ACTION_CLICKED".equals(action)) {
            m18061a(context, C1473m.f7980a.cZ(), m18058a(intent), a, true, booleanExtra);
        } else if ("com.android.vending.RICH_USER_NOTIFICATION_SECONDARY_ACTION_CLICKED".equals(action)) {
            m18061a(context, C1473m.f7980a.cZ(), m18058a(intent), a, false, booleanExtra);
        } else if ("com.android.vending.REMOTE_ESCALATION_CLICKED".equals(action) || "com.android.vending.REMOTE_ESCALATION_APPROVE_CLICKED".equals(action) || "com.android.vending.REMOTE_ESCALATION_DENY_CLICKED".equals(action) || "com.android.vending.REMOTE_ESCALATION_DELETED".equals(action)) {
            ae aeVar = (ae) ParcelableProto.m21672a(intent, "remote_escalation_item");
            C3081d.f16001e.m15802a(a, intent, intent.getStringExtra("account_name"), aeVar);
        }
        C1473m.f7980a.mo2259r().mo3773a(intent);
    }

    private static f m18058a(Intent intent) {
        try {
            return (f) C0757i.m4905a(new f(), intent.getByteArrayExtra("rich_user_notification_data"));
        } catch (InvalidProtocolBufferNanoException e) {
            return null;
        }
    }

    private static void m18060a(Context context, C2495w c2495w, boolean z) {
        Intent flags = C1473m.f7980a.bo().mo2734a(context).setFlags(268435456);
        if (c2495w != null) {
            c2495w.m13376a(flags);
        }
        if (z) {
            flags.putExtra("clear_back_stack", false);
        }
        context.startActivity(flags);
    }

    private static void m18059a(int i, String str, C2495w c2495w) {
        if (str == null) {
            c2495w.m13379b(new C2475d(null).m13256a(i));
            return;
        }
        cf cfVar = new cf();
        cfVar.a(str);
        c2495w.m13379b(new C2475d(null).m13256a(i).m13257a(cfVar));
    }

    private static Intent m18049a(Context context, String str, h hVar, C2495w c2495w) {
        return C1473m.f7980a.bo().mo2744a(context, str, hVar.d, hVar.c, C1473m.f7980a.aG().m9769b(context, str), c2495w);
    }

    private static void m18061a(Context context, String str, f fVar, C2495w c2495w, boolean z, boolean z2) {
        int i;
        d e;
        boolean e2;
        ad c2473o = new C2473o(907, fVar.k, null);
        if (z) {
            i = 908;
        } else {
            i = 909;
        }
        c2495w.m13379b(new C2475d(c2473o).m13256a(i));
        String d = z ? fVar.l.d() : fVar.m.d();
        if (z) {
            e = fVar.l.e();
        } else {
            e = fVar.m.e();
        }
        if (e != null) {
            e2 = e.e();
        } else {
            e2 = false;
        }
        Intent flags = !TextUtils.isEmpty(d) ? C1473m.f7980a.bo().mo2742a(context, d).setFlags(268435456) : e2 ? m18049a(context, str, e.d(), c2495w).setFlags(268435456) : null;
        if (flags != null) {
            if (z2) {
                flags.putExtra("clear_back_stack", false);
            }
            context.startActivity(flags);
        }
        C1473m.f7980a.mo2259r().mo3780a(fVar);
    }
}
