package com.google.android.finsky.settings;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.finsky.bg.C1618s;

final class C4103m implements OnEditorActionListener {
    public final /* synthetic */ C4102l f20527a;

    C4103m(C4102l c4102l) {
        this.f20527a = c4102l;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.f20527a.m19051a(true);
            return true;
        } else if (i != 7) {
            return false;
        } else {
            C1618s.m9293a(this.f20527a.m603h(), this.f20527a.f20526i);
            return true;
        }
    }
}
