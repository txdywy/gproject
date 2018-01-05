package com.google.android.wallet.p372d;

import android.os.Bundle;
import com.google.android.wallet.analytics.AppValidationResult;
import java.util.ArrayList;

public final class C6615a extends C6531c {
    public Bundle f32784a = Bundle.EMPTY;

    public final ArrayList mo5505W() {
        ArrayList arrayList = new ArrayList(this.f32784a.size());
        for (String parcelable : this.f32784a.keySet()) {
            AppValidationResult appValidationResult = (AppValidationResult) this.f32784a.getParcelable(parcelable);
            if (appValidationResult.f32503b == 0) {
                arrayList.add(appValidationResult.f32502a);
            }
        }
        return arrayList;
    }

    public final ArrayList m29991X() {
        ArrayList arrayList = new ArrayList(this.f32784a.size());
        for (String parcelable : this.f32784a.keySet()) {
            arrayList.add((AppValidationResult) this.f32784a.getParcelable(parcelable));
        }
        return arrayList;
    }

    public final void mo5508e(Bundle bundle) {
        super.mo5508e(bundle);
        bundle.putBundle("validateAppAnalyticsResultData", this.f32784a);
    }

    protected final void mo5506a(Bundle bundle) {
        super.mo5506a(bundle);
        this.f32784a = bundle.getBundle("validateAppAnalyticsResultData");
    }
}
