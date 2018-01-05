package com.google.android.finsky.headerlistlayout;

import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.p184e.C3163d;
import com.squareup.leakcanary.C7582R;

final class C3164e implements C3163d {
    public final /* synthetic */ FinskyHeaderListLayout f16381a;

    C3164e(FinskyHeaderListLayout finskyHeaderListLayout) {
        this.f16381a = finskyHeaderListLayout;
    }

    public final View mo3336a() {
        return this.f16381a;
    }

    public final View mo3339b() {
        return this.f16381a.f16333e;
    }

    public final ViewGroup mo3340c() {
        return this.f16381a.getCurrentListView();
    }

    public final View mo3341d() {
        return this.f16381a.f16341m;
    }

    public final View mo3342e() {
        return this.f16381a.f16334f;
    }

    public final View mo3337a(float f, float f2) {
        int childCount = this.f16381a.getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            View childAt = this.f16381a.getChildAt(this.f16381a.getChildDrawingOrder(childCount, i));
            if (childAt.getId() == C7582R.id.play_header_status_bar_underlay || !FinskyHeaderListLayout.m16070a(childAt, f, f2)) {
                i--;
            } else {
                if (childAt.getId() == C7582R.id.search_results) {
                    View findViewById = childAt.findViewById(C7582R.id.clear_family_search_filter);
                    if (findViewById.isShown() && FinskyHeaderListLayout.m16070a(findViewById, (f - ((float) childAt.getLeft())) - ai.m1848f(childAt), (f2 - ((float) childAt.getTop())) - ai.m1850g(childAt))) {
                        return findViewById;
                    }
                }
                return childAt;
            }
        }
        return null;
    }

    public final int mo3343f() {
        return this.f16381a.f16336h;
    }

    public final boolean mo3338a(View view) {
        return view.getId() == C7582R.id.play_header_spacer;
    }

    public final int mo3344g() {
        return this.f16381a.getTabBarHeight() + this.f16381a.getSubNavHeight();
    }

    public final void mo3345h() {
        m16105a(0);
    }

    public final void mo3346i() {
        m16105a(1);
    }

    public final void mo3347j() {
        m16105a(2);
    }

    public final void mo3348k() {
        m16105a(this.f16381a.getLastSnapControlsWasDown() ? 1 : 2);
    }

    private final void m16105a(int i) {
        boolean z = true;
        this.f16381a.a(i, true);
        if (this.f16381a.f16338j != null) {
            C3161c c3161c = this.f16381a.f16338j;
            if (i == 0) {
                z = false;
            }
            c3161c.f16375l = z;
        }
    }

    public final int mo3349l() {
        return this.f16381a.getActionBarHeight() + this.f16381a.getTabBarHeight();
    }

    public final int mo3350m() {
        return (int) (((float) this.f16381a.f16335g.getBottom()) + this.f16381a.getControlsContainerTranslationY());
    }
}
