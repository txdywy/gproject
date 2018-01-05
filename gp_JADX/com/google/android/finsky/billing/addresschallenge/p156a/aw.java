package com.google.android.finsky.billing.addresschallenge.p156a;

public final class aw implements Runnable {
    public C1704a f8908a;
    public C1711f f8909b;
    public C1705y f8910c;
    public final /* synthetic */ av f8911d;

    public aw(av avVar, C1704a c1704a, C1711f c1711f, C1705y c1705y) {
        this.f8911d = avVar;
        this.f8908a = c1704a;
        this.f8909b = c1711f;
        this.f8910c = c1705y;
    }

    public final void run() {
        this.f8910c.mo2413a();
        aa aaVar = this.f8911d.f8906a;
        ao aoVar = null;
        if (this.f8908a.f8794k != null) {
            if (az.m9579a(this.f8908a.f8794k)) {
                aoVar = ao.LATIN;
            } else {
                aoVar = ao.LOCAL;
            }
        }
        this.f8911d.m9572a(aoVar, aaVar, C1709d.COUNTRY, this.f8908a.f8784a, this.f8909b);
        if (this.f8909b.m9588a()) {
            aaVar = aaVar.m9520a(this.f8908a.f8784a);
            this.f8911d.m9572a(aoVar, aaVar, C1709d.ADMIN_AREA, this.f8908a.f8787d, this.f8909b);
            if (this.f8909b.m9588a()) {
                aaVar = aaVar.m9520a(this.f8908a.f8787d);
                this.f8911d.m9572a(aoVar, aaVar, C1709d.LOCALITY, this.f8908a.f8788e, this.f8909b);
                if (this.f8909b.m9588a()) {
                    aaVar = aaVar.m9520a(this.f8908a.f8788e);
                    this.f8911d.m9572a(aoVar, aaVar, C1709d.DEPENDENT_LOCALITY, this.f8908a.f8789f, this.f8909b);
                    if (this.f8909b.m9588a()) {
                        aaVar = aaVar.m9520a(this.f8908a.f8789f);
                    }
                }
            }
        }
        String a = az.m9574a("\n", this.f8908a.f8785b, this.f8908a.f8786c);
        this.f8911d.m9572a(aoVar, aaVar, C1709d.POSTAL_CODE, this.f8908a.f8790g, this.f8909b);
        this.f8911d.m9572a(aoVar, aaVar, C1709d.STREET_ADDRESS, a, this.f8909b);
        this.f8911d.m9572a(aoVar, aaVar, C1709d.SORTING_CODE, this.f8908a.f8791h, this.f8909b);
        this.f8911d.m9572a(aoVar, aaVar, C1709d.ORGANIZATION, this.f8908a.f8792i, this.f8909b);
        this.f8911d.m9572a(aoVar, aaVar, C1709d.RECIPIENT, this.f8908a.f8793j, this.f8909b);
        av.m9571a();
        this.f8910c.mo2414b();
    }
}
