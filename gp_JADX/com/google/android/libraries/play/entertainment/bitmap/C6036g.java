package com.google.android.libraries.play.entertainment.bitmap;

import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class C6036g {
    public final String f30143a;
    public final List f30144b;

    public C6036g(String str, C6032d... c6032dArr) {
        List emptyList;
        this.f30143a = (String) C6116b.m28099a((CharSequence) str);
        C6116b.m28105a((Object[]) c6032dArr);
        if (c6032dArr.length == 0) {
            emptyList = Collections.emptyList();
        } else if (c6032dArr.length == 1) {
            emptyList = Collections.singletonList(c6032dArr[0]);
        } else {
            emptyList = Collections.unmodifiableList(Arrays.asList(c6032dArr));
        }
        this.f30144b = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6036g)) {
            return false;
        }
        C6036g c6036g = (C6036g) obj;
        if (this.f30143a.equals(c6036g.f30143a) && this.f30144b.equals(c6036g.f30144b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30143a.hashCode() * 31) + this.f30144b.hashCode();
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("BitmapRequest{u=").append(this.f30143a);
        if (!this.f30144b.isEmpty()) {
            append.append(",t=").append(this.f30144b);
        }
        return append.append('}').toString();
    }
}
