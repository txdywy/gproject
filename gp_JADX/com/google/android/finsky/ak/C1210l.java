package com.google.android.finsky.ak;

import com.google.android.finsky.utils.FinskyLog;
import java.util.List;
import java.util.concurrent.Callable;

final class C1210l implements Callable {
    public final /* synthetic */ C1215q f7330a;
    public final /* synthetic */ String f7331b;
    public final /* synthetic */ C1205h f7332c;

    C1210l(C1205h c1205h, C1215q c1215q, String str) {
        this.f7332c = c1205h;
        this.f7330a = c1215q;
        this.f7331b = str;
    }

    private final Integer m7184a() {
        this.f7332c.f7317c.f7305c.getWritableDatabase().beginTransaction();
        try {
            Integer valueOf;
            List<Object> d = this.f7332c.m7180d(this.f7330a);
            if (d.isEmpty()) {
                valueOf = Integer.valueOf(0);
            } else {
                C1215q a = new C1215q().m7192a("pk", (List) d);
                int delete = this.f7332c.f7317c.f7305c.getWritableDatabase().delete(this.f7332c.f7318d, a.f7339a.toString(), a.m7196a());
                if (delete != d.size()) {
                    FinskyLog.m21669e("Only deleted some records. %d out of %d in %s", Integer.valueOf(delete), Integer.valueOf(d.size()), this.f7332c.f7318d);
                }
                for (Object a2 : d) {
                    this.f7332c.m7169a(a2, null, "delete", this.f7331b);
                }
                this.f7332c.f7317c.f7305c.getWritableDatabase().setTransactionSuccessful();
                valueOf = Integer.valueOf(delete);
                this.f7332c.f7317c.f7305c.getWritableDatabase().endTransaction();
            }
            return valueOf;
        } finally {
            this.f7332c.f7317c.f7305c.getWritableDatabase().endTransaction();
        }
    }

    public final /* synthetic */ Object call() {
        return m7184a();
    }
}
