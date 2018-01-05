package com.google.android.libraries.play.entertainment.story;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.C0352i;
import android.support.v4.view.ai;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.libraries.play.entertainment.C6071d;
import com.google.android.libraries.play.entertainment.C6072e;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.media.TimeBar;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6122h;

public class MediaPlayerOverlayView extends FrameLayout implements OnGestureListener {
    public static final C6090b f30304a = C6090b.m28050a();
    public static final Rect f30305i = new Rect();
    public final TimeBar f30306A;
    public final View f30307B;
    public int f30308C;
    public int f30309D;
    public C6128z f30310E;
    public boolean f30311F;
    public final C0352i f30312G;
    public final int f30313H;
    public final int f30314I;
    public int f30315J;
    public float f30316K;
    public Animator f30317L;
    public final int f30318b;
    public final int f30319c;
    public final int f30320d;
    public final int f30321e;
    public final int f30322f;
    public final int f30323g;
    public final Rect f30324h;
    public final View f30325j;
    public final PEImageView f30326k;
    public final View f30327l;
    public final View f30328m;
    public final TextView f30329n;
    public final TextView f30330o;
    public final View f30331p;
    public final RecyclerView f30332q;
    public final View f30333r;
    public final TextView f30334s;
    public final TextView f30335t;
    public final TextView f30336u;
    public final View f30337v;
    public final View f30338w;
    public final PEImageView f30339x;
    public final SVGImageView f30340y;
    public final View f30341z;

    public MediaPlayerOverlayView(Context context) {
        this(context, null, 0);
    }

