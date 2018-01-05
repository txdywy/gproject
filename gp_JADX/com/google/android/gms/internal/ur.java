package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class ur {
    public final vq f27539a = vq.m25797a(16);
    public boolean f27540b;
    public boolean f27541c = false;

    static {
        ur urVar = new ur((byte) 0);
    }

    ur() {
    }

    private ur(byte b) {
        if (!this.f27540b) {
            this.f27539a.mo4941a();
            this.f27540b = true;
        }
    }

    private final void m25758a(ut utVar, Object obj) {
        Object obj2;
        if (!utVar.m25761b()) {
            m25759a(utVar.m25760a(), obj);
            obj2 = obj;
        } else if (obj instanceof List) {
            obj2 = new ArrayList();
            obj2.addAll((List) obj);
            ArrayList arrayList = (ArrayList) obj2;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                m25759a(utVar.m25760a(), obj3);
            }
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj2 instanceof vg) {
            this.f27541c = true;
        }
        this.f27539a.m25799a(utVar, obj2);
    }

    private static void m25759a(wm wmVar, Object obj) {
        boolean z = false;
        vd.m25788a(obj);
        switch (us.f27542a[wmVar.f27621s.ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof ud) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case 8:
                if ((obj instanceof Integer) || (obj instanceof ve)) {
                    z = true;
                    break;
                }
            case 9:
                if ((obj instanceof vk) || (obj instanceof vg)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final /* synthetic */ Object clone() {
        ur urVar = new ur();
        for (int i = 0; i < this.f27539a.m25801b(); i++) {
            Entry b = this.f27539a.m25802b(i);
            urVar.m25758a((ut) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f27539a.m25803c()) {
            urVar.m25758a((ut) entry.getKey(), entry.getValue());
        }
        urVar.f27541c = this.f27541c;
        return urVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur)) {
            return false;
        }
        return this.f27539a.equals(((ur) obj).f27539a);
    }

    public final int hashCode() {
        return this.f27539a.hashCode();
    }
}
