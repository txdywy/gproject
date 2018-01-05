package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.C0117b;
import android.support.design.C0127i;
import android.support.design.C0134j;
import android.support.design.p018a.C0095a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ai;
import android.support.v4.view.ca;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

@ao(a = Behavior.class)
public class AppBarLayout extends LinearLayout {
    public int f568a;
    public int f569b;
    public int f570c;
    public boolean f571d;
    public int f572e;
    public ca f573f;
    public List f574g;
    public boolean f575h;
    public boolean f576i;
    public int[] f577j;

    public class Behavior extends bk {
        public int f557a;
        public ValueAnimator f558b;
        public int f559c = -1;
        public boolean f560d;
        public float f561e;
        public WeakReference f562f;
        public C0144c f563g;

        public class SavedState extends AbsSavedState {
            public static final Creator CREATOR = new C0145d();
            public int f544a;
            public float f545b;
            public boolean f546c;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f544a = parcel.readInt();
                this.f545b = parcel.readFloat();
                this.f546c = parcel.readByte() != (byte) 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f544a);
                parcel.writeFloat(this.f545b);
                parcel.writeByte((byte) (this.f546c ? 1 : 0));
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private final void m371a(int i, AppBarLayout appBarLayout, View view, int i2) {
            if (i2 == 1) {
                int a = mo72a();
                if ((i < 0 && a == 0) || (i > 0 && a == (-appBarLayout.m414c()))) {
                    ai.m1854j(view);
                }
            }
        }

        private final void m375b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(mo72a() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                abs = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                abs = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            if (mo72a() != i) {
                if (this.f558b == null) {
                    this.f558b = new ValueAnimator();
                    this.f558b.setInterpolator(C0095a.f424d);
                    this.f558b.addUpdateListener(new C0142b(this, coordinatorLayout, appBarLayout));
                } else {
                    this.f558b.cancel();
                }
                this.f558b.setDuration((long) Math.min(abs, 600));
                this.f558b.setIntValues(new int[]{r1, i});
                this.f558b.start();
            } else if (this.f558b != null && this.f558b.isRunning()) {
                this.f558b.cancel();
            }
        }