    public MediaPlayerOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaPlayerOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30324h = new Rect();
        this.f30308C = 0;
        this.f30309D = 0;
        this.f30311F = false;
        this.f30315J = 0;
        Resources resources = context.getResources();
        this.f30318b = resources.getDimensionPixelSize(C6072e.pe__mini_player_height);
        this.f30320d = this.f30318b;
        this.f30319c = (this.f30318b * 16) / 9;
        this.f30321e = resources.getDimensionPixelOffset(C6072e.pe__mini_player_margin);
        this.f30322f = resources.getDimensionPixelSize(C6072e.pe_badge_size_mini);
        this.f30323g = resources.getDimensionPixelSize(C6072e.pe_mini_timebar_height);
        this.f30312G = new C0352i(context, this);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f30313H = viewConfiguration.getScaledTouchSlop();
        this.f30314I = viewConfiguration.getScaledMinimumFlingVelocity();
        LayoutInflater.from(context).inflate(C6091h.pe_media_player_overlay_view_content, this);
        this.f30325j = (View) C6116b.m28100a(findViewById(C6089g.pe_media_player_overlay_backdrop));
        this.f30326k = (PEImageView) C6116b.m28100a((PEImageView) findViewById(C6089g.pe_media_player_hero_view));
        this.f30327l = (View) C6116b.m28100a(findViewById(C6089g.pe_media_player_hero_overlay_minimize_button));
        OnClickListener c6175t = new C6175t(this);
        this.f30327l.setOnClickListener(c6175t);
        this.f30328m = (View) C6116b.m28100a(findViewById(C6089g.pe_media_player_hero_text_container));
        this.f30329n = (TextView) C6116b.m28100a(this.f30328m.findViewById(C6089g.pe_media_player_hero_title_text));
        this.f30330o = (TextView) C6116b.m28100a(this.f30328m.findViewById(C6089g.pe_media_player_hero_subtitle_text));
        this.f30331p = (View) C6116b.m28100a(findViewById(C6089g.pe_media_player_details_container));
        this.f30332q = (RecyclerView) C6116b.m28100a(this.f30331p.findViewById(C6089g.pe_media_player_track_list));
        this.f30332q.mo2951a(new C6180y(this));
        this.f30333r = (View) C6116b.m28100a(this.f30331p.findViewById(C6089g.pe_media_player_video_details_container));
        this.f30333r.findViewById(C6089g.pe_media_player_video_minimize_button).setOnClickListener(c6175t);
        this.f30334s = (TextView) C6116b.m28100a(this.f30333r.findViewById(C6089g.pe_media_player_panel_title));
        this.f30335t = (TextView) C6116b.m28100a(this.f30333r.findViewById(C6089g.pe_media_player_video_title));
        this.f30336u = (TextView) C6116b.m28100a(this.f30333r.findViewById(C6089g.pe_media_player_video_subtitle));
        this.f30337v = (View) C6116b.m28100a(findViewById(C6089g.dc_action_dock));
        this.f30338w = (View) C6116b.m28100a(findViewById(C6089g.pe_player_frame));
        this.f30339x = (PEImageView) C6116b.m28100a((PEImageView) findViewById(C6089g.pe_player_frame_thumbnail_view));
        this.f30340y = (SVGImageView) C6116b.m28100a((SVGImageView) findViewById(C6089g.toggle_playback_icon));
        this.f30341z = (View) C6116b.m28100a(findViewById(C6089g.pe_player_frame_loading_indicator));
        this.f30306A = (TimeBar) C6116b.m28100a((TimeBar) findViewById(C6089g.pe_player_frame_timebar));
        this.f30307B = (View) C6116b.m28100a(findViewById(C6089g.player_frame_badge));
        m28166c(false);
    }

    public final int m28153a() {
        return this.f30337v.getLayoutParams().height;
    }

    public void setUiStateChangeListener(C6128z c6128z) {
        this.f30310E = c6128z;
    }

    final void m28157a(int i) {
        if (this.f30309D != i) {
            if (f30304a.m28059b()) {
                switch (i) {
                    case 0:
                        f30304a.m28054a("UI state now HIDDEN", new Object[0]);
                        break;
                    case 1:
                        f30304a.m28054a("UI state now INLINING", new Object[0]);
                        break;
                    case 2:
                        f30304a.m28054a("UI state now INLINED", new Object[0]);
                        break;
                    case 3:
                        f30304a.m28054a("UI state now MINIMIZING", new Object[0]);
                        break;
                    case 4:
                        f30304a.m28054a("UI state now MINIMIZED", new Object[0]);
                        break;
                    case 5:
                        f30304a.m28054a("UI state now MAXIMIZING", new Object[0]);
                        break;
                    case 6:
                        f30304a.m28054a("UI state now MAXIMIZED", new Object[0]);
                        break;
                    case 7:
                        f30304a.m28054a("UI state now DISMISSING", new Object[0]);
                        break;
                }
            }
            int i2 = this.f30309D;
            this.f30309D = i;
            if (this.f30310E != null) {
                this.f30310E.mo5299a(i2, i);
            }
        }
    }

    public final void m28160a(boolean z) {
        this.f30324h.setEmpty();
        this.f30308C = 0;
        switch (this.f30309D) {
            case 0:
            case 7:
                return;
            case 1:
            case 3:
            case 5:
                m28166c(z);
                return;
            case 2:
            case 4:
                m28145a(z, false);
                return;
            case 6:
                m28145a(z, true);
                return;
            default:
                throw new IllegalStateException("Unknown state value");
        }
    }

    public final void m28161b() {
        this.f30324h.setEmpty();
        this.f30308C = 0;
        if (this.f30309D != 0) {
            m28166c(false);
        }
    }

    public final void m28159a(Rect rect, int i) {
        boolean z;
        C6116b.m28106b(!rect.isEmpty());
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C6116b.m28106b(z);
        this.f30324h.set(rect);
        Rect rect2 = this.f30324h;
        rect2.bottom += this.f30323g;
        this.f30308C = i;
        switch (this.f30309D) {
            case 0:
                m28171g();
                return;
            case 1:
            case 5:
            case 6:
            case 7:
                return;
            case 2:
                m28150k();
                return;
            case 3:
            case 4:
                m28145a(true, false);
                return;
            default:
                throw new IllegalStateException("Unknown state value");
        }
    }

    public final void m28165c() {
        switch (this.f30309D) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
                return;
            case 2:
                m28170f();
                m28167d(true);
                m28173i();
                m28144a(this.f30324h.left, this.f30324h.top, this.f30324h.right, this.f30324h.bottom, 1.0f, f30305i.left, f30305i.top, f30305i.right, f30305i.bottom, 1.0f, 2, 5, 0.0f, false);
                return;
            case 4:
                m28152m();
                return;
            default:
                throw new IllegalStateException("Unknown state value");
        }
    }

    public final void m28164b(boolean z) {
        Object obj = this.f30311F != z ? 1 : null;
        this.f30311F = z;
        switch (this.f30309D) {
            case 0:
            case 3:
            case 7:
                return;
            case 1:
            case 5:
                m28172h();
                return;
            case 2:
                C6116b.m28103a(!this.f30324h.isEmpty());
                m28170f();
                m28151l();
                m28144a(this.f30324h.left, this.f30324h.top, this.f30324h.right, this.f30324h.bottom, 1.0f, f30305i.left, f30305i.top, f30305i.right, f30305i.bottom, 1.0f, 2, 3, 0.0f, false);
                return;
            case 4:
                if (obj != null) {
                    m28170f();
                    m28151l();
                    int a = this.f30311F ? m28153a() : -m28153a();
                    m28144a(f30305i.left, f30305i.top + a, f30305i.right, f30305i.bottom + a, 1.0f, f30305i.left, f30305i.top, f30305i.right, f30305i.bottom, 1.0f, 4, 3, 0.0f, false);
                    return;
                }
                return;
            case 6:
                m28156a(0.0f, false);
                return;
            default:
                throw new IllegalStateException("Unknown state value");
        }
    }

    final void m28163b(int i) {
        if (i != this.f30315J) {
            this.f30315J = i;
            if (f30304a.m28059b()) {
                switch (i) {
                    case 0:
                        f30304a.m28054a("G state now IDLE", new Object[0]);
                        break;
                    case 1:
                        f30304a.m28054a("G state now DOWN_ON_MINI_PLAYER", new Object[0]);
                        break;
                    case 2:
                        f30304a.m28054a("G state now DISMISSING_MINI_PLAYER", new Object[0]);
                        break;
                    case 3:
                        f30304a.m28054a("G state now MAXIMIZING_MINI_PLAYER", new Object[0]);
                        break;
                    case 4:
                        f30304a.m28054a("G state now DOWN_ON_FULL_PLAYER", new Object[0]);
                        break;
                    case 5:
                        f30304a.m28054a("G state now MINIMIZING_FULL_PLAYER", new Object[0]);
                        break;
                }
            }
            if (this.f30310E != null) {
                this.f30310E.mo5298a(i);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f30309D) {
            case 0:
                return false;
            case 1:
            case 3:
            case 5:
            case 7:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            case 2:
            case 4:
                if ((motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) || !m28146a(motionEvent)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            case 6:
                if (this.f30315J != 0 || motionEvent.getActionMasked() != 0) {
                    return (this.f30315J == 4 || this.f30315J == 5) ? this.f30312G.m2036a(motionEvent) : false;
                } else {
                    this.f30312G.m2036a(motionEvent);
                    return false;
                }
            default:
                throw new IllegalStateException("Unknown state value");
        }
    }

    private final boolean m28146a(MotionEvent motionEvent) {
        return C6122h.m28133a(this.f30338w, motionEvent.getX(), motionEvent.getY());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30309D) {
            case 0:
            case 2:
                return false;
            case 1:
            case 3:
            case 5:
            case 7:
                if (this.f30315J == 0) {
                    return false;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                this.f30312G.m2036a(obtain);
                obtain.recycle();
                m28169e();
                return false;
            case 4:
                if (motionEvent.getActionMasked() == 5) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0 && !m28146a(motionEvent)) {
                    return false;
                }
            case 6:
                if (!(this.f30315J == 4 || this.f30315J == 5)) {
                    if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        return true;
                    }
                    return false;
                }
                break;
            default:
                throw new IllegalStateException("Unknown state value");
        }
        if (this.f30312G.m2036a(motionEvent)) {
            return true;
        }
        if (motionEvent.getActionMasked() == 1) {
            int i = this.f30315J;
            m28163b(0);
            switch (i) {
                case 2:
                    if (Math.abs(this.f30316K) > 0.5f) {
                        m28143a(this.f30316K, false, false);
                    } else {
                        m28143a(this.f30316K, false, true);
                    }
                    return true;
                case 3:
                    if (Math.abs(this.f30316K) > 0.5f) {
                        m28156a(this.f30316K, false);
                    } else {
                        m28156a(Math.max(0.0f, this.f30316K + 1.0f), false);
                    }
                    return true;
                case 5:
                    if (Math.abs(this.f30316K) > 0.5f) {
                        m28156a(this.f30316K, false);
                    } else {
                        m28156a(Math.min(-0.0f, this.f30316K - 1.0f), false);
                    }
                    return true;
                default:
                    return false;
            }
        } else if (motionEvent.getActionMasked() != 3) {
            return false;
        } else {
            m28169e();
            return true;
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f30309D) {
            case 4:
                if (!m28146a(motionEvent)) {
                    return false;
                }
                m28163b(1);
                return true;
            case 6:
                if (!m28168d() || motionEvent.getY() < ((float) this.f30331p.getTop()) || motionEvent.getY() > ((float) this.f30331p.getBottom())) {
                    m28163b(4);
                    return true;
                } else if (this.f30315J != 4) {
                    return false;
                } else {
                    m28163b(0);
                    return false;
                }
            default:
                m28169e();
                return false;
        }
    }

    final boolean m28168d() {
        if (this.f30332q.getVisibility() != 0 || this.f30332q.getChildCount() == 0) {
            return false;
        }
        View childAt = this.f30332q.getChildAt(0);
        if (RecyclerView.m262d(childAt) != 0 || childAt.getTop() < 0) {
            return true;
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i = this.f30315J;
        m28163b(0);
        if (this.f30309D != 4 || i != 1) {
            return false;
        }
        m28152m();
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.f30315J) {
            case 1:
                float y = motionEvent2.getY() - motionEvent.getY();
                if (y <= ((float) (-this.f30313H))) {
                    m28163b(3);
                    this.f30316K = m28148d(y);
                } else {
                    y = motionEvent2.getX() - motionEvent.getX();
                    if (Math.abs(y) >= ((float) this.f30313H)) {
                        m28163b(2);
                        this.f30316K = m28147c(y);
                    }
                }
                return true;
            case 2:
                this.f30316K = m28147c(motionEvent2.getX() - motionEvent.getX());
                return true;
            case 3:
                this.f30316K = m28148d(Math.min(-0.0f, motionEvent2.getY() - motionEvent.getY()));
                return true;
            case 4:
                float y2 = motionEvent2.getY() - motionEvent.getY();
                if (y2 < ((float) this.f30313H)) {
                    return false;
                }
                m28163b(5);
                this.f30316K = m28148d(y2);
                return true;
            case 5:
                this.f30316K = m28148d(Math.max(0.0f, motionEvent2.getY() - motionEvent.getY()));
                return true;
            default:
                return false;
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3 = -0.0f;
        boolean z = false;
        int i = this.f30315J;
        m28163b(0);
        switch (i) {
            case 1:
                if (f2 > ((float) (-this.f30314I))) {
                    if (Math.abs(f) >= ((float) this.f30314I)) {
                        if (f >= 0.0f) {
                            f3 = 0.0f;
                        }
                        m28143a(f3, true, false);
                        break;
                    }
                }
                m28152m();
                break;
                break;
            case 2:
                if (this.f30316K == 0.0f) {
                    if (f > ((float) (-this.f30314I))) {
                        if (f >= ((float) this.f30314I)) {
                            m28143a(0.0f, true, false);
                            break;
                        }
                    }
                    m28143a(-0.0f, true, false);
                    break;
                } else if (this.f30316K < 0.0f) {
                    if (f <= ((float) (-this.f30314I))) {
                        m28143a(this.f30316K, true, false);
                        break;
                    } else if (f >= ((float) this.f30314I)) {
                        z = true;
                    }
                } else if (f >= ((float) this.f30314I)) {
                    m28143a(this.f30316K, true, false);
                    break;
                } else if (f <= ((float) (-this.f30314I))) {
                    z = true;
                }
                m28143a(this.f30316K, z, true);
                break;
            case 3:
                if (f2 > ((float) (-this.f30314I))) {
                    if (f2 >= ((float) this.f30314I)) {
                        z = true;
                    }
                    m28156a(Math.max(0.0f, this.f30316K + 1.0f), z);
                    break;
                }
                m28156a(this.f30316K, true);
                break;
            case 4:
                if (f2 >= ((float) this.f30314I)) {
                    m28156a(0.0f, false);
                    break;
                }
                break;
            case 5:
                if (f2 < ((float) this.f30314I)) {
                    if (f2 <= ((float) (-this.f30314I))) {
                        z = true;
                    }
                    m28156a(Math.min(-0.0f, this.f30316K - 1.0f), z);
                    break;
                }
                m28156a(this.f30316K, true);
                break;
        }
        return true;
    }

    public final void m28169e() {
        int i = this.f30315J;
        m28163b(0);
        switch (i) {
            case 2:
                if (this.f30309D == 4) {
                    m28143a(this.f30316K, false, true);
                    return;
                }
                return;
            case 3:
                if (this.f30309D == 4) {
                    m28156a(Math.max(0.0f, this.f30316K + 1.0f), false);
                    return;
                }
                return;
            case 5:
                if (this.f30309D == 6) {
                    m28156a(Math.min(-0.0f, this.f30316K - 1.0f), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    final void m28170f() {
        if (this.f30317L != null) {
            this.f30317L.cancel();
            this.f30317L = null;
        }
    }

    final void m28166c(boolean z) {
        m28170f();
        m28169e();
        m28167d(false);
        this.f30337v.setVisibility(8);
        this.f30338w.setVisibility(8);
        if (z) {
            this.f30309D = 0;
        } else {
            m28157a(0);
        }
    }

    private final void m28145a(boolean z, boolean z2) {
        boolean z3 = z2 || this.f30309D == 2;
        if (z) {
            this.f30309D = 7;
        } else {
            m28157a(7);
        }
        m28170f();
        Animator ofFloat = ObjectAnimator.ofFloat(this.f30338w, ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(100);
        Object c6177u = new C6177u(this, z2, z3, z);
        ofFloat.addListener(c6177u);
        if (z2 || z3) {
            ofFloat.addUpdateListener(c6177u);
        }
        this.f30317L = ofFloat;
        ofFloat.start();
    }

    private final void m28143a(float f, boolean z, boolean z2) {
        int i;
        float f2;
        m28170f();
        m28167d(false);
        m28151l();
        int i2 = f30305i.left;
        int i3 = f30305i.top;
        int i4 = f30305i.right;
        int i5 = f30305i.bottom;
        if (Float.compare(f, 0.0f) < 0) {
            i = 0;
            f2 = -f;
        } else {
            i = getWidth();
            f2 = f;
        }
        int i6 = i4 + (i - i2);
        if (z2) {
            m28144a(i, i3, i6, i5, 0.0f, i2, i3, i4, i5, 1.0f, 7, 3, 1.0f - f2, z);
            return;
        }
        this.f30324h.setEmpty();
        this.f30308C = 0;
        m28144a(i2, i3, i4, i5, 1.0f, i, i3, i6, i5, 0.0f, 4, 7, f2, z);
    }

    private final float m28147c(float f) {
        int width;
        m28170f();
        m28151l();
        int i = f30305i.left;
        int i2 = f30305i.top;
        int i3 = f30305i.right;
        int i4 = f30305i.bottom;
        int width2 = f < 0.0f ? 0 : getWidth();
        if (m28149j()) {
            width = width2 - f30305i.width();
        } else {
            width = width2;
        }
        int i5 = i3 + (width - i);
        float max = Math.max(0.0f, Math.min(1.0f, f / ((float) (width - i))));
        m28158a(i, i2, i3, i4, 1.0f, width, i2, i5, i4, 0.0f, max);
        return Math.signum(f) * max;
    }

    private final boolean m28149j() {
        if (ai.f1848a.mo400k(this) == 1) {
            return true;
        }
        return false;
    }

    private final void m28150k() {
        if (this.f30309D != 2) {
            m28170f();
        }
        this.f30338w.setVisibility(0);
        Context context = getContext();
        int i = (this.f30308C == 1 || this.f30308C == 3) ? C6071d.play_movies_primary : C6071d.play_music_primary;
        this.f30306A.setPlayedColor(C0216d.m1116c(context, i));
        View view = this.f30337v;
        if (this.f30308C == 1 || this.f30308C == 2) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (this.f30307B.getBackground() != null) {
            this.f30307B.setVisibility(0);
            m28155a(1.0f, 1.0f);
        } else {
            this.f30307B.setVisibility(8);
        }
        m28167d(false);
        C6122h.m28131a(this.f30338w, this.f30324h);
        m28157a(2);
    }

    final void m28171g() {
        m28150k();
        Animator ofFloat = ObjectAnimator.ofFloat(this.f30338w, ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(100);
        Object c6178v = new C6178v(this);
        ofFloat.addListener(c6178v);
        ofFloat.addUpdateListener(c6178v);
        this.f30317L = ofFloat;
        ofFloat.start();
    }

    private final void m28151l() {
        Rect rect = f30305i;
        rect.bottom = (getHeight() - this.f30321e) - (this.f30311F ? m28153a() : 0);
        rect.top = (rect.bottom - this.f30323g) - this.f30318b;
        switch (this.f30308C) {
            case 1:
            case 3:
                if (m28149j()) {
                    rect.left = this.f30321e;
                    rect.right = rect.left + this.f30319c;
                    return;
                }
                rect.right = getWidth() - this.f30321e;
                rect.left = rect.right - this.f30319c;
                return;
            case 2:
            case 4:
                if (m28149j()) {
                    rect.left = this.f30321e;
                    rect.right = rect.left + this.f30320d;
                    return;
                }
                rect.right = getWidth() - this.f30321e;
                rect.left = rect.right - this.f30320d;
                return;
            default:
                throw new IllegalStateException("uiStyle not YOUTUBE or MUSIC");
        }
    }

    final void m28172h() {
        m28170f();
        m28167d(false);
        m28151l();
        C6122h.m28131a(this.f30338w, f30305i);
        this.f30338w.setAlpha(1.0f);
        this.f30306A.setAlpha(1.0f);
        this.f30307B.setAlpha(0.0f);
        m28157a(4);
    }

    final void m28173i() {
        Rect rect = f30305i;
        switch (this.f30308C) {
            case 1:
            case 3:
                rect.left = 0;
                rect.top = 0;
                rect.right = ((PEImageView) C6116b.m28100a(this.f30326k)).getWidth();
                rect.bottom = this.f30326k.getHeight() + this.f30323g;
                return;
            case 2:
            case 4:
                rect.bottom = (((PEImageView) C6116b.m28100a(this.f30326k)).getHeight() - this.f30321e) + this.f30323g;
                rect.top = (rect.bottom - this.f30323g) - this.f30320d;
                if (m28149j()) {
                    rect.right = getWidth() - this.f30321e;
                    rect.left = rect.right - this.f30320d;
                    return;
                }
                rect.left = this.f30321e;
                rect.right = rect.left + this.f30320d;
                return;
            default:
                throw new IllegalStateException("uiStyle not YOUTUBE or MUSIC");
        }
    }

    final void m28167d(boolean z) {
        int i;
        int i2 = 0;
        this.f30338w.setAlpha(1.0f);
        int i3 = (this.f30308C == 2 || this.f30308C == 4) ? 1 : 0;
        View view = this.f30325j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        PEImageView pEImageView = this.f30326k;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        pEImageView.setVisibility(i);
        View view2 = this.f30327l;
        if (!z || i3 == 0) {
            i = 8;
        } else {
            i = 0;
        }
        view2.setVisibility(i);
        view2 = this.f30328m;
        if (!z || i3 == 0) {
            i = 8;
        } else {
            i = 0;
        }
        view2.setVisibility(i);
        RecyclerView recyclerView = this.f30332q;
        if (!z || i3 == 0) {
            i = 8;
        } else {
            i = 0;
        }
        recyclerView.setVisibility(i);
        View view3 = this.f30333r;
        if (!(z && i3 == 0)) {
            i2 = 8;
        }
        view3.setVisibility(i2);
        if (!z) {
            this.f30306A.setAlpha(i3 != 0 ? 1.0f : 0.0f);
        }
    }

    private final void m28152m() {
        m28156a(-0.0f, false);
    }

    final void m28156a(float f, boolean z) {
        m28170f();
        m28167d(true);
        m28151l();
        int i = f30305i.left;
        int i2 = f30305i.top;
        int i3 = f30305i.right;
        int i4 = f30305i.bottom;
        m28173i();
        int i5 = f30305i.left;
        int i6 = f30305i.top;
        int i7 = f30305i.right;
        int i8 = f30305i.bottom;
        if (Float.compare(f, 0.0f) < 0) {
            m28144a(i, i2, i3, i4, 1.0f, i5, i6, i7, i8, 1.0f, 4, 5, -f, z);
        } else {
            m28144a(i5, i6, i7, i8, 1.0f, i, i2, i3, i4, 1.0f, 6, 3, f, z);
        }
    }

    private final float m28148d(float f) {
        m28170f();
        m28167d(true);
        m28151l();
        int i = f30305i.left;
        int i2 = f30305i.top;
        int i3 = f30305i.right;
        int i4 = f30305i.bottom;
        m28173i();
        int i5 = f30305i.left;
        int i6 = f30305i.top;
        int i7 = f30305i.right;
        int i8 = f30305i.bottom;
        float max = Math.max(-1.0f, Math.min(1.0f, f / ((float) (i2 - i6))));
        float f2 = Float.compare(max, 0.0f) < 0 ? -max : 1.0f - max;
        m28158a(i, i2, i3, i4, 1.0f, i5, i6, i7, i8, 1.0f, f2);
        m28162b(1.0f - f2);
        m28154a(f2);
        m28155a(0.0f, f2);
        return max;
    }

    private final void m28144a(int i, int i2, int i3, int i4, float f, int i5, int i6, int i7, int i8, float f2, int i9, int i10, float f3, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        boolean z5;
        boolean z6 = 0.0f <= f3 && f3 <= 1.0f;
        C6116b.m28106b(z6);
        switch (i10) {
            case 3:
                z2 = i9 == 6;
                z3 = (i9 == 7 || i9 == 4) ? false : true;
                z4 = i9 == 2;
                if (i9 == 7 || i9 == 4) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                j = 250;
                z5 = z6;
                break;
            case 5:
                z2 = true;
                z3 = i9 == 4;
                z4 = i9 == 2;
                j = 350;
                z5 = i9 == 4;
                break;
            case 7:
                z2 = false;
                z3 = false;
                z4 = false;
                j = 150;
                z5 = false;
                break;
            default:
                throw new IllegalArgumentException();
        }
        Object c6179w = new C6179w(this, z2, i10, z3, z4, z5, i, i2, i3, i4, f, i5, i6, i7, i8, f2);
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{f3, 1.0f});
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(c6179w);
        ofFloat.addListener(c6179w);
        if (z) {
            ofFloat.setInterpolator(new DecelerateInterpolator());
        }
        m28157a(i10);
        this.f30317L = ofFloat;
        ofFloat.start();
    }

    final void m28154a(float f) {
        this.f30325j.setAlpha(f);
        this.f30326k.setAlpha(f);
        float height = ((float) this.f30326k.getHeight()) * (f - 1.0f);
        this.f30326k.setTranslationY(height);
        this.f30331p.setTranslationY(((float) this.f30331p.getHeight()) * (1.0f - f));
        float max = Math.max(0.0f, (f - 0.9f) * 10.0f);
        this.f30331p.setAlpha(max);
        this.f30306A.setAlpha(1.0f - f);
        if (this.f30308C == 2 || this.f30308C == 4) {
            this.f30327l.setAlpha(f);
            this.f30327l.setTranslationY(height);
            this.f30328m.setTranslationX(((float) this.f30328m.getWidth()) * (1.0f - f));
            this.f30328m.setAlpha(max);
        }
    }

    final void m28162b(float f) {
        if (this.f30337v.getVisibility() == 0) {
            this.f30337v.setTranslationY(((float) m28153a()) * f);
        }
    }

    final void m28155a(float f, float f2) {
        if (this.f30307B.getVisibility() == 0) {
            Drawable background = this.f30307B.getBackground();
            if (background != null) {
                float f3 = (float) this.f30322f;
                int intrinsicWidth = (int) ((((((float) background.getIntrinsicWidth()) - f3) * f) + f3) + 0.5f);
                f30305i.set(0, 0, intrinsicWidth, intrinsicWidth);
                C6122h.m28131a(this.f30307B, f30305i);
                this.f30307B.setAlpha(f2);
            }
        }
    }

    final void m28158a(int i, int i2, int i3, int i4, float f, int i5, int i6, int i7, int i8, float f2, float f3) {
        Rect rect = f30305i;
        float f4 = (float) i;
        rect.left = (int) ((f4 + ((((float) i5) - f4) * f3)) + 0.5f);
        f4 = (float) i2;
        rect.top = (int) ((f4 + ((((float) i6) - f4) * f3)) + 0.5f);
        f4 = (float) i3;
        rect.right = (int) ((f4 + ((((float) i7) - f4) * f3)) + 0.5f);
        f4 = (float) i4;
        rect.bottom = (int) ((f4 + ((((float) i8) - f4) * f3)) + 0.5f);
        C6122h.m28131a(this.f30338w, rect);
        this.f30338w.setAlpha(((f2 - f) * f3) + f);
    }
}
