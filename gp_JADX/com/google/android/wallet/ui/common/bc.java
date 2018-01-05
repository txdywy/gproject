package com.google.android.wallet.ui.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.volley.a.q;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p383e.C6623g;

public final class bc extends FrameLayout implements OnFocusChangeListener, C6756y {
    public View f33555a;
    public LinearLayout f33556b;

    public bc(Context context) {
        super(context);
        this.f33556b = (LinearLayout) LayoutInflater.from(context).inflate(C6623g.view_inline_image_container, this, false);
        super.addView(this.f33556b);
    }

    public final void m30746a(View view, ad[] adVarArr, q qVar) {
        this.f33555a = view;
        super.addView(this.f33555a);
        this.f33555a.setOnFocusChangeListener(this);
        LayoutInflater from = LayoutInflater.from(getContext());
        for (ad adVar : adVarArr) {
            ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) from.inflate(C6623g.view_inline_image, this.f33556b, false);
            this.f33556b.addView(imageWithCaptionView);
            imageWithCaptionView.m30637a(adVar, qVar, ((Boolean) C6489e.f32495a.a()).booleanValue());
        }
        m30745a(false);
    }

    public final void addView(View view) {
        throw new UnsupportedOperationException("Do not directly add views to InlineImageUiFieldView.");
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f33555a != null) {
            this.f33555a.setEnabled(z);
        }
        int childCount = this.f33556b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f33556b.getChildAt(i).setEnabled(z);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (view == this.f33555a) {
            m30745a(true);
        }
    }

    public final View getInnerFieldView() {
        return this.f33555a;
    }

    private final void m30745a(boolean z) {
        boolean hasFocus = this.f33555a.hasFocus();
        int i = hasFocus ? 0 : 4;
        if (this.f33556b.getVisibility() != i) {
            if (!z) {
                this.f33556b.setVisibility(i);
            } else if (hasFocus) {
                ci.m30855a(this.f33556b, 0);
            } else {
                ci.m30876b(this.f33556b, 0, 0);
            }
        }
    }
}
