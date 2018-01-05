package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class PlayInstalledAppsFilterToggle extends FrameLayout implements OnClickListener, ad {
    public final ce f23034a;
    public final ce f23035b;
    public SwitchCompat f23036c;
    public ad f23037d;
    public ce f23038e;
    public ak f23039f;
    public int f23040g;
    public int f23041h;
    public int f23042i;
    public C2495w f23043j;

    public PlayInstalledAppsFilterToggle(Context context) {
        this(context, null);
    }

    public PlayInstalledAppsFilterToggle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f23034a = C2482j.m13283a(2914);
        this.f23035b = C2482j.m13283a(2915);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f23036c = (SwitchCompat) findViewById(C7582R.id.toggle_switch_button);
        Resources resources = getResources();
        this.f23041h = resources.getColor(C7582R.color.play_installed_apps_toggle_switch_thumb_off);
        this.f23042i = resources.getColor(C7582R.color.play_installed_apps_toggle_switch_track_off);
        setOnClickListener(this);
    }

    public final void m21057a(boolean z, ak akVar, int i, ad adVar, C2495w c2495w) {
        this.f23036c.setChecked(z);
        this.f23039f = akVar;
        this.f23040g = i;
        m21055a(z, this.f23036c.getThumbDrawable(), this.f23036c.getTrackDrawable());
        this.f23037d = adVar;
        this.f23043j = c2495w;
        this.f23038e = z ? this.f23034a : this.f23035b;
        this.f23037d.mo1219a(this);
    }

    private final void m21055a(boolean z, Drawable drawable, Drawable drawable2) {
        if (z) {
            drawable.setColorFilter(this.f23040g, Mode.MULTIPLY);
            drawable2.setColorFilter(this.f23040g, Mode.MULTIPLY);
            drawable2.setAlpha(90);
            return;
        }
        drawable.setColorFilter(this.f23041h, Mode.MULTIPLY);
        drawable2.setColorFilter(this.f23042i, Mode.MULTIPLY);
    }

    public ce getPlayStoreUiElement() {
        return this.f23038e;
    }

    public ad getParentNode() {
        return this.f23037d;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public void onClick(View view) {
        this.f23043j.m13379b(new C2475d(this));
        boolean z = !this.f23036c.isChecked();
        this.f23036c.setChecked(z);
        m21055a(z, this.f23036c.getThumbDrawable(), this.f23036c.getTrackDrawable());
        if (this.f23039f != null) {
            this.f23039f.mo4143a(z);
        }
        this.f23038e = z ? this.f23034a : this.f23035b;
    }
}
