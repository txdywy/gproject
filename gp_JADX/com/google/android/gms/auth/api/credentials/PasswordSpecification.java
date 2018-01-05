package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class PasswordSpecification extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C4929b();
    public static final PasswordSpecification f25349a = new C4928a().m22941a().m22942a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").m22944b("abcdefghijkmnopqrstxyz").m22944b("ABCDEFGHJKLMNPQRSTXY").m22944b("3456789").m22943b();
    public final String f25350b;
    public final List f25351c;
    public final List f25352d;
    public final int f25353e;
    public final int f25354f;

    public class InvalidSpecificationError extends Error {
        public InvalidSpecificationError(String str) {
            super(str);
        }
    }

    static {
        new C4928a().m22941a().m22942a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").m22944b("abcdefghijklmnopqrstuvwxyz").m22944b("ABCDEFGHIJKLMNOPQRSTUVWXYZ").m22944b("1234567890").m22943b();
    }

    PasswordSpecification(String str, List list, List list2, int i, int i2) {
        this.f25350b = str;
        this.f25351c = Collections.unmodifiableList(list);
        this.f25352d = Collections.unmodifiableList(list2);
        this.f25353e = i;
        this.f25354f = i2;
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        int i3 = 0;
        for (String toCharArray : this.f25351c) {
            for (char c : toCharArray.toCharArray()) {
                iArr[c - 32] = i3;
            }
            i3++;
        }
        SecureRandom secureRandom = new SecureRandom();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 1, this.f25350b);
        C5130b.m23845a(parcel, 2, this.f25351c);
        List list = this.f25352d;
        if (list != null) {
            int a2 = C5130b.m23836a(parcel, 3);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            C5130b.m23853b(parcel, a2);
        }
        C5130b.m23854b(parcel, 4, this.f25353e);
        C5130b.m23854b(parcel, 5, this.f25354f);
        C5130b.m23853b(parcel, a);
    }

    static /* synthetic */ String m22938a(Collection collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character charValue : collection) {
            int i2 = i + 1;
            cArr[i] = charValue.charValue();
            i = i2;
        }
        return new String(cArr);
    }

    static /* synthetic */ boolean m22939a(int i) {
        return i < 32 || i > 126;
    }
}
