package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.AskToDownloadActivity;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.billing.lightpurchase.p118d.C1086a;
import com.google.android.finsky.billing.lightpurchase.p160e.C1905j;
import com.google.android.finsky.billing.lightpurchase.p160e.C1907q;
import com.google.android.finsky.billing.lightpurchase.p160e.C1909p;
import com.google.android.finsky.billing.lightpurchase.p160e.ac;
import com.google.android.finsky.billing.lightpurchase.p162c.C1913a;
import com.google.android.finsky.billing.lightpurchase.p162c.C1914b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.a.a.q;

public final class C1958q extends C1086a implements C1905j {
    public final C2492t f9961a = C1473m.f7980a.aP();
    public m f9962b;
    public Document f9963c;
    public String f9964d;
    public int f9965e;
    public int f9966f;
    public int f9967g;
    public int f9968h = 0;

    public static C1958q m10406a(Account account, m mVar, Document document, String str, int i, int i2, int i3, C2495w c2495w) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("MultiStepFragment.account", account);
        bundle.putParcelable("FreePurchaseFragment.challenge", ParcelableProto.m21671a((C0757i) mVar));
        bundle.putParcelable("FreePurchaseFragment.document", document);
        bundle.putString("FreePurchaseFragment.docidStr", str);
        bundle.putInt("FreePurchaseFragment.documentType", i);
        bundle.putInt("FreePurchaseFragment.offerType", i3);
        bundle.putInt("FreePurchaseFragment.backend", i2);
        c2495w.m13366a(account).m13377a(bundle);
        Fragment c1958q = new C1958q();
        c1958q.m600f(bundle);
        return c1958q;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9962b = (m) ParcelableProto.m21673a(bundle2, "FreePurchaseFragment.challenge");
        this.f9963c = (Document) bundle2.getParcelable("FreePurchaseFragment.document");
        this.f9964d = bundle2.getString("FreePurchaseFragment.docidStr");
        this.f9965e = bundle2.getInt("FreePurchaseFragment.documentType");
        this.f9967g = bundle2.getInt("FreePurchaseFragment.offerType");
        this.f9966f = bundle2.getInt("FreePurchaseFragment.backend");
    }

    public final void g_() {
        super.g_();
        if (this.ax == null && this.f9962b.m != null) {
            q qVar = this.f9962b.m;
            String str = this.f9964d;
            int i = this.f9967g;
            int i2 = this.f9966f;
            C1076h c1914b = new C1914b();
            c1914b.m600f(C1909p.m10247a(qVar, str, i, i2, PurchaseFlowConfig.f9283a));
            mo1411a(c1914b);
        }
    }

    protected final int mo968W() {
        return this.f9966f;
    }

    public final void e_(int i) {
        this.f9968h = i;
    }

    public final boolean mo2520a(Bundle bundle) {
        AskToDownloadActivity askToDownloadActivity = (AskToDownloadActivity) m603h();
        int i = this.f9968h;
        Intent intent = new Intent();
        intent.putExtra("AskToDownloadActivity.authMethod", i);
        for (String str : bundle.keySet()) {
            intent.putExtra(str, bundle.getString(str));
        }
        askToDownloadActivity.setResult(-1, intent);
        askToDownloadActivity.finish();
        return true;
    }

    public final void mo2513X() {
        if (this.f9962b.m != null) {
            this.f9961a.m13356b(this.aJ, "purchase_fragment_family_acquisition_challenge");
            Account account = this.aw;
            q qVar = this.f9962b.m;
            Document document = this.f9963c;
            String str = this.f9964d;
            int i = this.f9965e;
            int i2 = this.f9966f;
            C1076h c1913a = new C1913a();
            c1913a.m600f(C1907q.m10238a(account, qVar, document, str, i, i2, PurchaseFlowConfig.f9283a));
            mo1411a(c1913a);
            return;
        }
        FinskyLog.m21669e("Null family acquisition challenge", new Object[0]);
        mo1411a(ac.m10304a(new CheckoutPurchaseError(), true));
    }
}
