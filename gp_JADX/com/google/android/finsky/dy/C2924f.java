package com.google.android.finsky.dy;

import android.content.pm.PackageInfo;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.p259a.p260a.C4697a;
import com.google.android.finsky.verifier.p259a.p260a.C4719w;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class C2924f {
    public static final long f15545a = TimeUnit.DAYS.toMillis(7);
    public static final long f15546b = TimeUnit.DAYS.toMillis(7);
    public static final long f15547c = TimeUnit.DAYS.toMillis(7);
    public final as f15548d;
    public final List f15549e;
    public HashMap f15550f;

    public C2924f(as asVar, List list) {
        this.f15548d = asVar;
        this.f15549e = list;
    }

    private final HashMap m15274a() {
        if (this.f15550f == null) {
            this.f15550f = new HashMap();
            for (PackageInfo packageInfo : this.f15549e) {
                this.f15550f.put(packageInfo.packageName, Long.valueOf(packageInfo.lastUpdateTime));
            }
        }
        return this.f15550f;
    }

    public final boolean m15277a(Set set) {
        Map map;
        List<C4722z> list = (List) ag.m15236a(this.f15548d.mo3202d().mo1519a(new C1215q()));
        if (list == null) {
            map = null;
        } else {
            Map hashMap = new HashMap();
            for (C4722z c4722z : list) {
                hashMap.put(c4722z.f24292b, c4722z);
            }
            map = hashMap;
        }
        if (map == null) {
            return false;
        }
        Set<String> hashSet = new HashSet(map.keySet());
        for (PackageInfo packageInfo : this.f15549e) {
            C4722z c4722z2 = (C4722z) map.get(packageInfo.packageName);
            if (c4722z2 != null) {
                hashSet.remove(packageInfo.packageName);
                set.remove(C4691w.m21842a(c4722z2.f24294d));
            }
        }
        for (String d : hashSet) {
            ag.m15236a(this.f15548d.mo3202d().mo1527d(d));
        }
        return true;
    }

    final boolean m15276a(String str) {
        C4697a c4697a = (C4697a) ag.m15236a(this.f15548d.mo3200b().mo1521a((Object) str));
        if (c4697a != null) {
            Object obj = c4697a.f24090c;
            C4722z c4722z = (C4722z) ag.m15236a(this.f15548d.mo3202d().mo1521a(obj));
            if (c4722z == null) {
                c4722z = null;
            } else {
                if (c4722z.f24293c != ((Long) m15274a().get(obj)).longValue()) {
                    c4722z = null;
                }
            }
            if (c4722z != null) {
                return C4691w.m21842a(c4722z.f24294d).equals(str);
            }
            if (m15274a().containsKey(c4697a.f24090c)) {
                return true;
            }
            return false;
        }
        FinskyLog.m21669e("No ApkInfo entry found for digest", new Object[0]);
        return false;
    }

    public static void m15275a(List list, C2925h c2925h) {
        List arrayList = new ArrayList();
        byte[] bArr = null;
        for (C4719w c4719w : list) {
            byte[] bArr2 = c4719w.f24273b;
            if (bArr != null) {
                if (Arrays.equals(bArr, bArr2)) {
                    arrayList.add(c4719w);
                } else {
                    c2925h.mo3206a(bArr, arrayList);
                    arrayList.clear();
                }
            }
            bArr = bArr2;
            arrayList.add(c4719w);
        }
        if (arrayList.size() > 0) {
            c2925h.mo3206a(bArr, arrayList);
        }
    }

    public final boolean m15278a(Set set, Set set2) {
        List<Object> list = (List) ag.m15236a(this.f15548d.mo3199a().mo1519a(new C1215q()));
        if (list == null) {
            return false;
        }
        long a = C4678i.m21812a();
        for (Object obj : list) {
            if (Math.abs(obj.f24102c - a) <= f15546b || set2.contains(C4691w.m21842a(obj.f24101b))) {
                set.remove(C4691w.m21842a(obj.f24101b));
            } else {
                ag.m15236a(this.f15548d.mo3199a().mo1526c(obj));
            }
        }
        return true;
    }

    public final boolean m15279b(Set set, Set set2) {
        List<Object> list = (List) ag.m15236a(this.f15548d.mo3203e().mo1519a(new C1215q()));
        if (list == null) {
            return false;
        }
        long a = C4678i.m21812a();
        for (Object obj : list) {
            if (Math.abs(obj.f24096c - a) > f15547c) {
                ag.m15236a(this.f15548d.mo3203e().mo1526c(obj));
            } else {
                String a2 = C4691w.m21842a(obj.f24095b);
                set2.add(a2);
                set.remove(a2);
            }
        }
        return true;
    }
}
