package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.C0268a;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p037h.C0305a;
import android.support.v4.p037h.C0313h;
import android.support.v4.p037h.C0325v;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0396c;
import android.support.v7.p040a.C0398e;
import android.support.v7.p041b.p042a.C0436b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ag {
    public static final Mode f3094a = Mode.SRC_IN;
    public static ag f3095b;
    public static final ai f3096c = new ai();
    public static final int[] f3097d = new int[]{C0398e.abc_textfield_search_default_mtrl_alpha, C0398e.abc_textfield_default_mtrl_alpha, C0398e.abc_ab_share_pack_mtrl_alpha};
    public static final int[] f3098e = new int[]{C0398e.abc_ic_commit_search_api_mtrl_alpha, C0398e.abc_seekbar_tick_mark_material, C0398e.abc_ic_menu_share_mtrl_alpha, C0398e.abc_ic_menu_copy_mtrl_am_alpha, C0398e.abc_ic_menu_cut_mtrl_alpha, C0398e.abc_ic_menu_selectall_mtrl_alpha, C0398e.abc_ic_menu_paste_mtrl_am_alpha};
    public static final int[] f3099f = new int[]{C0398e.abc_textfield_activated_mtrl_alpha, C0398e.abc_textfield_search_activated_mtrl_alpha, C0398e.abc_cab_background_top_mtrl_alpha, C0398e.abc_text_cursor_material, C0398e.abc_text_select_handle_left_mtrl_dark, C0398e.abc_text_select_handle_middle_mtrl_dark, C0398e.abc_text_select_handle_right_mtrl_dark, C0398e.abc_text_select_handle_left_mtrl_light, C0398e.abc_text_select_handle_middle_mtrl_light, C0398e.abc_text_select_handle_right_mtrl_light};
    public static final int[] f3100g = new int[]{C0398e.abc_popup_background_mtrl_mult, C0398e.abc_cab_background_internal_bg, C0398e.abc_menu_hardkey_panel_mtrl_mult};
    public static final int[] f3101h = new int[]{C0398e.abc_tab_indicator_material, C0398e.abc_textfield_search_material};
    public static final int[] f3102i = new int[]{C0398e.abc_btn_check_material, C0398e.abc_btn_radio_material};
    public WeakHashMap f3103j;
    public C0305a f3104k;
    public C0325v f3105l;
    public final Object f3106m = new Object();
    public final WeakHashMap f3107n = new WeakHashMap(0);
    public TypedValue f3108o;
    public boolean f3109p;

    public static ag m3175a() {
        if (f3095b == null) {
            ag agVar = new ag();
            f3095b = agVar;
            if (VERSION.SDK_INT < 24) {
                agVar.m3178a("vector", new ak());
                agVar.m3178a("animated-vector", new ah());
            }
        }
        return f3095b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable m3184a(android.content.Context r9, int r10, boolean r11) {
        /*
        r8 = this;
        r2 = 1;
        r1 = 0;
        r0 = r8.f3109p;
        if (r0 != 0) goto L_0x0033;
    L_0x0006:
        r8.f3109p = r2;
        r0 = android.support.v7.p040a.C0398e.abc_vector_test;
        r0 = r8.m3184a(r9, r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0010:
        r3 = r0 instanceof android.support.p011c.p012a.C0054l;
        if (r3 != 0) goto L_0x0024;
    L_0x0014:
        r3 = "android.graphics.drawable.VectorDrawable";
        r0 = r0.getClass();
        r0 = r0.getName();
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0031;
    L_0x0024:
        r0 = r2;
    L_0x0025:
        if (r0 != 0) goto L_0x0033;
    L_0x0027:
        r8.f3109p = r1;
        r0 = new java.lang.IllegalStateException;
        r1 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.";
        r0.<init>(r1);
        throw r0;
    L_0x0031:
        r0 = r1;
        goto L_0x0025;
    L_0x0033:
        r0 = r8.m3183a(r9, r10);
        if (r0 != 0) goto L_0x007d;
    L_0x0039:
        r0 = r8.f3108o;
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r8.f3108o = r0;
    L_0x0044:
        r3 = r8.f3108o;
        r0 = r9.getResources();
        r0.getValue(r10, r3, r2);
        r4 = m3172a(r3);
        r0 = r8.m3174a(r9, r4);
        if (r0 != 0) goto L_0x007d;
    L_0x0057:
        r6 = android.support.v7.p040a.C0398e.abc_cab_background_top_material;
        if (r10 != r6) goto L_0x0073;
    L_0x005b:
        r0 = new android.graphics.drawable.LayerDrawable;
        r6 = 2;
        r6 = new android.graphics.drawable.Drawable[r6];
        r7 = android.support.v7.p040a.C0398e.abc_cab_background_internal_bg;
        r7 = r8.m3184a(r9, r7, r1);
        r6[r1] = r7;
        r7 = android.support.v7.p040a.C0398e.abc_cab_background_top_mtrl_alpha;
        r1 = r8.m3184a(r9, r7, r1);
        r6[r2] = r1;
        r0.<init>(r6);
    L_0x0073:
        if (r0 == 0) goto L_0x007d;
    L_0x0075:
        r1 = r3.changingConfigurations;
        r0.setChangingConfigurations(r1);
        r8.m3180a(r9, r4, r0);
    L_0x007d:
        if (r0 != 0) goto L_0x0083;
    L_0x007f:
        r0 = android.support.v4.p028a.C0216d.m1112a(r9, r10);
    L_0x0083:
        if (r0 == 0) goto L_0x0089;
    L_0x0085:
        r0 = r8.m3185a(r9, r10, r11, r0);
    L_0x0089:
        if (r0 == 0) goto L_0x008e;
    L_0x008b:
        android.support.v7.widget.cj.m3401b(r0);
    L_0x008e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ag.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    private static long m3172a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    final Drawable m3185a(Context context, int i, boolean z, Drawable drawable) {
        Mode mode = null;
        ColorStateList b = m3186b(context, i);
        if (b != null) {
            if (cj.m3402c(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = C0259a.m1526e(drawable);
            C0259a.m1516a(drawable, b);
            if (i == C0398e.abc_switch_thumb_material) {
                mode = Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawable;
            }
            C0259a.m1519a(drawable, mode);
            return drawable;
        } else if (i == C0398e.abc_seekbar_track_material) {
            r0 = (LayerDrawable) drawable;
            m3176a(r0.findDrawableByLayerId(16908288), gx.m3760a(context, C0394a.colorControlNormal), f3094a);
            m3176a(r0.findDrawableByLayerId(16908303), gx.m3760a(context, C0394a.colorControlNormal), f3094a);
            m3176a(r0.findDrawableByLayerId(16908301), gx.m3760a(context, C0394a.colorControlActivated), f3094a);
            return drawable;
        } else if (i == C0398e.abc_ratingbar_material || i == C0398e.abc_ratingbar_indicator_material || i == C0398e.abc_ratingbar_small_material) {
            r0 = (LayerDrawable) drawable;
            m3176a(r0.findDrawableByLayerId(16908288), gx.m3762c(context, C0394a.colorControlNormal), f3094a);
            m3176a(r0.findDrawableByLayerId(16908303), gx.m3760a(context, C0394a.colorControlActivated), f3094a);
            m3176a(r0.findDrawableByLayerId(16908301), gx.m3760a(context, C0394a.colorControlActivated), f3094a);
            return drawable;
        } else if (m3179a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    final Drawable m3183a(Context context, int i) {
        if (this.f3104k == null || this.f3104k.isEmpty()) {
            return null;
        }
        String str;
        if (this.f3105l != null) {
            str = (String) this.f3105l.m1709a(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f3104k.get(str) == null)) {
                return null;
            }
        }
        this.f3105l = new C0325v();
        if (this.f3108o == null) {
            this.f3108o = new TypedValue();
        }
        TypedValue typedValue = this.f3108o;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = m3172a(typedValue);
        Drawable a2 = m3174a(context, a);
        if (a2 != null) {
            return a2;
        }
        Drawable drawable;
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                int next;
                XmlPullParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                str = xml.getName();
                this.f3105l.m1713b(i, str);
                aj ajVar = (aj) this.f3104k.get(str);
                if (ajVar != null) {
                    a2 = ajVar.mo751a(context, xml, asAttributeSet, context.getTheme());
                }
                if (a2 != null) {
                    a2.setChangingConfigurations(typedValue.changingConfigurations);
                    m3180a(context, a, a2);
                }
                drawable = a2;
                if (drawable == null) {
                    return drawable;
                }
                this.f3105l.m1713b(i, "appcompat_skip_skip");
                return drawable;
            } catch (Throwable e) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e);
            }
        }
        drawable = a2;
        if (drawable == null) {
            return drawable;
        }
        this.f3105l.m1713b(i, "appcompat_skip_skip");
        return drawable;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.drawable.Drawable m3174a(android.content.Context r5, long r6) {
        /*
        r4 = this;
        r2 = 0;
        r3 = r4.f3106m;
        monitor-enter(r3);
        r0 = r4.f3107n;	 Catch:{ all -> 0x002b }
        r0 = r0.get(r5);	 Catch:{ all -> 0x002b }
        r0 = (android.support.v4.p037h.C0313h) r0;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r0.m1684a(r6);	 Catch:{ all -> 0x002b }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x0031;
    L_0x0019:
        r1 = r1.get();	 Catch:{ all -> 0x002b }
        r1 = (android.graphics.drawable.Drawable.ConstantState) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x002e;
    L_0x0021:
        r0 = r5.getResources();	 Catch:{ all -> 0x002b }
        r0 = r1.newDrawable(r0);	 Catch:{ all -> 0x002b }
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        goto L_0x0010;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        throw r0;
    L_0x002e:
        r0.m1688b(r6);	 Catch:{ all -> 0x002b }
    L_0x0031:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ag.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private final boolean m3180a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f3106m) {
            C0313h c0313h = (C0313h) this.f3107n.get(context);
            if (c0313h == null) {
                c0313h = new C0313h();
                this.f3107n.put(context, c0313h);
            }
            c0313h.m1685a(j, new WeakReference(constantState));
        }
        return true;
    }

    static boolean m3179a(Context context, int i, Drawable drawable) {
        int i2;
        Mode mode;
        boolean z;
        int i3;
        Mode mode2 = f3094a;
        if (m3181a(f3097d, i)) {
            i2 = C0394a.colorControlNormal;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (m3181a(f3099f, i)) {
            i2 = C0394a.colorControlActivated;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (m3181a(f3100g, i)) {
            z = true;
            mode = Mode.MULTIPLY;
            i2 = 16842801;
            i3 = -1;
        } else if (i == C0398e.abc_list_divider_mtrl_alpha) {
            i2 = 16842800;
            i3 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i == C0398e.abc_dialog_material_background) {
            i2 = 16842801;
            mode = mode2;
            z = true;
            i3 = -1;
        } else {
            i3 = -1;
            i2 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (cj.m3402c(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(m3173a(gx.m3760a(context, i2), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    private final void m3178a(String str, aj ajVar) {
        if (this.f3104k == null) {
            this.f3104k = new C0305a();
        }
        this.f3104k.put(str, ajVar);
    }

    private static boolean m3181a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    final ColorStateList m3186b(Context context, int i) {
        ColorStateList colorStateList;
        if (this.f3103j != null) {
            C0325v c0325v = (C0325v) this.f3103j.get(context);
            colorStateList = c0325v != null ? (ColorStateList) c0325v.m1709a(i) : null;
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ColorStateList a;
        if (i == C0398e.abc_edit_text_material) {
            a = C0436b.m2649a(context, C0396c.abc_tint_edittext);
        } else if (i == C0398e.abc_switch_track_mtrl_alpha) {
            a = C0436b.m2649a(context, C0396c.abc_tint_switch_track);
        } else if (i == C0398e.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            a = gx.m3761b(context, C0394a.colorSwitchThumbNormal);
            if (a == null || !a.isStateful()) {
                iArr[0] = gx.f3541b;
                iArr2[0] = gx.m3762c(context, C0394a.colorSwitchThumbNormal);
                iArr[1] = gx.f3544e;
                iArr2[1] = gx.m3760a(context, C0394a.colorControlActivated);
                iArr[2] = gx.f3545f;
                iArr2[2] = gx.m3760a(context, C0394a.colorSwitchThumbNormal);
            } else {
                iArr[0] = gx.f3541b;
                iArr2[0] = a.getColorForState(iArr[0], 0);
                iArr[1] = gx.f3544e;
                iArr2[1] = gx.m3760a(context, C0394a.colorControlActivated);
                iArr[2] = gx.f3545f;
                iArr2[2] = a.getDefaultColor();
            }
            a = new ColorStateList(iArr, iArr2);
        } else {
            a = i == C0398e.abc_btn_default_mtrl_shape ? m3182c(context, gx.m3760a(context, C0394a.colorButtonNormal)) : i == C0398e.abc_btn_borderless_material ? m3182c(context, 0) : i == C0398e.abc_btn_colored_material ? m3182c(context, gx.m3760a(context, C0394a.colorAccent)) : (i == C0398e.abc_spinner_mtrl_am_alpha || i == C0398e.abc_spinner_textfield_background_material) ? C0436b.m2649a(context, C0396c.abc_tint_spinner) : m3181a(f3098e, i) ? gx.m3761b(context, C0394a.colorControlNormal) : m3181a(f3101h, i) ? C0436b.m2649a(context, C0396c.abc_tint_default) : m3181a(f3102i, i) ? C0436b.m2649a(context, C0396c.abc_tint_btn_checkable) : i == C0398e.abc_seekbar_thumb_material ? C0436b.m2649a(context, C0396c.abc_tint_seek_thumb) : colorStateList;
        }
        if (a != null) {
            if (this.f3103j == null) {
                this.f3103j = new WeakHashMap();
            }
            c0325v = (C0325v) this.f3103j.get(context);
            if (c0325v == null) {
                c0325v = new C0325v();
                this.f3103j.put(context, c0325v);
            }
            c0325v.m1713b(i, a);
        }
        return a;
    }

    private static ColorStateList m3182c(Context context, int i) {
        r0 = new int[4][];
        r1 = new int[4];
        int a = gx.m3760a(context, C0394a.colorControlHighlight);
        int c = gx.m3762c(context, C0394a.colorButtonNormal);
        r0[0] = gx.f3541b;
        r1[0] = c;
        r0[1] = gx.f3543d;
        r1[1] = C0268a.m1540a(a, i);
        r0[2] = gx.f3542c;
        r1[2] = C0268a.m1540a(a, i);
        r0[3] = gx.f3545f;
        r1[3] = i;
        return new ColorStateList(r0, r1);
    }

    static void m3177a(Drawable drawable, ha haVar, int[] iArr) {
        ColorFilter colorFilter = null;
        if (!cj.m3402c(drawable) || drawable.mutate() == drawable) {
            if (haVar.f3555d || haVar.f3554c) {
                ColorStateList colorStateList = haVar.f3555d ? haVar.f3552a : null;
                Mode mode = haVar.f3554c ? haVar.f3553b : f3094a;
                if (!(colorStateList == null || mode == null)) {
                    colorFilter = m3173a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(colorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    public static PorterDuffColorFilter m3173a(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) f3096c.m1692a(Integer.valueOf(ai.m3189a(i, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        f3096c.m1693a(Integer.valueOf(ai.m3189a(i, mode)), porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    private static void m3176a(Drawable drawable, int i, Mode mode) {
        if (cj.m3402c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f3094a;
        }
        drawable.setColorFilter(m3173a(i, mode));
    }
}
