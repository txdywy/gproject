package com.google.android.libraries.flowlayoutmanager;

import android.support.v4.p037h.C0321q;
import android.support.v4.p037h.C0322r;
import java.util.ArrayList;
import java.util.List;

final class C5929l extends C5923i {
    public static final C0321q f29572a = new C0322r(15);
    public final List f29573b = new ArrayList();

    public static C5929l m27515a(int i) {
        C5929l c5929l = (C5929l) f29572a.mo381a();
        if (c5929l == null) {
            c5929l = new C5929l();
        }
        c5929l.f = i;
        return c5929l;
    }

    private C5929l() {
        mo5211d();
    }

    public final C5924h m27517a() {
        return this.f29573b.isEmpty() ? null : (C5924h) this.f29573b.get(this.f29573b.size() - 1);
    }

    public final void m27518a(C5924h c5924h) {
        this.f29573b.add(c5924h);
        this.f29517h = -1;
    }

    public final void m27522c() {
        for (int size = this.f29573b.size() - 1; size >= 0; size--) {
            ((C5924h) this.f29573b.get(size)).mo5206a();
        }
    }

    public final int mo5208b() {
        if (this.f29573b.isEmpty()) {
            return this.f;
        }
        return ((C5924h) this.f29573b.get(this.f29573b.size() - 1)).mo5208b();
    }

    protected final int mo5205a(boolean z, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f29573b.size(); i3++) {
            i2 += ((C5924h) this.f29573b.get(i3)).m27475c(i);
        }
        return i2;
    }

    public final int m27526f(int i) {
        Object obj = null;
        int size = this.f29573b.size() - 1;
        int i2 = 0;
        while (size >= 0) {
            int i3;
            Object obj2;
            C5924h c5924h = (C5924h) this.f29573b.get(size);
            if (obj != null) {
                Object obj3 = obj;
                i3 = c5924h.h + i2;
                obj2 = obj3;
            } else if (c5924h.f <= i) {
                i3 = c5924h.mo5204a(i);
                obj2 = 1;
            } else {
                obj2 = obj;
                i3 = i2;
            }
            size--;
            i2 = i3;
            obj = obj2;
        }
        return i2;
    }

    protected final boolean mo5209b(int i) {
        int size = this.f29573b.size();
        if (size == 0) {
            return false;
        }
        int i2 = size - 1;
        while (i2 >= 0) {
            C5924h c5924h = (C5924h) this.f29573b.get(i2);
            switch (c5924h.m27476d(i)) {
                case 0:
                    return i2 != size + -1;
                case 1:
                    return true;
                case 2:
                    c5924h.mo5210c();
                    this.f29573b.remove(i2);
                    break;
                default:
                    break;
            }
            i2--;
        }
        throw new Error("Should not reach here");
    }

    public final void mo5212e(int i) {
        super.mo5212e(i);
        for (int size = this.f29573b.size() - 1; size >= 0; size--) {
            ((C5924h) this.f29573b.get(size)).mo5212e(i);
        }
    }

    public final void m27524e() {
        mo5211d();
        f29572a.mo382a(this);
    }

    protected final void mo5211d() {
        super.mo5211d();
        for (int size = this.f29573b.size() - 1; size >= 0; size--) {
            ((C5924h) this.f29573b.get(size)).mo5210c();
        }
        this.f29573b.clear();
    }

    final void m27519a(StringBuilder stringBuilder) {
        stringBuilder.append('{');
        if (!this.f29573b.isEmpty()) {
            ((C5924h) this.f29573b.get(0)).mo5207a(stringBuilder);
            for (int i = 1; i < this.f29573b.size(); i++) {
                stringBuilder.append(',');
                ((C5924h) this.f29573b.get(i)).mo5207a(stringBuilder);
            }
        }
        stringBuilder.append('}');
    }
}