        private final void m372a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int i;
            int a = mo72a();
            int childCount = appBarLayout.getChildCount();
            for (i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                if (childAt.getTop() <= (-a) && childAt.getBottom() >= (-a)) {
                    childCount = i;
                    break;
                }
            }
            childCount = -1;
            if (childCount >= 0) {
                View childAt2 = appBarLayout.getChildAt(childCount);
                int i2 = ((C0146e) childAt2.getLayoutParams()).f964a;
                if ((i2 & 17) == 17) {
                    int i3 = -childAt2.getTop();
                    i = -childAt2.getBottom();
                    if (childCount == appBarLayout.getChildCount() - 1) {
                        i += appBarLayout.m416e();
                    }
                    if (m374a(i2, 2)) {
                        i += ai.f1848a.mo395g(childAt2);
                        childCount = i3;
                    } else if (m374a(i2, 5)) {
                        childCount = ai.f1848a.mo395g(childAt2) + i;
                        if (a >= childCount) {
                            i = childCount;
                            childCount = i3;
                        }
                    } else {
                        childCount = i3;
                    }
                    if (a >= (i + childCount) / 2) {
                        i = childCount;
                    }
                    m375b(coordinatorLayout, appBarLayout, bn.m702a(i, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        private static boolean m374a(int i, int i2) {
            return (i & i2) == i2;
        }

        public boolean mo3575a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((aq) appBarLayout.getLayoutParams()).height != -2) {
                return super.mo80a(coordinatorLayout, (View) appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.m462a((View) appBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public boolean mo3574a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean a = super.mo69a(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.f572e;
            if (this.f559c >= 0 && (i2 & 8) == 0) {
                int g;
                View childAt = appBarLayout.getChildAt(this.f559c);
                i2 = -childAt.getBottom();
                if (this.f560d) {
                    g = (ai.f1848a.mo395g(childAt) + appBarLayout.m416e()) + i2;
                } else {
                    g = Math.round(((float) childAt.getHeight()) * this.f561e) + i2;
                }
                a_(coordinatorLayout, appBarLayout, g);
            } else if (i2 != 0) {
                boolean z = (i2 & 4) != 0;
                if ((i2 & 2) != 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    if (z) {
                        m375b(coordinatorLayout, appBarLayout, i2);
                    } else {
                        a_(coordinatorLayout, appBarLayout, i2);
                    }
                } else if ((i2 & 1) != 0) {
                    if (z) {
                        m375b(coordinatorLayout, appBarLayout, 0);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f572e = 0;
            this.f559c = -1;
            a_(bn.m702a(mo86c(), -appBarLayout.getTotalScrollRange(), 0));
            m373a(coordinatorLayout, appBarLayout, mo86c(), 0, true);
            appBarLayout.m415d();
            return a;
        }

        private static void m373a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            int i3;
            View view;
            Object obj = null;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    view = childAt;
                    break;
                }
            }
            view = null;
            if (view != null) {
                boolean z2;
                Object obj2;
                Collection b;
                List list;
                an anVar;
                int i4 = ((C0146e) view.getLayoutParams()).f964a;
                if ((i4 & 1) != 0) {
                    abs = ai.f1848a.mo395g(view);
                    if (i2 > 0 && (i4 & 12) != 0) {
                        z2 = (-i) >= (view.getBottom() - abs) - appBarLayout.m416e();
                        if (appBarLayout.f576i != z2) {
                            obj2 = null;
                        } else {
                            appBarLayout.f576i = z2;
                            appBarLayout.refreshDrawableState();
                            obj2 = 1;
                        }
                        if (VERSION.SDK_INT < 11) {
                            if (!z) {
                                if (obj2 == null) {
                                    b = coordinatorLayout.f615g.m647b(appBarLayout);
                                    coordinatorLayout.f617i.clear();
                                    if (b != null) {
                                        coordinatorLayout.f617i.addAll(b);
                                    }
                                    list = coordinatorLayout.f617i;
                                    childCount = list.size();
                                    while (i3 < childCount) {
                                        anVar = ((aq) ((View) list.get(i3)).getLayoutParams()).f794a;
                                        if (anVar instanceof ScrollingViewBehavior) {
                                        } else {
                                            if (((ScrollingViewBehavior) anVar).f567d != 0) {
                                                obj = 1;
                                            }
                                            if (obj == null) {
                                                return;
                                            }
                                        }
                                    }
                                    if (obj == null) {
                                        return;
                                    }
                                }
                                return;
                            }
                            appBarLayout.jumpDrawablesToCurrentState();
                        }
                    } else if ((i4 & 2) != 0) {
                        z2 = (-i) >= (view.getBottom() - abs) - appBarLayout.m416e();
                        if (appBarLayout.f576i != z2) {
                            appBarLayout.f576i = z2;
                            appBarLayout.refreshDrawableState();
                            obj2 = 1;
                        } else {
                            obj2 = null;
                        }
                        if (VERSION.SDK_INT < 11) {
                            if (z) {
                                if (obj2 == null) {
                                    b = coordinatorLayout.f615g.m647b(appBarLayout);
                                    coordinatorLayout.f617i.clear();
                                    if (b != null) {
                                        coordinatorLayout.f617i.addAll(b);
                                    }
                                    list = coordinatorLayout.f617i;
                                    childCount = list.size();
                                    for (i3 = 0; i3 < childCount; i3++) {
                                        anVar = ((aq) ((View) list.get(i3)).getLayoutParams()).f794a;
                                        if (anVar instanceof ScrollingViewBehavior) {
                                            if (((ScrollingViewBehavior) anVar).f567d != 0) {
                                                obj = 1;
                                            }
                                            if (obj == null) {
                                                return;
                                            }
                                        }
                                    }
                                    if (obj == null) {
                                        return;
                                    }
                                }
                                return;
                            }
                            appBarLayout.jumpDrawablesToCurrentState();
                        }
                    }
                }
                z2 = false;
                if (appBarLayout.f576i != z2) {
                    appBarLayout.f576i = z2;
                    appBarLayout.refreshDrawableState();
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (VERSION.SDK_INT < 11) {
                    if (z) {
                        if (obj2 == null) {
                            b = coordinatorLayout.f615g.m647b(appBarLayout);
                            coordinatorLayout.f617i.clear();
                            if (b != null) {
                                coordinatorLayout.f617i.addAll(b);
                            }
                            list = coordinatorLayout.f617i;
                            childCount = list.size();
                            for (i3 = 0; i3 < childCount; i3++) {
                                anVar = ((aq) ((View) list.get(i3)).getLayoutParams()).f794a;
                                if (anVar instanceof ScrollingViewBehavior) {
                                    if (((ScrollingViewBehavior) anVar).f567d != 0) {
                                        obj = 1;
                                    }
                                    if (obj == null) {
                                        return;
                                    }
                                }
                            }
                            if (obj == null) {
                                return;
                            }
                        }
                        return;
                    }
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        final int mo72a() {
            return mo86c() + this.f557a;
        }

        public void mo3573a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo76a(coordinatorLayout, (View) appBarLayout, savedState.f542e);
                this.f559c = savedState.f544a;
                this.f561e = savedState.f545b;
                this.f560d = savedState.f546c;
                return;
            }
            super.mo76a(coordinatorLayout, (View) appBarLayout, parcelable);
            this.f559c = -1;
        }

        final /* synthetic */ int mo74a(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        final /* synthetic */ int mo83b(View view) {
            return -((AppBarLayout) view).m414c();
        }

        final /* synthetic */ boolean mo85b() {
            if (this.f563g != null) {
                return this.f563g.m743a();
            }
            if (this.f562f != null) {
                View view = (View) this.f562f.get();
                if (view == null || !view.isShown() || ai.m1835a(view, -1)) {
                    return false;
                }
            }
            return true;
        }

        final /* synthetic */ void mo75a(CoordinatorLayout coordinatorLayout, View view) {
            m372a(coordinatorLayout, (AppBarLayout) view);
        }

        final /* synthetic */ int mo73a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int a = mo72a();
            if (i2 == 0 || a < i2 || a > i3) {
                this.f557a = 0;
                return 0;
            }
            int a2 = bn.m702a(i, i2, i3);
            if (a == a2) {
                return 0;
            }
            int i4;
            int height;
            if (appBarLayout.f571d) {
                int abs = Math.abs(a2);
                int childCount = appBarLayout.getChildCount();
                i4 = 0;
                while (i4 < childCount) {
                    View childAt = appBarLayout.getChildAt(i4);
                    C0146e c0146e = (C0146e) childAt.getLayoutParams();
                    Interpolator interpolator = c0146e.f965b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i4++;
                    } else {
                        if (interpolator != null) {
                            i4 = c0146e.f964a;
                            if ((i4 & 1) != 0) {
                                height = (c0146e.bottomMargin + (childAt.getHeight() + c0146e.topMargin)) + 0;
                                if ((i4 & 2) != 0) {
                                    height -= ai.f1848a.mo395g(childAt);
                                }
                            } else {
                                height = 0;
                            }
                            if (ai.f1848a.mo397i(childAt)) {
                                height -= appBarLayout.m416e();
                            }
                            if (height > 0) {
                                height = (Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / ((float) height)) * ((float) height)) + childAt.getTop()) * Integer.signum(a2);
                            }
                        }
                        height = a2;
                    }
                }
                height = a2;
            } else {
                height = a2;
            }
            boolean a_ = a_(height);
            i4 = a - a2;
            this.f557a = a2 - height;
            if (!a_ && appBarLayout.f571d) {
                coordinatorLayout.m459a((View) appBarLayout);
            }
            appBarLayout.m415d();
            m373a(coordinatorLayout, appBarLayout, a2, a2 < a ? -1 : 1, false);
            return i4;
        }

        public final /* bridge */ /* synthetic */ int mo86c() {
            return super.mo86c();
        }

        public final /* bridge */ /* synthetic */ boolean a_(int i) {
            return super.a_(i);
        }

        public final /* synthetic */ Parcelable mo84b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = false;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable b = super.mo84b(coordinatorLayout, (View) appBarLayout);
            int c = mo86c();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(b);
                    savedState.f544a = i;
                    if (bottom == ai.f1848a.mo395g(childAt) + appBarLayout.m416e()) {
                        z = true;
                    }
                    savedState.f546c = z;
                    savedState.f545b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return b;
        }

        public final /* synthetic */ void mo79a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i2 != 0) {
                int i4;
                int b;
                if (i2 < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    b = i4 + appBarLayout.m413b();
                } else {
                    i4 = -appBarLayout.getTotalScrollRange();
                    b = 0;
                }
                if (i4 != b) {
                    iArr[1] = m367b(coordinatorLayout, appBarLayout, i2, i4, b);
                    m371a(i2, appBarLayout, view2, i3);
                }
            }
        }

        public final /* synthetic */ void mo78a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i2 < 0) {
                m367b(coordinatorLayout, appBarLayout, i2, -appBarLayout.m414c(), 0);
                m371a(i2, appBarLayout, view2, i3);
            }
        }

