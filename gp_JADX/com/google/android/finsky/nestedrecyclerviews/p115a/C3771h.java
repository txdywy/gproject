package com.google.android.finsky.nestedrecyclerviews.p115a;

import android.support.v7.widget.RecyclerView;

final class C3771h implements C3765b {
    public final /* synthetic */ C3769f f18980a;

    C3771h(C3769f c3769f) {
        this.f18980a = c3769f;
    }

    public final void mo3735a(RecyclerView recyclerView) {
        C3769f c3769f = this.f18980a;
        C3769f.m17916b(recyclerView);
        if (c3769f.f18964e != recyclerView) {
            c3769f.f18964e = recyclerView;
            if (c3769f.f18968i != null) {
                for (int size = c3769f.f18968i.size() - 1; size >= 0; size--) {
                    ((C1062m) c3769f.f18968i.get(size)).mo1356a(recyclerView);
                }
            }
        }
    }
}
