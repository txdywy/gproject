package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.detailspage.TextModule.ExpandedData;
import java.util.List;

public final class ge extends C2600d {
    public int f14616a;
    public int f14617b;
    public CharSequence f14618c;
    public int f14619d;
    public boolean f14620e;
    public String f14621f;
    public CharSequence f14622g;
    public CharSequence f14623h;
    public CharSequence f14624i;
    public boolean f14625j;
    public ac f14626k;
    public List f14627l;
    public List f14628m;
    public Integer f14629n;
    public ExpandedData f14630o;

    protected ge() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ge geVar = (ge) obj;
        if (this.f14616a != geVar.f14616a) {
            return false;
        }
        if (this.f14617b != geVar.f14617b) {
            return false;
        }
        if (this.f14619d != geVar.f14619d) {
            return false;
        }
        if (this.f14620e != geVar.f14620e) {
            return false;
        }
        if (this.f14625j != geVar.f14625j) {
            return false;
        }
        if (this.f14618c == null ? geVar.f14618c != null : !this.f14618c.equals(geVar.f14618c)) {
            return false;
        }
        if (this.f14621f == null ? geVar.f14621f != null : !this.f14621f.equals(geVar.f14621f)) {
            return false;
        }
        if (!TextUtils.equals(this.f14622g, geVar.f14622g)) {
            return false;
        }
        if (!TextUtils.equals(this.f14623h, geVar.f14623h)) {
            return false;
        }
        if (!TextUtils.equals(this.f14624i, geVar.f14624i)) {
            return false;
        }
        if (this.f14626k == null ? geVar.f14626k != null : !this.f14626k.equals(geVar.f14626k)) {
            return false;
        }
        if (this.f14627l == null ? geVar.f14627l != null : !this.f14627l.equals(geVar.f14627l)) {
            return false;
        }
        if (this.f14628m == null ? geVar.f14628m != null : !this.f14628m.equals(geVar.f14628m)) {
            return false;
        }
        if (this.f14629n == null ? geVar.f14629n != null : !this.f14629n.equals(geVar.f14629n)) {
            return false;
        }
        if (this.f14630o != null) {
            if (this.f14630o.equals(geVar.f14630o)) {
                return true;
            }
        } else if (geVar.f14630o == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        int i3 = 0;
        int hashCode = ((((this.f14618c != null ? this.f14618c.hashCode() : 0) + (((this.f14616a * 31) + this.f14617b) * 31)) * 31) + this.f14619d) * 31;
        if (this.f14620e) {
            i = 1;
        } else {
            i = 0;
        }
        hashCode = (i + hashCode) * 31;
        if (this.f14621f != null) {
            i = this.f14621f.hashCode();
        } else {
            i = 0;
        }
        hashCode = (i + hashCode) * 31;
        if (this.f14622g != null) {
            i = this.f14622g.hashCode();
        } else {
            i = 0;
        }
        hashCode = (i + hashCode) * 31;
        if (this.f14623h != null) {
            i = this.f14623h.hashCode();
        } else {
            i = 0;
        }
        hashCode = (i + hashCode) * 31;
        if (this.f14624i != null) {
            i = this.f14624i.hashCode();
        } else {
            i = 0;
        }
        i = (i + hashCode) * 31;
        if (!this.f14625j) {
            i2 = 0;
        }
        i2 = (i + i2) * 31;
        if (this.f14626k != null) {
            i = this.f14626k.hashCode();
        } else {
            i = 0;
        }
        i2 = (i + i2) * 31;
        if (this.f14627l != null) {
            i = this.f14627l.hashCode();
        } else {
            i = 0;
        }
        i2 = (i + i2) * 31;
        if (this.f14628m != null) {
            i = this.f14628m.hashCode();
        } else {
            i = 0;
        }
        i2 = (i + i2) * 31;
        if (this.f14629n != null) {
            i = this.f14629n.hashCode();
        } else {
            i = 0;
        }
        i = (i + i2) * 31;
        if (this.f14630o != null) {
            i3 = this.f14630o.hashCode();
        }
        return i + i3;
    }
}
