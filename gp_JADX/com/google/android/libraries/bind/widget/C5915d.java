package com.google.android.libraries.bind.widget;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import java.util.HashSet;
import java.util.Set;

public final class C5915d extends fe {
    public final Set f29481a = new HashSet();

    public final void mo2913a(RecyclerView recyclerView, int i) {
        super.mo2913a(recyclerView, i);
        for (fe feVar : this.f29481a) {
            if (feVar != null) {
                feVar.mo2913a(recyclerView, i);
            }
        }
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        super.mo791a(recyclerView, i, i2);
        for (fe feVar : this.f29481a) {
            if (feVar != null) {
                feVar.mo791a(recyclerView, i, i2);
            }
        }
    }
}
