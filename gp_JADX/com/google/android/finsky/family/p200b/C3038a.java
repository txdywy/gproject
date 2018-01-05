package com.google.android.finsky.family.p200b;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p113v.C3037a;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.p113v.C4696c;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.h.a.v;
import com.google.wireless.android.finsky.dfe.h.a.z;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public final class C3038a implements OnClickListener, C0657w, C0660x, ad, C3037a {
    public final ce f15884a = C2482j.m13283a(5232);
    public final C3748a f15885b;
    public final C1037e f15886c;
    public final String f15887d;
    public final boolean f15888e;
    public v f15889f;
    public PlayActionButtonV2 f15890g;
    public C2495w f15891h;

    public C3038a(C3748a c3748a, C1037e c1037e, boolean z, C2495w c2495w) {
        this.f15885b = c3748a;
        this.f15886c = c1037e;
        this.f15888e = z;
        this.f15887d = C1473m.f7980a.cZ();
        this.f15891h = c2495w;
    }

    public final View mo3275a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(C7582R.layout.family_music_upgrade_bottom_sheet, viewGroup, false);
        if (this.f15889f != null) {
            m15679a(inflate, this.f15889f.b, this.f15889f.c, this.f15889f.d, this.f15889f.e, this.f15889f.f);
        } else {
            Context context = viewGroup.getContext();
            m15679a(inflate, context.getString(C7582R.string.family_library_label), context.getString(C7582R.string.family_music_upgrade_text), null, context.getString(C7582R.string.get_started), context.getString(C7582R.string.skip));
        }
        this.f15891h.m13370a(new C2488p().m13345b(this));
        return inflate;
    }

    private final void m15679a(View view, String str, String str2, bd bdVar, String str3, String str4) {
        ((TextView) view.findViewById(C7582R.id.title)).setText(str);
        ((TextView) view.findViewById(C7582R.id.description)).setText(str2);
        if (bdVar != null) {
            ((FifeImageView) view.findViewById(C7582R.id.icon)).a(bdVar.f11860f, bdVar.f11863i, C1473m.f7980a.be());
        }
        Button button = (Button) view.findViewById(C7582R.id.negative_button);
        button.setOnClickListener(this);
        button.setText(str4);
        this.f15890g = (PlayActionButtonV2) view.findViewById(C7582R.id.positive_button);
        this.f15890g.mo2588a(3, str3, (OnClickListener) this);
    }

    public final void mo3276a() {
    }

    public final void onClick(View view) {
        C4695b A = this.f15886c.mo1234A();
        if (!(A.f24083b == null || A.f24084c == null || A.f24084c.getVisibility() == 8)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(A.f24084c, "translationY", new float[]{(float) A.f24084c.getHeight()});
            ofFloat.addListener(new C4696c(A));
            ofFloat.start();
        }
        C0954a.aF.m5777b(C1473m.f7980a.cZ()).m5763a(Integer.valueOf(Integer.MAX_VALUE));
        if (view == this.f15890g) {
            this.f15891h.m13379b(new C2475d(this).m13256a(5233));
            this.f15885b.mo3699d(this.f15891h);
            return;
        }
        this.f15891h.m13379b(new C2475d(this).m13256a(5234));
    }

    public final void mo1062a(VolleyError volleyError) {
        String valueOf = String.valueOf(volleyError);
        FinskyLog.m21659a(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Unable to retrieve bottom sheet info from server: ").append(valueOf).toString(), new Object[0]);
    }

    public final void m15684b() {
        boolean z;
        C4695b A = this.f15886c.mo1234A();
        if (A.f24085d != null) {
            String valueOf = String.valueOf(A.f24085d);
            FinskyLog.m21659a(new StringBuilder(String.valueOf(valueOf).length() + 39).append("Not displaying bottom sheet, existing: ").append(valueOf).toString(), new Object[0]);
            z = false;
        } else if (A.f24082a.mo1256F()) {
            A.f24085d = this;
            LayoutInflater from = LayoutInflater.from(A.f24083b.getContext());
            if (A.f24084c == null) {
                ViewGroup viewGroup = (ViewGroup) from.inflate(C7582R.layout.bottom_sheet_container, A.f24083b, false);
                Resources resources = A.f24083b.getResources();
                if (!resources.getBoolean(C7582R.bool.stretch_bottom_sheet_container)) {
                    LayoutParams layoutParams = viewGroup.getLayoutParams();
                    layoutParams.width = (int) Math.min(((double) (A.f24086e.m9281f(resources) / A.f24086e.m9282g(resources))) * 2.5d, (double) C1611k.m9270l(resources));
                    viewGroup.setLayoutParams(layoutParams);
                }
                A.f24083b.addView(viewGroup);
                A.f24084c = viewGroup;
            }
            View a = A.f24085d.mo3275a(A.f24084c, from);
            if (a != null) {
                A.f24084c.removeAllViews();
                A.f24084c.addView(a);
                A.f24084c.setVisibility(0);
                A.f24084c.measure(MeasureSpec.makeMeasureSpec(A.f24083b.getWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(A.f24083b.getHeight(), Integer.MIN_VALUE));
                A.f24084c.setTranslationY((float) A.f24084c.getMeasuredHeight());
                ObjectAnimator.ofFloat(A.f24084c, "translationY", new float[]{0.0f}).start();
                z = true;
            } else {
                A.f24084c.setVisibility(8);
                z = false;
            }
        } else {
            FinskyLog.m21659a("Owner disallowed showing bottom sheet", new Object[0]);
            z = false;
        }
        if (z && this.f15888e) {
            C0957n b = C0954a.aF.m5777b(this.f15887d);
            b.m5763a(Integer.valueOf(((Integer) b.m5760a()).intValue() + 1));
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f15884a;
    }

    public final ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f15889f = ((z) obj).k;
        m15684b();
    }
}
