package com.google.android.finsky.br.a;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.u;
import android.text.TextUtils;
import com.android.ex.photo.d.a;
import com.android.ex.photo.e;
import com.google.android.finsky.activities.AccessRestrictedActivity;
import com.google.android.finsky.activities.AppsPermissionsActivity;
import com.google.android.finsky.activities.MultiInstallActivity;
import com.google.android.finsky.activities.ReviewsActivity;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.addresschallenge.AddressChallengeActivity;
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
import com.google.android.finsky.cv.a.am;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.jl;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.v;
import com.google.android.finsky.notification.u;
import com.google.android.finsky.notification.v;
import com.google.android.finsky.notification.w;
import com.google.android.finsky.screenshotsactivity.ScreenshotsActivityV2;
import com.google.android.finsky.settings.SettingsActivity;
import com.google.android.finsky.setup.SetupWizardFinalHoldActivity;
import com.google.android.finsky.tos.TosActivity;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.i;
import com.google.wireless.android.finsky.dfe.c.a.eb;
import com.google.wireless.android.finsky.dfe.nano.ez;
import com.google.wireless.android.finsky.dfe.nano.gj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class com.google.android.finsky.br.a.i implements com.google.android.finsky.br.b
{

    public static final Set b;
    public final com.google.android.finsky.as.a a;

    static {
        v1 = new String[2];
        v1[0] = "com.google.android.finsky.UNINSTALL_WIZARD_FOR_DETAILS";
        v1[1] = "com.google.android.finsky.UNINSTALL_WIZARD_FOR_MY_DOWNLOADS";
        com.google.android.finsky.br.a.i.b = Collections.unmodifiableSet(new HashSet(Arrays.asList(v1)));
    }

    i(com.google.android.finsky.as.a p0) {
        this.a = p0;
    }

    private static Intent a(Context p0, int p1) {
        v0 = new Intent(p0, AccessRestrictedActivity);
        v0.putExtra("AccessRestrictedActivity.messageId", p1);
        return v0;
    }

    private static Intent a(com.google.android.finsky.notification.u p0, Context p1, com.google.android.finsky.d.w p2) {
        if ("com.google.android.finsky.DEFAULT_CLICK".equals(p0.a)) {
            v0 = com.google.android.finsky.notification.w.a(p0, p1, com.google.android.finsky.br.a.j.a(), p2);
            v0.setAction(0);
        }
        else if ("com.google.android.finsky.VIEW_MY_DOWNLOADS".equals(p0.a))
            v0 = com.google.android.finsky.notification.w.a(p0, p1, com.google.android.finsky.br.a.j.a(), 0);
        else if ("com.google.android.finsky.DETAILS".equals(p0.a))
            v0 = com.google.android.finsky.notification.w.a(p0, p1, com.google.android.finsky.br.a.j.a(), p2);
        else if (com.google.android.finsky.br.a.i.b.contains(p0.a))
            v0 = com.google.android.finsky.notification.w.a(p0, p1, com.google.android.finsky.br.a.j.a(), p2);
        else
            v0 = 0;
        return v0;
    }

    private static com.google.android.finsky.notification.v a(String p0, String p1, String p2, String p3, boolean p4) {
        v0 = com.google.android.finsky.notification.u.b("com.google.android.finsky.DETAILS");
        v0.d = Uri.parse(p0);
        if (p1 != 0)
            v0.a("continue_url", p1);
        if (p2 != 0)
            v0.a("override_account", p2);
        if (p3 != 0)
            v0.a("original_url", p3);
        if (p4 != 0)
            v0.a("clear_back_stack", p4);
        return v0;
    }

    private static com.google.android.finsky.notification.u b() {
        return com.google.android.finsky.notification.u.b("com.google.android.finsky.VIEW_MY_DOWNLOADS").a();
    }

    private static com.google.android.finsky.notification.v b(String p0) {
        return com.google.android.finsky.br.a.i.a(p0, 0, 0, 0, 0);
    }

    public final PendingIntent a(com.google.android.finsky.notification.u p0, Context p1, int p2, com.google.android.finsky.d.w p3) {
        v0 = com.google.android.finsky.br.a.i.a(p0, p1, p3);
        if (v0 != 0)
            v0 = com.google.android.finsky.notification.w.a(v0, p1, p2);
        else
            v0 = 0;
        return v0;
    }

    public final Intent a(int p0, com.google.wireless.android.finsky.a.a.i p1, Bundle p2, com.google.android.finsky.d.w p3) {
        return AddressChallengeActivity.a(p0, p1, p2, p3);
    }

    public final Intent a(Account p0, Context p1, com.google.android.finsky.ba.e p2, Document p3, com.google.android.finsky.d.w p4, PurchaseParams p5, com.google.wireless.android.finsky.dfe.c.a.eb p6, boolean p7, boolean p8) {
        if (this.a.e != 0)
            throw new UnsupportedOperationException("Acquire Activity does not support auto");
        if (this.a.f != 0)
            v0 = "com.google.android.finsky.tv.ACQUIRE";
        else if (p2.a(12642294))
            v0 = "com.google.android.finsky.phoenix.ACQUIRE";
        else if (this.a.g != 0)
            v0 = "com.google.android.finsky.wear.ACQUIRE";
        else
            v0 = "com.google.android.finsky.ACQUIRE";
        v1 = new Intent(v0);
        v1.setPackage(p1.getPackageName());
        v1.putExtra("AcquireActivity.account", p0);
        if (p3 != 0)
            v1.putExtra("AcquireActivity.doc", p3);
        if (p4 != 0)
            p4.a(v1);
        if (p5 != 0)
            v1.putExtra("AcquireActivity.purchaseParams", p5);
        if (p6 != 0)
            v1.putExtra("AcquireActivity.redeemParam", ParcelableProto.a(p6));
        v1.putExtra("AcquireActivity.topupRequest", p7);
        v1.putExtra("AcquireActivity.logPair", p8);
        return v1;
    }

    public final Intent a(Account p0, Context p1, PurchaseParams p2, com.google.android.finsky.ba.e p3) {
        if (p3.a(12638277))
            v0 = this.a(p0, p1, p3, 0, 0, p2, 0, 0, 1);
        else {
            v1 = new Bundle();
            v1.putParcelable("TvIntentConstants.account", p0);
            v1.putParcelable("TvIntentConstants.purchaseParams", p2);
            v1.putString("TvIntentConstants.breadcrumb", p2.n.c);
            v0 = new Intent("com.google.android.finsky.tv.IABV3_PURCHASE");
            v0.putExtras(v1);
        }
        return v0;
    }

    public final Intent a(Account p0, Context p1, PurchaseParams p2, com.google.android.finsky.dfemodel.v p3, String p4, com.google.android.finsky.ba.e p5) {
        if (p5.a(12638277))
            v2 = this.a(p0, p1, p5, 0, 0, p2, 0, 0, 1);
        else {
            v3 = new Bundle();
            v3.putParcelable("TvIntentConstants.account", p0);
            v3.putParcelable("TvIntentConstants.purchaseParams", p2);
            if (p3 != 0)
                v3.putString("TvIntentConstants.offerFilter", p3.name());
            v3.putString("TvIntentConstants.breadcrumb", p4);
            v2 = new Intent("com.google.android.finsky.tv.PURCHASE");
            v2.putExtras(v3);
        }
        return v2;
    }

    public final Intent a(Account p0, PurchaseParams p1) {
        v0 = new Intent("com.google.android.finsky.wear.IABV3_PURCHASE");
        v0.putExtra("PurchaseActivity.account", p0);
        v0.putExtra("PurchaseActivity.params", p1);
        return v0;
    }

    public final Intent a(Account p0, PurchaseParams p1, com.google.android.finsky.d.w p2) {
        return PurchaseActivity.a(p0, p1, 0, 0, p2);
    }

    public final Intent a(Account p0, Document p1, String p2, int p3, com.google.android.finsky.d.w p4) {
        return LightPurchaseFlowActivity.a(p0, p1, p2, p3, 0, p1.a.D, 0, 1, 0, 0, 0, p4);
    }

    public final Intent a(Account p0, Document p1, String p2, int p3, com.google.android.finsky.dfemodel.v p4, String p5, String p6, boolean p7, int p8, com.google.android.finsky.d.w p9) {
        return LightPurchaseFlowActivity.a(p0, p1, p2, p3, p4, p1.a.D, p6, 0, p5, p7, p8, p9);
    }

    public final Intent a(Account p0, String p1, String p2, com.google.android.finsky.d.w p3) {
        return AuthenticatedWebViewActivity.a(p0, p1, p2, p3);
    }

    public final Intent a(Context p0) {
        return com.google.android.finsky.br.a.i.a(com.google.android.finsky.br.a.i.b(), p0, 0);
    }

    public final Intent a(Context p0, int p1, DfeToc p2) {
        v0 = p2.a(p1);
        v1 = new Intent(p0, com.google.android.finsky.br.a.j.a());
        v1.setData(Uri.parse(v0.e));
        v1.setAction("com.google.android.finsky.CORPUS_HOME");
        v1.putExtra("title", v0.d);
        v1.putExtra("backend_id", p1);
        return v1;
    }

    public final Intent a(Context p0, com.google.android.finsky.cv.a.am p1, String p2, PurchaseFlowConfig p3, com.google.android.finsky.d.w p4) {
        return CatchAbandonmentActivity.a(p0, p1, 0, p2, p3, p4);
    }

    public final Intent a(Context p0, com.google.android.finsky.cv.a.jl p1, int p2, int p3, String p4, com.google.android.finsky.d.w p5) {
        v0 = new Intent(p0, GiftingActivity);
        GiftingActivity.a(v0, p4);
        v0.putExtra("GiftingActivity.action", ParcelableProto.a(p1));
        v0.putExtra("GiftingActivity.backend", p2);
        v0.putExtra("GiftingActivity.documentType", p3);
        p5.b(p4).a(v0);
        return v0;
    }

    public final Intent a(Context p0, com.google.android.finsky.d.w p1) {
        v0 = new Intent(p0, com.google.android.finsky.br.a.j.a());
        p1.a(v0);
        return v0;
    }

    public final Intent a(Context p0, Document p1, int p2, int p3) {
        v1 = new com.android.ex.photo.e(p0, ScreenshotsActivityV2);
        v1.b = Integer.valueOf(p2);
        v1.f = com.android.ex.photo.d.a.a;
        v1.r = 1;
        v1.a(1092616192).s = 1;
        v0 = v1.a();
        v0.putExtra("document", p1);
        v0.putExtra("imageType", p3);
        return v0;
    }

    public final Intent a(Context p0, Document p1, com.google.android.finsky.d.w p2) {
        return this.a(p0, p1.a.w, p2);
    }

    public final Intent a(Context p0, Document p1, String p2, boolean p3, com.google.android.finsky.d.w p4) {
        v0 = new Intent(p0, ReviewsActivity);
        v0.putExtra("finsky.ReviewsActivity.document", p1);
        v0.putExtra("finsky.ReviewsActivity.reviewsUrl", p2);
        v0.putExtra("finsky.ReviewsActivity.isRottenTomatoesReviews", p3);
        v0.setFlags(536870912);
        p4.a(v0);
        return v0;
    }

    public final Intent a(Context p0, String p1) {
        return new Intent("android.intent.action.VIEW").setClass(p0, com.google.android.finsky.br.a.j.a()).setData(Uri.parse(p1));
    }

    public final Intent a(Context p0, String p1, int p2, String p3, com.google.android.finsky.d.w p4) {
        v0 = new Intent(p0, AgeVerificationActivity);
        v0.putExtra("authAccount", p1);
        v0.putExtra("AgeVerificationActivity.backend", p2);
        v0.putExtra("AgeVerificationActivity.docid_str", p3);
        p4.b(p1).a(v0);
        return v0;
    }

    public final Intent a(Context p0, String p1, com.google.android.finsky.cv.a.ax p2, long p3, byte[] p5, com.google.android.finsky.d.w p6) {
        v0 = new Intent(p0, com.google.android.finsky.br.a.j.a());
        v0.setAction("com.google.android.finsky.UPDATE_SUBSCRIPTION_INSTRUMENT");
        v0.putExtra("account_name", p1);
        v0.putExtra("document", ParcelableProto.a(p2));
        v0.putExtra("instrument_id", p3);
        v0.putExtra("payment_client_token", p5);
        p6.a(v0);
        return v0;
    }

    public final Intent a(Context p0, String p1, com.google.android.finsky.d.w p2) {
        return com.google.android.finsky.br.a.i.a(com.google.android.finsky.br.a.i.b(p1).a(), p0, p2);
    }

    public final Intent a(Context p0, String p1, DfeToc p2) {
        v0 = 0;
        if (com.google.android.finsky.as.a.a(p0))
            v0 = com.google.android.finsky.br.a.j.b();
        if (v0 == 0)
            v0 = TosActivity;
        v1 = new Intent(p0, v0);
        v0 = new Bundle();
        v0.putString("finsky.TosActivity.account", p1);
        v0.putParcelable("finsky.TosActivity.toc", p2);
        v1.putExtras(v0);
        return v1;
    }

    public final Intent a(Context p0, String p1, String p2, int p3, com.google.android.finsky.d.w p4) {
        v0 = new Intent(p0, com.google.android.finsky.br.a.j.a());
        v0.setData(Uri.parse(p1));
        v0.setAction("com.google.android.finsky.VIEW_BROWSE");
        v0.putExtra("title", p2);
        v0.putExtra("backend_id", p3);
        v0.putExtra("clear_back_stack", 0);
        p4.a(v0);
        return v0;
    }

    public final Intent a(Context p0, String p1, String p2, Document p3, boolean p4, com.google.android.finsky.d.w p5) {
        return this.a(p0, p1, p2, p3, p4, 0, 0, p5);
    }

    public final Intent a(Context p0, String p1, String p2, Document p3, boolean p4, boolean p5, String p6, com.google.android.finsky.d.w p7) {
        v0 = new Intent(p0, AppsPermissionsActivity);
        v0.putExtra("AppsPermissionsActivity.accountName", p1);
        v0.putExtra("AppsPermissionsActivity.docidStr", p2);
        v0.putExtra("AppsPermissionsActivity.doc", p3);
        v0.putExtra("AppsPermissionsActivity.showDetailedPermissions", p4);
        v0.putExtra("AppsPermissionsActivity.alwaysShowBucketedPermissions", p5);
        v0.putExtra("AppsPermissionsActivity.buttonText", p6);
        p7.a(v0);
        return v0;
    }

    public final Intent a(Context p0, String p1, String p2, String p3, String p4, com.google.android.finsky.d.w p5) {
        return com.google.android.finsky.br.a.i.a(this.a(p1, p2, p3, p4), p0, p5);
    }

    public final Intent a(Context p0, String p1, String p2, String p3, String p4, boolean p5, com.google.android.finsky.d.w p6) {
        return com.google.android.finsky.br.a.i.a(com.google.android.finsky.br.a.i.a(p1, p2, p3, p4, p5).a(), p0, p6);
    }

    public final Intent a(Context p0, Collection p1, com.google.android.finsky.d.w p2, boolean p3) {
        v0 = new Intent(p0, MultiInstallActivity);
        v0.putExtra("MultiInstallActivity.installs", new ArrayList(p1));
        v0.putExtra("MultiInstallActivity.mode", 2);
        v0.putExtra("MultiInstallActivity.acquire-system-apps", p3);
        p2.a(v0);
        return v0;
    }

    public final Intent a(String p0, String p1, String p2, com.google.android.finsky.d.w p3) {
        return RedeemCodeActivity.a(p0, 3, p1, p2, p3);
    }

    public final com.google.android.finsky.notification.u a() {
        return com.google.android.finsky.notification.u.b("com.google.android.finsky.UNINSTALL_WIZARD_FOR_MY_DOWNLOADS").a();
    }

    public final com.google.android.finsky.notification.u a(String p0) {
        v0 = com.google.android.finsky.notification.u.b("com.google.android.finsky.UNINSTALL_WIZARD_FOR_DETAILS");
        v0.d = Uri.parse(p0);
        return v0.a();
    }

    public final com.google.android.finsky.notification.u a(String p0, String p1, String p2, String p3) {
        if ("com.google.android.instantapps.supervisor".equals(p0))
            v0 = com.google.android.finsky.br.a.i.b();
        else if ("com.google.android.gms".equals(p0))
            v0 = com.google.android.finsky.br.a.i.b();
        else {
            v0 = com.google.android.finsky.notification.u.b("com.google.android.finsky.DEFAULT_CLICK");
            if (!TextUtils.isEmpty(p0))
                v0 = com.google.android.finsky.br.a.i.b(p3).a("error_doc_id", p0);
            if (!TextUtils.isEmpty(p1))
                v0.a("error_title", p1);
            if (!TextUtils.isEmpty(p2))
                v0.a("error_html_message", p2);
            v0 = v0.a();
        }
        return v0;
    }

    public final void a(android.support.v4.app.u p0, com.google.android.finsky.d.w p1) {
        v0 = new Intent(p0, SettingsActivity);
        if (!TextUtils.isEmpty(0))
            v0.putExtra("setting-key-to-scroll", 0);
        p1.a(v0);
        p0.startActivityForResult(v0, 31);
    }

    public final Intent b(Context p0) {
        return new Intent("com.google.android.finsky.VIEW_MY_DOWNLOADS").setClass(p0, com.google.android.finsky.br.a.j.a()).putExtra("trigger_update_all", 1);
    }

    public final Intent b(Context p0, com.google.android.finsky.d.w p1) {
        v0 = p0.getPackageManager().getLaunchIntentForPackage(p0.getApplicationContext().getPackageName());
        p1.a(v0);
        return v0;
    }

    public final Intent b(Context p0, String p1) {
        return new Intent(p0, com.google.android.finsky.br.a.j.a()).setAction("com.google.android.finsky.PLAY_PASS_HOME").putExtra("authAccount", p1);
    }

    public final Intent b(Context p0, String p1, com.google.android.finsky.cv.a.ax p2, long p3, byte[] p5, com.google.android.finsky.d.w p6) {
        return UpdateSubscriptionInstrumentActivity.a(p0, p1, p2, p3, p5, p6);
    }

    public final Intent b(Context p0, String p1, com.google.android.finsky.d.w p2) {
        v0 = new Intent(p0, com.google.android.finsky.br.a.j.a()).setAction("com.google.android.gms.actions.VIEW_REMOTE_ESCALATIONS").putExtra("authAccount", p1);
        p2.a(v0);
        return v0;
    }

    public final Intent c(Context p0) {
        return com.google.android.finsky.br.a.i.a(p0, 2131952437);
    }

    public final Intent d(Context p0) {
        return com.google.android.finsky.br.a.i.a(p0, 2131952436);
    }

    public final Intent e(Context p0) {
        return com.google.android.finsky.br.a.i.a(p0, 2131952396);
    }

    public final Intent f(Context p0) {
        if (this.a.f != 0) {
            v0 = new Intent();
            v0.setClassName(p0, "com.google.android.finsky.activities.TvSetupWizardFinalHoldActivity");
        }
        else
            v0 = new Intent(p0, SetupWizardFinalHoldActivity);
        return v0;
    }

    public final Intent g(Context p0) {
        return new Intent(p0, com.google.android.finsky.br.a.j.a());
    }

}
