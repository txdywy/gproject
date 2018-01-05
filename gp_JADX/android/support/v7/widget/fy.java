package android.support.v7.widget;

final class fy {
    public int f3490a = 0;
    public int f3491b = 0;
    public int f3492c = Integer.MIN_VALUE;
    public int f3493d = Integer.MIN_VALUE;
    public int f3494e = 0;
    public int f3495f = 0;
    public boolean f3496g = false;
    public boolean f3497h = false;

    fy() {
    }

    public final void m3732a(int i, int i2) {
        this.f3492c = i;
        this.f3493d = i2;
        this.f3497h = true;
        if (this.f3496g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3490a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3491b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3490a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3491b = i2;
        }
    }
}
