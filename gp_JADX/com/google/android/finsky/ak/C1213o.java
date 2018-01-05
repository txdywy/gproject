package com.google.android.finsky.ak;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

final class C1213o implements Callable {
    public final /* synthetic */ List f7336a;
    public final /* synthetic */ String f7337b;
    public final /* synthetic */ C1205h f7338c;

    C1213o(C1205h c1205h, List list, String str) {
        this.f7338c = c1205h;
        this.f7336a = list;
        this.f7337b = str;
    }

    private final List m7187a() {
        this.f7338c.f7317c.f7305c.getWritableDatabase().beginTransaction();
        try {
            List arrayList = new ArrayList(this.f7336a.size());
            for (Object next : this.f7336a) {
                ContentValues contentValues = new ContentValues();
                Object a = this.f7338c.f7321g.mo3197a(next);
                if (a != null) {
                    contentValues.put("pk", a.toString());
                }
                if (this.f7338c.f7322h != null) {
                    contentValues.putAll((ContentValues) this.f7338c.f7322h.mo3197a(next));
                }
                byte[] bArr = (byte[]) this.f7338c.f7319e.mo3197a(next);
                contentValues.put("data", bArr);
                long replaceOrThrow = this.f7338c.f7317c.f7305c.getWritableDatabase().replaceOrThrow(this.f7338c.f7318d, null, contentValues);
                C1205h c1205h = this.f7338c;
                if (a == null) {
                    a = Long.valueOf(replaceOrThrow);
                }
                c1205h.m7169a(a, bArr, "upsert", this.f7337b);
                arrayList.add(Long.valueOf(replaceOrThrow));
            }
            this.f7338c.f7317c.f7305c.getWritableDatabase().setTransactionSuccessful();
            return arrayList;
        } finally {
            this.f7338c.f7317c.f7305c.getWritableDatabase().endTransaction();
        }
    }

    public final /* synthetic */ Object call() {
        return m7187a();
    }
}
