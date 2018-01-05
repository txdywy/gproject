package com.google.android.finsky.billing.addresschallenge.a;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class com.google.android.finsky.billing.addresschallenge.a.ac implements com.google.android.finsky.billing.addresschallenge.a.y
{

    public final com.google.android.finsky.billing.addresschallenge.a.al a;
    public final com.google.android.finsky.billing.addresschallenge.a.y b;
    public final Queue c;
    public final com.google.android.finsky.billing.addresschallenge.a.ab d;

    ac(com.google.android.finsky.billing.addresschallenge.a.ab p0, com.google.android.finsky.billing.addresschallenge.a.al p1, com.google.android.finsky.billing.addresschallenge.a.y p2, Queue p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void a() {
    }

    public final void b() {
        v2 = 0;
        v3 = this.d.a(this.a);
        if (v3.isEmpty()) {
            if (this.b != 0)
                this.b.b();
        }
        else {
            if (this.c.size() > 0) {
                v4 = v3.iterator();
                while (v4.hasNext()) {
                    v1 = (com.google.android.finsky.billing.addresschallenge.a.aq)v4.next();
                    if (v1.a((String)this.c.remove())) {
                        if (this.d.c == 0)
                            v0 = 0;
                        else
                            v0 = com.google.android.finsky.billing.addresschallenge.a.az.b(this.d.c);
                        v2 = this.a.toString();
                        v1 = (String.valueOf(v2).length() + 1 + String.valueOf(v1.a).length()) + v2 + "/" + v1.a;
                        if (this.a.toString().split("/").length == 1 && v0 != 0 && !this.d.a(v0)) {
                            v1 = String.valueOf(v1);
                            v0 = v0.toString();
                            v0 = (String.valueOf(v1).length() + 2 + String.valueOf(v0).length()) + v1 + "--" + v0;
                        }
                        else
                            v0 = v1;
                        this.d.a(new com.google.android.finsky.billing.addresschallenge.a.am(v0).a(), this.c, this.b);
                        return;
                    }
                }
            }
            v0 = ((com.google.android.finsky.billing.addresschallenge.a.aq)v3.get(0)).a;
            if (this.d.c != 0)
                v2 = com.google.android.finsky.billing.addresschallenge.a.az.b(this.d.c);
            v3 = this.a.toString();
            v0 = (String.valueOf(v3).length() + 1 + String.valueOf(v0).length()) + v3 + "/" + v0;
            if (this.a.toString().split("/").length == 1 && v2 != 0 && !this.d.a(v2)) {
                v0 = String.valueOf(v0);
                v1 = v2.toString();
                v0 = (String.valueOf(v0).length() + 2 + String.valueOf(v1).length()) + v0 + "--" + v1;
            }
            this.d.a(new com.google.android.finsky.billing.addresschallenge.a.am(v0).a(), new LinkedList(), this.b);
        }
    }

}
