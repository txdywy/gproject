package android.support.v7.widget;

import android.util.SparseArray;
import java.util.ArrayList;

public class ff {
    public SparseArray f3441a = new SparseArray();
    public int f3442b = 0;

    public void mo2354a() {
        for (int i = 0; i < this.f3441a.size(); i++) {
            ((fg) this.f3441a.valueAt(i)).f3443a.clear();
        }
    }

    public void mo2355a(int i, int i2) {
        fg c = m3676c(i);
        c.f3444b = i2;
        ArrayList arrayList = c.f3443a;
        if (arrayList != null) {
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public int mo2353a(int i) {
        return m3676c(i).f3443a.size();
    }

    public fr mo2357b(int i) {
        fg fgVar = (fg) this.f3441a.get(i);
        if (fgVar == null || fgVar.f3443a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = fgVar.f3443a;
        return (fr) arrayList.remove(arrayList.size() - 1);
    }

    public void mo2356a(fr frVar) {
        int i = frVar.f3216f;
        ArrayList arrayList = m3676c(i).f3443a;
        if (((fg) this.f3441a.get(i)).f3444b > arrayList.size()) {
            frVar.m3280q();
            arrayList.add(frVar);
        }
    }

    static long m3669a(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    final void m3675b() {
        this.f3442b++;
    }

    final void m3677c() {
        this.f3442b--;
    }

    final fg m3676c(int i) {
        fg fgVar = (fg) this.f3441a.get(i);
        if (fgVar != null) {
            return fgVar;
        }
        fgVar = new fg();
        this.f3441a.put(i, fgVar);
        return fgVar;
    }
}
