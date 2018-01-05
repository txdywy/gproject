package com.google.android.finsky.detailspage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.View;
import android.view.ViewAnimationUtils;
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

final class ay extends C2633a {
    public final /* synthetic */ aw f14265a;

    ay(aw awVar) {
        this.f14265a = awVar;
    }

    public final void onTransitionStart(Transition transition) {
        this.f14265a.bl = true;
        if (this.f14265a.f746R != null) {
            aw awVar;
            int size;
            int i;
            C2597a c2597a;
            Drawable background;
            int i2;
            if (this.f14265a.bf != null && !TextUtils.isEmpty(this.f14265a.aQ)) {
                awVar = this.f14265a;
                Bitmap bitmap = this.f14265a.bf;
                size = awVar.as.size();
                for (i = 0; i < size; i++) {
                    c2597a = (C2597a) awVar.as.get(i);
                    if (!c2597a.f13820a.isEmpty() && c2597a.f13820a.get(0) != null && (c2597a instanceof gn)) {
                        ((gn) c2597a).mo3030a(bitmap);
                        break;
                    }
                }
            }
            awVar = this.f14265a;
            int size2 = awVar.as.size();
            for (i = 0; i < size2; i++) {
                c2597a = (C2597a) awVar.as.get(i);
                if (!c2597a.f13820a.isEmpty() && (c2597a instanceof gn)) {
                    background = ((C2601e) c2597a.f13820a.get(0)).a.getBackground();
                    break;
                }
            }
            background = null;
            if (background != null) {
                background.setAlpha(0);
            }
            if (this.f14265a.aI != null) {
                this.f14265a.aI.m13588a();
            }
            aw awVar2 = this.f14265a;
            List arrayList = new ArrayList();
            size = awVar2.as.size();
            for (i2 = 0; i2 < size; i2++) {
                c2597a = (C2597a) awVar2.as.get(i2);
                if (!(c2597a.f13820a.isEmpty() || c2597a.f13820a.get(0) == null)) {
                    View view = ((C2601e) c2597a.f13820a.get(0)).a;
                    if (view instanceof C2623r) {
                        ((C2623r) view).mo2983b(arrayList);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            size2 = arrayList2.size();
            i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList2.get(i2);
                i2++;
                ((View) obj).setAlpha(0.0f);
            }
            if (this.f14265a.aI != null && !TextUtils.isEmpty(this.f14265a.aQ)) {
                int measuredWidth = this.f14265a.aI.getMeasuredWidth();
                i = this.f14265a.aI.getMeasuredHeight();
                this.f14265a.aG.setClipChildren(false);
                size2 = this.f14265a.bh - ((i - this.f14265a.bj) / 2);
                this.f14265a.aI.setTranslationX((float) ((this.f14265a.bi + (this.f14265a.bk / 2)) - (measuredWidth / 2)));
                this.f14265a.aI.setTranslationY((float) size2);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(this.f14265a.be);
                r5 = new Animator[2];
                r5[0] = ObjectAnimator.ofFloat(this.f14265a.aI, "translationX", new float[]{(float) i2, 0.0f});
                r5[1] = ObjectAnimator.ofFloat(this.f14265a.aI, "translationY", new float[]{(float) size2, 0.0f});
                animatorSet.playTogether(r5);
                animatorSet.addListener(new az(this));
                animatorSet.setDuration(400);
                animatorSet.start();
                ViewAnimationUtils.createCircularReveal(this.f14265a.aI, measuredWidth / 2, i / 2, 0.0f, ((float) Math.sqrt((double) (((float) (measuredWidth * measuredWidth)) + ((float) (i * i))))) * 0.5f).setDuration(400).start();
            }
        }
    }

    public final void onTransitionEnd(Transition transition) {
        if (((ViewGroup) this.f14265a.f746R) != null && this.f14265a.aK != null) {
            int i;
            aw awVar = this.f14265a;
            int size = awVar.as.size();
            for (i = 0; i < size; i++) {
                C2597a c2597a = (C2597a) awVar.as.get(i);
                if (!c2597a.f13820a.isEmpty() && c2597a.f13820a.get(0) != null && (c2597a instanceof gn)) {
                    ((gn) c2597a).mo3028a();
                    break;
                }
            }
            if (this.f14265a.aI != null) {
                this.f14265a.aI.m13599b();
            }
            Animator animatorSet = new AnimatorSet();
            Collection arrayList = new ArrayList();
            for (View view : this.f14265a.as()) {
                arrayList.add(C1621v.m9303a(view, view.getAlpha(), 400));
            }
            animatorSet.playTogether(arrayList);
            if (this.f14265a.aY != null) {
                this.f14265a.aY.m13943a(animatorSet);
            }
            animatorSet.start();
            this.f14265a.aR = false;
            for (i = 0; i < this.f14265a.ar.size(); i++) {
                C2598b c2598b = (C2598b) this.f14265a.ar.get(i);
                if (this.f14265a.mo3044b(c2598b) && !this.f14265a.as.contains(c2598b)) {
                    this.f14265a.m13898c(c2598b);
                }
            }
            Drawable ar = this.f14265a.ar();
            if (ar != null) {
                ObjectAnimator.ofInt(ar, "alpha", new int[]{ar.getAlpha(), HprofParser.ROOT_UNKNOWN}).setDuration(400).start();
            }
        }
    }
}
