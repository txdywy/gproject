package p046b.p047a;

final class C0534r implements ao {
    public boolean f3714a = true;
    public final /* synthetic */ StringBuffer f3715b;

    C0534r(StringBuffer stringBuffer) {
        this.f3715b = stringBuffer;
    }

    public final boolean execute(Object obj) {
        if (this.f3714a) {
            this.f3714a = false;
        } else {
            this.f3715b.append(",");
        }
        this.f3715b.append(obj);
        return true;
    }
}
