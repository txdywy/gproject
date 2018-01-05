package com.google.android.finsky.notification;

import com.google.android.finsky.utils.aj;

public final class C3781e {
    public final C3783g f18987a;

    C3781e(C3783g c3783g) {
        this.f18987a = (C3783g) aj.m21700a(c3783g);
    }

    public static C3782f m18030a(String str, String str2, String str3, int i) {
        return new C3782f(str, str2, str3, i);
    }

    public static C3782f m18029a(C3781e c3781e) {
        return new C3782f(c3781e.f18987a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f18987a.equals(((C3781e) obj).f18987a);
    }

    public final int hashCode() {
        return this.f18987a.hashCode();
    }

    public final String toString() {
        return String.format("NotificationContent{mData='%s'}", new Object[]{this.f18987a});
    }
}
