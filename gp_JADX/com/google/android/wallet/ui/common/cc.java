package com.google.android.wallet.ui.common;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class cc extends LinearLayout implements OnClickListener {
    public TextView f33620a;
    public ImageView f33621b;
    public ImageWithCaptionView f33622c;
    public int f33623d;

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f33620a != null) {
            this.f33620a.setEnabled(z);
        }
        if (this.f33621b != null) {
            this.f33621b.setEnabled(z);
        }
        if (this.f33622c != null) {
            this.f33622c.setEnabled(z);
        }
    }

    public final void setSummaryOnClickListener(ca caVar) {
    }

    public final void setEditMode(int i) {
        this.f33623d = i;
        ci.m30863a(this.f33621b, this.f33623d, getContext(), this.f33620a.getText());
        throw new NoSuchMethodError();
    }

    public final void setTitle(CharSequence charSequence) {
        this.f33620a.setText(charSequence);
        ci.m30863a(this.f33621b, this.f33623d, getContext(), this.f33620a.getText());
    }

    public final CharSequence getTitle() {
        return this.f33620a.getText();
    }

    public final void setShouldHideEditImage(boolean z) {
        throw new NoSuchMethodError();
    }

    public final void onClick(View view) {
        throw new NoSuchMethodError();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }
}
