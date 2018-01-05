package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

public final class ca {
    public final Object f1892a;

    private ca(Object obj) {
        this.f1892a = obj;
    }

    public final int m2021a() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1892a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int m2023b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1892a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int m2024c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1892a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int m2025d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1892a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final boolean m2026e() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f1892a).isConsumed();
        }
        return false;
    }

    public final ca m2022a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new ca(((WindowInsets) this.f1892a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ca caVar = (ca) obj;
        if (this.f1892a != null) {
            return this.f1892a.equals(caVar.f1892a);
        }
        if (caVar.f1892a != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1892a == null ? 0 : this.f1892a.hashCode();
    }

    static ca m2019a(Object obj) {
        return obj == null ? null : new ca(obj);
    }

    static Object m2020a(ca caVar) {
        return caVar == null ? null : caVar.f1892a;
    }
}
