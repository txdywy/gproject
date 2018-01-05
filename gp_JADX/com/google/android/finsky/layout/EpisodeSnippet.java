package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bb.C1565a;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.ky;
import com.google.android.finsky.cv.p177a.lt;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.detailspage.FamilyShareLayout;
import com.google.android.finsky.detailspage.ch;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.b;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Collection;

public class EpisodeSnippet extends b implements ad {
    public TextView f18162a;
    public PlayActionButtonV2 f18163b;
    public TextView f18164c;
    public TextView f18165d;
    public TextView f18166e;
    public View f18167f;
    public ViewStub f18168g;
    public ViewGroup f18169h;
    public TextView f18170i;
    public HeroGraphicView f18171j;
    public FamilyShareLayout f18172k;
    public Document f18173l;
    public Document f18174m;
    public boolean f18175n;
    public boolean f18176o;
    public C1565a f18177p;
    public ch f18178q;
    public boolean f18179r;
    public af f18180s;
    public final Runnable f18181t = new ab(this);
    public final Handler f18182u = new Handler(Looper.getMainLooper());
    public C3748a f18183v;
    public ce f18184w = C2482j.m13283a(503);
    public ad f18185x;
    public C2495w f18186y;
    public boolean f18187z;

    public EpisodeSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f18187z) {
            if (this.f18174m.m14631T() == null) {
                setVisibility(8);
            } else {
                m17296a();
            }
        }
    }

    public final void m17300a(boolean z) {
        this.f18187z = true;
        if (z) {
            int c = C0216d.m1116c(getContext(), C7582R.color.placeholder_grey);
            this.f18164c.setBackgroundColor(c);
            this.f18165d.setBackgroundColor(c);
            this.f18163b.setVisibility(4);
            return;
        }
        setVisibility(4);
    }

    public final void m17296a() {
        CharSequence charSequence = null;
        if (this.f18187z) {
            setVisibility(0);
            this.f18164c.setBackgroundColor(0);
            this.f18165d.setBackgroundColor(0);
        }
        ky T = this.f18174m.m14631T();
        if (T == null) {
            setVisibility(8);
            return;
        }
        this.f18162a.setText(Integer.toString(T.f12978c));
        this.f18162a.setContentDescription(getResources().getString(C7582R.string.content_description_episode_number, new Object[]{Integer.valueOf(T.f12978c)}));
        this.f18164c.setText(this.f18174m.f14885a.f12100g);
        this.f18164c.setMaxLines(2);
        this.f18164c.setEllipsize(TruncateAt.END);
        if (C1473m.f7980a.dj().mo2294a(12626439)) {
            if (this.f18175n) {
                this.f18165d.setMinWidth(getContext().getResources().getDimensionPixelSize(C7582R.dimen.tv_episode_extra_space));
            } else {
                this.f18165d.setMinWidth(0);
            }
            TextView textView = this.f18165d;
            bl a = m17292a(this.f18174m);
            if (!(a == null || a.f11932v == null)) {
                CharSequence charSequence2 = a.f11922l;
                if (!(charSequence2 == null || charSequence2.isEmpty())) {
                    charSequence = new SpannableStringBuilder();
                    charSequence.append(charSequence2);
                    charSequence.setSpan(new StrikethroughSpan(), 0, charSequence.length(), 33);
                }
            }
            textView.setText(charSequence);
        } else {
            this.f18165d.setVisibility(8);
        }
        if (this.f18176o) {
            this.f18163b.setVisibility(4);
            this.f18167f.setVisibility(8);
            this.f18166e.setVisibility(8);
        } else {
            m17293a(getResources(), this.f18163b, this.f18166e, this.f18167f, this.f18173l, this.f18174m, this.f18179r, this.f18183v, this, this.f18186y);
        }
        m17295d();
        if (this.f18172k != null) {
            this.f18172k.m13769a(this.f18178q, this.f18177p);
        }
        setOnClickListener(new ac(this));
        if (this.f18187z) {
            this.f18187z = false;
            setAlpha(0.0f);
            ai.m1852h(this).m1993a(1.0f).m1994a(500).m2000b();
        }
    }

    private static bl m17292a(Document document) {
        bl blVar = null;
        Account cY = C1473m.f7980a.cY();
        C2206c ah = C1473m.f7980a.ah();
        if (C1473m.f7980a.mo2045Y().m11642a(document, cY) == null) {
            C2197a a = ah.mo2811a(cY);
            C1473m.f7980a.ab();
            Collection b = C1804v.m9805b(a);
            C1473m.f7980a.mo2044X();
            bl a2 = C2288b.m11786a(document.f14885a.f12107n, true, null);
            if (a2 != null) {
                long j = a2.f11915e;
                blVar = a2;
                for (lt ltVar : document.m14615D()) {
                    if (b.contains(ltVar.f13059b.f12097d)) {
                        bl[] blVarArr = ltVar.f13060c;
                        int length = blVarArr.length;
                        int i = 0;
                        while (i < length) {
                            a2 = blVarArr[i];
                            if (a2.f11932v.f12004c < j) {
                                j = a2.f11932v.f12004c;
                            } else {
                                a2 = blVar;
                            }
                            i++;
                            blVar = a2;
                        }
                    }
                }
            }
        }
        return blVar;
    }

    public Document getEpisode() {
        return this.f18174m;
    }

    public final void m17301b() {
        if (this.f18169h != null) {
            this.f18169h.setVisibility(8);
        }
    }

    public final boolean m17302c() {
        return this.f18169h != null && this.f18169h.getVisibility() == 0;
    }

    private final void m17295d() {
        if (this.f18169h == null) {
            return;
        }
        if (this.f18177p != null && this.f18172k == null) {
            this.f18172k = (FamilyShareLayout) LayoutInflater.from(getContext()).inflate(C7582R.layout.family_share_module_layout, this.f18169h, false);
            this.f18172k.setOnClickListener(new ad());
            this.f18169h.addView(this.f18172k);
        } else if (this.f18177p == null && this.f18172k != null) {
            this.f18169h.removeView(this.f18172k);
            this.f18172k = null;
        }
    }

    public final void m17297a(int i) {
        boolean c = m17302c();
        if (this.f18169h == null) {
            this.f18169h = (ViewGroup) this.f18168g.inflate();
            this.f18170i = (TextView) findViewById(C7582R.id.episode_description);
            this.f18171j = (HeroGraphicView) findViewById(C7582R.id.episode_screencap);
            this.f18171j.setFocusable(false);
            m17295d();
        }
        this.f18169h.setVisibility(i);
        if (i == 8) {
            this.f18164c.setMaxLines(2);
            this.f18164c.setEllipsize(TruncateAt.END);
        } else {
            this.f18164c.setMaxLines(1000);
            this.f18164c.setEllipsize(null);
        }
        if (i == 0) {
            this.f18171j.m13591a(this.f18174m);
            if (!TextUtils.isEmpty(this.f18174m.m14612A())) {
                CharSequence charSequence = this.f18174m.m14612A().toString();
                if (this.f18174m.m14631T() != null) {
                    String valueOf = String.valueOf(String.valueOf(charSequence).concat("\n\n"));
                    String valueOf2 = String.valueOf(getResources().getString(C7582R.string.original_air_date, new Object[]{this.f18174m.m14631T().f12979d}));
                    charSequence = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                this.f18170i.setText(charSequence);
                Context context = getContext();
                if (!c && C1601a.m9200a(context)) {
                    C1601a.m9199a(context, context.getString(C7582R.string.accessibility_announcement_episode_expanded), this.f18170i, true);
                }
            }
            if (this.f18172k != null) {
                this.f18172k.m13769a(this.f18178q, this.f18177p);
            }
        }
        if (this.f18180s != null) {
            this.f18180s.mo3002a(this);
        }
        this.f18182u.post(this.f18181t);
    }

    protected void onDetachedFromWindow() {
        this.f18182u.removeCallbacks(this.f18181t);
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18168g = (ViewStub) findViewById(C7582R.id.expanded_content_stub);
        this.f18162a = (TextView) findViewById(C7582R.id.episode_number);
        this.f18163b = (PlayActionButtonV2) findViewById(C7582R.id.buy_button);
        this.f18164c = (TextView) findViewById(C7582R.id.episode_title);
        this.f18165d = (TextView) findViewById(C7582R.id.episode_full_price);
        this.f18166e = (TextView) findViewById(C7582R.id.added_state);
        this.f18167f = findViewById(C7582R.id.added_drawable);
    }

    public void setShareStatus(C1565a c1565a) {
        this.f18177p = c1565a;
    }

    public final void m17299a(Document document, Document document2, boolean z, boolean z2, C1565a c1565a, C3748a c3748a, boolean z3, af afVar, ch chVar, ad adVar, C2495w c2495w) {
        this.f18173l = document;
        this.f18174m = document2;
        this.f18175n = z2;
        this.f18176o = z;
        this.f18177p = c1565a;
        this.f18183v = c3748a;
        this.f18179r = z3;
        this.f18180s = afVar;
        this.f18178q = chVar;
        this.f18185x = adVar;
        this.f18186y = c2495w;
        C2482j.m13285a(this.f18184w, document2.f14885a.f12087D);
        this.f18185x.mo1219a(this);
    }

    public static void m17293a(Resources resources, PlayActionButtonV2 playActionButtonV2, TextView textView, View view, Document document, Document document2, boolean z, C3748a c3748a, ad adVar, C2495w c2495w) {
        playActionButtonV2.setVisibility(0);
        Account cY = C1473m.f7980a.cY();
        C1473m.f7980a.ah();
        Account a = C1473m.f7980a.mo2045Y().m11642a(document2, cY);
        bl[] blVarArr = document2.f14885a.f12107n;
        C1473m.f7980a.mo2044X();
        int a2 = C2288b.m11785a(blVarArr);
        if (a != null) {
            m17294a(playActionButtonV2);
            if (document2.f14885a.f12098e == 19) {
                playActionButtonV2.setEnabled(false);
                a2 = C7582R.string.purchased_list_state;
            } else {
                playActionButtonV2.setEnabled(true);
                a2 = C7582R.string.play;
            }
            playActionButtonV2.m6000a(4, a2, new ae(c2495w, adVar, c3748a, a, document2));
        } else if (a2 > 0) {
            String string;
            String str;
            bl a3;
            int i;
            C1473m.f7980a.mo2044X();
            bl a4 = C2288b.m11786a(blVarArr, true, null);
            m17294a(playActionButtonV2);
            if (document2.f14885a.f12098e == 19) {
                Object obj = null;
                Object obj2 = null;
                for (bl blVar : blVarArr) {
                    int i2 = blVar.f11926p;
                    if (C2731v.RENTAL.m14768a(i2)) {
                        obj = 1;
                    } else if (C2731v.PURCHASE.m14768a(i2)) {
                        obj2 = 1;
                    }
                }
                if (obj2 == null || obj == null) {
                    if (obj2 != null) {
                        if (a2 == 1) {
                            string = resources.getString(C7582R.string.buy, new Object[]{a4.f11917g});
                        } else {
                            string = resources.getString(C7582R.string.purchase_resolution, new Object[]{a4.f11917g});
                        }
                    } else if (obj != null) {
                        if (a2 == 1) {
                            string = resources.getString(C7582R.string.rent, new Object[]{a4.f11917g});
                        } else {
                            string = resources.getString(C7582R.string.rent_resolution, new Object[]{a4.f11917g});
                        }
                    }
                    if (string == null) {
                        str = string;
                    } else if (C1473m.f7980a.dj().mo2294a(12626439)) {
                        a3 = m17292a(document2);
                        if (a3 == null) {
                            string = null;
                        } else {
                            string = a3.f11917g;
                        }
                        str = string;
                    } else {
                        if (a4.aL_()) {
                            string = a4.f11917g;
                        } else {
                            string = null;
                        }
                        str = string;
                    }
                    if (a2 == 1) {
                        i = a4.f11926p;
                    } else {
                        i = 0;
                    }
                    playActionButtonV2.mo2588a(4, str, c3748a.mo3624a(cY, document2, i, null, null, 200, adVar, c2495w));
                } else {
                    string = resources.getString(C7582R.string.purchase_or_rent_resolution, new Object[]{a4.f11917g});
                    if (string == null) {
                        str = string;
                    } else if (C1473m.f7980a.dj().mo2294a(12626439)) {
                        if (a4.aL_()) {
                            string = null;
                        } else {
                            string = a4.f11917g;
                        }
                        str = string;
                    } else {
                        a3 = m17292a(document2);
                        if (a3 == null) {
                            string = a3.f11917g;
                        } else {
                            string = null;
                        }
                        str = string;
                    }
                    if (a2 == 1) {
                        i = 0;
                    } else {
                        i = a4.f11926p;
                    }
                    playActionButtonV2.mo2588a(4, str, c3748a.mo3624a(cY, document2, i, null, null, 200, adVar, c2495w));
                }
            }
            string = null;
            if (string == null) {
                str = string;
            } else if (C1473m.f7980a.dj().mo2294a(12626439)) {
                a3 = m17292a(document2);
                if (a3 == null) {
                    string = null;
                } else {
                    string = a3.f11917g;
                }
                str = string;
            } else {
                if (a4.aL_()) {
                    string = a4.f11917g;
                } else {
                    string = null;
                }
                str = string;
            }
            if (a2 == 1) {
                i = a4.f11926p;
            } else {
                i = 0;
            }
            playActionButtonV2.mo2588a(4, str, c3748a.mo3624a(cY, document2, i, null, null, 200, adVar, c2495w));
        } else {
            if (document != null) {
                C1473m.f7980a.mo2044X();
                if (C2288b.m11785a(document.f14885a.f12107n) > 0) {
                    playActionButtonV2.setDrawAsLabel(true);
                    playActionButtonV2.setActionStyle(2);
                    playActionButtonV2.setEnabled(false);
                    playActionButtonV2.mo2588a(4, playActionButtonV2.getText().toString(), null);
                    playActionButtonV2.m6000a(4, (int) C7582R.string.season_only_purchase, null);
                }
            }
            playActionButtonV2.setVisibility(4);
        }
        if (textView != null) {
            int i3 = z ? 0 : 8;
            view.setVisibility(i3);
            textView.setVisibility(i3);
        }
    }

    private static void m17294a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.setDrawAsLabel(false);
        playActionButtonV2.setActionStyle(2);
        playActionButtonV2.setEnabled(true);
    }

    public ce getPlayStoreUiElement() {
        return this.f18184w;
    }

    public ad getParentNode() {
        return this.f18185x;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
