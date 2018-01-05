package com.google.android.wallet.p366b;

import com.google.a.a.a.a.b.a.b.a.t;
import java.util.ArrayList;
import java.util.Locale;

public final class C6509a implements C6508h {
    public C6512i f32566a;
    public boolean f32567b;
    public ArrayList f32568c = new ArrayList();

    public final void setTriggerListener(C6512i c6512i) {
        this.f32566a = c6512i;
    }

    public final void mo5456a(ArrayList arrayList) {
        if (this.f32566a == null) {
            throw new IllegalStateException("ClickTriggerComponent must have trigger listener set before adding triggers.");
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C6515e c6515e = (C6515e) arrayList.get(i);
            switch (c6515e.f32578a.d) {
                case 2:
                    this.f32568c.add(c6515e);
                    i++;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "Unsupported trigger type: %d", new Object[]{Integer.valueOf(c6515e.f32578a.d)}));
            }
        }
    }

    public final boolean mo5457a(t tVar) {
        if (tVar.d == 2) {
            return false;
        }
        throw new IllegalArgumentException(String.format("Unsupported trigger type: %d", new Object[]{Integer.valueOf(tVar.d)}));
    }
}
