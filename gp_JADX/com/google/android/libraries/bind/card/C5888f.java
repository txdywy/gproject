package com.google.android.libraries.bind.card;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;

public final class C5888f extends fe {
    public int f29409a;
    public int f29410b;
    public int f29411c;

    protected C5888f() {
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        if (computeVerticalScrollRange != 0 && recyclerView.getHeight() != 0) {
            if (computeVerticalScrollOffset == 0) {
                this.f29411c = 0;
                this.f29409a = computeVerticalScrollRange;
                this.f29410b = computeVerticalScrollOffset;
            } else if (this.f29409a != computeVerticalScrollRange) {
                BindRecyclerView bindRecyclerView = (BindRecyclerView) recyclerView;
                computeVerticalScrollRange = this.f29411c;
                int i3 = this.f29410b;
                computeVerticalScrollOffset = this.f29409a;
                float computeVerticalScrollOffset2 = ((float) (computeVerticalScrollRange * bindRecyclerView.computeVerticalScrollOffset())) / ((float) i3);
                this.f29409a = bindRecyclerView.computeVerticalScrollRange();
                BindRecyclerView.aG.m27307a("Vertical scroll range changed from %d to %d.", Integer.valueOf(computeVerticalScrollOffset), Integer.valueOf(r6));
                computeVerticalScrollOffset = (Float.isNaN(computeVerticalScrollOffset2) || Float.isInfinite(computeVerticalScrollOffset2)) ? 0 : 1;
                if (computeVerticalScrollOffset != 0) {
                    BindRecyclerView.aG.m27307a("oldVerticalScrollPx: %d, newVerticalScrollPx: %f\noldVerticalScrollOffset: %d, newVerticalScrollOffset: %d", Integer.valueOf(computeVerticalScrollRange), Float.valueOf(computeVerticalScrollOffset2), Integer.valueOf(i3), Integer.valueOf(r5));
                    this.f29411c = (int) computeVerticalScrollOffset2;
                }
            } else {
                this.f29411c = Math.max(0, this.f29411c + i2);
                this.f29410b = computeVerticalScrollOffset;
            }
        }
    }
}
