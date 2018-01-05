package android.support.v7.widget;

final class cg {
    public fr f3263a;
    public fr f3264b;
    public int f3265c;
    public int f3266d;
    public int f3267e;
    public int f3268f;

    private cg(fr frVar, fr frVar2) {
        this.f3263a = frVar;
        this.f3264b = frVar2;
    }

    cg(fr frVar, fr frVar2, int i, int i2, int i3, int i4) {
        this(frVar, frVar2);
        this.f3265c = i;
        this.f3266d = i2;
        this.f3267e = i3;
        this.f3268f = i4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.f3263a + ", newHolder=" + this.f3264b + ", fromX=" + this.f3265c + ", fromY=" + this.f3266d + ", toX=" + this.f3267e + ", toY=" + this.f3268f + '}';
    }
}
