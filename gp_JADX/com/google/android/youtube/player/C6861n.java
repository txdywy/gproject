package com.google.android.youtube.player;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.player.internal.C6838b;
import com.google.android.youtube.player.internal.C6840d;
import com.google.android.youtube.player.internal.C6845q;
import com.google.android.youtube.player.internal.C6849u;
import com.google.android.youtube.player.internal.ae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class C6861n extends ViewGroup {
    public final C6864q f33888a;
    public final Set f33889b;
    public final C6859r f33890c;
    public C6840d f33891d;
    public ae f33892e;
    public View f33893f;
    public C6849u f33894g;
    public Bundle f33895h;
    public C6827h f33896i;
    public boolean f33897j;
    public boolean f33898k;

    C6861n(Context context, C6859r c6859r) {
        super((Context) C6838b.m31128a((Object) context, (Object) "context cannot be null"), null, 0);
        this.f33890c = (C6859r) C6838b.m31128a((Object) c6859r, (Object) "listener cannot be null");
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        setClipToPadding(false);
        this.f33894g = new C6849u(context);
        requestTransparentRegion(this.f33894g);
        addView(this.f33894g);
        this.f33889b = new HashSet();
        this.f33888a = new C6864q(this);
    }

    private final void m31230a(View view) {
        Object obj = (view == this.f33894g || (this.f33892e != null && view == this.f33893f)) ? 1 : null;
        if (obj == null) {
            throw new UnsupportedOperationException("No views can be added on top of the player");
        }
    }

    public final void addFocusables(ArrayList arrayList, int i) {
        Collection arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i);
        arrayList.addAll(arrayList2);
        this.f33889b.clear();
        this.f33889b.addAll(arrayList2);
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        Collection arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        arrayList.addAll(arrayList2);
        this.f33889b.clear();
        this.f33889b.addAll(arrayList2);
    }

    public final void addView(View view) {
        m31230a(view);
        super.addView(view);
    }

    public final void addView(View view, int i) {
        m31230a(view);
        super.addView(view, i);
    }

    public final void addView(View view, int i, int i2) {
        m31230a(view);
        super.addView(view, i, i2);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        m31230a(view);
        super.addView(view, i, layoutParams);
    }

    public final void addView(View view, LayoutParams layoutParams) {
        m31230a(view);
        super.addView(view, layoutParams);
    }

    public final void clearChildFocus(View view) {
        if (hasFocusable()) {
            requestFocus();
        } else {
            super.clearChildFocus(view);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f33892e != null) {
            if (keyEvent.getAction() == 0) {
                return this.f33892e.m31076a(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
            } else {
                if (keyEvent.getAction() == 1) {
                    return this.f33892e.m31080b(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void focusableViewAvailable(View view) {
        super.focusableViewAvailable(view);
        this.f33889b.add(view);
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f33888a);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f33888a);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    protected final void onMeasure(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f33889b.add(view2);
    }

    public final void setClipToPadding(boolean z) {
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    final void m31231a(C6821b c6821b) {
        this.f33892e = null;
        C6849u c6849u = this.f33894g;
        c6849u.f33863a.setVisibility(8);
        c6849u.f33864b.setVisibility(0);
        if (this.f33896i != null) {
            this.f33896i.m31058a(c6821b);
            this.f33896i = null;
        }
    }

    final void m31232a(boolean z) {
        this.f33898k = true;
        if (this.f33892e != null) {
            ae aeVar = this.f33892e;
            try {
                aeVar.f33842b.mo5709a(z);
                aeVar.f33841a.mo5737a(z);
                aeVar.f33841a.mo5732d();
            } catch (RemoteException e) {
                throw new C6845q(e);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f33892e != null) {
            try {
                this.f33892e.f33842b.mo5704a(configuration);
            } catch (RemoteException e) {
                throw new C6845q(e);
            }
        }
    }
}
