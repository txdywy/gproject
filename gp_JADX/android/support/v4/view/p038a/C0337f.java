package android.support.v4.view.p038a;

import android.os.Build.VERSION;
import android.os.Bundle;

public class C0337f {
    public final Object f1836a;

    public C0337f() {
        if (VERSION.SDK_INT >= 19) {
            this.f1836a = new C0339h(this);
        } else if (VERSION.SDK_INT >= 16) {
            this.f1836a = new C0338g(this);
        } else {
            this.f1836a = null;
        }
    }

    public C0337f(Object obj) {
        this.f1836a = obj;
    }

    public C0333b mo457a(int i) {
        return null;
    }

    public boolean mo458a(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0333b mo459b(int i) {
        return null;
    }
}
