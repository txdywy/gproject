package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import java.util.List;

public class FormHeaderView extends LinearLayout implements aa {
    public int f33375a;
    public h f33376b;
    public bb f33377c;
    public at f33378d;

    public FormHeaderView(Context context) {
        super(context);
        setVisibility(getVisibility());
    }

    public FormHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(getVisibility());
    }

    public FormHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(getVisibility());
    }

    @TargetApi(21)
    public FormHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setVisibility(getVisibility());
    }

    public final void m30620a(h hVar, LayoutInflater layoutInflater, C6527m c6527m, C6504m c6504m, List list) {
        if (!TextUtils.isEmpty(hVar.d)) {
            TextView textView = (TextView) findViewById(C6622f.header_title);
            textView.setText(hVar.d);
            textView.setVisibility(0);
        }
        TypedArray obtainStyledAttributes = layoutInflater.getContext().obtainStyledAttributes(new int[]{C6617a.internalUicInfoMessageLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, C6623g.view_info_message_text);
        obtainStyledAttributes.recycle();
        boolean isEnabled = isEnabled();
        for (ae aeVar : hVar.e) {
            InfoMessageView infoMessageView = (InfoMessageView) layoutInflater.inflate(resourceId, this, false);
            if (this.f33377c == null) {
                this.f33377c = bb.m30739c();
            }
            infoMessageView.setId(this.f33377c.m30742a());
            infoMessageView.setInfoMessage(aeVar);
            infoMessageView.setUrlClickListener(c6527m);
            addView(infoMessageView);
            infoMessageView.setParentUiNode(c6504m);
            list.add(infoMessageView);
            infoMessageView.setEnabled(isEnabled);
        }
        this.f33376b = hVar;
        setVisibility(this.f33375a);
    }

    public void setVisibility(int i) {
        this.f33375a = i;
        if (this.f33376b == null || (TextUtils.isEmpty(this.f33376b.d) && this.f33376b.e.length == 0)) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedState", super.onSaveInstanceState());
        if (this.f33377c != null) {
            this.f33377c.m30743a(bundle);
        }
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superSavedState"));
            this.f33377c = bb.m30738b(bundle);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final boolean cQ_() {
        return true;
    }

    public final boolean mo5581e() {
        return true;
    }

    public CharSequence getError() {
        return null;
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
    }

    public final void cT_() {
        if (hasFocus() || !requestFocus()) {
            ci.m30882c((View) this);
        }
    }

    public at getParentFormElement() {
        return this.f33378d;
    }

    public void setParentFormElement(at atVar) {
        this.f33378d = atVar;
    }

    public final String mo5522a(String str) {
        return "";
    }
}
