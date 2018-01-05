package com.google.android.finsky.setup;

final class ch implements Runnable {
    public final /* synthetic */ cg f20923a;

    ch(cg cgVar) {
        this.f20923a = cgVar;
    }

    public final void run() {
        cg cgVar = this.f20923a;
        cgVar.f20920c = (cgVar.f20920c + 1) % (cg.f20918a.length + 1);
        if (cgVar.f20920c == 0) {
            cgVar.f20919b.setText("");
        } else {
            cgVar.f20919b.setText(cg.f20918a[cgVar.f20920c - 1]);
        }
        cgVar.f20919b.invalidate();
        if (this.f20923a.f20921d) {
            this.f20923a.f20919b.postDelayed(this, 500);
        }
    }
}
