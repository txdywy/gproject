package com.android.ex.photo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class C0567e {
    public final Intent f3774a;
    public Integer f3775b;
    public String f3776c;
    public String f3777d;
    public String f3778e;
    public String[] f3779f;
    public String f3780g;
    public String f3781h;
    public Float f3782i;
    public boolean f3783j = true;
    public boolean f3784k;
    public boolean f3785l;
    public boolean f3786m = false;
    public int f3787n;
    public int f3788o;
    public int f3789p;
    public int f3790q;
    public boolean f3791r = false;
    public boolean f3792s = false;

    public C0567e(Context context, Class cls) {
        this.f3774a = new Intent(context, cls);
    }

    public final C0567e m4106a(float f) {
        this.f3782i = Float.valueOf(f);
        return this;
    }

    public final Intent m4105a() {
        this.f3774a.setAction("android.intent.action.VIEW");
        this.f3774a.setFlags(67633152);
        if (this.f3775b != null) {
            this.f3774a.putExtra("photo_index", this.f3775b.intValue());
        }
        if (this.f3776c != null) {
            this.f3774a.putExtra("initial_photo_uri", this.f3776c);
        }
        if (this.f3776c == null || this.f3775b == null) {
            if (this.f3777d != null) {
                this.f3774a.putExtra("photos_uri", this.f3777d);
                this.f3774a.setData(Uri.parse(this.f3777d));
            }
            if (this.f3778e != null) {
                this.f3774a.putExtra("resolved_photo_uri", this.f3778e);
            }
            if (this.f3779f != null) {
                this.f3774a.putExtra("projection", this.f3779f);
            }
            if (this.f3780g != null) {
                this.f3774a.putExtra("thumbnail_uri", this.f3780g);
            }
            if (this.f3781h != null) {
                this.f3774a.putExtra("content_description", this.f3781h);
            }
            if (this.f3782i != null) {
                this.f3774a.putExtra("max_scale", this.f3782i);
            }
            this.f3774a.putExtra("watch_network", this.f3785l);
            this.f3774a.putExtra("scale_up_animation", this.f3786m);
            if (this.f3786m) {
                this.f3774a.putExtra("start_x_extra", this.f3787n);
                this.f3774a.putExtra("start_y_extra", this.f3788o);
                this.f3774a.putExtra("start_width_extra", this.f3789p);
                this.f3774a.putExtra("start_height_extra", this.f3790q);
            }
            this.f3774a.putExtra("action_bar_hidden_initially", this.f3791r);
            this.f3774a.putExtra("display_thumbs_fullscreen", this.f3792s);
            this.f3774a.putExtra("enable_timer_lights_out", this.f3783j);
            this.f3774a.putExtra("run_sapi_for_ui", this.f3784k);
            return this.f3774a;
        }
        throw new IllegalStateException("specified both photo index and photo uri");
    }
}
