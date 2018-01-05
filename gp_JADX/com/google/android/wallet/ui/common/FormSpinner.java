package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.C6540d;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p366b.C6508h;
import com.google.android.wallet.p366b.C6510b;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6625i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FormSpinner extends AppCompatSpinner implements OnItemSelectedListener, C6510b, aa {
    public at f33379A;
    public C6508h f33380B;
    public C6511g f33381C;
    public CharSequence f33382D = null;
    public boolean f33383E;
    public int f33384F = -1;
    public final C6755v f33385j = new aw(this);
    public final ArrayList f33386k = new ArrayList(2);
    public final ArrayList f33387l = new ArrayList(2);
    public long f33388m;
    public String f33389n = "";
    public LogContext f33390o;
    public C6540d f33391p = new C6540d(this, 2);
    public List f33392q = null;
    public List f33393r = null;
    public C6755v f33394s = this.f33385j;
    public View f33395t;
    public boolean f33396u = true;
    public String f33397v;
    public boolean f33398w;
    public boolean f33399x = false;
    public boolean f33400y = false;
    public boolean f33401z = true;

    public FormSpinner(Context context) {
        super(context);
        m30624a(context);
    }

    public FormSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30624a(context);
    }

    public FormSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30624a(context);
    }

    private final void m30624a(Context context) {
        super.setOnItemSelectedListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6617a.internalUicValidateFieldsWhenNotVisible});
        this.f33400y = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public void setUiReference(long j) {
        this.f33388m = j;
        this.f33391p.f32633c = j;
    }

    public void setName(String str) {
        this.f33389n = str;
        this.f33391p.f32635e = str;
    }

    public void setLogContext(LogContext logContext) {
        this.f33390o = logContext;
        this.f33391p.f32632b = logContext;
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener != null && !this.f33386k.contains(onItemSelectedListener)) {
            this.f33386k.add(onItemSelectedListener);
            this.f33392q = null;
        }
    }

    private final List m30623a() {
        if (this.f33392q == null) {
            this.f33392q = Collections.unmodifiableList(new ArrayList(this.f33386k));
        }
        return this.f33392q;
    }

    public final void m30631a(OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener != null && !this.f33387l.contains(onItemSelectedListener)) {
            this.f33387l.add(onItemSelectedListener);
            this.f33393r = null;
        }
    }

    private final List m30625c() {
        if (this.f33393r == null) {
            this.f33393r = Collections.unmodifiableList(new ArrayList(this.f33387l));
        }
        return this.f33393r;
    }

    public void setErrorHandler(C6755v c6755v) {
        this.f33394s = c6755v;
    }

    public C6755v getErrorHandler() {
        return this.f33394s;
    }

    public void setVisibilityMatchingView(View view) {
        this.f33395t = view;
    }

    public void setShouldValidateWhenNotVisible(boolean z) {
        this.f33400y = z;
    }

    public void setRequired(boolean z) {
        this.f33396u = z;
    }

    public void setLabel(String str) {
        this.f33397v = str;
    }

    public final String m30629a(int i) {
        String str = "";
        Object itemAtPosition = getItemAtPosition(i);
        if ((getAdapter() instanceof BaseAdapter) && !((BaseAdapter) getAdapter()).isEnabled(i)) {
            return "";
        }
        if (itemAtPosition instanceof bx) {
            return ((bx) itemAtPosition).mo5618a();
        }
        return itemAtPosition != null ? itemAtPosition.toString() : str;
    }

    public final boolean cQ_() {
        if (getAdapter() == null || getAdapter().isEmpty()) {
            throw new IllegalStateException("Must set non-empty adapter before validating");
        }
        this.f33398w = true;
        if (mo5581e()) {
            mo5578a(null, false);
            return true;
        }
        CharSequence string = getContext().getString(C6625i.wallet_uic_error_field_must_not_be_empty);
        if (!string.equals(getError())) {
            mo5578a(string, false);
            C6537a.m29699b(this.f33390o, 2, this.f33389n, this.f33388m);
        }
        return false;
    }

    public boolean mo5581e() {
        if (!this.f33396u || (!this.f33400y && getVisibility() != 0)) {
            return true;
        }
        SpinnerAdapter adapter = getAdapter();
        if (adapter == null) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return false;
        }
        return adapter instanceof ListAdapter ? ((ListAdapter) adapter).isEnabled(selectedItemPosition) : true;
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
        this.f33394s.setError(charSequence);
        if (z) {
            C6537a.m29703c(this.f33390o, 2, this.f33389n, this.f33388m);
        }
        View selectedView = getSelectedView();
        if (selectedView != null) {
            selectedView.setContentDescription(m30626f());
        }
    }

    public CharSequence getError() {
        return this.f33394s.getError();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33391p.m29713a();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("potentialErrorOnConfigChange", this.f33398w);
        bundle.putInt("selectedItemPosition", getSelectedItemPosition());
        bundle.putCharSequence("errorMessage", this.f33382D);
        bundle.putBundle("impressionLoggerState", this.f33391p.m29715b());
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
            this.f33398w = bundle.getBoolean("potentialErrorOnConfigChange");
            int i = bundle.getInt("selectedItemPosition");
            if (getSelectedItemPosition() != i) {
                setNonUserInputSelection(i);
            }
            this.f33382D = bundle.getCharSequence("errorMessage");
            this.f33391p.m29714a(bundle.getBundle("impressionLoggerState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!(this.f33399x || getAdapter() == null)) {
            this.f33399x = true;
            if (this.f33398w) {
                cQ_();
            }
        }
        SpinnerAdapter adapter = getAdapter();
        if (adapter instanceof cr) {
            ((cr) adapter).f33194c = this.f33397v;
        } else if (adapter instanceof bw) {
            ((bw) adapter).f33591e = this.f33397v;
        }
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int i2;
        if (mo5581e()) {
            cQ_();
        }
        List a = m30623a();
        int size = a.size();
        for (i2 = 0; i2 < size; i2++) {
            ((OnItemSelectedListener) a.get(i2)).onItemSelected(adapterView, view, i, j);
        }
        if (!(this.f33383E || this.f33384F == i)) {
            a = m30625c();
            size = a.size();
            for (i2 = 0; i2 < size; i2++) {
                ((OnItemSelectedListener) a.get(i2)).onItemSelected(adapterView, view, i, j);
            }
        }
        this.f33383E = false;
        this.f33384F = i;
        if (view != null) {
            view.setContentDescription(m30626f());
        }
    }

    private final String m30626f() {
        CharSequence a = ci.m30848a(this.f33397v);
        Object selectedItem = getSelectedItem();
        String obj = selectedItem != null ? selectedItem.toString() : "";
        CharSequence a2 = ci.m30848a(getError());
        return getResources().getString(C6625i.wallet_uic_accessibility_event_form_field_description, new Object[]{a, obj, "", a2}).trim();
    }

    public void onNothingSelected(AdapterView adapterView) {
        int i;
        if (mo5581e()) {
            cQ_();
        }
        List a = m30623a();
        int size = a.size();
        for (i = 0; i < size; i++) {
            ((OnItemSelectedListener) a.get(i)).onNothingSelected(adapterView);
        }
        if (!(this.f33383E || this.f33384F == -1)) {
            a = m30625c();
            size = a.size();
            for (i = 0; i < size; i++) {
                ((OnItemSelectedListener) a.get(i)).onNothingSelected(adapterView);
            }
        }
        this.f33383E = false;
        this.f33384F = -1;
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z && getError() != null) {
            m30627g();
        }
        super.onFocusChanged(z, i, rect);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f33395t != null) {
            this.f33395t.setVisibility(i);
        }
    }

    public void setNonUserInputSelection(int i) {
        this.f33401z = true;
        this.f33383E = true;
        setSelection(i);
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f33401z && accessibilityEvent.getEventType() == 4) {
            this.f33401z = false;
        } else {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    private final void m30627g() {
        ci.m30861a((View) this, m30628h());
    }

    public final void cT_() {
        if (hasFocus() || !requestFocus()) {
            ci.m30882c((View) this);
            m30627g();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (VERSION.SDK_INT < 16 && accessibilityEvent.getEventType() == 8 && getError() != null) {
            accessibilityEvent.getText().add(m30628h());
        }
        return true;
    }

    private final String m30628h() {
        return getResources().getString(C6625i.wallet_uic_accessibility_event_form_field_error, new Object[]{this.f33397v, getError()});
    }

    public at getParentFormElement() {
        return this.f33379A;
    }

    public void setParentFormElement(at atVar) {
        this.f33379A = atVar;
    }

    public String mo5522a(String str) {
        Object selectedItem = getSelectedItem();
        return (!mo5581e() || selectedItem == null) ? "" : selectedItem.toString();
    }

    public void setDelegateForDependencyGraph(Object obj) {
        if (obj instanceof C6508h) {
            this.f33380B = (C6508h) obj;
        }
        if (obj instanceof C6511g) {
            this.f33381C = (C6511g) obj;
        }
    }

    public C6508h getTriggerComponentDelegate() {
        return this.f33380B;
    }

    public C6511g getResultingActionComponentDelegate() {
        return this.f33381C;
    }
}
