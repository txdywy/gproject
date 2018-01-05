package com.google.android.play.drawer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.play.C6282d;
import com.google.android.play.C6314e;
import com.google.android.play.C6317h;
import com.google.android.play.utils.l;
import com.squareup.haha.perflib.HprofParser;

public class PlayDrawerPrimaryActionView extends TextView {
    public boolean f31386a;
    public boolean f31387b;
    public Resources f31388c;
    public C6294d f31389d;

    public PlayDrawerPrimaryActionView(Context context) {
        super(context);
    }

    public PlayDrawerPrimaryActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void m28862a(ViewGroup viewGroup, boolean z, boolean z2) {
        this.f31388c = viewGroup.getResources();
        this.f31386a = z;
        this.f31387b = z2;
    }

    public final void m28863a(C6298m c6298m, boolean z) {
        Drawable a;
        Drawable drawable = null;
        setText(c6298m.f31476a);
        Resources resources = this.f31388c;
        boolean z2 = this.f31386a;
        if (c6298m.f31488m != null) {
            a = c6298m.f31488m.mo3616a(resources, z2);
        } else if (!z2 || c6298m.f31487l <= 0) {
            a = resources.getDrawable(c6298m.f31486k);
        } else {
            a = resources.getDrawable(c6298m.f31487l);
        }
        if (a == null) {
            setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, null);
        } else {
            Drawable drawable2;
            if (this.f31387b) {
                a.setAlpha(66);
            } else {
                a.setAlpha(HprofParser.ROOT_UNKNOWN);
            }
            if (c6298m.f31485j > 0) {
                resources = this.f31388c;
                int i = c6298m.f31485j;
                if (this.f31389d == null) {
                    this.f31389d = new C6294d(resources, i);
                } else {
                    this.f31389d.f31470d = i;
                }
                drawable2 = this.f31389d;
            } else {
                drawable2 = null;
            }
            if (z) {
                setCompoundDrawablesWithIntrinsicBounds(a, null, drawable2, null);
            } else {
                setCompoundDrawablesWithIntrinsicBounds(drawable2, null, a, null);
            }
            setContentDescription(c6298m.f31477b);
            resources = this.f31388c;
            if (c6298m.f31489n != null) {
                drawable = c6298m.f31489n.mo3616a(resources, true);
            } else if (c6298m.f31478c > 0) {
                drawable = resources.getDrawable(c6298m.f31478c);
            }
            if (drawable != null) {
                if (this.f31387b) {
                    drawable.setAlpha(66);
                } else {
                    drawable.setAlpha(HprofParser.ROOT_UNKNOWN);
                }
                l.a(this, drawable, false);
            }
        }
        if (this.f31386a && c6298m.f31479d > 0) {
            setTextColor(this.f31388c.getColor(c6298m.f31479d));
        } else if (this.f31387b) {
            setTextColor(this.f31388c.getColor(C6282d.play_disabled_grey));
        } else {
            setTextColor(this.f31388c.getColor(C6282d.play_fg_primary));
        }
        setGravity(8388627);
        if (c6298m.f31484i) {
            bd.m28914a(this, this.f31388c.getDimensionPixelSize(C6314e.play_drawer_child_item_left_padding));
        } else {
            bd.m28914a(this, this.f31388c.getDimensionPixelSize(C6314e.play_drawer_item_left_padding));
        }
    }

    public static int m28861a(boolean z, boolean z2) {
        if (z) {
            return C6317h.play_drawer_primary_action_active;
        }
        if (z2) {
            return C6317h.play_drawer_primary_action_disabled;
        }
        return C6317h.play_drawer_primary_action_regular;
    }
}
