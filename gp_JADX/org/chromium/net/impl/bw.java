package org.chromium.net.impl;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.chromium.net.C7937m;
import org.chromium.net.C7944n;
import org.chromium.net.as;
import org.chromium.net.au;
import org.chromium.net.av;
import org.chromium.net.aw;

public class bw extends C7944n {
    public static final String f40882a = bw.class.getSimpleName();
    public final C7939d f40883b;
    public final String f40884c;
    public final aw f40885d;
    public final Executor f40886e;
    public String f40887f;
    public final ArrayList f40888g = new ArrayList();
    public boolean f40889h;
    public boolean f40890i;
    public int f40891j = 3;
    public as f40892k;
    public Executor f40893l;
    public boolean f40894m = false;

    bw(String str, aw awVar, Executor executor, C7939d c7939d) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (awVar == null) {
            throw new NullPointerException("Callback is required.");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required.");
        } else if (c7939d == null) {
            throw new NullPointerException("CronetEngine is required.");
        } else {
            this.f40884c = str;
            this.f40885d = awVar;
            this.f40886e = executor;
            this.f40883b = c7939d;
        }
    }

    public final C7944n mo6623a(String str) {
        if (str == null) {
            throw new NullPointerException("Method is required.");
        }
        this.f40887f = str;
        return this;
    }

    public final /* synthetic */ C7937m mo6626b() {
        return (bv) mo6620c();
    }

    public final /* synthetic */ C7944n mo6625a(as asVar, Executor executor) {
        return (bw) mo6619b(asVar, executor);
    }

    public final /* synthetic */ C7944n mo6622a() {
        return (bw) mo6621d();
    }

    public final /* synthetic */ C7944n mo6624a(String str, String str2) {
        return (bw) mo6618b(str, str2);
    }

    public final /* synthetic */ au mo6620c() {
        au a = this.f40883b.mo6604a(this.f40884c, this.f40885d, this.f40886e, this.f40891j, this.f40889h, this.f40890i, this.f40894m);
        if (this.f40887f != null) {
            a.mo6594a(this.f40887f);
        }
        ArrayList arrayList = this.f40888g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Pair pair = (Pair) arrayList.get(i);
            a.mo6595a((String) pair.first, (String) pair.second);
            i = i2;
        }
        if (this.f40892k != null) {
            a.mo6597a(this.f40892k, this.f40893l);
        }
        return a;
    }

    public final /* synthetic */ av mo6619b(as asVar, Executor executor) {
        if (asVar == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (executor == null) {
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        } else {
            if (this.f40887f == null) {
                this.f40887f = "POST";
            }
            this.f40892k = asVar;
            this.f40893l = executor;
            return this;
        }
    }

    public final /* synthetic */ av mo6621d() {
        this.f40889h = true;
        return this;
    }

    public final /* synthetic */ av mo6618b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        } else {
            if ("Accept-Encoding".equalsIgnoreCase(str)) {
                Log.w(f40882a, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
            } else {
                this.f40888g.add(Pair.create(str, str2));
            }
            return this;
        }
    }

    public final /* synthetic */ av mo6617b(String str) {
        return mo6623a(str);
    }
}
