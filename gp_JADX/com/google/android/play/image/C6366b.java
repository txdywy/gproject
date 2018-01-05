package com.google.android.play.image;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

public final class C6366b implements C6364u {
    public final int f32040a;
    public final C6367c f32041b;

    public C6366b(int i, int i2) {
        this.f32041b = new C6367c(i);
        this.f32040a = i2;
    }

    public final void mo5397a(String str, int i, int i2, Bitmap bitmap) {
        if (bitmap.getHeight() * bitmap.getRowBytes() <= this.f32040a) {
            ArrayList arrayList;
            ArrayList arrayList2 = (ArrayList) this.f32041b.b(str);
            if (arrayList2 == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = arrayList2;
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int width = ((C6381v) arrayList.get(i3)).f32131a.getWidth();
                int width2 = bitmap.getWidth();
                if (width >= width2) {
                    if (width == width2) {
                        arrayList.remove(i3);
                    }
                    arrayList.add(i3, new C6381v(bitmap, i, i2));
                    this.f32041b.a(str, arrayList);
                }
                i3++;
            }
            i3 = size;
            arrayList.add(i3, new C6381v(bitmap, i, i2));
            this.f32041b.a(str, arrayList);
        }
    }

    public final C6381v mo5395a(String str, int i, int i2) {
        List list = (List) this.f32041b.a(str);
        if (list == null) {
            return null;
        }
        Object obj = i != 0 ? 1 : null;
        Object obj2;
        if (i2 != 0) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        C6381v c6381v = null;
        int i3 = 0;
        while (i3 < list.size()) {
            C6381v c6381v2 = (C6381v) list.get(i3);
            if (c6381v2.f32132b == i && c6381v2.f32133c == i2) {
                return c6381v2;
            }
            if (c6381v != null || ((obj != null && c6381v2.f32131a.getWidth() < i) || (r2 != null && c6381v2.f32131a.getHeight() < i2))) {
                c6381v2 = c6381v;
            }
            i3++;
            c6381v = c6381v2;
        }
        if (c6381v != null) {
            return c6381v;
        }
        return (C6381v) list.get(list.size() - 1);
    }

    public final void mo5396a() {
        this.f32041b.a(-1);
    }
}
