package com.google.android.finsky.layout.actionbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.Behavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.aq;
import android.support.v4.view.ai;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.vending.C0629a;

public class FinskySearchAppBarBehavior extends Behavior {
    public boolean f18428r;
    public boolean f18429s;
    public int f18430t;
    public int f18431u = 0;
    public FinskySearchToolbar f18432v;

    public FinskySearchAppBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.FinskySearchAppBar_Behavior_Params);
        this.f18430t = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final boolean mo3575a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
        FinskySearchToolbar a = m17354a(appBarLayout);
        View view = (View) a.getParent();
        if (((C3666i) ((aq) appBarLayout.getLayoutParams()).f811r) == null) {
            ((aq) appBarLayout.getLayoutParams()).f811r = new C3666i();
        }
        if (this.f18431u == 0 || view.getLayoutParams().height != -1) {
            this.f18431u = view.getLayoutParams().height;
        }
        if (m17355a(a)) {
            view.getLayoutParams().height = -1;
        } else if (view.getLayoutParams().height != this.f18431u) {
            view.getLayoutParams().height = this.f18431u;
        }
        return super.mo3575a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
    }

    public final boolean mo3574a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        boolean a = super.mo3574a(coordinatorLayout, appBarLayout, i);
        if (this.f18428r && appBarLayout.getChildCount() > 0) {
            View childAt = appBarLayout.getChildAt(0);
            if (childAt != null) {
                int g = ai.f1848a.mo395g(childAt);
                if (childAt.getBottom() + mo86c() == g) {
                    a_(g - appBarLayout.getTotalScrollRange());
                }
            }
            this.f18428r = false;
        }
        return a;
    }

    private static boolean m17355a(FinskySearchToolbar finskySearchToolbar) {
        if (finskySearchToolbar.l()) {
            boolean z;
            if (!finskySearchToolbar.l() || (!(finskySearchToolbar.af && finskySearchToolbar.getSearchView().s.a()) && (finskySearchToolbar.af || !finskySearchToolbar.getActionView().s.a()))) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.layout.actionbar.FinskySearchToolbar m17354a(android.support.design.widget.AppBarLayout r4) {
        /*
        r3 = this;
        r0 = r3.f18432v;
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r0 = r3.f18430t;
        if (r0 == 0) goto L_0x001d;
    L_0x0008:
        r0 = r3.f18430t;
        r0 = r4.findViewById(r0);
        r0 = (com.google.android.finsky.layout.actionbar.FinskySearchToolbar) r0;
        r1 = r3;
    L_0x0011:
        r1.f18432v = r0;
    L_0x0013:
        r0 = r3.f18432v;
        return r0;
    L_0x0016:
        r2 = r0 instanceof android.view.ViewGroup;
        if (r2 == 0) goto L_0x0031;
    L_0x001a:
        r0 = (android.view.ViewGroup) r0;
        r4 = r0;
    L_0x001d:
        r0 = 0;
        r1 = r0;
    L_0x001f:
        r0 = r4.getChildCount();
        if (r1 >= r0) goto L_0x0035;
    L_0x0025:
        r0 = r4.getChildAt(r1);
        r2 = r0 instanceof com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
        if (r2 == 0) goto L_0x0016;
    L_0x002d:
        r0 = (com.google.android.finsky.layout.actionbar.FinskySearchToolbar) r0;
        r1 = r3;
        goto L_0x0011;
    L_0x0031:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x001f;
    L_0x0035:
        r0 = 0;
        r1 = r3;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.actionbar.FinskySearchAppBarBehavior.a(android.support.design.widget.AppBarLayout):com.google.android.finsky.layout.actionbar.FinskySearchToolbar");
    }

    public final void mo3573a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
        super.mo3573a(coordinatorLayout, appBarLayout, parcelable);
        this.f18428r = true;
    }

    public final /* synthetic */ boolean mo70a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        return !m17355a(m17354a(appBarLayout)) && super.mo70a(coordinatorLayout, appBarLayout, motionEvent);
    }

    public final /* synthetic */ boolean mo3576a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        float f3;
        boolean z2;
        AppBarLayout appBarLayout = (AppBarLayout) view;
        if ((f2 <= 0.0f || this.f18429s) && (f2 >= 0.0f || !this.f18429s)) {
            f3 = f2;
        } else {
            f3 = f2 * -1.0f;
        }
        int scaledMinimumFlingVelocity = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledMinimumFlingVelocity() * -10;
        if (!(view2 instanceof RecyclerView) || f3 >= ((float) scaledMinimumFlingVelocity)) {
            z2 = z;
        } else {
            boolean z3;
            if (RecyclerView.m262d(((RecyclerView) view2).getChildAt(0)) > 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = z3;
        }
        return super.mo3576a(coordinatorLayout, (View) appBarLayout, view2, f, f3, z2);
    }

    public final /* synthetic */ void mo94a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        super.mo94a(coordinatorLayout, (View) (AppBarLayout) view, view2, i, i2, iArr);
        this.f18429s = i2 > 0;
    }
}
