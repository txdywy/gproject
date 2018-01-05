package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.support.v4.p028a.C0212a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

final class C6184c extends C0212a {
    public List f30720g;
    public List f30721h;

    C6184c(Context context) {
        super(context.getApplicationContext());
    }

    C6184c(Context context, List list) {
        this(context);
        this.f30721h = list;
    }

    private final void m28509a(List list) {
        this.f30720g = list;
        super.mo273b(list);
    }

    protected final void mo276g() {
        if (this.f30720g != null) {
            m28509a(this.f30720g);
        } else {
            mo266a();
        }
    }

    protected final void mo277h() {
        mo268b();
    }

    public final /* synthetic */ Object mo274d() {
        Collection treeSet = new TreeSet();
        treeSet.addAll(C6187g.m28526a(this.f1193r));
        if (this.f30721h != null) {
            for (String str : this.f30721h) {
                Collection a;
                String a2 = C6187g.m28525a("res/raw/third_party_license_metadata", str, 0, -1);
                if (a2 != null) {
                    a = C6187g.m28527a(a2, str);
                } else {
                    a = new ArrayList();
                }
                treeSet.addAll(a);
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public final /* synthetic */ void mo273b(Object obj) {
        m28509a((List) obj);
    }

    static {
        C6184c.class.getCanonicalName();
    }
}
