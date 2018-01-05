package org.chromium.net.impl;

final class C7963w implements Runnable {
    public final /* synthetic */ CronetUrlRequestContext f40937a;

    C7963w(CronetUrlRequestContext cronetUrlRequestContext) {
        this.f40937a = cronetUrlRequestContext;
    }

    public final void run() {
        CronetLibraryLoader.m37991a();
        synchronized (this.f40937a.f40733b) {
            this.f40937a.nativeInitRequestContextOnInitThread(this.f40937a.f40736e);
        }
    }
}
