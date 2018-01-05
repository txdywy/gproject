package com.google.android.libraries.play.entertainment.story;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.play.headerlist.m;

final class at extends fe implements OnAttachStateChangeListener, m {
    public final View f30431a;
    public final RecyclerView f30432b;
    public final int f30433c;
    public boolean f30434d;
    public boolean f30435e;
    public final /* synthetic */ ar f30436f;

    at(ar arVar, View view, RecyclerView recyclerView, int i) {
        this.f30436f = arVar;
        this.f30431a = view;
        this.f30432b = recyclerView;
        this.f30433c = i;
        view.addOnAttachStateChangeListener(this);
        arVar.f30411h.mo2951a((fe) this);
        if (recyclerView != null) {
            recyclerView.addOnAttachStateChangeListener(this);
            recyclerView.mo2951a((fe) this);
        }
        arVar.f30410g.setOnLayoutChangedListener(this);
    }

    final void m28269b() {
        if (!this.f30435e) {
            this.f30435e = true;
            this.f30431a.removeOnAttachStateChangeListener(this);
            this.f30436f.f30411h.mo2952b((fe) this);
            if (this.f30432b != null) {
                this.f30432b.removeOnAttachStateChangeListener(this);
                this.f30432b.mo2952b((fe) this);
            }
            this.f30436f.f30410g.setOnLayoutChangedListener(null);
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        if (!this.f30435e) {
            this.f30436f.f30412i.m28164b(false);
        }
        m28269b();
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        super.mo791a(recyclerView, i, i2);
        m28270c();
    }

    public final void m28267a() {
        m28270c();
    }

    public final void m28270c() {
        if (!this.f30435e) {
            int a;
            ar.f30400b.set(0, 0, this.f30431a.getWidth(), this.f30431a.getHeight());
            this.f30436f.f30411h.offsetDescendantRectToMyCoords(this.f30431a, ar.f30400b);
            int actionBarHeight = (int) (((((float) this.f30436f.f30410g.getActionBarHeight()) + this.f30436f.f30410g.getActionBarTranslationY()) + ((float) this.f30436f.f30410g.getStatusBarHeight())) + 1.0f);
            if (ar.m28247b(this.f30433c)) {
                a = this.f30436f.f30424u + this.f30436f.f30412i.m28153a();
            } else {
                a = this.f30436f.f30424u;
            }
            boolean z = ar.f30400b.left >= 0 && ar.f30400b.top >= actionBarHeight && ar.f30400b.right <= this.f30436f.f30411h.getWidth() && a + ar.f30400b.bottom <= this.f30436f.f30411h.getHeight();
            if (z) {
                this.f30436f.f30408e.offsetDescendantRectToMyCoords(this.f30436f.f30411h, ar.f30400b);
                this.f30436f.f30408e.offsetRectIntoDescendantCoords(this.f30436f.f30412i, ar.f30400b);
                a = this.f30436f.f30412i.f30309D;
                this.f30436f.f30412i.m28159a(ar.f30400b, this.f30433c);
                if (!this.f30434d && a == 2) {
                    this.f30436f.m28265e();
                    this.f30436f.f30415l.mo3226a((C2980a) C6116b.m28100a(this.f30436f.f30404D));
                }
            } else if (this.f30434d) {
                this.f30436f.f30412i.m28164b(false);
                m28269b();
            }
            this.f30434d = z;
        }
    }
}
