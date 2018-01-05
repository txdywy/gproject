package com.google.android.instantapps.common.loading.ui;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v4.p028a.C0216d;
import android.support.v4.p037h.C0308c;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.instantapps.common.C3423l;
import com.google.android.instantapps.common.C5804k;
import com.google.android.instantapps.common.atom.AtomReference;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.loading.C5805a;
import com.google.android.instantapps.common.loading.C5806c;
import com.google.android.instantapps.common.loading.C5807d;
import com.google.android.instantapps.common.loading.C5808e;
import com.google.android.instantapps.common.loading.C5809f;
import com.google.android.instantapps.common.loading.C5810g;
import com.google.android.instantapps.common.loading.C5811h;
import com.google.android.instantapps.common.loading.C5813j;
import com.google.android.instantapps.common.loading.C5814k;
import com.google.android.instantapps.common.loading.C5815l;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p217e.bj;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p221d.p222a.af;
import com.google.android.instantapps.common.p316c.C5705a;
import com.google.android.instantapps.common.p316c.C5706b;
import com.google.android.instantapps.p309a.C5699f;
import com.google.android.p306h.p307a.p308a.C5684u;
import java.util.Set;
import p002a.C0002a;

public final class C5822h extends C5820e implements C5819d {
    public static final C5804k f29284d = new C5804k("LoadingFullscreenFragment");
    public boolean aA;
    public int aB = 0;
    public C5706b aC;
    public C5705a aD;
    public C5710a aE;
    public AtomReference aF;
    public String aG;
    public float aH;
    public int aI;
    public C5837w aJ;
    public int aK = 0;
    public String aL;
    public af aM;
    public SharedPreferences aN;
    public C5785k aO;
    public C3423l aP;
    public bf aQ;
    public C5839y aR;
    public C5815l aS;
    public C5806c aT;
    public boolean aU;
    public boolean aV;
    public boolean aW;
    public boolean aX;
    public boolean aY;
    public boolean aZ = false;
    public TextView af;
    public ImageView ag;
    public View ah;
    public View ai;
    public View aj;
    public ProgressBar ak;
    public C5836v al;
    public View am;
    public TextView an;
    public View ao;
    public Button ap;
    public Button aq;
    public Button ar;
    public ImageView as;
    public C5816a at;
    public final Set au = new C0308c();
    public boolean av;
    public boolean aw;
    public int ax;
    public boolean ay;
    public PopupMenu az;
    public Runnable ba;
    public C0002a bb;
    public View f29285e;
    public PreviewImageView f29286f;
    public ViewGroup f29287g;
    public ViewGroup f29288h;
    public TextView f29289i;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        af c5710a;
        byte[] bArr = null;
        if (VERSION.SDK_INT <= 25) {
            this.aT = ((C5807d) m603h()).m27215a();
        }
        C5805a.f29260a.mo3519a(this);
        this.c = true;
        this.f29285e = layoutInflater.inflate(C5811h.loading_fullscreen_fragment, viewGroup, false);
        this.f29286f = (PreviewImageView) this.f29285e.findViewById(C5810g.preview_image);
        this.f29287g = (ViewGroup) this.f29285e.findViewById(C5810g.loading_body);
        this.f29288h = (ViewGroup) this.f29285e.findViewById(C5810g.toolbar);
        this.f29285e.findViewById(C5810g.lock_view);
        this.f29289i = (TextView) this.f29285e.findViewById(C5810g.url_view);
        this.af = (TextView) this.f29285e.findViewById(C5810g.app_name);
        this.ag = (ImageView) this.f29285e.findViewById(C5810g.app_icon);
        this.ah = this.f29285e.findViewById(C5810g.instant_app_subtitle);
        this.f29285e.findViewById(C5810g.instant_app_subtitle_image);
        this.ai = this.f29285e.findViewById(C5810g.close_button);
        this.aj = this.f29285e.findViewById(C5810g.more_button);
        this.ak = (ProgressBar) this.f29285e.findViewById(C5810g.progress_spinner);
        this.al = new C5836v(this, (ProgressBar) this.f29285e.findViewById(C5810g.progress_bar), (ProgressBar) this.f29285e.findViewById(C5810g.skeleton_progress_bar));
        this.am = this.f29285e.findViewById(C5810g.speed_bump);
        this.an = (TextView) this.f29285e.findViewById(C5810g.embedded_opt_in_description);
        this.ao = this.f29285e.findViewById(C5810g.confirm_button);
        this.ap = (Button) this.f29285e.findViewById(C5810g.embedded_opt_in_confirm_button);
        this.aq = (Button) this.f29285e.findViewById(C5810g.browser_button);
        this.ar = (Button) this.f29285e.findViewById(C5810g.embedded_opt_in_decline_button);
        this.as = (ImageView) this.f29285e.findViewById(C5810g.google_play_logo);
        C5710a c5710a2 = this.aE;
        Bundle bundle2 = this.f760q.getBundle("ARG_LOGGING_CONTEXT");
        if (bundle2.containsKey("logging.odyssey.BaseLoggingContext.currentId") && bundle2.containsKey("logging.odyssey.BaseLoggingContext.hasParentEvent")) {
            c5710a = new C5710a(c5710a2, bundle2);
        } else {
            c5710a = null;
        }
        this.aM = c5710a;
        C5699f.m26959a(this.aM);
        if (mo968W()) {
            this.f29285e.setVisibility(4);
        }
        C5705a c5705a = this.aD;
        if (this.aF != null) {
            bArr = this.aF.f28860d;
        }
        this.aC = new C5706b(c5705a, bArr);
        if (this.aL != null) {
            mo5171b(this.aL);
        }
        if (m605i().getConfiguration().orientation != 1) {
            this.f29286f.setVisibility(4);
            C5836v c5836v = this.al;
            c5836v.f29305c = true;
            if (c5836v.f29304b.getVisibility() == 0) {
                c5836v.f29304b.setVisibility(4);
                c5836v.f29303a.setVisibility(0);
            }
        }
        this.aW = true;
        aj();
        return this.f29285e;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.aB = 0;
        this.ax = 0;
        this.av = false;
        this.aw = false;
        this.f29285e.postDelayed(new C5825k(this), 250);
        this.aH = 0.0f;
        this.aI = 0;
        this.aK = 100;
        this.ao.setOnClickListener(new C5827m(this));
        this.ap.setOnClickListener(new C5828n(this));
        this.aq.setOnClickListener(new C5829o(this));
        this.ar.setOnClickListener(new C5830p(this));
        this.ai.setOnClickListener(new C5831q(this));
        this.aj.setOnClickListener(new C5832r(this));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (((bj) this.bb.mo1a()).f29103a && configuration.orientation == 2) {
            C5836v c5836v = this.al;
            c5836v.f29305c = true;
            if (c5836v.f29304b.getVisibility() == 0) {
                c5836v.f29304b.setVisibility(4);
                c5836v.f29303a.setVisibility(0);
            }
            this.ba = null;
            this.f29286f.setVisibility(4);
            this.f29287g.animate().cancel();
            this.f29287g.setAlpha(1.0f);
            this.f29287g.setScaleX(1.0f);
            this.f29287g.setScaleY(1.0f);
            if (this.aY) {
                this.f29288h.animate().cancel();
                this.f29288h.setY(0.0f);
            }
        }
    }

    private final void ai() {
        if (!ac()) {
            if ((this.f29285e.getVisibility() == 0 ? 1 : 0) == 0) {
                if (this.c) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(m601g(), C5808e.task_open_enter);
                    loadAnimation.setAnimationListener(new C5833s(this));
                    this.au.add(loadAnimation);
                    this.f29285e.setVisibility(0);
                    this.f29285e.startAnimation(loadAnimation);
                    return;
                }
                this.f29285e.setVisibility(0);
            }
        }
    }

    public final void mo5169a(String str) {
        this.aG = str;
        if (this.aT != null) {
            throw new NoSuchMethodError();
        }
    }

    public final void mo5166a(int i) {
        if (this.ax == 3) {
            ad();
            return;
        }
        if (i == 2 || i == 4) {
            this.aM.mo5136a(103);
            if (i == 4) {
                this.am.setPadding(0, m605i().getDimensionPixelSize(C5809f.loading_fs_appinfo_embedded_opt_in_speedbump_padding), 0, 0);
                this.an.setMovementMethod(LinkMovementMethod.getInstance());
                this.an.setVisibility(0);
                this.ao.setVisibility(8);
                this.aq.setVisibility(8);
                Button button = this.ap;
                C5839y c5839y = this.aR;
                c5839y.m27264a();
                button.setText(c5839y.f29317c);
                this.ap.setVisibility(0);
                if (this.aX) {
                    this.ar.setText(m605i().getString(C5814k.loading_embedded_opt_in_cancel));
                } else {
                    button = this.ar;
                    c5839y = this.aR;
                    c5839y.m27264a();
                    button.setText(c5839y.f29318d);
                }
                this.ar.setVisibility(0);
            }
            ai();
        }
        this.ax = i;
        ad();
    }

    public final void mo5171b(String str) {
        String[] split = str.split("://", 2);
        if (split.length > 1) {
            str = split[split.length - 1];
        }
        if (this.f29289i == null) {
            this.aL = str;
        } else {
            this.f29289i.setText(str);
        }
    }

    public final void mo5164Z() {
        this.aZ = true;
    }

    public final void mo5168a(AtomReference atomReference) {
        this.aF = atomReference;
        byte[] bArr = atomReference.f28860d;
        if (this.aC != null) {
            this.aC.f28870a = bArr;
        }
        if (bArr != null) {
            try {
                this.aM.mo5138a(C5684u.m26922a(bArr));
            } catch (Throwable e) {
                throw new IllegalStateException("Dimension proto could not be parsed", e);
            }
        }
        ah();
    }

    public final void mo5172c(String str) {
        this.af.setText(str);
        this.av = true;
        ad();
    }

    public final void mo5167a(Bitmap bitmap) {
        Drawable bitmapDrawable;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable(m605i(), bitmap);
        } else {
            bitmapDrawable = C0216d.m1112a(m601g(), C5813j.ic_launcher);
        }
        this.ag.setImageDrawable(bitmapDrawable);
        this.aw = true;
        if (this.aB != 0) {
            this.ag.setVisibility(0);
        }
        ad();
    }

    public final void mo5165a(float f) {
        this.al.m27250a();
        this.al.m27252b();
        if (al()) {
            this.aH = f;
            this.al.m27251a(0);
        } else {
            C5836v c5836v = this.al;
            if (c5836v.f29305c || !((bj) c5836v.f29306d.bb.mo1a()).f29103a || c5836v.f29306d.ba == null) {
                c5836v.f29304b.setVisibility(4);
                c5836v.f29303a.setVisibility(0);
            } else {
                c5836v.f29303a.setVisibility(4);
                c5836v.f29304b.setVisibility(0);
            }
            this.aI = Math.round((100.0f * (f - this.aH)) / (1.0f - this.aH));
            this.al.m27251a(Math.min(this.aI, this.aK));
        }
        am();
    }

    public final void aa() {
        this.ay = true;
        ad();
    }

    public final void mo979u() {
        super.mo979u();
        this.aC.m26968a("IASupervisor.LoadingScreenFragment.onResume");
        this.aM.mo5136a(101);
    }

    public final void mo980v() {
        super.mo980v();
        this.aC.m26968a("IASupervisor.LoadingScreenFragment.onPause");
        this.aM.mo5136a(102);
    }

    private final void aj() {
        if (!this.aU && this.aV && !m603h().getSharedPreferences("com.google.android.instantapps.installer.prefs", 0).getBoolean("SETTINGS_REMINDER_SHOWN", false) && m603h().getSharedPreferences("com.google.android.instantapps.installer.prefs", 0).getBoolean("PHONESKY_TOS_INSTANT_APPS_OPT_IN_SUCCESS", false)) {
            ak();
            Editor edit = m603h().getSharedPreferences("com.google.android.instantapps.installer.prefs", 0).edit();
            edit.putBoolean("SETTINGS_REMINDER_SHOWN", true);
            edit.commit();
            this.aU = true;
        }
    }

    public final void mo5163Y() {
        this.aV = true;
        if (this.aW) {
            aj();
        }
    }

    private final void ak() {
        this.aM.mo5136a(107);
        this.at = new C5816a();
        this.at.f29274a = this;
        this.f730B.mo284a().mo325a(16908290, this.at).mo334c();
    }

    public final void mo5162X() {
        if (this.at == null) {
            C5699f.m26959a(this.aG);
            int i = this.aN.getInt("settingsReminderViewsLeft", 0);
            int intValue = ((Integer) this.aQ.mo5158a()).intValue();
            if (!(i == 0 || intValue == 0)) {
                intValue = i;
            }
            if (intValue > 0) {
                ai();
                ak();
                intValue--;
            }
            this.aN.edit().putInt("settingsReminderViewsLeft", intValue).apply();
            if (intValue == 0) {
                this.aO.m27187a(this.aG, new C5835u());
            }
        }
    }

    public final void cx_() {
        this.aM.mo5136a(108);
        this.aN.edit().putInt("settingsReminderViewsLeft", 0).apply();
        this.aO.m27187a(this.aG, new C5835u());
        m580a(this.aP.mo3522a());
    }

    private final boolean al() {
        boolean z;
        C5836v c5836v = this.al;
        if (c5836v.f29304b.getVisibility() == 0 || c5836v.f29303a.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    final void ab() {
        if (!ac()) {
            this.aB = 2;
            ad();
        }
    }

    final boolean ac() {
        return this.aB == 4;
    }

    private final void am() {
        bj bjVar = (bj) this.bb.mo1a();
        if (this.ax == 3 && bjVar.f29103a) {
            if (!(this.ba == null || !m27234b(bjVar.f29104b) || this.f29286f.m27217a())) {
                new Handler().postDelayed(this.ba, (long) bjVar.f29105c);
            }
            if (m27234b(bjVar.f29106d) && !this.f29286f.f29266e) {
                PreviewImageView previewImageView = this.f29286f;
                previewImageView.f29266e = true;
                previewImageView.invalidate();
                new Handler().postDelayed(new C5823i(this, bjVar), (long) bjVar.f29112j);
            }
        }
    }

    private final boolean m27234b(int i) {
        int progress;
        if (this.al.f29303a.getMax() > 0) {
            progress = (int) ((((float) this.al.f29303a.getProgress()) / ((float) this.al.f29303a.getMax())) * 100.0f);
        } else {
            progress = 0;
        }
        if (progress > i) {
            return true;
        }
        return false;
    }

    final void ad() {
        switch (this.aB) {
            case 0:
                if (this.av && this.ax != 0) {
                    if (this.aw) {
                        this.ag.setVisibility(0);
                    }
                    this.af.setVisibility(0);
                    this.ah.setVisibility(0);
                    this.ak.setVisibility(4);
                    if (this.ax == 2 || this.ax == 4) {
                        this.aB = 1;
                        this.am.setVisibility(0);
                    } else {
                        af();
                        ab();
                    }
                }
                an();
                break;
            case 2:
                if (this.ay && this.aJ == null) {
                    if (this.az != null || this.ax == 2 || this.ax == 4) {
                        this.aB = 3;
                        this.am.setVisibility(0);
                        C5836v c5836v = this.al;
                        if (c5836v.f29305c || !((bj) c5836v.f29306d.bb.mo1a()).f29103a || c5836v.f29306d.ba == null) {
                            c5836v.f29304b.setVisibility(4);
                            c5836v.f29303a.setVisibility(4);
                        } else {
                            c5836v.f29303a.setVisibility(4);
                            c5836v.f29304b.setVisibility(4);
                        }
                        if (((bj) this.bb.mo1a()).f29103a) {
                            this.f29287g.setAlpha(1.0f);
                            this.f29287g.setScaleX(1.0f);
                            this.f29287g.setScaleY(1.0f);
                            this.as.setAlpha(1.0f);
                        }
                    } else if (this.ax == 3) {
                        ae();
                    }
                }
                an();
                break;
        }
        am();
    }

    private final void an() {
        if (this.b && !this.aA) {
            this.aA = true;
            Snackbar.m499a(this.am, C5814k.loading_change_settings, 0).m493a();
        }
    }

    final void ae() {
        this.aB = 4;
        this.al.m27250a();
        this.al.m27252b();
        this.al.m27251a(100);
        this.a.mo3494k();
        if (this.ba != null) {
            this.ba.run();
        }
        bj bjVar = (bj) this.bb.mo1a();
        if (bjVar.f29103a && this.ba != null && !this.aY && this.f29286f.isShown()) {
            new Handler().postDelayed(new C5824j(this), (long) bjVar.f29112j);
            this.aY = true;
        }
    }

    final void af() {
        if (al() && !this.ay) {
            C5836v c5836v = this.al;
            if (c5836v.f29305c || !((bj) c5836v.f29306d.bb.mo1a()).f29103a || c5836v.f29306d.ba == null) {
                c5836v.f29304b.setVisibility(4);
                c5836v.f29303a.setVisibility(0);
            } else {
                c5836v.f29303a.setVisibility(4);
                c5836v.f29304b.setVisibility(0);
            }
            if (!this.al.f29303a.isIndeterminate()) {
                this.aJ = new C5837w(this);
                mo5165a(this.aH);
            }
        }
    }

    final String ag() {
        if (this.aF != null) {
            return this.aF.f28857a.f28855a;
        }
        return null;
    }

    final void ah() {
        boolean z = false;
        if (this.az != null) {
            MenuItem findItem = this.az.getMenu().findItem(C5810g.app_info);
            if (findItem != null && this.aZ) {
                findItem.setVisible(false);
            } else if (findItem != null) {
                if (ag() != null) {
                    z = true;
                }
                findItem.setEnabled(z);
            }
        }
    }
}
