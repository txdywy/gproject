package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.internal.xg;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

public class LogEventParcelable extends zza {
    public static final Creator CREATOR = new C5049v();
    public PlayLoggerContext f25509a;
    public byte[] f25510b;
    public int[] f25511c;
    public String[] f25512d;
    public int[] f25513e;
    public byte[][] f25514f;
    public ExperimentTokens[] f25515g;
    public boolean f25516h;
    public final xg f25517i;
    public final C5016d f25518j;
    public final C5016d f25519k;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, xg xgVar, C5016d c5016d, C5016d c5016d2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, ExperimentTokens[] experimentTokensArr, boolean z) {
        this.f25509a = playLoggerContext;
        this.f25517i = xgVar;
        this.f25518j = c5016d;
        this.f25519k = c5016d2;
        this.f25511c = iArr;
        this.f25512d = strArr;
        this.f25513e = iArr2;
        this.f25514f = bArr;
        this.f25515g = experimentTokensArr;
        this.f25516h = z;
    }

    LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.f25509a = playLoggerContext;
        this.f25510b = bArr;
        this.f25511c = iArr;
        this.f25512d = strArr;
        this.f25517i = null;
        this.f25518j = null;
        this.f25519k = null;
        this.f25513e = iArr2;
        this.f25514f = bArr2;
        this.f25515g = experimentTokensArr;
        this.f25516h = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return ad.m23722a(this.f25509a, logEventParcelable.f25509a) && Arrays.equals(this.f25510b, logEventParcelable.f25510b) && Arrays.equals(this.f25511c, logEventParcelable.f25511c) && Arrays.equals(this.f25512d, logEventParcelable.f25512d) && ad.m23722a(this.f25517i, logEventParcelable.f25517i) && ad.m23722a(this.f25518j, logEventParcelable.f25518j) && ad.m23722a(this.f25519k, logEventParcelable.f25519k) && Arrays.equals(this.f25513e, logEventParcelable.f25513e) && Arrays.deepEquals(this.f25514f, logEventParcelable.f25514f) && Arrays.equals(this.f25515g, logEventParcelable.f25515g) && this.f25516h == logEventParcelable.f25516h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25509a, this.f25510b, this.f25511c, this.f25512d, this.f25517i, this.f25518j, this.f25519k, this.f25513e, this.f25514f, this.f25515g, Boolean.valueOf(this.f25516h)});
    }

    public String toString() {
        return "LogEventParcelable[" + this.f25509a + ", LogEventBytes: " + (this.f25510b == null ? null : new String(this.f25510b)) + ", TestCodes: " + Arrays.toString(this.f25511c) + ", MendelPackages: " + Arrays.toString(this.f25512d) + ", LogEvent: " + this.f25517i + ", ExtensionProducer: " + this.f25518j + ", VeProducer: " + this.f25519k + ", ExperimentIDs: " + Arrays.toString(this.f25513e) + ", ExperimentTokens: " + Arrays.toString(this.f25514f) + ", ExperimentTokensParcelables: " + Arrays.toString(this.f25515g) + ", AddPhenotypeExperimentTokens: " + this.f25516h + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23842a(parcel, 2, this.f25509a, i);
        C5130b.m23847a(parcel, 3, this.f25510b);
        C5130b.m23848a(parcel, 4, this.f25511c);
        C5130b.m23850a(parcel, 5, this.f25512d);
        C5130b.m23848a(parcel, 6, this.f25513e);
        C5130b.m23851a(parcel, 7, this.f25514f);
        C5130b.m23846a(parcel, 8, this.f25516h);
        C5130b.m23849a(parcel, 9, this.f25515g, i);
        C5130b.m23853b(parcel, a);
    }
}
