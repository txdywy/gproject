package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.eq;

public final class zzbp implements Parcelable {
    public static final Creator CREATOR = new C5291u();
    public static final int[] f26477d = new int[eq.FLAG_MOVED];
    public final String f26478a;
    public final int f26479b;
    public final int[] f26480c;

    public zzbp(Parcel parcel) {
        this.f26478a = parcel.readString();
        this.f26479b = parcel.readInt();
        this.f26480c = parcel.createIntArray();
    }

    public zzbp(String str, int i) {
        this.f26478a = str;
        this.f26479b = i;
        if (this.f26479b == 3) {
            this.f26480c = m24175a(str);
        } else {
            this.f26480c = null;
        }
    }

    private static boolean m24174a(int i) {
        return i == -8 || i == -7 || i == -6 || i == -5;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized int[] m24175a(java.lang.String r13) {
        /*
        r8 = com.google.android.gms.instantapps.internal.zzbp.class;
        monitor-enter(r8);
        r1 = 0;
        r9 = r13.length();	 Catch:{ all -> 0x001b }
        r7 = 0;
        r6 = 0;
        r4 = 0;
        r3 = 0;
        r5 = r6;
    L_0x000d:
        if (r1 >= r9) goto L_0x01eb;
    L_0x000f:
        r0 = 2045; // 0x7fd float:2.866E-42 double:1.0104E-320;
        if (r7 <= r0) goto L_0x001e;
    L_0x0013:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001b }
        r1 = "Pattern is too large!";
        r0.<init>(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ all -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x001e:
        r0 = r13.charAt(r1);	 Catch:{ all -> 0x001b }
        r2 = 0;
        switch(r0) {
            case 42: goto L_0x00cd;
            case 43: goto L_0x00f6;
            case 46: goto L_0x011f;
            case 91: goto L_0x0042;
            case 92: goto L_0x0132;
            case 93: goto L_0x0065;
            case 123: goto L_0x008d;
            case 125: goto L_0x00b9;
            default: goto L_0x0026;
        };	 Catch:{ all -> 0x001b }
    L_0x0026:
        r2 = 1;
        r6 = r5;
        r5 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r1;
        r1 = r2;
        r2 = r7;
    L_0x002e:
        if (r6 == 0) goto L_0x0178;
    L_0x0030:
        if (r0 == 0) goto L_0x0146;
    L_0x0032:
        r0 = f26477d;	 Catch:{ all -> 0x001b }
        r1 = r2 + 1;
        r0[r2] = r4;	 Catch:{ all -> 0x001b }
        r0 = 0;
        r2 = r3;
    L_0x003a:
        r2 = r2 + 1;
        r3 = r0;
        r4 = r5;
        r7 = r1;
        r5 = r6;
        r1 = r2;
        goto L_0x000d;
    L_0x0042:
        if (r5 != 0) goto L_0x0026;
    L_0x0044:
        r0 = r1 + 1;
        r0 = r13.charAt(r0);	 Catch:{ all -> 0x001b }
        r2 = 94;
        if (r0 != r2) goto L_0x005d;
    L_0x004e:
        r2 = f26477d;	 Catch:{ all -> 0x001b }
        r0 = r7 + 1;
        r5 = -2;
        r2[r7] = r5;	 Catch:{ all -> 0x001b }
        r1 = r1 + 1;
    L_0x0057:
        r1 = r1 + 1;
        r6 = 1;
        r5 = r6;
        r7 = r0;
        goto L_0x000d;
    L_0x005d:
        r2 = f26477d;	 Catch:{ all -> 0x001b }
        r0 = r7 + 1;
        r5 = -1;
        r2[r7] = r5;	 Catch:{ all -> 0x001b }
        goto L_0x0057;
    L_0x0065:
        if (r5 == 0) goto L_0x0026;
    L_0x0067:
        r3 = f26477d;	 Catch:{ all -> 0x001b }
        r5 = r7 + -1;
        r3 = r3[r5];	 Catch:{ all -> 0x001b }
        r5 = -1;
        if (r3 == r5) goto L_0x0073;
    L_0x0070:
        r5 = -2;
        if (r3 != r5) goto L_0x007b;
    L_0x0073:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001b }
        r1 = "You must define characters in a set.";
        r0.<init>(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ all -> 0x001b }
    L_0x007b:
        r3 = f26477d;	 Catch:{ all -> 0x001b }
        r6 = r7 + 1;
        r5 = -3;
        r3[r7] = r5;	 Catch:{ all -> 0x001b }
        r5 = 0;
        r3 = 0;
        r12 = r2;
        r2 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r1;
        r1 = r12;
        goto L_0x002e;
    L_0x008d:
        if (r5 != 0) goto L_0x0201;
    L_0x008f:
        if (r7 == 0) goto L_0x009d;
    L_0x0091:
        r4 = f26477d;	 Catch:{ all -> 0x001b }
        r6 = r7 + -1;
        r4 = r4[r6];	 Catch:{ all -> 0x001b }
        r4 = m24174a(r4);	 Catch:{ all -> 0x001b }
        if (r4 == 0) goto L_0x00a5;
    L_0x009d:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001b }
        r1 = "Modifier must follow a token.";
        r0.<init>(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ all -> 0x001b }
    L_0x00a5:
        r6 = f26477d;	 Catch:{ all -> 0x001b }
        r4 = r7 + 1;
        r10 = -5;
        r6[r7] = r10;	 Catch:{ all -> 0x001b }
        r6 = r1 + 1;
        r1 = 1;
        r12 = r2;
        r2 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r6;
        r6 = r5;
        r5 = r1;
        r1 = r12;
        goto L_0x002e;
    L_0x00b9:
        if (r4 == 0) goto L_0x0201;
    L_0x00bb:
        r4 = f26477d;	 Catch:{ all -> 0x001b }
        r6 = r7 + 1;
        r10 = -6;
        r4[r7] = r10;	 Catch:{ all -> 0x001b }
        r4 = 0;
        r12 = r2;
        r2 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r1;
        r1 = r12;
        goto L_0x002e;
    L_0x00cd:
        if (r5 != 0) goto L_0x0201;
    L_0x00cf:
        if (r7 == 0) goto L_0x00dd;
    L_0x00d1:
        r6 = f26477d;	 Catch:{ all -> 0x001b }
        r10 = r7 + -1;
        r6 = r6[r10];	 Catch:{ all -> 0x001b }
        r6 = m24174a(r6);	 Catch:{ all -> 0x001b }
        if (r6 == 0) goto L_0x00e5;
    L_0x00dd:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001b }
        r1 = "Modifier must follow a token.";
        r0.<init>(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ all -> 0x001b }
    L_0x00e5:
        r10 = f26477d;	 Catch:{ all -> 0x001b }
        r6 = r7 + 1;
        r11 = -7;
        r10[r7] = r11;	 Catch:{ all -> 0x001b }
        r12 = r2;
        r2 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r1;
        r1 = r12;
        goto L_0x002e;
    L_0x00f6:
        if (r5 != 0) goto L_0x0201;
    L_0x00f8:
        if (r7 == 0) goto L_0x0106;
    L_0x00fa:
        r6 = f26477d;	 Catch:{ all -> 0x001b }
        r10 = r7 + -1;
        r6 = r6[r10];	 Catch:{ all -> 0x001b }
        r6 = m24174a(r6);	 Catch:{ all -> 0x001b }
        if (r6 == 0) goto L_0x010e;
    L_0x0106:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001b }
        r1 = "Modifier must follow a token.";
        r0.<init>(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ all -> 0x001b }
    L_0x010e:
        r10 = f26477d;	 Catch:{ all -> 0x001b }
        r6 = r7 + 1;
        r11 = -8;
        r10[r7] = r11;	 Catch:{ all -> 0x001b }
        r12 = r2;
        r2 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r1;
        r1 = r12;
        goto L_0x002e;
    L_0x011f:
        if (r5 != 0) goto L_0x0201;
    L_0x0121:
        r10 = f26477d;	 Catch:{ all -> 0x001b }
        r6 = r7 + 1;
        r11 = -4;
        r10[r7] = r11;	 Catch:{ all -> 0x001b }
        r12 = r2;
        r2 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r1;
        r1 = r12;
        goto L_0x002e;
    L_0x0132:
        r0 = r1 + 1;
        if (r0 < r9) goto L_0x013e;
    L_0x0136:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001b }
        r1 = "Escape found at end of pattern!";
        r0.<init>(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ all -> 0x001b }
    L_0x013e:
        r1 = r1 + 1;
        r0 = r13.charAt(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0026;
    L_0x0146:
        r1 = r3 + 2;
        if (r1 >= r9) goto L_0x0169;
    L_0x014a:
        r1 = r3 + 1;
        r1 = r13.charAt(r1);	 Catch:{ all -> 0x001b }
        r7 = 45;
        if (r1 != r7) goto L_0x0169;
    L_0x0154:
        r1 = r3 + 2;
        r1 = r13.charAt(r1);	 Catch:{ all -> 0x001b }
        r7 = 93;
        if (r1 == r7) goto L_0x0169;
    L_0x015e:
        r0 = 1;
        r7 = f26477d;	 Catch:{ all -> 0x001b }
        r1 = r2 + 1;
        r7[r2] = r4;	 Catch:{ all -> 0x001b }
        r2 = r3 + 1;
        goto L_0x003a;
    L_0x0169:
        r1 = f26477d;	 Catch:{ all -> 0x001b }
        r7 = r2 + 1;
        r1[r2] = r4;	 Catch:{ all -> 0x001b }
        r2 = f26477d;	 Catch:{ all -> 0x001b }
        r1 = r7 + 1;
        r2[r7] = r4;	 Catch:{ all -> 0x001b }
        r2 = r3;
        goto L_0x003a;
    L_0x0178:
        if (r5 == 0) goto L_0x01e0;
    L_0x017a:
        r1 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r4 = r13.indexOf(r1, r3);	 Catch:{ all -> 0x001b }
        if (r4 >= 0) goto L_0x018a;
    L_0x0182:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001b }
        r1 = "Range not ended with '}'";
        r0.<init>(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ all -> 0x001b }
    L_0x018a:
        r3 = r13.substring(r3, r4);	 Catch:{ all -> 0x001b }
        r1 = 44;
        r7 = r3.indexOf(r1);	 Catch:{ all -> 0x001b }
        if (r7 >= 0) goto L_0x01ae;
    L_0x0196:
        r1 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x01a5 }
        r3 = r1;
    L_0x019b:
        if (r1 <= r3) goto L_0x01ce;
    L_0x019d:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ NumberFormatException -> 0x01a5 }
        r1 = "Range quantifier minimum is greater than maximum";
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x01a5 }
        throw r0;	 Catch:{ NumberFormatException -> 0x01a5 }
    L_0x01a5:
        r0 = move-exception;
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001b }
        r2 = "Range number format incorrect";
        r1.<init>(r2, r0);	 Catch:{ all -> 0x001b }
        throw r1;	 Catch:{ all -> 0x001b }
    L_0x01ae:
        r1 = 0;
        r1 = r3.substring(r1, r7);	 Catch:{ NumberFormatException -> 0x01a5 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x01a5 }
        r10 = r3.length();	 Catch:{ NumberFormatException -> 0x01a5 }
        r10 = r10 + -1;
        if (r7 != r10) goto L_0x01c3;
    L_0x01bf:
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x019b;
    L_0x01c3:
        r7 = r7 + 1;
        r3 = r3.substring(r7);	 Catch:{ NumberFormatException -> 0x01a5 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x01a5 }
        goto L_0x019b;
    L_0x01ce:
        r7 = f26477d;	 Catch:{ NumberFormatException -> 0x01a5 }
        r10 = r2 + 1;
        r7[r2] = r1;	 Catch:{ NumberFormatException -> 0x01a5 }
        r1 = f26477d;	 Catch:{ NumberFormatException -> 0x01a5 }
        r7 = r10 + 1;
        r1[r10] = r3;	 Catch:{ NumberFormatException -> 0x01a5 }
        r3 = r0;
        r1 = r4;
        r4 = r5;
        r5 = r6;
        goto L_0x000d;
    L_0x01e0:
        if (r1 == 0) goto L_0x01fd;
    L_0x01e2:
        r7 = f26477d;	 Catch:{ all -> 0x001b }
        r1 = r2 + 1;
        r7[r2] = r4;	 Catch:{ all -> 0x001b }
        r2 = r3;
        goto L_0x003a;
    L_0x01eb:
        if (r5 == 0) goto L_0x01f5;
    L_0x01ed:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001b }
        r1 = "Set was not terminated!";
        r0.<init>(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ all -> 0x001b }
    L_0x01f5:
        r0 = f26477d;	 Catch:{ all -> 0x001b }
        r0 = java.util.Arrays.copyOf(r0, r7);	 Catch:{ all -> 0x001b }
        monitor-exit(r8);
        return r0;
    L_0x01fd:
        r1 = r2;
        r2 = r3;
        goto L_0x003a;
    L_0x0201:
        r6 = r5;
        r5 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r1;
        r1 = r2;
        r2 = r7;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.instantapps.internal.zzbp.a(java.lang.String):int[]");
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "? ";
        switch (this.f26479b) {
            case 0:
                str = "LITERAL: ";
                break;
            case 1:
                str = "PREFIX: ";
                break;
            case 2:
                str = "GLOB: ";
                break;
            case 3:
                str = "ADVANCED: ";
                break;
        }
        String str2 = this.f26478a;
        return new StringBuilder((String.valueOf(str).length() + 16) + String.valueOf(str2).length()).append("PatternMatcher{").append(str).append(str2).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26478a);
        parcel.writeInt(this.f26479b);
        parcel.writeIntArray(this.f26480c);
    }
}
