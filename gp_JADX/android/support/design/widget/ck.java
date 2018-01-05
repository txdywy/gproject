package android.support.design.widget;

import android.support.v4.view.bi;
import java.lang.ref.WeakReference;

public final class ck implements bi {
    public final WeakReference f943a;
    public int f944b;
    public int f945c;

    public ck(TabLayout tabLayout) {
        this.f943a = new WeakReference(tabLayout);
    }

    public final void d_(int i) {
        this.f944b = this.f945c;
        this.f945c = i;
    }

    public final void mo179a(int i, float f, int i2) {
        boolean z = false;
        TabLayout tabLayout = (TabLayout) this.f943a.get();
        if (tabLayout != null) {
            boolean z2;
            if (this.f945c != 2 || this.f944b == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(this.f945c == 2 && this.f944b == 0)) {
                z = true;
            }
            tabLayout.m525a(i, f, z2, z);
        }
    }

    public final void mo180b(int i) {
        TabLayout tabLayout = (TabLayout) this.f943a.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
            boolean z = this.f945c == 0 || (this.f945c == 2 && this.f944b == 0);
            tabLayout.m527a(tabLayout.m523a(i), z);
        }
    }
}
