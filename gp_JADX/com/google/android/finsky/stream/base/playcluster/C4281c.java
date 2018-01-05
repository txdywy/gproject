package com.google.android.finsky.stream.base.playcluster;

import com.google.android.finsky.playcard.C3906g;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public final class C4281c {
    public int f21626a;
    public int f21627b;
    public int f21628c;
    public List f21629d = new ArrayList();
    public boolean f21630e;
    public boolean f21631f;
    public C3906g f21632g;
    public int f21633h;
    public boolean f21634i;

    public static int m19883a(int i, boolean z) {
        switch (i) {
            case 2:
                return 0;
            case 3:
                return z ? 2 : 1;
            case 4:
                return z ? 4 : 3;
            case 5:
                return 5;
            default:
                FinskyLog.m21669e("Unsupported number of columns %d", Integer.valueOf(i));
                return 0;
        }
    }

    public C4281c(int i, int i2) {
        this.f21626a = i;
        this.f21627b = i2;
        this.f21628c = i;
    }

    public final C4281c m19885a(C3906g c3906g, int i) {
        this.f21629d.add(new C4282d(c3906g, i));
        return this;
    }

    public final int m19884a() {
        return this.f21629d.size();
    }

    public final C4282d m19886a(int i) {
        return (C4282d) this.f21629d.get(i);
    }
}
