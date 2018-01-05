package com.google.android.gms.internal;

import java.util.Iterator;

final class gp implements Iterator {
    public Iterator f26792a = this.f26793b.f27819a.keySet().iterator();
    public /* synthetic */ zzcqt f26793b;

    gp(zzcqt com_google_android_gms_internal_zzcqt) {
        this.f26793b = com_google_android_gms_internal_zzcqt;
    }

    public final boolean hasNext() {
        return this.f26792a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f26792a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
