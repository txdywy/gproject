package com.google.android.finsky.detailspage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ai {
    public final int f14236b;
    public final Set f14237c;
    public final List f14238d;
    public List f14239e;

    public ai(int i, Set set, List list) {
        this.f14236b = i;
        this.f14237c = Collections.unmodifiableSet(set);
        m13848a(list);
        this.f14238d = Collections.unmodifiableList(list);
    }

    public final synchronized List m13849c() {
        List list;
        if (this.f14239e != null) {
            list = this.f14239e;
        } else {
            this.f14239e = new ArrayList();
            for (aj ajVar : this.f14238d) {
                this.f14239e.addAll(ajVar.f14242a);
            }
            this.f14239e = Collections.unmodifiableList(this.f14239e);
            list = this.f14239e;
        }
        return list;
    }

    private static void m13848a(List list) {
        for (int i = 0; i < list.size(); i++) {
            aj ajVar = (aj) list.get(i);
            if (ajVar.f14242a.size() == 1) {
                if (C2637r.class.isAssignableFrom((Class) ajVar.f14242a.get(0))) {
                    ajVar.f14243b = 9999;
                }
            }
            ajVar.f14243b = i;
        }
    }
}
