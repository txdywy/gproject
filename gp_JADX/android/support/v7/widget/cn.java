package android.support.v7.widget;

final class cn extends fe {
    public final /* synthetic */ cl f3325a;

    cn(cl clVar) {
        this.f3325a = clVar;
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        cl clVar = this.f3325a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = clVar.f3318u.computeVerticalScrollRange();
        int i3 = clVar.f3317t;
        boolean z = computeVerticalScrollRange - i3 > 0 && clVar.f3317t >= clVar.f3300c;
        clVar.f3319v = z;
        int computeHorizontalScrollRange = clVar.f3318u.computeHorizontalScrollRange();
        int i4 = clVar.f3316s;
        if (computeHorizontalScrollRange - i4 <= 0 || clVar.f3316s < clVar.f3300c) {
            z = false;
        } else {
            z = true;
        }
        clVar.f3320w = z;
        if (clVar.f3319v || clVar.f3320w) {
            if (clVar.f3319v) {
                clVar.f3311n = (int) (((((float) computeVerticalScrollOffset) + (((float) i3) / 2.0f)) * ((float) i3)) / ((float) computeVerticalScrollRange));
                clVar.f3310m = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (clVar.f3320w) {
                clVar.f3314q = (int) (((((float) computeHorizontalScrollOffset) + (((float) i4) / 2.0f)) * ((float) i4)) / ((float) computeHorizontalScrollRange));
                clVar.f3313p = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            if (clVar.f3321x == 0 || clVar.f3321x == 1) {
                clVar.m3418a(1);
            }
        } else if (clVar.f3321x != 0) {
            clVar.m3418a(0);
        }
    }
}
