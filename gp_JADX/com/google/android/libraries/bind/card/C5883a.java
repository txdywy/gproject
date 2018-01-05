package com.google.android.libraries.bind.card;

import com.google.android.libraries.bind.card.BindRecyclerView.SavedState;
import com.google.android.libraries.bind.p324c.C5875b;

final class C5883a extends C5882d {
    public final /* synthetic */ BindRecyclerView f29401a;

    C5883a(BindRecyclerView bindRecyclerView) {
        this.f29401a = bindRecyclerView;
    }

    public final void mo872a() {
        BindRecyclerView bindRecyclerView = this.f29401a;
        if (bindRecyclerView.aK != null) {
            SavedState savedState = bindRecyclerView.aK;
            bindRecyclerView.aK = null;
            C5875b c5875b = BindRecyclerView.aG;
            String str = "Trying to restore stashed state";
            Object[] objArr = new Object[0];
            if (c5875b.m27308a()) {
                C5875b.f29391b.mo5179a(4, c5875b.f29393c, C5875b.m27306b(str, objArr));
            }
            bindRecyclerView.m27311a(savedState);
        }
    }
}
