package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.C0121d;
import android.support.design.C0134j;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ai;
import android.support.v4.widget.bp;
import android.support.v4.widget.bs;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior extends an {
    public boolean f579a = true;
    public float f580b;
    public int f581c;
    public boolean f582d;
    public int f583e;
    public int f584f;
    public int f585g;
    public int f586h;
    public int f587i;
    public boolean f588j;
    public boolean f589k;
    public int f590l = 4;
    public bp f591m;
    public boolean f592n;
    public int f593o;
    public boolean f594p;
    public int f595q;
    public WeakReference f596r;
    public WeakReference f597s;
    public aa f598t;
    public VelocityTracker f599u;
    public int f600v;
    public int f601w;
    public boolean f602x;
    public final bs f603y = new C0174z(this);

    public class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new ab();
        public final int f578a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f578a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f578a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f578a);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C0134j.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || peekValue.data != -1) {
            m421d(obtainStyledAttributes.getDimensionPixelSize(C0134j.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            m421d(peekValue.data);
        }
        this.f588j = obtainStyledAttributes.getBoolean(C0134j.BottomSheetBehavior_Layout_behavior_hideable, false);
        boolean z = obtainStyledAttributes.getBoolean(C0134j.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f579a != z) {
            this.f579a = z;
            if (this.f596r != null) {
                m419c();
            }
            int i = (this.f579a && this.f590l == 6) ? 3 : this.f590l;
            m436c(i);
        }
        this.f589k = obtainStyledAttributes.getBoolean(C0134j.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        obtainStyledAttributes.recycle();
        this.f580b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final Parcelable mo84b(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.mo84b(coordinatorLayout, view), this.f590l);
    }

    public final void mo76a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo76a(coordinatorLayout, view, savedState.f542e);
        if (savedState.f578a == 1 || savedState.f578a == 2) {
            this.f590l = 4;
        } else {
            this.f590l = savedState.f578a;
        }
    }

    public final boolean mo69a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (ai.f1848a.mo397i(coordinatorLayout) && !ai.f1848a.mo397i(view)) {
            ai.m1853i(view);
        }
        int top = view.getTop();
        coordinatorLayout.m460a(view, i);
        this.f595q = coordinatorLayout.getHeight();
        if (this.f582d) {
            if (this.f583e == 0) {
                this.f583e = coordinatorLayout.getResources().getDimensionPixelSize(C0121d.design_bottom_sheet_peek_height_min);
            }
            this.f584f = Math.max(this.f583e, this.f595q - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f584f = this.f581c;
        }
        this.f585g = Math.max(0, this.f595q - view.getHeight());
        this.f586h = this.f595q / 2;
        m419c();
        if (this.f590l == 3) {
            ai.m1844d(view, m422a());
        } else if (this.f590l == 6) {
            ai.m1844d(view, this.f586h);
        } else if (this.f588j && this.f590l == 5) {
            ai.m1844d(view, this.f595q);
        } else if (this.f590l == 4) {
            ai.m1844d(view, this.f587i);
        } else if (this.f590l == 1 || this.f590l == 2) {
            ai.m1844d(view, top - view.getTop());
        }
        if (this.f591m == null) {
            this.f591m = bp.m2244a((ViewGroup) coordinatorLayout, this.f603y);
        }
        this.f596r = new WeakReference(view);
        this.f597s = new WeakReference(m418b(view));
        return true;
    }

    public final boolean mo70a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.isShown()) {
            View view2;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m420d();
            }
            if (this.f599u == null) {
                this.f599u = VelocityTracker.obtain();
            }
            this.f599u.addMovement(motionEvent);
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f601w = (int) motionEvent.getY();
                    view2 = this.f597s != null ? (View) this.f597s.get() : null;
                    if (view2 != null && coordinatorLayout.m464a(view2, x, this.f601w)) {
                        this.f600v = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f602x = true;
                    }
                    boolean z = this.f600v == -1 && !coordinatorLayout.m464a(view, x, this.f601w);
                    this.f592n = z;
                    break;
                case 1:
                case 3:
                    this.f602x = false;
                    this.f600v = -1;
                    if (this.f592n) {
                        this.f592n = false;
                        return false;
                    }
                    break;
            }
            if (!this.f592n && this.f591m.m2261a(motionEvent)) {
                return true;
            }
            view2 = (View) this.f597s.get();
            if (actionMasked != 2 || view2 == null || this.f592n || this.f590l == 1 || coordinatorLayout.m464a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f601w) - motionEvent.getY()) <= ((float) this.f591m.f2119b)) {
                return false;
            }
            return true;
        }
        this.f592n = true;
        return false;
    }

    public final boolean mo71b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f590l == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f591m != null) {
            this.f591m.m2265b(motionEvent);
        }
        if (actionMasked == 0) {
            m420d();
        }
        if (this.f599u == null) {
            this.f599u = VelocityTracker.obtain();
        }
        this.f599u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f592n && Math.abs(((float) this.f601w) - motionEvent.getY()) > ((float) this.f591m.f2119b)) {
            this.f591m.m2258a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (this.f592n) {
            return false;
        }
        return true;
    }

    public final boolean mo95a(int i) {
        this.f593o = 0;
        this.f594p = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void mo94a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        if (view2 == ((View) this.f597s.get())) {
            int top = view.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < m422a()) {
                    iArr[1] = top - m422a();
                    ai.m1844d(view, -iArr[1]);
                    m436c(3);
                } else {
                    iArr[1] = i2;
                    ai.m1844d(view, -i2);
                    m436c(1);
                }
            } else if (i2 < 0 && !ai.m1835a(view2, -1)) {
                if (i3 <= this.f587i || this.f588j) {
                    iArr[1] = i2;
                    ai.m1844d(view, -i2);
                    m436c(1);
                } else {
                    iArr[1] = top - this.f587i;
                    ai.m1844d(view, -iArr[1]);
                    m436c(4);
                }
            }
            view.getTop();
            m432b();
            this.f593o = i2;
            this.f594p = true;
        }
    }

    public final void mo97b(View view, View view2) {
        int i = 3;
        if (view.getTop() == m422a()) {
            m436c(3);
        } else if (view2 == this.f597s.get() && this.f594p) {
            int a;
            if (this.f593o > 0) {
                a = m422a();
            } else {
                if (this.f588j) {
                    this.f599u.computeCurrentVelocity(1000, this.f580b);
                    if (m430a(view, this.f599u.getYVelocity(this.f600v))) {
                        a = this.f595q;
                        i = 5;
                    }
                }
                if (this.f593o == 0) {
                    int top = view.getTop();
                    if (this.f579a) {
                        if (Math.abs(top - this.f585g) < Math.abs(top - this.f587i)) {
                            a = this.f585g;
                        } else {
                            a = this.f587i;
                            i = 4;
                        }
                    } else if (top < this.f586h) {
                        if (top < Math.abs(top - this.f587i)) {
                            a = 0;
                        } else {
                            a = this.f586h;
                            i = 6;
                        }
                    } else if (Math.abs(top - this.f586h) < Math.abs(top - this.f587i)) {
                        a = this.f586h;
                        i = 6;
                    } else {
                        a = this.f587i;
                        i = 4;
                    }
                } else {
                    a = this.f587i;
                    i = 4;
                }
            }
            if (this.f591m.m2262a(view, view.getLeft(), a)) {
                m436c(2);
                ai.m1830a(view, new ac(this, view, i));
            } else {
                m436c(i);
            }
            this.f594p = false;
        }
    }

    public final boolean mo96a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return view2 == this.f597s.get() && (this.f590l != 3 || super.mo96a(coordinatorLayout, view, view2, f, f2));
    }

    private final void m421d(int i) {
        boolean z = true;
        if (i == -1) {
            if (!this.f582d) {
                this.f582d = true;
            }
            z = false;
        } else {
            if (this.f582d || this.f581c != i) {
                this.f582d = false;
                this.f581c = Math.max(0, i);
                this.f587i = this.f595q - i;
            }
            z = false;
        }
        if (z && this.f590l == 4 && this.f596r != null) {
            View view = (View) this.f596r.get();
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    public final void m433b(int i) {
        if (i != this.f590l) {
            if (this.f596r != null) {
                View view = (View) this.f596r.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null && parent.isLayoutRequested() && ai.f1848a.mo410t(view)) {
                        view.post(new C0173y(this, view, i));
                    } else {
                        m425a(view, i);
                    }
                }
            } else if (i == 4 || i == 3 || i == 6 || (this.f588j && i == 5)) {
                this.f590l = i;
            }
        }
    }

    final void m436c(int i) {
        if (this.f590l != i) {
            this.f590l = i;
            if (((View) this.f596r.get()) != null && this.f598t != null) {
                this.f598t.mo133a(i);
            }
        }
    }

    private final void m419c() {
        if (this.f579a) {
            this.f587i = Math.max(this.f595q - this.f584f, this.f585g);
        } else {
            this.f587i = this.f595q - this.f584f;
        }
    }

    private final void m420d() {
        this.f600v = -1;
        if (this.f599u != null) {
            this.f599u.recycle();
            this.f599u = null;
        }
    }

    final boolean m430a(View view, float f) {
        if (this.f589k) {
            return true;
        }
        if (view.getTop() < this.f587i) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.f587i)) / ((float) this.f581c) <= 0.5f) {
            return false;
        }
        return true;
    }

    private final View m418b(View view) {
        if (ai.f1848a.mo425x(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View b = m418b(viewGroup.getChildAt(i));
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    final int m422a() {
        return this.f579a ? this.f585g : 0;
    }

    final void m425a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f587i;
        } else if (i == 6) {
            i2 = this.f586h;
        } else if (i == 3) {
            i2 = m422a();
        } else if (this.f588j && i == 5) {
            i2 = this.f595q;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        }
        if (this.f591m.m2262a(view, view.getLeft(), i2)) {
            m436c(2);
            ai.m1830a(view, new ac(this, view, i));
            return;
        }
        m436c(i);
    }

    final void m432b() {
        if (((View) this.f596r.get()) != null && this.f598t != null) {
            this.f598t.mo132a();
        }
    }

    public static BottomSheetBehavior m417a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof aq) {
            an anVar = ((aq) layoutParams).f794a;
            if (anVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) anVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }
}
