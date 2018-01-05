package com.google.android.finsky.fastscroll;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fr;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.finsky.utils.ac;

public final class C3104c implements OnGlobalLayoutListener, C3103b {
    public final RecyclerView f16053a;
    public float f16054b = 0.0f;
    public boolean f16055c = false;
    public int f16056d;

    public C3104c(RecyclerView recyclerView) {
        this.f16053a = recyclerView;
    }

    public final boolean mo3316a() {
        return this.f16055c;
    }

    public final float mo3317b() {
        return ((float) m15903g()) - this.f16054b;
    }

    public final float mo3319c() {
        return m15902f() - this.f16054b;
    }

    public final void mo3314a(float f) {
        float b = (mo3317b() * f) + this.f16054b;
        int i = (int) b;
        int a = m15900a(i);
        i = m15901a(i, true);
        b = (b - ((float) i)) / ((float) a);
        if (f == 1.0f) {
            this.f16053a.mo2963c(m15903g() - 1);
        } else if (f == 0.0f) {
            this.f16053a.mo2963c(0);
        } else {
            int h;
            fr f2 = this.f16053a.m302f(i);
            if (f2 == null) {
                h = (int) (b * ((float) m15904h()));
            } else {
                h = (int) (b * ((float) f2.f3211a.getHeight()));
            }
            C3105d.m15914a(this.f16053a.getLayoutManager(), i, this.f16053a.getHeight() - h);
        }
    }

    public final void mo3320d() {
        this.f16053a.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void mo3321e() {
        this.f16053a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final void mo3315a(ac acVar) {
        float f = this.f16054b;
        acVar.f24032b.put("LastVisibleViewPositionFastScrollModelImpl.initialOffset", Float.valueOf(f));
        boolean z = this.f16055c;
        acVar.f24032b.put("LastVisibleViewPositionFastScrollModelImpl.isLastChildItemNotFullyVisible", Boolean.valueOf(z));
    }

    public final void mo3318b(ac acVar) {
        float floatValue;
        boolean booleanValue;
        String str = "LastVisibleViewPositionFastScrollModelImpl.initialOffset";
        if (acVar.f24032b.containsKey(str)) {
            floatValue = ((Float) acVar.f24032b.get(str)).floatValue();
        } else {
            floatValue = acVar.f24033c.getFloat(str);
        }
        this.f16054b = floatValue;
        str = "LastVisibleViewPositionFastScrollModelImpl.isLastChildItemNotFullyVisible";
        if (acVar.f24032b.containsKey(str)) {
            booleanValue = ((Boolean) acVar.f24032b.get(str)).booleanValue();
        } else {
            booleanValue = acVar.f24033c.getBoolean(str);
        }
        this.f16055c = booleanValue;
    }

    public final void onGlobalLayout() {
        if (this.f16053a.getLayoutManager() != null && this.f16053a.getLayoutManager().mo736b(0) != null) {
            float f = m15902f();
            new StringBuilder(61).append("Initial offset is ").append(f).append(". Total count is ").append(m15903g());
            this.f16054b = f;
            m15904h();
            if (this.f16055c) {
                this.f16053a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    private final float m15902f() {
        float f;
        float f2 = 1.0f;
        int b = C3105d.m15915b(this.f16053a.getLayoutManager());
        int a = m15900a(b);
        int a2 = m15901a(b, true);
        fr f3 = this.f16053a.m302f(b);
        if (f3 == null) {
            f = 0.0f;
        } else {
            f = ((float) (this.f16053a.getBottom() - f3.f3211a.getTop())) / ((float) f3.f3211a.getHeight());
        }
        if (f <= 1.0f) {
            this.f16055c = true;
            f2 = f;
        }
        return (f2 * ((float) a)) + ((float) a2);
    }

    private final int m15903g() {
        return this.f16053a.getAdapter().mo1039a();
    }

    private final int m15900a(int i) {
        return (m15901a(i, false) - m15901a(i, true)) + 1;
    }

    private final int m15901a(int i, boolean z) {
        fr f = this.f16053a.m302f(i);
        if (f != null) {
            int i2 = z ? -1 : 1;
            fr f2 = this.f16053a.m302f(i + i2);
            while (f2 != null && f.f3211a.getTop() == f2.f3211a.getTop()) {
                i += i2;
                f2 = this.f16053a.m302f(i + i2);
            }
        }
        return i;
    }

    private final int m15904h() {
        fr f = this.f16053a.m302f(C3105d.m15915b(this.f16053a.getLayoutManager()));
        if (f != null) {
            this.f16056d = f.f3211a.getHeight();
        }
        return this.f16056d;
    }
}
