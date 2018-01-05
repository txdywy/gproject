package android.support.design.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

public final class cj {
    public Drawable f936a;
    public CharSequence f937b;
    public CharSequence f938c;
    public int f939d = -1;
    public View f940e;
    public TabLayout f941f;
    public cl f942g;

    cj() {
    }

    public final cj m754a(CharSequence charSequence) {
        this.f937b = charSequence;
        m756b();
        return this;
    }

    public final void m755a() {
        if (this.f941f == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        this.f941f.m527a(this, true);
    }

    final void m756b() {
        if (this.f942g != null) {
            this.f942g.m761a();
        }
    }
}
