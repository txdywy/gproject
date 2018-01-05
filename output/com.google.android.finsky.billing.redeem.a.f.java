package com.google.android.finsky.billing.redeem.a;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.bg.s;

public final class com.google.android.finsky.billing.redeem.a.f implements TextView$OnEditorActionListener
{

    public final com.google.android.finsky.billing.redeem.a.d a;

    f(com.google.android.finsky.billing.redeem.a.d p0) {
        this.a = p0;
    }

    public final boolean onEditorAction(TextView p0, int p1, KeyEvent p2) {
        if (p1 == 6) {
            if (TextUtils.isEmpty(this.a.d.getText()))
                this.a.a(this.a.c(2131951772));
            else
                this.a.a(1);
        }
        else if (p1 == 7)
            com.google.android.finsky.bg.s.a(this.a.h(), this.a.d);
        return 0;
    }

}