        public final /* synthetic */ void mo77a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i == 0) {
                m372a(coordinatorLayout, appBarLayout);
            }
            this.f562f = new WeakReference(view2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ boolean mo81a(android.support.design.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7, int r8, int r9) {
            /*
            r4 = this;
            r0 = 1;
            r1 = 0;
            r6 = (android.support.design.widget.AppBarLayout) r6;
            r2 = r8 & 2;
            if (r2 == 0) goto L_0x0031;
        L_0x0008:
            r2 = r6.getTotalScrollRange();
            if (r2 == 0) goto L_0x002f;
        L_0x000e:
            r2 = r0;
        L_0x000f:
            if (r2 == 0) goto L_0x0031;
        L_0x0011:
            r2 = r5.getHeight();
            r3 = r7.getHeight();
            r2 = r2 - r3;
            r3 = r6.getHeight();
            if (r2 > r3) goto L_0x0031;
        L_0x0020:
            if (r0 == 0) goto L_0x002b;
        L_0x0022:
            r1 = r4.f558b;
            if (r1 == 0) goto L_0x002b;
        L_0x0026:
            r1 = r4.f558b;
            r1.cancel();
        L_0x002b:
            r1 = 0;
            r4.f562f = r1;
            return r0;
        L_0x002f:
            r2 = r1;
            goto L_0x000f;
        L_0x0031:
            r0 = r1;
            goto L_0x0020;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View, int, int):boolean");
        }
    }

    public class ScrollingViewBehavior extends bm {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.ScrollingViewBehavior_Layout);
            this.f567d = obtainStyledAttributes.getDimensionPixelSize(C0134j.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        public final boolean mo92a(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public final boolean mo91a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            an anVar = ((aq) view2.getLayoutParams()).f794a;
            if (anVar instanceof Behavior) {
                int bottom = view2.getBottom() - view.getTop();
                ai.m1844d(view, ((((Behavior) anVar).f557a + bottom) + this.f566c) - m399c(view2));
            }
            return false;
        }

        public final boolean mo90a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = m400b(coordinatorLayout.m465b(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    boolean z2;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    b.m412a(false, z2, true);
                    return true;
                }
            }
            return false;
        }

        final float mo88a(View view) {
            if (view instanceof AppBarLayout) {
                int a;
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int b = appBarLayout.m413b();
                an anVar = ((aq) appBarLayout.getLayoutParams()).f794a;
                if (anVar instanceof Behavior) {
                    a = ((Behavior) anVar).mo72a();
                } else {
                    a = 0;
                }
                if (b != 0 && totalScrollRange + a <= b) {
                    return 0.0f;
                }
                totalScrollRange -= b;
                if (totalScrollRange != 0) {
                    return (((float) a) / ((float) totalScrollRange)) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static AppBarLayout m400b(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        final int mo93b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo93b(view);
        }

        final /* synthetic */ View mo89a(List list) {
            return m400b(list);
        }

        public final /* bridge */ /* synthetic */ boolean mo80a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo80a(coordinatorLayout, view, i, i2, i3, i4);
        }

        public final /* bridge */ /* synthetic */ int mo86c() {
            return super.mo86c();
        }

        public final /* bridge */ /* synthetic */ boolean a_(int i) {
            return super.a_(i);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f568a = -1;
        this.f569b = -1;
        this.f570c = -1;
        this.f572e = 0;
        setOrientation(1);
        cn.m768a(context);
        if (VERSION.SDK_INT >= 21) {
            cs.m775a(this);
            cs.m777a(this, attributeSet, C0127i.Widget_Design_AppBarLayout);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.AppBarLayout, 0, C0127i.Widget_Design_AppBarLayout);
        ai.m1826a((View) this, obtainStyledAttributes.getDrawable(C0134j.AppBarLayout_android_background));
        if (obtainStyledAttributes.hasValue(C0134j.AppBarLayout_expanded)) {
            m412a(obtainStyledAttributes.getBoolean(C0134j.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && obtainStyledAttributes.hasValue(C0134j.AppBarLayout_elevation)) {
            cs.m776a(this, (float) obtainStyledAttributes.getDimensionPixelSize(C0134j.AppBarLayout_elevation, 0));
        }
        obtainStyledAttributes.recycle();
        ai.m1828a((View) this, new C0140a(this));
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m411a();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        m411a();
        this.f571d = false;
        int childCount = getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            if (((C0146e) getChildAt(i5).getLayoutParams()).f965b != null) {
                this.f571d = true;
                break;
            }
        }
        childCount = getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            C0146e c0146e = (C0146e) getChildAt(i5).getLayoutParams();
            if ((c0146e.f964a & 1) != 1 || (c0146e.f964a & 10) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (this.f575h != z2) {
            this.f575h = z2;
            refreshDrawableState();
        }
    }

    final void m411a() {
        this.f568a = -1;
        this.f569b = -1;
        this.f570c = -1;
    }

    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setExpanded(boolean z) {
        m412a(z, ai.f1848a.mo409s(this), true);
    }

    final void m412a(boolean z, boolean z2, boolean z3) {
        int i;
        int i2 = 0;
        int i3 = z ? 1 : 2;
        if (z2) {
            i = 4;
        } else {
            i = 0;
        }
        i |= i3;
        if (z3) {
            i2 = 8;
        }
        this.f572e = i2 | i;
        requestLayout();
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0146e;
    }

    private static C0146e m410a(LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C0146e((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0146e((MarginLayoutParams) layoutParams);
        }
        return new C0146e(layoutParams);
    }

    public final int getTotalScrollRange() {
        if (this.f568a != -1) {
            return this.f568a;
        }
        int g;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0146e c0146e = (C0146e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c0146e.f964a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += c0146e.bottomMargin + (measuredHeight + c0146e.topMargin);
            if ((i3 & 2) != 0) {
                g = i - ai.f1848a.mo395g(childAt);
                break;
            }
        }
        g = i;
        g = Math.max(0, g - m416e());
        this.f568a = g;
        return g;
    }

    final int m413b() {
        if (this.f569b != -1) {
            return this.f569b;
        }
        int i;
        int childCount = getChildCount() - 1;
        int i2 = 0;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            C0146e c0146e = (C0146e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c0146e.f964a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
                i = i2;
            } else {
                i = (c0146e.bottomMargin + c0146e.topMargin) + i2;
                if ((i3 & 8) != 0) {
                    i += ai.f1848a.mo395g(childAt);
                } else if ((i3 & 2) != 0) {
                    i += measuredHeight - ai.f1848a.mo395g(childAt);
                } else {
                    i += measuredHeight - m416e();
                }
            }
            childCount--;
            i2 = i;
        }
        i = Math.max(0, i2);
        this.f569b = i;
        return i;
    }

    final int m414c() {
        if (this.f570c != -1) {
            return this.f570c;
        }
        int i;
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0146e c0146e = (C0146e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (c0146e.topMargin + c0146e.bottomMargin);
            i = c0146e.f964a;
            if ((i & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i & 2) != 0) {
                i = i2 - (ai.f1848a.mo395g(childAt) + m416e());
                break;
            }
        }
        i = i2;
        i = Math.max(0, i);
        this.f570c = i;
        return i;
    }

    final void m415d() {
        if (this.f574g != null) {
            int size = this.f574g.size();
            for (int i = 0; i < size; i++) {
                C0147f c0147f = (C0147f) this.f574g.get(i);
                if (c0147f != null) {
                    c0147f.m778a();
                }
            }
        }
    }

    protected int[] onCreateDrawableState(int i) {
        if (this.f577j == null) {
            this.f577j = new int[2];
        }
        int[] iArr = this.f577j;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i);
        iArr[0] = this.f575h ? C0117b.state_collapsible : -C0117b.state_collapsible;
        int i2 = (this.f575h && this.f576i) ? C0117b.state_collapsed : -C0117b.state_collapsed;
        iArr[1] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            cs.m776a(this, f);
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int m416e() {
        return this.f573f != null ? this.f573f.m2023b() : 0;
    }

    protected /* synthetic */ LinearLayout.LayoutParams m38281generateLayoutParams(LayoutParams layoutParams) {
        return m410a(layoutParams);
    }

    protected /* synthetic */ LinearLayout.LayoutParams m38280generateDefaultLayoutParams() {
        return new C0146e();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0146e();
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m410a(layoutParams);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0146e(getContext(), attributeSet);
    }
}
