package p046b.p047a;

final class C0523g implements an {
    public boolean f3699a = true;
    public final /* synthetic */ StringBuffer f3700b;

    C0523g(StringBuffer stringBuffer) {
        this.f3700b = stringBuffer;
    }

    public final boolean mo947a(Object obj, Object obj2) {
        if (this.f3699a) {
            this.f3699a = false;
        } else {
            this.f3700b.append(",");
        }
        this.f3700b.append(obj);
        this.f3700b.append("=");
        this.f3700b.append(obj2);
        return true;
    }
}
