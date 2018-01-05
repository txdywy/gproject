package com.google.android.youtube.player.internal;

public abstract class aa {
    public Object f33835a;

    public aa(C6850x c6850x, Object obj) {
        this.f33835a = obj;
        synchronized (c6850x.f33872l) {
            c6850x.f33872l.add(this);
        }
    }

    protected abstract void mo5673a(Object obj);
}
