package com.google.android.finsky.playcard;

final /* synthetic */ class C3904d implements Runnable {
    public final C3903c f19733a;

    C3904d(C3903c c3903c) {
        this.f19733a = c3903c;
    }

    public final void run() {
        C3903c c3903c = this.f19733a;
        for (int size = c3903c.f19710g.size() - 1; size >= 0; size--) {
            ((C3892e) c3903c.f19710g.get(size)).mo3834a();
        }
        c3903c.m18553a(false);
    }
}
