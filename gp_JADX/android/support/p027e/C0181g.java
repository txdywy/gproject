package android.support.p027e;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

public final class C0181g extends an {
    public static final String[] f1135a = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property f1136b = new C0182h(PointF.class, "boundsOrigin");
    public static final Property f1137c = new C0184j(PointF.class, "topLeft");
    public static final Property f1138d = new C0185k(PointF.class, "bottomRight");
    public static final Property f1139e = new C0186l(PointF.class, "bottomRight");
    public static final Property f1140f = new C0187m(PointF.class, "topLeft");
    public static final Property f1141g = new C0188n(PointF.class, "position");
    public static al f1142k = new al();
    public int[] f1143h = new int[2];
    public boolean f1144i = false;
    public boolean f1145j = false;

    public final String[] mo245a() {
        return f1135a;
    }

    private final void m994d(bc bcVar) {
        View view = bcVar.f1082b;
        if (ai.f1848a.mo409s(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            bcVar.f1081a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            bcVar.f1081a.put("android:changeBounds:parent", bcVar.f1082b.getParent());
            if (this.f1145j) {
                bcVar.f1082b.getLocationInWindow(this.f1143h);
                bcVar.f1081a.put("android:changeBounds:windowX", Integer.valueOf(this.f1143h[0]));
                bcVar.f1081a.put("android:changeBounds:windowY", Integer.valueOf(this.f1143h[1]));
            }
            if (this.f1144i) {
                bcVar.f1081a.put("android:changeBounds:clip", ai.f1848a.mo407q(view));
            }
        }
    }

    public final void mo210a(bc bcVar) {
        m994d(bcVar);
    }

    public final void mo217b(bc bcVar) {
        m994d(bcVar);
    }

    public final Animator mo243a(ViewGroup viewGroup, bc bcVar, bc bcVar2) {
        if (bcVar == null || bcVar2 == null) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) bcVar.f1081a.get("android:changeBounds:parent");
        View view = (ViewGroup) bcVar2.f1081a.get("android:changeBounds:parent");
        if (viewGroup2 == null || view == null) {
            return null;
        }
        View view2 = bcVar2.f1082b;
        if (this.f1145j) {
            bc b = m856b(viewGroup2, true);
            Object obj = b == null ? viewGroup2 == view ? 1 : null : view == b.f1082b ? 1 : null;
        } else {
            int i = 1;
        }
        int i2;
        int i3;
        Animator animatorSet;
        if (obj != null) {
            Rect rect = (Rect) bcVar.f1081a.get("android:changeBounds:bounds");
            Rect rect2 = (Rect) bcVar2.f1081a.get("android:changeBounds:bounds");
            int i4 = rect.left;
            i2 = rect2.left;
            int i5 = rect.top;
            i3 = rect2.top;
            int i6 = rect.right;
            int i7 = rect2.right;
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            int i10 = i6 - i4;
            int i11 = i8 - i5;
            int i12 = i7 - i2;
            int i13 = i9 - i3;
            rect = (Rect) bcVar.f1081a.get("android:changeBounds:clip");
            rect2 = (Rect) bcVar2.f1081a.get("android:changeBounds:clip");
            int i14 = 0;
            if (!((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0))) {
                if (!(i4 == i2 && i5 == i3)) {
                    i14 = 1;
                }
                if (!(i6 == i7 && i8 == i9)) {
                    i14++;
                }
            }
            if (!(rect == null || rect.equals(rect2)) || (rect == null && rect2 != null)) {
                i14++;
            }
            if (i14 > 0) {
                Animator animator;
                if (this.f1144i) {
                    Rect rect3;
                    bq.m944a(view2, i4, i5, Math.max(i10, i12) + i4, Math.max(i11, i13) + i5);
                    Animator animator2 = null;
                    if (!(i4 == i2 && i5 == i3)) {
                        animator2 = aa.m820a(view2, f1141g, this.f1044S.mo199a((float) i4, (float) i5, (float) i2, (float) i3));
                    }
                    if (rect == null) {
                        rect3 = new Rect(0, 0, i10, i11);
                    } else {
                        rect3 = rect;
                    }
                    if (rect2 == null) {
                        obj = new Rect(0, 0, i12, i13);
                    } else {
                        rect = rect2;
                    }
                    if (rect3.equals(obj)) {
                        animator = null;
                    } else {
                        ai.m1825a(view2, rect3);
                        Animator ofObject = ObjectAnimator.ofObject(view2, "clipBounds", f1142k, new Object[]{rect3, obj});
                        ofObject.addListener(new C0190p(view2, rect2, i2, i3, i7, i9));
                        animator = ofObject;
                    }
                    if (animator2 != null) {
                        if (animator == null) {
                            animator = animator2;
                        } else {
                            animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{animator2, animator});
                            animator = animatorSet;
                        }
                    }
                } else {
                    bq.m944a(view2, i4, i5, i6, i8);
                    if (i14 == 2) {
                        if (i10 == i12 && i11 == i13) {
                            animator = aa.m820a(view2, f1141g, this.f1044S.mo199a((float) i4, (float) i5, (float) i2, (float) i3));
                        } else {
                            C0192r c0192r = new C0192r(view2);
                            ObjectAnimator a = aa.m820a(c0192r, f1137c, this.f1044S.mo199a((float) i4, (float) i5, (float) i2, (float) i3));
                            ObjectAnimator a2 = aa.m820a(c0192r, f1138d, this.f1044S.mo199a((float) i6, (float) i8, (float) i7, (float) i9));
                            animator = new AnimatorSet();
                            animator.playTogether(new Animator[]{a, a2});
                            animator.addListener(new C0189o());
                            animatorSet = animator;
                            if (view2.getParent() instanceof ViewGroup) {
                                return animatorSet;
                            }
                            viewGroup2 = (ViewGroup) view2.getParent();
                            bh.m930a(viewGroup2, true);
                            mo206a(new C0191q(viewGroup2));
                            return animatorSet;
                        }
                    } else if (i4 == i2 && i5 == i3) {
                        animator = aa.m820a(view2, f1139e, this.f1044S.mo199a((float) i6, (float) i8, (float) i7, (float) i9));
                    } else {
                        animator = aa.m820a(view2, f1140f, this.f1044S.mo199a((float) i4, (float) i5, (float) i2, (float) i3));
                    }
                }
                animatorSet = animator;
                if (view2.getParent() instanceof ViewGroup) {
                    return animatorSet;
                }
                viewGroup2 = (ViewGroup) view2.getParent();
                bh.m930a(viewGroup2, true);
                mo206a(new C0191q(viewGroup2));
                return animatorSet;
            }
        }
        int intValue = ((Integer) bcVar.f1081a.get("android:changeBounds:windowX")).intValue();
        i2 = ((Integer) bcVar.f1081a.get("android:changeBounds:windowY")).intValue();
        i3 = ((Integer) bcVar2.f1081a.get("android:changeBounds:windowX")).intValue();
        i = ((Integer) bcVar2.f1081a.get("android:changeBounds:windowY")).intValue();
        if (!(intValue == i3 && i2 == i)) {
            viewGroup.getLocationInWindow(this.f1143h);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            Drawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c = bq.m946c(view2);
            bq.m942a(view2, 0.0f);
            bq.m941a(viewGroup).mo228a(bitmapDrawable);
            PropertyValuesHolder a3 = ag.f1016a.mo198a(f1136b, this.f1044S.mo199a((float) (intValue - this.f1143h[0]), (float) (i2 - this.f1143h[1]), (float) (i3 - this.f1143h[0]), (float) (i - this.f1143h[1])));
            animatorSet = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{a3});
            animatorSet.addListener(new C0183i(viewGroup, bitmapDrawable, view2, c));
            return animatorSet;
        }
        return null;
    }
}
