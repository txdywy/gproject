package org.chromium.net.impl;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.net.C7941s;

public abstract class C7942e extends C7941s {
    public final Context f40757a;
    public final List f40758b = new LinkedList();
    public final List f40759c = new LinkedList();
    public boolean f40760d;
    public String f40761e;
    public String f40762f;
    public boolean f40763g;
    public boolean f40764h;
    public boolean f40765i;
    public boolean f40766j;
    public int f40767k;
    public long f40768l;
    public String f40769m;
    public long f40770n;
    public boolean f40771o;
    public String f40772p;
    public int f40773q = 20;

    public C7942e(Context context) {
        this.f40757a = context.getApplicationContext();
        mo6612b(false);
        mo6611a(true);
        mo6613c(false);
        if (this.f40762f != null) {
            throw new IllegalArgumentException("Storage path must not be set");
        }
        this.f40766j = true;
        this.f40768l = 0;
        this.f40767k = 0;
        this.f40771o = false;
        this.f40760d = true;
    }

    cb mo6616b() {
        return null;
    }

    final int m38058a(int i) {
        return this.f40773q == 20 ? i : this.f40773q;
    }

    public final /* synthetic */ C7941s mo6613c(boolean z) {
        this.f40765i = z;
        return this;
    }

    public final /* synthetic */ C7941s mo6612b(boolean z) {
        this.f40763g = z;
        return this;
    }

    public final /* synthetic */ C7941s mo6611a(boolean z) {
        this.f40764h = z;
        return this;
    }

    public final /* synthetic */ C7941s mo6610a(String str, int i, int i2) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: " + str);
        }
        this.f40758b.add(new C7947g(str, i, i2));
        return this;
    }

    static {
        Pattern.compile("^[0-9\\.]*$");
    }
}
