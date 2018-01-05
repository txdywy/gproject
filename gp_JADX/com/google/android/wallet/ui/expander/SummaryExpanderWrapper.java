package com.google.android.wallet.ui.expander;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.b.a.a;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.a.a.a.a.b.a.b.a.af;
import com.google.a.a.a.a.b.a.b.a.aj;
import com.google.a.a.a.a.b.a.b.a.c;
import com.google.a.a.a.a.b.a.b.a.e;
import com.google.a.a.a.a.b.a.b.a.f;
import com.google.android.wallet.common.util.C6596h;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.p383e.C6620d;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.p383e.C6626j;
import com.google.android.wallet.ui.address.C6712a;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.SummaryTextLayout;
import com.google.android.wallet.ui.common.at;
import com.google.android.wallet.ui.common.bl;
import com.google.android.wallet.ui.common.ca;
import com.google.android.wallet.ui.common.cc;
import com.google.android.wallet.ui.common.cf;
import com.google.android.wallet.ui.common.ci;
import java.util.ArrayList;
import java.util.List;

public class SummaryExpanderWrapper extends RelativeLayout implements OnClickListener, OnGlobalFocusChangeListener, at, ca, C6808a, C6809b, C6810f, C6521h {
    public final C6811c f33750a = new C6811c();
    public cc f33751b;
    public SummaryTextLayout f33752c;
    public ImageView f33753d;
    public ViewGroup f33754e;
    public View f33755f;
    public int f33756g = 1;
    public int f33757h = 2;
    public int f33758i = -1;
    public int f33759j = -1;
    public int f33760k = -1;
    public String f33761l;
    public af f33762m;
    public at f33763n;
    public int f33764o = 0;

    public SummaryExpanderWrapper(Context context) {
        super(context);
        m30958a(context, null);
    }

