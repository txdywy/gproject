package android.support.v4.widget;

final class C0371b {
    public int f2098a;
    public int f2099b;
    public float f2100c;
    public float f2101d;
    public long f2102e = Long.MIN_VALUE;
    public long f2103f = 0;
    public int f2104g = 0;
    public long f2105h = -1;
    public float f2106i;
    public int f2107j;

    C0371b() {
    }

    final float m2218a(long j) {
        if (j < this.f2102e) {
            return 0.0f;
        }
        if (this.f2105h < 0 || j < this.f2105h) {
            return C0368a.m2145a(((float) (j - this.f2102e)) / ((float) this.f2098a), 0.0f, 1.0f) * 0.5f;
        }
        long j2 = j - this.f2105h;
        return (C0368a.m2145a(((float) j2) / ((float) this.f2107j), 0.0f, 1.0f) * this.f2106i) + (1.0f - this.f2106i);
    }
}
