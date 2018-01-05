package com.android.ex.photo.p049b;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.bw;
import android.support.v4.app.bx;
import android.support.v4.p028a.C0211f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.ex.photo.C0546h;
import com.android.ex.photo.C0547i;
import com.android.ex.photo.C0568r;
import com.android.ex.photo.C0570g;
import com.android.ex.photo.C0589w;
import com.android.ex.photo.C0592z;
import com.android.ex.photo.aa;
import com.android.ex.photo.ac;
import com.android.ex.photo.ad;
import com.android.ex.photo.p048a.C0544d;
import com.android.ex.photo.p050c.C0551b;
import com.android.ex.photo.p050c.C0553c;
import com.android.ex.photo.views.C0588f;
import com.android.ex.photo.views.PhotoView;

public class C0548a extends Fragment implements bx, OnClickListener, C0546h, C0547i {
    public String f3739a;
    public TextView af;
    public C0588f ag;
    public int ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al = true;
    public View am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public String f3740b;
    public String f3741c;
    public Intent f3742d;
    public C0570g f3743e;
    public C0544d f3744f;
    public BroadcastReceiver f3745g;
    public PhotoView f3746h;
    public ImageView f3747i;

    public static void m4047a(Intent intent, int i, boolean z, C0548a c0548a) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", intent);
        bundle.putInt("arg-position", i);
        bundle.putBoolean("arg-show-spinner", z);
        c0548a.m600f(bundle);
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.f3743e = ((C0568r) m603h()).mo994l();
        if (this.f3743e == null) {
            throw new IllegalArgumentException("Activity must be a derived class of PhotoViewActivity");
        }
        this.f3744f = this.f3743e.mo1013f();
        if (this.f3744f == null) {
            throw new IllegalStateException("Callback reported null adapter");
        }
        m4046Y();
    }

    public final void mo134a() {
        this.f3743e = null;
        super.mo134a();
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        if (bundle2 != null) {
            this.f3742d = (Intent) bundle2.getParcelable("arg-intent");
            this.ap = this.f3742d.getBooleanExtra("display_thumbs_fullscreen", false);
            this.ah = bundle2.getInt("arg-position");
            this.ak = bundle2.getBoolean("arg-show-spinner");
            this.al = true;
            if (bundle != null) {
                Bundle bundle3 = bundle.getBundle("com.android.mail.photo.fragments.PhotoViewFragment.INTENT");
                if (bundle3 != null) {
                    this.f3742d = new Intent().putExtras(bundle3);
                }
            }
            if (this.f3742d != null) {
                this.f3739a = this.f3742d.getStringExtra("resolved_photo_uri");
                this.f3740b = this.f3742d.getStringExtra("thumbnail_uri");
                this.f3741c = this.f3742d.getStringExtra("content_description");
                this.aj = this.f3742d.getBooleanExtra("watch_network", false);
            }
        }
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(ac.photo_fragment_view, viewGroup, false);
        this.f3746h = (PhotoView) inflate.findViewById(aa.photo_view);
        this.f3746h.setMaxInitialScale(this.f3742d.getFloatExtra("max_scale", 1.0f));
        this.f3746h.setOnClickListener(this);
        PhotoView photoView = this.f3746h;
        boolean z = this.ai;
        if (z != photoView.f3879n) {
            photoView.f3879n = z;
            photoView.requestLayout();
            photoView.invalidate();
        }
        this.f3746h.m4178b(false);
        this.f3746h.setContentDescription(this.f3741c);
        this.am = inflate.findViewById(aa.photo_preview);
        this.f3747i = (ImageView) inflate.findViewById(aa.photo_preview_image);
        this.an = false;
        this.ag = new C0588f((ProgressBar) inflate.findViewById(aa.determinate_progress), (ProgressBar) inflate.findViewById(aa.indeterminate_progress));
        this.af = (TextView) inflate.findViewById(aa.empty_text);
        inflate.findViewById(aa.retry_button);
        m4046Y();
        return inflate;
    }

    public final void mo979u() {
        super.mo979u();
        this.f3743e.mo1002a(this.ah, (C0547i) this);
        this.f3743e.mo1004a((C0546h) this);
        if (this.aj) {
            if (this.f3745g == null) {
                this.f3745g = new C0549b(this);
            }
            m603h().registerReceiver(this.f3745g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) m603h().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.ao = activeNetworkInfo.isConnected();
            } else {
                this.ao = false;
            }
        }
        if (!mo968W()) {
            this.al = true;
            this.am.setVisibility(0);
            m613o().mo311a(2, null, this);
            m613o().mo311a(3, null, this);
        }
    }

    public final void mo980v() {
        if (this.aj) {
            m603h().unregisterReceiver(this.f3745g);
        }
        this.f3743e.mo1007b((C0546h) this);
        this.f3743e.mo1010c(this.ah);
        super.mo980v();
    }

    public final void mo138d() {
        if (this.f3746h != null) {
            PhotoView photoView = this.f3746h;
            photoView.f3886u = null;
            photoView.f3887v = null;
            photoView.f3873h = null;
            photoView.f3858B.m4181a();
            photoView.f3858B = null;
            photoView.f3861E.m4184a();
            photoView.f3861E = null;
            photoView.f3862F.m4183a();
            photoView.f3862F = null;
            photoView.f3863G.f3898f = true;
            photoView.f3863G = null;
            photoView.setOnClickListener(null);
            photoView.f3888w = null;
            photoView.f3869M = false;
            this.f3746h = null;
        }
        super.mo138d();
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        if (this.f3742d != null) {
            bundle.putParcelable("com.android.mail.photo.fragments.PhotoViewFragment.INTENT", this.f3742d.getExtras());
        }
    }

    public final C0211f mo969a(int i, Bundle bundle) {
        String str = null;
        if (this.ak) {
            return null;
        }
        switch (i) {
            case 2:
                str = this.f3740b;
                break;
            case 3:
                str = this.f3739a;
                break;
        }
        return this.f3743e.mo1000a(i, str);
    }

    private final void m4048a(boolean z) {
        this.f3746h.m4178b(z);
    }

    public final void mo973b() {
    }

    public void onClick(View view) {
        this.f3743e.mo1009c();
    }

    public final void mo974c() {
        m4046Y();
    }

    public final void c_() {
        m4045X();
    }

    public final void d_() {
        if (this.f3743e.mo1006a((Fragment) this)) {
            if (!mo968W()) {
                m613o().mo312a(2, this);
            }
            this.f3743e.mo1011d();
            return;
        }
        m4045X();
    }

    private final void m4045X() {
        if (this.f3746h != null) {
            this.f3746h.m4174a();
        }
    }

    public final boolean e_() {
        if (!this.f3743e.mo1006a((Fragment) this) || this.f3746h == null) {
            return false;
        }
        boolean z;
        PhotoView photoView = this.f3746h;
        if (photoView.f3889x) {
            if (!photoView.f3861E.f3921g) {
                photoView.f3875j.getValues(photoView.f3868L);
                photoView.f3867K.set(photoView.f3865I);
                photoView.f3875j.mapRect(photoView.f3867K);
                float width = (float) photoView.getWidth();
                float f = photoView.f3868L[2];
                float f2 = photoView.f3867K.right - photoView.f3867K.left;
                if (!photoView.f3889x || f2 <= width) {
                    z = false;
                } else if (f == 0.0f) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final boolean f_() {
        if (!this.f3743e.mo1006a((Fragment) this) || this.f3746h == null) {
            return false;
        }
        boolean z;
        PhotoView photoView = this.f3746h;
        if (photoView.f3889x) {
            if (!photoView.f3861E.f3921g) {
                photoView.f3875j.getValues(photoView.f3868L);
                photoView.f3867K.set(photoView.f3865I);
                photoView.f3875j.mapRect(photoView.f3867K);
                float width = (float) photoView.getWidth();
                float f = photoView.f3868L[2];
                float f2 = photoView.f3867K.right - photoView.f3867K.left;
                if (!photoView.f3889x || f2 <= width) {
                    z = false;
                } else if (f != 0.0f && width >= f2 + f) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final boolean mo968W() {
        if (this.f3746h != null) {
            boolean z;
            if (this.f3746h.f3873h != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final void m4046Y() {
        this.ai = this.f3743e == null ? false : this.f3743e.mo1008b((Fragment) this);
    }

    public final void mo971a(Cursor cursor) {
        if (this.f3744f != null && cursor.moveToPosition(this.ah) && !mo968W()) {
            C0551b c0551b;
            this.f3743e.mo1012e();
            bw o = m613o();
            C0211f b = o.mo315b(3);
            if (b != null) {
                c0551b = (C0551b) b;
                this.f3739a = this.f3744f.m4034a(cursor, "contentUri");
                c0551b.mo981a(this.f3739a);
                c0551b.m4065j();
            }
            if (!this.an) {
                b = o.mo315b(2);
                if (b != null) {
                    c0551b = (C0551b) b;
                    this.f3740b = this.f3744f.m4034a(cursor, "thumbnailUri");
                    c0551b.mo981a(this.f3740b);
                    c0551b.m4065j();
                }
            }
        }
    }

    public final /* synthetic */ void mo972a(C0211f c0211f, Object obj) {
        C0553c c0553c = (C0553c) obj;
        if (this.f746R != null && m610k()) {
            Drawable a = c0553c.m4076a(m605i());
            switch (c0211f.f1190o) {
                case 2:
                    if (!this.ap) {
                        if (!mo968W()) {
                            if (a == null) {
                                this.f3747i.setImageResource(C0592z.default_image);
                                this.an = false;
                            } else {
                                this.f3747i.setImageDrawable(a);
                                this.an = true;
                            }
                            this.f3747i.setVisibility(0);
                            if (m605i().getBoolean(C0589w.force_thumbnail_no_scaling)) {
                                this.f3747i.setScaleType(ScaleType.CENTER);
                            }
                            m4048a(false);
                            break;
                        }
                        return;
                    }
                case 3:
                    if (c0553c.f3753c != 1) {
                        this.af.setVisibility(8);
                        Drawable a2 = c0553c.m4076a(m605i());
                        if (a2 != null) {
                            if (this.f3746h != null) {
                                boolean z;
                                PhotoView photoView = this.f3746h;
                                if (a2 == null || a2 == photoView.f3873h) {
                                    z = false;
                                } else {
                                    if (photoView.f3873h != null) {
                                        photoView.f3873h.setCallback(null);
                                    }
                                    photoView.f3873h = a2;
                                    photoView.f3859C = 0.0f;
                                    photoView.f3873h.setCallback(photoView);
                                    z = true;
                                }
                                photoView.m4180c(z);
                                photoView.invalidate();
                            }
                            m4048a(true);
                            this.am.setVisibility(8);
                            this.al = false;
                        }
                        this.f3743e.mo1003a(this, true);
                        break;
                    }
                    this.al = false;
                    this.af.setText(ad.failed);
                    this.af.setVisibility(0);
                    this.f3743e.mo1003a(this, false);
                    break;
            }
            if (!this.al) {
                this.ag.m4186a(8);
            }
            if (a != null) {
                this.f3743e.mo1001a();
            }
            m4046Y();
        }
    }
}
