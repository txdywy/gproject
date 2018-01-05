package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0397d;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityManager;

final class hr implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {
    public static hr f3590i;
    public static hr f3591j;
    public final View f3592a;
    public final CharSequence f3593b;
    public final Runnable f3594c = new hs(this);
    public final Runnable f3595d = new ht(this);
    public int f3596e;
    public int f3597f;
    public hu f3598g;
    public boolean f3599h;

    hr(View view, CharSequence charSequence) {
        this.f3592a = view;
        this.f3593b = charSequence;
        this.f3592a.setOnLongClickListener(this);
        this.f3592a.setOnHoverListener(this);
    }

    public final boolean onLongClick(View view) {
        this.f3596e = view.getWidth() / 2;
        this.f3597f = view.getHeight() / 2;
        m3845a(true);
        return true;
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3598g == null || !this.f3599h) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3592a.getContext().getSystemService("accessibility");
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                switch (motionEvent.getAction()) {
                    case 7:
                        if (this.f3592a.isEnabled() && this.f3598g == null) {
                            this.f3596e = (int) motionEvent.getX();
                            this.f3597f = (int) motionEvent.getY();
                            m3843a(this);
                            break;
                        }
                    case 10:
                        m3844a();
                        break;
                    default:
                        break;
                }
            }
        }
        return false;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        m3844a();
    }

    final void m3845a(boolean z) {
        if (ai.f1848a.mo410t(this.f3592a)) {
            int i;
            View decorView;
            long j;
            m3843a(null);
            if (f3591j != null) {
                f3591j.m3844a();
            }
            f3591j = this;
            this.f3599h = z;
            this.f3598g = new hu(this.f3592a.getContext());
            hu huVar = this.f3598g;
            View view = this.f3592a;
            int i2 = this.f3596e;
            int i3 = this.f3597f;
            boolean z2 = this.f3599h;
            CharSequence charSequence = this.f3593b;
            if (huVar.m3847b()) {
                huVar.m3846a();
            }
            huVar.f3604c.setText(charSequence);
            LayoutParams layoutParams = huVar.f3605d;
            int dimensionPixelOffset = huVar.f3602a.getResources().getDimensionPixelOffset(C0397d.tooltip_precise_anchor_threshold);
            if (view.getWidth() >= dimensionPixelOffset) {
                i = i2;
            } else {
                i = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                i2 = huVar.f3602a.getResources().getDimensionPixelOffset(C0397d.tooltip_precise_anchor_extra_offset);
                dimensionPixelOffset = i3 + i2;
                i2 = i3 - i2;
                i3 = dimensionPixelOffset;
                dimensionPixelOffset = i2;
            } else {
                i3 = view.getHeight();
                dimensionPixelOffset = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset2 = huVar.f3602a.getResources().getDimensionPixelOffset(z2 ? C0397d.tooltip_y_offset_touch : C0397d.tooltip_y_offset_non_touch);
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    decorView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
            }
            decorView = view.getRootView();
            if (decorView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                decorView.getWindowVisibleDisplayFrame(huVar.f3606e);
                if (huVar.f3606e.left < 0 && huVar.f3606e.top < 0) {
                    Resources resources = huVar.f3602a.getResources();
                    i2 = resources.getIdentifier("status_bar_height", "dimen", "android");
                    if (i2 != 0) {
                        i2 = resources.getDimensionPixelSize(i2);
                    } else {
                        i2 = 0;
                    }
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    huVar.f3606e.set(0, i2, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                decorView.getLocationOnScreen(huVar.f3608g);
                view.getLocationOnScreen(huVar.f3607f);
                int[] iArr = huVar.f3607f;
                iArr[0] = iArr[0] - huVar.f3608g[0];
                iArr = huVar.f3607f;
                iArr[1] = iArr[1] - huVar.f3608g[1];
                layoutParams.x = (huVar.f3607f[0] + i) - (huVar.f3606e.width() / 2);
                i2 = MeasureSpec.makeMeasureSpec(0, 0);
                huVar.f3603b.measure(i2, i2);
                i2 = huVar.f3603b.getMeasuredHeight();
                i = ((huVar.f3607f[1] + dimensionPixelOffset) - dimensionPixelOffset2) - i2;
                dimensionPixelOffset = (huVar.f3607f[1] + i3) + dimensionPixelOffset2;
                if (z2) {
                    if (i < 0) {
                        layoutParams.y = dimensionPixelOffset;
                    }
                } else if (i2 + dimensionPixelOffset <= huVar.f3606e.height()) {
                    layoutParams.y = dimensionPixelOffset;
                }
                layoutParams.y = i;
            }
            ((WindowManager) huVar.f3602a.getSystemService("window")).addView(huVar.f3603b, huVar.f3605d);
            this.f3592a.addOnAttachStateChangeListener(this);
            if (this.f3599h) {
                j = 2500;
            } else {
                if ((ai.f1848a.mo403n(this.f3592a) & 1) == 1) {
                    j = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
                } else {
                    j = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
                }
            }
            this.f3592a.removeCallbacks(this.f3595d);
            this.f3592a.postDelayed(this.f3595d, j);
        }
    }

    final void m3844a() {
        if (f3591j == this) {
            f3591j = null;
            if (this.f3598g != null) {
                this.f3598g.m3846a();
                this.f3598g = null;
                this.f3592a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3590i == this) {
            m3843a(null);
        }
        this.f3592a.removeCallbacks(this.f3595d);
    }

    static void m3843a(hr hrVar) {
        if (f3590i != null) {
            hr hrVar2 = f3590i;
            hrVar2.f3592a.removeCallbacks(hrVar2.f3594c);
        }
        f3590i = hrVar;
        if (hrVar != null) {
            hrVar2 = f3590i;
            hrVar2.f3592a.postDelayed(hrVar2.f3594c, (long) ViewConfiguration.getLongPressTimeout());
        }
    }
}
