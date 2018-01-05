package com.google.android.finsky.playcard;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

public final class C3903c {
    public final Handler f19704a = new Handler(Looper.getMainLooper());
    public final Runnable f19705b = new C3904d(this);
    public int f19706c;
    public int f19707d;
    public int f19708e;
    public boolean f19709f = false;
    public List f19710g = new ArrayList();

    public final void m18552a(int i, int i2, int i3) {
        if (!this.f19709f) {
            if (i == 0 || i2 == 0 || i3 == 0) {
                this.f19706c = 375;
                this.f19707d = 1375;
                this.f19708e = 3125;
            } else {
                this.f19706c = i;
                this.f19707d = this.f19706c + i2;
                this.f19708e = this.f19706c + i3;
            }
            this.f19709f = true;
        }
    }

    final void m18553a(boolean z) {
        if (z) {
            this.f19704a.postDelayed(this.f19705b, (long) this.f19707d);
        } else {
            this.f19704a.postDelayed(this.f19705b, (long) this.f19708e);
        }
    }
}
