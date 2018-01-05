package com.caverock.androidsvg;

import java.util.List;

public final class av implements Cloneable {
    public Boolean f4275A;
    public Boolean f4276B;
    public bn f4277C;
    public Float f4278D;
    public String f4279E;
    public aw f4280F;
    public String f4281G;
    public bn f4282H;
    public Float f4283I;
    public bn f4284J;
    public Float f4285K;
    public bd f4286L;
    public long f4287a = 0;
    public bn f4288b;
    public aw f4289c;
    public Float f4290d;
    public bn f4291e;
    public Float f4292f;
    public af f4293g;
    public ay f4294h;
    public az f4295i;
    public Float f4296j;
    public af[] f4297k;
    public af f4298l;
    public Float f4299m;
    public C0727v f4300n;
    public List f4301o;
    public af f4302p;
    public Integer f4303q;
    public ax f4304r;
    public bb f4305s;
    public bc f4306t;
    public ba f4307u;
    public Boolean f4308v;
    public C0724s f4309w;
    public String f4310x;
    public String f4311y;
    public String f4312z;

    protected av() {
    }

    public static av m4598a() {
        av avVar = new av();
        avVar.f4287a = -1;
        avVar.f4288b = C0727v.f4632b;
        avVar.f4289c = aw.NonZero;
        avVar.f4290d = Float.valueOf(1.0f);
        avVar.f4291e = null;
        avVar.f4292f = Float.valueOf(1.0f);
        avVar.f4293g = new af(1.0f);
        avVar.f4294h = ay.Butt;
        avVar.f4295i = az.Miter;
        avVar.f4296j = Float.valueOf(4.0f);
        avVar.f4297k = null;
        avVar.f4298l = new af(0.0f);
        avVar.f4299m = Float.valueOf(1.0f);
        avVar.f4300n = C0727v.f4632b;
        avVar.f4301o = null;
        avVar.f4302p = new af(12.0f, cc.pt);
        avVar.f4303q = Integer.valueOf(400);
        avVar.f4304r = ax.Normal;
        avVar.f4305s = bb.None;
        avVar.f4306t = bc.LTR;
        avVar.f4307u = ba.Start;
        avVar.f4308v = Boolean.valueOf(true);
        avVar.f4309w = null;
        avVar.f4310x = null;
        avVar.f4311y = null;
        avVar.f4312z = null;
        avVar.f4275A = Boolean.TRUE;
        avVar.f4276B = Boolean.TRUE;
        avVar.f4277C = C0727v.f4632b;
        avVar.f4278D = Float.valueOf(1.0f);
        avVar.f4279E = null;
        avVar.f4280F = aw.NonZero;
        avVar.f4281G = null;
        avVar.f4282H = null;
        avVar.f4283I = Float.valueOf(1.0f);
        avVar.f4284J = null;
        avVar.f4285K = Float.valueOf(1.0f);
        avVar.f4286L = bd.None;
        return avVar;
    }

    protected final Object clone() {
        try {
            av avVar = (av) super.clone();
            if (this.f4297k != null) {
                avVar.f4297k = (af[]) this.f4297k.clone();
            }
            return avVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
