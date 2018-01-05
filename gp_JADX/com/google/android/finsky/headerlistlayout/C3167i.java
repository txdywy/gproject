package com.google.android.finsky.headerlistlayout;

import android.view.View;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.squareup.leakcanary.C7582R;

public final class C3167i extends C3166e {
    public C3167i(View view, C1043h c1043h) {
        super(view, C7582R.id.page_content, C7582R.id.page_error_indicator, C7582R.id.loading_indicator, c1043h, 2);
    }

    public C3167i(View view, C1043h c1043h, byte b) {
        super(view, C7582R.id.page_content, C7582R.id.loading_indicator, c1043h, 2);
    }

    protected final void mo3351a(boolean z, boolean z2) {
        if (this.g > 0) {
            FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.e.findViewById(this.g);
            if (finskyHeaderListLayout == null) {
                return;
            }
            if (z) {
                finskyHeaderListLayout.setVisibility(0);
                finskyHeaderListLayout.f16333e.setVisibility(0);
            } else if (z2) {
                finskyHeaderListLayout.setVisibility(0);
                finskyHeaderListLayout.f16333e.setVisibility(8);
            } else {
                finskyHeaderListLayout.setVisibility(8);
            }
        }
    }
}
