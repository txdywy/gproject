package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExperimentTokens extends zza {
    public static final Creator CREATOR = new ae();
    public static final byte[][] f28293a = new byte[0][];
    public final String f28294b;
    public final byte[] f28295c;
    public final byte[][] f28296d;
    public final byte[][] f28297e;
    public final byte[][] f28298f;
    public final byte[][] f28299g;
    public final int[] f28300h;
    public final byte[][] f28301i;

    static {
        ExperimentTokens experimentTokens = new ExperimentTokens("", null, f28293a, f28293a, f28293a, f28293a, null, null);
        aa aaVar = new aa();
        ab abVar = new ab();
        ac acVar = new ac();
        ad adVar = new ad();
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f28294b = str;
        this.f28295c = bArr;
        this.f28296d = bArr2;
        this.f28297e = bArr3;
        this.f28298f = bArr4;
        this.f28299g = bArr5;
        this.f28300h = iArr;
        this.f28301i = bArr6;
    }

    private static List m26407a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List m26408a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void m26409a(StringBuilder stringBuilder, String str, int[] iArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (iArr == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        int length = iArr.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(i2);
            i++;
            obj = null;
        }
        stringBuilder.append(")");
    }

    private static void m26410a(StringBuilder stringBuilder, String str, byte[][] bArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        int length = bArr.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr2, 3));
            stringBuilder.append("'");
            i++;
            obj = null;
        }
        stringBuilder.append(")");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExperimentTokens)) {
            return false;
        }
        ExperimentTokens experimentTokens = (ExperimentTokens) obj;
        return C5549h.m26526a(this.f28294b, experimentTokens.f28294b) && Arrays.equals(this.f28295c, experimentTokens.f28295c) && C5549h.m26526a(m26408a(this.f28296d), m26408a(experimentTokens.f28296d)) && C5549h.m26526a(m26408a(this.f28297e), m26408a(experimentTokens.f28297e)) && C5549h.m26526a(m26408a(this.f28298f), m26408a(experimentTokens.f28298f)) && C5549h.m26526a(m26408a(this.f28299g), m26408a(experimentTokens.f28299g)) && C5549h.m26526a(m26407a(this.f28300h), m26407a(experimentTokens.f28300h)) && C5549h.m26526a(m26408a(this.f28301i), m26408a(experimentTokens.f28301i));
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        if (this.f28294b == null) {
            str = "null";
        } else {
            str = "'";
            String str2 = this.f28294b;
            String str3 = "'";
            str = new StringBuilder((String.valueOf(str).length() + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(str2).append(str3).toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        byte[] bArr = this.f28295c;
        stringBuilder.append("direct");
        stringBuilder.append("=");
        if (bArr == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr, 3));
            stringBuilder.append("'");
        }
        stringBuilder.append(", ");
        m26410a(stringBuilder, "GAIA", this.f28296d);
        stringBuilder.append(", ");
        m26410a(stringBuilder, "PSEUDO", this.f28297e);
        stringBuilder.append(", ");
        m26410a(stringBuilder, "ALWAYS", this.f28298f);
        stringBuilder.append(", ");
        m26410a(stringBuilder, "OTHER", this.f28299g);
        stringBuilder.append(", ");
        m26409a(stringBuilder, "weak", this.f28300h);
        stringBuilder.append(", ");
        m26410a(stringBuilder, "directs", this.f28301i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28294b);
        C5130b.m23847a(parcel, 3, this.f28295c);
        C5130b.m23851a(parcel, 4, this.f28296d);
        C5130b.m23851a(parcel, 5, this.f28297e);
        C5130b.m23851a(parcel, 6, this.f28298f);
        C5130b.m23851a(parcel, 7, this.f28299g);
        C5130b.m23848a(parcel, 8, this.f28300h);
        C5130b.m23851a(parcel, 9, this.f28301i);
        C5130b.m23853b(parcel, a);
    }
}
