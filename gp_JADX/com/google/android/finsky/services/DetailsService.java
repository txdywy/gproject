package com.google.android.finsky.services;

import android.accounts.Account;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.bg.aa;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2455b;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cw.C2458e;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.List;
import java.util.Locale;

public class DetailsService extends Service {
    public C2457d f20416a = C1473m.f7980a.mo2247i();

    public DetailsService() {
        C1473m.f7980a.aJ();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public IBinder onBind(Intent intent) {
        return new C4067a(this);
    }

    public static void m18991a(Context context, Document document, Account account, DfeToc dfeToc, String str, C2482j c2482j, C2457d c2457d, Bundle bundle) {
        String str2 = document.f14885a.f12097d;
        int i = document.f14885a.f12099f;
        if (i != 3) {
            FinskyLog.m21659a("Document %s is not an app, backend=%d", str2, Integer.valueOf(i));
            C2744a.m14787a(c2482j, 512, str2, 1307, str);
            return;
        }
        if (document.f14885a.f12098e != 1) {
            FinskyLog.m21659a("Document %s is not an app, doc_type=%d", str2, Integer.valueOf(document.f14885a.f12098e));
            C2744a.m14787a(c2482j, 512, str2, 1308, str);
            return;
        }
        C2454a a;
        C2455b a2 = C1473m.f7980a.mo2250j().m13148a();
        c2457d.m13154a(account, dfeToc, 0, document, a2);
        for (int i2 = 0; i2 < a2.f13244e; i2++) {
            a = a2.m13141a(i2);
            if (a.f13230a == 7 || a.f13230a == 1) {
                break;
            }
        }
        a = null;
        if (a == null) {
            FinskyLog.m21659a("App %s has no buy or install action, actions=%s", str2, a2.toString());
            C2744a.m14787a(c2482j, 512, str2, 1309, str);
            return;
        }
        Locale locale = context.getResources().getConfiguration().locale;
        bundle.putString("title", document.f14885a.f12100g);
        bundle.putString("creator", document.f14885a.f12102i.toUpperCase(locale));
        if (document.m14620I()) {
            bundle.putFloat("star_rating", aa.m9201a(document.m14621J()));
            bundle.putLong("rating_count", document.m14622K());
        }
        if (!m18992a(document, 4, bundle)) {
            if (m18992a(document, 0, bundle)) {
                FinskyLog.m21659a("App %s using thumbnail image", document.f14885a.f12096c);
            } else {
                FinskyLog.m21659a("App %s failed to find any image", document.f14885a.f12096c);
            }
        }
        C2458e c2458e = new C2458e();
        c2457d.m13157a(a, i, false, false, 0, c2458e);
        Bundle bundle2 = bundle;
        bundle2.putString("purchase_button_text", c2458e.m13160a(context).toUpperCase(locale));
        Uri build = new Builder().scheme("market").authority("details").appendQueryParameter("id", str2).appendQueryParameter("api_source", "DetailsService").appendQueryParameter("referrer_package", str).build();
        Intent intent = new Intent(context, MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(build);
        bundle.putParcelable("details_intent", PendingIntent.getActivity(context, 0, intent, 0));
        C2744a.m14787a(c2482j, 512, str2, 0, str);
    }

    private static boolean m18992a(Document document, int i, Bundle bundle) {
        List c = document.m14644c(i);
        if (!(c == null || c.isEmpty())) {
            bd bdVar = (bd) c.get(0);
            if (!TextUtils.isEmpty(bdVar.f11860f)) {
                String str;
                if (bdVar.aI_() && bdVar.f11863i) {
                    str = "fife_url";
                } else {
                    FinskyLog.m21659a("App %s no FIFE URL for %d", document.f14885a.f12096c, Integer.valueOf(i));
                    str = "image_url";
                }
                bundle.putString(str, bdVar.f11860f);
                return true;
            }
        }
        return false;
    }
}
