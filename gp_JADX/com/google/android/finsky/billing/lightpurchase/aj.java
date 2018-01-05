package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.dfemodel.Document;
import java.lang.ref.WeakReference;

final class aj implements C1091e {
    public final WeakReference f9748a;

    public aj(LightPurchaseFlowActivity lightPurchaseFlowActivity) {
        this.f9748a = new WeakReference(lightPurchaseFlowActivity);
    }

    public final void mo1425a(Account account, Document document) {
        Context context = (LightPurchaseFlowActivity) this.f9748a.get();
        if (context == null) {
            return;
        }
        if (context.f9654K.f11834c == 1) {
            if (context.am) {
                if (!context.m10085i(false)) {
                    context.m10077a(context.ah);
                } else {
                    return;
                }
            }
            context.m10090z();
            if (context.m10072H()) {
                context.ar.mo2459a(context.f9652I, context.f6316C).m10013a(context);
            } else {
                context.m10088m();
            }
        } else if (context.mo1276k()) {
            context.m10088m();
        } else if (context.f9654K.f11835d != 6) {
            context.m10065A();
        } else if (!C1473m.f7980a.bn().mo2699a(context, context.f9652I, context.f9663T, context.H_(), null, 5)) {
            context.m10088m();
        }
    }

    public final void S_() {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = (LightPurchaseFlowActivity) this.f9748a.get();
        if (lightPurchaseFlowActivity != null) {
            lightPurchaseFlowActivity.m10087l();
        }
    }
}
