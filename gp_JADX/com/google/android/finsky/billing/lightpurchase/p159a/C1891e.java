package com.google.android.finsky.billing.lightpurchase.p159a;

import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.wireless.android.finsky.a.a.ad;
import java.util.List;

final class C1891e implements Runnable {
    public final /* synthetic */ List f9690a;
    public final /* synthetic */ C1887a f9691b;

    C1891e(C1887a c1887a, List list) {
        this.f9691b = c1887a;
        this.f9690a = list;
    }

    public final void run() {
        for (ad adVar : this.f9690a) {
            TextView textView;
            String charSequence;
            C1887a c1887a = this.f9691b;
            switch (adVar.c) {
                case 1:
                    textView = c1887a.af;
                    charSequence = textView.getHint().toString();
                    break;
                case 2:
                    textView = c1887a.ag;
                    charSequence = textView.getHint().toString();
                    break;
                case 4:
                    textView = c1887a.aj;
                    charSequence = textView.getHint().toString();
                    break;
                case 6:
                    textView = c1887a.ao;
                    charSequence = c1887a.an.getText().toString();
                    break;
                default:
                    charSequence = null;
                    textView = null;
                    break;
            }
            if (textView != null) {
                ae.m9219a(textView, charSequence, adVar.d);
            }
        }
    }
}
