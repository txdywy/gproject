package com.google.android.wallet.ui.card;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.ui.common.bo;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.cv;
import java.util.List;

final class C6745l implements bo {
    public final /* synthetic */ int f33278a;
    public final /* synthetic */ int f33279b;
    public final /* synthetic */ C6652j f33280c;

    C6745l(C6652j c6652j, int i, int i2) {
        this.f33280c = c6652j;
        this.f33278a = i;
        this.f33279b = i2;
    }

    public final void mo5563a(View view) {
        cv cvVar = this.f33280c;
        int i = this.f33278a;
        int i2 = this.f33279b;
        if (cvVar.ao == null || cvVar.ao.j.length == 0) {
            throw new IllegalStateException("Reveal transitions should not be triggered when no subforms are visible.");
        }
        int[] iArr = cvVar.ao.j;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5;
            int i6 = iArr[i3];
            if (i6 == i) {
                List list = (List) cvVar.f32852h.get(i6);
                if (list.contains(Integer.valueOf(i2))) {
                    int childCount;
                    list.remove(Integer.valueOf(i2));
                    int[] iArr2 = cvVar.f32853i;
                    iArr2[i6] = iArr2[i6] + 1;
                    int size = i6 == cvVar.ao.j[0] ? cvVar.al.size() : 0;
                    ViewGroup viewGroup = (ViewGroup) cvVar.f32847c.get(i6);
                    if (list.isEmpty()) {
                        childCount = (viewGroup.getChildCount() + size) - 1;
                        i5 = 1;
                    } else {
                        childCount = ((Integer) list.get(0)).intValue();
                        i5 = 0;
                    }
                    if (i2 + 1 >= size) {
                        for (i6 = i2 + 1; i6 <= childCount; i6++) {
                            ci.m30855a(viewGroup.getChildAt(i6 - size), 0);
                        }
                        if (i5 == 0) {
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot reveal a collapsed view");
                    }
                }
                return;
            }
            if (i4 != 0) {
                ci.m30855a((ViewGroup) cvVar.f32847c.get(i6), 0);
                if (!((List) cvVar.f32852h.get(i6)).isEmpty()) {
                    break;
                }
            }
            i5 = i4;
            i3++;
            i4 = i5;
        }
        cvVar.mo5469a(1, Bundle.EMPTY);
    }
}
