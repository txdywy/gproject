package com.google.android.finsky.stream.controllers.minitopcharts;

import android.content.Context;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class JpkrMiniTopChartsMoreFooterView extends TextView implements OnClickListener, ad {
    public C2495w f22612a;
    public final ce f22613b = C2482j.m13283a(6362);
    public ad f22614c;
    public C4349c f22615d;
    public boolean f22616e = false;

    public JpkrMiniTopChartsMoreFooterView(Context context) {
        super(context);
    }

    public JpkrMiniTopChartsMoreFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        FinskyLog.m21669e("Unexpected", new Object[0]);
    }

    public final void m20809a(C2495w c2495w, ad adVar, int i, boolean z, C4349c c4349c) {
        this.f22612a = c2495w;
        this.f22614c = adVar;
        this.f22614c.mo1219a(this);
        this.f22615d = c4349c;
        if (this.f22616e != z) {
            this.f22616e = z;
            if (z) {
                setClickable(true);
                setTextColor(C0216d.m1116c(getContext(), C1608h.m9251b(i)));
            } else {
                setClickable(false);
                setTextColor(getResources().getColor(C7582R.color.jpkr_disabled_grey));
            }
            super.setOnClickListener(z ? this : null);
        }
    }

    public void onClick(View view) {
        this.f22612a.m13379b(new C2475d(this));
        this.f22615d.mo4142a(this);
    }

    public ce getPlayStoreUiElement() {
        return this.f22613b;
    }

    public ad getParentNode() {
        if (this.f22614c == null) {
            FinskyLog.m21669e("Parent node is not set", new Object[0]);
        }
        return this.f22614c;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
