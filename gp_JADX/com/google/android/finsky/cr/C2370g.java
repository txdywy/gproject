package com.google.android.finsky.cr;

import java.util.Map;

final class C2370g implements Runnable {
    public final /* synthetic */ Map f11627a;
    public final /* synthetic */ C2369f f11628b;

    C2370g(C2369f c2369f, Map map) {
        this.f11628b = c2369f;
        this.f11627a = map;
    }

    public final void run() {
        C2366c c2366c = this.f11628b.f11626a;
        c2366c.f11618c = this.f11627a;
        int size = c2366c.f11619d.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) c2366c.f11619d.get(i)).run();
        }
        c2366c.f11619d.clear();
    }
}
