package android.support.v7.widget;

import android.view.View;

final class ej implements ib {
    public final /* synthetic */ RecyclerView f3430a;

    ej(RecyclerView recyclerView) {
        this.f3430a = recyclerView;
    }

    public final void mo844a(fr frVar, et etVar, et etVar2) {
        this.f3430a.f517k.m3690b(frVar);
        RecyclerView recyclerView = this.f3430a;
        recyclerView.m280a(frVar);
        frVar.m3262a(false);
        if (recyclerView.f512T.animateDisappearance(frVar, etVar, etVar2)) {
            recyclerView.m313m();
        }
    }

    public final void mo845b(fr frVar, et etVar, et etVar2) {
        RecyclerView recyclerView = this.f3430a;
        frVar.m3262a(false);
        if (recyclerView.f512T.animateAppearance(frVar, etVar, etVar2)) {
            recyclerView.m313m();
        }
    }

    public final void mo846c(fr frVar, et etVar, et etVar2) {
        frVar.m3262a(false);
        if (this.f3430a.f505M) {
            if (this.f3430a.f512T.animateChange(frVar, frVar, etVar, etVar2)) {
                this.f3430a.m313m();
            }
        } else if (this.f3430a.f512T.animatePersistence(frVar, etVar, etVar2)) {
            this.f3430a.m313m();
        }
    }

    public final void mo843a(fr frVar) {
        ew ewVar = this.f3430a.f528v;
        View view = frVar.f3211a;
        fh fhVar = this.f3430a.f517k;
        br brVar = ewVar.f2959x;
        int a = brVar.f3229a.mo848a(view);
        if (a >= 0) {
            if (brVar.f3230b.m3343d(a)) {
                brVar.m3333b(view);
            }
            brVar.f3229a.mo849a(a);
        }
        fhVar.m3687a(view);
    }
}
