package com.google.android.finsky.billing.lightpurchase.p160e;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.finsky.bg.C1618s;

final class C1933h implements OnEditorActionListener {
    public final /* synthetic */ C1906g f9888a;

    C1933h(C1906g c1906g) {
        this.f9888a = c1906g;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.f9888a.m10234b(true);
            return true;
        } else if (i != 7) {
            return false;
        } else {
            C1618s.m9293a(this.f9888a.m603h(), this.f9888a.ax);
            return true;
        }
    }
}
