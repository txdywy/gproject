package com.google.android.play.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.play.C6361i;
import com.google.android.play.f;

public class PlaySearchActionButton extends ImageView implements C6407o {
    public C6420m f32288a;
    public Drawable f32289b;
    public Drawable f32290c;
    public final boolean f32291d;
    public int f32292e;

    public PlaySearchActionButton(Context context) {
        this(context, null);
    }

    public PlaySearchActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32292e = 1;
        this.f32289b = context.getResources().getDrawable(f.play_ic_clear);
        this.f32290c = context.getResources().getDrawable(f.ic_mic_dark);
        this.f32291d = ak.m29430a(context);
        m29364b(2);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new C6418k(this));
    }

    public void setPlaySearchController(C6420m c6420m) {
        if (this.f32288a != null) {
            this.f32288a.m29447b(this);
        }
        this.f32288a = c6420m;
        this.f32288a.m29442a((C6407o) this);
    }

    public final void mo5425a(int i) {
        m29363a();
    }

    public final void mo5428a(String str, boolean z) {
        m29363a();
    }

    public final void mo5426a(C6429w c6429w) {
    }

    public final boolean mo5429b(C6429w c6429w) {
        return false;
    }

    public final void mo5427a(String str) {
    }

    private final void m29363a() {
        if (this.f32288a != null) {
            CharSequence charSequence = this.f32288a.f32364d;
            if (this.f32288a.m29445a() || TextUtils.isEmpty(charSequence)) {
                m29364b(2);
            } else {
                m29364b(1);
            }
        }
    }

    private final void m29364b(int i) {
        if (this.f32292e != i) {
            Drawable drawable;
            int i2;
            this.f32292e = i;
            if (i == 1) {
                drawable = this.f32289b;
                i2 = C6361i.play_accessibility_search_plate_clear;
            } else if (i == 2 && this.f32291d) {
                drawable = this.f32290c;
                i2 = C6361i.play_accessibility_search_plate_voice_search_button;
            } else {
                i2 = 0;
                drawable = null;
            }
            setImageDrawable(drawable);
            if (drawable != null) {
                setContentDescription(getContext().getResources().getString(i2));
                setVisibility(0);
                return;
            }
            setContentDescription(null);
            setVisibility(4);
        }
    }
}
