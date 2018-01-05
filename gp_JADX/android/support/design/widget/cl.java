package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.C0126h;
import android.support.design.p023e.C0122a;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.view.C0361r;
import android.support.v4.view.ag;
import android.support.v4.view.ai;
import android.support.v4.widget.bg;
import android.support.v7.app.C0414d;
import android.support.v7.p041b.p042a.C0436b;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

final class cl extends LinearLayout implements OnLongClickListener {
    public cj f946a;
    public TextView f947b;
    public ImageView f948c;
    public View f949d;
    public TextView f950e;
    public ImageView f951f;
    public int f952g = 2;
    public final /* synthetic */ TabLayout f953h;

    public cl(TabLayout tabLayout, Context context) {
        ag agVar;
        this.f953h = tabLayout;
        super(context);
        m762a(context);
        ai.m1823a(this, tabLayout.f689e, tabLayout.f690f, tabLayout.f691g, tabLayout.f692h);
        setGravity(17);
        setOrientation(tabLayout.f709y ? 0 : 1);
        setClickable(true);
        Context context2 = getContext();
        if (VERSION.SDK_INT >= 24) {
            agVar = new ag(PointerIcon.getSystemIcon(context2, 1002));
        } else {
            agVar = new ag(null);
        }
        ai.f1848a.mo429a((View) this, agVar);
    }

    final void m762a(Context context) {
        Drawable b;
        if (this.f953h.f701q != 0) {
            b = C0436b.m2650b(context, this.f953h.f701q);
        } else {
            b = new GradientDrawable();
            ((GradientDrawable) b).setColor(0);
        }
        if (!(this.f953h.f696l == null && this.f953h.f697m == null)) {
            Drawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            gradientDrawable.setColor(-1);
            ColorStateList a = C0122a.m235a(this.f953h.f696l, this.f953h.f697m);
            if (VERSION.SDK_INT >= 21) {
                b = new RippleDrawable(a, b, gradientDrawable);
            } else {
                C0259a.m1516a(C0259a.m1526e(gradientDrawable), a);
                b = new LayerDrawable(new Drawable[]{b, gradientDrawable});
            }
        }
        ai.m1826a((View) this, b);
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f946a == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.f946a.m755a();
        return true;
    }

    public final void setSelected(boolean z) {
        Object obj = isSelected() != z ? 1 : null;
        super.setSelected(z);
        if (obj != null && z && VERSION.SDK_INT < 16) {
            sendAccessibilityEvent(4);
        }
        if (this.f947b != null) {
            this.f947b.setSelected(z);
        }
        if (this.f948c != null) {
            this.f948c.setSelected(z);
        }
        if (this.f949d != null) {
            this.f949d.setSelected(z);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0414d.class.getName());
    }

