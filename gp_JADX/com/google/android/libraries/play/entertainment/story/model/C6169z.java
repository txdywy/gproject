package com.google.android.libraries.play.entertainment.story.model;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6071d;
import com.google.android.libraries.play.entertainment.C6072e;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6120f;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.play.utils.C6325i;
import com.google.wireless.android.finsky.dfe.g.a.ai;

final class C6169z extends bc {
    public static final C6090b f30674a = C6090b.m28050a();
    public static final ax f30675b = new C6169z();

    private C6169z() {
        super(C6091h.cluster_single_media);
    }

    public final C6121g mo5335b(View view, C6164u c6164u) {
        return super.mo5335b(view, c6164u).m28116a(view, C6089g.image_frame, FrameLayout.class).m28116a(view, C6089g.text_container, LinearLayout.class).m28116a(view, C6089g.acquisition_text, TextView.class).m28116a(view, C6089g.subtitle, TextView.class);
    }

    protected final void mo5344a(C6121g c6121g, OnClickListener onClickListener) {
        super.mo5344a(c6121g, onClickListener);
        ((View) c6121g.m28117a(View.class, C6089g.background_panel)).setOnClickListener(onClickListener);
    }

    public final void mo5333a(bb bbVar, C6121g c6121g, C2980a c2980a, C6164u c6164u) {
        float f;
        super.mo5333a(bbVar, c6121g, c2980a, c6164u);
        View view = (View) c6121g.m28117a(View.class, C6089g.image_media);
        Resources resources = view.getResources();
        LayoutParams layoutParams = view.getLayoutParams();
        aa c = bbVar.m28354c();
        c.m28358a();
        int a = C6169z.m28484a(c.f30553e);
        if (a == 0) {
            a = C6169z.m28484a(bbVar.f30545y);
        }
        layoutParams.height = resources.getDimensionPixelSize(a);
        view.setLayoutParams(layoutParams);
        ax.m28360a(bbVar, c6121g, g, f, g, -1);
        view = (View) c6121g.m28117a(View.class, C6089g.background_panel);
        TextView textView = (TextView) c6121g.m28117a(TextView.class, C6089g.title);
        TextView textView2 = (TextView) c6121g.m28117a(TextView.class, C6089g.subtitle);
        TextView textView3 = (TextView) c6121g.m28117a(TextView.class, C6089g.acquisition_text);
        LinearLayout linearLayout = (LinearLayout) c6121g.m28117a(LinearLayout.class, C6089g.text_container);
        FrameLayout frameLayout = (FrameLayout) c6121g.m28117a(FrameLayout.class, C6089g.image_frame);
        int i = bbVar.m28354c().f30551c;
        if (i == 0 && bbVar.s == 1) {
            i = 2;
        }
        textView3.setVisibility(8);
        textView2.setVisibility(8);
        LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        float dimension = frameLayout.getContext().getResources().getDimension(C6072e.play_card_default_elevation);
        switch (i) {
            case 1:
                break;
            case 2:
                Context context = textView3.getContext();
                if (TextUtils.isEmpty(bbVar.f30543A)) {
                    int i2;
                    c6121g.m28130b(c6164u.f30667b.mo3263b((ai) C6116b.m28100a(bbVar.n), context), C6089g.acquisition_text);
                    switch (bbVar.n.b.f11835d) {
                        case 1:
                            i2 = C6071d.play_books_primary;
                            break;
                        case 2:
                            i2 = C6071d.play_music_primary;
                            break;
                        case 3:
                            i2 = C6071d.play_apps_primary;
                            break;
                        case 4:
                            i2 = C6071d.play_movies_primary;
                            break;
                        default:
                            i2 = C6071d.play_multi_primary;
                            break;
                    }
                    textView3.setTextColor(context.getResources().getColorStateList(i2));
                } else {
                    c6121g.m28130b(bbVar.f30543A, C6089g.subtitle);
                    textView2.setTextColor(C6325i.m28969a(context, bbVar.n.b.f11835d));
                }
                layoutParams2.height = ((textView.getMaxLines() * C6120f.m28113a(textView)) + (C6120f.m28113a(textView3) * textView3.getMaxLines())) + context.getResources().getDimensionPixelSize(C6072e.pe__acquisition_text_margin);
                view.setClickable(true);
                f = dimension;
                break;
            case 3:
                layoutParams2.height = textView.getMaxLines() * C6120f.m28113a(textView);
                view.setClickable(true);
                f = 0.0f;
                break;
            default:
                f30674a.m28055a(null, "Unknown cluster type; treating as default.", new Object[0]);
                break;
        }
        layoutParams2.height = textView.getMaxLines() * C6120f.m28113a(textView);
        view.setClickable(false);
        f = dimension;
        linearLayout.setLayoutParams(layoutParams2);
        android.support.v4.view.ai.m1851g(frameLayout, f);
    }

    private static int m28484a(int i) {
        switch (i) {
            case 1:
                return C6072e.pe__cluster_item_height_mini;
            case 2:
                return C6072e.pe__cluster_item_height_short;
            case 3:
                return C6072e.pe__cluster_item_height;
            case 4:
                return C6072e.pe__cluster_item_height_tall;
            default:
                return 0;
        }
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        return mo5335b(view, c6164u);
    }
}
