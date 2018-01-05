package com.google.android.finsky.billing.b;

import android.content.Context;
import android.content.Loader;
import android.os.Bundle;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.c.a;
import com.google.android.finsky.dialogbuilder.b.a;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.android.finsky.dialogbuilder.b.l;
import com.google.android.finsky.dialogbuilder.f;
import com.google.android.finsky.dialogbuilder.h;
import com.google.android.play.dfe.api.DfeResponseVerifier;

public final class com.google.android.finsky.billing.b.m implements LoaderManager$LoaderCallbacks
{

    public final Context a;
    public final com.google.android.finsky.api.c b;
    public final com.google.android.finsky.billing.b.d c;
    public final com.google.android.finsky.billing.c.a d;
    public final com.google.android.finsky.billing.b.n e;
    public final com.google.android.finsky.dialogbuilder.b.a f;
    public final com.google.android.finsky.dialogbuilder.b.h g;
    public final com.google.android.finsky.billing.b.f h;
    public final com.google.android.finsky.dialogbuilder.b.l i;
    public final DfeResponseVerifier j;
    public final com.google.android.finsky.ba.e k;
    public com.google.android.finsky.dialogbuilder.f l;
    public com.google.android.finsky.dialogbuilder.h m;

    m(Context p0, com.google.android.finsky.api.c p1, DfeResponseVerifier p2, com.google.android.finsky.billing.b.d p3, com.google.android.finsky.billing.c.a p4, com.google.android.finsky.billing.b.n p5, com.google.android.finsky.dialogbuilder.b.a p6, com.google.android.finsky.dialogbuilder.b.h p7, com.google.android.finsky.billing.b.f p8, com.google.android.finsky.dialogbuilder.b.l p9, com.google.android.finsky.ba.e p10) {
        this.a = p0;
        this.b = p1;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        this.j = p2;
        this.k = p10;
    }

    public final Loader onCreateLoader(int p0, Bundle p1) {
        return new com.google.android.finsky.billing.b.i(this.a, this.b, this.j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.k);
    }

    public final void onLoadFinished(Loader p0, Object p1) {
        if (this.m != 0) {
            if (p0 instanceof com.google.android.finsky.billing.b.i && ((com.google.android.finsky.billing.b.i)p0).a())
                this.l.g();
            else
                this.m.a();
        }
    }

    public final void onLoaderReset(Loader p0) {
    }

}
