package com.google.android.libraries.performance.primes;

import com.google.android.libraries.performance.primes.p336h.C5984a;

public final class cv {
    public final C5984a f29900a;
    public final dp f29901b;
    public final ee f29902c;
    public final cz f29903d;
    public final ds f29904e;
    public final dt f29905f;
    public final dm f29906g;
    public final ef f29907h;
    public final ct f29908i;
    public final dr f29909j;
    public final dg f29910k;
    public final cy f29911l;

    public cv(C5984a c5984a, dp dpVar, ee eeVar, cz czVar, ds dsVar, dt dtVar, dm dmVar, ef efVar, ct ctVar, dr drVar, dg dgVar, cy cyVar) {
        if (c5984a == null) {
            c5984a = C5984a.f29867a;
        }
        this.f29900a = c5984a;
        if (dpVar == null || dpVar.f29985d <= 0) {
            this.f29901b = dp.f29983b;
        } else {
            this.f29901b = dpVar;
        }
        if (eeVar == null || eeVar.f30030c <= 0) {
            this.f29902c = ee.f30028a;
        } else {
            this.f29902c = eeVar;
        }
        if (czVar == null) {
            this.f29903d = cz.f29929a;
        } else {
            this.f29903d = czVar;
        }
        if (dsVar == null) {
            this.f29904e = ds.f29992a;
        } else {
            this.f29904e = dsVar;
        }
        if (dtVar == null) {
            this.f29905f = dt.f29993a;
        } else {
            this.f29905f = dtVar;
        }
        if (dmVar == null) {
            this.f29906g = dm.f29971a;
        } else {
            this.f29906g = dmVar;
        }
        if (efVar == null) {
            this.f29907h = ef.f30031a;
        } else {
            this.f29907h = efVar;
        }
        if (ctVar == null) {
            this.f29908i = ct.f29896a;
        } else {
            this.f29908i = ctVar;
        }
        if (drVar == null) {
            this.f29909j = dr.f29989a;
        } else {
            this.f29909j = drVar;
        }
        if (dgVar == null) {
            this.f29910k = dg.f29950a;
        } else {
            this.f29910k = dgVar;
        }
        if (cyVar == null || cyVar.f29927d <= 0 || cyVar.f29926c <= 0 || cyVar.f29928e < 100) {
            this.f29911l = cy.f29924a;
        } else {
            this.f29911l = cyVar;
        }
    }
}
