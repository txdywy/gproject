package com.google.android.wallet.ui.common;

import android.os.Bundle;
import com.google.a.a.a.a.b.a.b.a.ag;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.common.util.ParcelableProto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bl {
    public static final Pattern f33568a = Pattern.compile("%[1-9%]");
    public final ag f33569b;
    public String[] f33570c;
    public final HashSet f33571d = new HashSet();
    public final int[] f33572e;

    public bl(ag agVar) {
        this.f33569b = agVar;
        for (long valueOf : agVar.b) {
            this.f33571d.add(Long.valueOf(valueOf));
        }
        this.f33570c = new String[agVar.b.length];
        this.f33572e = m30753a(agVar.a);
    }

    public static bl m30751a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("messageBuilder.messageTemplate")) {
            return null;
        }
        ag agVar = (ag) ParcelableProto.m29887a(bundle, "messageBuilder.messageTemplate");
        if (agVar == null) {
            return null;
        }
        bl blVar = new bl(agVar);
        blVar.f33570c = bundle.getStringArray("messageBuilder.displayValues");
        int length = blVar.f33570c.length;
        for (int i = 0; i < length; i++) {
            if (blVar.f33570c[i] != null) {
                blVar.f33571d.remove(Long.valueOf(agVar.b[i]));
            }
        }
        return blVar;
    }

    public final boolean m30756a(long j) {
        return this.f33571d.contains(Long.valueOf(j));
    }

    public final boolean m30755a() {
        return this.f33571d.isEmpty() || this.f33572e.length == 0;
    }

    public final void m30754a(long j, String str) {
        int i = 0;
        long[] jArr = this.f33569b.b;
        int length = jArr != null ? jArr.length : 0;
        while (i < length) {
            if (jArr[i] == j) {
                length = i;
                break;
            }
            i++;
        }
        length = -1;
        if (length >= 0) {
            this.f33571d.remove(Long.valueOf(j));
            this.f33570c[length] = str;
        }
    }

    public final String m30757b() {
        if (!m30755a()) {
            throw new IllegalStateException("Attempting to construct message before all values have been populated.");
        } else if (this.f33572e.length == 0) {
            return this.f33569b.a;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            m30752a(stringBuilder);
            return stringBuilder.toString();
        }
    }

    private final void m30752a(StringBuilder stringBuilder) {
        int i = 0;
        CharSequence charSequence = this.f33569b.a;
        int length = this.f33569b.b.length;
        int length2 = charSequence.length();
        int[] iArr = this.f33572e;
        int length3 = iArr.length;
        int i2 = 0;
        while (i < length3) {
            int i3 = iArr[i];
            stringBuilder.append(charSequence, i2, i3);
            i3++;
            i2 = i3 + 1;
            char charAt = charSequence.charAt(i3);
            if (charAt == '%') {
                stringBuilder.append('%');
            } else {
                int i4 = charAt - 49;
                if (i4 >= length) {
                    throw new IllegalArgumentException("No reference provided for parameter %" + charAt);
                }
                stringBuilder.append(this.f33570c[i4]);
            }
            i++;
        }
        stringBuilder.append(charSequence, i2, length2);
    }

    private static int[] m30753a(String str) {
        List arrayList = new ArrayList();
        Matcher matcher = f33568a.matcher(str);
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            arrayList.add(Integer.valueOf(matcher.start()));
        }
        return C6591c.m29911b(arrayList);
    }
}
