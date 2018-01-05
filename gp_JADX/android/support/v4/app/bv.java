package android.support.v4.app;

import android.content.ComponentName;
import android.content.Intent;

abstract class bv {
    public final ComponentName f1424f;
    public boolean f1425g;
    public int f1426h;

    bv(ComponentName componentName) {
        this.f1424f = componentName;
    }

    abstract void mo304a(Intent intent);

    final void m1354a(int i) {
        if (!this.f1425g) {
            this.f1425g = true;
            this.f1426h = i;
        } else if (this.f1426h != i) {
            throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f1426h);
        }
    }

    public void mo303a() {
    }

    public void mo305b() {
    }

    public void mo306c() {
    }
}
