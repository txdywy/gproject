package com.google.android.finsky.adapters;

import android.os.Bundle;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.adapters.p121a.C1140e;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.layout.structuredreviews.C3721a;
import com.google.android.finsky.recyclerview.C1137h;
import java.util.ArrayList;
import java.util.List;

public final class C1181z extends C1137h {
    public iu f7253c;
    public ab f7254d;
    public Bundle f7255e;
    public final ac f7256f;
    public List f7257g = new ArrayList();

    public C1181z(ac acVar) {
        this.f7256f = acVar;
    }

    public final int mo1040a(int i) {
        return ((C1140e) this.f7257g.get(i)).mo1466h();
    }

    public final int mo1039a() {
        return this.f7257g.size();
    }

    public final C1140e m7130e(int i) {
        return (C1140e) this.f7257g.get(i);
    }

    public final void m7131f(int i) {
        if (this.f7256f != null) {
            ((C1140e) this.f7257g.get(i)).mo1462f();
            if (i < this.f7257g.size() - 1) {
                this.f7256f.mo3013a(i + 1);
            } else if (this.f7254d != null) {
                this.f7254d.mo3080a();
            }
        }
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1140e c1140e = (C1140e) this.f7257g.get(i);
        C3721a c3721a = (C3721a) ((aa) frVar).a;
        iu iuVar = this.f7253c;
        Bundle bundle = this.f7255e;
        mo1039a();
        c1140e.mo1465a(c3721a, iuVar, bundle);
        c1140e.mo1457a(c3721a);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new aa(this, LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
