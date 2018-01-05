package android.support.p027e;

import android.view.View;
import java.util.ArrayList;

final class C0198x implements at {
    public final /* synthetic */ View f1170a;
    public final /* synthetic */ ArrayList f1171b;

    C0198x(View view, ArrayList arrayList) {
        this.f1170a = view;
        this.f1171b = arrayList;
    }

    public final void mo203c() {
    }

    public final void mo201a(an anVar) {
        anVar.mo213b((at) this);
        this.f1170a.setVisibility(8);
        int size = this.f1171b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f1171b.get(i)).setVisibility(0);
        }
    }

    public final void mo200a() {
    }

    public final void mo202b() {
    }
}
