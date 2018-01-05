package com.google.android.play.search;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.play.C6361i;
import com.google.android.play.d;
import com.google.android.play.drawer.b;

public class PlaySearchNavigationButton extends ImageView implements C6407o {
    public C6420m f32295a;
    public int f32296b;
    public boolean f32297c;
    public int f32298d;
    public b f32299e;
    public int f32300f;

    public PlaySearchNavigationButton(Context context) {
        this(context, null);
    }

    public PlaySearchNavigationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchNavigationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32300f = 0;
        this.f32299e = new b(context);
        this.f32299e.setColorFilter(new PorterDuffColorFilter(context.getResources().getColor(d.play_search_plate_navigation_button_color), Mode.SRC_IN));
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setImageDrawable(this.f32299e);
        this.f32299e.a(0, 0);
        this.f32298d = C6361i.play_drawer_open;
        setOnClickListener(new C6422p(this));
        m29375b(0);
        m29377a(0, false);
    }

    public void setPlaySearchController(C6420m c6420m) {
        if (this.f32295a != null) {
            this.f32295a.m29447b(this);
        }
        this.f32295a = c6420m;
        this.f32295a.m29442a((C6407o) this);
    }

    public void setIdleModeDrawerIconState(int i) {
        this.f32300f = i;
        m29375b(i);
    }

    public final void mo5425a(int i) {
        if (i == 1) {
            m29375b(this.f32300f);
        } else if (i == 3 || i == 2) {
            m29375b(1);
        }
    }

    public void setBurgerMenuOpenDescription(int i) {
        this.f32298d = i;
        m29377a(this.f32296b, this.f32297c);
    }

    public final void m29377a(int i, boolean z) {
        int i2;
        if (i == 0) {
            if (z) {
                i2 = C6361i.play_drawer_close;
            } else {
                i2 = this.f32298d;
            }
        } else if (this.f32295a == null || this.f32295a.f32362b != 1) {
            i2 = C6361i.play_accessibility_search_plate_back_button;
        } else {
            i2 = C6361i.play_accessibility_search_plate_navigate_up_button;
        }
        setContentDescription(getContext().getText(i2));
    }

    public final void mo5428a(String str, boolean z) {
    }

    public final void mo5426a(C6429w c6429w) {
    }

    public final boolean mo5429b(C6429w c6429w) {
        return false;
    }

    public final void mo5427a(String str) {
    }

    private final void m29375b(int i) {
        if (this.f32296b != i) {
            this.f32299e.a(i, 2);
            m29377a(i, false);
            this.f32296b = i;
        } else if (this.f32300f == 1) {
            m29377a(i, false);
        }
    }
}
