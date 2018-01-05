package com.google.android.finsky.stream.controllers.view;

import android.support.v4.view.ai;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.view.View;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;

final class C4504b extends fe {
    public final /* synthetic */ FlatCardCreatorAvatarClusterView f23098a;

    C4504b(FlatCardCreatorAvatarClusterView flatCardCreatorAvatarClusterView) {
        this.f23098a = flatCardCreatorAvatarClusterView;
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        float right;
        int width;
        boolean z = true;
        super.mo791a(recyclerView, i, i);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (ai.f1848a.mo400k(this.f23098a) != 1) {
            z = false;
        }
        if (linearLayoutManager.m3124j() == 0) {
            View childAt = recyclerView.getChildAt(0);
            if (z) {
                right = ((float) (childAt.getRight() - this.f23098a.getWidth())) / ((float) childAt.getWidth());
                width = this.f23098a.getWidth() - childAt.getRight();
            } else {
                right = 1.0f - (((float) childAt.getRight()) / ((float) childAt.getWidth()));
                width = childAt.getWidth() - childAt.getRight();
            }
        } else {
            width = ((PlayClusterViewContentV2) recyclerView).getLeadingGapForSnapping();
            if (z) {
                width = -width;
                right = 1.0f;
            } else {
                right = 1.0f;
            }
        }
        FlatCardCreatorAvatarClusterView flatCardCreatorAvatarClusterView = this.f23098a;
        float f = ((float) (-width)) * 0.15f;
        flatCardCreatorAvatarClusterView.f22866k.setTranslationX(f);
        flatCardCreatorAvatarClusterView.f22867l.setTranslationX(f);
        flatCardCreatorAvatarClusterView.f22866k.setAlpha(1.0f - (0.5f * right));
        f = 1.0f - (3.2f * right);
        if (f <= 0.0f) {
            flatCardCreatorAvatarClusterView.f22868m.setClickable(false);
            flatCardCreatorAvatarClusterView.f22868m.setAlpha(0.0f);
            return;
        }
        flatCardCreatorAvatarClusterView.f22868m.setClickable(flatCardCreatorAvatarClusterView.f22874s);
        flatCardCreatorAvatarClusterView.f22868m.setAlpha(f);
    }
}
