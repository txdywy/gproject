package com.google.android.finsky.ak;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.p108z.C4819c;

public class C1198a {
    public final Context f7303a;
    public final C1201d[] f7304b;
    public final SQLiteOpenHelper f7305c;
    public final C4819c f7306d;

    public C1198a(Context context, C4819c c4819c, String str, C1201d[] c1201dArr) {
        this.f7303a = context;
        this.f7304b = c1201dArr;
        this.f7306d = c4819c;
        this.f7305c = new C1200c(this, context, str);
    }
}
