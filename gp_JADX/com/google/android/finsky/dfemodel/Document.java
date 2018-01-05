package com.google.android.finsky.dfemodel;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cv.p177a.C2433g;
import com.google.android.finsky.cv.p177a.C2440m;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.C2444q;
import com.google.android.finsky.cv.p177a.C2446s;
import com.google.android.finsky.cv.p177a.C2448u;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.cv.p177a.ad;
import com.google.android.finsky.cv.p177a.af;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.ce;
import com.google.android.finsky.cv.p177a.ck;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.da;
import com.google.android.finsky.cv.p177a.dt;
import com.google.android.finsky.cv.p177a.dy;
import com.google.android.finsky.cv.p177a.dz;
import com.google.android.finsky.cv.p177a.ea;
import com.google.android.finsky.cv.p177a.eb;
import com.google.android.finsky.cv.p177a.ec;
import com.google.android.finsky.cv.p177a.ed;
import com.google.android.finsky.cv.p177a.ee;
import com.google.android.finsky.cv.p177a.ej;
import com.google.android.finsky.cv.p177a.eq;
import com.google.android.finsky.cv.p177a.er;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.cv.p177a.eu;
import com.google.android.finsky.cv.p177a.ey;
import com.google.android.finsky.cv.p177a.fc;
import com.google.android.finsky.cv.p177a.ff;
import com.google.android.finsky.cv.p177a.fh;
import com.google.android.finsky.cv.p177a.fm;
import com.google.android.finsky.cv.p177a.fz;
import com.google.android.finsky.cv.p177a.ga;
import com.google.android.finsky.cv.p177a.gb;
import com.google.android.finsky.cv.p177a.gl;
import com.google.android.finsky.cv.p177a.go;
import com.google.android.finsky.cv.p177a.hr;
import com.google.android.finsky.cv.p177a.ix;
import com.google.android.finsky.cv.p177a.iy;
import com.google.android.finsky.cv.p177a.jf;
import com.google.android.finsky.cv.p177a.jk;
import com.google.android.finsky.cv.p177a.jw;
import com.google.android.finsky.cv.p177a.kg;
import com.google.android.finsky.cv.p177a.ko;
import com.google.android.finsky.cv.p177a.ku;
import com.google.android.finsky.cv.p177a.ky;
import com.google.android.finsky.cv.p177a.kz;
import com.google.android.finsky.cv.p177a.la;
import com.google.android.finsky.cv.p177a.lq;
import com.google.android.finsky.cv.p177a.lt;
import com.google.android.finsky.cv.p177a.lv;
import com.google.android.finsky.cv.p177a.lw;
import com.google.android.finsky.cv.p177a.lx;
import com.google.android.finsky.cv.p177a.ly;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.C4685p;
import com.google.android.finsky.utils.ParcelableProto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document implements Parcelable {
    public static final Creator CREATOR = new C2727r();
    public static final String[] f14884h = C4680k.m21818a((String) C0955b.eL.m28964b());
    public final cv f14885a;
    public Map f14886b;
    public SparseArray f14887c;
    public List f14888d;
    public Document[] f14889e;
    public CharSequence f14890f;
    public boolean f14891g;

    public Document(cv cvVar) {
        this.f14885a = cvVar;
    }

    public final int m14638a() {
        return this.f14885a.f12110q.length;
    }

    public final Document m14641a(int i) {
        if (this.f14889e == null) {
            this.f14889e = new Document[m14638a()];
        }
        if (this.f14889e[i] == null) {
            this.f14889e[i] = new Document(this.f14885a.f12110q[i]);
        }
        return this.f14889e[i];
    }

    public final Document[] m14643b() {
        if (this.f14889e == null) {
            this.f14889e = new Document[m14638a()];
        }
        int a = m14638a();
        for (int i = 0; i < a; i++) {
            if (this.f14889e[i] == null) {
                this.f14889e[i] = new Document(this.f14885a.f12110q[i]);
            }
        }
        return this.f14889e;
    }

    public final void m14645c() {
        this.f14885a.f12110q = new cv[0];
        this.f14889e = null;
    }

    public final ax m14646d() {
        ax axVar = new ax();
        axVar.f11835d = this.f14885a.f12099f;
        axVar.f11834c = this.f14885a.f12098e;
        axVar.f11833b = this.f14885a.f12097d;
        return axVar;
    }

    public final int m14648e() {
        if (m14651f()) {
            return this.f14885a.f12094K;
        }
        return 0;
    }

    public final boolean m14651f() {
        if (this.f14885a != null) {
            boolean z;
            if ((this.f14885a.f12095b & 16777216) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final String m14652g() {
        if (this.f14885a.f12111r == null) {
            return null;
        }
        return this.f14885a.f12111r.f12017c;
    }

    public final int m14653h() {
        if (this.f14885a.f12098e != 1 || m14625N() == null) {
            return -1;
        }
        return m14625N().f13163c;
    }

    public final String m14654i() {
        C2440m c2440m = this.f14885a.f12115v;
        if (c2440m == null || c2440m.f13122c == null) {
            return "";
        }
        return c2440m.f13122c.f12778e;
    }

    public final C2448u m14655j() {
        if (m14626O() != null) {
            return m14626O().f12398d;
        }
        return null;
    }

    public final boolean m14656k() {
        C2440m c2440m = this.f14885a.f12115v;
        if (c2440m == null || c2440m.f13128i == null) {
            return false;
        }
        return true;
    }

    public final eu m14657l() {
        if (this.f14885a.f12115v != null) {
            return this.f14885a.f12115v.f13128i;
        }
        return null;
    }

    public final boolean m14658m() {
        C2440m c2440m = this.f14885a.f12115v;
        return (c2440m == null || c2440m.f13127h == null) ? false : true;
    }

    public final lw m14659n() {
        if (m14658m()) {
            return this.f14885a.f12115v.f13127h;
        }
        return null;
    }

    public final boolean m14660o() {
        return this.f14885a.f12111r != null;
    }

    public final ce[] m14661p() {
        return this.f14885a.f12111r.f12022h;
    }

    public final jf m14662q() {
        if (this.f14885a.f12115v != null) {
            return this.f14885a.f12115v.f13124e;
        }
        return null;
    }

    public final jf[] m14663r() {
        return this.f14885a.f12115v != null ? this.f14885a.f12115v.f13121b : null;
    }

    public final jf m14664s() {
        C2440m c2440m = this.f14885a.f12115v;
        return c2440m != null ? c2440m.f13123d : null;
    }

    public final String m14665t() {
        C2440m c2440m = this.f14885a.f12115v;
        if (c2440m != null) {
            return c2440m.f13137r;
        }
        return "";
    }

    public final Document m14666u() {
        if (m14667v()) {
            return new Document(this.f14885a.f12115v.f13142w);
        }
        return null;
    }

    public final boolean m14667v() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13142w == null) ? false : true;
    }

    public final boolean m14668w() {
        return !TextUtils.isEmpty(m14669x());
    }

    public final String m14669x() {
        if (this.f14885a.f12115v == null || this.f14885a.f12115v.f13103J == null) {
            return null;
        }
        return this.f14885a.f12115v.f13103J.f11801b;
    }

    public final long m14670y() {
        if (!m14624M() || m14625N() == null) {
            return 0;
        }
        return m14625N().f13166f;
    }

    public final es m14671z() {
        if (m14625N() != null) {
            return m14625N().f13153B;
        }
        return null;
    }

    public final CharSequence m14612A() {
        if (!this.f14891g) {
            Object obj = this.f14885a.f12103j;
            if (!TextUtils.isEmpty(obj)) {
                this.f14890f = C4685p.m21831a(obj);
            }
            this.f14891g = true;
        }
        return this.f14890f;
    }

    public final boolean m14613B() {
        return (this.f14885a.f12095b & 8388608) != 0;
    }

    public final boolean m14614C() {
        return this.f14885a.f12115v != null && this.f14885a.f12115v.f13096C.length > 0;
    }

    public final lt[] m14615D() {
        return this.f14885a.f12115v.f13096C;
    }

    public final boolean m14616E() {
        return (this.f14885a.f12115v == null || TextUtils.isEmpty(this.f14885a.f12115v.f13097D)) ? false : true;
    }

    public final String m14617F() {
        return this.f14885a.f12115v.f13097D;
    }

    public final boolean m14618G() {
        return (!m14624M() || m14625N() == null || TextUtils.isEmpty(m14625N().f13172l)) ? false : true;
    }

    public final CharSequence m14619H() {
        if (!m14624M() || m14625N() == null) {
            return "";
        }
        return C4685p.m21831a(m14625N().f13172l);
    }

    public final boolean m14620I() {
        return this.f14885a.f12114u != null;
    }

    public final float m14621J() {
        return this.f14885a.f12114u.f12597c;
    }

    public final long m14622K() {
        return this.f14885a.f12114u.f12598d;
    }

    public final int[] m14623L() {
        if (!m14620I()) {
            return new int[]{0, 0, 0, 0, 0};
        }
        hr hrVar = this.f14885a.f12114u;
        return new int[]{(int) hrVar.f12604j, (int) hrVar.f12603i, (int) hrVar.f12602h, (int) hrVar.f12601g, (int) hrVar.f12600f};
    }

    public final bd m14642b(int i) {
        List c = m14644c(i);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return (bd) c.get(0);
    }

    public final List m14644c(int i) {
        return (List) cE().get(Integer.valueOf(i));
    }

    public final boolean m14647d(int i) {
        return cE().containsKey(Integer.valueOf(i));
    }

    @SuppressLint({"UseSparseArrays"})
    private final Map cE() {
        if (this.f14886b == null) {
            this.f14886b = new HashMap();
            for (bd bdVar : this.f14885a.f12109p) {
                int i = bdVar.f11857c;
                if (!this.f14886b.containsKey(Integer.valueOf(i))) {
                    this.f14886b.put(Integer.valueOf(i), new ArrayList());
                }
                ((List) this.f14886b.get(Integer.valueOf(i))).add(bdVar);
            }
        }
        return this.f14886b;
    }

    public final boolean m14624M() {
        return this.f14885a.f12112s != null;
    }

    public final C2441n m14625N() {
        return m14624M() ? this.f14885a.f12112s.f12048a : null;
    }

    public final C2433g m14626O() {
        return m14624M() ? this.f14885a.f12112s.f12049b : null;
    }

    public final C2448u m14627P() {
        return m14624M() ? this.f14885a.f12112s.f12050c : null;
    }

    public final jw m14628Q() {
        return m14624M() ? this.f14885a.f12112s.f12051d : null;
    }

    public final af m14629R() {
        return m14624M() ? this.f14885a.f12112s.f12052e : null;
    }

    public final lq m14630S() {
        return m14624M() ? this.f14885a.f12112s.f12053f : null;
    }

    public final ky m14631T() {
        return m14624M() ? this.f14885a.f12112s.f12058k : null;
    }

    private final kz cF() {
        return m14624M() ? this.f14885a.f12112s.f12057j : null;
    }

    public final la m14632U() {
        return m14624M() ? this.f14885a.f12112s.f12056i : null;
    }

    public final ey m14633V() {
        return m14624M() ? this.f14885a.f12112s.f12055h : null;
    }

    public final boolean m14634W() {
        return this.f14885a.f12113t != null;
    }

    public final String m14635X() {
        if (this.f14885a.f12115v != null) {
            return this.f14885a.f12115v.f13143x;
        }
        return "";
    }

    public final boolean m14636Y() {
        kz cF = cF();
        if (this.f14885a.f12098e == 19 && cF != null) {
            boolean z;
            if ((cF.f12981a & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && cF.f12988h) {
                return true;
            }
        }
        return false;
    }

    public final boolean m14637Z() {
        lx[] aa = aa();
        return aa != null && aa.length > 0;
    }

    public final lx[] aa() {
        if (!m14624M()) {
            return null;
        }
        switch (this.f14885a.f12098e) {
            case 6:
                return m14630S().f13047l;
            case 19:
                return cF().f12990j;
            case 20:
                return m14631T().f12980e;
            default:
                return null;
        }
    }

    public final bl m14649e(int i) {
        for (bl blVar : this.f14885a.f12107n) {
            if (blVar.f11926p == i) {
                return blVar;
            }
        }
        return null;
    }

    public final bl m14639a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (bl blVar : this.f14885a.f12107n) {
            if (str.equals(blVar.f11907B)) {
                return blVar;
            }
        }
        return null;
    }

    public final bl m14640a(String str, int i) {
        bl a = m14639a(str);
        if (a == null) {
            return m14649e(i);
        }
        return a;
    }

    public static boolean m14611a(bl blVar) {
        if (blVar != null && (blVar.f11926p == 1 || blVar.f11926p == 7)) {
            boolean z;
            if ((blVar.f11912b & 8192) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && blVar.f11935y > System.currentTimeMillis()) {
                return true;
            }
        }
        return false;
    }

    public final boolean ab() {
        if (m14611a(m14649e(1)) || m14611a(m14649e(7))) {
            return true;
        }
        return false;
    }

    public final boolean ac() {
        if (this.f14885a.f12115v != null) {
            boolean z;
            if ((this.f14885a.f12115v.f13120a & 16) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean ad() {
        return (this.f14885a.f12115v == null || TextUtils.isEmpty(this.f14885a.f12115v.f13102I)) ? false : true;
    }

    public final boolean ae() {
        if (this.f14885a.f12089F) {
            return true;
        }
        for (Object equals : f14884h) {
            if (this.f14885a.f12096c.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public final int af() {
        if (this.f14885a.f12108o != null) {
            return this.f14885a.f12108o.f12161b;
        }
        return -1;
    }

    public final boolean ag() {
        for (bl blVar : this.f14885a.f12107n) {
            if (blVar.f11926p == 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean ah() {
        bl e = m14649e(1);
        if (e != null) {
            return e.f11924n;
        }
        return false;
    }

    public final int ai() {
        C2441n N = m14625N();
        if (N == null || N.f13153B == null) {
            return 0;
        }
        String str = N.f13171k;
        String[] a = C4680k.m21818a((String) C0955b.f5860D.m28964b());
        for (Object equals : a) {
            if (str.equals(equals)) {
                return 23;
            }
        }
        return N.f13153B.f12313e;
    }

    public final bd aj() {
        List c = m14644c(4);
        if (c == null || c.size() == 0) {
            c = m14644c(0);
        }
        return (c == null || c.size() == 0) ? null : (bd) c.get(0);
    }

    public final boolean ak() {
        List c = m14644c(1);
        if (c == null || c.isEmpty() || 1 == this.f14885a.f12099f) {
            return false;
        }
        return true;
    }

    public final boolean al() {
        return this.f14885a.f12115v != null && this.f14885a.f12115v.f13126g.length > 0;
    }

    public final CharSequence am() {
        StringBuilder stringBuilder = new StringBuilder();
        C2440m c2440m = this.f14885a.f12115v;
        int length = c2440m.f13126g.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                stringBuilder.append("<br />");
            }
            stringBuilder.append(c2440m.f13126g[i].f13069c);
        }
        return C4685p.m21831a(stringBuilder.toString());
    }

    public final boolean an() {
        List f = m14650f(1);
        if ((f == null || f.size() <= 0) && this.f14885a.f12115v.f13131l.length <= 0) {
            return false;
        }
        return true;
    }

    public final ac ao() {
        List f = m14650f(1);
        if (f == null || f.size() <= 0) {
            return this.f14885a.f12115v.f13131l[0];
        }
        return (ac) f.get(0);
    }

    public final ac[] ap() {
        List f = m14650f(1);
        if (f == null || f.size() <= 0) {
            return this.f14885a.f12115v.f13131l;
        }
        return (ac[]) f.toArray(new ac[f.size()]);
    }

    public final boolean aq() {
        List f = m14650f(7);
        return (f != null && f.size() > 0) || this.f14885a.f12115v.f13132m.length > 0;
    }

    public final ac ar() {
        return this.f14885a.f12115v != null ? this.f14885a.f12115v.f13134o : null;
    }

    public final boolean as() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13135p == null || this.f14885a.f12115v.f13135p.length <= 0) ? false : true;
    }

    public final boolean at() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13133n == null || this.f14885a.f12115v.f13133n.length <= 0) ? false : true;
    }

    public final ac[] au() {
        return this.f14885a.f12115v.f13133n;
    }

    public final ad av() {
        return this.f14885a.f12115v.f13135p[0];
    }

    public final List m14650f(int i) {
        if (this.f14887c == null) {
            this.f14887c = new SparseArray();
            for (ac acVar : this.f14885a.f12115v.f13130k) {
                for (int i2 : acVar.f11763j) {
                    if (this.f14887c.get(i2, null) == null) {
                        this.f14887c.put(i2, new ArrayList());
                    }
                    ((List) this.f14887c.get(i2)).add(acVar);
                }
            }
        }
        return (List) this.f14887c.get(i, null);
    }

    public final boolean aw() {
        return (bg() == null || bg().au == null) ? false : true;
    }

    public final boolean ax() {
        return (bg() == null || bg().f12934m == null) ? false : true;
    }

    public final boolean ay() {
        return (bg() == null || bg().f12906K == null) ? false : true;
    }

    public final boolean az() {
        return (bg() == null || bg().f12908M == null) ? false : true;
    }

    public final boolean aA() {
        return (bg() == null || bg().f12931j == null) ? false : true;
    }

    public final fh aB() {
        return bg() != null ? bg().f12931j : null;
    }

    public final boolean aC() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13129j == null || this.f14885a.f12115v.f13129j.f12923b == null) ? false : true;
    }

    public final da aD() {
        return this.f14885a.f12115v.f13129j.f12923b;
    }

    public final fm aE() {
        if (aw()) {
            return bg().au;
        }
        return null;
    }

    public final kg aF() {
        if (this.f14885a.f12115v == null || this.f14885a.f12115v.f13139t == null) {
            return null;
        }
        return this.f14885a.f12115v.f13139t;
    }

    public final String aG() {
        if (this.f14885a.f12115v == null || this.f14885a.f12115v.f13100G == null) {
            return null;
        }
        return this.f14885a.f12115v.f13100G.f12819b;
    }

    public final ga aH() {
        if (aI()) {
            return this.f14885a.f12115v.f13094A;
        }
        return null;
    }

    public final boolean aI() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13094A == null) ? false : true;
    }

    public final dt aJ() {
        Object obj = (this.f14885a.f12115v == null || this.f14885a.f12115v.ab == null) ? null : 1;
        if (obj != null) {
            return this.f14885a.f12115v.ab;
        }
        return null;
    }

    public final boolean aK() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.ac == null) ? false : true;
    }

    public final boolean aL() {
        if (aN() && m14625N().f13158G.f12544a != null) {
            return true;
        }
        return false;
    }

    public final boolean aM() {
        if (aN() && m14625N().f13158G.f12545b != null) {
            return true;
        }
        return false;
    }

    public final boolean aN() {
        if (!ae()) {
            return false;
        }
        C2441n N = m14625N();
        if (N == null || N.f13158G == null) {
            return false;
        }
        return true;
    }

    public final C2444q aO() {
        C2441n N = m14625N();
        return N != null ? N.f13159H : null;
    }

    public final fz aP() {
        if (aQ()) {
            return this.f14885a.f12115v.f13095B;
        }
        return null;
    }

    public final boolean aQ() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13095B == null) ? false : true;
    }

    public final jk aR() {
        Object obj = (this.f14885a.f12115v == null || this.f14885a.f12115v.f13099F == null) ? null : 1;
        if (obj != null) {
            return this.f14885a.f12115v.f13099F;
        }
        return null;
    }

    public final boolean aS() {
        return (bg() == null || bg().f12932k == null) ? false : true;
    }

    public final boolean aT() {
        ko bg = bg();
        return (bg == null || bg.f12898C == null) ? false : true;
    }

    public final ku aU() {
        ko bg = bg();
        return bg == null ? null : bg.f12898C;
    }

    public final boolean aV() {
        return (bg() == null || bg().f12930i == null) ? false : true;
    }

    public final boolean aW() {
        return (bg() == null || bg().f12940s == null) ? false : true;
    }

    public final boolean aX() {
        return (bg() == null || bg().aE == null) ? false : true;
    }

    public final ix aY() {
        return aX() ? bg().aE : null;
    }

    public final boolean aZ() {
        ko bg = bg();
        return (bg == null || bg.f12933l == null) ? false : true;
    }

    public final boolean ba() {
        return bb() != null;
    }

    public final gl bb() {
        ko bg = bg();
        if (bg == null || bg.aJ == null) {
            return null;
        }
        return bg.aJ;
    }

    public final CharSequence bc() {
        ko bg = bg();
        if (bg == null || bg.f12933l == null) {
            return null;
        }
        return bg.f12933l.f12823d;
    }

    public final ly bd() {
        ko bg = bg();
        return (bg == null || bg.f12933l == null) ? null : bg.f12933l.f12826g;
    }

    public final boolean be() {
        kg aF = aF();
        return (aF == null || aF.f12872a == null) ? false : true;
    }

    public final ck bf() {
        return be() ? aF().f12872a : null;
    }

    public final ko bg() {
        return this.f14885a.f12115v != null ? this.f14885a.f12115v.f13129j : null;
    }

    public final boolean bh() {
        C2433g O = m14626O();
        if (!(O == null || O.f12397c == null)) {
            boolean z;
            if ((O.f12397c.f12374a & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean bi() {
        C2433g O = m14626O();
        return (O == null || O.f12397c == null || O.f12397c.f12376c.length <= 0) ? false : true;
    }

    public final boolean bj() {
        if (this.f14885a.f12099f == 6) {
            return this.f14885a.f12115v != null && this.f14885a.f12115v.f13138s.length > 0;
        } else {
            throw new IllegalStateException("Unexpected backend: " + this.f14885a.f12099f);
        }
    }

    public final Document bk() {
        if (this.f14885a.f12098e != 16 && this.f14885a.f12098e != 24) {
            throw new IllegalArgumentException("This method should be called only on magazine docs. Passed type " + this.f14885a.f12098e);
        } else if (m14638a() == 0) {
            return null;
        } else {
            return m14641a(0);
        }
    }

    public final List bl() {
        if (!bj()) {
            return null;
        }
        if (this.f14888d == null) {
            this.f14888d = new ArrayList(this.f14885a.f12115v.f13138s.length);
            cv[] cvVarArr = this.f14885a.f12115v.f13138s;
            for (cv document : cvVarArr) {
                this.f14888d.add(new Document(document));
            }
        }
        return this.f14888d;
    }

    public final boolean bm() {
        if (this.f14885a.f12098e != 12 && m14628Q() == null && this.f14885a.f12086C && !C2726q.m14753b(this.f14885a.f12098e) && m14649e(13) == null) {
            return true;
        }
        return false;
    }

    public final boolean bn() {
        for (int i : m14623L()) {
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean bo() {
        return (this.f14885a == null || aF() == null || aF().f12874c.length <= 0) ? false : true;
    }

    public final boolean bp() {
        C2440m c2440m = this.f14885a.f12115v;
        return (c2440m == null || c2440m.f13098E == null || !c2440m.f13098E.f13027b) ? false : true;
    }

    public final String bq() {
        C2440m c2440m = this.f14885a.f12115v;
        if (c2440m == null || c2440m.f13098E == null) {
            return "";
        }
        return c2440m.f13098E.f13028c;
    }

    public final String br() {
        C2440m c2440m = this.f14885a.f12115v;
        if (c2440m == null || c2440m.f13098E == null) {
            return "";
        }
        return c2440m.f13098E.f13030e;
    }

    public final String bs() {
        C2440m c2440m = this.f14885a.f12115v;
        if (c2440m == null || c2440m.f13098E == null) {
            return "";
        }
        return c2440m.f13098E.f13029d;
    }

    public final boolean bt() {
        ko bg = bg();
        return (bg == null || bg.f12903H == null) ? false : true;
    }

    public final boolean bu() {
        ko bg = bg();
        return (bg == null || bg.f12909N == null) ? false : true;
    }

    public final boolean bv() {
        ko bg = bg();
        return (bg == null || bg.f12910O == null) ? false : true;
    }

    public final gb bw() {
        if (bx()) {
            return this.f14885a.f12115v.f13145z;
        }
        return null;
    }

    public final boolean bx() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13145z == null) ? false : true;
    }

    private final boolean cG() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13105L == null) ? false : true;
    }

    public final C2446s by() {
        if (cG()) {
            return this.f14885a.f12115v.f13105L;
        }
        return null;
    }

    public final boolean bz() {
        if (cG()) {
            boolean z;
            if ((by().f13200a & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean bA() {
        if (cG()) {
            if (((by().f13200a & 4) != 0) && by().f13203d) {
                return true;
            }
        }
        return false;
    }

    public final boolean bB() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.aa == null) ? false : true;
    }

    public final ej bC() {
        ko bg = bg();
        return bg != null ? bg.f12938q : null;
    }

    public final boolean bD() {
        return bC() != null;
    }

    public final boolean bE() {
        if (m14624M() && this.f14885a.f12112s.f12052e != null) {
            boolean z;
            if ((this.f14885a.f12112s.f12052e.f11769a & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final String bF() {
        if (!m14624M() || this.f14885a.f12112s.f12052e == null) {
            return null;
        }
        return this.f14885a.f12112s.f12052e.f11776h;
    }

    public final String bG() {
        if (!m14624M() || this.f14885a.f12112s.f12062o == null) {
            return null;
        }
        return this.f14885a.f12112s.f12062o.f11786c;
    }

    public final String bH() {
        if (!m14624M() || this.f14885a.f12112s.f12062o == null) {
            return null;
        }
        return this.f14885a.f12112s.f12062o.f11785b;
    }

    public final String bI() {
        if (!m14624M() || this.f14885a.f12112s.f12052e == null) {
            return null;
        }
        return this.f14885a.f12112s.f12052e.f11778j;
    }

    public final String bJ() {
        if (!m14624M() || this.f14885a.f12112s.f12052e == null) {
            return null;
        }
        return this.f14885a.f12112s.f12052e.f11779k;
    }

    public final boolean bK() {
        if (!m14624M() || this.f14885a.f12112s.f12052e == null || this.f14885a.f12112s.f12052e.f11780l == null) {
            return false;
        }
        return true;
    }

    public final String bL() {
        if (bK()) {
            return this.f14885a.f12112s.f12052e.f11780l.f12751b;
        }
        return null;
    }

    public final boolean bM() {
        return (!m14624M() || this.f14885a.f12112s.f12052e == null || this.f14885a.f12112s.f12052e.f11782n == null) ? false : true;
    }

    public final go bN() {
        return bM() ? this.f14885a.f12112s.f12052e.f11782n : null;
    }

    public final boolean bO() {
        return (!bM() || bN().f12468c == null || bN().f12468c.isEmpty()) ? false : true;
    }

    public final String bP() {
        if (bO()) {
            return bN().f12468c;
        }
        return null;
    }

    public final String bQ() {
        af R = m14629R();
        if (R != null) {
            return R.f11783o;
        }
        return null;
    }

    public final boolean bR() {
        return bM() && bN().f12469d;
    }

    public final boolean bS() {
        return (m14625N() == null || m14625N().f13154C == null) ? false : true;
    }

    public final boolean bT() {
        return bS() && m14625N().f13154C.f12951c;
    }

    public final boolean bU() {
        return bS() && m14625N().f13154C.f12950b;
    }

    public final boolean bV() {
        return bS() && m14625N().f13154C.f12952d;
    }

    public final boolean bW() {
        return (m14625N() == null || m14625N().f13155D == null) ? false : true;
    }

    public final boolean bX() {
        return bW() && m14625N().f13155D.f12123b;
    }

    public final boolean bY() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13110Q == null || this.f14885a.f12115v.f13110Q.f12285b.length <= 0) ? false : true;
    }

    public final boolean bZ() {
        ko bg = bg();
        return (bg == null || bg.aF == null) ? false : true;
    }

    public final er ca() {
        return bg() != null ? bg().aF : null;
    }

    public final ff cb() {
        return bg() != null ? bg().f12913R : null;
    }

    public final boolean cc() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13113T == null) ? false : true;
    }

    public final boolean cd() {
        return (this.f14885a.f12115v == null || this.f14885a.f12115v.f13118Y == null) ? false : true;
    }

    public final iy ce() {
        Object obj = (this.f14885a.f12115v == null || this.f14885a.f12115v.f13116W == null) ? null : 1;
        return obj != null ? this.f14885a.f12115v.f13116W : null;
    }

    public final String cf() {
        C2441n N = m14625N();
        if (N == null) {
            return null;
        }
        return N.f13171k;
    }

    public final boolean cg() {
        ko bg = bg();
        return (bg == null || bg.f12916U == null) ? false : true;
    }

    public final boolean ch() {
        ko bg = bg();
        return (bg == null || bg.ak == null) ? false : true;
    }

    public final eb ci() {
        if (ch()) {
            return bg().ak;
        }
        return null;
    }

    public final boolean cj() {
        ko bg = bg();
        return (bg == null || bg.ae == null) ? false : true;
    }

    public final ee ck() {
        if (cj()) {
            return bg().ae;
        }
        return null;
    }

    public final boolean cl() {
        ko bg = bg();
        return (bg == null || bg.ag == null) ? false : true;
    }

    public final dy cm() {
        if (cl()) {
            return bg().ag;
        }
        return null;
    }

    public final boolean cn() {
        ko bg = bg();
        return (bg == null || bg.ah == null) ? false : true;
    }

    public final ea co() {
        if (cn()) {
            return bg().ah;
        }
        return null;
    }

    public final boolean cp() {
        ko bg = bg();
        return (bg == null || bg.af == null) ? false : true;
    }

    public final ed cq() {
        if (cp()) {
            return bg().af;
        }
        return null;
    }

    public final boolean cr() {
        ko bg = bg();
        return (bg == null || bg.ai == null) ? false : true;
    }

    public final ec cs() {
        if (cr()) {
            return bg().ai;
        }
        return null;
    }

    public final boolean ct() {
        ko bg = bg();
        return (bg == null || bg.aj == null) ? false : true;
    }

    public final dz cu() {
        if (ct()) {
            return bg().aj;
        }
        return null;
    }

    public final boolean cv() {
        ko bg = bg();
        return (bg == null || bg.aq == null) ? false : true;
    }

    public final fc cw() {
        return cv() ? bg().aq : null;
    }

    public final lv cx() {
        ko bg = bg();
        return bg != null ? bg.av : null;
    }

    public final boolean cy() {
        ko bg = bg();
        return (bg == null || bg.al == null) ? false : true;
    }

    public final boolean cz() {
        ko bg = bg();
        return (bg == null || bg.am == null) ? false : true;
    }

    public final boolean cA() {
        ko bg = bg();
        return (bg == null || bg.an == null) ? false : true;
    }

    public final String cB() {
        eq eqVar;
        C2440m c2440m = this.f14885a.f12115v;
        if (c2440m != null) {
            eqVar = c2440m.f13117X;
        } else {
            eqVar = null;
        }
        if (eqVar != null) {
            return eqVar.f12303b;
        }
        return null;
    }

    public final boolean cC() {
        C2440m c2440m = this.f14885a.f12115v;
        if (c2440m != null) {
            boolean z;
            if ((c2440m.f13120a & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final String cD() {
        C2441n N = m14625N();
        if (N != null) {
            return N.f13160I;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m21671a(this.f14885a), 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        stringBuilder.append(this.f14885a.f12096c);
        if (this.f14885a.f12098e == 1) {
            stringBuilder.append(" v=").append(m14625N().f13163c);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
