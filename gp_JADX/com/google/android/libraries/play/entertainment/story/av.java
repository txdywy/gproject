package com.google.android.libraries.play.entertainment.story;

import android.support.v7.widget.fr;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.agera.C0915v;
import com.google.android.agera.an;
import com.google.android.agera.p100a.C0884a;
import com.google.android.agera.p100a.C0891h;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.C6098k;
import com.google.android.libraries.play.entertainment.media.C2125d;
import com.google.android.libraries.play.entertainment.media.C6074a;
import com.google.android.libraries.play.entertainment.media.C6123b;
import com.google.android.libraries.play.entertainment.media.TimeBar;
import com.google.android.libraries.play.entertainment.p195e.C3004a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.wireless.android.finsky.dfe.g.a.ac;
import com.google.wireless.android.finsky.dfe.g.a.af;
import com.google.wireless.android.finsky.dfe.g.a.ai;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class av extends C0891h implements C6123b, C2125d {
    public final an f30438a = new C0915v(null);
    public final StringBuilder f30439b = new StringBuilder();
    public C6074a f30440c;
    public af[] f30441d;
    public ai f30442e;
    public List f30443f;
    public int f30444g = -1;
    public int f30445h = -1;
    public boolean f30446i = false;
    public C0884a f30447j;
    public boolean f30448k = false;
    public final /* synthetic */ ar f30449l;

    av(ar arVar) {
        this.f30449l = arVar;
    }

    public final boolean m28277a(af[] afVarArr) {
        return Arrays.equals(this.f30441d, afVarArr);
    }

    final void m28273a() {
        if (this.f30448k) {
            C6116b.m28100a(this.f30441d);
            C6116b.m28103a(this.f30441d.length > this.f30444g);
            C3004a c3004a = this.f30449l.f30421r;
            if (this.f30442e == null || this.f30443f == null || this.f30443f.isEmpty()) {
                this.f30449l.f30418o.m28343a(this.f30441d[this.f30444g].d, this.f30443f, true, this.f30441d[this.f30444g].c, this.f30449l.f30417n, this.f30449l.f30403C);
            } else {
                this.f30449l.f30418o.m28343a(this.f30442e, this.f30443f, true, this.f30441d[this.f30444g].c, this.f30449l.f30417n, this.f30449l.f30403C);
            }
        }
    }

    public final void m28279b() {
        if (this.f30441d != null) {
            this.f30441d = null;
            this.f30444g = -1;
            this.f30445h = -1;
            m28285f();
            if (this.f30447j != null) {
                this.f30447j.m5530c();
                this.f30447j = null;
            }
            this.f30449l.f30412i.f30332q.setAdapter(null);
            this.f30438a.ad_();
        }
    }

    final C6074a m28284e() {
        if (this.f30440c == null) {
            this.f30440c = this.f30449l.f30416m.mo5281a(this);
        }
        return this.f30440c;
    }

    public final void m28285f() {
        this.f30449l.f30412i.f30306A.setTimeProvider(null);
        if (this.f30440c != null) {
            this.f30440c.mo5280g();
            this.f30446i = false;
            this.f30440c = null;
            this.f30438a.ad_();
        }
    }

    public final void mo5309a(ac acVar) {
        int i = 0;
        if (this.f30444g >= 0 && this.f30441d != null && acVar.equals(this.f30441d[this.f30444g].b)) {
            if (this.f30445h == this.f30444g) {
                this.f30445h = -1;
            }
            this.f30446i = false;
            this.f30438a.ad_();
            View view = this.f30449l.f30412i.f30341z;
            if (this.f30449l.f30412i.f30309D == 6) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void mo5312b(ac acVar) {
        if (this.f30444g >= 0 && this.f30441d != null && acVar.equals(this.f30441d[this.f30444g].b)) {
            if (this.f30445h == this.f30444g) {
                this.f30445h = -1;
            }
            this.f30446i = true;
            this.f30438a.ad_();
            this.f30449l.f30412i.f30341z.setVisibility(8);
        }
    }

    public final void mo5313c(ac acVar) {
        if (this.f30444g >= 0 && this.f30441d != null && acVar != null && acVar.equals(this.f30441d[this.f30444g].b)) {
            this.f30446i = false;
            this.f30449l.f30412i.f30341z.setVisibility(8);
            if (this.f30445h < 0) {
                boolean z;
                if (this.f30441d == null || this.f30444g + 1 >= this.f30441d.length) {
                    z = false;
                } else {
                    this.f30444g++;
                    m28284e().mo5277a(this.f30441d[this.f30444g].b, false);
                    m28273a();
                    z = true;
                }
                if (!z && this.f30449l.f30412i.f30309D != 6) {
                    this.f30441d = null;
                    this.f30442e = null;
                    this.f30443f = Collections.emptyList();
                    this.f30444g = -1;
                    this.f30445h = -1;
                    this.f30438a.ad_();
                    this.f30449l.m28266f();
                    this.f30449l.f30412i.f30306A.setTimeProvider(null);
                    this.f30449l.f30412i.m28160a(false);
                }
            }
        }
    }

    final void m28274a(int i) {
        boolean z = i >= 0 && i < ((af[]) C6116b.m28100a(this.f30441d)).length;
        C6116b.m28106b(z);
        C6074a e = m28284e();
        if (i == this.f30444g && this.f30446i) {
            if (e.mo5279e()) {
                e.mo5276a();
            } else {
                e.mo5278b();
            }
            this.f30438a.ad_();
        } else {
            this.f30444g = i;
            this.f30445h = i;
            e.mo5277a(this.f30441d[i].b, true);
        }
        m28273a();
    }

    final boolean m28286g() {
        return this.f30446i && this.f30440c != null && this.f30440c.mo5279e();
    }

    final boolean m28287h() {
        return (!this.f30446i || this.f30440c == null || this.f30440c.mo5279e()) ? false : true;
    }

    public final float mo2655c() {
        return this.f30440c == null ? 0.0f : this.f30440c.mo2655c();
    }

    public final float mo2656d() {
        return this.f30440c == null ? 0.0f : this.f30440c.mo2656d();
    }

    public final /* synthetic */ void mo5310a(Object obj, int i, fr frVar) {
        C6121g c6121g;
        int length;
        af[] afVarArr = (af[]) obj;
        View view = frVar.f3211a;
        Object tag = view.getTag();
        if (tag instanceof C6121g) {
            c6121g = (C6121g) tag;
        } else {
            C6121g a = new C6121g().m28116a(view, C6089g.pe_track_list_item_loading_indicator, View.class).m28116a(view, C6089g.pe_track_list_item_playing_indicator, View.class).m28116a(view, C6089g.pe_track_list_item_paused_indicator, View.class).m28116a(view, C6089g.pe_track_list_item_track_number, TextView.class).m28116a(view, C6089g.pe_track_list_item_track_name, TextView.class).m28116a(view, C6089g.pe_track_list_item_track_duration, TextView.class).m28116a(view, C6089g.pe_track_list_item_divider, View.class).m28116a(view, C6089g.pe_track_list_item_time_bar, TimeBar.class);
            view.setTag(a);
            c6121g = a;
        }
        view.setOnClickListener(new aw(this, afVarArr, i));
        int i2 = i + 1;
        int i3 = 0;
        for (length = afVarArr.length; length > 0; length /= 10) {
            i3++;
        }
        for (length = i2; length > 0; length /= 10) {
            i3--;
        }
        this.f30439b.setLength(0);
        while (i3 > 0) {
            this.f30439b.append('0');
            i3--;
        }
        this.f30439b.append(i2);
        c6121g.m28126a(this.f30439b.toString(), C6089g.pe_track_list_item_track_number, C6098k.pe__content_description_track_x, Integer.valueOf(i2));
        c6121g.m28126a(afVarArr[i].b.c, C6089g.pe_track_list_item_track_name, C6098k.pe__content_description_track_name, r0);
        c6121g.m28121a((long) afVarArr[i].b.f, C6089g.pe_track_list_item_track_duration, this.f30439b);
        View view2 = (View) c6121g.m28117a(View.class, C6089g.pe_track_list_item_loading_indicator);
        view = (View) c6121g.m28117a(ImageView.class, C6089g.pe_track_list_item_playing_indicator);
        View view3 = (View) c6121g.m28117a(View.class, C6089g.pe_track_list_item_paused_indicator);
        View view4 = (View) c6121g.m28117a(View.class, C6089g.pe_track_list_item_track_number);
        view2.setVisibility(8);
        view.setVisibility(8);
        view3.setVisibility(8);
        view4.setVisibility(8);
        if (this.f30444g != i) {
            view4.setVisibility(0);
        } else if (!this.f30446i && this.f30440c != null) {
            view2.setVisibility(0);
        } else if (this.f30440c == null || !this.f30440c.mo5279e()) {
            view3.setVisibility(0);
        } else {
            view.setVisibility(0);
        }
        TimeBar timeBar = (TimeBar) c6121g.m28117a(TimeBar.class, C6089g.pe_track_list_item_time_bar);
        view = (View) c6121g.m28117a(View.class, C6089g.pe_track_list_item_divider);
        if (this.f30444g == i && this.f30446i) {
            timeBar.setVisibility(0);
            timeBar.setTimeProvider(this);
            view.setVisibility(8);
            return;
        }
        timeBar.setVisibility(8);
        timeBar.setTimeProvider(null);
        view.setVisibility(0);
    }

    public final /* synthetic */ int mo5311b(Object obj, int i) {
        return C6091h.pe_media_player_track_list_item;
    }

    public final /* synthetic */ long mo5308a(Object obj, int i) {
        return (long) (i + 1);
    }

    public final /* synthetic */ int mo5307a(Object obj) {
        return ((af[]) obj).length;
    }
}
