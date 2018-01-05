package io.reactivex.internal.p564g;

final class af implements Runnable {
    public final ad f40392a;
    public final /* synthetic */ ae f40393b;

    af(ae aeVar, ad adVar) {
        this.f40393b = aeVar;
        this.f40392a = adVar;
    }

    public final void run() {
        this.f40392a.f40387d = true;
        this.f40393b.f40388a.remove(this.f40392a);
    }
}
