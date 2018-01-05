package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v4.view.bx;
import android.support.v7.widget.ag;
import android.support.v7.widget.cj;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6626j;
import com.google.android.wallet.ui.address.C6730x;

public class MaterialFieldLayout extends LinearLayout implements OnFocusChangeListener, OnItemSelectedListener, C6757s, C6755v, C6756y {
    public final int f33428a;
    public final int f33429b;
    public final int f33430c;
    public final int f33431d;
    public final int f33432e;
    public final Rect f33433f;
    public View f33434g;
    public TextView f33435h;
    public boolean f33436i;
    public View f33437j;
    public TextView f33438k;
    public int f33439l;
    public TextView f33440m;
    public int f33441n;
    public int f33442o;
    public CharSequence f33443p;
    public CharSequence f33444q;
    public CharSequence f33445r;
    public Interpolator f33446s;
    public int f33447t;

    public MaterialFieldLayout(Context context) {
        this(context, null);
    }

    public MaterialFieldLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @TargetApi(21)
    public MaterialFieldLayout(Context context, AttributeSet attributeSet, int i) {
        float f;
        super(context, attributeSet, i);
        this.f33433f = new Rect();
        this.f33439l = 0;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6626j.WalletUicMaterialFieldLayout);
        this.f33428a = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicMaterialFieldLayout_internalUicFieldLabelPaddingStart, m30663e());
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicMaterialFieldLayout_internalUicFieldLabelPaddingTop, m30663e());
        this.f33429b = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicMaterialFieldLayout_internalUicFieldLabelPaddingEnd, m30663e());
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicMaterialFieldLayout_internalUicFieldLabelPaddingBottom, m30663e());
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicMaterialFieldLayout_internalUicFieldLabelMinHeight, -1);
        this.f33443p = obtainStyledAttributes.getText(C6626j.WalletUicMaterialFieldLayout_internalUicFieldLabel);
        this.f33435h = new TextView(context);
        this.f33435h.setVisibility(8);
        ai.a(this.f33435h, this.f33428a, dimensionPixelSize, this.f33429b, dimensionPixelSize2);
        this.f33435h.setText(this.f33443p);
        if (dimensionPixelSize3 != -1) {
            this.f33435h.setMinHeight(dimensionPixelSize3);
        }
        View view = this.f33435h;
        if (ai.a.k(this.f33435h) == 0) {
            f = (float) this.f33428a;
        } else {
            f = (float) (this.f33435h.getWidth() - this.f33428a);
        }
        ai.e(view, f);
        ai.f(this.f33435h, (float) dimensionPixelSize);
        this.f33430c = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicMaterialFieldLayout_internalUicFieldMarginTop, 0);
        this.f33431d = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicMaterialFieldLayout_internalUicFieldMarginBottom, 0);
        this.f33435h.setTextAppearance(context, obtainStyledAttributes.getResourceId(C6626j.WalletUicMaterialFieldLayout_internalUicFieldLabelTextAppearance, 16973894));
        this.f33435h.setTextColor(ci.m30874b(context));
        this.f33441n = obtainStyledAttributes.getResourceId(C6626j.WalletUicMaterialFieldLayout_internalUicFieldErrorTextAppearance, 16973894);
        this.f33442o = obtainStyledAttributes.getResourceId(C6626j.f32796x3079532d, 16973894);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C6617a.internalUicMaterialFieldHiddenLabelViewVisibility});
        this.f33447t = obtainStyledAttributes.getInt(0, 4) == 8 ? 8 : 4;
        obtainStyledAttributes.recycle();
        this.f33432e = getPaddingBottom();
        setErrorEnabled(false);
        m30667a(this.f33435h, -1, new LayoutParams(-2, -2), true);
        if (VERSION.SDK_INT >= 21) {
            dimensionPixelSize2 = 17563661;
        } else {
            dimensionPixelSize2 = 17432582;
        }
        this.f33446s = AnimationUtils.loadInterpolator(context, dimensionPixelSize2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        m30667a(view, i, layoutParams, false);
    }

    public final void m30667a(View view, int i, LayoutParams layoutParams, boolean z) {
        super.addView(view, i, layoutParams);
        if (!z) {
            if (this.f33434g != null) {
                throw new IllegalArgumentException("Field view already exists, can only have one");
            }
            View c;
            if (view instanceof C6756y) {
                c = cp.m30912c(view);
            } else {
                c = view;
            }
            if (ci.m30895h(c)) {
                m30655a((TextView) c);
                m30658b(view);
            } else if (c instanceof Spinner) {
                Spinner spinner = (Spinner) c;
                this.f33434g = spinner;
                this.f33435h.setVisibility(0);
                if (TextUtils.isEmpty(this.f33443p)) {
                    setLabel(spinner.getPrompt());
                }
                if (spinner instanceof FormSpinner) {
                    FormSpinner formSpinner = (FormSpinner) spinner;
                    setError(formSpinner.getError());
                    formSpinner.setErrorHandler(this);
                    formSpinner.setOnItemSelectedListener(this);
                    if (this.f33443p != null) {
                        formSpinner.setLabel(this.f33443p.toString());
                    }
                }
                m30659c();
                m30658b(view);
            } else if (c instanceof CheckboxView) {
                this.f33434g = (CheckboxView) c;
                this.f33435h.setVisibility(8);
            } else if (c instanceof bt) {
                m30655a(((bt) c).getPhoneNumberView());
                m30658b(view);
                this.f33434g = c;
            } else {
                if (ci.m30894g(c)) {
                    this.f33434g = c;
                    this.f33435h.setVisibility(0);
                    m30668a(false, this.f33434g);
                }
                c.setFocusable(true);
            }
            m30660c(view);
        }
    }

    private final void m30658b(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = this.f33430c;
        layoutParams.bottomMargin = this.f33431d;
    }

    private final void m30660c(View view) {
        View view2 = view;
        while (!(view2 instanceof FormEditText)) {
            if (view2 instanceof FormSpinner) {
                ((FormSpinner) view2).setVisibilityMatchingView(this);
                return;
            } else if (view2 instanceof SelectFieldView) {
                ((SelectFieldView) view2).setVisibilityMatchingView(this);
                return;
            } else if (view2 instanceof bt) {
                ((bt) view2).setVisibilityMatchingView(this);
                return;
            } else if (view2 instanceof C6756y) {
                view2 = ((C6756y) view2).getInnerFieldView();
            } else {
                return;
            }
        }
        ((FormEditText) view2).setVisibilityMatchingView(this);
    }

    private final void m30655a(TextView textView) {
        this.f33434g = textView;
        this.f33435h.setVisibility(0);
        if (TextUtils.isEmpty(this.f33443p)) {
            setLabel(textView.getHint());
        }
        textView.setContentDescription(this.f33443p);
        if (textView instanceof FormEditText) {
            FormEditText formEditText = (FormEditText) textView;
            setError(formEditText.getError());
            setDescription(formEditText.getFieldDescription());
            formEditText.setErrorHandler(this);
            formEditText.setDescriptionHandler(this);
            formEditText.setOnFocusChangeListener(this);
            formEditText.setShowTemplateWhenEmptyAndFocused(true);
        }
        m30668a(false, (View) textView);
        textView.addTextChangedListener(new bi(this, textView));
    }

    private final void m30656a(boolean z) {
        if (ci.m30895h(this.f33434g) || ci.m30894g(this.f33434g)) {
            m30668a(z, this.f33434g);
        } else if (this.f33434g instanceof Spinner) {
            m30659c();
        } else if (this.f33434g instanceof bt) {
            m30668a(z, ((bt) this.f33434g).getPhoneNumberView());
        }
    }

    private final void m30659c() {
        int i;
        TextView textView = this.f33435h;
        Spinner spinner = (Spinner) this.f33434g;
        if ((spinner instanceof FormSpinner) && (spinner.getAdapter() instanceof C6730x) && spinner.getSelectedItemPosition() == 0 && this.f33443p.equals(spinner.getItemAtPosition(0).toString())) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            i = 4;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        m30665g();
    }

    final void m30668a(boolean z, View view) {
        int i = 1;
        boolean isFocused = view.isFocused();
        int i2;
        if (view instanceof InfoMessageView) {
            i2 = !TextUtils.isEmpty(((InfoMessageView) view).getText()) ? 1 : 0;
        } else {
            if (TextUtils.isEmpty(((TextView) view).getText()) && TextUtils.isEmpty(getError())) {
                i = 0;
            }
            i2 = i;
        }
        this.f33435h.setActivated(isFocused);
        float textSize;
        TextView textView;
        if (!TextUtils.isEmpty(this.f33443p) && (r0 != 0 || isFocused)) {
            CharSequence charSequence;
            if (view instanceof InfoMessageView) {
                textSize = ((InfoMessageView) view).getTextSize();
                charSequence = null;
            } else {
                textView = (TextView) view;
                textSize = textView.getTextSize();
                charSequence = textView.getHint();
            }
            if (this.f33435h.getVisibility() != 0) {
                this.f33435h.setVisibility(0);
                if (z && ci.m30887d(getContext())) {
                    m30653a(textSize / this.f33435h.getTextSize());
                    ai.h(this.f33435h).b(0.0f).d(1.0f).c(1.0f).a(150).a(null).a(this.f33446s).b();
                } else {
                    m30664f();
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                view.setMinimumWidth(view.getWidth());
                ((TextView) view).setHint(null);
            }
        } else if (this.f33435h.getVisibility() == 0) {
            textView = view instanceof TextView ? (TextView) view : null;
            if (view instanceof InfoMessageView) {
                view = (InfoMessageView) view;
            } else {
                view = null;
            }
            textSize = (textView != null ? textView.getTextSize() : view.getTextSize()) / this.f33435h.getTextSize();
            if (z && ci.m30887d(getContext()) && this.f33435h.getVisibility() != this.f33447t) {
                m30664f();
                ai.h(this.f33435h).b((float) m30661d()).a(150).c(textSize).d(textSize).a(new bj(this, textView)).a(this.f33446s).b();
            } else {
                m30653a(textSize);
                this.f33435h.setVisibility(this.f33447t);
                if (textView != null) {
                    textView.setHint(this.f33443p);
                    textView.setMinimumWidth(0);
                }
            }
        }
        m30665g();
    }

    public View getInnerFieldView() {
        return this.f33434g;
    }

    public CharSequence getLabel() {
        return this.f33443p;
    }

    public void setLabel(CharSequence charSequence) {
        this.f33443p = charSequence;
        this.f33435h.setText(charSequence);
        if (ci.m30895h(this.f33434g)) {
            this.f33434g.setContentDescription(charSequence);
        }
        m30656a(false);
    }

    private final int m30661d() {
        return (ci.m30841a(this.f33434g, (View) this) + this.f33434g.getPaddingTop()) - (this.f33435h.getTop() + this.f33435h.getPaddingTop());
    }

    private final int m30663e() {
        return (int) TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
    }

    public void onFocusChange(View view, boolean z) {
        m30656a(true);
        if (z) {
            if (view instanceof TextView) {
                ci.m30871a((TextView) view, true);
            }
            if (VERSION.SDK_INT < 21) {
                ci.m30861a(view, this.f33443p);
            }
        }
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        m30656a(true);
    }

    public void onNothingSelected(AdapterView adapterView) {
        m30656a(true);
    }

    public void setError(CharSequence charSequence) {
        this.f33444q = charSequence;
        if (this.f33436i) {
            if (!TextUtils.isEmpty(charSequence)) {
                this.f33438k.setText(charSequence);
            }
            m30669b();
        } else if (!TextUtils.isEmpty(charSequence)) {
            setErrorEnabled(true);
        } else {
            return;
        }
        m30656a(true);
        sendAccessibilityEvent(eq.FLAG_MOVED);
    }

    public void setErrorEnabled(boolean z) {
        if (this.f33436i != z) {
            this.f33436i = z;
            if (this.f33438k != null) {
                ai.h(this.f33438k).a();
            } else if (this.f33436i) {
                LayoutParams layoutParams = new LinearLayout.LayoutParams(getLayoutParams());
                layoutParams.width = -1;
                layoutParams.weight = 0.0f;
                this.f33438k = new TextView(getContext());
                m30666a();
                m30667a(this.f33438k, -1, layoutParams, true);
            }
            m30669b();
            m30665g();
        }
    }

    public CharSequence getError() {
        return this.f33436i ? this.f33444q : null;
    }

    public final void m30666a() {
        this.f33438k.setTextAppearance(getContext(), this.f33441n);
        this.f33438k.setText(this.f33444q);
        if (this.f33439l > 0) {
            this.f33438k.setWidth(this.f33439l);
        }
        m30662d(this.f33438k);
    }

    protected void onMeasure(int i, int i2) {
        CharSequence hint;
        if (this.f33434g instanceof TextView) {
            hint = ((TextView) getInnerFieldView()).getHint();
            ((TextView) this.f33434g).setHint(this.f33443p);
        } else {
            hint = null;
        }
        super.onMeasure(i, i2);
        if (this.f33434g instanceof TextView) {
            ((TextView) this.f33434g).setHint(hint);
        }
        this.f33439l = getMeasuredWidth();
        if (this.f33438k != null) {
            this.f33438k.setWidth(this.f33439l);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != this.f33433f.right || i6 != this.f33433f.bottom) {
            this.f33433f.right = i5;
            this.f33433f.bottom = i6;
            if (this.f33434g != null) {
                setTouchDelegate(new TouchDelegate(this.f33433f, this.f33434g));
            }
        }
    }

    public void setDescription(CharSequence charSequence) {
        this.f33445r = charSequence;
        if (!TextUtils.isEmpty(charSequence) && this.f33440m == null) {
            this.f33440m = new TextView(getContext());
            this.f33440m.setTextAppearance(getContext(), this.f33442o);
            m30662d(this.f33440m);
            m30667a(this.f33440m, -1, new LayoutParams(getLayoutParams()), true);
        }
        if (this.f33440m != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                this.f33440m.setText(charSequence);
            }
            m30669b();
        }
    }

    public CharSequence getDescription() {
        return this.f33445r;
    }

    private final void m30662d(View view) {
        view.setVisibility(8);
        ai.b(view, 2);
        ai.a(view, this.f33428a, 0, this.f33429b, 0);
    }

    final void m30669b() {
        int i = 1;
        int i2 = (!this.f33436i || TextUtils.isEmpty(this.f33444q)) ? 0 : 1;
        int i3;
        if (TextUtils.isEmpty(this.f33445r)) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        int i4;
        if (this.f33438k == null || this.f33438k.getVisibility() != 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (this.f33440m == null || this.f33440m.getVisibility() != 0) {
            i = 0;
        }
        if (i2 == 0 && r4 != 0) {
            m30654a(this.f33438k, 8);
        } else if ((i2 != 0 || r3 == 0) && r1 != 0) {
            m30654a(this.f33440m, 8);
        } else if (i2 != 0 && r4 == 0) {
            m30654a(this.f33438k, 0);
        } else if (i2 == 0 && r3 != 0 && r1 == 0) {
            m30654a(this.f33440m, 0);
        }
    }

    private final void m30654a(View view, int i) {
        int i2 = 0;
        int i3 = i == 0 ? 1 : 0;
        bx bkVar = new bk(this, i);
        ai.h(view).a(null).a();
        if (i3 != 0) {
            ai.b(view, 0.0f);
            view.setVisibility(0);
            view.measure(-1, -2);
            if (this.f33432e > view.getMeasuredHeight()) {
                i2 = this.f33432e - view.getMeasuredHeight();
            }
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i2);
        }
        ai.h(view).a(i3 != 0 ? 1.0f : 0.0f).a(200).a(bkVar).b();
    }

    private final void m30664f() {
        ai.c(this.f33435h, 1.0f);
        ai.d(this.f33435h, 1.0f);
        ai.a(this.f33435h, 0.0f);
    }

    private final void m30653a(float f) {
        ai.a(this.f33435h, (float) m30661d());
        ai.c(this.f33435h, f);
        ai.d(this.f33435h, f);
    }

    private final void m30665g() {
        if (VERSION.SDK_INT >= 23) {
            Drawable background = this.f33434g.getBackground();
            if (background != null) {
                if (cj.c(background)) {
                    background.mutate();
                }
                if (TextUtils.isEmpty(this.f33444q) || this.f33438k == null) {
                    background.clearColorFilter();
                    this.f33434g.refreshDrawableState();
                } else {
                    background.setColorFilter(ag.a(this.f33438k.getCurrentTextColor(), Mode.SRC_IN));
                }
            }
            if (TextUtils.isEmpty(this.f33444q) || this.f33438k == null || !hasFocus()) {
                this.f33435h.setTextColor(ci.m30874b(getContext()));
            } else {
                this.f33435h.setTextColor(this.f33438k.getCurrentTextColor());
            }
        }
    }

    public static boolean m30657a(View view) {
        return ci.m30895h(view) || ci.m30894g(view) || (view instanceof Spinner) || (view instanceof CheckboxView) || (view instanceof bt) || (view instanceof bh) || (((view instanceof ce) && m30657a(((ce) view).getInnerFieldView())) || (((view instanceof SelectFieldView) && m30657a(((SelectFieldView) view).getInnerFieldView())) || ((view instanceof bc) && m30657a(((bc) view).getInnerFieldView()))));
    }
}
