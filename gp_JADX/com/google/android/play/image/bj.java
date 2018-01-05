package com.google.android.play.image;

final class bj extends bn {
    public final /* synthetic */ bi f32064a;

    bj(bi biVar, bh bhVar, CharSequence charSequence) {
        this.f32064a = biVar;
        super(bhVar, charSequence);
    }

    public final int mo5408a(int i) {
        int length = this.f32064a.f32058a.length();
        int length2 = this.d.length() - length;
        int i2 = i;
        while (i2 <= length2) {
            int i3 = 0;
            while (i3 < length) {
                if (this.d.charAt(i3 + i2) == this.f32064a.f32058a.charAt(i3)) {
                    i3++;
                } else {
                    i2++;
                }
            }
            return i2;
        }
        return -1;
    }

    public final int mo5409b(int i) {
        return this.f32064a.f32058a.length() + i;
    }
}