    @TargetApi(14)
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0414d.class.getName());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r9, int r10) {
        /*
        r8 = this;
        r3 = 0;
        r1 = 1;
        r0 = android.view.View.MeasureSpec.getSize(r9);
        r2 = android.view.View.MeasureSpec.getMode(r9);
        r4 = r8.f953h;
        r4 = r4.f702r;
        if (r4 <= 0) goto L_0x001e;
    L_0x0010:
        if (r2 == 0) goto L_0x0014;
    L_0x0012:
        if (r0 <= r4) goto L_0x001e;
    L_0x0014:
        r0 = r8.f953h;
        r0 = r0.f702r;
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2);
    L_0x001e:
        super.onMeasure(r9, r10);
        r0 = r8.f947b;
        if (r0 == 0) goto L_0x009a;
    L_0x0025:
        r0 = r8.f953h;
        r2 = r0.f699o;
        r0 = r8.f952g;
        r4 = r8.f948c;
        if (r4 == 0) goto L_0x009b;
    L_0x002f:
        r4 = r8.f948c;
        r4 = r4.getVisibility();
        if (r4 != 0) goto L_0x009b;
    L_0x0037:
        r0 = r1;
    L_0x0038:
        r4 = r8.f947b;
        r4 = r4.getTextSize();
        r5 = r8.f947b;
        r5 = r5.getLineCount();
        r6 = r8.f947b;
        r7 = android.support.v4.widget.bg.f2112a;
        r6 = r7.mo476a(r6);
        r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r7 != 0) goto L_0x0054;
    L_0x0050:
        if (r6 < 0) goto L_0x009a;
    L_0x0052:
        if (r0 == r6) goto L_0x009a;
    L_0x0054:
        r6 = r8.f953h;
        r6 = r6.f708x;
        if (r6 != r1) goto L_0x008b;
    L_0x005a:
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x008b;
    L_0x005e:
        if (r5 != r1) goto L_0x008b;
    L_0x0060:
        r4 = r8.f947b;
        r4 = r4.getLayout();
        if (r4 == 0) goto L_0x008a;
    L_0x0068:
        r5 = r4.getLineWidth(r3);
        r4 = r4.getPaint();
        r4 = r4.getTextSize();
        r4 = r2 / r4;
        r4 = r4 * r5;
        r5 = r8.getMeasuredWidth();
        r6 = r8.getPaddingLeft();
        r5 = r5 - r6;
        r6 = r8.getPaddingRight();
        r5 = r5 - r6;
        r5 = (float) r5;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x008b;
    L_0x008a:
        r1 = r3;
    L_0x008b:
        if (r1 == 0) goto L_0x009a;
    L_0x008d:
        r1 = r8.f947b;
        r1.setTextSize(r3, r2);
        r1 = r8.f947b;
        r1.setMaxLines(r0);
        super.onMeasure(r9, r10);
    L_0x009a:
        return;
    L_0x009b:
        r4 = r8.f947b;
        if (r4 == 0) goto L_0x0038;
    L_0x009f:
        r4 = r8.f947b;
        r4 = r4.getLineCount();
        if (r4 <= r1) goto L_0x0038;
    L_0x00a7:
        r2 = r8.f953h;
        r2 = r2.f700p;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.cl.onMeasure(int, int):void");
    }

    final void m763a(cj cjVar) {
        if (cjVar != this.f946a) {
            this.f946a = cjVar;
            m761a();
        }
    }

    final void m761a() {
        View view;
        boolean z;
        cj cjVar = this.f946a;
        if (cjVar != null) {
            view = cjVar.f940e;
        } else {
            view = null;
        }
        if (view != null) {
            cl parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    parent.removeView(view);
                }
                addView(view);
            }
            this.f949d = view;
            if (this.f947b != null) {
                this.f947b.setVisibility(8);
            }
            if (this.f948c != null) {
                this.f948c.setVisibility(8);
                this.f948c.setImageDrawable(null);
            }
            this.f950e = (TextView) view.findViewById(16908308);
            if (this.f950e != null) {
                this.f952g = bg.f2112a.mo476a(this.f950e);
            }
            this.f951f = (ImageView) view.findViewById(16908294);
        } else {
            if (this.f949d != null) {
                removeView(this.f949d);
                this.f949d = null;
            }
            this.f950e = null;
            this.f951f = null;
        }
        if (this.f949d == null) {
            if (this.f948c == null) {
                ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C0126h.design_layout_tab_icon, this, false);
                addView(imageView, 0);
                this.f948c = imageView;
            }
            if (this.f947b == null) {
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0126h.design_layout_tab_text, this, false);
                addView(textView);
                this.f947b = textView;
                this.f952g = bg.f2112a.mo476a(this.f947b);
            }
            bg.m2221a(this.f947b, this.f953h.f693i);
            if (this.f953h.f694j != null) {
                this.f947b.setTextColor(this.f953h.f694j);
            }
            m764a(this.f947b, this.f948c);
        } else if (!(this.f950e == null && this.f951f == null)) {
            m764a(this.f950e, this.f951f);
        }
        if (cjVar != null) {
            if (cjVar.f941f == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (cjVar.f941f.getSelectedTabPosition() == cjVar.f939d) {
                z = true;
                setSelected(z);
            }
        }
        z = false;
        setSelected(z);
    }

    final void m764a(TextView textView, ImageView imageView) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        if (this.f946a == null || this.f946a.f936a == null) {
            drawable = null;
        } else {
            drawable = C0259a.m1526e(this.f946a.f936a).mutate();
        }
        if (this.f946a != null) {
            charSequence = this.f946a.f937b;
        } else {
            charSequence = null;
        }
        if (this.f946a != null) {
            charSequence2 = this.f946a.f938c;
        } else {
            charSequence2 = null;
        }
        if (imageView != null) {
            if (drawable != null) {
                C0259a.m1516a(drawable, this.f953h.f695k);
                if (this.f953h.f698n != null) {
                    C0259a.m1519a(drawable, this.f953h.f698n);
                }
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
            imageView.setContentDescription(charSequence2);
        }
        if (TextUtils.isEmpty(charSequence)) {
            z = false;
        } else {
            z = true;
        }
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText(null);
            }
            textView.setContentDescription(charSequence2);
        }
        if (imageView != null) {
            int b;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
            if (z && imageView.getVisibility() == 0) {
                b = this.f953h.m530b(8);
            } else {
                b = 0;
            }
            if (this.f953h.f709y) {
                if (b != C0361r.m2051b(marginLayoutParams)) {
                    C0361r.m2052b(marginLayoutParams, b);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (b != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = b;
                C0361r.m2052b(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        if (z || TextUtils.isEmpty(charSequence2)) {
            setOnLongClickListener(null);
            setLongClickable(false);
            return;
        }
        setOnLongClickListener(this);
    }

    public final boolean onLongClick(View view) {
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        width = (width / 2) + iArr[0];
        if (ai.f1848a.mo400k(view) == 0) {
            width = context.getResources().getDisplayMetrics().widthPixels - width;
        }
        Toast makeText = Toast.makeText(context, this.f946a.f938c, 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, width, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }
}
