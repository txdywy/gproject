package com.google.android.finsky.stream.controllers.view;

import android.support.v4.view.ai;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.view.View;

public final class C4505c extends fe {
    public final /* synthetic */ boolean f23099a;
    public final /* synthetic */ FlatCardMerchClusterView f23100b;

    public C4505c(FlatCardMerchClusterView flatCardMerchClusterView, boolean z) {
        this.f23100b = flatCardMerchClusterView;
        this.f23099a = z;
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        super.mo791a(recyclerView, i, i);
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).m3124j() == 0) {
            int i3;
            View childAt = recyclerView.getChildAt(0);
            if (ai.f1848a.mo400k(this.f23100b) == 0) {
                i3 = -childAt.getLeft();
            } else {
                i3 = childAt.getRight() - recyclerView.getWidth();
            }
            this.f23100b.f22884r = ((float) i3) / ((float) childAt.getWidth());
        } else {
            this.f23100b.f22884r = 1.0f;
        }
        this.f23100b.m21000a(this.f23099a);
    }
}
