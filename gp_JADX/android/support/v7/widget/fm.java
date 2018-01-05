package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

public final class fm {
    public int f3457a;
    public int f3458b;
    public int f3459c;
    public int f3460d;
    public Interpolator f3461e;
    public boolean f3462f;
    public int f3463g;

    public fm() {
        this((byte) 0);
    }

    private fm(byte b) {
        this.f3460d = -1;
        this.f3462f = false;
        this.f3463g = 0;
        this.f3457a = 0;
        this.f3458b = 0;
        this.f3459c = Integer.MIN_VALUE;
        this.f3461e = null;
    }

    final void m3704a(RecyclerView recyclerView) {
        if (this.f3460d >= 0) {
            int i = this.f3460d;
            this.f3460d = -1;
            recyclerView.m296d(i);
            this.f3462f = false;
        } else if (!this.f3462f) {
            this.f3463g = 0;
        } else if (this.f3461e != null && this.f3459c <= 0) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else if (this.f3459c <= 0) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            if (this.f3461e != null) {
                recyclerView.al.m3713a(this.f3457a, this.f3458b, this.f3459c, this.f3461e);
            } else if (this.f3459c == Integer.MIN_VALUE) {
                fq fqVar = recyclerView.al;
                int i2 = this.f3457a;
                int i3 = this.f3458b;
                fqVar.m3712a(i2, i3, fqVar.m3710a(i2, i3));
            } else {
                recyclerView.al.m3712a(this.f3457a, this.f3458b, this.f3459c);
            }
            this.f3463g++;
            if (this.f3463g > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            this.f3462f = false;
        }
    }

    public final void m3702a(int i) {
        this.f3462f = true;
        this.f3458b = i;
    }

    public final void m3703a(int i, int i2, int i3, Interpolator interpolator) {
        this.f3457a = i;
        this.f3458b = i2;
        this.f3459c = i3;
        this.f3461e = interpolator;
        this.f3462f = true;
    }
}
