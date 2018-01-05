package com.google.android.play.layout;

import java.util.ArrayList;
import java.util.List;

public final class C6391e {
    public static C6391e f32243b = new C6391e();
    public List f32244a = new ArrayList();

    private C6391e() {
    }

    public final synchronized void m29326a(C6392f c6392f) {
        this.f32244a.add(c6392f);
    }

    final synchronized void m29325a(C6388d c6388d) {
        for (int size = this.f32244a.size() - 1; size >= 0; size--) {
            ((C6392f) this.f32244a.get(size)).m29328a(c6388d);
        }
    }

    final synchronized void m29327b(C6388d c6388d) {
        for (int size = this.f32244a.size() - 1; size >= 0; size--) {
            ((C6392f) this.f32244a.get(size)).m29329b(c6388d);
        }
    }
}
