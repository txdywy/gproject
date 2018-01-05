package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.support.v4.widget.k;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;

public abstract class C6753f extends RelativeLayout implements OnClickListener, OnFocusChangeListener, OnGlobalLayoutListener, Checkable, OnCheckedChangeListener, aa {
    public at f33309a;
    public CheckBox f33310b;
    public SwitchCompat f33311c;
    public InfoMessageView f33312d;
    public InfoMessageView f33313e;
    public CompoundButton f33314f;
    public ColorStateList f33315g;
    public boolean f33316h;
    public boolean f33317i = true;
    public boolean f33318j;

    public C6753f(Context context) {
        super(context);
        m30580a(context, null, 0, 0);
    }

    protected abstract boolean mo5638a();

    protected abstract ae getRequiredErrorInfoMessage();

    public C6753f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30580a(context, attributeSet, 0, 0);
    }

    @TargetApi(11)
    public C6753f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30580a(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public C6753f(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m30580a(context, attributeSet, i, i2);
    }

    private final void m30580a(Context context, AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(context).inflate(C6623g.view_base_checkbox_layout, this, true);
        this.f33310b = (CheckBox) findViewById(C6622f.checkbox_toggle);
        this.f33311c = (SwitchCompat) findViewById(C6622f.switch_toggle);
        this.f33312d = (InfoMessageView) findViewById(C6622f.message_text);
        this.f33312d.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f33313e = (InfoMessageView) findViewById(C6622f.error_text);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{C6617a.uicFormErrorColor}, i, i2);
        this.f33315g = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
    }

    public void setUrlClickListener(C6527m c6527m) {
        this.f33312d.setUrlClickListener(c6527m);
    }

    public void setCheckBoxWidth(int i) {
        if (this.f33314f == this.f33310b) {
            this.f33310b.getLayoutParams().width = i;
        }
    }

    protected void setInfoMessage(ae aeVar) {
        this.f33312d.setInfoMessage(aeVar);
    }

    final void m30584a(CompoundButton compoundButton) {
        if (this.f33314f != null) {
            throw new IllegalStateException("Only one toggle view can be active.");
        }
        this.f33314f = compoundButton;
        this.f33314f.setOnCheckedChangeListener(this);
        this.f33314f.setOnFocusChangeListener(this);
        m30581a(false, null);
        this.f33314f.setEnabled(isEnabled());
        this.f33314f.setVisibility(0);
        this.f33312d.setOnClickListener(this);
        if (VERSION.SDK_INT < 16) {
            ai.a(this.f33314f, new C6788g(this));
        }
    }

    private final void m30581a(boolean z, ae aeVar) {
        this.f33316h = z;
        if (this.f33314f == this.f33310b) {
            k.a(this.f33310b, this.f33316h ? this.f33315g : ci.m30874b(getContext()));
        }
        if (aeVar != null) {
            this.f33313e.setInfoMessage(aeVar);
            this.f33313e.setVisibility(0);
            return;
        }
        this.f33313e.setInfoMessage(null);
        this.f33313e.setVisibility(8);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m30581a(false, null);
    }

    public void onClick(View view) {
        this.f33314f.toggle();
    }

    public void onFocusChange(View view, boolean z) {
        if (z && getError() != null) {
            m30582f();
        }
    }

    public void onGlobalLayout() {
        boolean z = this.f33312d.getLineCount() > 2;
        if (this.f33317i != z) {
            LayoutParams layoutParams = (LayoutParams) this.f33310b.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f33311c.getLayoutParams();
            if (z) {
                layoutParams.addRule(6, 0);
                layoutParams2.addRule(6, 0);
                layoutParams.addRule(8, 0);
                layoutParams2.addRule(8, 0);
                layoutParams.addRule(4, C6622f.message_text);
                layoutParams2.addRule(4, C6622f.message_text);
            } else {
                layoutParams.addRule(4, 0);
                layoutParams2.addRule(4, 0);
                layoutParams.addRule(6, C6622f.message_text);
                layoutParams2.addRule(6, C6622f.message_text);
                layoutParams.addRule(8, C6622f.message_text);
                layoutParams2.addRule(8, C6622f.message_text);
            }
            this.f33310b.setLayoutParams(layoutParams);
            this.f33311c.setLayoutParams(layoutParams2);
            this.f33317i = z;
        }
    }

    public boolean isChecked() {
        if (this.f33314f == null) {
            return false;
        }
        return this.f33314f.isChecked();
    }

    public void setChecked(boolean z) {
        if (this.f33314f != null) {
            this.f33314f.setChecked(z);
        }
    }

    public void toggle() {
        if (this.f33314f != null) {
            this.f33314f.toggle();
        }
    }

    public final void cT_() {
        if (hasFocus() || !requestFocus()) {
            ci.m30882c((View) this);
            m30582f();
        }
    }

    private final void m30582f() {
        ci.m30861a((View) this, m30587c());
    }

    final String m30587c() {
        return getResources().getString(C6625i.wallet_uic_accessibility_event_form_field_error, new Object[]{this.f33312d.getText(), getError()});
    }

    public CharSequence getError() {
        if (this.f33313e.getVisibility() == 0) {
            return this.f33313e.getText();
        }
        return null;
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            m30581a(false, null);
            return;
        }
        ae aeVar = new ae();
        aeVar.e = charSequence.toString();
        aeVar.h = 4;
        m30581a(true, aeVar);
    }

    public final boolean cQ_() {
        boolean e = mo5581e();
        if (!e) {
            m30581a(true, getRequiredErrorInfoMessage());
        }
        return e;
    }

    public final boolean mo5581e() {
        return !mo5638a() || isChecked();
    }

    public at getParentFormElement() {
        return this.f33309a;
    }

    public void setParentFormElement(at atVar) {
        this.f33309a = atVar;
    }

    public final String mo5522a(String str) {
        return "";
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f33312d.setEnabled(z);
        if (this.f33314f != null) {
            this.f33314f.setEnabled(z);
        }
        this.f33313e.setEnabled(z);
    }

    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        super.dispatchFreezeSelfOnly(sparseArray);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        super.dispatchThawSelfOnly(sparseArray);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        if (this.f33314f != null) {
            bundle.putBoolean("isChecked", isChecked());
            bundle.putBoolean("isError", this.f33316h);
            bundle.putParcelable("errorInfoMessage", ParcelableProto.m29885a(this.f33313e.getInfoMessage()));
        }
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            if (this.f33314f != null) {
                this.f33318j = true;
                setChecked(bundle.getBoolean("isChecked"));
                this.f33318j = false;
            }
            m30581a(bundle.getBoolean("isError"), (ae) ParcelableProto.m29887a(bundle, "errorInfoMessage"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
