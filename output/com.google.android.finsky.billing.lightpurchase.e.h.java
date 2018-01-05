package com.google.android.finsky.billing.lightpurchase.e;

import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.finsky.bg.s;

public final class com.google.android.finsky.billing.lightpurchase.e.h implements TextView$OnEditorActionListener
{

    public final com.google.android.finsky.billing.lightpurchase.e.g a;

    h(com.google.android.finsky.billing.lightpurchase.e.g p0) {
        this.a = p0;
    }

    public final boolean onEditorAction(TextView p0, int p1, KeyEvent p2) {
        v0 = 1;
        if (p1 == 6)
            this.a.b(1);
        else if (p1 == 7)
            com.google.android.finsky.bg.s.a(this.a.h(), this.a.ax);
        else
            v0 = 0;
        return v0;
    }

}
