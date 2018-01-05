package android.support.p027e;

final class bb extends au {
    public az f1080a;

    bb(az azVar) {
        this.f1080a = azVar;
    }

    public final void mo203c() {
        if (!this.f1080a.f1078d) {
            this.f1080a.m861c();
            this.f1080a.f1078d = true;
        }
    }

    public final void mo201a(an anVar) {
        az azVar = this.f1080a;
        azVar.f1077c--;
        if (this.f1080a.f1077c == 0) {
            this.f1080a.f1078d = false;
            this.f1080a.m863d();
        }
        anVar.mo213b((at) this);
    }
}
