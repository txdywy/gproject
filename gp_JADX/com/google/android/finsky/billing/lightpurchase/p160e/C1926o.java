package com.google.android.finsky.billing.lightpurchase.p160e;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.p111d.C2482j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class C1926o extends C1076h {
    public static final ce f9858a = C2482j.m13283a(0);
    public static CheckoutPurchaseError f9859b;

    protected static Bundle m10299a(CheckoutPurchaseError checkoutPurchaseError, boolean z, boolean z2, int i, int i2, PurchaseFlowConfig purchaseFlowConfig) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ErrorBaseStep.checkoutPurchaseError", checkoutPurchaseError);
        bundle.putBoolean("ErrorBaseStep.purchaseFailed", z);
        bundle.putBoolean("ErrorBaseStep.paymentDeclined", z2);
        bundle.putInt("ErrorBaseStep.screenUiElementType", i);
        bundle.putInt("ErrorBaseStep.buttonUiElementType", i2);
        C1473m.f7980a.aH().m9785b(bundle, purchaseFlowConfig);
        f9859b = checkoutPurchaseError;
        f9858a.b(i);
        return bundle;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        f9859b = (CheckoutPurchaseError) bundle2.getParcelable("ErrorBaseStep.checkoutPurchaseError");
        f9858a.b(bundle2.getInt("ErrorBaseStep.screenUiElementType"));
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CharSequence c;
        String c2;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C7582R.layout.light_purchase_error_step, viewGroup, false);
        if (TextUtils.isEmpty(f9859b.f9627b)) {
            c = m592c((int) C7582R.string.error);
        } else {
            c = f9859b.f9627b;
        }
        if (TextUtils.isEmpty(f9859b.f9628c)) {
            c2 = m592c((int) C7582R.string.generic_purchase_prepare_error);
        } else {
            c2 = f9859b.f9628c;
        }
        TextView textView = (TextView) viewGroup2.findViewById(C7582R.id.title);
        textView.setText(c);
        TextView textView2 = (TextView) viewGroup2.findViewById(C7582R.id.message);
        ae.m9217a(textView2, c2);
        C1473m.f7980a.aH().m9782a(this.f760q, viewGroup2, textView, textView2, null, null, null, aa().ao());
        return viewGroup2;
    }

    public final void g_() {
        super.g_();
        View view = this.f746R;
        C1601a.m9199a(m603h(), ((TextView) view.findViewById(C7582R.id.message)).getText().toString(), view, false);
    }

    public final String mo1406a(Resources resources) {
        if (TextUtils.isEmpty(f9859b.f9629d)) {
            return resources.getString(C7582R.string.ok);
        }
        return f9859b.f9629d;
    }

    public void mo1405X() {
        m6694a(this.f760q.getInt("ErrorBaseStep.buttonUiElementType"), null);
    }

    public ce getPlayStoreUiElement() {
        return f9858a;
    }
}
