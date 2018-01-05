package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.a.q;
import com.google.a.a.a.a.b.a.b.a.ap;
import com.google.a.a.a.a.b.a.b.a.aq;
import com.google.android.wallet.clientlog.C6540d;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p366b.C6508h;
import com.google.android.wallet.p366b.C6510b;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;

public class InlineSelectView extends LinearLayout implements OnClickListener, C6510b, aa {
    public be f33412a;
    public bd f33413b = new bd(this);
    public C6540d f33414c = new C6540d(this);
    public boolean f33415d = true;
    public int f33416e = -1;
    public Toast f33417f;
    public at f33418g;
    public ap f33419h;
    public C6508h f33420i;
    public C6511g f33421j;

    public InlineSelectView(Context context) {
        super(context);
    }

    public InlineSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InlineSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public InlineSelectView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33414c.m29713a();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putInt("selectedItemIndex", this.f33416e);
        bundle.putBundle("impressionLoggerState", this.f33414c.m29715b());
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        m30646a(bundle.getInt("selectedItemIndex", -1), false);
        this.f33414c.m29714a(bundle.getBundle("impressionLoggerState"));
    }

    public int getSelectedItemIndex() {
        return this.f33416e;
    }

    public final void m30646a(int i, boolean z) {
        m30644b(this.f33416e, false);
        this.f33416e = i;
        m30644b(this.f33416e, true);
        if (this.f33412a != null) {
            this.f33412a.mo5656a(this.f33416e, z);
        }
    }

    private final void m30644b(int i, boolean z) {
        if (i >= 0 && i < getChildCount()) {
            View findViewById = getChildAt(i).findViewById(C6622f.selection_indicator);
            if (findViewById != null) {
                findViewById.setVisibility(z ? 0 : 4);
            }
        }
    }

    public void setRequired(boolean z) {
        this.f33415d = z;
    }

    public final void m30647a(ap apVar, long j, String str, LogContext logContext, q qVar) {
        this.f33419h = apVar;
        removeAllViews();
        if (this.f33419h != null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            for (aq aqVar : this.f33419h.a) {
                View inflate = from.inflate(C6623g.view_row_inline_select_field, this, false);
                inflate.setContentDescription(aqVar.b);
                ((TextView) inflate.findViewById(C6622f.description)).setText(aqVar.b);
                if (aqVar.g != null) {
                    ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) inflate.findViewById(C6622f.icon);
                    imageWithCaptionView.setVisibility(0);
                    imageWithCaptionView.setLazyLoad(true);
                    imageWithCaptionView.m30638a(aqVar.g, qVar, ((Boolean) C6489e.f32495a.a()).booleanValue(), logContext);
                }
                addView(inflate);
                ai.a(inflate, this.f33413b);
            }
            m30646a(cp.m30900a(this.f33419h), false);
        }
        this.f33414c.f32633c = j;
        this.f33414c.f32635e = str;
        this.f33414c.f32632b = logContext;
    }

    public void addView(View view) {
        int childCount = getChildCount();
        super.addView(view);
        view.setTag(Integer.valueOf(childCount));
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        m30646a(((Integer) view.getTag()).intValue(), true);
    }

    public void setOnItemSelectedListener(be beVar) {
        this.f33412a = beVar;
    }

    public final boolean cQ_() {
        boolean e = mo5581e();
        if (e) {
            m30643a(null);
        } else {
            m30643a(getContext().getString(C6625i.wallet_uic_error_field_selection_required));
        }
        return e;
    }

    public final boolean mo5581e() {
        return !this.f33415d || this.f33416e >= 0;
    }

    private final void m30643a(CharSequence charSequence) {
        if (this.f33417f != null) {
            this.f33417f.cancel();
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f33417f = null;
            return;
        }
        this.f33417f = Toast.makeText(getContext(), charSequence, 0);
        this.f33417f.show();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ci.m30886d(getChildAt(i), z);
        }
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
        throw new IllegalArgumentException("Errors not supported on InlineSelectView.");
    }

    public CharSequence getError() {
        return null;
    }

    public final void cT_() {
        if (hasFocus() || !requestFocus()) {
            ci.m30882c((View) this);
        }
    }

    public at getParentFormElement() {
        return this.f33418g;
    }

    public void setParentFormElement(at atVar) {
        this.f33418g = atVar;
    }

    public final String mo5522a(String str) {
        int selectedItemIndex = getSelectedItemIndex();
        return (this.f33419h == null || selectedItemIndex < 0) ? "" : this.f33419h.a[selectedItemIndex].b;
    }

    public void setDelegateForDependencyGraph(Object obj) {
        if (obj instanceof C6508h) {
            this.f33420i = (C6508h) obj;
        }
        if (obj instanceof C6511g) {
            this.f33421j = (C6511g) obj;
        }
    }

    public C6508h getTriggerComponentDelegate() {
        return this.f33420i;
    }

    public C6511g getResultingActionComponentDelegate() {
        return this.f33421j;
    }
}
