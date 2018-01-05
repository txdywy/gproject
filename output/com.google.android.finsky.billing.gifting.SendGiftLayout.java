package com.google.android.finsky.billing.gifting;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.s;
import com.google.android.finsky.cv.a.jp;
import com.google.android.finsky.frameworkviews.InputWithCharacterCounter;

protected class SendGiftLayout extends LinearLayout implements com.google.android.finsky.frameworkviews.aa
{

    public Activity a;
    public View b;
    public TextView c;
    public TextView d;
    public InputWithCharacterCounter e;

    SendGiftLayout(Context p0) {
        LinearLayout(p0);
    }

    SendGiftLayout(Context p0, AttributeSet p1) {
        LinearLayout(p0, p1);
    }

    public final void X_() {
        com.google.android.finsky.bg.s.a(this.a, this.e);
    }

    public final void a(Activity p0, com.google.android.finsky.cv.a.jp p1, int p2, int p3) {
        this.a = p0;
        if (p3 == 48)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            v0 = 2131558666;
        else
            v0 = com.google.android.finsky.bg.h.b(p2);
        this.b.setBackgroundColor(this.getResources().getColor(v0));
        this.c.setText(p1.b);
        this.d.setText(p1.c);
        this.e.a(p1.d, this.getResources().getString(2131952493), p1.e, this);
        com.google.android.finsky.bg.s.a(this.a, (EditText)this.e.findViewById(2131755109));
    }

    public String getMessage() {
        return this.e.getTextValue();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.b = this.findViewById(2131756171);
        this.c = (TextView)this.findViewById(2131755114);
        this.d = (TextView)this.findViewById(2131756147);
        this.e = (InputWithCharacterCounter)this.findViewById(2131756177);
    }

}
