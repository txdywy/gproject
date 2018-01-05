package com.google.android.finsky.ak;

import com.google.android.finsky.utils.FinskyLog;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

final class C1211m implements Callable {
    public final /* synthetic */ C1215q f7333a;
    public final /* synthetic */ String f7334b;
    public final /* synthetic */ C1205h f7335c;

    C1211m(C1205h c1205h, C1215q c1215q, String str) {
        this.f7335c = c1205h;
        this.f7333a = c1215q;
        this.f7334b = str;
    }

    private final List m7185a() {
        this.f7335c.f7317c.f7305c.getWritableDatabase().beginTransaction();
        try {
            List emptyList;
            List<Object> b = this.f7335c.m7176b(this.f7333a, null, null);
            if (b.isEmpty()) {
                emptyList = Collections.emptyList();
            } else {
                if (this.f7335c.f7317c.f7305c.getWritableDatabase().delete(this.f7335c.f7318d, this.f7333a.f7339a.toString(), this.f7333a.m7196a()) != b.size()) {
                    FinskyLog.m21669e("Only deleted some records", new Object[0]);
                }
                for (Object a : b) {
                    this.f7335c.m7169a(this.f7335c.f7321g.mo3197a(a), null, "delete", this.f7334b);
                }
                this.f7335c.f7317c.f7305c.getWritableDatabase().setTransactionSuccessful();
                this.f7335c.f7317c.f7305c.getWritableDatabase().endTransaction();
            }
            return emptyList;
        } finally {
            this.f7335c.f7317c.f7305c.getWritableDatabase().endTransaction();
        }
    }

    public final /* synthetic */ Object call() {
        return m7185a();
    }
}
