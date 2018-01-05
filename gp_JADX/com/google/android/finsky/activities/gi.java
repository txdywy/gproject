package com.google.android.finsky.activities;

import android.os.Handler;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;
import java.util.List;

final class gi implements Runnable {
    public final gj f6849a;
    public final int f6850b;
    public Handler f6851c = new Handler();
    public List f6852d = new ArrayList();
    public boolean f6853e;
    public int f6854f = 0;
    public boolean f6855g;

    gi(int i, gj gjVar) {
        this.f6850b = i;
        this.f6849a = gjVar;
    }

    public final void run() {
        if (this.f6854f == 0) {
            m6596a();
        }
    }

    final void m6596a() {
        bb.m21791a();
        for (int i = 0; i < this.f6852d.size(); i++) {
            ((ek) this.f6852d.get(i)).m6535c();
        }
        this.f6852d.clear();
        this.f6853e = false;
    }
}
