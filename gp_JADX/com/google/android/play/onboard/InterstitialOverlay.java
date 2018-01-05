package com.google.android.play.onboard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.play.C6361i;
import com.google.android.play.d;
import com.google.android.play.g;
import com.google.android.play.widget.C6455a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class InterstitialOverlay extends FrameLayout {
    public static final int[] f32262a = new int[]{d.play_onboard_accent_color_a, d.play_onboard_accent_color_b, d.play_onboard_accent_color_c, d.play_onboard_accent_color_d};
    public List f32263b;
    public int[] f32264c;
    public final Random f32265d;

    public InterstitialOverlay(Context context) {
        this(context, null);
    }

    public InterstitialOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InterstitialOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32265d = new Random();
    }

    protected void onAttachedToWindow() {
        int i = 0;
        super.onAttachedToWindow();
        if (this.f32263b == null) {
            C6403e c6404a = new C6404a(getResources().getString(C6361i.play_onboard_interstitial_grid_cell));
            Collection arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            arrayList2.add(this);
            while (!arrayList2.isEmpty()) {
                View view = (View) arrayList2.remove(0);
                if (c6404a.mo5424a(view)) {
                    arrayList.add(view);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        arrayList2.add(viewGroup.getChildAt(i2));
                    }
                }
            }
            if (this.f32264c == null || this.f32264c.length == 0) {
                m29340a(getContext(), f32262a);
            }
            List arrayList3 = new ArrayList(arrayList.size());
            ArrayList arrayList4 = (ArrayList) arrayList;
            int size = arrayList4.size();
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                View view2 = (View) obj;
                Drawable c6455a = new C6455a(this.f32264c[this.f32265d.nextInt(this.f32264c.length)], (long) this.f32265d.nextInt(800));
                if (VERSION.SDK_INT < 16) {
                    view2.setBackgroundDrawable(c6455a);
                } else {
                    view2.setBackground(c6455a);
                }
                arrayList3.add(c6455a);
            }
            this.f32263b = arrayList3;
        }
        m29339a();
    }

    protected void onDetachedFromWindow() {
        for (C6455a stop : this.f32263b) {
            stop.stop();
        }
        super.onDetachedFromWindow();
    }

    private final void m29339a() {
        for (C6455a start : this.f32263b) {
            start.start();
        }
    }

    public void setCaption(CharSequence charSequence) {
        ((TextView) findViewById(g.caption)).setText(charSequence);
    }

    public void setCaption(int i) {
        ((TextView) findViewById(g.caption)).setText(i);
    }

    protected void setColors(int[] iArr) {
        this.f32264c = iArr;
    }

    private final void m29340a(Context context, int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        Resources resources = context.getResources();
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColors(iArr2);
    }
}
