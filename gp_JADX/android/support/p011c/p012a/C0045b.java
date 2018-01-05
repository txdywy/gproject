package android.support.p011c.p012a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.p029a.C0210j;
import android.support.v4.p037h.C0305a;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public final class C0045b extends C0044k implements Animatable {
    public C0047d f71a;
    public Context f72b;
    public ArgbEvaluator f73c;
    public final Callback f74d;

    C0045b() {
        this(null, (byte) 0);
    }

    public C0045b(Context context) {
        this(context, (byte) 0);
    }

    private C0045b(Context context, byte b) {
        this.f73c = null;
        this.f74d = new C0046c(this);
        this.f72b = context;
        this.f71a = new C0047d();
    }

    public final Drawable mutate() {
        if (this.e != null) {
            this.e.mutate();
        }
        return this;
    }

    public final ConstantState getConstantState() {
        if (this.e == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0048e(this.e.getConstantState());
    }

    public final int getChangingConfigurations() {
        if (this.e != null) {
            return this.e.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f71a.f76a;
    }

    public final void draw(Canvas canvas) {
        if (this.e != null) {
            this.e.draw(canvas);
            return;
        }
        this.f71a.f77b.draw(canvas);
        if (this.f71a.f78c.isStarted()) {
            invalidateSelf();
        }
    }

    protected final void onBoundsChange(Rect rect) {
        if (this.e != null) {
            this.e.setBounds(rect);
        } else {
            this.f71a.f77b.setBounds(rect);
        }
    }

    protected final boolean onStateChange(int[] iArr) {
        if (this.e != null) {
            return this.e.setState(iArr);
        }
        return this.f71a.f77b.setState(iArr);
    }

    protected final boolean onLevelChange(int i) {
        if (this.e != null) {
            return this.e.setLevel(i);
        }
        return this.f71a.f77b.setLevel(i);
    }

    public final int getAlpha() {
        if (this.e != null) {
            return C0259a.m1522b(this.e);
        }
        return this.f71a.f77b.getAlpha();
    }

    public final void setAlpha(int i) {
        if (this.e != null) {
            this.e.setAlpha(i);
        } else {
            this.f71a.f77b.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.e != null) {
            this.e.setColorFilter(colorFilter);
        } else {
            this.f71a.f77b.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        if (this.e != null) {
            C0259a.m1514a(this.e, i);
        } else {
            this.f71a.f77b.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.e != null) {
            C0259a.m1516a(this.e, colorStateList);
        } else {
            this.f71a.f77b.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.e != null) {
            C0259a.m1519a(this.e, mode);
        } else {
            this.f71a.f77b.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.e != null) {
            return this.e.setVisible(z, z2);
        }
        this.f71a.f77b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final boolean isStateful() {
        if (this.e != null) {
            return this.e.isStateful();
        }
        return this.f71a.f77b.isStateful();
    }

    public final int getOpacity() {
        if (this.e != null) {
            return this.e.getOpacity();
        }
        return this.f71a.f77b.getOpacity();
    }

    public final int getIntrinsicWidth() {
        if (this.e != null) {
            return this.e.getIntrinsicWidth();
        }
        return this.f71a.f77b.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        if (this.e != null) {
            return this.e.getIntrinsicHeight();
        }
        return this.f71a.f77b.getIntrinsicHeight();
    }

    public final boolean isAutoMirrored() {
        if (this.e != null) {
            return C0259a.m1521a(this.e);
        }
        return this.f71a.f77b.isAutoMirrored();
    }

    public final void setAutoMirrored(boolean z) {
        if (this.e != null) {
            C0259a.m1520a(this.e, z);
        } else {
            this.f71a.f77b.setAutoMirrored(z);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.e != null) {
            C0259a.m1518a(this.e, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0210j.m1074a(resources, theme, attributeSet, C0042a.f62e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0054l a2 = C0054l.m66a(resources, resourceId, theme);
                        a2.f91g = false;
                        a2.setCallback(this.f74d);
                        if (this.f71a.f77b != null) {
                            this.f71a.f77b.setCallback(null);
                        }
                        this.f71a.f77b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0042a.f63f);
                    String string = obtainAttributes.getString(0);
                    eventType = obtainAttributes.getResourceId(1, 0);
                    if (eventType != 0) {
                        if (this.f72b != null) {
                            Animator loadAnimator;
                            Context context = this.f72b;
                            if (VERSION.SDK_INT >= 24) {
                                loadAnimator = AnimatorInflater.loadAnimator(context, eventType);
                            } else {
                                loadAnimator = C0050g.m53a(context, context.getResources(), context.getTheme(), eventType);
                            }
                            loadAnimator.setTarget(this.f71a.f77b.f87b.f141b.f139p.get(string));
                            if (VERSION.SDK_INT < 21) {
                                m51a(loadAnimator);
                            }
                            if (this.f71a.f79d == null) {
                                this.f71a.f79d = new ArrayList();
                                this.f71a.f80e = new C0305a();
                            }
                            this.f71a.f79d.add(loadAnimator);
                            this.f71a.f80e.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C0047d c0047d = this.f71a;
        if (c0047d.f78c == null) {
            c0047d.f78c = new AnimatorSet();
        }
        c0047d.f78c.playTogether(c0047d.f79d);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public final void applyTheme(Theme theme) {
        if (this.e != null) {
            C0259a.m1517a(this.e, theme);
        }
    }

    public final boolean canApplyTheme() {
        if (this.e != null) {
            return C0259a.m1524c(this.e);
        }
        return false;
    }

    private final void m51a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m51a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f73c == null) {
                    this.f73c = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f73c);
            }
        }
    }

    public final boolean isRunning() {
        if (this.e != null) {
            return ((AnimatedVectorDrawable) this.e).isRunning();
        }
        return this.f71a.f78c.isRunning();
    }

    public final void start() {
        if (this.e != null) {
            ((AnimatedVectorDrawable) this.e).start();
        } else if (!this.f71a.f78c.isStarted()) {
            this.f71a.f78c.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        if (this.e != null) {
            ((AnimatedVectorDrawable) this.e).stop();
        } else {
            this.f71a.f78c.end();
        }
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }
}
