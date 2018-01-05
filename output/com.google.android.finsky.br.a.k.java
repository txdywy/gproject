package com.google.android.finsky.br.a;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.provider.SearchRecentSuggestions;
import com.google.android.finsky.b.f;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.b;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.uninstall.UninstallManagerActivityV2;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.gm;
import com.google.wireless.android.finsky.dfe.nano.gp;

public final class com.google.android.finsky.br.a.k implements com.google.android.finsky.br.c
{

    k() {
    }

    private static void a(int p0, Activity p1) {
        ((NotificationManager)p1.getSystemService("notification")).cancel(p0);
    }

    private static void a(com.google.android.finsky.navigationmanager.a p0, Intent p1, boolean p2) {
        if (p1.getBooleanExtra("clear_back_stack", p2) && !p1.getBooleanExtra("from_notification_center", 0))
            p0.c();
    }

    public final void a(Activity p0, com.google.android.finsky.d.w p1, com.google.android.finsky.d.w p2, com.google.android.finsky.navigationmanager.a p3, int p4, int p5) {
        v6 = p0.getIntent();
        com.google.android.finsky.m.a.r().a(v6);
        v0 = v6.getAction();
        if (("android.intent.action.SEARCH".equals(v0)) || "com.google.android.gms.actions.SEARCH_ACTION".equals(v0)) {
            v1 = v6.getStringExtra("query");
            com.google.android.finsky.m.a.bg().saveRecentQuery(v1, String.valueOf(p4));
            p3.a(v1, p4, p5, 0, 0, p1);
        }
        else if (("android.intent.action.VIEW".equals(v0)) || ("android.nfc.action.NDEF_DISCOVERED".equals(v0)) || "afwapp.android.intent.action.VIEW".equals(v0)) {
            com.google.android.finsky.br.a.k.a(p3, v6, 1);
            if (v6.getBooleanExtra("dont_resolve_again", 0)) {
                if (com.google.android.finsky.m.a.bn().a(p0, v6))
                    p0.finish();
            }
            else {
                v0 = v6.getDataString();
                v1 = com.google.android.finsky.m.a.dk();
                if (v1 != 0) {
                    v6.getAction();
                    v1.b(v0, 1);
                }
                com.google.android.finsky.m.a.G();
                p3.a(Uri.parse(v0), com.google.android.finsky.b.f.a(p0), p2);
            }
        }
        else if ("com.google.android.finsky.DETAILS".equals(v0)) {
            com.google.android.finsky.br.a.k.a(p3, v6, 0);
            p3.a(v6.getDataString(), v6.getStringExtra("continue_url"), v6.getStringExtra("override_account"), v6.getStringExtra("original_url"), p1);
        }
        else if ("com.google.android.finsky.VIEW_MY_DOWNLOADS".equals(v0)) {
            com.google.android.finsky.br.a.k.a(p3, v6, 1);
            p3.a(com.google.android.finsky.m.a.dn(), 0, v6.getBooleanExtra("trigger_update_all", 0), p1);
        }
        else if ("com.google.android.finsky.CORPUS_HOME".equals(v0)) {
            v3 = v6.getIntExtra("backend_id", 0);
            if (v3 == 0)
                p3.a(com.google.android.finsky.m.a.dn(), p1);
            else
                p3.b(v6.getDataString(), v6.getStringExtra("title"), v3, com.google.android.finsky.m.a.dn(), p1);
        }
        else if ("com.google.android.finsky.VIEW_BROWSE".equals(v0)) {
            v3 = v6.getIntExtra("backend_id", 0);
            v0 = com.google.android.finsky.m.a.dn();
            if (v0 != 0) {
                if (v0.a(v3) == 0)
                    p3.a(v0, p1);
                else {
                    if (v6.getBooleanExtra("clear_back_stack", 0))
                        p3.c();
                    p3.a(v6.getDataString(), v6.getStringExtra("title"), v3, p5, com.google.android.finsky.m.a.dn(), 0, p1);
                }
            }
        }
        else if ("com.google.android.finsky.UNINSTALL_WIZARD_FOR_MY_DOWNLOADS".equals(v0)) {
            com.google.android.finsky.br.a.k.a(v6.getIntExtra("notification_manager.notification_id", -1), p0);
            com.google.android.finsky.br.a.k.a(p3, v6, 1);
            p1.b(new com.google.android.finsky.d.d(new com.google.android.finsky.d.o(911, 0, 0)));
            p3.a(com.google.android.finsky.m.a.dn(), 0, 0, p1);
            p0.startActivity(UninstallManagerActivityV2.a(v6.getStringArrayListExtra("failed_installations_package_names"), p1, 0));
        }
        else if ("com.google.android.finsky.UNINSTALL_WIZARD_FOR_DETAILS".equals(v0)) {
            com.google.android.finsky.br.a.k.a(v6.getIntExtra("notification_manager.notification_id", -1), p0);
            com.google.android.finsky.br.a.k.a(p3, v6, 1);
            p1.b(new com.google.android.finsky.d.d(new com.google.android.finsky.d.o(910, 0, 0)));
            p3.a(v6.getDataString(), v6.getStringExtra("continue_url"), v6.getStringExtra("override_account"), v6.getStringExtra("original_url"), p1);
            p0.startActivity(UninstallManagerActivityV2.a(v6.getStringArrayListExtra("failed_installations_package_names"), p1, 0));
        }
        else if ("com.google.android.gms.actions.VIEW_REMOTE_ESCALATIONS".equals(v0))
            p3.a(0);
        else if ("com.google.android.finsky.PLAY_PASS_HOME".equals(v0)) {
            v0 = com.google.android.finsky.m.a.dn();
            if (v0 != 0 && v0.a.x != 0)
                p3.b(v0, v0.a.x.d, p1);
            else
                p3.a(v0, p1);
        }
        else if ("com.google.android.finsky.UPDATE_SUBSCRIPTION_INSTRUMENT".equals(v0))
            p3.a(v6.getStringExtra("account_name"), (com.google.android.finsky.cv.a.ax)ParcelableProto.a(v6, "document"), 0, v6.getLongExtra("instrument_id", 0), v6.getByteArrayExtra("payment_client_token"), p1);
        else if (p3.y())
            p3.a(com.google.android.finsky.m.a.dn(), p1);
    }

}
