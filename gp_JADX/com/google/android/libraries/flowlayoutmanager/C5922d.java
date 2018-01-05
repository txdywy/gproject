package com.google.android.libraries.flowlayoutmanager;

import com.squareup.haha.perflib.HprofParser;

final class C5922d {
    public int f29509a;
    public int f29510b;
    public C5926f f29511c;
    public int f29512d;
    public int f29513e;
    public C5927g f29514f;

    C5922d() {
    }

    public final C5926f m27471a() {
        C5926f c5926f = this.f29511c;
        this.f29511c = null;
        return c5926f;
    }

    public final String toString() {
        int i = this.f29509a;
        int i2 = this.f29510b;
        String str = this.f29511c == null ? "null" : "notnull";
        return new StringBuilder(String.valueOf(str).length() + HprofParser.ROOT_REFERENCE_CLEANUP).append("FillState{mHeightFilled=").append(i).append(",mNextAnchorPosition=").append(i2).append(",mNextItem=").append(str).append(",mNextItemPosition=").append(this.f29512d).append(",mNextItemChildIndex=").append(this.f29513e).toString();
    }
}
