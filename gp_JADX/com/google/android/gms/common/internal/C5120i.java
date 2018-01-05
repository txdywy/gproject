package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

public final class C5120i {
    public final String f26041a;
    public final String f26042b;
    public final ComponentName f26043c;
    public final int f26044d;

    public C5120i(ComponentName componentName) {
        this.f26041a = null;
        this.f26042b = null;
        this.f26043c = (ComponentName) am.m23733a((Object) componentName);
        this.f26044d = 129;
    }

    public C5120i(String str, String str2, int i) {
        this.f26041a = am.m23735a(str);
        this.f26042b = am.m23735a(str2);
        this.f26043c = null;
        this.f26044d = i;
    }

    public final Intent m23794a() {
        return this.f26041a != null ? new Intent(this.f26041a).setPackage(this.f26042b) : new Intent().setComponent(this.f26043c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5120i)) {
            return false;
        }
        C5120i c5120i = (C5120i) obj;
        return ad.m23722a(this.f26041a, c5120i.f26041a) && ad.m23722a(this.f26042b, c5120i.f26042b) && ad.m23722a(this.f26043c, c5120i.f26043c) && this.f26044d == c5120i.f26044d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26041a, this.f26042b, this.f26043c, Integer.valueOf(this.f26044d)});
    }

    public final String toString() {
        return this.f26041a == null ? this.f26043c.flattenToString() : this.f26041a;
    }
}
