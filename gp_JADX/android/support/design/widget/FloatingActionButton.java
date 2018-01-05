package android.support.design.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.C0106a;
import android.support.design.C0117b;
import android.support.design.C0121d;
import android.support.design.C0127i;
import android.support.design.C0134j;
import android.support.design.p018a.C0102h;
import android.support.design.p022d.C0120a;
import android.support.design.stateful.ExtendableSavedState;
import android.support.design.widget.p024a.C0136a;
import android.support.design.widget.p024a.C0139b;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.view.ah;
import android.support.v4.view.ai;
import android.support.v4.widget.bo;
import android.support.v7.widget.ag;
import android.support.v7.widget.ao;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ImageView.ScaleType;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.List;

@ao(a = Behavior.class)
public class FloatingActionButton extends ct implements C0136a, ah, bo {
    public ColorStateList f636a;
    public Mode f637b;
    public ColorStateList f638c;
    public Mode f639d;
    public int f640e;
    public int f641f;
    public ColorStateList f642g;
    public int f643h;
    public int f644i;
    public int f645j;
    public boolean f646k;
    public final Rect f647l;
    public final Rect f648m;
    public final ao f649n;
    public final C0139b f650o;
    public ay f651p;

    public class Behavior extends an {
        public Rect f632a;
        public aw f633b;
        public boolean f634c;

        public Behavior() {
            this.f634c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.FloatingActionButton_Behavior_Layout);
            this.f634c = obtainStyledAttributes.getBoolean(C0134j.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        public final void mo118a(aq aqVar) {
            if (aqVar.f801h == 0) {
                aqVar.f801h = 80;
            }
        }

        private static boolean m471a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof aq) {
                return ((aq) layoutParams).f794a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean m472a(View view, FloatingActionButton floatingActionButton) {
            aq aqVar = (aq) floatingActionButton.getLayoutParams();
            if (!this.f634c) {
                return false;
            }
            if (aqVar.f799f != view.getId()) {
                return false;
            }
            if (floatingActionButton.f635q != 0) {
                return false;
            }
            return true;
        }

        private final boolean m469a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m472a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f632a == null) {
                this.f632a = new Rect();
            }
            Rect rect = this.f632a;
            co.m769a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            int i = rect.bottom;
            int e = appBarLayout.m416e();
            int g = ai.f1848a.mo395g(appBarLayout);
            if (g != 0) {
                g = (g * 2) + e;
            } else {
                g = appBarLayout.getChildCount();
                if (g > 0) {
                    g = ai.f1848a.mo395g(appBarLayout.getChildAt(g - 1));
                } else {
                    g = 0;
                }
                if (g != 0) {
                    g = (g * 2) + e;
                } else {
                    g = appBarLayout.getHeight() / 3;
                }
            }
            if (i <= g) {
                floatingActionButton.m489b(this.f633b, false);
            } else {
                floatingActionButton.m485a(this.f633b, false);
            }
            return true;
        }

        private final boolean m473b(View view, FloatingActionButton floatingActionButton) {
            if (!m472a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < ((aq) floatingActionButton.getLayoutParams()).topMargin + (floatingActionButton.getHeight() / 2)) {
                floatingActionButton.m489b(this.f633b, false);
            } else {
                floatingActionButton.m485a(this.f633b, false);
            }
            return true;
        }

