package com.google.android.finsky.billing.gifting;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.cv.p177a.jp;
import com.google.android.finsky.frameworkviews.InputWithCharacterCounter;
import com.google.android.finsky.frameworkviews.aa;
import com.squareup.leakcanary.C7582R;

public class SendGiftLayout extends LinearLayout implements aa {
    public Activity f9439a;
    public View f9440b;
    public TextView f9441c;
    public TextView f9442d;
    public InputWithCharacterCounter f9443e;

    public SendGiftLayout(Context context) {
        super(context);
    }

    public SendGiftLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f9440b = findViewById(C7582R.id.gift_dialog_header);
        this.f9441c = (TextView) findViewById(C7582R.id.title);
        this.f9442d = (TextView) findViewById(C7582R.id.item_title);
        this.f9443e = (InputWithCharacterCounter) findViewById(C7582R.id.gift_message_text);
    }

    public final void m9878a(Activity activity, jp jpVar, int i, int i2) {
        int i3;
        this.f9439a = activity;
        Object obj = i2 == 48 ? 1 : null;
        View view = this.f9440b;
        Resources resources = getResources();
        if (obj != null) {
            i3 = C7582R.color.play_credit_primary;
        } else {
            i3 = C1608h.m9251b(i);
        }
        view.setBackgroundColor(resources.getColor(i3));
        this.f9441c.setText(jpVar.f12803b);
        this.f9442d.setText(jpVar.f12804c);
        this.f9443e.m16027a(jpVar.f12805d, getResources().getString(C7582R.string.message_hint), jpVar.f12806e, this);
        C1618s.m9294a(this.f9439a, (EditText) this.f9443e.findViewById(C7582R.id.text));
    }

    public String getMessage() {
        return this.f9443e.getTextValue();
    }

    public final void X_() {
        C1618s.m9293a(this.f9439a, this.f9443e);
    }
}
