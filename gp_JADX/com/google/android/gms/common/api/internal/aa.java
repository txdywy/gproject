package com.google.android.gms.common.api.internal;

abstract class aa implements Runnable {
    public /* synthetic */ C5075p f25640b;

    aa(C5075p c5075p) {
        this.f25640b = c5075p;
    }

    protected abstract void mo4607a();

    public void run() {
        this.f25640b.f25879b.lock();
        try {
            if (!Thread.interrupted()) {
                mo4607a();
                this.f25640b.f25879b.unlock();
            }
        } catch (RuntimeException e) {
            ak akVar = this.f25640b.f25878a;
            akVar.f25683e.sendMessage(akVar.f25683e.obtainMessage(2, e));
        } finally {
            this.f25640b.f25879b.unlock();
        }
    }
}
