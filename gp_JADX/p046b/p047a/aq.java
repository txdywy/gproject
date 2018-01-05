package p046b.p047a;

final class aq implements ao {
    public final Object[] f3693a;
    public int f3694b = 0;

    public aq(Object[] objArr) {
        this.f3693a = objArr;
    }

    public final boolean execute(Object obj) {
        Object[] objArr = this.f3693a;
        int i = this.f3694b;
        this.f3694b = i + 1;
        objArr[i] = obj;
        return true;
    }
}
