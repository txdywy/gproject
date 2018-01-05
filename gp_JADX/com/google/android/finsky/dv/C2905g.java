package com.google.android.finsky.dv;

import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.dfemodel.C2728s;
import com.google.android.finsky.dfemodel.Document;
import java.util.ArrayList;
import java.util.List;

public final class C2905g extends C2728s {
    public final C1287h f15443d;
    public final C2320a f15444e;
    public ArrayList f15445f = new ArrayList();
    public C2127b f15446g;
    public C1461c f15447k;
    public boolean f15448l;

    public C2905g(C1287h c1287h, C2127b c2127b, C1461c c1461c, C2320a c2320a) {
        super(false);
        this.f15443d = c1287h;
        this.f15446g = c2127b;
        this.f15447k = c1461c;
        this.f15444e = c2320a;
        this.f15448l = true;
    }

    protected final void mo3191a(Runnable runnable) {
        for (C2718h b : this.a) {
            List<Document> b2 = b.m14719b();
            if (b2 != null) {
                C2904f c2904f = new C2904f(this.f15446g);
                for (Document document : b2) {
                    if (document != null) {
                        c2904f.m15159a(document, null, this.f15444e, this.f15447k);
                        this.f15445f.add(document);
                    }
                }
            }
        }
        super.mo3191a(runnable);
    }
}
