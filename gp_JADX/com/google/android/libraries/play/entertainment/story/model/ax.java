package com.google.android.libraries.play.entertainment.story.model;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.p013b.C0268a;
import android.support.v4.p028a.p029a.C0206f;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6087f;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.SnippetView;
import com.squareup.haha.perflib.HprofParser;

public abstract class ax {
    public static final int[] f30555e = new int[]{C6089g.background_panel};
    public static final int[] f30556f = new int[]{C6089g.panel_title, C6089g.title};
    public static final int[] f30557g = new int[0];
    public final int f30558h;

    ax(int i) {
        this.f30558h = i;
    }

    public abstract Object mo5329a(View view, C6164u c6164u);

    public abstract void mo5330a(av avVar, Object obj, C2980a c2980a, C6164u c6164u);

    public abstract void mo5331a(Object obj);

    public void mo5332b(Object obj) {
    }

    protected static int m28359a(av avVar) {
        if (Color.alpha(avVar.f30539r) != HprofParser.ROOT_UNKNOWN) {
            return -13154481;
        }
        if (C0268a.m1539a(avVar.f30539r) <= 0.03d) {
            return C0268a.m1540a(553648127, avVar.f30539r);
        }
        return C0268a.m1540a(536870912, avVar.f30539r);
    }

    protected static void m28360a(av avVar, C6121g c6121g, int[] iArr, int[] iArr2, int[] iArr3, int i) {
        int i2;
        SnippetView snippetView;
        int i3 = 0;
        for (int i22 : iArr) {
            View view = (View) c6121g.m28129b(View.class, i22);
            if (view != null) {
                view.setBackgroundColor(avVar.f30539r);
            }
        }
        for (int i222 : iArr2) {
            TextView textView = (TextView) c6121g.m28129b(TextView.class, i222);
            if (textView != null) {
                textView.setTextColor(avVar.f30537p);
            }
        }
        int length = iArr3.length;
        while (i3 < length) {
            textView = (TextView) c6121g.m28129b(TextView.class, iArr3[i3]);
            if (textView != null) {
                textView.setTextColor(avVar.f30538q);
            }
            i3++;
        }
        if (i != -1) {
            snippetView = (SnippetView) c6121g.m28129b(SnippetView.class, i);
        } else {
            snippetView = null;
        }
        if (snippetView != null) {
            Resources resources = snippetView.getResources();
            if (avVar.f30537p == -16777216) {
                i222 = C6087f.play_highlight_overlay_light;
            } else {
                i222 = C6087f.play_highlight_overlay_dark;
            }
            snippetView.setForeground(C0206f.m1065a(resources, i222, snippetView.getContext().getTheme()));
            snippetView.setTextColor(avVar.f30538q);
            snippetView.setMoreHintColor(avVar.f30537p);
            snippetView.setEraseColor(avVar.f30539r);
        }
    }
}
