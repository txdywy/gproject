package com.google.android.finsky.br.p166a;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.activities.inlineappinstaller.InlineConsumptionAppInstallerActivity;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.C4682m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.ui.common.a;
import com.google.protobuf.nano.C0757i;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C2163a implements C2162a {
    public final Context f10921a;
    public final C2471a f10922b;
    public final C2171b f10923c;
    public final C2206c f10924d;
    public final C3646a f10925e;
    public final C2320a f10926f;
    public final C1461c f10927g;
    public final PackageManager f10928h;
    public final ab f10929i;
    public final C2233o f10930j;
    public final C2164h f10931k = new C2165b(this);
    public final C2164h f10932l = new C2166c(this);
    public final C2164h f10933m = new C2167d();
    public final C2164h f10934n = new C2168e();
    public final C2164h f10935o = new C2169f();
    public final C2164h f10936p = new C2170g();

    public C2163a(Context context, C2471a c2471a, C2171b c2171b, C2206c c2206c, C3646a c3646a, C2320a c2320a, C1461c c1461c, PackageManager packageManager, ab abVar, C2233o c2233o) {
        this.f10921a = context;
        this.f10922b = c2471a;
        this.f10923c = c2171b;
        this.f10924d = c2206c;
        this.f10925e = c3646a;
        this.f10926f = c2320a;
        this.f10927g = c1461c;
        this.f10928h = packageManager;
        this.f10929i = abVar;
        this.f10930j = c2233o;
    }

    public final String mo2693a(int i) {
        switch (i) {
            case 1:
                return "com.google.android.apps.books";
            case 2:
                return "com.google.android.music";
            case 3:
                return "com.android.vending";
            case 4:
                return "com.google.android.videos";
            case 6:
                return "com.google.android.apps.magazines";
            default:
                return null;
        }
    }

    private final boolean m11272b(PackageManager packageManager) {
        if (!C2163a.m11269a(packageManager, "com.google.android.videos")) {
            return false;
        }
        if (this.f10926f.mo2854a("com.google.android.videos").f11419d >= ((Integer) C0955b.bv.m28964b()).intValue()) {
            return true;
        }
        return false;
    }

    private final boolean m11273c(PackageManager packageManager) {
        if (!C2163a.m11269a(packageManager, "com.google.android.apps.magazines")) {
            return false;
        }
        Object obj;
        if (this.f10926f.mo2854a("com.google.android.apps.magazines").f11419d < ((Integer) C0955b.dK.m28964b()).intValue()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    public final boolean mo2702a(PackageManager packageManager) {
        if (!C2163a.m11269a(packageManager, "com.google.android.music")) {
            return false;
        }
        Object obj;
        if (this.f10926f.mo2854a("com.google.android.music").f11419d < ((Integer) C0955b.bw.m28964b()).intValue()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    private static boolean m11269a(PackageManager packageManager, String str) {
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return false;
        }
        List queryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, 65536);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean mo2704a(PackageManager packageManager, Intent intent) {
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean mo2703a(PackageManager packageManager, int i) {
        switch (i) {
            case 1:
                return C2163a.m11269a(packageManager, "com.google.android.apps.books");
            case 2:
                return mo2702a(packageManager);
            case 4:
                return m11272b(packageManager);
            case 6:
                return m11273c(packageManager);
            default:
                return false;
        }
    }

    private final C2164h m11274f(int i) {
        switch (i) {
            case 1:
                return this.f10931k;
            case 2:
                return this.f10935o;
            case 3:
                return this.f10932l;
            case 4:
                return this.f10933m;
            case 6:
                return this.f10934n;
            default:
                throw new IllegalStateException("Unknown backend " + i);
        }
    }

    public final Intent mo2684a(Context context, int i, String str) {
        return m11274f(i).mo2720a(context, str);
    }

    public final Intent mo2683a(int i, String str, String str2) {
        return m11274f(i).mo2723a(str, str2);
    }

    public final Intent mo2686a(Context context, Document document, String str) {
        return m11274f(document.f14885a.f12099f).mo2719a(context, document, str);
    }

    public final Intent mo2707b(Context context, Document document, String str) {
        return m11274f(document.f14885a.f12099f).mo2722b(context, document, str);
    }

    public final String mo2692a() {
        if (this.f10927g.dj().mo2294a(12620775)) {
            return (String) C0955b.ed.m28964b();
        }
        return (String) C0955b.ea.m28964b();
    }

    public final Intent mo2689a(Uri uri) {
        if (uri.getScheme() == null) {
            String str = "http://";
            String valueOf = String.valueOf(uri.toString());
            uri = Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(524288);
        return intent;
    }

    public final Intent mo2690a(Uri uri, String str) {
        Intent a = mo2689a(uri);
        if (!TextUtils.isEmpty(str)) {
            a.setPackage(str);
        }
        return a;
    }

    public static Intent m11271b(PackageManager packageManager, Intent intent) {
        if (packageManager.resolveActivity(intent, 65536) != null) {
            return intent;
        }
        Intent intent2 = new Intent(intent.getAction(), intent.getData());
        intent2.setFlags(intent.getFlags());
        return intent2;
    }

    public final Intent mo2688a(PackageManager packageManager, Uri uri, String str) {
        if (uri != null) {
            uri = Uri.parse(uri.toString().trim());
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.google.android.youtube");
        intent.putExtra("authAccount", str);
        intent.putExtra("force_fullscreen", true);
        intent.putExtra("finish_on_ended", true);
        intent.setFlags(524288);
        return C2163a.m11271b(packageManager, intent);
    }

    public final Intent mo2709b(PackageManager packageManager, Uri uri, String str) {
        Object obj = C2163a.m11269a(packageManager, "com.google.android.videos") ? this.f10926f.mo2854a("com.google.android.videos").f11419d >= ((Integer) C0955b.dJ.m28964b()).intValue() ? 1 : null : null;
        if (obj == null) {
            return mo2688a(packageManager, uri, str);
        }
        Intent intent = new Intent("com.google.android.videos.intent.action.trailers.VIEW", uri);
        intent.putExtra("authAccount", str);
        intent.setPackage("com.google.android.videos");
        intent.setFlags(524288);
        return C2163a.m11271b(packageManager, intent);
    }

    public final Intent mo2710b(Uri uri) {
        Intent intent = new Intent("android.intent.action.SENDTO", uri);
        intent.setFlags(524288);
        return intent;
    }

    public final Intent mo2687a(Context context, Class cls, String str, String str2) {
        Intent intent = new Intent(context, cls);
        intent.putExtra(str, str2);
        return intent;
    }

    public final Intent mo2708b(Context context, Class cls, String str, String str2) {
        Intent intent = new Intent(context, cls);
        intent.setData(new Builder().scheme(str).authority(str2).build());
        return intent;
    }

    public final void mo2696a(Context context, String str, boolean z, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setFlags(524288);
        intent.putExtra("android.intent.extra.TEXT", str);
        if (z) {
            intent.putExtra("android.intent.extra.SUBJECT", context.getString(C7582R.string.share_subject_preregistration, new Object[]{str2}));
        } else {
            intent.putExtra("android.intent.extra.SUBJECT", context.getString(C7582R.string.share_subject, new Object[]{str2}));
        }
        context.startActivity(Intent.createChooser(intent, context.getString(C7582R.string.share_dialog_title, new Object[]{str2})));
    }

    public final void mo2694a(Context context, ad adVar, C2495w c2495w, String str, boolean z, String str2) {
        mo2696a(context, str, z, str2);
        c2495w.m13379b(new C2475d(adVar).m13256a(202));
    }

    public final Intent mo2691a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Builder builder = new Builder();
        builder.scheme("market");
        builder.authority("details");
        builder.appendQueryParameter("id", str);
        builder.appendQueryParameter("url", str2);
        intent.setData(builder.build());
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        return intent;
    }

    public final boolean mo2697a(int i, Intent intent) {
        if (!mo2703a(this.f10928h, i)) {
            return false;
        }
        List<ResolveInfo> queryIntentActivities = this.f10928h.queryIntentActivities(intent, 65536);
        Object a = mo2693a(i);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (a.equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public final boolean mo2698a(Activity activity, Intent intent) {
        Uri data = intent.getData();
        if (VERSION.SDK_INT >= 23 && this.f10927g.dj().mo2294a(12611636)) {
            intent.setData(Uri.parse("https:"));
        }
        PackageManager packageManager = activity.getPackageManager();
        intent.setComponent(null);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        intent.setData(data);
        int i = 0;
        while (i < queryIntentActivities.size()) {
            ActivityInfo activityInfo = ((ResolveInfo) queryIntentActivities.get(i)).activityInfo;
            if (activityInfo.packageName.equals(activity.getPackageName())) {
                i++;
            } else {
                intent.setPackage(activityInfo.packageName);
                activity.startActivity(intent);
                return true;
            }
        }
        a aVar = new a(activity);
        aVar.b(C7582R.string.no_web_app);
        aVar.a(C7582R.string.ok, null);
        aVar.a().show();
        return false;
    }

    public final boolean mo2712b(int i, Intent intent) {
        if (intent == null) {
            return false;
        }
        if (!mo2713b(this.f10928h, i)) {
            return false;
        }
        List<ResolveInfo> queryIntentActivities = this.f10928h.queryIntentActivities(intent, 65536);
        Object b = mo2711b(i);
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (b.equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public final boolean mo2713b(PackageManager packageManager, int i) {
        switch (i) {
            case 1:
                if (!C2163a.m11269a(packageManager, "com.google.android.play.games")) {
                    return false;
                }
                Object obj;
                if (this.f10926f.mo2854a("com.google.android.play.games").f11419d < ((Integer) C0955b.bx.m28964b()).intValue()) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj == null) {
                    return true;
                }
                return false;
            case 2:
                return C2163a.m11269a(packageManager, "com.google.android.apps.books");
            case 3:
                return m11273c(packageManager);
            case 4:
                return mo2702a(packageManager);
            case 5:
                return m11272b(packageManager);
            default:
                return false;
        }
    }

    public final String mo2711b(int i) {
        switch (i) {
            case 1:
                return "com.google.android.play.games";
            case 2:
                return "com.google.android.apps.books";
            case 3:
                return "com.google.android.apps.magazines";
            case 4:
                return "com.google.android.music";
            case 5:
                return "com.google.android.videos";
            default:
                return null;
        }
    }

    public final Intent mo2705b(int i, String str, String str2) {
        return m11275g(i).mo2723a(str, str2);
    }

    public final Intent mo2706b(Context context, int i, String str) {
        return m11275g(i).mo2720a(context, str);
    }

    public final boolean mo2700a(Context context, Account account, Document document, android.support.v4.app.ab abVar, Fragment fragment, int i, PurchaseParams purchaseParams) {
        if (mo2699a(context, account, document, abVar, fragment, i)) {
            return true;
        }
        Intent b = m11270b(context, document, account);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(b, 0);
        if (b == null || resolveActivity == null) {
            Toast.makeText(context, context.getString(C7582R.string.launch_error), 0).show();
            return false;
        }
        if (document.m14625N() != null) {
            this.f10929i.mo3782a(document.m14625N().f13171k);
        }
        if (purchaseParams != null) {
            b.putExtra("backend", purchaseParams.f9285a.f11835d);
            b.putExtra("backend_docid", purchaseParams.f9285a.f11833b);
            b.putExtra("document_type", purchaseParams.f9285a.f11834c);
            b.putExtra("full_docid", purchaseParams.f9286b);
            b.putExtra("calling_package", purchaseParams.f9295k);
        }
        context.startActivity(b);
        return false;
    }

    private final Intent m11270b(Context context, Document document, Account account) {
        if (document == null) {
            return null;
        }
        int i = document.f14885a.f12099f;
        if (document.f14885a.f12097d == null) {
            return null;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                return mo2686a(context, document, account.name);
            default:
                throw new IllegalStateException("Cannot open an item from the corpus " + i);
        }
    }

    public final boolean mo2701a(Context context, Document document, Account account) {
        Object a = mo2693a(document.f14885a.f12099f);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        int i;
        C2322b a2 = this.f10926f.mo2854a(a);
        if (a2 == null) {
            i = 0;
        } else if ("com.google.android.videos".equals(a) && a2.f11419d < ((Integer) C0955b.bv.m28964b()).intValue()) {
            i = 0;
        } else if (!"com.google.android.apps.magazines".equals(a) || a2.f11419d >= ((Integer) C0955b.dK.m28964b()).intValue()) {
            if (document != null && "com.google.android.apps.magazines".equals(a)) {
                bl[] blVarArr = document.f14885a.f12107n;
                if (blVarArr != null && blVarArr.length > 0 && document.f14885a.f12098e == 15 && !blVarArr[0].f11924n && a2.f11419d < ((Integer) C0955b.dL.m28964b()).intValue()) {
                    i = 0;
                }
            }
            i = 1;
        } else {
            i = 0;
        }
        if (i == 0) {
            return true;
        }
        Intent b = m11270b(context, document, account);
        if (b == null) {
            return true;
        }
        return !mo2704a(context.getPackageManager(), b);
    }

    public final boolean mo2699a(Context context, Account account, Document document, android.support.v4.app.ab abVar, Fragment fragment, int i) {
        if (!mo2701a(context, document, account)) {
            return false;
        }
        int i2 = document.f14885a.f12099f;
        Activity a = C4682m.m21821a(context, Activity.class);
        if (!this.f10927g.dj().mo2294a(12603704) || (!(i2 == 1 || i2 == 6) || a == null)) {
            mo2695a(context, mo2693a(i2), mo2715c(i2), i, abVar, fragment);
        } else {
            C0757i c0757i = document.f14885a;
            C2495w a2 = this.f10922b.m13184a(null);
            Intent intent = new Intent(C1473m.f7980a.f7981b, InlineConsumptionAppInstallerActivity.class);
            intent.putExtra("account", account);
            intent.putExtra("mediaDoc", ParcelableProto.m21671a(c0757i));
            a2.m13376a(intent);
            a.startActivityForResult(intent, 25);
        }
        return true;
    }

    public final void mo2695a(Context context, String str, int i, int i2, android.support.v4.app.ab abVar, Fragment fragment) {
        if (TextUtils.isEmpty(str)) {
            Toast.makeText(context, context.getString(C7582R.string.launch_error), 0).show();
        } else if (abVar.mo283a("app_needed_dialog") == null) {
            Bundle bundle = new Bundle();
            bundle.putString("dialog_details_url", C1289l.m7694a(str));
            C1508k c1508k = new C1508k();
            c1508k.m8848a(i).m8860d((int) C7582R.string.ok).m8862e((int) C7582R.string.cancel);
            c1508k.m8851a(fragment, i2, bundle);
            c1508k.mo2272a().m625a(abVar, "app_needed_dialog");
        }
    }

    public final Intent mo2685a(Context context, Intent intent) {
        Intent a = mo2687a(context, C2173j.m11436a(), "authAccount", intent.getStringExtra("authAccount"));
        a.setData(intent.getData());
        a.setAction("android.intent.action.VIEW");
        return a;
    }

    public final int mo2715c(int i) {
        switch (i) {
            case 1:
                return C7582R.string.books_download_required;
            case 2:
                return C7582R.string.music_download_required;
            case 4:
                return C7582R.string.videos_download_required;
            case 6:
                return C7582R.string.newsstand_download_required;
            case 9:
                return C7582R.string.gplus_download_required;
            default:
                return -1;
        }
    }

    public final int mo2717d(int i) {
        switch (i) {
            case 1:
                return C7582R.string.games_download_required;
            case 2:
                return C7582R.string.books_download_required;
            case 3:
                return C7582R.string.newsstand_download_required;
            case 4:
                return C7582R.string.music_download_required;
            case 5:
                return C7582R.string.videos_download_required;
            default:
                return -1;
        }
    }

    public final int mo2718e(int i) {
        switch (i) {
            case 1:
                return C7582R.string.books_download_required_with_link_highlighting;
            case 6:
                return C7582R.string.newsstand_download_required_with_link_highlighting;
            default:
                return mo2715c(i);
        }
    }

    public final boolean mo2714b(String str, String str2) {
        PackageManager packageManager = this.f10921a.getPackageManager();
        if (!mo2703a(packageManager, 2)) {
            return false;
        }
        List queryIntentActivities = packageManager.queryIntentActivities(mo2683a(2, str, str2), 65536);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    public final Intent mo2716c(String str, String str2) {
        return mo2683a(2, str, str2);
    }

    private final C2164h m11275g(int i) {
        switch (i) {
            case 1:
                return this.f10936p;
            case 2:
                return this.f10931k;
            case 3:
                return this.f10934n;
            case 4:
                return this.f10935o;
            case 5:
                return this.f10933m;
            default:
                throw new IllegalStateException("Unknown app type " + i);
        }
    }

    static {
        new ArrayList().add(Integer.valueOf(2));
    }
}
