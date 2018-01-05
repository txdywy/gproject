package android.support.constraint.p015a.p016a;

import android.support.constraint.p015a.C0076c;
import java.util.ArrayList;

public class C0068l extends C0066e {
    public ArrayList aA = new ArrayList();

    public void mo38a() {
        this.aA.clear();
        super.mo38a();
    }

    public final void m114a(C0066e c0066e) {
        this.aA.remove(c0066e);
        c0066e.f232r = null;
    }

    public final void mo39a(int i, int i2) {
        super.mo39a(i, i2);
        int size = this.aA.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0066e) this.aA.get(i3)).mo39a(this.f237w + this.f192C, this.f238x + this.f193D);
        }
    }

    public final void mo41m() {
        super.mo41m();
        if (this.aA != null) {
            int size = this.aA.size();
            for (int i = 0; i < size; i++) {
                C0066e c0066e = (C0066e) this.aA.get(i);
                c0066e.mo39a(m104g(), m105h());
                if (!(c0066e instanceof C0069g)) {
                    c0066e.mo41m();
                }
            }
        }
    }

    public void mo42o() {
        mo41m();
        if (this.aA != null) {
            int size = this.aA.size();
            for (int i = 0; i < size; i++) {
                C0066e c0066e = (C0066e) this.aA.get(i);
                if (c0066e instanceof C0068l) {
                    ((C0068l) c0066e).mo42o();
                }
            }
        }
    }

    public final void mo40a(C0076c c0076c) {
        super.mo40a(c0076c);
        int size = this.aA.size();
        for (int i = 0; i < size; i++) {
            ((C0066e) this.aA.get(i)).mo40a(c0076c);
        }
    }
}
