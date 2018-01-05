package com.google.android.play.image;

abstract class bn extends bl {
    public final CharSequence f32061d;
    public final boolean f32062e;
    public int f32063f = 0;

    abstract int mo5408a(int i);

    abstract int mo5409b(int i);

    protected bn(bh bhVar, CharSequence charSequence) {
        this.f32062e = bhVar.f32056a;
        this.f32061d = charSequence;
    }

    protected final /* synthetic */ Object mo5407a() {
        while (this.f32063f != -1) {
            int i = this.f32063f;
            int a = mo5408a(this.f32063f);
            if (a == -1) {
                a = this.f32061d.length();
                this.f32063f = -1;
            } else {
                this.f32063f = mo5409b(a);
            }
            if (this.f32062e) {
                if (i != a) {
                }
            }
            return this.f32061d.subSequence(i, a).toString();
        }
        this.f32059b = bm.DONE;
        return null;
    }
}
