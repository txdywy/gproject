package com.google.android.wallet.ui.p393e;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.ui.common.bo;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.cv;

final class C6805c implements bo {
    public final /* synthetic */ int f33741a;
    public final /* synthetic */ C6670a f33742b;

    C6805c(C6670a c6670a, int i) {
        this.f33742b = c6670a;
        this.f33741a = i;
    }

    public final void mo5563a(View view) {
        int i = -1;
        cv cvVar = this.f33742b;
        if (this.f33741a >= cvVar.av) {
            int intValue;
            ViewGroup viewGroup;
            int i2;
            int intValue2 = ((Integer) cvVar.at.get(cvVar.av)).intValue();
            int intValue3 = ((Integer) cvVar.au.get(cvVar.av)).intValue();
            cvVar.av++;
            int i3 = cvVar.av < cvVar.at.size() ? 1 : 0;
            if (i3 != 0) {
                intValue = ((Integer) cvVar.at.get(cvVar.av)).intValue();
            } else {
                intValue = -1;
            }
            if (i3 != 0) {
                i = ((Integer) cvVar.au.get(cvVar.av)).intValue();
            }
            if (intValue3 >= 0) {
                viewGroup = (ViewGroup) cvVar.f32937h.getChildAt(intValue2);
                if (intValue == intValue2) {
                    i2 = i;
                } else {
                    i2 = viewGroup.getChildCount() - 1;
                }
                for (intValue3++; intValue3 <= i2; intValue3++) {
                    ci.m30855a(viewGroup.getChildAt(intValue3), 0);
                }
            }
            i2 = i3 != 0 ? intValue : cvVar.f32937h.getChildCount() - 1;
            for (i3 = intValue2 + 1; i3 <= i2; i3++) {
                View childAt = cvVar.f32937h.getChildAt(i3);
                ci.m30855a(childAt, 0);
                if (i3 == intValue && i >= 0) {
                    viewGroup = (ViewGroup) childAt;
                    intValue2 = viewGroup.getChildCount();
                    for (intValue3 = i + 1; intValue3 < intValue2; intValue3++) {
                        viewGroup.getChildAt(intValue3).setVisibility(8);
                    }
                }
            }
            cvVar.mo5469a(1, Bundle.EMPTY);
        }
    }
}
