package com.squareup.okhttp.internal;

public abstract class C7615d implements Runnable {
    public final String f39469a;

    public C7615d(String str, Object... objArr) {
        this.f39469a = String.format(str, objArr);
    }

    public abstract void mo6443a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f39469a);
        try {
            mo6443a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