        private final boolean m470a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            int i3 = 0;
            List b = coordinatorLayout.m465b((View) floatingActionButton);
            int size = b.size();
            for (i2 = 0; i2 < size; i2++) {
                View view = (View) b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m471a(view) && m473b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m469a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m460a((View) floatingActionButton, i);
            Rect rect = floatingActionButton.f647l;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                aq aqVar = (aq) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - aqVar.rightMargin) {
                    i2 = rect.right;
                } else if (floatingActionButton.getLeft() <= aqVar.leftMargin) {
                    i2 = -rect.left;
                } else {
                    i2 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - aqVar.bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= aqVar.topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    ai.m1844d((View) floatingActionButton, i3);
                }
                if (i2 != 0) {
                    ai.m1847e((View) floatingActionButton, i2);
                }
            }
            return true;
        }

        public final /* synthetic */ boolean mo119a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f647l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final /* synthetic */ boolean mo91a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m469a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (m471a(view2)) {
                m473b(view2, floatingActionButton);
            }
            return false;
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117b.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f647l = new Rect();
        this.f648m = new Rect();
        cn.m768a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.FloatingActionButton, i, C0127i.Widget_Design_FloatingActionButton);
        this.f636a = C0120a.m232a(context, obtainStyledAttributes, C0134j.FloatingActionButton_backgroundTint);
        this.f637b = cr.m773a(obtainStyledAttributes.getInt(C0134j.FloatingActionButton_backgroundTintMode, -1));
        this.f641f = obtainStyledAttributes.getColor(C0134j.FloatingActionButton_rippleColor, 0);
        this.f642g = C0120a.m232a(context, obtainStyledAttributes, C0134j.FloatingActionButton_rippleAlpha);
        this.f643h = obtainStyledAttributes.getInt(C0134j.FloatingActionButton_fabSize, -1);
        this.f640e = obtainStyledAttributes.getDimensionPixelSize(C0134j.FloatingActionButton_borderWidth, 0);
        float dimension = obtainStyledAttributes.getDimension(C0134j.FloatingActionButton_elevation, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C0134j.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C0134j.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f646k = obtainStyledAttributes.getBoolean(C0134j.FloatingActionButton_useCompatPadding, false);
        this.f645j = obtainStyledAttributes.getDimensionPixelSize(C0134j.FloatingActionButton_maxImageSize, 0);
        C0102h a = C0102h.m211a(context, obtainStyledAttributes, C0134j.FloatingActionButton_showMotionSpec);
        C0102h a2 = C0102h.m211a(context, obtainStyledAttributes, C0134j.FloatingActionButton_hideMotionSpec);
        obtainStyledAttributes.recycle();
        this.f649n = new ao(this);
        this.f649n.m3195a(attributeSet, i);
        this.f650o = new C0139b(this);
        m484d().mo156a(this.f636a, this.f637b, this.f641f, this.f642g, this.f640e);
        m484d().m664a(dimension);
        m484d().m672b(dimension2);
        m484d().m675c(dimension3);
        ay d = m484d();
        int i2 = this.f645j;
        if (d.f847r != i2) {
            d.f847r = i2;
            d.m671b();
        }
        m484d().f833d = a;
        m484d().f834e = a2;
        setScaleType(ScaleType.MATRIX);
    }

    protected void onMeasure(int i, int i2) {
        int b = m488b();
        this.f644i = (b - this.f645j) / 2;
        m484d().m678e();
        b = Math.min(m480a(b, i), m480a(b, i2));
        setMeasuredDimension((this.f647l.left + b) + this.f647l.right, (b + this.f647l.top) + this.f647l.bottom);
    }

    public int getRippleColor() {
        return this.f641f;
    }

    public void setRippleColor(int i) {
        if (this.f641f != i) {
            this.f641f = i;
            m484d().mo155a(this.f641f, this.f642g);
        }
    }

    public ColorStateList getRippleAlpha() {
        return this.f642g;
    }

    public void setRippleAlpha(ColorStateList colorStateList) {
        if (this.f642g != colorStateList) {
            this.f642g = colorStateList;
            m484d().mo155a(this.f641f, this.f642g);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f636a;
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f636a != colorStateList) {
            this.f636a = colorStateList;
            ay d = m484d();
            if (d.f840k != null) {
                C0259a.m1516a(d.f840k, colorStateList);
            }
            if (d.f842m != null) {
                d.f842m.m638a(colorStateList);
            }
        }
    }

    public Mode getBackgroundTintMode() {
        return this.f637b;
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f637b != mode) {
            this.f637b = mode;
            ay d = m484d();
            if (d.f840k != null) {
                C0259a.m1519a(d.f840k, mode);
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f638c != colorStateList) {
            this.f638c = colorStateList;
            m483c();
        }
    }

    public ColorStateList getSupportImageTintList() {
        return this.f638c;
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f639d != mode) {
            this.f639d = mode;
            m483c();
        }
    }

    public Mode getSupportImageTintMode() {
        return this.f639d;
    }

    private final void m483c() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (this.f638c == null) {
                C0259a.m1525d(drawable);
                return;
            }
            int colorForState = this.f638c.getColorForState(getDrawableState(), 0);
            Mode mode = this.f639d;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(ag.m3173a(colorForState, mode));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setImageResource(int i) {
        this.f649n.m3192a(i);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m484d().m671b();
    }

    public final void m485a(aw awVar, boolean z) {
        int i = 1;
        ay d = m484d();
        bf a = m481a(awVar);
        if (d.f849z.getVisibility() != 0) {
            if (d.f831b != 2) {
                i = 0;
            }
        } else if (d.f831b == 1) {
            i = 0;
        }
        if (i == 0) {
            if (d.f832c != null) {
                d.f832c.cancel();
            }
            if (d.m683j()) {
                C0102h c0102h;
                if (d.f849z.getVisibility() != 0) {
                    d.f849z.setAlpha(0.0f);
                    d.f849z.setScaleY(0.0f);
                    d.f849z.setScaleX(0.0f);
                    d.m677d(0.0f);
                }
                if (d.f833d != null) {
                    c0102h = d.f833d;
                } else {
                    if (d.f835f == null) {
                        d.f835f = C0102h.m210a(d.f849z.getContext(), C0106a.design_fab_show_motion_spec);
                    }
                    c0102h = d.f835f;
                }
                AnimatorSet a2 = d.m663a(c0102h, 1.0f, 1.0f, 1.0f);
                a2.addListener(new ba(d, z, a));
                a2.start();
                return;
            }
            d.f849z.m478a(0, z);
            d.f849z.setAlpha(1.0f);
            d.f849z.setScaleY(1.0f);
            d.f849z.setScaleX(1.0f);
            d.m677d(1.0f);
            if (a != null) {
                a.mo146a();
            }
        }
    }

    public final void m489b(aw awVar, boolean z) {
        Object obj = 1;
        ay d = m484d();
        bf a = m481a(awVar);
        if (d.f849z.getVisibility() == 0) {
            if (d.f831b != 1) {
                obj = null;
            }
        } else if (d.f831b == 2) {
            obj = null;
        }
        if (obj == null) {
            if (d.f832c != null) {
                d.f832c.cancel();
            }
            if (d.m683j()) {
                C0102h c0102h;
                if (d.f834e != null) {
                    c0102h = d.f834e;
                } else {
                    if (d.f836g == null) {
                        d.f836g = C0102h.m210a(d.f849z.getContext(), C0106a.design_fab_hide_motion_spec);
                    }
                    c0102h = d.f836g;
                }
                AnimatorSet a2 = d.m663a(c0102h, 0.0f, 0.0f, 0.0f);
                a2.addListener(new az(d, z, a));
                a2.start();
                return;
            }
            d.f849z.m478a(z ? 8 : 4, z);
            if (a != null) {
                a.mo147b();
            }
        }
    }

    public final boolean mo120a() {
        return this.f650o.f712b;
    }

    public void setExpandedComponentIdHint(int i) {
        this.f650o.f713c = i;
    }

    public int getExpandedComponentIdHint() {
        return this.f650o.f713c;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f646k != z) {
            this.f646k = z;
            m484d().mo161d();
        }
    }

    public boolean getUseCompatPadding() {
        return this.f646k;
    }

    public void setSize(int i) {
        if (i != this.f643h) {
            this.f643h = i;
            requestLayout();
        }
    }

    public int getSize() {
        return this.f643h;
    }

    private static bf m481a(aw awVar) {
        if (awVar == null) {
            return null;
        }
        return new av();
    }

    final int m488b() {
        int i = this.f643h;
        while (true) {
            Resources resources = getResources();
            switch (i) {
                case -1:
                    if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                case 1:
                    return resources.getDimensionPixelSize(C0121d.design_fab_size_mini);
                default:
                    return resources.getDimensionPixelSize(C0121d.design_fab_size_normal);
            }
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ay d = m484d();
        if (d.mo162f()) {
            if (d.f830F == null) {
                d.f830F = new bb(d);
            }
            d.f849z.getViewTreeObserver().addOnPreDrawListener(d.f830F);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ay d = m484d();
        if (d.f830F != null) {
            d.f849z.getViewTreeObserver().removeOnPreDrawListener(d.f830F);
            d.f830F = null;
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m484d().mo158a(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        m484d().mo160c();
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable extendableSavedState = new ExtendableSavedState(super.onSaveInstanceState());
        C0139b c0139b = this.f650o;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c0139b.f712b);
        bundle.putInt("expandedComponentIdHint", c0139b.f713c);
        extendableSavedState.f543a.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ExtendableSavedState) {
            ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
            super.onRestoreInstanceState(extendableSavedState.f542e);
            C0139b c0139b = this.f650o;
            Bundle bundle = (Bundle) extendableSavedState.f543a.get("expandableWidgetHelper");
            c0139b.f712b = bundle.getBoolean("expanded", false);
            c0139b.f713c = bundle.getInt("expandedComponentIdHint", 0);
            if (c0139b.f712b) {
                ViewParent parent = c0139b.f711a.getParent();
                if (parent instanceof CoordinatorLayout) {
                    ((CoordinatorLayout) parent).m459a(c0139b.f711a);
                    return;
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final boolean m487a(Rect rect) {
        if (!ai.f1848a.mo409s(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        rect.left += this.f647l.left;
        rect.top += this.f647l.top;
        rect.right -= this.f647l.right;
        rect.bottom -= this.f647l.bottom;
        return true;
    }

    public Drawable getContentBackground() {
        return m484d().f843n;
    }

    private static int m480a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(i, size);
            case 0:
                return i;
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                return size;
            default:
                throw new IllegalArgumentException();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m487a(this.f648m) && !this.f648m.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public float getCompatElevation() {
        return m484d().mo153a();
    }

    public void setCompatElevation(float f) {
        m484d().m664a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return m484d().f845p;
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        m484d().m672b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public float getCompatPressedTranslationZ() {
        return m484d().f846q;
    }

    public void setCompatPressedTranslationZ(float f) {
        m484d().m675c(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public C0102h getShowMotionSpec() {
        return m484d().f833d;
    }

    public void setShowMotionSpec(C0102h c0102h) {
        m484d().f833d = c0102h;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0102h.m210a(getContext(), i));
    }

    public C0102h getHideMotionSpec() {
        return m484d().f834e;
    }

    public void setHideMotionSpec(C0102h c0102h) {
        m484d().f834e = c0102h;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0102h.m210a(getContext(), i));
    }

    private final ay m484d() {
        if (this.f651p == null) {
            ay biVar;
            if (VERSION.SDK_INT >= 21) {
                biVar = new bi(this, new ax(this));
            } else {
                biVar = new ay(this, new ax(this));
            }
            this.f651p = biVar;
        }
        return this.f651p;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }
}
