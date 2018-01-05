package android.support.v7.widget;

import android.view.View;

public abstract class fl {
    public int f3396g = -1;
    public RecyclerView f3397h;
    public ew f3398i;
    public boolean f3399j;
    public boolean f3400k;
    public View f3401l;
    public final fm f3402m = new fm();

    public abstract void mo815a();

    public abstract void mo816a(int i, int i2, fm fmVar);

    public abstract void mo817a(View view, fo foVar, fm fmVar);

    public abstract void mo818b();

    protected final void m3517d() {
        if (this.f3400k) {
            mo818b();
            this.f3397h.ao.f3464a = -1;
            this.f3401l = null;
            this.f3396g = -1;
            this.f3399j = false;
            this.f3400k = false;
            ew ewVar = this.f3398i;
            if (ewVar.f2948D == this) {
                ewVar.f2948D = null;
            }
            this.f3398i = null;
            this.f3397h = null;
        }
    }

    public final int m3518e() {
        return this.f3397h.f528v.m3060p();
    }
}
