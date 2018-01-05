package org.chromium.base;

final class C7884a implements Runnable {
    C7884a() {
    }

    public final void run() {
        if (ApplicationStatus.f40482d == null) {
            C7885d c7886b = new C7886b();
            ApplicationStatus.f40482d = c7886b;
            ApplicationStatus.m37782a(c7886b);
        }
    }
}
