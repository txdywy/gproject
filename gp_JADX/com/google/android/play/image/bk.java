package com.google.android.play.image;

import java.util.Iterator;

final class bk implements Iterable {
    public final /* synthetic */ CharSequence f32065a;
    public final /* synthetic */ bh f32066b;

    bk(bh bhVar, CharSequence charSequence) {
        this.f32066b = bhVar;
        this.f32065a = charSequence;
    }

    public final Iterator iterator() {
        return this.f32066b.f32057b.mo5406a(this.f32066b, this.f32065a);
    }
}
