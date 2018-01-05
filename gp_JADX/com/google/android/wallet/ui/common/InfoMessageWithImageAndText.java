package com.google.android.wallet.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.p366b.C6511g;
import java.util.List;
import java.util.Locale;

public class InfoMessageWithImageAndText extends LinearLayout implements C6504m, C6511g, aa {
    public final C6506n f33406a = new C6506n(1627);
    public ae f33407b;
    public InfoMessageView f33408c;
    public ImageWithCaptionView f33409d;
    public at f33410e;
    public C6504m f33411f;

    public InfoMessageWithImageAndText(Context context) {
        super(context);
    }

    public InfoMessageWithImageAndText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InfoMessageWithImageAndText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f33409d.setEnabled(z);
        this.f33408c.setEnabled(z);
    }

    public final boolean cQ_() {
        return true;
    }

    public final boolean mo5581e() {
        return true;
    }

    public CharSequence getError() {
        return this.f33408c.getError();
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
    }

    public final void cT_() {
        this.f33408c.cT_();
    }

    public at getParentFormElement() {
        return this.f33410e;
    }

    public void setParentFormElement(at atVar) {
        this.f33410e = atVar;
    }

    public final String mo5522a(String str) {
        return this.f33408c.mo5522a(str);
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        switch (lVar.c) {
            case 1:
                setVisibility(0);
                return;
            case 11:
                setVisibility(8);
                return;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported resulting action type: %d", new Object[]{Integer.valueOf(lVar.c)}));
        }
    }

    public C6504m getParentUiNode() {
        return this.f33411f;
    }

    public void setParentUiNode(C6504m c6504m) {
        this.f33411f = c6504m;
    }

    public C6506n getUiElement() {
        return this.f33406a;
    }

    public List getChildren() {
        return null;
    }
}
