package com.google.android.finsky.detailspage;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.transition.ArcMotion;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.detailsmodules.p183a.C2597a;
import com.google.android.finsky.detailsmodules.p183a.C2598b;
import com.google.android.finsky.detailsmodules.p183a.C2601e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dq.C2870a;
import com.google.android.finsky.dq.C2881l;
import com.google.android.finsky.dq.C2882m;
import com.google.android.finsky.layout.C2623r;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

@TargetApi(22)
public final class aw extends aq {
    public Interpolator be;
    public Bitmap bf;
    public FifeImageView bg;
    public int bh;
    public int bi;
    public int bj;
    public int bk;
    public boolean bl;

    public static aw m13916a(Document document, String str, String str2, String str3, boolean z, boolean z2, View[] viewArr, C2495w c2495w) {
        C1473m c1473m = C1473m.f7980a;
        Fragment awVar = new aw();
        awVar.mo2580a(c2495w);
        awVar.m6259c(str3);
        awVar.m6319a(c1473m.dn(), str);
        awVar.m6254a("finsky.DetailsDataBasedFragment.document", (Parcelable) document);
        awVar.m6258b("finsky.DetailsFragment.continueUrl", str2);
        awVar.m6262d("finsky.DetailsFragment.acquisitionOverride", z);
        awVar.m6262d("finsky.DetailsFragment.useBrandedActionBar", z2);
        Object obj = (viewArr == null || viewArr.length <= 0) ? null : 1;
        if (obj != null) {
            View view = viewArr[0];
            String transitionName = view.getTransitionName();
            if (!TextUtils.isEmpty(transitionName)) {
                awVar.aQ = transitionName;
                if (transitionName.startsWith("transition_card_details:cover:")) {
                    Context context = c1473m.f7981b;
                    TransitionInflater from = TransitionInflater.from(context);
                    awVar.be = AnimationUtils.loadInterpolator(context, 17563661);
                    Object inflateTransition = from.inflateTransition(C7582R.transition.details_transition);
                    inflateTransition.setInterpolator(awVar.be);
                    inflateTransition.addListener(new ay(awVar));
                    inflateTransition.setDuration(400);
                    awVar.a_(inflateTransition);
                    awVar.m582a(new bc(awVar));
                    Drawable drawable = ((ImageView) view).getDrawable();
                    if (drawable != null) {
                        awVar.bf = ((BitmapDrawable) drawable).getBitmap();
                    }
                } else {
                    Context context2 = c1473m.f7981b;
                    int i = document.f14885a.f12099f;
                    awVar.be = AnimationUtils.loadInterpolator(context2, 17563661);
                    Object c2870a = new C2870a(C1608h.m9243a(context2, i));
                    c2870a.setInterpolator(awVar.be);
                    c2870a.setPathMotion(new ArcMotion());
                    c2870a.f15348c = context2.getResources().getDimensionPixelSize(C7582R.dimen.circle_transition_avatar_cap);
                    c2870a.addListener(new ba(awVar));
                    c2870a.setDuration(400);
                    awVar.a_(c2870a);
                    awVar.m582a(new bd(awVar));
                    super.m560L().f1605p = new bb();
                }
                awVar.aR = true;
                new Handler(Looper.getMainLooper()).postDelayed(new ax(awVar), 800);
            }
        }
        return awVar;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        if (!(this.aP == null || TextUtils.isEmpty(this.aQ) || !this.aQ.startsWith("transition_generic_circle:"))) {
            ai.m1832a(this.aP, this.aQ);
        }
        return a;
    }

    public final void mo138d() {
        this.bf = null;
        this.bg = null;
        a_(null);
        super.mo138d();
    }

    protected final boolean mo3044b(C2598b c2598b) {
        if (!this.aR || (c2598b instanceof bm)) {
            return c2598b.mo2979f();
        }
        return false;
    }

    protected final boolean ai() {
        return this.aQ != null && this.aQ.startsWith("transition_card_details:cover:");
    }

    public final boolean am() {
        int i = 0;
        if (!TextUtils.isEmpty(this.aQ)) {
            Transition fade;
            int i2;
            TransitionSet transitionSet = new TransitionSet();
            if (this.aI != null && this.aI.getTransitionName() == null) {
                if (this.e_) {
                    fade = new Fade();
                    fade.setInterpolator(this.be);
                    fade.addTarget(this.aI);
                    fade.setDuration(400);
                    transitionSet.addTransition(fade);
                } else {
                    fade = new C2882m();
                    fade.setInterpolator(this.be);
                    fade.addTarget(this.aI);
                    fade.setDuration(600);
                    transitionSet.addTransition(fade);
                }
            }
            Transition fade2 = new Fade();
            Transition c2881l = new C2881l();
            c2881l.setInterpolator(this.be);
            List arrayList = new ArrayList();
            int size = this.as.size();
            for (i2 = 0; i2 < size; i2++) {
                C2597a c2597a = (C2597a) this.as.get(i2);
                if (!(c2597a.f13820a.isEmpty() || c2597a.f13820a.get(0) == null)) {
                    View view = ((C2601e) c2597a.f13820a.get(0)).a;
                    if (view instanceof C2623r) {
                        ((C2623r) view).mo2982a(arrayList);
                    } else {
                        c2881l.addTarget(view);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            i2 = arrayList2.size();
            while (i < i2) {
                Object obj = arrayList2.get(i);
                i++;
                fade2.addTarget(((Integer) obj).intValue());
            }
            fade2.setDuration(133);
            c2881l.setDuration(600);
            fade = new Fade();
            fade.addTarget(C7582R.id.title_background);
            fade.setDuration(133);
            transitionSet.addTransition(fade);
            transitionSet.addTransition(fade2);
            transitionSet.addTransition(c2881l);
            super.m560L().f1596g = transitionSet;
        }
        return super.am();
    }

    final Drawable ar() {
        int size = this.as.size();
        for (int i = 0; i < size; i++) {
            C2597a c2597a = (C2597a) this.as.get(i);
            if (!c2597a.f13820a.isEmpty() && (c2597a instanceof gn)) {
                return ((C2601e) c2597a.f13820a.get(0)).a.getBackground();
            }
        }
        return null;
    }

    final List as() {
        List arrayList = new ArrayList();
        int size = this.as.size();
        for (int i = 0; i < size; i++) {
            C2597a c2597a = (C2597a) this.as.get(i);
            if (!(c2597a.f13820a.isEmpty() || c2597a.f13820a.get(0) == null)) {
                View view = ((C2601e) c2597a.f13820a.get(0)).a;
                if (view instanceof C2623r) {
                    ((C2623r) view).mo2983b(arrayList);
                }
            }
        }
        return arrayList;
    }
}
