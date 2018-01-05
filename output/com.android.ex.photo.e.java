package com.android.ex.photo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class com.android.ex.photo.e
{

    public final Intent a;
    public Integer b;
    public String c;
    public String d;
    public String e;
    public String[] f;
    public String g;
    public String h;
    public Float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;

    e(Context p0, Class p1) {
        this.a = new Intent(p0, p1);
        this.m = 0;
        this.r = 0;
        this.s = 0;
        this.j = 1;
    }

    public final Intent a() {
        this.a.setAction("android.intent.action.VIEW");
        this.a.setFlags(67633152);
        if (this.b != 0)
            this.a.putExtra("photo_index", this.b.intValue());
        if (this.c != 0)
            this.a.putExtra("initial_photo_uri", this.c);
        if (this.c != 0 && this.b != 0)
            throw new IllegalStateException("specified both photo index and photo uri");
        if (this.d != 0) {
            this.a.putExtra("photos_uri", this.d);
            this.a.setData(Uri.parse(this.d));
        }
        if (this.e != 0)
            this.a.putExtra("resolved_photo_uri", this.e);
        if (this.f != 0)
            this.a.putExtra("projection", this.f);
        if (this.g != 0)
            this.a.putExtra("thumbnail_uri", this.g);
        if (this.h != 0)
            this.a.putExtra("content_description", this.h);
        if (this.i != 0)
            this.a.putExtra("max_scale", this.i);
        this.a.putExtra("watch_network", this.l);
        this.a.putExtra("scale_up_animation", this.m);
        if (this.m != 0) {
            this.a.putExtra("start_x_extra", this.n);
            this.a.putExtra("start_y_extra", this.o);
            this.a.putExtra("start_width_extra", this.p);
            this.a.putExtra("start_height_extra", this.q);
        }
        this.a.putExtra("action_bar_hidden_initially", this.r);
        this.a.putExtra("display_thumbs_fullscreen", this.s);
        this.a.putExtra("enable_timer_lights_out", this.j);
        this.a.putExtra("run_sapi_for_ui", this.k);
        return this.a;
    }

    public final com.android.ex.photo.e a(float p0) {
        this.i = Float.valueOf(p0);
        return this;
    }

}
