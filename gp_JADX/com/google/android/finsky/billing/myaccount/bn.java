package com.google.android.finsky.billing.myaccount;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.billing.myaccount.layout.C2012a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

public final class bn implements OnClickListener {
    public final C2495w f10261a;
    public int f10262b = -1;
    public C2012a f10263c;

    public bn(C2495w c2495w) {
        this.f10261a = c2495w;
    }

    public final void onClick(View view) {
        C2012a c2012a = (C2012a) view;
        if (!c2012a.f10370g) {
            this.f10261a.m13379b(new C2475d(c2012a));
            c2012a.m10697b();
            if (this.f10263c != null) {
                this.f10263c.m10697b();
            }
            this.f10262b = c2012a.getRowPosition();
            this.f10263c = c2012a;
        }
    }
}
