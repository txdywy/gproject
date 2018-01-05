package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ad implements eq {
    public final CodedOutputStream f35101a;

    public ad(CodedOutputStream codedOutputStream) {
        this.f35101a = (CodedOutputStream) bb.m32995a((Object) codedOutputStream, "output");
    }

    public final er mo6051a() {
        return er.ASCENDING;
    }

    public final void mo6055a(int i, int i2) {
        try {
            this.f35101a.mo6049e(i, i2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6056a(int i, long j) {
        try {
            this.f35101a.mo6028a(i, j);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6066b(int i, long j) {
        try {
            this.f35101a.mo6046c(i, j);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6054a(int i, float f) {
        try {
            this.f35101a.m32632a(i, f);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6053a(int i, double d) {
        try {
            this.f35101a.m32631a(i, d);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6065b(int i, int i2) {
        try {
            this.f35101a.mo6040b(i, i2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6071c(int i, long j) {
        try {
            this.f35101a.mo6028a(i, j);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6070c(int i, int i2) {
        try {
            this.f35101a.mo6040b(i, i2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6076d(int i, long j) {
        try {
            this.f35101a.mo6046c(i, j);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6075d(int i, int i2) {
        try {
            this.f35101a.mo6049e(i, i2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6063a(int i, boolean z) {
        try {
            this.f35101a.mo6032a(i, z);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6060a(int i, String str) {
        try {
            this.f35101a.mo6031a(i, str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6058a(int i, C7203j c7203j) {
        try {
            this.f35101a.mo6030a(i, c7203j);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6079e(int i, int i2) {
        try {
            this.f35101a.mo6045c(i, i2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6082f(int i, int i2) {
        try {
            this.f35101a.m32658d(i, i2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6080e(int i, long j) {
        try {
            this.f35101a.m32648b(i, j);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6059a(int i, Object obj) {
        try {
            this.f35101a.mo6029a(i, (cf) obj);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6067b(int i, Object obj) {
        try {
            this.f35101a.m32661e(i, (cf) obj);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6052a(int i) {
        try {
            this.f35101a.mo6027a(i, 3);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6064b(int i) {
        try {
            this.f35101a.mo6027a(i, 4);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6072c(int i, Object obj) {
        try {
            if (obj instanceof C7203j) {
                this.f35101a.mo6042b(i, (C7203j) obj);
            } else {
                this.f35101a.mo6041b(i, (cf) obj);
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6062a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m32621n(((Integer) list.get(i4)).intValue());
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.mo6039b(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6040b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void mo6069b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += CodedOutputStream.m32577a();
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.mo6048e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6049e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void mo6074c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m32599d(((Long) list.get(i4)).longValue());
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.mo6033a(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6028a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void mo6078d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m32602e(((Long) list.get(i4)).longValue());
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.mo6033a(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6028a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void mo6081e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += CodedOutputStream.m32591c();
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.mo6047c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6046c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void mo6083f(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    i3 += CodedOutputStream.m32600e();
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.m32630a(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.m32632a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final void mo6084g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    i3 += CodedOutputStream.m32603f();
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.m32629a(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.m32631a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public final void mo6085h(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m32624q(((Integer) list.get(i4)).intValue());
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.mo6039b(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6040b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void mo6086i(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    i3 += CodedOutputStream.m32609g();
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.m32644a(((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6032a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void mo6061a(int i, List list) {
        int i2 = 0;
        try {
            if (list instanceof bo) {
                bo boVar = (bo) list;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    Object b = boVar.mo6137b(i3);
                    if (b instanceof String) {
                        this.f35101a.mo6031a(i, (String) b);
                    } else {
                        this.f35101a.mo6030a(i, (C7203j) b);
                    }
                }
                return;
            }
            while (i2 < list.size()) {
                this.f35101a.mo6031a(i, (String) list.get(i2));
                i2++;
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo6068b(int i, List list) {
        int i2 = 0;
        while (i2 < list.size()) {
            try {
                this.f35101a.mo6030a(i, (C7203j) list.get(i2));
                i2++;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void mo6087j(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m32622o(((Integer) list.get(i4)).intValue());
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.mo6044c(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6045c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void mo6088k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += CodedOutputStream.m32584b();
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.mo6048e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6049e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void mo6089l(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += CodedOutputStream.m32595d();
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.mo6047c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.mo6046c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void mo6090m(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m32623p(((Integer) list.get(i4)).intValue());
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.m32657d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.m32658d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void mo6091n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            try {
                this.f35101a.mo6027a(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m32608f(((Long) list.get(i4)).longValue());
                }
                this.f35101a.mo6044c(i3);
                while (i2 < list.size()) {
                    this.f35101a.m32651b(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        while (i2 < list.size()) {
            this.f35101a.m32648b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void mo6073c(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo6059a(i, list.get(i2));
        }
    }

    public final void mo6077d(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo6067b(i, list.get(i2));
        }
    }

    public final void mo6057a(int i, by byVar, Map map) {
        int i2 = 0;
        try {
            if (this.f35101a.f35083d) {
                int i3;
                int i4;
                switch (byVar.f35244a.ordinal()) {
                    case 2:
                    case 3:
                    case 5:
                    case 15:
                    case 17:
                        long[] jArr = new long[map.size()];
                        i3 = 0;
                        for (Long longValue : map.keySet()) {
                            i4 = i3 + 1;
                            jArr[i3] = longValue.longValue();
                            i3 = i4;
                        }
                        Arrays.sort(jArr);
                        i4 = jArr.length;
                        while (i2 < i4) {
                            long j = jArr[i2];
                            Object obj = map.get(Long.valueOf(j));
                            this.f35101a.mo6027a(i, 2);
                            this.f35101a.mo6044c(bx.m33045a(byVar, Long.valueOf(j), obj));
                            bx.m33046a(this.f35101a, byVar, Long.valueOf(j), obj);
                            i2++;
                        }
                        return;
                    case 4:
                    case 6:
                    case 12:
                    case 14:
                    case 16:
                        int[] iArr = new int[map.size()];
                        i3 = 0;
                        for (Integer intValue : map.keySet()) {
                            i4 = i3 + 1;
                            iArr[i3] = intValue.intValue();
                            i3 = i4;
                        }
                        Arrays.sort(iArr);
                        i4 = iArr.length;
                        while (i2 < i4) {
                            i3 = iArr[i2];
                            Object obj2 = map.get(Integer.valueOf(i3));
                            this.f35101a.mo6027a(i, 2);
                            this.f35101a.mo6044c(bx.m33045a(byVar, Integer.valueOf(i3), obj2));
                            bx.m33046a(this.f35101a, byVar, Integer.valueOf(i3), obj2);
                            i2++;
                        }
                        return;
                    case 7:
                        Object obj3 = map.get(Boolean.FALSE);
                        if (obj3 != null) {
                            m32821a(i, false, obj3, byVar);
                        }
                        obj3 = map.get(Boolean.TRUE);
                        if (obj3 != null) {
                            m32821a(i, true, obj3, byVar);
                            return;
                        }
                        return;
                    case 8:
                        String[] strArr = new String[map.size()];
                        i3 = 0;
                        for (String str : map.keySet()) {
                            int i5 = i3 + 1;
                            strArr[i3] = str;
                            i3 = i5;
                        }
                        Arrays.sort(strArr);
                        for (Object obj4 : strArr) {
                            Object obj5 = map.get(obj4);
                            this.f35101a.mo6027a(i, 2);
                            this.f35101a.mo6044c(bx.m33045a(byVar, obj4, obj5));
                            bx.m33046a(this.f35101a, byVar, obj4, obj5);
                        }
                        return;
                    default:
                        String valueOf = String.valueOf(byVar.f35244a);
                        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("does not support key type: ").append(valueOf).toString());
                }
                throw new RuntimeException(e);
            }
            for (Entry entry : map.entrySet()) {
                this.f35101a.mo6027a(i, 2);
                this.f35101a.mo6044c(bx.m33045a(byVar, entry.getKey(), entry.getValue()));
                bx.m33046a(this.f35101a, byVar, entry.getKey(), entry.getValue());
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private final void m32821a(int i, boolean z, Object obj, by byVar) {
        this.f35101a.mo6027a(i, 2);
        this.f35101a.mo6044c(bx.m33045a(byVar, Boolean.valueOf(z), obj));
        bx.m33046a(this.f35101a, byVar, Boolean.valueOf(z), obj);
    }
}
