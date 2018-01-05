package com.google.android.finsky.br.p166a;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0254u;
import android.text.TextUtils;
import com.android.ex.photo.C0567e;
import com.android.ex.photo.p051d.C0556a;
import com.google.android.finsky.activities.AccessRestrictedActivity;
import com.google.android.finsky.activities.AppsPermissionsActivity;
import com.google.android.finsky.activities.MultiInstallActivity;
import com.google.android.finsky.activities.ReviewsActivity;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.addresschallenge.AddressChallengeActivity;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.gifting.GiftingActivity;
import com.google.android.finsky.billing.lightpurchase.AgeVerificationActivity;
import com.google.android.finsky.billing.lightpurchase.AuthenticatedWebViewActivity;
import com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.billing.profile.CatchAbandonmentActivity;
import com.google.android.finsky.billing.redeem.RedeemCodeActivity;
import com.google.android.finsky.billing.updatesubscriptioninstrument.UpdateSubscriptionInstrumentActivity;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.cv.p177a.am;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.jl;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.notification.C3820u;
import com.google.android.finsky.notification.C3821v;
import com.google.android.finsky.notification.C3822w;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.screenshotsactivity.ScreenshotsActivityV2;
import com.google.android.finsky.settings.SettingsActivity;
import com.google.android.finsky.setup.SetupWizardFinalHoldActivity;
import com.google.android.finsky.tos.TosActivity;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.i;
import com.google.wireless.android.finsky.dfe.c.a.eb;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class C2172i implements C2171b {
    public static final Set f10945b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"com.google.android.finsky.UNINSTALL_WIZARD_FOR_DETAILS", "com.google.android.finsky.UNINSTALL_WIZARD_FOR_MY_DOWNLOADS"})));
    public final C1503a f10946a;

    public C2172i(C1503a c1503a) {
        this.f10946a = c1503a;
    }

    public final Intent mo2734a(Context context) {
        return C2172i.m11388a(C2172i.m11390b(), context, null);
    }

    private static C3820u m11390b() {
        return C3820u.m18263b("com.google.android.finsky.VIEW_MY_DOWNLOADS").m18265a();
    }

    public final Intent mo2758b(Context context) {
        return new Intent("com.google.android.finsky.VIEW_MY_DOWNLOADS").setClass(context, C2173j.m11436a()).putExtra("trigger_update_all", true);
    }

    public final void mo2757a(C0254u c0254u, C2495w c2495w) {
        Intent intent = new Intent(c0254u, SettingsActivity.class);
        if (!TextUtils.isEmpty(null)) {
            intent.putExtra("setting-key-to-scroll", null);
        }
        c2495w.m13376a(intent);
        c0254u.startActivityForResult(intent, 31);
    }

    public final Intent mo2742a(Context context, String str) {
        return new Intent("android.intent.action.VIEW").setClass(context, C2173j.m11436a()).setData(Uri.parse(str));
    }

    public final C3820u mo2754a() {
        return C3820u.m18263b("com.google.android.finsky.UNINSTALL_WIZARD_FOR_MY_DOWNLOADS").m18265a();
    }

    public final C3820u mo2755a(String str) {
        C3821v b = C3820u.m18263b("com.google.android.finsky.UNINSTALL_WIZARD_FOR_DETAILS");
        b.f19155d = Uri.parse(str);
        return b.m18265a();
    }

    public final Intent mo2745a(Context context, String str, C2495w c2495w) {
        return C2172i.m11388a(C2172i.m11391b(str).m18265a(), context, c2495w);
    }

    private static C3821v m11391b(String str) {
        return C2172i.m11389a(str, null, null, null, false);
    }

    public final Intent mo2740a(Context context, Document document, C2495w c2495w) {
        return mo2745a(context, document.f14885a.f12116w, c2495w);
    }

    public final Intent mo2751a(Context context, String str, String str2, String str3, String str4, boolean z, C2495w c2495w) {
        return C2172i.m11388a(C2172i.m11389a(str, str2, str3, str4, z).m18265a(), context, c2495w);
    }

    private static C3821v m11389a(String str, String str2, String str3, String str4, boolean z) {
        C3821v b = C3820u.m18263b("com.google.android.finsky.DETAILS");
        b.f19155d = Uri.parse(str);
        if (str2 != null) {
            b.m18267a("continue_url", str2);
        }
        if (str3 != null) {
            b.m18267a("override_account", str3);
        }
        if (str4 != null) {
            b.m18267a("original_url", str4);
        }
        if (z) {
            b.m18269a("clear_back_stack", z);
        }
        return b;
    }

    public final Intent mo2735a(Context context, int i, DfeToc dfeToc) {
        gj a = dfeToc.m14606a(i);
        Intent intent = new Intent(context, C2173j.m11436a());
        intent.setData(Uri.parse(a.e));
        intent.setAction("com.google.android.finsky.CORPUS_HOME");
        intent.putExtra("title", a.d);
        intent.putExtra("backend_id", i);
        return intent;
    }

    public final Intent mo2738a(Context context, C2495w c2495w) {
        Intent intent = new Intent(context, C2173j.m11436a());
        c2495w.m13376a(intent);
        return intent;
    }

    public final Intent mo2759b(Context context, C2495w c2495w) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getApplicationContext().getPackageName());
        c2495w.m13376a(launchIntentForPackage);
        return launchIntentForPackage;
    }

    public final Intent mo2767g(Context context) {
        return new Intent(context, C2173j.m11436a());
    }

    public final Intent mo2747a(Context context, String str, String str2, int i, C2495w c2495w) {
        Intent intent = new Intent(context, C2173j.m11436a());
        intent.setData(Uri.parse(str));
        intent.setAction("com.google.android.finsky.VIEW_BROWSE");
        intent.putExtra("title", str2);
        intent.putExtra("backend_id", i);
        intent.putExtra("clear_back_stack", false);
        c2495w.m13376a(intent);
        return intent;
    }

    public final Intent mo2762b(Context context, String str, C2495w c2495w) {
        Intent putExtra = new Intent(context, C2173j.m11436a()).setAction("com.google.android.gms.actions.VIEW_REMOTE_ESCALATIONS").putExtra("authAccount", str);
        c2495w.m13376a(putExtra);
        return putExtra;
    }

    public final Intent mo2760b(Context context, String str) {
        return new Intent(context, C2173j.m11436a()).setAction("com.google.android.finsky.PLAY_PASS_HOME").putExtra("authAccount", str);
    }

    public final Intent mo2750a(Context context, String str, String str2, String str3, String str4, C2495w c2495w) {
        return C2172i.m11388a(mo2756a(str, str2, str3, str4), context, c2495w);
    }

    public final C3820u mo2756a(String str, String str2, String str3, String str4) {
        if ("com.google.android.instantapps.supervisor".equals(str)) {
            return C2172i.m11390b();
        }
        if ("com.google.android.gms".equals(str)) {
            return C2172i.m11390b();
        }
        C3821v b = C3820u.m18263b("com.google.android.finsky.DEFAULT_CLICK");
        if (!TextUtils.isEmpty(str)) {
            b = C2172i.m11391b(str4).m18267a("error_doc_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            b.m18267a("error_title", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            b.m18267a("error_html_message", str3);
        }
        return b.m18265a();
    }

    public final Intent mo2739a(Context context, Document document, int i, int i2) {
        C0567e c0567e = new C0567e(context, ScreenshotsActivityV2.class);
        c0567e.f3775b = Integer.valueOf(i);
        c0567e.f3779f = C0556a.f3757a;
        c0567e.f3791r = true;
        c0567e.m4106a(10.0f).f3792s = true;
        Intent a = c0567e.m4105a();
        a.putExtra("document", document);
        a.putExtra("imageType", i2);
        return a;
    }

    public final Intent mo2763c(Context context) {
        return C2172i.m11387a(context, (int) C7582R.string.limited_user_text);
    }

    public final Intent mo2764d(Context context) {
        return C2172i.m11387a(context, (int) C7582R.string.limited_user_purchase_text);
    }

    public final Intent mo2765e(Context context) {
        return C2172i.m11387a(context, (int) C7582R.string.invalid_store_type_text);
    }

    public final Intent mo2726a(Account account, Context context, C1552e c1552e, Document document, C2495w c2495w, PurchaseParams purchaseParams, eb ebVar, boolean z, boolean z2) {
        if (this.f10946a.f8181e) {
            throw new UnsupportedOperationException("Acquire Activity does not support auto");
        }
        String str;
        if (this.f10946a.f8182f) {
            str = "com.google.android.finsky.tv.ACQUIRE";
        } else if (c1552e.mo2294a(12642294)) {
            str = "com.google.android.finsky.phoenix.ACQUIRE";
        } else if (this.f10946a.f8183g) {
            str = "com.google.android.finsky.wear.ACQUIRE";
        } else {
            str = "com.google.android.finsky.ACQUIRE";
        }
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        intent.putExtra("AcquireActivity.account", account);
        if (document != null) {
            intent.putExtra("AcquireActivity.doc", document);
        }
        if (c2495w != null) {
            c2495w.m13376a(intent);
        }
        if (purchaseParams != null) {
            intent.putExtra("AcquireActivity.purchaseParams", purchaseParams);
        }
        if (ebVar != null) {
            intent.putExtra("AcquireActivity.redeemParam", ParcelableProto.m21671a((C0757i) ebVar));
        }
        intent.putExtra("AcquireActivity.topupRequest", z);
        intent.putExtra("AcquireActivity.logPair", z2);
        return intent;
    }

    private static Intent m11387a(Context context, int i) {
        Intent intent = new Intent(context, AccessRestrictedActivity.class);
        intent.putExtra("AccessRestrictedActivity.messageId", i);
        return intent;
    }

    public final Intent mo2746a(Context context, String str, DfeToc dfeToc) {
        Class cls = null;
        if (C1503a.m8830a(context)) {
            cls = C2173j.m11437b();
        }
        if (cls == null) {
            cls = TosActivity.class;
        }
        Intent intent = new Intent(context, cls);
        Bundle bundle = new Bundle();
        bundle.putString("finsky.TosActivity.account", str);
        bundle.putParcelable("finsky.TosActivity.toc", dfeToc);
        intent.putExtras(bundle);
        return intent;
    }

    public final Intent mo2728a(Account account, Context context, PurchaseParams purchaseParams, C2731v c2731v, String str, C1552e c1552e) {
        if (c1552e.mo2294a(12638277)) {
            return mo2726a(account, context, c1552e, null, null, purchaseParams, null, false, true);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("TvIntentConstants.account", account);
        bundle.putParcelable("TvIntentConstants.purchaseParams", purchaseParams);
        if (c2731v != null) {
            bundle.putString("TvIntentConstants.offerFilter", c2731v.name());
        }
        bundle.putString("TvIntentConstants.breadcrumb", str);
        Intent intent = new Intent("com.google.android.finsky.tv.PURCHASE");
        intent.putExtras(bundle);
        return intent;
    }

    public final Intent mo2729a(Account account, PurchaseParams purchaseParams) {
        Intent intent = new Intent("com.google.android.finsky.wear.IABV3_PURCHASE");
        intent.putExtra("PurchaseActivity.account", account);
        intent.putExtra("PurchaseActivity.params", purchaseParams);
        return intent;
    }

    public final Intent mo2727a(Account account, Context context, PurchaseParams purchaseParams, C1552e c1552e) {
        if (c1552e.mo2294a(12638277)) {
            return mo2726a(account, context, c1552e, null, null, purchaseParams, null, false, true);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("TvIntentConstants.account", account);
        bundle.putParcelable("TvIntentConstants.purchaseParams", purchaseParams);
        bundle.putString("TvIntentConstants.breadcrumb", purchaseParams.f9298n.c);
        Intent intent = new Intent("com.google.android.finsky.tv.IABV3_PURCHASE");
        intent.putExtras(bundle);
        return intent;
    }

    public final Intent mo2766f(Context context) {
        if (!this.f10946a.f8182f) {
            return new Intent(context, SetupWizardFinalHoldActivity.class);
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.finsky.activities.TvSetupWizardFinalHoldActivity");
        return intent;
    }

    public final Intent mo2743a(Context context, String str, int i, String str2, C2495w c2495w) {
        Intent intent = new Intent(context, AgeVerificationActivity.class);
        intent.putExtra("authAccount", str);
        intent.putExtra("AgeVerificationActivity.backend", i);
        intent.putExtra("AgeVerificationActivity.docid_str", str2);
        c2495w.m13380b(str).m13376a(intent);
        return intent;
    }

    public final Intent mo2725a(int i, i iVar, Bundle bundle, C2495w c2495w) {
        return AddressChallengeActivity.m9491a(i, iVar, bundle, c2495w);
    }

    public final Intent mo2748a(Context context, String str, String str2, Document document, boolean z, C2495w c2495w) {
        return mo2749a(context, str, str2, document, z, false, null, c2495w);
    }

    public final Intent mo2749a(Context context, String str, String str2, Document document, boolean z, boolean z2, String str3, C2495w c2495w) {
        Intent intent = new Intent(context, AppsPermissionsActivity.class);
        intent.putExtra("AppsPermissionsActivity.accountName", str);
        intent.putExtra("AppsPermissionsActivity.docidStr", str2);
        intent.putExtra("AppsPermissionsActivity.doc", document);
        intent.putExtra("AppsPermissionsActivity.showDetailedPermissions", z);
        intent.putExtra("AppsPermissionsActivity.alwaysShowBucketedPermissions", z2);
        intent.putExtra("AppsPermissionsActivity.buttonText", str3);
        c2495w.m13376a(intent);
        return intent;
    }

    public final Intent mo2733a(Account account, String str, String str2, C2495w c2495w) {
        return AuthenticatedWebViewActivity.m10032a(account, str, str2, c2495w);
    }

    public final Intent mo2744a(Context context, String str, ax axVar, long j, byte[] bArr, C2495w c2495w) {
        Intent intent = new Intent(context, C2173j.m11436a());
        intent.setAction("com.google.android.finsky.UPDATE_SUBSCRIPTION_INSTRUMENT");
        intent.putExtra("account_name", str);
        intent.putExtra("document", ParcelableProto.m21671a((C0757i) axVar));
        intent.putExtra("instrument_id", j);
        intent.putExtra("payment_client_token", bArr);
        c2495w.m13376a(intent);
        return intent;
    }

    public final Intent mo2732a(Account account, Document document, String str, int i, C2731v c2731v, String str2, String str3, boolean z, int i2, C2495w c2495w) {
        return LightPurchaseFlowActivity.m10056a(account, document, str, i, c2731v, document.f14885a.f12087D, str3, 0, str2, z, i2, c2495w);
    }

    public final Intent mo2731a(Account account, Document document, String str, int i, C2495w c2495w) {
        return LightPurchaseFlowActivity.m10056a(account, document, str, i, null, document.f14885a.f12087D, null, 1, null, false, 0, c2495w);
    }

    public final PendingIntent mo2724a(C3820u c3820u, Context context, int i, C2495w c2495w) {
        Intent a = C2172i.m11388a(c3820u, context, c2495w);
        if (a != null) {
            return C3822w.m18271a(a, context, i);
        }
        return null;
    }

    private static Intent m11388a(C3820u c3820u, Context context, C2495w c2495w) {
        String str = c3820u.f19148a;
        if ("com.google.android.finsky.DEFAULT_CLICK".equals(str)) {
            Intent a = C3822w.m18272a(c3820u, context, C2173j.m11436a(), c2495w);
            a.setAction(null);
            return a;
        } else if ("com.google.android.finsky.VIEW_MY_DOWNLOADS".equals(str)) {
            return C3822w.m18272a(c3820u, context, C2173j.m11436a(), null);
        } else {
            if ("com.google.android.finsky.DETAILS".equals(str)) {
                return C3822w.m18272a(c3820u, context, C2173j.m11436a(), c2495w);
            }
            return f10945b.contains(str) ? C3822w.m18272a(c3820u, context, C2173j.m11436a(), c2495w) : null;
        }
    }

    public final Intent mo2741a(Context context, Document document, String str, boolean z, C2495w c2495w) {
        Intent intent = new Intent(context, ReviewsActivity.class);
        intent.putExtra("finsky.ReviewsActivity.document", document);
        intent.putExtra("finsky.ReviewsActivity.reviewsUrl", str);
        intent.putExtra("finsky.ReviewsActivity.isRottenTomatoesReviews", z);
        intent.setFlags(536870912);
        c2495w.m13376a(intent);
        return intent;
    }

    public final Intent mo2761b(Context context, String str, ax axVar, long j, byte[] bArr, C2495w c2495w) {
        return UpdateSubscriptionInstrumentActivity.m10968a(context, str, axVar, j, bArr, c2495w);
    }

    public final Intent mo2736a(Context context, am amVar, String str, PurchaseFlowConfig purchaseFlowConfig, C2495w c2495w) {
        return CatchAbandonmentActivity.m10756a(context, amVar, 0, str, purchaseFlowConfig, c2495w);
    }

    public final Intent mo2753a(String str, String str2, String str3, C2495w c2495w) {
        return RedeemCodeActivity.m10895a(str, 3, str2, str3, c2495w);
    }

    public final Intent mo2737a(Context context, jl jlVar, int i, int i2, String str, C2495w c2495w) {
        Intent intent = new Intent(context, GiftingActivity.class);
        C1647h.m9344a(intent, str);
        intent.putExtra("GiftingActivity.action", ParcelableProto.m21671a((C0757i) jlVar));
        intent.putExtra("GiftingActivity.backend", i);
        intent.putExtra("GiftingActivity.documentType", i2);
        c2495w.m13380b(str).m13376a(intent);
        return intent;
    }

    public final Intent mo2730a(Account account, PurchaseParams purchaseParams, C2495w c2495w) {
        return PurchaseActivity.m10038a(account, purchaseParams, null, null, c2495w);
    }

    public final Intent mo2752a(Context context, Collection collection, C2495w c2495w, boolean z) {
        Intent intent = new Intent(context, MultiInstallActivity.class);
        intent.putExtra("MultiInstallActivity.installs", new ArrayList(collection));
        intent.putExtra("MultiInstallActivity.mode", 2);
        intent.putExtra("MultiInstallActivity.acquire-system-apps", z);
        c2495w.m13376a(intent);
        return intent;
    }
}
