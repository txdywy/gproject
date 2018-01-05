package com.google.android.finsky.notification;

import com.google.android.finsky.utils.ad;
import java.util.Arrays;

public final class C3823y {
    public final String f19156a;
    public final String f19157b;

    public C3823y(String str, String str2) {
        this.f19156a = str;
        this.f19157b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3823y c3823y = (C3823y) obj;
        if (ad.m21692a(this.f19156a, c3823y.f19156a) && ad.m21692a(this.f19157b, c3823y.f19157b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19156a, this.f19157b});
    }

    public final String toString() {
        String str = this.f19156a;
        String str2 = this.f19157b;
        return new StringBuilder((String.valueOf(str).length() + 50) + String.valueOf(str2).length()).append("NotificationKey{notificationId='").append(str).append('\'').append(", accountName='").append(str2).append('\'').append('}').toString();
    }
}
