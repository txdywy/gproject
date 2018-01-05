package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.AskToDownloadActivity;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.p120d.C1812d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.m;
import java.lang.ref.WeakReference;

final class ai implements C1812d {
    public final WeakReference f9747a;

    public ai(LightPurchaseFlowActivity lightPurchaseFlowActivity) {
        this.f9747a = new WeakReference(lightPurchaseFlowActivity);
    }

    public final void mo2512a(m mVar) {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = (LightPurchaseFlowActivity) this.f9747a.get();
        if (lightPurchaseFlowActivity == null) {
            return;
        }
        if (mVar.m == null) {
            throw new IllegalStateException("Only the family acquisition challenge is supported for free purchases.");
        }
        Account account = lightPurchaseFlowActivity.f9652I;
        Parcelable parcelable = lightPurchaseFlowActivity.f9663T;
        String str = lightPurchaseFlowActivity.f9653J;
        int i = lightPurchaseFlowActivity.f9654K.f11834c;
        int i2 = lightPurchaseFlowActivity.f9655L;
        int i3 = lightPurchaseFlowActivity.f9654K.f11835d;
        C2495w c2495w = lightPurchaseFlowActivity.f6316C;
        Intent intent = new Intent(C1473m.f7980a.f7981b, AskToDownloadActivity.class);
        C1647h.m9344a(intent, account.name);
        intent.putExtra("AskToDownloadActivity.challenge", ParcelableProto.m21671a((C0757i) mVar));
        intent.putExtra("AskToDownloadActivity.document", parcelable);
        intent.putExtra("AskToDownloadActivity.docidStr", str);
        intent.putExtra("AskToDownloadActivity.documentType", i);
        intent.putExtra("AskToDownloadActivity.offerType", i2);
        intent.putExtra("AskToDownloadActivity.backend", i3);
        c2495w.m13366a(account).m13376a(intent);
        lightPurchaseFlowActivity.startActivityForResult(intent, 10);
    }
}
