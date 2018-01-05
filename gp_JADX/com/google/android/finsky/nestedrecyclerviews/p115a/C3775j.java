package com.google.android.finsky.nestedrecyclerviews.p115a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.finsky.recyclerview.p182a.C3774a;

final class C3775j implements C3774a {
    public final /* synthetic */ C3769f f18982a;

    C3775j(C3769f c3769f) {
        this.f18982a = c3769f;
    }

    public final boolean mo3748a(fe feVar) {
        return false;
    }

    public final boolean mo3752b(fe feVar) {
        return false;
    }

    public final boolean mo3755c(fe feVar) {
        return false;
    }

    public final int mo3742a(RecyclerView recyclerView, MotionEvent motionEvent) {
        C3769f.m17916b(recyclerView);
        C3769f c3769f = this.f18982a;
        C3769f.m17916b(recyclerView);
        if (c3769f.f18964e != recyclerView) {
            c3769f.f18964e = recyclerView;
            if (c3769f.f18968i != null) {
                for (int size = c3769f.f18968i.size() - 1; size >= 0; size--) {
                    ((C1062m) c3769f.f18968i.get(size)).mo1356a(recyclerView);
                }
            }
        }
        if (motionEvent.getAction() == 0) {
            this.f18982a.m17917a(motionEvent);
        }
        return 2;
    }

    public final int mo3749b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int size;
        C3769f.m17916b(recyclerView);
        C3769f c3769f = this.f18982a;
        C3769f.m17916b(recyclerView);
        if (c3769f.f18964e != recyclerView) {
            c3769f.f18964e = recyclerView;
            if (c3769f.f18968i != null) {
                for (size = c3769f.f18968i.size() - 1; size >= 0; size--) {
                    ((C1062m) c3769f.f18968i.get(size)).mo1356a(recyclerView);
                }
            }
        }
        this.f18982a.f18964e.requestDisallowInterceptTouchEvent(true);
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(obtain.getRawX(), obtain.getRawY());
        if (!this.f18982a.f18963d.m2036a(obtain) && (obtain.getAction() == 1 || obtain.getAction() == 3)) {
            c3769f = this.f18982a;
            if (c3769f.f18966g != null) {
                c3769f.f18966g.mo2913a(c3769f.f18961b, 0);
            }
            if (c3769f.f18967h != null) {
                for (size = 0; size < c3769f.f18967h.size(); size++) {
                    ((fe) c3769f.f18967h.get(size)).mo2913a(c3769f.f18961b, 0);
                }
            }
        }
        return 1;
    }

    public final boolean mo3747a(int i) {
        C3769f c3769f = this.f18982a;
        if (c3769f.f18966g != null) {
            c3769f.f18966g.mo2913a(c3769f.f18961b, i);
        }
        if (c3769f.f18967h != null) {
            for (int i2 = 0; i2 < c3769f.f18967h.size(); i2++) {
                ((fe) c3769f.f18967h.get(i2)).mo2913a(c3769f.f18961b, i);
            }
        }
        return true;
    }

    public final boolean mo3751b(int i) {
        C3769f c3769f = this.f18982a;
        if (c3769f.f18966g != null) {
            c3769f.f18966g.mo791a(c3769f.f18961b, 0, i);
        }
        if (c3769f.f18967h != null) {
            for (int i2 = 0; i2 < c3769f.f18967h.size(); i2++) {
                ((fe) c3769f.f18967h.get(i2)).mo791a(c3769f.f18961b, 0, i);
            }
        }
        return true;
    }

    public final int mo3743a(View view, View view2) {
        return 0;
    }

    public final void mo3754c(int i) {
    }

    public final void mo3745a(int i, int[] iArr) {
    }

    public final void mo3744a() {
    }

    public final boolean mo3746a(float f) {
        return false;
    }

    public final boolean mo3750b() {
        return false;
    }

    public final void mo3753c() {
    }
}
