package android.support.v4.app;

import android.content.Intent;

final class bq implements br {
    public final Intent f1432a;
    public final int f1433b;
    public final /* synthetic */ bm f1434c;

    bq(bm bmVar, Intent intent, int i) {
        this.f1434c = bmVar;
        this.f1432a = intent;
        this.f1433b = i;
    }

    public final Intent mo307a() {
        return this.f1432a;
    }

    public final void mo308b() {
        this.f1434c.stopSelf(this.f1433b);
    }
}
