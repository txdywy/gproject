package com.google.android.finsky.detailspage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1621v;
import com.google.android.finsky.detailsmodules.p183a.C2597a;
import com.google.android.finsky.detailsmodules.p183a.C2598b;
import com.google.android.finsky.detailsmodules.p183a.C2601e;
import com.google.android.finsky.layout.C2623r;
import com.google.android.play.p185f.C2633a;
import com.squareup.haha.perflib.HprofParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class ba extends C2633a {
    public final /* synthetic */ aw f14268a;

    ba(aw awVar) {
        this.f14268a = awVar;
    }

    public final void onTransitionStart(Transition transition) {
        int i = 0;
        this.f14268a.bl = true;
        if (this.f14268a.f746R != null) {
            aw awVar;
            int size;
            int i2;
            C2597a c2597a;
            Drawable background;
            int i3;
            if (this.f14268a.bf != null && !TextUtils.isEmpty(this.f14268a.aQ)) {
                awVar = this.f14268a;
                Bitmap bitmap = this.f14268a.bf;
                size = awVar.as.size();
                for (i2 = 0; i2 < size; i2++) {
                    c2597a = (C2597a) awVar.as.get(i2);
                    if (!c2597a.f13820a.isEmpty() && c2597a.f13820a.get(0) != null && (c2597a instanceof gn)) {
                        ((gn) c2597a).mo3030a(bitmap);
                        break;
                    }
                }
            }
            awVar = this.f14268a;
            int size2 = awVar.as.size();
            for (i2 = 0; i2 < size2; i2++) {
                c2597a = (C2597a) awVar.as.get(i2);
                if (!c2597a.f13820a.isEmpty() && (c2597a instanceof gn)) {
                    background = ((C2601e) c2597a.f13820a.get(0)).a.getBackground();
                    break;
                }
            }
            background = null;
            if (background != null) {
                background.setAlpha(0);
            }
            if (this.f14268a.aI != null) {
                this.f14268a.aI.m13588a();
            }
            aw awVar2 = this.f14268a;
            List arrayList = new ArrayList();
            size = awVar2.as.size();
            for (i3 = 0; i3 < size; i3++) {
                c2597a = (C2597a) awVar2.as.get(i3);
                if (!(c2597a.f13820a.isEmpty() || c2597a.f13820a.get(0) == null)) {
                    View view = ((C2601e) c2597a.f13820a.get(0)).a;
                    if (view instanceof C2623r) {
                        ((C2623r) view).mo2983b(arrayList);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            i3 = arrayList2.size();
            while (i < i3) {
                Object obj = arrayList2.get(i);
                i++;
                ((View) obj).setAlpha(0.0f);
            }
        }
    }

    public final void onTransitionEnd(Transition transition) {
        if (((ViewGroup) this.f14268a.f746R) != null && this.f14268a.aK != null) {
            int i;
            aw awVar = this.f14268a;
            int size = awVar.as.size();
            for (i = 0; i < size; i++) {
                C2597a c2597a = (C2597a) awVar.as.get(i);
                if (!c2597a.f13820a.isEmpty() && c2597a.f13820a.get(0) != null && (c2597a instanceof gn)) {
                    ((gn) c2597a).mo3028a();
                    break;
                }
            }
            if (this.f14268a.aI != null) {
                this.f14268a.aI.m13599b();
            }
            Animator animatorSet = new AnimatorSet();
            Collection arrayList = new ArrayList();
            for (View view : this.f14268a.as()) {
                arrayList.add(C1621v.m9303a(view, view.getAlpha(), 400));
            }
            animatorSet.playTogether(arrayList);
            if (this.f14268a.aY != null) {
                this.f14268a.aY.m13943a(animatorSet);
            }
            animatorSet.start();
            this.f14268a.aR = false;
            for (i = 0; i < this.f14268a.ar.size(); i++) {
                C2598b c2598b = (C2598b) this.f14268a.ar.get(i);
                if (this.f14268a.mo3044b(c2598b) && !this.f14268a.as.contains(c2598b)) {
                    this.f14268a.m13898c(c2598b);
                }
            }
            Drawable ar = this.f14268a.ar();
            if (ar != null) {
                ObjectAnimator.ofInt(ar, "alpha", new int[]{ar.getAlpha(), HprofParser.ROOT_UNKNOWN}).setDuration(400).start();
            }
        }
    }
}
