package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.support.v4.p037h.C0305a;
import java.util.ArrayList;

@TargetApi(19)
public final class C2875f extends Animator {
    public final Animator f15364a;
    public final C0305a f15365b = new C0305a();

    public C2875f(Animator animator) {
        this.f15364a = animator;
    }

    public final void addListener(AnimatorListener animatorListener) {
        AnimatorListener c2876g = new C2876g(this, animatorListener);
        if (!this.f15365b.containsKey(animatorListener)) {
            this.f15365b.put(animatorListener, c2876g);
            this.f15364a.addListener(c2876g);
        }
    }

    public final void cancel() {
        this.f15364a.cancel();
    }

    public final void end() {
        this.f15364a.end();
    }

    public final long getDuration() {
        return this.f15364a.getDuration();
    }

    public final TimeInterpolator getInterpolator() {
        return this.f15364a.getInterpolator();
    }

    public final ArrayList getListeners() {
        return new ArrayList(this.f15365b.keySet());
    }

    public final long getStartDelay() {
        return this.f15364a.getStartDelay();
    }

    public final boolean isPaused() {
        return this.f15364a.isPaused();
    }

    public final boolean isRunning() {
        return this.f15364a.isRunning();
    }

    public final boolean isStarted() {
        return this.f15364a.isStarted();
    }

    public final void removeAllListeners() {
        this.f15365b.clear();
        this.f15364a.removeAllListeners();
    }

    public final void removeListener(AnimatorListener animatorListener) {
        AnimatorListener animatorListener2 = (AnimatorListener) this.f15365b.get(animatorListener);
        if (animatorListener2 != null) {
            this.f15365b.remove(animatorListener);
            this.f15364a.removeListener(animatorListener2);
        }
    }

    public final Animator setDuration(long j) {
        this.f15364a.setDuration(j);
        return this;
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.f15364a.setInterpolator(timeInterpolator);
    }

    public final void setStartDelay(long j) {
        this.f15364a.setStartDelay(j);
    }

    public final void setTarget(Object obj) {
        this.f15364a.setTarget(obj);
    }

    public final void setupEndValues() {
        this.f15364a.setupEndValues();
    }

    public final void setupStartValues() {
        this.f15364a.setupStartValues();
    }

    public final void start() {
        this.f15364a.start();
    }
}
