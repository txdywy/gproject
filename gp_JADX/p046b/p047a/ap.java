package p046b.p047a;

public abstract class ap extends C0516d {
    public transient byte[] f3674k;

    public Object clone() {
        ap apVar = (ap) super.clone();
        apVar.f3674k = (byte[]) this.f3674k.clone();
        return apVar;
    }

    protected final int mo932a() {
        return this.f3674k.length;
    }

    protected void mo933b(int i) {
        this.f3674k[i] = (byte) 2;
        super.mo933b(i);
    }

    protected int mo934c(int i) {
        int c = super.mo934c(i);
        this.f3674k = new byte[c];
        return c;
    }
}
