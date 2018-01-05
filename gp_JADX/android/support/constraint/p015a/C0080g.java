package android.support.constraint.p015a;

final class C0080g implements C0079f {
    public final Object[] f292a = new Object[256];
    public int f293b;

    C0080g() {
    }

    public final Object mo47a() {
        if (this.f293b <= 0) {
            return null;
        }
        int i = this.f293b - 1;
        Object obj = this.f292a[i];
        this.f292a[i] = null;
        this.f293b--;
        return obj;
    }

    public final boolean mo49a(Object obj) {
        if (this.f293b >= this.f292a.length) {
            return false;
        }
        this.f292a[this.f293b] = obj;
        this.f293b++;
        return true;
    }

    public final void mo48a(Object[] objArr, int i) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (this.f293b < this.f292a.length) {
                this.f292a[this.f293b] = obj;
                this.f293b++;
            }
        }
    }
}
