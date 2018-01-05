package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.Log;
import com.squareup.haha.perflib.HprofParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

public final class cf {
    public static HashSet f4398n = null;
    public Canvas f4399a;
    public C0723r f4400b;
    public float f4401c;
    public boolean f4402d;
    public C0727v f4403e;
    public C0727v f4404f;
    public C0722q f4405g;
    public cm f4406h;
    public Stack f4407i;
    public Stack f4408j;
    public Stack f4409k;
    public Stack f4410l;
    public Stack f4411m;

    protected cf(Canvas canvas, C0723r c0723r, float f) {
        this.f4399a = canvas;
        this.f4401c = f;
        this.f4400b = c0723r;
    }

    protected final float m4659a() {
        return this.f4406h.f4439d.getTextSize();
    }

    protected final C0723r m4663b() {
        if (this.f4406h.f4442g != null) {
            return this.f4406h.f4442g;
        }
        return this.f4406h.f4441f;
    }

    private final void m4644b(bm bmVar) {
        float f = 0.0f;
        if (!(bmVar instanceof aj)) {
            m4648d();
            m4661a(bmVar);
            if (bmVar instanceof be) {
                be beVar = (be) bmVar;
                m4623a(beVar, beVar.f4349c, beVar.f4350d);
            } else if (bmVar instanceof cd) {
                r10 = (cd) bmVar;
                if ((r10.f4396e == null || !r10.f4396e.m4573a()) && (r10.f4397f == null || !r10.f4397f.m4573a())) {
                    m4633a(this.f4406h, (bk) r10);
                    if (m4656k()) {
                        bm b = r10.t.m4794b(r10.f4393a);
                        if (b == null) {
                            m4645b("Use reference '%s' not found", r10.f4393a);
                        } else {
                            if (r10.b != null) {
                                this.f4399a.concat(r10.b);
                            }
                            Matrix matrix = new Matrix();
                            r1 = r10.f4394c != null ? r10.f4394c.m4571a(this) : 0.0f;
                            if (r10.f4395d != null) {
                                r3 = r10.f4395d.m4574b(this);
                            } else {
                                r3 = 0.0f;
                            }
                            matrix.preTranslate(r1, r3);
                            this.f4399a.concat(matrix);
                            m4649d(r10);
                            boolean g = m4652g();
                            m4624a((bi) r10);
                            if (b instanceof be) {
                                m4648d();
                                be beVar2 = (be) b;
                                m4623a(beVar2, r10.f4396e != null ? r10.f4396e : beVar2.f4349c, r10.f4397f != null ? r10.f4397f : beVar2.f4350d);
                                m4650e();
                            } else if (b instanceof bs) {
                                af afVar = r10.f4396e != null ? r10.f4396e : new af(100.0f, cc.percent);
                                af afVar2 = r10.f4397f != null ? r10.f4397f : new af(100.0f, cc.percent);
                                m4648d();
                                bj bjVar = (bs) b;
                                if ((afVar == null || !afVar.m4573a()) && (afVar2 == null || !afVar2.m4573a())) {
                                    C0718m c0718m = bjVar.v != null ? bjVar.v : C0718m.f4596d;
                                    m4633a(this.f4406h, (bk) bjVar);
                                    r5 = afVar != null ? afVar.m4571a(this) : this.f4406h.f4441f.f4622c;
                                    if (afVar2 != null) {
                                        r1 = afVar2.m4571a(this);
                                    } else {
                                        r1 = this.f4406h.f4441f.f4623d;
                                    }
                                    this.f4406h.f4441f = new C0723r(0.0f, 0.0f, r5, r1);
                                    if (!this.f4406h.f4436a.f4308v.booleanValue()) {
                                        m4618a(this.f4406h.f4441f.f4620a, this.f4406h.f4441f.f4621b, this.f4406h.f4441f.f4622c, this.f4406h.f4441f.f4623d);
                                    }
                                    if (bjVar.w != null) {
                                        this.f4399a.concat(m4610a(this.f4406h.f4441f, bjVar.w, c0718m));
                                        this.f4406h.f4442g = bjVar.w;
                                    }
                                    r1 = m4652g();
                                    m4625a((bi) bjVar, true);
                                    if (r1) {
                                        m4643b(bjVar);
                                    }
                                    m4626a(bjVar);
                                }
                                m4650e();
                            } else {
                                m4644b(b);
                            }
                            m4651f();
                            if (g) {
                                m4643b(r10);
                            }
                            m4626a(r10);
                        }
                    }
                }
            } else if (bmVar instanceof br) {
                r10 = (br) bmVar;
                m4633a(this.f4406h, (bk) r10);
                if (m4656k()) {
                    if (r10.b != null) {
                        this.f4399a.concat(r10.b);
                    }
                    m4649d(r10);
                    r0 = m4652g();
                    m4630a((br) r10);
                    if (r0) {
                        m4643b(r10);
                    }
                    m4626a(r10);
                }
            } else if (bmVar instanceof ac) {
                r10 = (ac) bmVar;
                m4633a(this.f4406h, (bk) r10);
                if (m4656k()) {
                    if (r10.f4222b != null) {
                        this.f4399a.concat(r10.f4222b);
                    }
                    m4649d(r10);
                    r0 = m4652g();
                    m4625a((bi) r10, true);
                    if (r0) {
                        m4643b(r10);
                    }
                    m4626a(r10);
                }
            } else if (bmVar instanceof ae) {
                r10 = (ae) bmVar;
                if (!(r10.f4227d == null || r10.f4227d.m4573a() || r10.f4228e == null || r10.f4228e.m4573a() || r10.f4224a == null)) {
                    Bitmap bitmap;
                    C0718m c0718m2 = r10.v != null ? r10.v : C0718m.f4596d;
                    String str = r10.f4224a;
                    if (!str.startsWith("data:")) {
                        bitmap = null;
                    } else if (str.length() < 14) {
                        bitmap = null;
                    } else {
                        int indexOf = str.indexOf(44);
                        if (indexOf == -1 || indexOf < 12) {
                            bitmap = null;
                        } else if (";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        } else {
                            bitmap = null;
                        }
                    }
                    if (bitmap == null) {
                        if (this.f4405g.f4615c != null) {
                            throw new NoSuchMethodError();
                        }
                    } else if (bitmap == null) {
                        m4645b("Could not locate image '%s'", r10.f4224a);
                    } else {
                        m4633a(this.f4406h, (bk) r10);
                        if (m4656k() && m4664c()) {
                            if (r10.f4229f != null) {
                                this.f4399a.concat(r10.f4229f);
                            }
                            r1 = r10.f4225b != null ? r10.f4225b.m4571a(this) : 0.0f;
                            if (r10.f4226c != null) {
                                r3 = r10.f4226c.m4574b(this);
                            } else {
                                r3 = 0.0f;
                            }
                            this.f4406h.f4441f = new C0723r(r1, r3, r10.f4227d.m4571a(this), r10.f4228e.m4571a(this));
                            if (!this.f4406h.f4436a.f4308v.booleanValue()) {
                                m4618a(this.f4406h.f4441f.f4620a, this.f4406h.f4441f.f4621b, this.f4406h.f4441f.f4622c, this.f4406h.f4441f.f4623d);
                            }
                            r10.n = new C0723r(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                            this.f4399a.concat(m4610a(this.f4406h.f4441f, r10.n, c0718m2));
                            m4626a(r10);
                            m4649d(r10);
                            r0 = m4652g();
                            m4657l();
                            this.f4399a.drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
                            if (r0) {
                                m4643b(r10);
                            }
                        }
                    }
                }
            } else if (bmVar instanceof al) {
                r10 = (al) bmVar;
                if (r10.f4251a != null) {
                    m4633a(this.f4406h, (bk) r10);
                    if (m4656k() && m4664c() && (this.f4406h.f4438c || this.f4406h.f4437b)) {
                        if (r10.e != null) {
                            this.f4399a.concat(r10.e);
                        }
                        Path path = new ci(r10.f4251a).f4424a;
                        if (r10.n == null) {
                            r10.n = m4641b(path);
                        }
                        m4626a(r10);
                        m4647c(r10);
                        m4649d(r10);
                        boolean g2 = m4652g();
                        if (this.f4406h.f4437b) {
                            FillType fillType;
                            if (this.f4406h.f4436a.f4289c != null) {
                                switch (this.f4406h.f4436a.f4289c.ordinal()) {
                                    case 1:
                                        fillType = FillType.EVEN_ODD;
                                        break;
                                }
                            }
                            fillType = FillType.WINDING;
                            path.setFillType(fillType);
                            m4627a(r10, path);
                        }
                        if (this.f4406h.f4438c) {
                            m4620a(path);
                        }
                        m4621a((ab) r10);
                        if (g2) {
                            m4643b(r10);
                        }
                    }
                }
            } else if (bmVar instanceof ar) {
                r10 = (ar) bmVar;
                if (!(r10.f4268c == null || r10.f4269d == null || r10.f4268c.m4573a() || r10.f4269d.m4573a())) {
                    m4633a(this.f4406h, (bk) r10);
                    if (m4656k() && m4664c()) {
                        if (r10.e != null) {
                            this.f4399a.concat(r10.e);
                        }
                        r0 = m4611a((ar) r10);
                        m4626a(r10);
                        m4647c(r10);
                        m4649d(r10);
                        r1 = m4652g();
                        if (this.f4406h.f4437b) {
                            m4627a(r10, r0);
                        }
                        if (this.f4406h.f4438c) {
                            m4620a(r0);
                        }
                        if (r1) {
                            m4643b(r10);
                        }
                    }
                }
            } else if (bmVar instanceof C0725t) {
                r10 = (C0725t) bmVar;
                if (!(r10.f4630c == null || r10.f4630c.m4573a())) {
                    m4633a(this.f4406h, (bk) r10);
                    if (m4656k() && m4664c()) {
                        if (r10.e != null) {
                            this.f4399a.concat(r10.e);
                        }
                        r0 = m4612a((C0725t) r10);
                        m4626a(r10);
                        m4647c(r10);
                        m4649d(r10);
                        r1 = m4652g();
                        if (this.f4406h.f4437b) {
                            m4627a(r10, r0);
                        }
                        if (this.f4406h.f4438c) {
                            m4620a(r0);
                        }
                        if (r1) {
                            m4643b(r10);
                        }
                    }
                }
            } else if (bmVar instanceof C0730y) {
                r10 = (C0730y) bmVar;
                if (!(r10.f4637c == null || r10.f4638d == null || r10.f4637c.m4573a() || r10.f4638d.m4573a())) {
                    m4633a(this.f4406h, (bk) r10);
                    if (m4656k() && m4664c()) {
                        if (r10.e != null) {
                            this.f4399a.concat(r10.e);
                        }
                        r0 = m4613a((C0730y) r10);
                        m4626a(r10);
                        m4647c(r10);
                        m4649d(r10);
                        r1 = m4652g();
                        if (this.f4406h.f4437b) {
                            m4627a(r10, r0);
                        }
                        if (this.f4406h.f4438c) {
                            m4620a(r0);
                        }
                        if (r1) {
                            m4643b(r10);
                        }
                    }
                }
            } else if (bmVar instanceof ag) {
                r10 = (ag) bmVar;
                m4633a(this.f4406h, (bk) r10);
                if (m4656k() && m4664c() && this.f4406h.f4438c) {
                    if (r10.e != null) {
                        this.f4399a.concat(r10.e);
                    }
                    float a = r10.f4232a == null ? 0.0f : r10.f4232a.m4571a(this);
                    r1 = r10.f4233b == null ? 0.0f : r10.f4233b.m4574b(this);
                    r3 = r10.f4234c == null ? 0.0f : r10.f4234c.m4571a(this);
                    if (r10.f4235d != null) {
                        f = r10.f4235d.m4574b(this);
                    }
                    if (r10.n == null) {
                        r10.n = new C0723r(Math.min(a, r1), Math.min(r1, f), Math.abs(r3 - a), Math.abs(f - r1));
                    }
                    Path path2 = new Path();
                    path2.moveTo(a, r1);
                    path2.lineTo(r3, f);
                    m4626a(r10);
                    m4647c(r10);
                    m4649d(r10);
                    r0 = m4652g();
                    m4620a(path2);
                    m4621a((ab) r10);
                    if (r0) {
                        m4643b(r10);
                    }
                }
            } else if (bmVar instanceof aq) {
                r10 = (aq) bmVar;
                m4633a(this.f4406h, (bk) r10);
                if (m4656k() && m4664c() && (this.f4406h.f4438c || this.f4406h.f4437b)) {
                    if (r10.e != null) {
                        this.f4399a.concat(r10.e);
                    }
                    if (r10.a.length >= 2) {
                        r0 = m4640b((ap) r10);
                        m4626a(r10);
                        m4647c(r10);
                        m4649d(r10);
                        r1 = m4652g();
                        if (this.f4406h.f4437b) {
                            m4627a(r10, r0);
                        }
                        if (this.f4406h.f4438c) {
                            m4620a(r0);
                        }
                        m4621a((ab) r10);
                        if (r1) {
                            m4643b(r10);
                        }
                    }
                }
            } else if (bmVar instanceof ap) {
                r10 = (ap) bmVar;
                m4633a(this.f4406h, (bk) r10);
                if (m4656k() && m4664c() && (this.f4406h.f4438c || this.f4406h.f4437b)) {
                    if (r10.e != null) {
                        this.f4399a.concat(r10.e);
                    }
                    if (r10.f4265a.length >= 2) {
                        r0 = m4640b((ap) r10);
                        m4626a(r10);
                        m4647c(r10);
                        m4649d(r10);
                        r1 = m4652g();
                        if (this.f4406h.f4437b) {
                            m4627a(r10, r0);
                        }
                        if (this.f4406h.f4438c) {
                            m4620a(r0);
                        }
                        m4621a((ab) r10);
                        if (r1) {
                            m4643b(r10);
                        }
                    }
                }
            } else if (bmVar instanceof bv) {
                r10 = (bv) bmVar;
                m4633a(this.f4406h, (bk) r10);
                if (m4656k()) {
                    if (r10.f4372a != null) {
                        this.f4399a.concat(r10.f4372a);
                    }
                    r1 = (r10.b == null || r10.b.size() == 0) ? 0.0f : ((af) r10.b.get(0)).m4571a(this);
                    r3 = (r10.c == null || r10.c.size() == 0) ? 0.0f : ((af) r10.c.get(0)).m4574b(this);
                    float a2 = (r10.d == null || r10.d.size() == 0) ? 0.0f : ((af) r10.d.get(0)).m4571a(this);
                    if (!(r10.e == null || r10.e.size() == 0)) {
                        f = ((af) r10.e.get(0)).m4574b(this);
                    }
                    ba j = m4655j();
                    if (j != ba.Start) {
                        r5 = m4608a((bx) r10);
                        if (j == ba.Middle) {
                            r1 -= r5 / 2.0f;
                        } else {
                            r1 -= r5;
                        }
                    }
                    if (r10.n == null) {
                        co cnVar = new cn(this, r1, r3);
                        m4631a((bx) r10, cnVar);
                        r10.n = new C0723r(cnVar.f4447c.left, cnVar.f4447c.top, cnVar.f4447c.width(), cnVar.f4447c.height());
                    }
                    m4626a(r10);
                    m4647c(r10);
                    m4649d(r10);
                    r0 = m4652g();
                    m4631a((bx) r10, new ck(this, r1 + a2, f + r3));
                    if (r0) {
                        m4643b(r10);
                    }
                }
            }
            m4650e();
        }
    }

    private final void m4625a(bi biVar, boolean z) {
        if (z) {
            m4624a(biVar);
        }
        for (bm b : biVar.mo1095a()) {
            m4644b(b);
        }
        if (z) {
            m4651f();
        }
    }

    private final void m4648d() {
        this.f4399a.save();
        this.f4407i.push(this.f4406h);
        this.f4406h = (cm) this.f4406h.clone();
    }

    private final void m4650e() {
        this.f4399a.restore();
        this.f4406h = (cm) this.f4407i.pop();
    }

    private final void m4624a(bi biVar) {
        this.f4408j.push(biVar);
        this.f4409k.push(this.f4399a.getMatrix());
    }

    private final void m4651f() {
        this.f4408j.pop();
        this.f4409k.pop();
    }

    private final void m4633a(cm cmVar, bk bkVar) {
        int i = bkVar.u == null ? 1 : 0;
        av avVar = cmVar.f4436a;
        avVar.f4275A = Boolean.TRUE;
        avVar.f4308v = i != 0 ? Boolean.TRUE : Boolean.FALSE;
        avVar.f4309w = null;
        avVar.f4279E = null;
        avVar.f4299m = Float.valueOf(1.0f);
        avVar.f4277C = C0727v.f4632b;
        avVar.f4278D = Float.valueOf(1.0f);
        avVar.f4281G = null;
        avVar.f4282H = null;
        avVar.f4283I = Float.valueOf(1.0f);
        avVar.f4284J = null;
        avVar.f4285K = Float.valueOf(1.0f);
        avVar.f4286L = bd.None;
        if (bkVar.f4207q != null) {
            m4662a(cmVar, bkVar.f4207q);
        }
        C0713h c0713h = this.f4405g.f4617e;
        i = (c0713h.f4582a == null || c0713h.f4582a.isEmpty()) ? 1 : 0;
        if (i == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            for (C0712g c0712g : this.f4405g.f4617e.f4582a) {
                boolean a;
                C0714i c0714i = c0712g.f4580a;
                List arrayList = new ArrayList();
                for (Object obj = bkVar.u; obj != null; obj = ((bm) obj).f4204u) {
                    arrayList.add(0, obj);
                }
                i = arrayList.size() - 1;
                if (c0714i.m4773a() == 1) {
                    a = C0705a.m4525a(c0714i.m4774a(0), arrayList, i, bkVar);
                } else {
                    a = C0705a.m4524a(c0714i, c0714i.m4773a() - 1, arrayList, i, bkVar);
                }
                if (a) {
                    m4662a(cmVar, c0712g.f4581b);
                }
            }
        }
        if (bkVar.f4208r != null) {
            m4662a(cmVar, bkVar.f4208r);
        }
    }

    final void m4661a(bm bmVar) {
        if (bmVar instanceof bk) {
            bk bkVar = (bk) bmVar;
            if (bkVar.f4206p != null) {
                this.f4406h.f4443h = bkVar.f4206p.booleanValue();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4627a(com.caverock.androidsvg.bj r17, android.graphics.Path r18) {
        /*
        r16 = this;
        r0 = r16;
        r2 = r0.f4406h;
        r2 = r2.f4436a;
        r2 = r2.f4288b;
        r2 = r2 instanceof com.caverock.androidsvg.ak;
        if (r2 == 0) goto L_0x0360;
    L_0x000c:
        r0 = r16;
        r3 = r0.f4405g;
        r0 = r16;
        r2 = r0.f4406h;
        r2 = r2.f4436a;
        r2 = r2.f4288b;
        r2 = (com.caverock.androidsvg.ak) r2;
        r2 = r2.f4249a;
        r2 = r3.m4794b(r2);
        r3 = r2 instanceof com.caverock.androidsvg.ao;
        if (r3 == 0) goto L_0x0360;
    L_0x0024:
        r2 = (com.caverock.androidsvg.ao) r2;
        r3 = r2.f4257a;
        if (r3 == 0) goto L_0x0090;
    L_0x002a:
        r3 = r2.f4257a;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0090;
    L_0x0032:
        r3 = 1;
        r4 = r3;
    L_0x0034:
        r3 = r2.f4264h;
        if (r3 == 0) goto L_0x004f;
    L_0x0038:
        r3 = r2.f4264h;
        r5 = r3;
        r6 = r2;
    L_0x003c:
        r3 = r6.t;
        r3 = r3.m4794b(r5);
        if (r3 != 0) goto L_0x0093;
    L_0x0044:
        r3 = "Pattern reference '%s' not found";
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r5;
        m4636a(r3, r6);
    L_0x004f:
        if (r4 == 0) goto L_0x0119;
    L_0x0051:
        r3 = r2.f4260d;
        if (r3 == 0) goto L_0x010d;
    L_0x0055:
        r3 = r2.f4260d;
        r0 = r16;
        r3 = r3.m4571a(r0);
    L_0x005d:
        r4 = r2.f4261e;
        if (r4 == 0) goto L_0x0110;
    L_0x0061:
        r4 = r2.f4261e;
        r0 = r16;
        r4 = r4.m4574b(r0);
    L_0x0069:
        r5 = r2.f4262f;
        if (r5 == 0) goto L_0x0113;
    L_0x006d:
        r5 = r2.f4262f;
        r0 = r16;
        r5 = r5.m4571a(r0);
    L_0x0075:
        r6 = r2.f4263g;
        if (r6 == 0) goto L_0x0116;
    L_0x0079:
        r6 = r2.f4263g;
        r0 = r16;
        r6 = r6.m4574b(r0);
    L_0x0081:
        r8 = r6;
        r9 = r5;
        r5 = r4;
        r6 = r3;
    L_0x0085:
        r3 = 0;
        r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r3 == 0) goto L_0x008f;
    L_0x008a:
        r3 = 0;
        r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r3 != 0) goto L_0x0189;
    L_0x008f:
        return;
    L_0x0090:
        r3 = 0;
        r4 = r3;
        goto L_0x0034;
    L_0x0093:
        r7 = r3 instanceof com.caverock.androidsvg.ao;
        if (r7 != 0) goto L_0x00a0;
    L_0x0097:
        r3 = "Pattern href attributes must point to other pattern elements";
        r5 = 0;
        r5 = new java.lang.Object[r5];
        m4645b(r3, r5);
        goto L_0x004f;
    L_0x00a0:
        if (r3 != r6) goto L_0x00ae;
    L_0x00a2:
        r3 = "Circular reference in pattern href attribute '%s'";
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r6[r7] = r5;
        m4645b(r3, r6);
        goto L_0x004f;
    L_0x00ae:
        r3 = (com.caverock.androidsvg.ao) r3;
        r5 = r6.f4257a;
        if (r5 != 0) goto L_0x00b8;
    L_0x00b4:
        r5 = r3.f4257a;
        r6.f4257a = r5;
    L_0x00b8:
        r5 = r6.f4258b;
        if (r5 != 0) goto L_0x00c0;
    L_0x00bc:
        r5 = r3.f4258b;
        r6.f4258b = r5;
    L_0x00c0:
        r5 = r6.f4259c;
        if (r5 != 0) goto L_0x00c8;
    L_0x00c4:
        r5 = r3.f4259c;
        r6.f4259c = r5;
    L_0x00c8:
        r5 = r6.f4260d;
        if (r5 != 0) goto L_0x00d0;
    L_0x00cc:
        r5 = r3.f4260d;
        r6.f4260d = r5;
    L_0x00d0:
        r5 = r6.f4261e;
        if (r5 != 0) goto L_0x00d8;
    L_0x00d4:
        r5 = r3.f4261e;
        r6.f4261e = r5;
    L_0x00d8:
        r5 = r6.f4262f;
        if (r5 != 0) goto L_0x00e0;
    L_0x00dc:
        r5 = r3.f4262f;
        r6.f4262f = r5;
    L_0x00e0:
        r5 = r6.f4263g;
        if (r5 != 0) goto L_0x00e8;
    L_0x00e4:
        r5 = r3.f4263g;
        r6.f4263g = r5;
    L_0x00e8:
        r5 = r6.i;
        r5 = r5.isEmpty();
        if (r5 == 0) goto L_0x00f4;
    L_0x00f0:
        r5 = r3.i;
        r6.i = r5;
    L_0x00f4:
        r5 = r6.w;
        if (r5 != 0) goto L_0x00fc;
    L_0x00f8:
        r5 = r3.w;
        r6.w = r5;
    L_0x00fc:
        r5 = r6.v;
        if (r5 != 0) goto L_0x0104;
    L_0x0100:
        r5 = r3.v;
        r6.v = r5;
    L_0x0104:
        r5 = r3.f4264h;
        if (r5 == 0) goto L_0x004f;
    L_0x0108:
        r3 = r3.f4264h;
        r5 = r3;
        goto L_0x003c;
    L_0x010d:
        r3 = 0;
        goto L_0x005d;
    L_0x0110:
        r4 = 0;
        goto L_0x0069;
    L_0x0113:
        r5 = 0;
        goto L_0x0075;
    L_0x0116:
        r6 = 0;
        goto L_0x0081;
    L_0x0119:
        r3 = r2.f4260d;
        if (r3 == 0) goto L_0x0181;
    L_0x011d:
        r3 = r2.f4260d;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r16;
        r3 = r3.m4572a(r0, r4);
    L_0x0127:
        r4 = r2.f4261e;
        if (r4 == 0) goto L_0x0183;
    L_0x012b:
        r4 = r2.f4261e;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r16;
        r4 = r4.m4572a(r0, r5);
    L_0x0135:
        r5 = r2.f4262f;
        if (r5 == 0) goto L_0x0185;
    L_0x0139:
        r5 = r2.f4262f;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r16;
        r5 = r5.m4572a(r0, r6);
    L_0x0143:
        r6 = r2.f4263g;
        if (r6 == 0) goto L_0x0187;
    L_0x0147:
        r6 = r2.f4263g;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r16;
        r6 = r6.m4572a(r0, r7);
    L_0x0151:
        r0 = r17;
        r7 = r0.f4210n;
        r7 = r7.f4620a;
        r0 = r17;
        r8 = r0.f4210n;
        r8 = r8.f4622c;
        r3 = r3 * r8;
        r3 = r3 + r7;
        r0 = r17;
        r7 = r0.f4210n;
        r7 = r7.f4621b;
        r0 = r17;
        r8 = r0.f4210n;
        r8 = r8.f4623d;
        r4 = r4 * r8;
        r4 = r4 + r7;
        r0 = r17;
        r7 = r0.f4210n;
        r7 = r7.f4622c;
        r5 = r5 * r7;
        r0 = r17;
        r7 = r0.f4210n;
        r7 = r7.f4623d;
        r6 = r6 * r7;
        r8 = r6;
        r9 = r5;
        r5 = r4;
        r6 = r3;
        goto L_0x0085;
    L_0x0181:
        r3 = 0;
        goto L_0x0127;
    L_0x0183:
        r4 = 0;
        goto L_0x0135;
    L_0x0185:
        r5 = 0;
        goto L_0x0143;
    L_0x0187:
        r6 = 0;
        goto L_0x0151;
    L_0x0189:
        r3 = r2.v;
        if (r3 == 0) goto L_0x0282;
    L_0x018d:
        r3 = r2.v;
        r4 = r3;
    L_0x0190:
        r16.m4648d();
        r0 = r16;
        r3 = r0.f4399a;
        r0 = r18;
        r3.clipPath(r0);
        r3 = new com.caverock.androidsvg.cm;
        r3.<init>();
        r7 = com.caverock.androidsvg.av.m4598a();
        r0 = r16;
        r0.m4662a(r3, r7);
        r7 = r3.f4436a;
        r10 = 0;
        r10 = java.lang.Boolean.valueOf(r10);
        r7.f4308v = r10;
        r0 = r16;
        r3 = r0.m4615a(r2, r3);
        r0 = r16;
        r0.f4406h = r3;
        r0 = r17;
        r3 = r0.f4210n;
        r7 = r2.f4259c;
        if (r7 == 0) goto L_0x029b;
    L_0x01c5:
        r0 = r16;
        r7 = r0.f4399a;
        r10 = r2.f4259c;
        r7.concat(r10);
        r7 = new android.graphics.Matrix;
        r7.<init>();
        r10 = r2.f4259c;
        r10 = r10.invert(r7);
        if (r10 == 0) goto L_0x029b;
    L_0x01db:
        r3 = 8;
        r10 = new float[r3];
        r3 = 0;
        r0 = r17;
        r11 = r0.f4210n;
        r11 = r11.f4620a;
        r10[r3] = r11;
        r3 = 1;
        r0 = r17;
        r11 = r0.f4210n;
        r11 = r11.f4621b;
        r10[r3] = r11;
        r3 = 2;
        r0 = r17;
        r11 = r0.f4210n;
        r11 = r11.m4798a();
        r10[r3] = r11;
        r3 = 3;
        r0 = r17;
        r11 = r0.f4210n;
        r11 = r11.f4621b;
        r10[r3] = r11;
        r3 = 4;
        r0 = r17;
        r11 = r0.f4210n;
        r11 = r11.m4798a();
        r10[r3] = r11;
        r3 = 5;
        r0 = r17;
        r11 = r0.f4210n;
        r11 = r11.m4799b();
        r10[r3] = r11;
        r3 = 6;
        r0 = r17;
        r11 = r0.f4210n;
        r11 = r11.f4620a;
        r10[r3] = r11;
        r3 = 7;
        r0 = r17;
        r11 = r0.f4210n;
        r11 = r11.m4799b();
        r10[r3] = r11;
        r7.mapPoints(r10);
        r7 = new android.graphics.RectF;
        r3 = 0;
        r3 = r10[r3];
        r11 = 1;
        r11 = r10[r11];
        r12 = 0;
        r12 = r10[r12];
        r13 = 1;
        r13 = r10[r13];
        r7.<init>(r3, r11, r12, r13);
        r3 = 2;
    L_0x0244:
        r11 = 6;
        if (r3 > r11) goto L_0x0287;
    L_0x0247:
        r11 = r10[r3];
        r12 = r7.left;
        r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r11 >= 0) goto L_0x0253;
    L_0x024f:
        r11 = r10[r3];
        r7.left = r11;
    L_0x0253:
        r11 = r10[r3];
        r12 = r7.right;
        r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r11 <= 0) goto L_0x025f;
    L_0x025b:
        r11 = r10[r3];
        r7.right = r11;
    L_0x025f:
        r11 = r3 + 1;
        r11 = r10[r11];
        r12 = r7.top;
        r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r11 >= 0) goto L_0x026f;
    L_0x0269:
        r11 = r3 + 1;
        r11 = r10[r11];
        r7.top = r11;
    L_0x026f:
        r11 = r3 + 1;
        r11 = r10[r11];
        r12 = r7.bottom;
        r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r11 <= 0) goto L_0x027f;
    L_0x0279:
        r11 = r3 + 1;
        r11 = r10[r11];
        r7.bottom = r11;
    L_0x027f:
        r3 = r3 + 2;
        goto L_0x0244;
    L_0x0282:
        r3 = com.caverock.androidsvg.C0718m.f4596d;
        r4 = r3;
        goto L_0x0190;
    L_0x0287:
        r3 = new com.caverock.androidsvg.r;
        r10 = r7.left;
        r11 = r7.top;
        r12 = r7.right;
        r13 = r7.left;
        r12 = r12 - r13;
        r13 = r7.bottom;
        r7 = r7.top;
        r7 = r13 - r7;
        r3.<init>(r10, r11, r12, r7);
    L_0x029b:
        r7 = r3.f4620a;
        r7 = r7 - r6;
        r7 = r7 / r9;
        r10 = (double) r7;
        r10 = java.lang.Math.floor(r10);
        r7 = (float) r10;
        r7 = r7 * r9;
        r6 = r6 + r7;
        r7 = r3.f4621b;
        r7 = r7 - r5;
        r7 = r7 / r8;
        r10 = (double) r7;
        r10 = java.lang.Math.floor(r10);
        r7 = (float) r10;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r10 = r3.m4798a();
        r11 = r3.m4799b();
        r12 = new com.caverock.androidsvg.r;
        r3 = 0;
        r7 = 0;
        r12.<init>(r3, r7, r9, r8);
        r7 = r5;
    L_0x02c3:
        r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r3 >= 0) goto L_0x035b;
    L_0x02c7:
        r5 = r6;
    L_0x02c8:
        r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1));
        if (r3 >= 0) goto L_0x0356;
    L_0x02cc:
        r12.f4620a = r5;
        r12.f4621b = r7;
        r16.m4648d();
        r0 = r16;
        r3 = r0.f4406h;
        r3 = r3.f4436a;
        r3 = r3.f4308v;
        r3 = r3.booleanValue();
        if (r3 != 0) goto L_0x02ee;
    L_0x02e1:
        r3 = r12.f4620a;
        r13 = r12.f4621b;
        r14 = r12.f4622c;
        r15 = r12.f4623d;
        r0 = r16;
        r0.m4618a(r3, r13, r14, r15);
    L_0x02ee:
        r3 = r2.w;
        if (r3 == 0) goto L_0x031b;
    L_0x02f2:
        r0 = r16;
        r3 = r0.f4399a;
        r13 = r2.w;
        r13 = m4610a(r12, r13, r4);
        r3.concat(r13);
    L_0x02ff:
        r13 = r16.m4652g();
        r3 = r2.i;
        r14 = r3.iterator();
    L_0x0309:
        r3 = r14.hasNext();
        if (r3 == 0) goto L_0x0347;
    L_0x030f:
        r3 = r14.next();
        r3 = (com.caverock.androidsvg.bm) r3;
        r0 = r16;
        r0.m4644b(r3);
        goto L_0x0309;
    L_0x031b:
        r3 = r2.f4258b;
        if (r3 == 0) goto L_0x0327;
    L_0x031f:
        r3 = r2.f4258b;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0345;
    L_0x0327:
        r3 = 1;
    L_0x0328:
        r0 = r16;
        r13 = r0.f4399a;
        r13.translate(r5, r7);
        if (r3 != 0) goto L_0x02ff;
    L_0x0331:
        r0 = r16;
        r3 = r0.f4399a;
        r0 = r17;
        r13 = r0.f4210n;
        r13 = r13.f4622c;
        r0 = r17;
        r14 = r0.f4210n;
        r14 = r14.f4623d;
        r3.scale(r13, r14);
        goto L_0x02ff;
    L_0x0345:
        r3 = 0;
        goto L_0x0328;
    L_0x0347:
        if (r13 == 0) goto L_0x034e;
    L_0x0349:
        r0 = r16;
        r0.m4643b(r2);
    L_0x034e:
        r16.m4650e();
        r3 = r5 + r9;
        r5 = r3;
        goto L_0x02c8;
    L_0x0356:
        r3 = r7 + r8;
        r7 = r3;
        goto L_0x02c3;
    L_0x035b:
        r16.m4650e();
        goto L_0x008f;
    L_0x0360:
        r0 = r16;
        r2 = r0.f4399a;
        r0 = r16;
        r3 = r0.f4406h;
        r3 = r3.f4439d;
        r0 = r18;
        r2.drawPath(r0, r3);
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.cf.a(com.caverock.androidsvg.bj, android.graphics.Path):void");
    }

    private final void m4620a(Path path) {
        if (this.f4406h.f4436a.f4286L == bd.NonScalingStroke) {
            Matrix matrix = this.f4399a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f4399a.setMatrix(new Matrix());
            Shader shader = this.f4406h.f4440e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f4399a.drawPath(path2, this.f4406h.f4440e);
            this.f4399a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f4399a.drawPath(path, this.f4406h.f4440e);
    }

    static void m4636a(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    static void m4645b(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private final void m4623a(be beVar, af afVar, af afVar2) {
        m4660a(beVar, afVar, afVar2, beVar.w, beVar.v);
    }

    final void m4660a(be beVar, af afVar, af afVar2, C0723r c0723r, C0718m c0718m) {
        float f = 0.0f;
        if (afVar != null && afVar.m4573a()) {
            return;
        }
        if (afVar2 == null || !afVar2.m4573a()) {
            C0718m c0718m2 = c0718m == null ? beVar.v != null ? beVar.v : C0718m.f4596d : c0718m;
            m4633a(this.f4406h, (bk) beVar);
            if (m4656k()) {
                float a;
                if (beVar.u != null) {
                    if (beVar.f4347a != null) {
                        a = beVar.f4347a.m4571a(this);
                    } else {
                        a = 0.0f;
                    }
                    if (beVar.f4348b != null) {
                        f = beVar.f4348b.m4574b(this);
                    }
                } else {
                    a = 0.0f;
                }
                C0723r b = m4663b();
                this.f4406h.f4441f = new C0723r(a, f, afVar != null ? afVar.m4571a(this) : b.f4622c, afVar2 != null ? afVar2.m4574b(this) : b.f4623d);
                if (!this.f4406h.f4436a.f4308v.booleanValue()) {
                    m4618a(this.f4406h.f4441f.f4620a, this.f4406h.f4441f.f4621b, this.f4406h.f4441f.f4622c, this.f4406h.f4441f.f4623d);
                }
                m4628a((bj) beVar, this.f4406h.f4441f);
                if (c0723r != null) {
                    this.f4399a.concat(m4610a(this.f4406h.f4441f, c0723r, c0718m2));
                    this.f4406h.f4442g = beVar.w;
                } else {
                    this.f4399a.translate(a, f);
                }
                boolean g = m4652g();
                m4657l();
                m4625a((bi) beVar, true);
                if (g) {
                    m4643b((bj) beVar);
                }
                m4626a((bj) beVar);
            }
        }
    }

    private final void m4626a(bj bjVar) {
        if (bjVar.u != null && bjVar.f4210n != null) {
            Matrix matrix = new Matrix();
            if (((Matrix) this.f4409k.peek()).invert(matrix)) {
                float[] fArr = new float[]{bjVar.f4210n.f4620a, bjVar.f4210n.f4621b, bjVar.f4210n.m4798a(), bjVar.f4210n.f4621b, bjVar.f4210n.m4798a(), bjVar.f4210n.m4799b(), bjVar.f4210n.f4620a, bjVar.f4210n.m4799b()};
                matrix.preConcat(this.f4399a.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    if (fArr[i + 1] < rectF.top) {
                        rectF.top = fArr[i + 1];
                    }
                    if (fArr[i + 1] > rectF.bottom) {
                        rectF.bottom = fArr[i + 1];
                    }
                }
                bj bjVar2 = (bj) this.f4408j.peek();
                if (bjVar2.f4210n == null) {
                    bjVar2.f4210n = C0723r.m4797a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
                C0723r c0723r = bjVar2.f4210n;
                C0723r a = C0723r.m4797a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                if (a.f4620a < c0723r.f4620a) {
                    c0723r.f4620a = a.f4620a;
                }
                if (a.f4621b < c0723r.f4621b) {
                    c0723r.f4621b = a.f4621b;
                }
                if (a.m4798a() > c0723r.m4798a()) {
                    c0723r.f4622c = a.m4798a() - c0723r.f4620a;
                }
                if (a.m4799b() > c0723r.m4799b()) {
                    c0723r.f4623d = a.m4799b() - c0723r.f4621b;
                }
            }
        }
    }

    private final boolean m4652g() {
        if (!(this.f4406h.f4436a.f4281G == null || this.f4406h.f4444i)) {
            m4636a("Masks are not supported when using getPicture()", new Object[0]);
        }
        int i = (this.f4406h.f4436a.f4299m.floatValue() < 1.0f || (this.f4406h.f4436a.f4281G != null && this.f4406h.f4444i)) ? 1 : 0;
        if (i == 0) {
            return false;
        }
        this.f4399a.saveLayerAlpha(null, m4609a(this.f4406h.f4436a.f4299m.floatValue()), 4);
        this.f4407i.push(this.f4406h);
        this.f4406h = (cm) this.f4406h.clone();
        if (this.f4406h.f4436a.f4281G != null && this.f4406h.f4444i) {
            bm b = this.f4405g.m4794b(this.f4406h.f4436a.f4281G);
            if (b == null || !(b instanceof ai)) {
                m4645b("Mask reference '%s' not found", this.f4406h.f4436a.f4281G);
                this.f4406h.f4436a.f4281G = null;
                return true;
            }
            this.f4410l.push(this.f4399a);
            m4653h();
        }
        return true;
    }

    private final void m4643b(bj bjVar) {
        if (this.f4406h.f4436a.f4281G != null && this.f4406h.f4444i) {
            float a;
            bm b = this.f4405g.m4794b(this.f4406h.f4436a.f4281G);
            m4653h();
            bi biVar = (ai) b;
            Object obj = (biVar.f4243a == null || !biVar.f4243a.booleanValue()) ? null : 1;
            float b2;
            if (obj != null) {
                a = biVar.f4247e != null ? biVar.f4247e.m4571a(this) : bjVar.f4210n.f4622c;
                b2 = biVar.f4248f != null ? biVar.f4248f.m4574b(this) : bjVar.f4210n.f4623d;
                if (biVar.f4245c != null) {
                    biVar.f4245c.m4571a(this);
                }
                if (biVar.f4246d != null) {
                    biVar.f4246d.m4574b(this);
                }
            } else {
                if (biVar.f4245c != null) {
                    biVar.f4245c.m4572a(this, 1.0f);
                }
                if (biVar.f4246d != null) {
                    biVar.f4246d.m4572a(this, 1.0f);
                }
                a = (biVar.f4247e != null ? biVar.f4247e.m4572a(this, 1.0f) : 1.2f) * bjVar.f4210n.f4622c;
                b2 = (biVar.f4248f != null ? biVar.f4248f.m4572a(this, 1.0f) : 1.2f) * bjVar.f4210n.f4623d;
            }
            if (!(a == 0.0f || r3 == 0.0f)) {
                m4648d();
                this.f4406h = m4646c((bm) biVar);
                this.f4406h.f4436a.f4299m = Float.valueOf(1.0f);
                obj = (biVar.f4244b == null || biVar.f4244b.booleanValue()) ? 1 : null;
                if (obj == null) {
                    this.f4399a.translate(bjVar.f4210n.f4620a, bjVar.f4210n.f4621b);
                    this.f4399a.scale(bjVar.f4210n.f4622c, bjVar.f4210n.f4623d);
                }
                m4625a(biVar, false);
                m4650e();
            }
            Bitmap bitmap = (Bitmap) this.f4411m.pop();
            Bitmap bitmap2 = (Bitmap) this.f4411m.pop();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width];
            int[] iArr2 = new int[width];
            for (int i = 0; i < height; i++) {
                bitmap.getPixels(iArr, 0, width, 0, i, width, 1);
                bitmap2.getPixels(iArr2, 0, width, 0, i, width, 1);
                for (int i2 = 0; i2 < width; i2++) {
                    int i3 = iArr[i2];
                    int i4 = i3 & HprofParser.ROOT_UNKNOWN;
                    int i5 = (i3 >> 8) & HprofParser.ROOT_UNKNOWN;
                    int i6 = (i3 >> 16) & HprofParser.ROOT_UNKNOWN;
                    i3 = (i3 >> 24) & HprofParser.ROOT_UNKNOWN;
                    if (i3 == 0) {
                        iArr2[i2] = 0;
                    } else {
                        i3 = (i3 * ((i4 * 2362) + ((i5 * 23442) + (i6 * 6963)))) / 8355840;
                        i4 = iArr2[i2];
                        iArr2[i2] = (((i3 * ((i4 >> 24) & HprofParser.ROOT_UNKNOWN)) / HprofParser.ROOT_UNKNOWN) << 24) | (i4 & 16777215);
                    }
                }
                bitmap2.setPixels(iArr2, 0, width, 0, i, width, 1);
            }
            bitmap.recycle();
            this.f4399a = (Canvas) this.f4410l.pop();
            this.f4399a.save();
            this.f4399a.setMatrix(new Matrix());
            this.f4399a.drawBitmap(bitmap2, 0.0f, 0.0f, this.f4406h.f4439d);
            bitmap2.recycle();
            this.f4399a.restore();
        }
        m4650e();
    }

    private final void m4653h() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.f4399a.getWidth(), this.f4399a.getHeight(), Config.ARGB_8888);
            this.f4411m.push(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setMatrix(this.f4399a.getMatrix());
            this.f4399a = canvas;
        } catch (OutOfMemoryError e) {
            m4645b("Not enough memory to create temporary bitmaps for mask processing", new Object[0]);
            throw e;
        }
    }

    private final void m4630a(br brVar) {
        String language = Locale.getDefault().getLanguage();
        ct ctVar = this.f4405g.f4615c;
        for (bm bmVar : brVar.f4217i) {
            if (bmVar instanceof bf) {
                bf bfVar = (bf) bmVar;
                if (bfVar.mo1088c() == null) {
                    Set d = bfVar.mo1090d();
                    if (d == null || (!d.isEmpty() && d.contains(language))) {
                        Collection b = bfVar.mo1086b();
                        if (b != null) {
                            if (f4398n == null) {
                                m4654i();
                            }
                            if (b.isEmpty()) {
                                continue;
                            } else if (!f4398n.containsAll(b)) {
                                continue;
                            }
                        }
                        d = bfVar.mo1092e();
                        if (d != null) {
                            if (!(d.isEmpty() || ctVar == null)) {
                                Iterator it = d.iterator();
                                if (it.hasNext()) {
                                    it.next();
                                    throw new NoSuchMethodError();
                                }
                            }
                        }
                        Set f = bfVar.mo1093f();
                        if (f != null) {
                            if (!(f.isEmpty() || ctVar == null)) {
                                Iterator it2 = f.iterator();
                                if (it2.hasNext()) {
                                    it2.next();
                                    this.f4406h.f4436a.f4303q.intValue();
                                    String.valueOf(this.f4406h.f4436a.f4304r);
                                    throw new NoSuchMethodError();
                                }
                            }
                        }
                        m4644b(bmVar);
                        return;
                    }
                }
                continue;
            }
        }
    }

    private static synchronized void m4654i() {
        synchronized (cf.class) {
            HashSet hashSet = new HashSet();
            f4398n = hashSet;
            hashSet.add("Structure");
            f4398n.add("BasicStructure");
            f4398n.add("ConditionalProcessing");
            f4398n.add("Image");
            f4398n.add("Style");
            f4398n.add("ViewportAttribute");
            f4398n.add("Shape");
            f4398n.add("BasicText");
            f4398n.add("PaintAttribute");
            f4398n.add("BasicPaintAttribute");
            f4398n.add("OpacityAttribute");
            f4398n.add("BasicGraphicsAttribute");
            f4398n.add("Marker");
            f4398n.add("Gradient");
            f4398n.add("Pattern");
            f4398n.add("Clip");
            f4398n.add("BasicClip");
            f4398n.add("Mask");
            f4398n.add("View");
        }
    }

    private static C0723r m4641b(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C0723r(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private static List m4617a(ap apVar) {
        int i = 2;
        float f = 0.0f;
        int length = apVar.f4265a.length;
        if (length < 2) {
            return null;
        }
        List arrayList = new ArrayList();
        ch chVar = new ch(apVar.f4265a[0], apVar.f4265a[1], 0.0f, 0.0f);
        float f2 = 0.0f;
        while (i < length) {
            f2 = apVar.f4265a[i];
            f = apVar.f4265a[i + 1];
            chVar.m4671a(f2, f);
            arrayList.add(chVar);
            i += 2;
            chVar = new ch(f2, f, f2 - chVar.f4420a, f - chVar.f4421b);
        }
        if (!(apVar instanceof aq)) {
            arrayList.add(chVar);
        } else if (!(f2 == apVar.f4265a[0] || r2 == apVar.f4265a[1])) {
            float f3 = apVar.f4265a[0];
            f = apVar.f4265a[1];
            chVar.m4671a(f3, f);
            arrayList.add(chVar);
            ch chVar2 = new ch(f3, f, f3 - chVar.f4420a, f - chVar.f4421b);
            chVar2.m4672a((ch) arrayList.get(0));
            arrayList.add(chVar2);
            arrayList.set(0, chVar2);
        }
        return arrayList;
    }

    private final ba m4655j() {
        if (this.f4406h.f4436a.f4306t == bc.LTR || this.f4406h.f4436a.f4307u == ba.Middle) {
            return this.f4406h.f4436a.f4307u;
        }
        return this.f4406h.f4436a.f4307u == ba.Start ? ba.End : ba.Start;
    }

    private final void m4631a(bx bxVar, co coVar) {
        if (m4656k()) {
            Iterator it = bxVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                bm bmVar = (bm) it.next();
                if (bmVar instanceof cb) {
                    boolean z2;
                    String str = ((cb) bmVar).f4381a;
                    if (it.hasNext()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    coVar.mo1105a(m4616a(str, z, z2));
                } else if (coVar.mo1106a((bx) bmVar)) {
                    bj bjVar;
                    float a;
                    float a2;
                    float f;
                    if (bmVar instanceof by) {
                        m4648d();
                        bjVar = (by) bmVar;
                        m4633a(this.f4406h, (bk) bjVar);
                        if (m4656k() && m4664c()) {
                            bm b = bjVar.t.m4794b(bjVar.f4373a);
                            if (b == null) {
                                m4645b("TextPath reference '%s' not found", bjVar.f4373a);
                            } else {
                                al alVar = (al) b;
                                Path path = new ci(alVar.f4251a).f4424a;
                                if (alVar.e != null) {
                                    path.transform(alVar.e);
                                }
                                a = bjVar.f4374b != null ? bjVar.f4374b.m4572a(this, new PathMeasure(path, false).getLength()) : 0.0f;
                                ba j = m4655j();
                                if (j != ba.Start) {
                                    a2 = m4608a((bx) bjVar);
                                    if (j == ba.Middle) {
                                        f = a - (a2 / 2.0f);
                                    } else {
                                        f = a - a2;
                                    }
                                } else {
                                    f = a;
                                }
                                m4647c((bj) bjVar.f4375c);
                                z = m4652g();
                                m4631a((bx) bjVar, new cj(this, path, f));
                                if (z) {
                                    m4643b(bjVar);
                                }
                            }
                        }
                        m4650e();
                    } else if (bmVar instanceof bu) {
                        m4648d();
                        bjVar = (bu) bmVar;
                        m4633a(this.f4406h, (bk) bjVar);
                        if (m4656k()) {
                            float b2;
                            float f2;
                            if (coVar instanceof ck) {
                                f = (bjVar.b == null || bjVar.b.size() == 0) ? ((ck) coVar).f4428c : ((af) bjVar.b.get(0)).m4571a(this);
                                b2 = (bjVar.c == null || bjVar.c.size() == 0) ? ((ck) coVar).f4429d : ((af) bjVar.c.get(0)).m4574b(this);
                                a2 = (bjVar.d == null || bjVar.d.size() == 0) ? 0.0f : ((af) bjVar.d.get(0)).m4571a(this);
                                if (bjVar.e == null || bjVar.e.size() == 0) {
                                    a = 0.0f;
                                } else {
                                    a = ((af) bjVar.e.get(0)).m4574b(this);
                                }
                                f2 = f;
                                f = a;
                            } else {
                                f = 0.0f;
                                a2 = 0.0f;
                                b2 = 0.0f;
                                f2 = 0.0f;
                            }
                            m4647c((bj) bjVar.f4371a);
                            if (coVar instanceof ck) {
                                ((ck) coVar).f4428c = a2 + f2;
                                ((ck) coVar).f4429d = f + b2;
                            }
                            z = m4652g();
                            m4631a((bx) bjVar, coVar);
                            if (z) {
                                m4643b(bjVar);
                            }
                        }
                        m4650e();
                    } else if (bmVar instanceof bt) {
                        m4648d();
                        bk bkVar = (bt) bmVar;
                        m4633a(this.f4406h, bkVar);
                        if (m4656k()) {
                            m4647c((bj) bkVar.f4366b);
                            bmVar = bmVar.f4203t.m4794b(bkVar.f4365a);
                            if (bmVar == null || !(bmVar instanceof bx)) {
                                m4645b("Tref reference '%s' not found", bkVar.f4365a);
                            } else {
                                StringBuilder stringBuilder = new StringBuilder();
                                m4632a((bx) bmVar, stringBuilder);
                                if (stringBuilder.length() > 0) {
                                    coVar.mo1105a(stringBuilder.toString());
                                }
                            }
                        }
                        m4650e();
                    }
                }
                z = false;
            }
        }
    }

    private final float m4608a(bx bxVar) {
        co cpVar = new cp(this);
        m4631a(bxVar, cpVar);
        return cpVar.f4449a;
    }

    private final void m4632a(bx bxVar, StringBuilder stringBuilder) {
        Iterator it = bxVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            bm bmVar = (bm) it.next();
            if (bmVar instanceof bx) {
                m4632a((bx) bmVar, stringBuilder);
            } else if (bmVar instanceof cb) {
                stringBuilder.append(m4616a(((cb) bmVar).f4381a, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private final String m4616a(String str, boolean z, boolean z2) {
        if (this.f4406h.f4443h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private final boolean m4656k() {
        if (this.f4406h.f4436a.f4275A != null) {
            return this.f4406h.f4436a.f4275A.booleanValue();
        }
        return true;
    }

    final boolean m4664c() {
        if (this.f4406h.f4436a.f4276B != null) {
            return this.f4406h.f4436a.f4276B.booleanValue();
        }
        return true;
    }

    private static Matrix m4610a(C0723r c0723r, C0723r c0723r2, C0718m c0718m) {
        Matrix matrix = new Matrix();
        if (c0718m == null || c0718m.f4597a == null) {
            return matrix;
        }
        float f = c0723r.f4622c / c0723r2.f4622c;
        float f2 = c0723r.f4623d / c0723r2.f4623d;
        float f3 = -c0723r2.f4620a;
        float f4 = -c0723r2.f4621b;
        if (c0718m.equals(C0718m.f4595c)) {
            matrix.preTranslate(c0723r.f4620a, c0723r.f4621b);
            matrix.preScale(f, f2);
            matrix.preTranslate(f3, f4);
            return matrix;
        }
        f = c0718m.f4598b == C0720o.f4611b ? Math.max(f, f2) : Math.min(f, f2);
        f2 = c0723r.f4622c / f;
        float f5 = c0723r.f4623d / f;
        switch (c0718m.f4597a.ordinal()) {
            case 2:
            case 5:
            case 8:
                f3 -= (c0723r2.f4622c - f2) / 2.0f;
                break;
            case 3:
            case 6:
            case 9:
                f3 -= c0723r2.f4622c - f2;
                break;
        }
        switch (c0718m.f4597a.ordinal()) {
            case 4:
            case 5:
            case 6:
                f4 -= (c0723r2.f4623d - f5) / 2.0f;
                break;
            case 7:
            case 8:
            case 9:
                f4 -= c0723r2.f4623d - f5;
                break;
        }
        matrix.preTranslate(c0723r.f4620a, c0723r.f4621b);
        matrix.preScale(f, f);
        matrix.preTranslate(f3, f4);
        return matrix;
    }

    private static boolean m4639a(av avVar, long j) {
        return (avVar.f4287a & j) != 0;
    }

    final void m4662a(cm cmVar, av avVar) {
        boolean z;
        float c;
        if (m4639a(avVar, 4096)) {
            cmVar.f4436a.f4300n = avVar.f4300n;
        }
        if (m4639a(avVar, 2048)) {
            cmVar.f4436a.f4299m = avVar.f4299m;
        }
        if (m4639a(avVar, 1)) {
            cmVar.f4436a.f4288b = avVar.f4288b;
            cmVar.f4437b = avVar.f4288b != null;
        }
        if (m4639a(avVar, 4)) {
            cmVar.f4436a.f4290d = avVar.f4290d;
        }
        if (m4639a(avVar, 6149)) {
            m4634a(cmVar, true, cmVar.f4436a.f4288b);
        }
        if (m4639a(avVar, 2)) {
            cmVar.f4436a.f4289c = avVar.f4289c;
        }
        if (m4639a(avVar, 8)) {
            cmVar.f4436a.f4291e = avVar.f4291e;
            if (avVar.f4291e != null) {
                z = true;
            } else {
                z = false;
            }
            cmVar.f4438c = z;
        }
        if (m4639a(avVar, 16)) {
            cmVar.f4436a.f4292f = avVar.f4292f;
        }
        if (m4639a(avVar, 6168)) {
            m4634a(cmVar, false, cmVar.f4436a.f4291e);
        }
        if (m4639a(avVar, 34359738368L)) {
            cmVar.f4436a.f4286L = avVar.f4286L;
        }
        if (m4639a(avVar, 32)) {
            cmVar.f4436a.f4293g = avVar.f4293g;
            cmVar.f4440e.setStrokeWidth(cmVar.f4436a.f4293g.m4576c(this));
        }
        if (m4639a(avVar, 64)) {
            cmVar.f4436a.f4294h = avVar.f4294h;
            switch (avVar.f4294h.ordinal()) {
                case 0:
                    cmVar.f4440e.setStrokeCap(Cap.BUTT);
                    break;
                case 1:
                    cmVar.f4440e.setStrokeCap(Cap.ROUND);
                    break;
                case 2:
                    cmVar.f4440e.setStrokeCap(Cap.SQUARE);
                    break;
            }
        }
        if (m4639a(avVar, 128)) {
            cmVar.f4436a.f4295i = avVar.f4295i;
            switch (avVar.f4295i.ordinal()) {
                case 0:
                    cmVar.f4440e.setStrokeJoin(Join.MITER);
                    break;
                case 1:
                    cmVar.f4440e.setStrokeJoin(Join.ROUND);
                    break;
                case 2:
                    cmVar.f4440e.setStrokeJoin(Join.BEVEL);
                    break;
            }
        }
        if (m4639a(avVar, 256)) {
            cmVar.f4436a.f4296j = avVar.f4296j;
            cmVar.f4440e.setStrokeMiter(avVar.f4296j.floatValue());
        }
        if (m4639a(avVar, 512)) {
            cmVar.f4436a.f4297k = avVar.f4297k;
        }
        if (m4639a(avVar, 1024)) {
            cmVar.f4436a.f4298l = avVar.f4298l;
        }
        if (m4639a(avVar, 1536)) {
            if (cmVar.f4436a.f4297k == null) {
                cmVar.f4440e.setPathEffect(null);
            } else {
                int length = cmVar.f4436a.f4297k.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    fArr[i2] = cmVar.f4436a.f4297k[i2 % length].m4576c(this);
                    f += fArr[i2];
                }
                if (f == 0.0f) {
                    cmVar.f4440e.setPathEffect(null);
                } else {
                    c = cmVar.f4436a.f4298l.m4576c(this);
                    if (c < 0.0f) {
                        c = (c % f) + f;
                    }
                    cmVar.f4440e.setPathEffect(new DashPathEffect(fArr, c));
                }
            }
        }
        if (m4639a(avVar, 16384)) {
            c = m4659a();
            cmVar.f4436a.f4302p = avVar.f4302p;
            cmVar.f4439d.setTextSize(avVar.f4302p.m4572a(this, c));
            cmVar.f4440e.setTextSize(avVar.f4302p.m4572a(this, c));
        }
        if (m4639a(avVar, 8192)) {
            cmVar.f4436a.f4301o = avVar.f4301o;
        }
        if (m4639a(avVar, 32768)) {
            av avVar2;
            if (avVar.f4303q.intValue() == -1 && cmVar.f4436a.f4303q.intValue() > 100) {
                avVar2 = cmVar.f4436a;
                avVar2.f4303q = Integer.valueOf(avVar2.f4303q.intValue() - 100);
            } else if (avVar.f4303q.intValue() != 1 || cmVar.f4436a.f4303q.intValue() >= 900) {
                cmVar.f4436a.f4303q = avVar.f4303q;
            } else {
                avVar2 = cmVar.f4436a;
                avVar2.f4303q = Integer.valueOf(avVar2.f4303q.intValue() + 100);
            }
        }
        if (m4639a(avVar, 65536)) {
            cmVar.f4436a.f4304r = avVar.f4304r;
        }
        if (m4639a(avVar, 106496)) {
            Typeface typeface;
            if (cmVar.f4436a.f4301o == null || this.f4405g == null) {
                typeface = null;
            } else {
                ct ctVar = this.f4405g.f4615c;
                typeface = null;
                for (String a : cmVar.f4436a.f4301o) {
                    typeface = m4614a(a, cmVar.f4436a.f4303q, cmVar.f4436a.f4304r);
                    if (typeface == null && ctVar != null) {
                        cmVar.f4436a.f4303q.intValue();
                        String.valueOf(cmVar.f4436a.f4304r);
                        throw new NoSuchMethodError();
                    } else if (typeface != null) {
                    }
                }
            }
            if (typeface == null) {
                typeface = m4614a("sans-serif", cmVar.f4436a.f4303q, cmVar.f4436a.f4304r);
            }
            cmVar.f4439d.setTypeface(typeface);
            cmVar.f4440e.setTypeface(typeface);
        }
        if (m4639a(avVar, 131072)) {
            cmVar.f4436a.f4305s = avVar.f4305s;
            cmVar.f4439d.setStrikeThruText(avVar.f4305s == bb.LineThrough);
            Paint paint = cmVar.f4439d;
            if (avVar.f4305s == bb.Underline) {
                z = true;
            } else {
                z = false;
            }
            paint.setUnderlineText(z);
            if (VERSION.SDK_INT >= 17) {
                paint = cmVar.f4440e;
                if (avVar.f4305s == bb.LineThrough) {
                    z = true;
                } else {
                    z = false;
                }
                paint.setStrikeThruText(z);
                paint = cmVar.f4440e;
                if (avVar.f4305s == bb.Underline) {
                    z = true;
                } else {
                    z = false;
                }
                paint.setUnderlineText(z);
            }
        }
        if (m4639a(avVar, 68719476736L)) {
            cmVar.f4436a.f4306t = avVar.f4306t;
        }
        if (m4639a(avVar, 262144)) {
            cmVar.f4436a.f4307u = avVar.f4307u;
        }
        if (m4639a(avVar, 524288)) {
            cmVar.f4436a.f4308v = avVar.f4308v;
        }
        if (m4639a(avVar, 2097152)) {
            cmVar.f4436a.f4310x = avVar.f4310x;
        }
        if (m4639a(avVar, 4194304)) {
            cmVar.f4436a.f4311y = avVar.f4311y;
        }
        if (m4639a(avVar, 8388608)) {
            cmVar.f4436a.f4312z = avVar.f4312z;
        }
        if (m4639a(avVar, 16777216)) {
            cmVar.f4436a.f4275A = avVar.f4275A;
        }
        if (m4639a(avVar, 33554432)) {
            cmVar.f4436a.f4276B = avVar.f4276B;
        }
        if (m4639a(avVar, 1048576)) {
            cmVar.f4436a.f4309w = avVar.f4309w;
        }
        if (m4639a(avVar, 268435456)) {
            cmVar.f4436a.f4279E = avVar.f4279E;
        }
        if (m4639a(avVar, 536870912)) {
            cmVar.f4436a.f4280F = avVar.f4280F;
        }
        if (m4639a(avVar, 1073741824)) {
            cmVar.f4436a.f4281G = avVar.f4281G;
        }
        if (m4639a(avVar, 67108864)) {
            cmVar.f4436a.f4277C = avVar.f4277C;
        }
        if (m4639a(avVar, 134217728)) {
            cmVar.f4436a.f4278D = avVar.f4278D;
        }
        if (m4639a(avVar, 8589934592L)) {
            cmVar.f4436a.f4284J = avVar.f4284J;
        }
        if (m4639a(avVar, 17179869184L)) {
            cmVar.f4436a.f4285K = avVar.f4285K;
        }
        if (this.f4403e != null) {
            cmVar.f4436a.f4290d = Float.valueOf(((float) Color.alpha(this.f4403e.f4633a)) / 255.0f);
            m4634a(cmVar, true, this.f4403e);
        }
        if (this.f4404f != null) {
            cmVar.f4436a.f4292f = Float.valueOf(((float) Color.alpha(this.f4404f.f4633a)) / 255.0f);
            m4634a(cmVar, false, this.f4404f);
        }
    }

    private static void m4634a(cm cmVar, boolean z, bn bnVar) {
        int i;
        float floatValue = (z ? cmVar.f4436a.f4290d : cmVar.f4436a.f4292f).floatValue();
        if (bnVar instanceof C0727v) {
            i = ((C0727v) bnVar).f4633a;
        } else if (bnVar instanceof C0728w) {
            i = cmVar.f4436a.f4300n.f4633a;
        } else {
            return;
        }
        i |= m4609a(floatValue) << 24;
        if (z) {
            cmVar.f4439d.setColor(i);
        } else {
            cmVar.f4440e.setColor(i);
        }
    }

    private static Typeface m4614a(String str, Integer num, ax axVar) {
        int i = 1;
        int i2 = axVar == ax.Italic ? 1 : 0;
        if (num.intValue() <= 500) {
            i = i2 != 0 ? 2 : 0;
        } else if (i2 != 0) {
            i = 3;
        }
        if (str.equals("serif")) {
            return Typeface.create(Typeface.SERIF, i);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        return str.equals("fantasy") ? Typeface.create(Typeface.SANS_SERIF, i) : null;
    }

    private static int m4609a(float f) {
        int i = (int) (256.0f * f);
        if (i < 0) {
            return 0;
        }
        if (i <= HprofParser.ROOT_UNKNOWN) {
            return i;
        }
        return HprofParser.ROOT_UNKNOWN;
    }

    private final void m4618a(float f, float f2, float f3, float f4) {
        float f5 = f + f3;
        float f6 = f2 + f4;
        if (this.f4406h.f4436a.f4309w != null) {
            f += this.f4406h.f4436a.f4309w.f4627d.m4571a(this);
            f2 += this.f4406h.f4436a.f4309w.f4624a.m4574b(this);
            f5 -= this.f4406h.f4436a.f4309w.f4625b.m4571a(this);
            f6 -= this.f4406h.f4436a.f4309w.f4626c.m4574b(this);
        }
        this.f4399a.clipRect(f, f2, f5, f6);
    }

    private final void m4657l() {
        int i;
        if (this.f4406h.f4436a.f4284J instanceof C0727v) {
            i = ((C0727v) this.f4406h.f4436a.f4284J).f4633a;
        } else if (this.f4406h.f4436a.f4284J instanceof C0728w) {
            i = this.f4406h.f4436a.f4300n.f4633a;
        } else {
            return;
        }
        if (this.f4406h.f4436a.f4285K != null) {
            i |= m4609a(this.f4406h.f4436a.f4285K.floatValue()) << 24;
        }
        this.f4399a.drawColor(i);
    }

    private static void m4642b(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, an anVar) {
        if (f != f6 || f2 != f7) {
            if (f3 == 0.0f || f4 == 0.0f) {
                anVar.mo1102b(f6, f7);
                return;
            }
            float f8;
            float f9;
            double d;
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            float toRadians = (float) Math.toRadians(((double) f5) % 360.0d);
            double cos = Math.cos((double) toRadians);
            double sin = Math.sin((double) toRadians);
            double d2 = ((double) (f - f6)) / 2.0d;
            double d3 = ((double) (f2 - f7)) / 2.0d;
            double d4 = (cos * d2) + (sin * d3);
            double d5 = (d2 * (-sin)) + (d3 * cos);
            d3 = (double) (abs * abs);
            d2 = (double) (abs2 * abs2);
            double d6 = d4 * d4;
            double d7 = d5 * d5;
            double d8 = (d6 / d3) + (d7 / d2);
            if (d8 > 1.0d) {
                abs *= (float) Math.sqrt(d8);
                abs2 *= (float) Math.sqrt(d8);
                d8 = (double) (abs * abs);
                f8 = abs2;
                f9 = abs;
                d = (double) (abs2 * abs2);
            } else {
                d8 = d3;
                f8 = abs2;
                f9 = abs;
                d = d2;
            }
            if (z == z2) {
                d3 = -1.0d;
            } else {
                d3 = 1.0d;
            }
            d2 = (((d8 * d) - (d8 * d7)) - (d * d6)) / ((d * d6) + (d8 * d7));
            if (d2 < 0.0d) {
                d2 = 0.0d;
            }
            d2 = Math.sqrt(d2) * d3;
            d3 = ((((double) f9) * d5) / ((double) f8)) * d2;
            d2 *= -((((double) f8) * d4) / ((double) f9));
            d = (((double) (f + f6)) / 2.0d) + ((cos * d3) - (sin * d2));
            d8 = (((double) (f2 + f7)) / 2.0d) + ((cos * d2) + (sin * d3));
            cos = (d4 - d3) / ((double) f9);
            sin = (d5 - d2) / ((double) f8);
            d3 = ((-d4) - d3) / ((double) f9);
            d4 = ((-d5) - d2) / ((double) f8);
            d5 = Math.toDegrees((sin < 0.0d ? -1.0d : 1.0d) * Math.acos(cos / Math.sqrt((cos * cos) + (sin * sin))));
            d2 = Math.toDegrees(((cos * d4) - (d3 * sin) < 0.0d ? -1.0d : 1.0d) * Math.acos(((sin * d4) + (cos * d3)) / Math.sqrt(((cos * cos) + (sin * sin)) * ((d3 * d3) + (d4 * d4)))));
            if (!z2 && d2 > 0.0d) {
                d2 -= 360.0d;
            } else if (z2 && d2 < 0.0d) {
                d2 += 360.0d;
            }
            d2 %= 360.0d;
            int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
            d3 = Math.toRadians(d5 % 360.0d);
            float toRadians2 = (float) (Math.toRadians(d2) / ((double) ceil));
            sin = (1.3333333333333333d * Math.sin(((double) toRadians2) / 2.0d)) / (1.0d + Math.cos(((double) toRadians2) / 2.0d));
            float[] fArr = new float[(ceil * 6)];
            int i = 0;
            for (int i2 = 0; i2 < ceil; i2++) {
                d5 = ((double) (((float) i2) * toRadians2)) + d3;
                d6 = Math.cos(d5);
                d7 = Math.sin(d5);
                int i3 = i + 1;
                fArr[i] = (float) (d6 - (sin * d7));
                i = i3 + 1;
                fArr[i3] = (float) ((d6 * sin) + d7);
                d5 += (double) toRadians2;
                d6 = Math.cos(d5);
                d5 = Math.sin(d5);
                i3 = i + 1;
                fArr[i] = (float) ((sin * d5) + d6);
                i = i3 + 1;
                fArr[i3] = (float) (d5 - (sin * d6));
                i3 = i + 1;
                fArr[i] = (float) d6;
                i = i3 + 1;
                fArr[i3] = (float) d5;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(f9, f8);
            matrix.postRotate(f5);
            matrix.postTranslate((float) d, (float) d8);
            matrix.mapPoints(fArr);
            fArr[fArr.length - 2] = f6;
            fArr[fArr.length - 1] = f7;
            for (int i4 = 0; i4 < fArr.length; i4 += 6) {
                anVar.mo1100a(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i4 + 3], fArr[i4 + 4], fArr[i4 + 5]);
            }
        }
    }

    private final void m4621a(ab abVar) {
        float f = 0.0f;
        if (this.f4406h.f4436a.f4310x != null || this.f4406h.f4436a.f4311y != null || this.f4406h.f4436a.f4312z != null) {
            bm b;
            ah ahVar;
            ah ahVar2;
            ah ahVar3;
            List list;
            ag agVar;
            float a;
            float b2;
            float a2;
            List arrayList;
            int size;
            av avVar;
            av avVar2;
            int i;
            if (this.f4406h.f4436a.f4310x != null) {
                b = abVar.t.m4794b(this.f4406h.f4436a.f4310x);
                if (b != null) {
                    ahVar = (ah) b;
                    if (this.f4406h.f4436a.f4311y != null) {
                        b = abVar.t.m4794b(this.f4406h.f4436a.f4311y);
                        if (b == null) {
                            ahVar2 = (ah) b;
                            if (this.f4406h.f4436a.f4312z != null) {
                                b = abVar.t.m4794b(this.f4406h.f4436a.f4312z);
                                if (b == null) {
                                    ahVar3 = (ah) b;
                                    if (!(abVar instanceof al)) {
                                        list = new cg(((al) abVar).f4251a).f4412a;
                                    } else if (abVar instanceof ag) {
                                        list = m4617a((ap) abVar);
                                    } else {
                                        agVar = (ag) abVar;
                                        a = agVar.f4232a == null ? agVar.f4232a.m4571a(this) : 0.0f;
                                        if (agVar.f4233b == null) {
                                            b2 = agVar.f4233b.m4574b(this);
                                        } else {
                                            b2 = 0.0f;
                                        }
                                        if (agVar.f4234c == null) {
                                            a2 = agVar.f4234c.m4571a(this);
                                        } else {
                                            a2 = 0.0f;
                                        }
                                        if (agVar.f4235d != null) {
                                            f = agVar.f4235d.m4574b(this);
                                        }
                                        arrayList = new ArrayList(2);
                                        arrayList.add(new ch(a, b2, a2 - a, f - b2));
                                        arrayList.add(new ch(a2, f, a2 - a, f - b2));
                                        list = arrayList;
                                    }
                                    if (list == null) {
                                        size = list.size();
                                        if (size == 0) {
                                            avVar = this.f4406h.f4436a;
                                            avVar2 = this.f4406h.f4436a;
                                            this.f4406h.f4436a.f4312z = null;
                                            avVar2.f4311y = null;
                                            avVar.f4310x = null;
                                            if (ahVar != null) {
                                                m4622a(ahVar, (ch) list.get(0));
                                            }
                                            if (ahVar2 != null) {
                                                for (i = 1; i < size - 1; i++) {
                                                    m4622a(ahVar2, (ch) list.get(i));
                                                }
                                            }
                                            if (ahVar3 == null) {
                                                m4622a(ahVar3, (ch) list.get(size - 1));
                                            }
                                        }
                                    }
                                }
                                m4645b("Marker reference '%s' not found", this.f4406h.f4436a.f4312z);
                            }
                            ahVar3 = null;
                            if (!(abVar instanceof al)) {
                                list = new cg(((al) abVar).f4251a).f4412a;
                            } else if (abVar instanceof ag) {
                                list = m4617a((ap) abVar);
                            } else {
                                agVar = (ag) abVar;
                                if (agVar.f4232a == null) {
                                }
                                if (agVar.f4233b == null) {
                                    b2 = 0.0f;
                                } else {
                                    b2 = agVar.f4233b.m4574b(this);
                                }
                                if (agVar.f4234c == null) {
                                    a2 = 0.0f;
                                } else {
                                    a2 = agVar.f4234c.m4571a(this);
                                }
                                if (agVar.f4235d != null) {
                                    f = agVar.f4235d.m4574b(this);
                                }
                                arrayList = new ArrayList(2);
                                arrayList.add(new ch(a, b2, a2 - a, f - b2));
                                arrayList.add(new ch(a2, f, a2 - a, f - b2));
                                list = arrayList;
                            }
                            if (list == null) {
                                size = list.size();
                                if (size == 0) {
                                    avVar = this.f4406h.f4436a;
                                    avVar2 = this.f4406h.f4436a;
                                    this.f4406h.f4436a.f4312z = null;
                                    avVar2.f4311y = null;
                                    avVar.f4310x = null;
                                    if (ahVar != null) {
                                        m4622a(ahVar, (ch) list.get(0));
                                    }
                                    if (ahVar2 != null) {
                                        for (i = 1; i < size - 1; i++) {
                                            m4622a(ahVar2, (ch) list.get(i));
                                        }
                                    }
                                    if (ahVar3 == null) {
                                        m4622a(ahVar3, (ch) list.get(size - 1));
                                    }
                                }
                            }
                        }
                        m4645b("Marker reference '%s' not found", this.f4406h.f4436a.f4311y);
                    }
                    ahVar2 = null;
                    if (this.f4406h.f4436a.f4312z != null) {
                        b = abVar.t.m4794b(this.f4406h.f4436a.f4312z);
                        if (b == null) {
                            m4645b("Marker reference '%s' not found", this.f4406h.f4436a.f4312z);
                        } else {
                            ahVar3 = (ah) b;
                            if (!(abVar instanceof al)) {
                                list = new cg(((al) abVar).f4251a).f4412a;
                            } else if (abVar instanceof ag) {
                                agVar = (ag) abVar;
                                if (agVar.f4232a == null) {
                                }
                                if (agVar.f4233b == null) {
                                    b2 = agVar.f4233b.m4574b(this);
                                } else {
                                    b2 = 0.0f;
                                }
                                if (agVar.f4234c == null) {
                                    a2 = agVar.f4234c.m4571a(this);
                                } else {
                                    a2 = 0.0f;
                                }
                                if (agVar.f4235d != null) {
                                    f = agVar.f4235d.m4574b(this);
                                }
                                arrayList = new ArrayList(2);
                                arrayList.add(new ch(a, b2, a2 - a, f - b2));
                                arrayList.add(new ch(a2, f, a2 - a, f - b2));
                                list = arrayList;
                            } else {
                                list = m4617a((ap) abVar);
                            }
                            if (list == null) {
                                size = list.size();
                                if (size == 0) {
                                    avVar = this.f4406h.f4436a;
                                    avVar2 = this.f4406h.f4436a;
                                    this.f4406h.f4436a.f4312z = null;
                                    avVar2.f4311y = null;
                                    avVar.f4310x = null;
                                    if (ahVar != null) {
                                        m4622a(ahVar, (ch) list.get(0));
                                    }
                                    if (ahVar2 != null) {
                                        for (i = 1; i < size - 1; i++) {
                                            m4622a(ahVar2, (ch) list.get(i));
                                        }
                                    }
                                    if (ahVar3 == null) {
                                        m4622a(ahVar3, (ch) list.get(size - 1));
                                    }
                                }
                            }
                        }
                    }
                    ahVar3 = null;
                    if (!(abVar instanceof al)) {
                        list = new cg(((al) abVar).f4251a).f4412a;
                    } else if (abVar instanceof ag) {
                        list = m4617a((ap) abVar);
                    } else {
                        agVar = (ag) abVar;
                        if (agVar.f4232a == null) {
                        }
                        if (agVar.f4233b == null) {
                            b2 = 0.0f;
                        } else {
                            b2 = agVar.f4233b.m4574b(this);
                        }
                        if (agVar.f4234c == null) {
                            a2 = 0.0f;
                        } else {
                            a2 = agVar.f4234c.m4571a(this);
                        }
                        if (agVar.f4235d != null) {
                            f = agVar.f4235d.m4574b(this);
                        }
                        arrayList = new ArrayList(2);
                        arrayList.add(new ch(a, b2, a2 - a, f - b2));
                        arrayList.add(new ch(a2, f, a2 - a, f - b2));
                        list = arrayList;
                    }
                    if (list == null) {
                        size = list.size();
                        if (size == 0) {
                            avVar = this.f4406h.f4436a;
                            avVar2 = this.f4406h.f4436a;
                            this.f4406h.f4436a.f4312z = null;
                            avVar2.f4311y = null;
                            avVar.f4310x = null;
                            if (ahVar != null) {
                                m4622a(ahVar, (ch) list.get(0));
                            }
                            if (ahVar2 != null) {
                                for (i = 1; i < size - 1; i++) {
                                    m4622a(ahVar2, (ch) list.get(i));
                                }
                            }
                            if (ahVar3 == null) {
                                m4622a(ahVar3, (ch) list.get(size - 1));
                            }
                        }
                    }
                }
                m4645b("Marker reference '%s' not found", this.f4406h.f4436a.f4310x);
            }
            ahVar = null;
            if (this.f4406h.f4436a.f4311y != null) {
                b = abVar.t.m4794b(this.f4406h.f4436a.f4311y);
                if (b == null) {
                    m4645b("Marker reference '%s' not found", this.f4406h.f4436a.f4311y);
                } else {
                    ahVar2 = (ah) b;
                    if (this.f4406h.f4436a.f4312z != null) {
                        b = abVar.t.m4794b(this.f4406h.f4436a.f4312z);
                        if (b == null) {
                            ahVar3 = (ah) b;
                            if (!(abVar instanceof al)) {
                                list = new cg(((al) abVar).f4251a).f4412a;
                            } else if (abVar instanceof ag) {
                                agVar = (ag) abVar;
                                if (agVar.f4232a == null) {
                                }
                                if (agVar.f4233b == null) {
                                    b2 = agVar.f4233b.m4574b(this);
                                } else {
                                    b2 = 0.0f;
                                }
                                if (agVar.f4234c == null) {
                                    a2 = agVar.f4234c.m4571a(this);
                                } else {
                                    a2 = 0.0f;
                                }
                                if (agVar.f4235d != null) {
                                    f = agVar.f4235d.m4574b(this);
                                }
                                arrayList = new ArrayList(2);
                                arrayList.add(new ch(a, b2, a2 - a, f - b2));
                                arrayList.add(new ch(a2, f, a2 - a, f - b2));
                                list = arrayList;
                            } else {
                                list = m4617a((ap) abVar);
                            }
                            if (list == null) {
                                size = list.size();
                                if (size == 0) {
                                    avVar = this.f4406h.f4436a;
                                    avVar2 = this.f4406h.f4436a;
                                    this.f4406h.f4436a.f4312z = null;
                                    avVar2.f4311y = null;
                                    avVar.f4310x = null;
                                    if (ahVar != null) {
                                        m4622a(ahVar, (ch) list.get(0));
                                    }
                                    if (ahVar2 != null) {
                                        for (i = 1; i < size - 1; i++) {
                                            m4622a(ahVar2, (ch) list.get(i));
                                        }
                                    }
                                    if (ahVar3 == null) {
                                        m4622a(ahVar3, (ch) list.get(size - 1));
                                    }
                                }
                            }
                        }
                        m4645b("Marker reference '%s' not found", this.f4406h.f4436a.f4312z);
                    }
                    ahVar3 = null;
                    if (!(abVar instanceof al)) {
                        list = new cg(((al) abVar).f4251a).f4412a;
                    } else if (abVar instanceof ag) {
                        list = m4617a((ap) abVar);
                    } else {
                        agVar = (ag) abVar;
                        if (agVar.f4232a == null) {
                        }
                        if (agVar.f4233b == null) {
                            b2 = 0.0f;
                        } else {
                            b2 = agVar.f4233b.m4574b(this);
                        }
                        if (agVar.f4234c == null) {
                            a2 = 0.0f;
                        } else {
                            a2 = agVar.f4234c.m4571a(this);
                        }
                        if (agVar.f4235d != null) {
                            f = agVar.f4235d.m4574b(this);
                        }
                        arrayList = new ArrayList(2);
                        arrayList.add(new ch(a, b2, a2 - a, f - b2));
                        arrayList.add(new ch(a2, f, a2 - a, f - b2));
                        list = arrayList;
                    }
                    if (list == null) {
                        size = list.size();
                        if (size == 0) {
                            avVar = this.f4406h.f4436a;
                            avVar2 = this.f4406h.f4436a;
                            this.f4406h.f4436a.f4312z = null;
                            avVar2.f4311y = null;
                            avVar.f4310x = null;
                            if (ahVar != null) {
                                m4622a(ahVar, (ch) list.get(0));
                            }
                            if (ahVar2 != null) {
                                for (i = 1; i < size - 1; i++) {
                                    m4622a(ahVar2, (ch) list.get(i));
                                }
                            }
                            if (ahVar3 == null) {
                                m4622a(ahVar3, (ch) list.get(size - 1));
                            }
                        }
                    }
                }
            }
            ahVar2 = null;
            if (this.f4406h.f4436a.f4312z != null) {
                b = abVar.t.m4794b(this.f4406h.f4436a.f4312z);
                if (b == null) {
                    m4645b("Marker reference '%s' not found", this.f4406h.f4436a.f4312z);
                } else {
                    ahVar3 = (ah) b;
                    if (!(abVar instanceof al)) {
                        list = new cg(((al) abVar).f4251a).f4412a;
                    } else if (abVar instanceof ag) {
                        agVar = (ag) abVar;
                        if (agVar.f4232a == null) {
                        }
                        if (agVar.f4233b == null) {
                            b2 = agVar.f4233b.m4574b(this);
                        } else {
                            b2 = 0.0f;
                        }
                        if (agVar.f4234c == null) {
                            a2 = agVar.f4234c.m4571a(this);
                        } else {
                            a2 = 0.0f;
                        }
                        if (agVar.f4235d != null) {
                            f = agVar.f4235d.m4574b(this);
                        }
                        arrayList = new ArrayList(2);
                        arrayList.add(new ch(a, b2, a2 - a, f - b2));
                        arrayList.add(new ch(a2, f, a2 - a, f - b2));
                        list = arrayList;
                    } else {
                        list = m4617a((ap) abVar);
                    }
                    if (list == null) {
                        size = list.size();
                        if (size == 0) {
                            avVar = this.f4406h.f4436a;
                            avVar2 = this.f4406h.f4436a;
                            this.f4406h.f4436a.f4312z = null;
                            avVar2.f4311y = null;
                            avVar.f4310x = null;
                            if (ahVar != null) {
                                m4622a(ahVar, (ch) list.get(0));
                            }
                            if (ahVar2 != null) {
                                for (i = 1; i < size - 1; i++) {
                                    m4622a(ahVar2, (ch) list.get(i));
                                }
                            }
                            if (ahVar3 == null) {
                                m4622a(ahVar3, (ch) list.get(size - 1));
                            }
                        }
                    }
                }
            }
            ahVar3 = null;
            if (!(abVar instanceof al)) {
                list = new cg(((al) abVar).f4251a).f4412a;
            } else if (abVar instanceof ag) {
                list = m4617a((ap) abVar);
            } else {
                agVar = (ag) abVar;
                if (agVar.f4232a == null) {
                }
                if (agVar.f4233b == null) {
                    b2 = 0.0f;
                } else {
                    b2 = agVar.f4233b.m4574b(this);
                }
                if (agVar.f4234c == null) {
                    a2 = 0.0f;
                } else {
                    a2 = agVar.f4234c.m4571a(this);
                }
                if (agVar.f4235d != null) {
                    f = agVar.f4235d.m4574b(this);
                }
                arrayList = new ArrayList(2);
                arrayList.add(new ch(a, b2, a2 - a, f - b2));
                arrayList.add(new ch(a2, f, a2 - a, f - b2));
                list = arrayList;
            }
            if (list == null) {
                size = list.size();
                if (size == 0) {
                    avVar = this.f4406h.f4436a;
                    avVar2 = this.f4406h.f4436a;
                    this.f4406h.f4436a.f4312z = null;
                    avVar2.f4311y = null;
                    avVar.f4310x = null;
                    if (ahVar != null) {
                        m4622a(ahVar, (ch) list.get(0));
                    }
                    if (ahVar2 != null) {
                        for (i = 1; i < size - 1; i++) {
                            m4622a(ahVar2, (ch) list.get(i));
                        }
                    }
                    if (ahVar3 == null) {
                        m4622a(ahVar3, (ch) list.get(size - 1));
                    }
                }
            }
        }
    }

    private final void m4622a(ah ahVar, ch chVar) {
        float floatValue;
        float a;
        Matrix matrix;
        float a2;
        float f;
        float f2;
        C0718m c0718m;
        boolean g;
        float f3 = 3.0f;
        float f4 = 0.0f;
        m4648d();
        if (ahVar.f4242f != null) {
            if (!Float.isNaN(ahVar.f4242f.floatValue())) {
                floatValue = ahVar.f4242f.floatValue();
            } else if (!(chVar.f4422c == 0.0f && chVar.f4423d == 0.0f)) {
                floatValue = (float) Math.toDegrees(Math.atan2((double) chVar.f4423d, (double) chVar.f4422c));
            }
            a = ahVar.f4237a ? 1.0f : this.f4406h.f4436a.f4293g.m4570a(this.f4401c);
            this.f4406h = m4646c((bm) ahVar);
            matrix = new Matrix();
            matrix.preTranslate(chVar.f4420a, chVar.f4421b);
            matrix.preRotate(floatValue);
            matrix.preScale(a, a);
            if (ahVar.f4238b == null) {
                floatValue = ahVar.f4238b.m4571a(this);
            } else {
                floatValue = 0.0f;
            }
            if (ahVar.f4239c == null) {
                a = ahVar.f4239c.m4574b(this);
            } else {
                a = 0.0f;
            }
            if (ahVar.f4240d == null) {
                a2 = ahVar.f4240d.m4571a(this);
            } else {
                a2 = 3.0f;
            }
            if (ahVar.f4241e != null) {
                f3 = ahVar.f4241e.m4574b(this);
            }
            if (ahVar.w == null) {
                f = a2 / ahVar.w.f4622c;
                f2 = f3 / ahVar.w.f4623d;
                c0718m = ahVar.v == null ? ahVar.v : C0718m.f4596d;
                if (!c0718m.equals(C0718m.f4595c)) {
                    f2 = c0718m.f4598b != C0720o.f4611b ? Math.max(f, f2) : Math.min(f, f2);
                    f = f2;
                }
                matrix.preTranslate((-floatValue) * f, (-a) * f2);
                this.f4399a.concat(matrix);
                floatValue = ahVar.w.f4622c * f;
                a = ahVar.w.f4623d * f2;
                switch (c0718m.f4597a.ordinal()) {
                    case 2:
                    case 5:
                    case 8:
                        floatValue = 0.0f - ((a2 - floatValue) / 2.0f);
                        break;
                    case 3:
                    case 6:
                    case 9:
                        floatValue = 0.0f - (a2 - floatValue);
                        break;
                    default:
                        floatValue = 0.0f;
                        break;
                }
                switch (c0718m.f4597a.ordinal()) {
                    case 4:
                    case 5:
                    case 6:
                        f4 = 0.0f - ((f3 - a) / 2.0f);
                        break;
                    case 7:
                    case 8:
                    case 9:
                        f4 = 0.0f - (f3 - a);
                        break;
                }
                if (!this.f4406h.f4436a.f4308v.booleanValue()) {
                    m4618a(floatValue, f4, a2, f3);
                }
                matrix.reset();
                matrix.preScale(f, f2);
                this.f4399a.concat(matrix);
            } else {
                matrix.preTranslate(-floatValue, -a);
                this.f4399a.concat(matrix);
                if (!this.f4406h.f4436a.f4308v.booleanValue()) {
                    m4618a(0.0f, 0.0f, a2, f3);
                }
            }
            g = m4652g();
            m4625a((bi) ahVar, false);
            if (g) {
                m4643b((bj) ahVar);
            }
            m4650e();
        }
        floatValue = 0.0f;
        if (ahVar.f4237a) {
        }
        this.f4406h = m4646c((bm) ahVar);
        matrix = new Matrix();
        matrix.preTranslate(chVar.f4420a, chVar.f4421b);
        matrix.preRotate(floatValue);
        matrix.preScale(a, a);
        if (ahVar.f4238b == null) {
            floatValue = 0.0f;
        } else {
            floatValue = ahVar.f4238b.m4571a(this);
        }
        if (ahVar.f4239c == null) {
            a = 0.0f;
        } else {
            a = ahVar.f4239c.m4574b(this);
        }
        if (ahVar.f4240d == null) {
            a2 = 3.0f;
        } else {
            a2 = ahVar.f4240d.m4571a(this);
        }
        if (ahVar.f4241e != null) {
            f3 = ahVar.f4241e.m4574b(this);
        }
        if (ahVar.w == null) {
            matrix.preTranslate(-floatValue, -a);
            this.f4399a.concat(matrix);
            if (this.f4406h.f4436a.f4308v.booleanValue()) {
                m4618a(0.0f, 0.0f, a2, f3);
            }
        } else {
            f = a2 / ahVar.w.f4622c;
            f2 = f3 / ahVar.w.f4623d;
            if (ahVar.v == null) {
            }
            if (c0718m.equals(C0718m.f4595c)) {
                if (c0718m.f4598b != C0720o.f4611b) {
                }
                f = f2;
            }
            matrix.preTranslate((-floatValue) * f, (-a) * f2);
            this.f4399a.concat(matrix);
            floatValue = ahVar.w.f4622c * f;
            a = ahVar.w.f4623d * f2;
            switch (c0718m.f4597a.ordinal()) {
                case 2:
                case 5:
                case 8:
                    floatValue = 0.0f - ((a2 - floatValue) / 2.0f);
                    break;
                case 3:
                case 6:
                case 9:
                    floatValue = 0.0f - (a2 - floatValue);
                    break;
                default:
                    floatValue = 0.0f;
                    break;
            }
            switch (c0718m.f4597a.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f4 = 0.0f - ((f3 - a) / 2.0f);
                    break;
                case 7:
                case 8:
                case 9:
                    f4 = 0.0f - (f3 - a);
                    break;
            }
            if (this.f4406h.f4436a.f4308v.booleanValue()) {
                m4618a(floatValue, f4, a2, f3);
            }
            matrix.reset();
            matrix.preScale(f, f2);
            this.f4399a.concat(matrix);
        }
        g = m4652g();
        m4625a((bi) ahVar, false);
        if (g) {
            m4643b((bj) ahVar);
        }
        m4650e();
    }

    private final cm m4646c(bm bmVar) {
        cm cmVar = new cm();
        m4662a(cmVar, av.m4598a());
        return m4615a(bmVar, cmVar);
    }

    private final cm m4615a(bm bmVar, cm cmVar) {
        List arrayList = new ArrayList();
        bm bmVar2 = bmVar;
        while (true) {
            if (bmVar2 instanceof bk) {
                arrayList.add(0, (bk) bmVar2);
            }
            if (bmVar2.f4204u == null) {
                break;
            }
            bmVar2 = (bm) bmVar2.f4204u;
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            m4633a(cmVar, (bk) obj);
        }
        cmVar.f4442g = this.f4405g.f4614b.w;
        if (cmVar.f4442g == null) {
            cmVar.f4442g = this.f4400b;
        }
        cmVar.f4441f = this.f4400b;
        cmVar.f4444i = this.f4406h.f4444i;
        return cmVar;
    }

    private final void m4647c(bj bjVar) {
        if (this.f4406h.f4436a.f4288b instanceof ak) {
            m4637a(true, bjVar.f4210n, (ak) this.f4406h.f4436a.f4288b);
        }
        if (this.f4406h.f4436a.f4291e instanceof ak) {
            m4637a(false, bjVar.f4210n, (ak) this.f4406h.f4436a.f4291e);
        }
    }

    private final void m4637a(boolean z, C0723r c0723r, ak akVar) {
        bm b = this.f4405g.m4794b(akVar.f4249a);
        if (b == null) {
            String str = "%s reference '%s' not found";
            Object[] objArr = new Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = akVar.f4249a;
            m4645b(str, objArr);
            if (akVar.f4250b != null) {
                m4634a(this.f4406h, z, akVar.f4250b);
                return;
            } else if (z) {
                this.f4406h.f4437b = false;
                return;
            } else {
                this.f4406h.f4438c = false;
                return;
            }
        }
        if (b instanceof bl) {
            float a;
            float b2;
            float a2;
            float b3;
            bm bmVar = (bl) b;
            if (bmVar.e != null) {
                m4635a((C0707z) bmVar, bmVar.e);
            }
            Object obj = (bmVar.b == null || !bmVar.b.booleanValue()) ? null : 1;
            Paint paint = z ? this.f4406h.f4439d : this.f4406h.f4440e;
            if (obj != null) {
                C0723r b4 = m4663b();
                a = bmVar.f4356f != null ? bmVar.f4356f.m4571a(this) : 0.0f;
                b2 = bmVar.f4357g != null ? bmVar.f4357g.m4574b(this) : 0.0f;
                a2 = bmVar.f4358h != null ? bmVar.f4358h.m4571a(this) : b4.f4622c;
                b3 = bmVar.f4359i != null ? bmVar.f4359i.m4574b(this) : 0.0f;
            } else {
                a = bmVar.f4356f != null ? bmVar.f4356f.m4572a(this, 1.0f) : 0.0f;
                b2 = bmVar.f4357g != null ? bmVar.f4357g.m4572a(this, 1.0f) : 0.0f;
                a2 = bmVar.f4358h != null ? bmVar.f4358h.m4572a(this, 1.0f) : 1.0f;
                b3 = bmVar.f4359i != null ? bmVar.f4359i.m4572a(this, 1.0f) : 0.0f;
            }
            m4648d();
            this.f4406h = m4646c(bmVar);
            Matrix matrix = new Matrix();
            if (obj == null) {
                matrix.preTranslate(c0723r.f4620a, c0723r.f4621b);
                matrix.preScale(c0723r.f4622c, c0723r.f4623d);
            }
            if (bmVar.c != null) {
                matrix.preConcat(bmVar.c);
            }
            int size = bmVar.a.size();
            if (size == 0) {
                m4650e();
                if (z) {
                    this.f4406h.f4437b = false;
                } else {
                    this.f4406h.f4438c = false;
                }
            } else {
                int[] iArr = new int[size];
                float[] fArr = new float[size];
                int i = 0;
                float f = -1.0f;
                for (bm bmVar2 : bmVar.a) {
                    bk bkVar = (au) bmVar2;
                    if (i == 0 || bkVar.f4274a.floatValue() >= f) {
                        fArr[i] = bkVar.f4274a.floatValue();
                        f = bkVar.f4274a.floatValue();
                    } else {
                        fArr[i] = f;
                    }
                    m4648d();
                    m4633a(this.f4406h, bkVar);
                    C0727v c0727v = (C0727v) this.f4406h.f4436a.f4277C;
                    if (c0727v == null) {
                        c0727v = C0727v.f4632b;
                    }
                    iArr[i] = c0727v.f4633a | (m4609a(this.f4406h.f4436a.f4278D.floatValue()) << 24);
                    int i2 = i + 1;
                    m4650e();
                    i = i2;
                }
                if ((a == a2 && b2 == b3) || size == 1) {
                    m4650e();
                    paint.setColor(iArr[size - 1]);
                } else {
                    TileMode tileMode = TileMode.CLAMP;
                    if (bmVar.d != null) {
                        if (bmVar.d == aa.reflect) {
                            tileMode = TileMode.MIRROR;
                        } else if (bmVar.d == aa.repeat) {
                            tileMode = TileMode.REPEAT;
                        }
                    }
                    m4650e();
                    Shader linearGradient = new LinearGradient(a, b2, a2, b3, iArr, fArr, tileMode);
                    linearGradient.setLocalMatrix(matrix);
                    paint.setShader(linearGradient);
                }
            }
        }
        if (b instanceof bp) {
            m4638a(z, c0723r, (bp) b);
        }
        if (b instanceof at) {
            at atVar = (at) b;
            if (z) {
                if (m4639a(atVar.q, 2147483648L)) {
                    this.f4406h.f4436a.f4288b = atVar.q.f4282H;
                    this.f4406h.f4437b = atVar.q.f4282H != null;
                }
                if (m4639a(atVar.q, 4294967296L)) {
                    this.f4406h.f4436a.f4290d = atVar.q.f4283I;
                }
                if (m4639a(atVar.q, 6442450944L)) {
                    m4634a(this.f4406h, z, this.f4406h.f4436a.f4288b);
                    return;
                }
                return;
            }
            if (m4639a(atVar.q, 2147483648L)) {
                this.f4406h.f4436a.f4291e = atVar.q.f4282H;
                this.f4406h.f4438c = atVar.q.f4282H != null;
            }
            if (m4639a(atVar.q, 4294967296L)) {
                this.f4406h.f4436a.f4292f = atVar.q.f4283I;
            }
            if (m4639a(atVar.q, 6442450944L)) {
                m4634a(this.f4406h, z, this.f4406h.f4436a.f4291e);
            }
        }
    }

    private final void m4638a(boolean z, C0723r c0723r, bp bpVar) {
        float c;
        float b;
        float f;
        if (bpVar.e != null) {
            m4635a((C0707z) bpVar, bpVar.e);
        }
        Object obj = (bpVar.b == null || !bpVar.b.booleanValue()) ? null : 1;
        Paint paint = z ? this.f4406h.f4439d : this.f4406h.f4440e;
        if (obj != null) {
            af afVar = new af(50.0f, cc.percent);
            float a = bpVar.f4360f != null ? bpVar.f4360f.m4571a(this) : afVar.m4571a(this);
            c = bpVar.f4362h != null ? bpVar.f4362h.m4576c(this) : afVar.m4576c(this);
            b = bpVar.f4361g != null ? bpVar.f4361g.m4574b(this) : afVar.m4574b(this);
            f = a;
        } else {
            c = bpVar.f4362h != null ? bpVar.f4362h.m4572a(this, 1.0f) : 0.5f;
            b = bpVar.f4361g != null ? bpVar.f4361g.m4572a(this, 1.0f) : 0.5f;
            f = bpVar.f4360f != null ? bpVar.f4360f.m4572a(this, 1.0f) : 0.5f;
        }
        m4648d();
        this.f4406h = m4646c((bm) bpVar);
        Matrix matrix = new Matrix();
        if (obj == null) {
            matrix.preTranslate(c0723r.f4620a, c0723r.f4621b);
            matrix.preScale(c0723r.f4622c, c0723r.f4623d);
        }
        if (bpVar.c != null) {
            matrix.preConcat(bpVar.c);
        }
        int size = bpVar.a.size();
        if (size == 0) {
            m4650e();
            if (z) {
                this.f4406h.f4437b = false;
                return;
            } else {
                this.f4406h.f4438c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        int i = 0;
        float f2 = -1.0f;
        for (bm bmVar : bpVar.a) {
            bk bkVar = (au) bmVar;
            if (i == 0 || bkVar.f4274a.floatValue() >= f2) {
                fArr[i] = bkVar.f4274a.floatValue();
                f2 = bkVar.f4274a.floatValue();
            } else {
                fArr[i] = f2;
            }
            m4648d();
            m4633a(this.f4406h, bkVar);
            C0727v c0727v = (C0727v) this.f4406h.f4436a.f4277C;
            if (c0727v == null) {
                c0727v = C0727v.f4632b;
            }
            iArr[i] = c0727v.f4633a | (m4609a(this.f4406h.f4436a.f4278D.floatValue()) << 24);
            int i2 = i + 1;
            m4650e();
            i = i2;
        }
        if (c == 0.0f || size == 1) {
            m4650e();
            paint.setColor(iArr[size - 1]);
            return;
        }
        TileMode tileMode = TileMode.CLAMP;
        if (bpVar.d != null) {
            if (bpVar.d == aa.reflect) {
                tileMode = TileMode.MIRROR;
            } else if (bpVar.d == aa.repeat) {
                tileMode = TileMode.REPEAT;
            }
        }
        m4650e();
        Shader radialGradient = new RadialGradient(f, b, c, iArr, fArr, tileMode);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
    }

    private static void m4635a(C0707z c0707z, String str) {
        bm bmVar = c0707z;
        while (true) {
            bm b = bmVar.t.m4794b(str);
            if (b == null) {
                m4636a("Gradient reference '%s' not found", str);
                return;
            } else if (!(b instanceof C0707z)) {
                m4645b("Gradient href attributes must point to other gradient elements", new Object[0]);
                return;
            } else if (b == bmVar) {
                m4645b("Circular reference in gradient href attribute '%s'", str);
                return;
            } else {
                C0707z c0707z2 = (C0707z) b;
                if (bmVar.f4352b == null) {
                    bmVar.f4352b = c0707z2.f4352b;
                }
                if (bmVar.f4353c == null) {
                    bmVar.f4353c = c0707z2.f4353c;
                }
                if (bmVar.f4354d == null) {
                    bmVar.f4354d = c0707z2.f4354d;
                }
                if (bmVar.f4351a.isEmpty()) {
                    bmVar.f4351a = c0707z2.f4351a;
                }
                try {
                    if (bmVar instanceof bl) {
                        bl blVar = (bl) bmVar;
                        bl blVar2 = (bl) b;
                        if (blVar.f4356f == null) {
                            blVar.f4356f = blVar2.f4356f;
                        }
                        if (blVar.f4357g == null) {
                            blVar.f4357g = blVar2.f4357g;
                        }
                        if (blVar.f4358h == null) {
                            blVar.f4358h = blVar2.f4358h;
                        }
                        if (blVar.f4359i == null) {
                            blVar.f4359i = blVar2.f4359i;
                        }
                    } else {
                        bp bpVar = (bp) bmVar;
                        bp bpVar2 = (bp) b;
                        if (bpVar.f4360f == null) {
                            bpVar.f4360f = bpVar2.f4360f;
                        }
                        if (bpVar.f4361g == null) {
                            bpVar.f4361g = bpVar2.f4361g;
                        }
                        if (bpVar.f4362h == null) {
                            bpVar.f4362h = bpVar2.f4362h;
                        }
                        if (bpVar.f4363i == null) {
                            bpVar.f4363i = bpVar2.f4363i;
                        }
                        if (bpVar.f4364j == null) {
                            bpVar.f4364j = bpVar2.f4364j;
                        }
                    }
                } catch (ClassCastException e) {
                }
                if (c0707z2.f4355e != null) {
                    str = c0707z2.f4355e;
                } else {
                    return;
                }
            }
        }
    }

    private final void m4649d(bj bjVar) {
        m4628a(bjVar, bjVar.f4210n);
    }

    private final void m4628a(bj bjVar, C0723r c0723r) {
        if (this.f4406h.f4436a.f4279E != null) {
            bm b = bjVar.t.m4794b(this.f4406h.f4436a.f4279E);
            if (b == null) {
                m4645b("ClipPath reference '%s' not found", this.f4406h.f4436a.f4279E);
                return;
            }
            b = (C0726u) b;
            if (b.i.isEmpty()) {
                this.f4399a.clipRect(0, 0, 0, 0);
                return;
            }
            int i;
            if (b.f4631a == null || b.f4631a.booleanValue()) {
                i = true;
            } else {
                i = 0;
            }
            if ((bjVar instanceof ac) && i == 0) {
                m4636a("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", bjVar.getClass().getSimpleName());
                return;
            }
            Matrix matrix;
            Matrix matrix2;
            this.f4407i.push(this.f4406h);
            this.f4406h = (cm) this.f4406h.clone();
            Matrix matrix3 = new Matrix();
            if (i == 0) {
                matrix = new Matrix();
                matrix.preTranslate(c0723r.f4620a, c0723r.f4621b);
                matrix.preScale(c0723r.f4622c, c0723r.f4623d);
                this.f4399a.concat(matrix);
                matrix2 = new Matrix();
                if (matrix.invert(matrix2)) {
                    matrix3.postConcat(matrix2);
                }
            }
            if (b.b != null) {
                matrix = b.b;
                this.f4399a.concat(matrix);
                matrix2 = new Matrix();
                if (matrix.invert(matrix2)) {
                    matrix3.postConcat(matrix2);
                }
            }
            this.f4406h = m4646c(b);
            m4649d(b);
            Path path = new Path();
            for (bm b2 : b2.i) {
                m4629a(b2, true, path, new Matrix());
            }
            this.f4399a.clipPath(path);
            this.f4406h = (cm) this.f4407i.pop();
            this.f4399a.concat(matrix3);
        }
    }

    private final void m4629a(bm bmVar, boolean z, Path path, Matrix matrix) {
        float f = 0.0f;
        if (m4656k()) {
            this.f4399a.save(1);
            this.f4407i.push(this.f4406h);
            this.f4406h = (cm) this.f4406h.clone();
            bk bkVar;
            if (bmVar instanceof cd) {
                if (z) {
                    bkVar = (cd) bmVar;
                    m4633a(this.f4406h, bkVar);
                    if (m4656k() && m4664c()) {
                        if (bkVar.b != null) {
                            matrix.preConcat(bkVar.b);
                        }
                        bm b = bkVar.t.m4794b(bkVar.f4393a);
                        if (b == null) {
                            m4645b("Use reference '%s' not found", bkVar.f4393a);
                        } else {
                            m4649d(bkVar);
                            m4629a(b, false, path, matrix);
                        }
                    }
                } else {
                    m4645b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (bmVar instanceof al) {
                bkVar = (al) bmVar;
                m4633a(this.f4406h, bkVar);
                if (m4656k() && m4664c()) {
                    if (bkVar.e != null) {
                        matrix.preConcat(bkVar.e);
                    }
                    r0 = new ci(bkVar.f4251a).f4424a;
                    if (bkVar.n == null) {
                        bkVar.n = m4641b(r0);
                    }
                    m4649d(bkVar);
                    path.setFillType(m4658m());
                    path.addPath(r0, matrix);
                }
            } else if (bmVar instanceof bv) {
                bx bxVar = (bv) bmVar;
                m4633a(this.f4406h, (bk) bxVar);
                if (m4656k()) {
                    if (bxVar.f4372a != null) {
                        matrix.preConcat(bxVar.f4372a);
                    }
                    float a = (bxVar.b == null || bxVar.b.size() == 0) ? 0.0f : ((af) bxVar.b.get(0)).m4571a(this);
                    float b2 = (bxVar.c == null || bxVar.c.size() == 0) ? 0.0f : ((af) bxVar.c.get(0)).m4574b(this);
                    float a2 = (bxVar.d == null || bxVar.d.size() == 0) ? 0.0f : ((af) bxVar.d.get(0)).m4571a(this);
                    if (!(bxVar.e == null || bxVar.e.size() == 0)) {
                        f = ((af) bxVar.e.get(0)).m4574b(this);
                    }
                    if (this.f4406h.f4436a.f4307u != ba.Start) {
                        float a3 = m4608a(bxVar);
                        if (this.f4406h.f4436a.f4307u == ba.Middle) {
                            a -= a3 / 2.0f;
                        } else {
                            a -= a3;
                        }
                    }
                    if (bxVar.n == null) {
                        co cnVar = new cn(this, a, b2);
                        m4631a(bxVar, cnVar);
                        bxVar.n = new C0723r(cnVar.f4447c.left, cnVar.f4447c.top, cnVar.f4447c.width(), cnVar.f4447c.height());
                    }
                    m4649d(bxVar);
                    r0 = new Path();
                    m4631a(bxVar, new cl(this, a + a2, f + b2, r0));
                    path.setFillType(m4658m());
                    path.addPath(r0, matrix);
                }
            } else if (bmVar instanceof ab) {
                bkVar = (ab) bmVar;
                m4633a(this.f4406h, bkVar);
                if (m4656k() && m4664c()) {
                    if (bkVar.f4216e != null) {
                        matrix.preConcat(bkVar.f4216e);
                    }
                    if (bkVar instanceof ar) {
                        r0 = m4611a((ar) bkVar);
                    } else if (bkVar instanceof C0725t) {
                        r0 = m4612a((C0725t) bkVar);
                    } else if (bkVar instanceof C0730y) {
                        r0 = m4613a((C0730y) bkVar);
                    } else if (bkVar instanceof ap) {
                        r0 = m4640b((ap) bkVar);
                    }
                    m4649d(bkVar);
                    path.setFillType(r0.getFillType());
                    path.addPath(r0, matrix);
                }
            } else {
                m4645b("Invalid %s element found in clipPath definition", bmVar.getClass().getSimpleName());
            }
            this.f4399a.restore();
            this.f4406h = (cm) this.f4407i.pop();
        }
    }

    private final FillType m4658m() {
        if (this.f4406h.f4436a.f4280F == null) {
            return FillType.WINDING;
        }
        switch (this.f4406h.f4436a.f4280F.ordinal()) {
            case 1:
                return FillType.EVEN_ODD;
            default:
                return FillType.WINDING;
        }
    }

    private final Path m4611a(ar arVar) {
        float f;
        float f2;
        if (arVar.f4270f == null && arVar.f4271g == null) {
            f = 0.0f;
            f2 = 0.0f;
        } else if (arVar.f4270f == null) {
            f2 = arVar.f4271g.m4574b(this);
            f = f2;
        } else if (arVar.f4271g == null) {
            f2 = arVar.f4270f.m4571a(this);
            f = f2;
        } else {
            f = arVar.f4270f.m4571a(this);
            f2 = arVar.f4271g.m4574b(this);
        }
        float min = Math.min(f, arVar.f4268c.m4571a(this) / 2.0f);
        float min2 = Math.min(f2, arVar.f4269d.m4574b(this) / 2.0f);
        f = arVar.f4266a != null ? arVar.f4266a.m4571a(this) : 0.0f;
        float b = arVar.f4267b != null ? arVar.f4267b.m4574b(this) : 0.0f;
        f2 = arVar.f4268c.m4571a(this);
        float b2 = arVar.f4269d.m4574b(this);
        if (arVar.n == null) {
            arVar.n = new C0723r(f, b, f2, b2);
        }
        float f3 = f + f2;
        float f4 = b + b2;
        Path path = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path.moveTo(f, b);
            path.lineTo(f3, b);
            path.lineTo(f3, f4);
            path.lineTo(f, f4);
            path.lineTo(f, b);
        } else {
            float f5 = min * 0.5522848f;
            float f6 = min2 * 0.5522848f;
            path.moveTo(f, b + min2);
            path.cubicTo(f, (b + min2) - f6, (f + min) - f5, b, f + min, b);
            path.lineTo(f3 - min, b);
            path.cubicTo((f3 - min) + f5, b, f3, (b + min2) - f6, f3, b + min2);
            path.lineTo(f3, f4 - min2);
            path.cubicTo(f3, (f4 - min2) + f6, (f3 - min) + f5, f4, f3 - min, f4);
            path.lineTo(f + min, f4);
            path.cubicTo((f + min) - f5, f4, f, (f4 - min2) + f6, f, f4 - min2);
            path.lineTo(f, b + min2);
        }
        path.close();
        return path;
    }

    private final Path m4612a(C0725t c0725t) {
        float a = c0725t.f4628a != null ? c0725t.f4628a.m4571a(this) : 0.0f;
        float b = c0725t.f4629b != null ? c0725t.f4629b.m4574b(this) : 0.0f;
        float c = c0725t.f4630c.m4576c(this);
        float f = a - c;
        float f2 = b - c;
        float f3 = a + c;
        float f4 = b + c;
        if (c0725t.n == null) {
            c0725t.n = new C0723r(f, f2, 2.0f * c, 2.0f * c);
        }
        float f5 = c * 0.5522848f;
        Path path = new Path();
        path.moveTo(a, f2);
        path.cubicTo(a + f5, f2, f3, b - f5, f3, b);
        path.cubicTo(f3, b + f5, a + f5, f4, a, f4);
        path.cubicTo(a - f5, f4, f, b + f5, f, b);
        path.cubicTo(f, b - f5, a - f5, f2, a, f2);
        path.close();
        return path;
    }

    private final Path m4613a(C0730y c0730y) {
        float a = c0730y.f4635a != null ? c0730y.f4635a.m4571a(this) : 0.0f;
        float b = c0730y.f4636b != null ? c0730y.f4636b.m4574b(this) : 0.0f;
        float a2 = c0730y.f4637c.m4571a(this);
        float b2 = c0730y.f4638d.m4574b(this);
        float f = a - a2;
        float f2 = b - b2;
        float f3 = a + a2;
        float f4 = b + b2;
        if (c0730y.n == null) {
            c0730y.n = new C0723r(f, f2, 2.0f * a2, 2.0f * b2);
        }
        float f5 = a2 * 0.5522848f;
        float f6 = b2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(a, f2);
        path.cubicTo(a + f5, f2, f3, b - f6, f3, b);
        path.cubicTo(f3, b + f6, a + f5, f4, a, f4);
        path.cubicTo(a - f5, f4, f, b + f6, f, b);
        path.cubicTo(f, b - f6, a - f5, f2, a, f2);
        path.close();
        return path;
    }

    private final Path m4640b(ap apVar) {
        Path path = new Path();
        path.moveTo(apVar.f4265a[0], apVar.f4265a[1]);
        for (int i = 2; i < apVar.f4265a.length; i += 2) {
            path.lineTo(apVar.f4265a[i], apVar.f4265a[i + 1]);
        }
        if (apVar instanceof aq) {
            path.close();
        }
        if (apVar.n == null) {
            apVar.n = m4641b(path);
        }
        path.setFillType(m4658m());
        return path;
    }
}
