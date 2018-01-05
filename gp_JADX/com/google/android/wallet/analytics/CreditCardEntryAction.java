package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class CreditCardEntryAction implements Parcelable {
    public static final Creator CREATOR = new C6498f();
    public boolean f32505a;
    public int f32506b;
    public boolean f32507c;
    public boolean f32508d;
    public boolean f32509e;
    public boolean f32510f;
    public int f32511g;
    public boolean f32512h;
    public boolean f32513i;
    public boolean f32514j;
    public boolean f32515k;
    public int f32516l;
    public boolean f32517m;
    public boolean f32518n;
    public boolean f32519o;
    public long f32520p;
    public boolean f32521q;
    public boolean f32522r;
    public int f32523s = -1;
    public int f32524t;
    public int f32525u = -1;
    public int f32526v;
    public int f32527w;
    public int f32528x;
    public int f32529y;

    CreditCardEntryAction(Parcel parcel) {
        this.f32505a = m29534a(parcel);
        this.f32506b = parcel.readInt();
        this.f32507c = m29534a(parcel);
        this.f32508d = m29534a(parcel);
        this.f32509e = m29534a(parcel);
        this.f32510f = m29534a(parcel);
        this.f32511g = parcel.readInt();
        this.f32512h = m29534a(parcel);
        this.f32513i = m29534a(parcel);
        this.f32514j = m29534a(parcel);
        this.f32515k = m29534a(parcel);
        this.f32516l = parcel.readInt();
        this.f32517m = m29534a(parcel);
        this.f32518n = m29534a(parcel);
        this.f32519o = m29534a(parcel);
        this.f32520p = parcel.readLong();
        this.f32521q = m29534a(parcel);
        this.f32522r = m29534a(parcel);
        this.f32523s = parcel.readInt();
        this.f32524t = parcel.readInt();
        this.f32525u = parcel.readInt();
        this.f32526v = parcel.readInt();
        this.f32527w = parcel.readInt();
        this.f32528x = parcel.readInt();
        this.f32529y = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        m29533a(parcel, this.f32505a);
        parcel.writeInt(this.f32506b);
        m29533a(parcel, this.f32507c);
        m29533a(parcel, this.f32508d);
        m29533a(parcel, this.f32509e);
        m29533a(parcel, this.f32510f);
        parcel.writeInt(this.f32511g);
        m29533a(parcel, this.f32512h);
        m29533a(parcel, this.f32513i);
        m29533a(parcel, this.f32514j);
        m29533a(parcel, this.f32515k);
        parcel.writeInt(this.f32516l);
        m29533a(parcel, this.f32517m);
        m29533a(parcel, this.f32518n);
        m29533a(parcel, this.f32519o);
        parcel.writeLong(this.f32520p);
        m29533a(parcel, this.f32521q);
        m29533a(parcel, this.f32522r);
        parcel.writeInt(this.f32523s);
        parcel.writeInt(this.f32524t);
        parcel.writeInt(this.f32525u);
        parcel.writeInt(this.f32526v);
        parcel.writeInt(this.f32527w);
        parcel.writeInt(this.f32528x);
        parcel.writeInt(this.f32529y);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append("panOcrEnabled: ").append(this.f32505a).append("\npanEntryType: ").append(this.f32506b).append("\npanRecognizedByOcr: ").append(this.f32507c).append("\npanValidationErrorOccurred: ").append(this.f32508d).append("\npanRecognizedByNfc: ").append(this.f32509e).append("\nexpDateOcrEnabled: ").append(this.f32510f).append("\nexpDateEntryType: ").append(this.f32511g).append("\nexpDateRecognizedByOcr: ").append(this.f32512h).append("\nexpDateValidationErrorOccurred: ").append(this.f32513i).append("\nexpDateRecognizedByNfc: ").append(this.f32514j).append("\nnameOcrEnabled: ").append(this.f32515k).append("\nnameEntryType: ").append(this.f32516l).append("\nnameRecognizedByOcr: ").append(this.f32517m).append("\nnameValidationErrorOccurred: ").append(this.f32518n).append("\nnameRecognizedByNfc: ").append(this.f32519o).append("\nnfcElapsedTimeMillis: ").append(this.f32520p).append("\nnfcFeatureEnabled: ").append(this.f32521q).append("\nnfcAdapterEnabled: ").append(this.f32522r).append("\nnumOcrAttempts: ").append(this.f32523s).append("\nocrExitReason: ").append(this.f32524t).append("\nnumNfcAttempts: ").append(this.f32525u).append("\nnfcExitReason: ").append(this.f32526v).append("\nnfcErrorReason: ").append(this.f32527w).append("\ncameraInputPreference: ").append(this.f32528x).append("\nnfcInputPreference: ").append(this.f32529y);
        return stringBuilder.toString();
    }

    private static void m29533a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    private static boolean m29534a(Parcel parcel) {
        return parcel.readInt() == 1;
    }
}
