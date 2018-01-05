package com.google.android.libraries.play.entertainment.story;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p351m.C6122h;
import com.google.android.play.p184e.C3163d;

final class ak implements C3163d {
    public final /* synthetic */ StoryFlowLayout f30379a;

    ak(StoryFlowLayout storyFlowLayout) {
        this.f30379a = storyFlowLayout;
    }

    public final View mo3336a() {
        return this.f30379a;
    }

    public final View mo3339b() {
        return this.f30379a.m28180b();
    }

    public final ViewGroup mo3340c() {
        return this.f30379a.getCurrentListView();
    }

    public final View mo3341d() {
        return null;
    }

    public final View mo3342e() {
        return null;
    }

    public final View mo3337a(float f, float f2) {
        int childCount = this.f30379a.getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = this.f30379a.getChildAt(this.f30379a.getChildDrawingOrder(childCount, i));
            if (childAt.getId() != C6089g.play_header_status_bar_underlay && C6122h.m28133a(childAt, f, f2)) {
                return childAt;
            }
        }
        return null;
    }

    public final int mo3343f() {
        return 0;
    }

    public final boolean mo3338a(View view) {
        return false;
    }

    public final int mo3344g() {
        return 0;
    }

    public final void mo3345h() {
    }

    public final void mo3346i() {
    }

    public final void mo3347j() {
    }

    public final void mo3348k() {
    }

    public final int mo3349l() {
        return 0;
    }

    public final int mo3350m() {
        return 0;
    }
}
