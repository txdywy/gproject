package com.google.android.libraries.flowlayoutmanager;

import android.support.v4.p037h.C0321q;
import android.support.v4.p037h.C0322r;
import java.util.ArrayList;
import java.util.List;

final class C5925e extends C5924h {
    public static final C0321q f29519a = new C0322r(10);
    public int f29520b;
    public int f29521c;
    public final List f29522d = new ArrayList();

    C5925e() {
        mo5211d();
    }

    public final void mo5206a() {
        for (int size = this.f29522d.size() - 1; size >= 0; size--) {
            ((C5926f) this.f29522d.get(size)).f29537o = false;
        }
    }

    public final void m27486a(C5926f c5926f) {
        if (c5926f.f29537o) {
            this.f29521c += (c5926f.f29534l + c5926f.f29529g) + c5926f.f29530h;
            this.f29522d.add(c5926f);
            this.f29517h = -1;
            return;
        }
        throw new IllegalArgumentException("Item not measured");
    }

    public final int mo5208b() {
        return this.f + this.f29522d.size();
    }

    protected final int mo5205a(boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C5926f c5926f;
        int i6;
        int i7;
        int i8 = 1;
        if (z) {
            int size = this.f29522d.size();
            i2 = 0;
            i3 = Integer.MIN_VALUE;
            i4 = 0;
            i5 = 0;
            while (i2 < size) {
                c5926f = (C5926f) this.f29522d.get(i2);
                if (c5926f.f29533k == 0) {
                    i6 = -c5926f.f29536n;
                    c5926f.f29538p = i6;
                    if (i6 < i5) {
                        i5 = i6;
                    }
                    i7 = c5926f.f29535m + i6;
                    if (i7 <= i4) {
                        i7 = i4;
                    }
                    i4 = i7;
                    i7 = i3;
                } else if (c5926f.f29535m > i3) {
                    i7 = c5926f.f29535m;
                } else {
                    i7 = i3;
                }
                i2++;
                i3 = i7;
            }
            if (i3 != Integer.MIN_VALUE) {
                i7 = i4 - i5;
                if (i7 < i3) {
                    i7 = i7 == 0 ? 0 : (int) ((((float) i5) / ((float) i7)) * ((float) i3));
                    i4 = i7 + i3;
                    i5 = i7;
                }
                for (i6 = 0; i6 < size; i6++) {
                    c5926f = (C5926f) this.f29522d.get(i6);
                    switch (c5926f.f29533k) {
                        case 1:
                            c5926f.f29538p = i4 - c5926f.f29535m;
                            break;
                        case 2:
                            c5926f.f29538p = i5;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        i5 = this.f == 0 ? 1 : 0;
        if (this.f + this.f29522d.size() != i) {
            i8 = 0;
        }
        i2 = this.f29522d.size();
        if (i2 == 0) {
            return 0;
        }
        i4 = Integer.MAX_VALUE;
        i3 = Integer.MIN_VALUE;
        int i9 = 0;
        while (i9 < i2) {
            c5926f = (C5926f) this.f29522d.get(i9);
            i6 = c5926f.f29538p - (i5 != 0 ? c5926f.f29528f : c5926f.f29527e);
            if (i6 >= i4) {
                i6 = i4;
            }
            i7 = (i8 != 0 ? c5926f.f29532j : c5926f.f29531i) + (c5926f.f29538p + c5926f.f29535m);
            if (i7 <= i3) {
                i7 = i3;
            }
            i9++;
            i3 = i7;
            i4 = i6;
        }
        if (i4 != 0) {
            for (i5 = 0; i5 < i2; i5++) {
                c5926f = (C5926f) this.f29522d.get(i5);
                c5926f.f29538p -= i4;
            }
            i3 -= i4;
        }
        return Math.max(0, i3);
    }

    public final int mo5204a(int i) {
        return ((C5926f) this.f29522d.get(i - this.f)).f29538p;
    }

    protected final boolean mo5209b(int i) {
        int size = this.f29522d.size();
        if (this.f + size <= i) {
            return false;
        }
        int i2 = i - this.f;
        for (int i3 = size - 1; i3 >= i2; i3--) {
            C5926f c5926f = (C5926f) this.f29522d.remove(i3);
            this.f29521c -= (c5926f.f29534l + c5926f.f29529g) + c5926f.f29530h;
            c5926f.m27493a();
        }
        return true;
    }

    public final void mo5210c() {
        mo5211d();
        f29519a.mo382a(this);
    }

    protected final void mo5211d() {
        super.mo5211d();
        this.f29520b = 0;
        this.f29521c = 0;
        for (int size = this.f29522d.size() - 1; size >= 0; size--) {
            ((C5926f) this.f29522d.get(size)).m27493a();
        }
        this.f29522d.clear();
    }

    final void mo5207a(StringBuilder stringBuilder) {
        stringBuilder.append('@').append(this.f).append('-').append(mo5208b());
    }
}
