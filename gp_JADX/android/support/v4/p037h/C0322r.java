package android.support.v4.p037h;

public class C0322r implements C0321q {
    public final Object[] f1764a;
    public int f1765b;

    public C0322r(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1764a = new Object[i];
    }

    public Object mo381a() {
        if (this.f1765b <= 0) {
            return null;
        }
        int i = this.f1765b - 1;
        Object obj = this.f1764a[i];
        this.f1764a[i] = null;
        this.f1765b--;
        return obj;
    }

    public boolean mo382a(Object obj) {
        boolean z;
        for (int i = 0; i < this.f1765b; i++) {
            if (this.f1764a[i] == obj) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        } else if (this.f1765b >= this.f1764a.length) {
            return false;
        } else {
            this.f1764a[this.f1765b] = obj;
            this.f1765b++;
            return true;
        }
    }
}
