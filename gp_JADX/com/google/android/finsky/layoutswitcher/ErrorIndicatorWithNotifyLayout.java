package com.google.android.finsky.layoutswitcher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.SpacerHeightAwareFrameLayout;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public class ErrorIndicatorWithNotifyLayout extends SpacerHeightAwareFrameLayout {
    public C0002a f18862b;
    public View f18863c;
    public ImageView f18864d;
    public TextView f18865e;
    public TextView f18866f;
    public View f18867g;
    public View f18868h;
    public View f18869i;

    public ErrorIndicatorWithNotifyLayout(Context context) {
        super(context);
        ((C1399i) C3947d.m18649a(C1399i.class)).mo1865a(this);
    }

    public ErrorIndicatorWithNotifyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((C1399i) C3947d.m18649a(C1399i.class)).mo1865a(this);
    }

    public ErrorIndicatorWithNotifyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((C1399i) C3947d.m18649a(C1399i.class)).mo1865a(this);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f18863c = findViewById(C7582R.id.disconnection_page);
        this.f18864d = (ImageView) this.f18863c.findViewById(C7582R.id.connectivity_icon);
        this.f18865e = (TextView) this.f18863c.findViewById(C7582R.id.error_title);
        this.f18866f = (TextView) this.f18863c.findViewById(C7582R.id.error_msg);
        this.f18867g = this.f18863c.findViewById(C7582R.id.notify_button);
        this.f18867g.setOnClickListener(new C3739j(this, this.f18862b));
        this.f18868h = this.f18863c.findViewById(C7582R.id.retry_button);
        this.f18869i = this.f18863c.findViewById(C7582R.id.error_logo);
    }

    public final void m17612a(C3734b c3734b) {
        int i;
        int i2 = 0;
        this.f18863c.setVisibility(0);
        this.f18864d.setVisibility(c3734b.f18872c ? 0 : 8);
        this.f18864d.setImageResource(c3734b.f18870a);
        TextView textView = this.f18865e;
        if (c3734b.f18873d) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f18866f.setText(c3734b.f18871b);
        View view = this.f18867g;
        if (c3734b.f18874e) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (c3734b.f18875f != 0) {
            View view2 = this.f18869i;
            if (c3734b.f18875f != 1) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
    }

    public final void m17613a(C3734b c3734b, OnClickListener onClickListener) {
        m17612a(c3734b);
        this.f18868h.setOnClickListener(onClickListener);
    }
}
