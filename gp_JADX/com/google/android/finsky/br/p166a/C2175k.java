package com.google.android.finsky.br.p166a;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.br.C2174c;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.C2713b;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.uninstall.UninstallManagerActivityV2;
import com.google.android.finsky.utils.ParcelableProto;
import java.util.ArrayList;

public final class C2175k implements C2174c {
    public final void mo2768a(Activity activity, C2495w c2495w, C2495w c2495w2, C3748a c3748a, int i, int i2) {
        Intent intent = activity.getIntent();
        C1473m.f7980a.mo2259r().mo3773a(intent);
        String action = intent.getAction();
        String stringExtra;
        if ("android.intent.action.SEARCH".equals(action) || "com.google.android.gms.actions.SEARCH_ACTION".equals(action)) {
            stringExtra = intent.getStringExtra("query");
            C1473m.f7980a.bg().saveRecentQuery(stringExtra, String.valueOf(i));
            c3748a.mo3663a(stringExtra, i, i2, null, 0, c2495w);
        } else if ("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action) || "afwapp.android.intent.action.VIEW".equals(action)) {
            C2175k.m11440a(c3748a, intent, true);
            if (!intent.getBooleanExtra("dont_resolve_again", false)) {
                action = intent.getDataString();
                C2713b dk = C1473m.f7980a.dk();
                if (dk != null) {
                    intent.getAction();
                    dk.m14713b(action, 1);
                }
                Uri parse = Uri.parse(action);
                C1473m.f7980a.mo2027G();
                c3748a.mo3635a(parse, C1542f.m8971a((Context) activity), c2495w2);
            } else if (C1473m.f7980a.bn().mo2698a(activity, intent)) {
                activity.finish();
            }
        } else if ("com.google.android.finsky.DETAILS".equals(action)) {
            C2175k.m11440a(c3748a, intent, false);
            c3748a.mo3676a(intent.getDataString(), intent.getStringExtra("continue_url"), intent.getStringExtra("override_account"), intent.getStringExtra("original_url"), c2495w);
        } else if ("com.google.android.finsky.VIEW_MY_DOWNLOADS".equals(action)) {
            C2175k.m11440a(c3748a, intent, true);
            c3748a.mo3650a(C1473m.f7980a.dn(), null, intent.getBooleanExtra("trigger_update_all", false), c2495w);
        } else if ("com.google.android.finsky.CORPUS_HOME".equals(action)) {
            r3 = intent.getIntExtra("backend_id", 0);
            r2 = intent.getStringExtra("title");
            if (r3 == 0) {
                c3748a.mo3646a(C1473m.f7980a.dn(), c2495w);
                return;
            }
            c3748a.mo3693b(intent.getDataString(), r2, r3, C1473m.f7980a.dn(), c2495w);
        } else if ("com.google.android.finsky.VIEW_BROWSE".equals(action)) {
            r3 = intent.getIntExtra("backend_id", 0);
            r0 = C1473m.f7980a.dn();
            if (r0 == null) {
                return;
            }
            if (r0.m14606a(r3) == null) {
                c3748a.mo3646a(r0, c2495w);
                return;
            }
            r2 = intent.getStringExtra("title");
            stringExtra = intent.getDataString();
            if (intent.getBooleanExtra("clear_back_stack", false)) {
                c3748a.mo3696c();
            }
            c3748a.mo3673a(stringExtra, r2, r3, i2, C1473m.f7980a.dn(), null, c2495w);
        } else if ("com.google.android.finsky.UNINSTALL_WIZARD_FOR_MY_DOWNLOADS".equals(action)) {
            C2175k.m11439a(intent.getIntExtra("notification_manager.notification_id", -1), activity);
            C2175k.m11440a(c3748a, intent, true);
            c2495w.m13379b(new C2475d(new C2473o(911, null, null)));
            ArrayList stringArrayListExtra = intent.getStringArrayListExtra("failed_installations_package_names");
            c3748a.mo3650a(C1473m.f7980a.dn(), null, false, c2495w);
            activity.startActivity(UninstallManagerActivityV2.m21251a(stringArrayListExtra, c2495w, false));
        } else if ("com.google.android.finsky.UNINSTALL_WIZARD_FOR_DETAILS".equals(action)) {
            C2175k.m11439a(intent.getIntExtra("notification_manager.notification_id", -1), activity);
            C2175k.m11440a(c3748a, intent, true);
            c2495w.m13379b(new C2475d(new C2473o(910, null, null)));
            c3748a.mo3676a(intent.getDataString(), intent.getStringExtra("continue_url"), intent.getStringExtra("override_account"), intent.getStringExtra("original_url"), c2495w);
            activity.startActivity(UninstallManagerActivityV2.m21251a(intent.getStringArrayListExtra("failed_installations_package_names"), c2495w, false));
        } else if ("com.google.android.gms.actions.VIEW_REMOTE_ESCALATIONS".equals(action)) {
            c3748a.mo3642a(null);
        } else if ("com.google.android.finsky.PLAY_PASS_HOME".equals(action)) {
            r0 = C1473m.f7980a.dn();
            if (r0 == null || r0.f14881a.f31781x == null) {
                c3748a.mo3646a(r0, c2495w);
            } else {
                c3748a.mo3689b(r0, r0.f14881a.f31781x.d, c2495w);
            }
        } else if ("com.google.android.finsky.UPDATE_SUBSCRIPTION_INSTRUMENT".equals(action)) {
            ax axVar = (ax) ParcelableProto.m21672a(intent, "document");
            c3748a.mo3667a(intent.getStringExtra("account_name"), axVar, false, intent.getLongExtra("instrument_id", 0), intent.getByteArrayExtra("payment_client_token"), c2495w);
        } else if (c3748a.mo3722y()) {
            c3748a.mo3646a(C1473m.f7980a.dn(), c2495w);
        }
    }

    private static void m11440a(C3748a c3748a, Intent intent, boolean z) {
        boolean booleanExtra = intent.getBooleanExtra("clear_back_stack", z);
        boolean booleanExtra2 = intent.getBooleanExtra("from_notification_center", false);
        if (booleanExtra && !booleanExtra2) {
            c3748a.mo3696c();
        }
    }

    private static void m11439a(int i, Activity activity) {
        ((NotificationManager) activity.getSystemService("notification")).cancel(i);
    }
}
