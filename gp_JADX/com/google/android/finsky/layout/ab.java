package com.google.android.finsky.layout;

import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;
import com.google.android.finsky.utils.FinskyLog;

final class ab implements Runnable {
    public final /* synthetic */ EpisodeSnippet f18426a;

    ab(EpisodeSnippet episodeSnippet) {
        this.f18426a = episodeSnippet;
    }

    public final void run() {
        int[] iArr = new int[2];
        this.f18426a.getLocationInWindow(iArr);
        int i = iArr[1];
        ViewParent parent = this.f18426a.getParent();
        while (!(parent instanceof RecyclerView)) {
            parent = parent.getParent();
            if (parent == null) {
                FinskyLog.m21667d("Found no suitable parent.", new Object[0]);
                return;
            }
        }
        RecyclerView recyclerView = (RecyclerView) parent;
        recyclerView.getLocationInWindow(iArr);
        recyclerView.b_(0, i - iArr[1]);
    }
}
