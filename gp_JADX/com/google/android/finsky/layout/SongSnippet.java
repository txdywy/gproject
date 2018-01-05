package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.cu.C2415b;
import com.google.android.finsky.cu.C2418l;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.fl;
import com.google.android.finsky.cv.p177a.jw;
import com.google.android.finsky.detailscomponents.C2576a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class SongSnippet extends RelativeLayout implements ad {
    public final C2415b f18387a = new C2415b(this.f18411y);
    public final C2471a f18388b = C1473m.f7980a.aR();
    public SongIndex f18389c;
    public PlayActionButtonV2 f18390d;
    public TextView f18391e;
    public DecoratedTextView f18392f;
    public DecoratedTextView f18393g;
    public TextView f18394h;
    public ImageView f18395i;
    public ImageView f18396j;
    public C1294w f18397k;
    public Document f18398l;
    public boolean f18399m;
    public Document f18400n;
    public C3748a f18401o;
    public int f18402p;
    public jw f18403q;
    public fl f18404r;
    public boolean f18405s;
    public boolean f18406t;
    public boolean f18407u;
    public ce f18408v = C2482j.m13283a(502);
    public ad f18409w;
    public boolean f18410x;
    public final C2418l f18411y = new bx(this);

    public SongSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18387a.m12125a();
        if (this.f18410x) {
            this.f18392f.setText("");
            int c = C0216d.m1116c(getContext(), C7582R.color.placeholder_grey);
            this.f18392f.setBackgroundColor(c);
            this.f18391e.setBackgroundColor(c);
            this.f18396j.setVisibility(4);
            this.f18390d.setVisibility(4);
            this.f18393g.setVisibility(8);
        } else if (this.f18404r == null) {
            setVisibility(8);
        } else {
            m17349a();
        }
    }

    protected void onDetachedFromWindow() {
        this.f18387a.m12126b();
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18389c = (SongIndex) findViewById(C7582R.id.song_index);
        this.f18390d = (PlayActionButtonV2) findViewById(C7582R.id.buy_button);
        this.f18396j = (ImageView) findViewById(C7582R.id.badge);
        this.f18391e = (TextView) findViewById(C7582R.id.song_duration);
        this.f18392f = (DecoratedTextView) findViewById(C7582R.id.song_title);
        this.f18393g = (DecoratedTextView) findViewById(C7582R.id.song_subtitle);
        this.f18394h = (TextView) findViewById(C7582R.id.added_state);
        this.f18395i = (ImageView) findViewById(C7582R.id.added_drawable);
    }

    public final void m17349a() {
        if (this.f18410x) {
            setVisibility(0);
            this.f18392f.setBackgroundColor(0);
            this.f18391e.setBackgroundColor(0);
        }
        this.f18389c.setTrackNumber(this.f18402p);
        if (this.f18407u) {
            this.f18391e.setText(DateUtils.formatElapsedTime((long) this.f18404r.f12377d));
            this.f18391e.setContentDescription(getResources().getString(C7582R.string.content_description_track_duration, new Object[]{r0}));
            this.f18391e.setVisibility(0);
        } else {
            this.f18391e.setVisibility(8);
        }
        this.f18392f.setText(this.f18400n.f14885a.f12100g);
        if (this.f18403q.f12834h != null) {
            this.f18396j.setVisibility(0);
            ac acVar = this.f18403q.f12834h;
            int measuredHeight = this.f18396j.getMeasuredHeight();
            C1473m.f7980a.ch();
            bd a = C2576a.m13619a(acVar);
            if (a != null) {
                if (!a.f11863i) {
                    measuredHeight = 0;
                }
                x a2 = this.f18397k.mo1671a(a.f11860f, measuredHeight, measuredHeight, new bv(this));
                if (a2.b() != null) {
                    this.f18396j.setImageBitmap(a2.b());
                }
            }
        } else {
            this.f18396j.setVisibility(4);
        }
        if (this.f18399m) {
            this.f18393g.setText(this.f18400n.f14885a.f12102i);
            C1473m.f7980a.ch().m13625a(this.f18400n, this.f18393g);
        } else {
            this.f18393g.setVisibility(8);
        }
        this.f18390d.setVisibility(0);
        C2196e a3 = C1473m.f7980a.ah().mo2811a(C1473m.f7980a.cY());
        Account cY = C1473m.f7980a.cY();
        Account a4 = C1473m.f7980a.mo2045Y().m11642a(this.f18400n, cY);
        if (a4 != null) {
            m17347b();
            this.f18390d.m6000a(2, (int) C7582R.string.listen, new bw(this, a4));
        } else if (this.f18400n.m14649e(1) != null) {
            String str;
            m17347b();
            PlayActionButtonV2 playActionButtonV2 = this.f18390d;
            bl e = this.f18400n.m14649e(1);
            if (e == null || !e.aL_()) {
                str = null;
            } else {
                str = e.f11917g;
            }
            playActionButtonV2.mo2588a(2, str, this.f18401o.mo3624a(cY, this.f18400n, 1, null, null, 200, (ad) this, this.f18388b.m13178a(cY)));
        } else if (!C1473m.f7980a.mo2045Y().m11649a(this.f18400n, C1473m.f7980a.dn(), a3)) {
            switch (this.f18400n.af()) {
                case 13:
                    m17348c();
                    break;
                default:
                    this.f18390d.setVisibility(4);
                    break;
            }
        } else if (this.f18398l == null || this.f18398l.m14649e(1) == null) {
            this.f18390d.setVisibility(4);
        } else {
            m17348c();
        }
        if (this.f18405s) {
            this.f18391e.setVisibility(8);
            this.f18394h.setVisibility(0);
            this.f18395i.setVisibility(0);
        } else {
            this.f18391e.setVisibility(0);
            this.f18394h.setVisibility(8);
            this.f18395i.setVisibility(8);
        }
        this.f18389c.setClickable(false);
        C2418l c2418l = this.f18411y;
        switch (C2415b.f11723a.f11727b.f11717a) {
            case 2:
                c2418l.mo2905d();
                break;
            case 3:
                c2418l.mo2906e();
                break;
            case 4:
                c2418l.mo2901a();
                break;
            case 5:
                c2418l.mo2903b();
                break;
            case 7:
                c2418l.mo2904c();
                break;
            case 8:
                c2418l.mo2908g();
                break;
        }
        if (this.f18407u) {
            setOnClickListener(new bt(this, this.f18400n.f14885a.f12088E, C1473m.f7980a.cY().name));
        } else {
            setOnClickListener(null);
        }
        if (((Boolean) C0955b.ad.m28964b()).booleanValue()) {
            setOnLongClickListener(new bu(this));
        }
        this.f18410x = false;
    }

    public Document getDocument() {
        return this.f18400n;
    }

    public void setState(int i) {
        int i2 = 0;
        switch (i) {
            case 1:
                this.f18389c.setState(5);
                return;
            case 2:
                m17351a(true);
                SongIndex songIndex = this.f18389c;
                if (this.f18407u) {
                    i2 = 3;
                }
                songIndex.setState(i2);
                return;
            default:
                this.f18389c.setState(0);
                return;
        }
    }

    final void m17351a(boolean z) {
        Resources resources = getResources();
        if (z) {
            setBackgroundResource(C7582R.drawable.active_song_with_highlight);
            int color = resources.getColor(C7582R.color.play_white);
            this.f18392f.setTextColor(color);
            this.f18393g.setTextColor(color);
            this.f18391e.setTextColor(color);
            return;
        }
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setBackgroundResource(C7582R.drawable.play_highlight_overlay_light);
        ai.m1823a(this, l, paddingTop, m, paddingBottom);
        this.f18392f.setTextColor(resources.getColor(C7582R.color.play_fg_secondary));
        this.f18393g.setTextColor(resources.getColor(C7582R.color.play_secondary_text));
        this.f18391e.setTextColor(resources.getColor(C7582R.color.play_secondary_text));
    }

    private final void m17347b() {
        this.f18390d.setDrawAsLabel(false);
        this.f18390d.setActionStyle(2);
        this.f18390d.setEnabled(true);
    }

    private final void m17348c() {
        this.f18390d.setDrawAsLabel(true);
        this.f18390d.setActionStyle(2);
        this.f18390d.setEnabled(false);
        this.f18390d.m6000a(2, (int) C7582R.string.album_only_purchase, null);
    }

    public ce getPlayStoreUiElement() {
        return this.f18408v;
    }

    public ad getParentNode() {
        return this.f18409w;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
