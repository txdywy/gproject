package com.google.android.finsky.bg;

import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.bf;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.bf;
import com.google.android.play.image.w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import java.util.List;

public static class com.google.android.finsky.bg.af
{

    af() {
    }

    public static com.google.android.finsky.cv.a.bd a(Document p0, int p1, int p2, int[] p3) {
        v0 = 0;
        while (v0 < p3.length) {
            v1 = com.google.android.finsky.bg.af.a(p0.c(p3[v0]), p1, p2);
            if (v1 != 0) {
                v0 = v1;
                return v0;
            }
            v0 = v0 + 1;
        }
        v0 = 0;
        return v0;
    }

    public static com.google.android.finsky.cv.a.bd a(List p0, int p1, int p2) {
  0:    v7 = 2147483647;
  3:    v1 = 0;
  5:    if (p0 == 0) {
 13:        v0 = 0;
 14:        return v0;
        }
 11:    if (p0.size() == 0) {
 13:        v0 = 0;
 14:        return v0;
        }
 20:    if (p0.size() == 1) {
 26:        v0 = (com.google.android.finsky.cv.a.bd)p0.get(0);
 28:        return v0;
        }
 29:    v9 = 0;
 30:    v3 = 0;
 31:    v5 = 0;
 32:    v6 = 0;
 33:    v8 = 2147483647;
 38:    if (v9 >= p0.size()) {
 92:        if (v6 != 0)
 94:            v0 = v6;
 96:        else if (v1 != 0)
 98:            v0 = v1;
            else
104:            v0 = (com.google.android.finsky.cv.a.bd)p0.get(0);
 95:        return v0;
        }
 44:    v0 = (com.google.android.finsky.cv.a.bd)p0.get(v9);
 48:    if (v0.i != 0)
 14:        return v0;
 52:    if (v0.e == 0) goto 107;
 62:    if (v0.e.b >= p1 && v0.e.c >= p2 && v8 >= v0.e.b && v7 >= v0.e.c) {
 70:        v6 = v0;
 71:        v7 = v0.e.c;
 72:        v8 = v0.e.b;
        }
 73:    if (v0.e.b < v5) goto 107;
 75:    if (v0.e.c < v3) goto 107;
 77:    v1 = v0.e.c;
 78:    v3 = v6;
 79:    v5 = v8;
 80:    v2 = v0.e.b;
 81:    v4 = v7;
 84:    v9 = v9 + 1;
 85:    v7 = v4;
 86:    v8 = v5;
 87:    v5 = v2;
 88:    v6 = v3;
 89:    v3 = v1;
 90:    v1 = v0;
 91:    goto 34;
107:    v0 = v1;
108:    v2 = v5;
109:    v4 = v7;
110:    v1 = v3;
111:    v5 = v8;
112:    v3 = v6;
113:    goto 82;
    }

    public static com.google.android.play.image.x a(Context p0, com.google.android.finsky.cv.a.bd p1, com.google.android.play.image.w p2, int p3, int p4, com.google.android.play.image.y p5) {
        if (p1 == 0)
            v0 = 0;
        else {
            v0 = com.google.android.play.image.bf.a(p0) * com.google.android.play.image.bf.a();
            v0 = p2.a(p1.f, (int)((float)p3 * v0), (int)(v0 * (float)p4), 0, p5, 0);
        }
        return v0;
    }

    public static com.google.android.play.image.x a(Context p0, Document p1, com.google.android.play.image.w p2, int p3, int p4, com.google.android.play.image.y p5, int[] p6) {
        if (p1 == 0)
            v0 = 0;
        else
            v0 = com.google.android.finsky.bg.af.a(p0, com.google.android.finsky.bg.af.a(p1, p3, 0, p6), p2, p3, p4, p5);
        return v0;
    }

    public static void a(FifeImageView p0, com.google.android.finsky.cv.a.bd p1) {
        if (p1.e != 0 && p1.e.b > 0 && p1.e.c > 0 && p1.e.b > p1.e.c) {
            v1 = p0.getLayoutParams();
            v1.width = (int)((float)p1.e.b / (float)p1.e.c * (float)v1.height);
            p0.requestLayout();
        }
    }

}
