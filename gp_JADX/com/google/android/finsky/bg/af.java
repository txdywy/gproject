package com.google.android.finsky.bg;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.bf;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import java.util.List;

public final class af {
    public static bd m9220a(Document document, int i, int i2, int[] iArr) {
        for (int c : iArr) {
            bd a = m9221a(document.m14644c(c), i, i2);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public static bd m9221a(List list, int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        bd bdVar = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return (bd) list.get(0);
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        bd bdVar2 = null;
        int i7 = Integer.MAX_VALUE;
        while (i4 < list.size()) {
            bd bdVar3 = (bd) list.get(i4);
            if (bdVar3.f11863i) {
                return bdVar3;
            }
            int i8;
            int i9;
            int i10;
            bd bdVar4;
            if (bdVar3.f11859e != null) {
                i8 = bdVar3.f11859e.f11878b;
                i9 = bdVar3.f11859e.f11879c;
                if (i8 >= i && i9 >= i2 && r8 >= i8 && r7 >= i9) {
                    bdVar2 = bdVar3;
                    i3 = i9;
                    i7 = i8;
                }
                if (i8 >= i6 && i9 >= i5) {
                    i10 = i9;
                    bdVar4 = bdVar2;
                    i6 = i7;
                    i9 = i8;
                    i8 = i3;
                    i4++;
                    i3 = i8;
                    i7 = i6;
                    i6 = i9;
                    bdVar2 = bdVar4;
                    i5 = i10;
                    bdVar = bdVar3;
                }
            }
            bdVar3 = bdVar;
            i9 = i6;
            i8 = i3;
            i10 = i5;
            i6 = i7;
            bdVar4 = bdVar2;
            i4++;
            i3 = i8;
            i7 = i6;
            i6 = i9;
            bdVar2 = bdVar4;
            i5 = i10;
            bdVar = bdVar3;
        }
        if (bdVar2 != null) {
            return bdVar2;
        }
        if (bdVar != null) {
            return bdVar;
        }
        return (bd) list.get(0);
    }

    public static void m9224a(FifeImageView fifeImageView, bd bdVar) {
        if (bdVar.f11859e != null && bdVar.f11859e.f11878b > 0 && bdVar.f11859e.f11879c > 0 && bdVar.f11859e.f11878b > bdVar.f11859e.f11879c) {
            float f = ((float) bdVar.f11859e.f11878b) / ((float) bdVar.f11859e.f11879c);
            LayoutParams layoutParams = fifeImageView.getLayoutParams();
            layoutParams.width = (int) (f * ((float) layoutParams.height));
            fifeImageView.requestLayout();
        }
    }

    public static x m9223a(Context context, Document document, C1294w c1294w, int i, int i2, y yVar, int[] iArr) {
        if (document == null) {
            return null;
        }
        return m9222a(context, m9220a(document, i, 0, iArr), c1294w, i, i2, yVar);
    }

    public static x m9222a(Context context, bd bdVar, C1294w c1294w, int i, int i2, y yVar) {
        if (bdVar == null) {
            return null;
        }
        float a = bf.a(context) * bf.a();
        int i3 = (int) (((float) i) * a);
        int i4 = (int) (a * ((float) i2));
        return c1294w.mo1672a(bdVar.f11860f, i3, i4, false, yVar, false);
    }
}
