package com.google.android.finsky.activities;

import android.os.Handler;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.activities.gi implements Runnable
{

    public final com.google.android.finsky.activities.gj a;
    public final int b;
    public Handler c;
    public List d;
    public boolean e;
    public int f;
    public boolean g;

    gi(int p0, com.google.android.finsky.activities.gj p1) {
        this.c = new Handler();
        this.d = new ArrayList();
        this.f = 0;
        this.b = p0;
        this.a = p1;
    }

    final void a() {
        com.google.android.finsky.utils.bb.a();
        v1 = 0;
        while (v1 < this.d.size()) {
            ((com.google.android.finsky.activities.ek)this.d.get(v1)).c();
            v1 = v1 + 1;
        }
        this.d.clear();
        this.e = 0;
    }

    public final void run() {
        if (this.f == 0)
            this.a();
    }

}
