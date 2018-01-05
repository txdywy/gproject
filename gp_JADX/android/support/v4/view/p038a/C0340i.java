package android.support.v4.view.p038a;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public final class C0340i {
    public final AccessibilityRecord f1838a;

    @Deprecated
    public C0340i(Object obj) {
        this.f1838a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public final void m1790a(View view) {
        this.f1838a.setSource(view);
    }

    @Deprecated
    public final int hashCode() {
        return this.f1838a == null ? 0 : this.f1838a.hashCode();
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0340i c0340i = (C0340i) obj;
        if (this.f1838a == null) {
            if (c0340i.f1838a != null) {
                return false;
            }
            return true;
        } else if (this.f1838a.equals(c0340i.f1838a)) {
            return true;
        } else {
            return false;
        }
    }
}