    public SummaryExpanderWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30958a(context, attributeSet);
    }

    public SummaryExpanderWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30958a(context, attributeSet);
    }

    @TargetApi(21)
    public SummaryExpanderWrapper(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m30958a(context, attributeSet);
    }

    public void setComponentGroup(c cVar) {
        if (cVar.a == 1) {
            f fVar;
            if (cVar.a == 1) {
                fVar = cVar.e;
            } else {
                fVar = null;
            }
            this.f33764o = fVar.a;
            this.f33752c.setUseLighterStyle(m30962m());
        }
        setTooltip(cVar.i);
        setViewMode(cVar.m);
        m30965a(cVar.n, cVar.g);
    }

    public final void m30965a(e eVar, String str) {
        this.f33761l = null;
        this.f33762m = null;
        if (eVar != null) {
            if (eVar.a != null) {
                this.f33762m = eVar.a;
            } else if (eVar.b) {
                this.f33761l = str;
            }
        }
        if (this.f33751b != null) {
            this.f33751b.setTitle(str);
        }
        m30961l();
    }

    public void setViewMode(int i) {
        this.f33757h = i;
        if (this.f33757h == 0) {
            this.f33757h = 2;
        }
        switch (this.f33757h) {
            case 1:
                setEditMode(3);
                break;
            case 4:
                setEditMode(2);
                break;
            default:
                setEditMode(1);
                break;
        }
        if (this.f33752c != null) {
            switch (this.f33757h) {
                case 1:
                case 3:
                case 5:
                    this.f33752c.setMultiLine(true);
                    break;
                default:
                    this.f33752c.setMultiLine(false);
                    break;
            }
        }
        m30961l();
    }

    public int getViewMode() {
        return this.f33757h;
    }

    public void setEditMode(int i) {
        this.f33756g = i;
        m30961l();
    }

    public View getSummaryView() {
        return this.f33752c;
    }

    public void setSummaryView(int i) {
        this.f33752c = (SummaryTextLayout) findViewById(i);
        this.f33752c.setSummaryOnClickListener(this);
        this.f33752c.setTag(C6622f.summary_expander_transition_name, "summaryField");
    }

    public void setTitleView(int i) {
        if (i != -1) {
            this.f33751b = (cc) findViewById(i);
            this.f33751b.setSummaryOnClickListener(this);
        }
    }

    public void setTooltipListener(cf cfVar) {
    }

    public void setTooltip(aj ajVar) {
        if (this.f33751b != null) {
            C6600l.m29933a(getContext());
            throw new NoSuchMethodError();
        }
    }

    public void setSummaryImage(int i) {
        this.f33753d = (ImageView) findViewById(i);
        if (this.f33753d != null) {
            Drawable e = a.e(this.f33753d.getDrawable().mutate());
            a.a(e, ci.m30874b(getContext()));
            this.f33753d.setImageDrawable(e);
            m30959j();
        }
    }

    public void setSummaryImageVisible(boolean z) {
        if (this.f33753d != null) {
            this.f33753d.setVisibility(z ? 0 : 4);
        }
    }

    public ImageView getSummaryImage() {
        return this.f33753d;
    }

    public void setContainerView(int i) {
        this.f33754e = (ViewGroup) findViewById(i);
    }

    public ViewGroup getContainerView() {
        return this.f33754e;
    }

    public final void m30966a(C6749z c6749z) {
        getExpandable().m31010a(c6749z);
    }

    public final void m30974i() {
        getExpandable().m31018c();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("expandableInstanceState", this.f33750a.m31004a());
        bundle.putInt("editMode", this.f33756g);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
            this.f33750a.m31008a(bundle.getParcelable("expandableInstanceState"));
            setEditMode(bundle.getInt("editMode", 1));
            m30959j();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && !getExpandable().f33781q && getExpandable().f33767c && !hasFocus()) {
            C6811c expandable = getExpandable();
            if (expandable.f33781q) {
                expandable.m31005a(5);
            } else {
                expandable.m31012a(null, true, 5);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean isImportantForAccessibility() {
        return super.isImportantForAccessibility() && !getExpandable().f33767c;
    }

    public void onClick(View view) {
        m30960k();
    }

    public final void mo5665a() {
        m30960k();
    }

    public final void mo5666b() {
        List list = this.f33750a.f33785u;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) list.get(i)).f33285e;
            if (obj instanceof C6712a) {
                ((C6712a) obj).g.m30444f();
            }
        }
        m30961l();
        m30960k();
    }

    public final void mo5670f() {
        if (this.f33752c != null) {
            if (!this.f33750a.f33767c && hasFocus()) {
                ci.m30889e(getRootView());
                if (ci.m30869a(getContext())) {
                    ci.m30879b(getContext(), (View) this);
                }
            }
            m30961l();
            C6749z.m30555a(this.f33750a.f33785u, this.f33750a.f33767c ? 0 : 8);
            if (this.f33750a.f33767c && this.f33757h == 3) {
                this.f33750a.m31014a(true);
            }
        }
    }

    public final void mo5671g() {
        if (getParent() != null && ai.a.s(this)) {
            if (this.f33750a.f33767c) {
                View view;
                ViewParent parent = getParent();
                if (this.f33755f != null) {
                    view = this.f33755f;
                } else {
                    view = this;
                }
                parent.requestChildFocus(this, view);
                return;
            }
            getParent().requestChildFocus(this, this.f33752c);
        }
    }

    public final void mo5667c() {
        int i = 0;
        List list = this.f33750a.f33785u;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ((C6749z) list.get(i2)).f33285e;
            if (obj instanceof C6712a) {
                ((C6712a) obj).ai();
            }
        }
        ArrayList d = C6749z.m30562d(this.f33750a.f33785u);
        if (!d.isEmpty()) {
            int size2 = d.size();
            while (i < size2) {
                ((View) d.get(i)).setTag(C6622f.summary_expander_transition_name, "expandedField");
                i++;
            }
        }
    }

    public final void mo5669e() {
        m30959j();
    }

    public final void mo5668d() {
        List list = this.f33750a.f33785u;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) list.get(i)).f33285e;
            if (obj instanceof C6712a) {
                C6712a c6712a = (C6712a) obj;
                if (c6712a.f33099a != null) {
                    if (c6712a.getExpandable().f33767c) {
                        c6712a.f33099a.setVisibility(0);
                        int size2 = c6712a.f33102d.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((View) c6712a.f33102d.get(i2)).setTag(C6622f.summary_expander_transition_name, null);
                        }
                    } else {
                        c6712a.f33099a.setVisibility(8);
                    }
                }
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f33752c != null) {
            this.f33752c.setEnabled(z);
        }
        if (this.f33753d != null) {
            this.f33753d.setEnabled(z);
        }
        if (this.f33751b != null) {
            this.f33751b.setEnabled(z);
        }
    }

    public C6811c getExpandable() {
        return this.f33750a;
    }

    public void onGlobalFocusChanged(View view, View view2) {
        m30959j();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this);
        m30959j();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f33755f != null && this.f33753d != null) {
            if (this.f33751b == null || this.f33751b.getVisibility() != 0) {
                int i5;
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f33753d.getLayoutParams();
                if (getExpandable().f33767c) {
                    int i6;
                    View view = this.f33755f;
                    int top = view.getTop();
                    if (view.getParent() instanceof View) {
                        View view2 = (View) view.getParent();
                        i6 = top;
                        while (view2 != this) {
                            top = view2.getTop() + i6;
                            if (!(view2.getParent() instanceof View)) {
                                i6 = top;
                                break;
                            } else {
                                view2 = (View) view2.getParent();
                                i6 = top;
                            }
                        }
                    } else {
                        i6 = top;
                    }
                    i5 = (this.f33760k == -1 || !ci.m30894g(this.f33755f)) ? this.f33759j == -1 ? marginLayoutParams.topMargin : this.f33759j : this.f33760k;
                    i5 += i6;
                } else {
                    i5 = this.f33758i == -1 ? marginLayoutParams.topMargin : this.f33758i;
                }
                this.f33753d.layout(this.f33753d.getLeft(), i5, this.f33753d.getRight(), this.f33753d.getHeight() + i5);
            }
        }
    }

    private final void m30958a(Context context, AttributeSet attributeSet) {
        setFocusable(true);
        setOnClickListener(this);
        this.f33750a.f33783s = this;
        this.f33750a.f33784t.add(this);
        this.f33750a.f33790z = this;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6626j.WalletUicSummaryExpanderWrapper);
        this.f33758i = obtainStyledAttributes.getDimensionPixelOffset(C6626j.f32797x49fe7542, -1);
        this.f33759j = obtainStyledAttributes.getDimensionPixelOffset(C6626j.f32798x6a29006e, -1);
        this.f33760k = obtainStyledAttributes.getDimensionPixelOffset(C6626j.f32799x7030b4a1, -1);
        obtainStyledAttributes.recycle();
    }

    public final void mo5672h() {
        View e = C6749z.m30563e(this.f33750a.f33785u);
        if (this.f33755f != e) {
            this.f33755f = e;
            invalidate();
        }
    }

    private final void m30959j() {
        if (this.f33753d != null) {
            int i = hasFocus() ? 16842908 : -16842908;
            this.f33753d.setImageState(new int[]{i}, true);
            this.f33753d.invalidate();
        }
    }

    private final void m30960k() {
        if (!getExpandable().f33767c && this.f33757h != 1) {
            setEditMode(1);
            getExpandable().m31017b(true);
        }
    }

    private final void m30961l() {
        if (this.f33752c != null) {
            String str;
            int i;
            SummaryTextLayout summaryTextLayout = this.f33752c;
            if (this.f33752c.f33484h) {
                str = "%1$s\n%2$s";
            } else {
                str = getResources().getString(C6625i.wallet_uic_string_list_append_to_end);
            }
            summaryTextLayout.setText(mo5522a(str));
            summaryTextLayout = this.f33752c;
            if (this.f33750a.f33767c) {
                i = 8;
            } else {
                i = 0;
            }
            summaryTextLayout.setVisibility(i);
            this.f33752c.setEditMode(this.f33756g);
        }
        if (this.f33751b != null) {
            int i2;
            int dimensionPixelSize;
            this.f33751b.setEditMode(this.f33756g);
            if (TextUtils.isEmpty(this.f33751b.getTitle()) || ((TextUtils.isEmpty(this.f33752c.getText()) && !this.f33750a.f33767c) || !m30962m())) {
                this.f33751b.setVisibility(8);
                i2 = 0;
                dimensionPixelSize = getResources().getDimensionPixelSize(C6620d.wallet_uic_spacing_summary_view_above);
            } else {
                this.f33751b.setVisibility(0);
                i2 = getResources().getDimensionPixelSize(C6620d.wallet_uic_spacing_form_field_material_above);
                dimensionPixelSize = 0;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f33752c.getLayoutParams();
            marginLayoutParams.topMargin = dimensionPixelSize;
            this.f33752c.setLayoutParams(marginLayoutParams);
            marginLayoutParams = (MarginLayoutParams) this.f33753d.getLayoutParams();
            marginLayoutParams.topMargin = i2;
            this.f33753d.setLayoutParams(marginLayoutParams);
        }
        if (this.f33751b != null && this.f33751b.getVisibility() == 0) {
            this.f33751b.setShouldHideEditImage(this.f33750a.f33767c);
            this.f33752c.setShouldHideEditImage(true);
        } else if (this.f33752c != null) {
            this.f33752c.setShouldHideEditImage(false);
        }
    }

    private final boolean m30962m() {
        return this.f33764o == 2;
    }

    public at getParentFormElement() {
        return this.f33763n;
    }

    public void setParentFormElement(at atVar) {
        this.f33763n = atVar;
    }

    public final String mo5522a(String str) {
        if (this.f33762m != null) {
            bl blVar = new bl(this.f33762m.a[0].b);
            C6596h.m29924a(this.f33763n, blVar);
            if (blVar.m30755a()) {
                return blVar.m30757b();
            }
            return "";
        } else if (TextUtils.isEmpty(this.f33761l)) {
            return C6749z.m30554a(this.f33750a.f33785u, str);
        } else {
            return this.f33761l;
        }
    }
}
