package com.google.protobuf;

final class bt implements df {
    public static final ce f35236c = new bu();
    public final ce f35237a;
    public final bw f35238b;

    public bt() {
        this(bw.DYNAMIC);
    }

    private bt(bw bwVar) {
        this(new bv(as.f35178a, m33036a()), bwVar);
    }

    private bt(ce ceVar, bw bwVar) {
        this.f35237a = (ce) bb.m32995a((Object) ceVar, "messageInfoFactory");
        this.f35238b = (bw) bb.m32995a((Object) bwVar, "mode");
    }

    public final de mo6146a(Class cls) {
        dg.m33253a(cls);
        cd b = this.f35237a.mo6114b(cls);
        if (!b.mo6166b()) {
            switch (this.f35238b.ordinal()) {
                case 0:
                    return m33037a(cls, b);
                case 1:
                    return m33039b(cls, b);
                default:
                    if (b.mo6168d()) {
                        return m33037a(cls, b);
                    }
                    return m33039b(cls, b);
            }
        } else if (at.class.isAssignableFrom(cls)) {
            return cn.m33119a(cls, dg.f35342d, al.f35112a, b.mo6167c());
        } else {
            return cn.m33119a(cls, dg.f35340b, al.m32905a(), b.mo6167c());
        }
    }

    private static de m33037a(Class cls, cd cdVar) {
        if (at.class.isAssignableFrom(cls)) {
            if (m33038a(cdVar)) {
                return cj.m33083a(cls, cdVar, cr.f35280b, bp.f35232b, dg.f35342d, al.f35112a, cc.f35252b);
            }
            return cj.m33083a(cls, cdVar, cr.f35280b, bp.f35232b, dg.f35342d, null, cc.f35252b);
        } else if (m33038a(cdVar)) {
            return cj.m33083a(cls, cdVar, cr.f35279a, bp.f35231a, dg.f35340b, al.m32905a(), cc.f35251a);
        } else {
            return cj.m33083a(cls, cdVar, cr.f35279a, bp.f35231a, dg.f35341c, null, cc.f35251a);
        }
    }

    private static de m33039b(Class cls, cd cdVar) {
        if (at.class.isAssignableFrom(cls)) {
            if (m33038a(cdVar)) {
                return cj.m33098b(cls, cdVar, cr.f35280b, bp.f35232b, dg.f35342d, al.f35112a, cc.f35252b);
            }
            return cj.m33098b(cls, cdVar, cr.f35280b, bp.f35232b, dg.f35342d, null, cc.f35252b);
        } else if (m33038a(cdVar)) {
            return cj.m33098b(cls, cdVar, cr.f35279a, bp.f35231a, dg.f35340b, al.m32905a(), cc.f35251a);
        } else {
            return cj.m33098b(cls, cdVar, cr.f35279a, bp.f35231a, dg.f35341c, null, cc.f35251a);
        }
    }

    private static boolean m33038a(cd cdVar) {
        return cdVar.mo6165a() == ct.PROTO2;
    }

    private static ce m33036a() {
        try {
            return (ce) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return f35236c;
        }
    }
}
