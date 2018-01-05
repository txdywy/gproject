package android.support.v7.widget;

import java.util.Arrays;

final class cx implements ez {
    public int f3337a;
    public int f3338b;
    public int[] f3339c;
    public int f3340d;

    cx() {
    }

    final void m3430a(RecyclerView recyclerView, boolean z) {
        this.f3340d = 0;
        if (this.f3339c != null) {
            Arrays.fill(this.f3339c, -1);
        }
        ew ewVar = recyclerView.f528v;
        if (recyclerView.f527u != null && ewVar != null && ewVar.f2952H) {
            if (z) {
                if (!recyclerView.f519m.m3917d()) {
                    ewVar.mo727a(recyclerView.f527u.mo1039a(), (ez) this);
                }
            } else if (!recyclerView.m317q()) {
                ewVar.mo726a(this.f3337a, this.f3338b, recyclerView.ao, (ez) this);
            }
            if (this.f3340d > ewVar.f2953I) {
                ewVar.f2953I = this.f3340d;
                ewVar.f2954J = z;
                recyclerView.f517k.m3688b();
            }
        }
    }

    public final void mo792a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        } else {
            int i3 = this.f3340d * 2;
            if (this.f3339c == null) {
                this.f3339c = new int[4];
                Arrays.fill(this.f3339c, -1);
            } else if (i3 >= this.f3339c.length) {
                Object obj = this.f3339c;
                this.f3339c = new int[(i3 * 2)];
                System.arraycopy(obj, 0, this.f3339c, 0, obj.length);
            }
            this.f3339c[i3] = i;
            this.f3339c[i3 + 1] = i2;
            this.f3340d++;
        }
    }

    final boolean m3431a(int i) {
        if (this.f3339c == null) {
            return false;
        }
        int i2 = this.f3340d * 2;
        for (int i3 = 0; i3 < i2; i3 += 2) {
            if (this.f3339c[i3] == i) {
                return true;
            }
        }
        return false;
    }

    final void m3428a() {
        if (this.f3339c != null) {
            Arrays.fill(this.f3339c, -1);
        }
        this.f3340d = 0;
    }
}
