package com.google.android.finsky.br.p166a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p107l.C3647b;

final class C2166c extends C2164h {
    public final /* synthetic */ C2163a f10938a;

    C2166c(C2163a c2163a) {
        this.f10938a = c2163a;
        super();
    }

    public final Intent mo2720a(Context context, String str) {
        Intent intent = new Intent("com.google.android.finsky.VIEW_MY_DOWNLOADS");
        intent.setClass(context, C2173j.m11436a());
        intent.setFlags(268435456);
        C2164h.m11312a(intent, "account", str);
        return intent;
    }

    private static Intent m11321a(Context context, Document document, String str, String str2) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.android.vending");
        launchIntentForPackage.setAction(str);
        launchIntentForPackage.setFlags(268435456);
        C2164h.m11312a(launchIntentForPackage, "account", str2);
        launchIntentForPackage.putExtra("asset_package", document.m14625N().f13171k);
        return launchIntentForPackage;
    }

    public final Intent mo2719a(Context context, Document document, String str) {
        String str2;
        Intent intent;
        String str3 = document.m14625N().f13171k;
        C3647b a = this.f10938a.f10925e.m17243a(str3);
        if (a == null || a.f18029d == null) {
            str2 = null;
        } else {
            str2 = a.f18029d.f10820n;
        }
        C2163a c2163a = this.f10938a;
        PackageManager packageManager = context.getPackageManager();
        if (TextUtils.isEmpty(str2)) {
            intent = null;
        } else {
            intent = C2163a.m11271b(packageManager, c2163a.mo2691a(str3, str2));
        }
        if (intent == null) {
            if (C1503a.m8830a(c2163a.f10921a)) {
                intent = packageManager.getLeanbackLaunchIntentForPackage(str3);
            } else {
                intent = packageManager.getLaunchIntentForPackage(str3);
            }
            if (intent == null) {
                intent = c2163a.f10923c.mo2750a(c2163a.f10921a, str3, null, null, C1289l.m7694a(str3), c2163a.f10922b.m13184a(null));
            }
        }
        if (intent == null) {
            intent = C2166c.m11321a(context, document, "android.intent.action.RUN", str);
        }
        intent.setFlags(268435456);
        return intent;
    }

    public final Intent mo2722b(Context context, Document document, String str) {
        return C2166c.m11321a(context, document, "android.intent.action.VIEW", str);
    }

    public final String mo2721a() {
        return "com.android.vending";
    }
}
