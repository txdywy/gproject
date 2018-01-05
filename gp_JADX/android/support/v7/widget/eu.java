package android.support.v7.widget;

import android.view.View;

final class eu implements es {
    public final /* synthetic */ RecyclerView f3437a;

    eu(RecyclerView recyclerView) {
        this.f3437a = recyclerView;
    }

    public final void mo866a(fr frVar) {
        boolean z = true;
        frVar.m3262a(true);
        if (frVar.f3218h != null && frVar.f3219i == null) {
            frVar.f3218h = null;
        }
        frVar.f3219i = null;
        if (!((frVar.f3220j & 16) != 0)) {
            boolean z2;
            RecyclerView recyclerView = this.f3437a;
            View view = frVar.f3211a;
            recyclerView.m298e();
            br brVar = recyclerView.f520n;
            int a = brVar.f3229a.mo848a(view);
            if (a == -1) {
                brVar.m3333b(view);
                z2 = true;
            } else if (brVar.f3230b.m3342c(a)) {
                brVar.f3230b.m3343d(a);
                brVar.m3333b(view);
                brVar.f3229a.mo849a(a);
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                fr c = RecyclerView.m261c(view);
                recyclerView.f517k.m3690b(c);
                recyclerView.f517k.m3685a(c);
            }
            if (z2) {
                z = false;
            }
            recyclerView.m283a(z);
            if (!z2 && frVar.m3277n()) {
                this.f3437a.removeDetachedView(frVar.f3211a, false);
            }
        }
    }
}
