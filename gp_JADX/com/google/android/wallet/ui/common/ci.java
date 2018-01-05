package com.google.android.wallet.ui.common;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.e.an;
import android.support.e.az;
import android.support.e.g;
import android.support.v4.app.Fragment;
import android.support.v4.view.ai;
import android.support.v4.view.r;
import android.support.v7.widget.ad;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.volley.a.q;
import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.ak;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.C6523b;
import com.google.android.wallet.common.C6565a;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.C6607s;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6618b;
import com.google.android.wallet.p383e.C6620d;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.address.C6711b;
import com.google.android.wallet.ui.address.C6712a;
import com.google.android.wallet.ui.expander.C6815i;
import com.squareup.haha.perflib.HprofParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class ci {
    public static final Interpolator f33635a = new AccelerateDecelerateInterpolator();
    public static final SparseIntArray f33636b;

    private static int m30837a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static void m30860a(View view, TypedValue typedValue) {
        if (typedValue == null || typedValue.type == 0) {
            view.setVisibility(8);
        } else if (typedValue.type < 28 || typedValue.type > 31) {
            view.setBackgroundResource(typedValue.resourceId);
        } else {
            view.setBackgroundColor(typedValue.data);
        }
    }

    public static void m30862a(View view, boolean z) {
        if (view.getVisibility() == 0) {
            return;
        }
        if (z) {
            m30855a(view, 0);
        } else {
            view.setVisibility(0);
        }
    }

    public static void m30877b(View view, boolean z) {
        if (view.getVisibility() == 8) {
            return;
        }
        if (z) {
            m30856a(view, 0, 0);
        } else {
            view.setVisibility(8);
        }
    }

    public static void m30855a(View view, int i) {
        m30858a(view, i, -1, null);
    }

    public static void m30859a(View view, int i, Runnable runnable) {
        m30858a(view, i, -1, runnable);
    }

    public static void m30858a(View view, int i, long j, Runnable runnable) {
        view.animate().cancel();
        view.setVisibility(0);
        view.setTranslationY((float) i);
        view.setAlpha(0.0f);
        if (i < 0) {
            view.setTag(C6622f.view_is_animating_downwards, Boolean.TRUE);
        }
        ViewPropertyAnimator translationY = view.animate().alpha(1.0f).translationY(0.0f);
        long duration = view.animate().getDuration();
        if (j >= 0) {
            translationY.setDuration(j);
        }
        translationY.setListener(new cj(runnable, view, j, duration));
        translationY.start();
    }

    public static void m30856a(View view, int i, int i2) {
        m30857a(view, i, i2, 8);
    }

    public static void m30876b(View view, int i, int i2) {
        m30857a(view, i, i2, 4);
    }

    private static void m30857a(View view, int i, int i2, int i3) {
        m30883c(view, false);
        view.setTranslationY((float) i);
        view.animate().translationY((float) i2).alpha(0.0f).setListener(new ck(view, i3)).start();
    }

    static void m30883c(View view, boolean z) {
        if ((view instanceof EditText) && !view.hasFocus()) {
            view.setFocusable(z);
            view.setFocusableInTouchMode(z);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m30883c(viewGroup.getChildAt(i), z);
            }
        }
    }

    public static void m30851a(Context context, View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new cl(context.getResources().getDimension(C6620d.wallet_uic_shake_animation_delta)));
        ofFloat.start();
    }

    public static int m30840a(View view) {
        int i;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        return i + view.getHeight();
    }

    public static boolean m30871a(TextView textView, boolean z) {
        if (!textView.requestFocus()) {
            return false;
        }
        if (z && (textView.getImeOptions() & HprofParser.ROOT_UNKNOWN) == 0) {
            textView.setImeOptions(textView.getImeOptions() | 5);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) textView.getContext().getSystemService("input_method");
        if (!inputMethodManager.showSoftInput(textView, 1)) {
            textView.postDelayed(new cm(inputMethodManager, textView), 300);
        }
        return true;
    }

    public static void m30875b(View view) {
        View c = cp.m30912c(view);
        if (c instanceof aa) {
            ((aa) c).cT_();
        } else if (c.hasFocus() || !c.requestFocus()) {
            Rect rect = new Rect();
            c.getDrawingRect(rect);
            rect.bottom += 0;
            c.requestRectangleOnScreen(rect);
        }
    }

    public static void m30882c(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        rect.bottom += 0;
        view.requestRectangleOnScreen(rect);
    }

    public static EditText m30885d(View view) {
        boolean z;
        ArrayList focusables = view.getFocusables(130);
        int size = focusables.size();
        int i = 0;
        TextView textView = null;
        while (i < size) {
            TextView textView2;
            View view2 = (View) focusables.get(i);
            if (view2 instanceof EditText) {
                if (textView != null) {
                    z = true;
                    break;
                }
                textView2 = (EditText) view2;
            } else {
                textView2 = textView;
            }
            i++;
            textView = textView2;
        }
        z = false;
        return (textView == null || !m30871a(textView, z)) ? null : textView;
    }

    public static boolean m30870a(Rect rect, View view, DisplayMetrics displayMetrics) {
        view.getWindowVisibleDisplayFrame(rect);
        return rect.bottom < displayMetrics.heightPixels;
    }

    public static boolean m30879b(Context context, View view) {
        if (context == null) {
            return false;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || view == null) {
            return false;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        return true;
    }

    public static boolean m30872a(FormEditText formEditText) {
        if ((formEditText.getImeOptions() & 301989888) != 0) {
            return false;
        }
        return m30869a(formEditText.getContext());
    }

    public static boolean m30869a(Context context) {
        if (!m30890e(context) && context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    @TargetApi(16)
    public static void m30861a(View view, CharSequence charSequence) {
        if (!C6589a.m29897a(view.getContext())) {
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            view.announceForAccessibility(charSequence);
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(8);
        obtain.setEnabled(true);
        obtain.getText().add(charSequence);
        ((AccessibilityManager) view.getContext().getSystemService("accessibility")).sendAccessibilityEvent(obtain);
    }

    public static void m30886d(View view, boolean z) {
        if (!(view instanceof ViewGroup) || (view instanceof InfoMessageView)) {
            view.setEnabled(z);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m30886d(viewGroup.getChildAt(i), z);
        }
    }

    public static View m30845a(LayoutInflater layoutInflater, int i, a aVar, C6504m c6504m, C6527m c6527m) {
        View view;
        if (aVar.c != null) {
            View view2 = (InfoMessageView) layoutInflater.inflate(i, null);
            view2.setUrlClickListener(c6527m);
            view2.setInfoMessage(aVar.c);
            view = view2;
        } else {
            view = null;
        }
        if (!TextUtils.isEmpty(aVar.d)) {
            WebViewLayout webViewLayout = (WebViewLayout) layoutInflater.inflate(C6623g.view_web_view_layout, null);
            webViewLayout.m30704a(aVar.d, null);
            webViewLayout.setParentUiNode(c6504m);
            if (view == null) {
                return webViewLayout;
            }
            view.setParentUiNode(webViewLayout);
            webViewLayout.setHeaderView(view);
            return webViewLayout;
        } else if (view != null) {
            view.setParentUiNode(c6504m);
            return view;
        } else {
            throw new IllegalArgumentException("Unsupported legal message configuration.");
        }
    }

    public static boolean m30868a(Activity activity, TextView textView) {
        if (activity != null && C6607s.m29980a(activity, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) activity.getSystemService("phone");
            if (telephonyManager != null) {
                m30866a(textView, telephonyManager.getLine1Number(), 7);
                return true;
            }
        }
        return false;
    }

    public static void m30866a(TextView textView, String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            CharSequence formatNumber = PhoneNumberUtils.formatNumber(str);
        }
        if (textView instanceof FormEditText) {
            ((FormEditText) textView).mo5626a(formatNumber, i);
        } else {
            textView.setText(formatNumber);
        }
    }

    @TargetApi(21)
    public static String m30850a(String str, String str2) {
        if (VERSION.SDK_INT >= 21) {
            return PhoneNumberUtils.formatNumber(str, str2);
        }
        return PhoneNumberUtils.formatNumber(str);
    }

    public static String m30849a(String str, int i, int i2, boolean z) {
        int i3;
        if (!z || VERSION.SDK_INT < 18) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        String str2 = i3 != 0 ? "-rw" : "";
        return String.format(Locale.US, "%s=w%d-h%d-e365%s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), str2});
    }

    public static int[] m30873a(Context context, List list, ak[] akVarArr, ViewGroup viewGroup) {
        int size = list.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            iArr[i2] = -1;
            View view = (View) list.get(i2);
            View c = cp.m30912c(view);
            if (akVarArr == null || i >= akVarArr.length || i2 < akVarArr[i].b) {
                viewGroup.addView(view);
                if (m30896i(c)) {
                    iArr[i2] = viewGroup.getChildCount() - 1;
                }
            } else {
                ak akVar = akVarArr[i];
                boolean a = C6591c.m29906a(akVar.d, i2);
                if (c instanceof TextView) {
                    ViewGroup viewGroup2;
                    ViewGroup viewGroup3;
                    View view2;
                    if (i2 != akVar.b) {
                        viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                        if (m30896i(c)) {
                            iArr[i2] = viewGroup.getChildCount() - 1;
                        }
                        i++;
                        viewGroup3 = viewGroup2;
                    } else if (akVar.c != akVar.b + 1) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Field groupings must contain exactly 2 fields (%d, %d)", new Object[]{Integer.valueOf(akVar.b), Integer.valueOf(akVar.c)}));
                    } else {
                        viewGroup3 = new LinearLayout(context);
                        viewGroup3.setLayoutParams(new LayoutParams(-1, -2));
                        ((LinearLayout) viewGroup3).setOrientation(0);
                        viewGroup.addView(viewGroup3);
                    }
                    viewGroup3.addView(view);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                    if (a) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.weight = 1.0f;
                        layoutParams.width = 0;
                    }
                    if (i2 != akVar.b) {
                        r.a(layoutParams, viewGroup.getResources().getDimensionPixelSize(C6620d.wallet_uic_horizontal_margin_between_fields_with_padding) + r.a(layoutParams));
                    }
                    view.setLayoutParams(layoutParams);
                    if (view instanceof ce) {
                        view2 = (ce) view;
                    } else {
                        if (view instanceof ViewGroup) {
                            viewGroup2 = (ViewGroup) view;
                            int childCount = viewGroup2.getChildCount();
                            for (int i3 = 0; i3 < childCount; i3++) {
                                View childAt = viewGroup2.getChildAt(i3);
                                if (childAt instanceof ce) {
                                    ce ceVar = (ce) childAt;
                                    break;
                                }
                            }
                        }
                        view2 = null;
                    }
                    if (view2 != null) {
                        if (view != view2) {
                            view2.getLayoutParams().width = -2;
                        }
                        view2.setIconHiddenWhenUnfocused(true);
                    }
                    if (a) {
                        c.getLayoutParams().width = -2;
                        c.setLayoutParams(c.getLayoutParams());
                    }
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Field groupings are only supported for text and date ui fields. index %d view type: %s field grouping: %d-%d", new Object[]{Integer.valueOf(i2), view.getClass().getName(), Integer.valueOf(akVar.b), Integer.valueOf(akVar.c)}));
                }
            }
            i2++;
        }
        return iArr;
    }

    private static boolean m30896i(View view) {
        if (view instanceof C6668c) {
            return true;
        }
        Integer num = (Integer) view.getTag(C6622f.field_type);
        return num != null && num.intValue() == 2;
    }

    public static int m30839a(Context context, String str, int i) {
        if (C6600l.m29953a(str)) {
            return m30838a(context, C6600l.m29958b(str), i);
        }
        String str2 = "Invalid embedded image URI: ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public static int m30838a(Context context, int i, int i2) {
        if (f33636b.get(i, -1) != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{f33636b.get(i, -1)});
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                return resourceId;
            }
            if (i2 != -1) {
                return i2;
            }
            throw new IllegalArgumentException("Theme does not contain the requested embedded image: " + i);
        } else if (i2 != -1) {
            return i2;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid embedded image ID: %d Default resource id also not set.", new Object[]{Integer.valueOf(i)}));
        }
    }

    public static int m30835a(int i) {
        if (VERSION.SDK_INT < 17) {
            return m30836a(i, true);
        }
        return i;
    }

    @TargetApi(19)
    public static void m30865a(RelativeLayout.LayoutParams layoutParams, int i, int i2) {
        boolean z = true;
        layoutParams.addRule(i, 0);
        if (VERSION.SDK_INT >= 17) {
            int i3;
            switch (i) {
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    boolean z2 = true;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i3 != 0) {
                if (i2 != 0) {
                    z = false;
                }
                layoutParams.addRule(m30836a(i, z), 0);
            }
        }
    }

    @TargetApi(17)
    private static int m30836a(int i, boolean z) {
        switch (i) {
            case 16:
                return z ? 0 : 1;
            case 17:
                return z ? 1 : 0;
            case 18:
                return z ? 5 : 7;
            case 19:
                return z ? 7 : 5;
            case 20:
                return z ? 9 : 11;
            case 21:
                return z ? 11 : 9;
            default:
                return i;
        }
    }

    public static void m30889e(View view) {
        View findViewById = view.findViewById(C6622f.focus_stealer);
        if (findViewById != null) {
            findViewById.requestFocus();
        } else {
            view.clearFocus();
        }
    }

    public static void m30854a(Fragment fragment) {
        m30889e(fragment.h().findViewById(16908290));
    }

    public static void m30891f(View view) {
        if (view.isFocusable()) {
            View view2 = null;
            View view3 = view;
            while (view2 == null && view3 != null) {
                view3 = view3.focusSearch(2);
                if (view3 != null && view3.isFocusableInTouchMode()) {
                    view2 = view3;
                }
            }
            if (view2 == null) {
                return;
            }
            if (!C6589a.m29897a(view3.getContext()) || C6589a.m29896a()) {
                view2.requestFocus();
                return;
            } else {
                view2.postDelayed(new cn(view2), 750);
                return;
            }
        }
        Log.d("UiComponentUtils", "viewToSearchFrom in advanceFocusForForm is not focusable.");
    }

    public static void m30853a(Rect rect, View view, View view2, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (View view3 = view; view3 != view2; view3 = (View) view3.getParent()) {
            view3.getHitRect(rect);
            i4 += rect.left;
            i3 += rect.top;
        }
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
        i4 = (i - view.getHeight()) / 2;
        int width = (i2 - view.getWidth()) / 2;
        if (width > 0) {
            i3 = -width;
        } else {
            i3 = 0;
        }
        rect.inset(i3, i4 > 0 ? -i4 : 0);
    }

    public static void m30867a(int[] iArr, View view, View view2) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("outPosition must be an array of two integers");
        }
        Arrays.fill(iArr, 0);
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        View parent = view.getParent();
        while ((parent instanceof View) && parent != view2) {
            parent = parent;
            iArr[0] = iArr[0] - parent.getScrollX();
            iArr[1] = iArr[1] - parent.getScrollY();
            iArr[0] = iArr[0] + parent.getLeft();
            iArr[1] = iArr[1] + parent.getTop();
            parent = parent.getParent();
        }
        if (parent != view2) {
            throw new IllegalArgumentException("ancestorView not an ancestor of view");
        }
    }

    public static boolean m30894g(View view) {
        return ((!(view instanceof TextView) && !(view instanceof InfoMessageView)) || (view instanceof Button) || m30895h(view)) ? false : true;
    }

    public static boolean m30895h(View view) {
        return (view instanceof EditText) || ((view instanceof TextView) && ((TextView) view).isInputMethodTarget());
    }

    public static ColorStateList m30874b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842808, C6617a.colorAccent});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        int color = obtainStyledAttributes.getColor(1, -16777216);
        obtainStyledAttributes.recycle();
        int colorForState = colorStateList.getColorForState(new int[]{-16842910}, -16777216);
        int defaultColor = colorStateList.getDefaultColor();
        r3 = new int[6][];
        r3[0] = new int[]{-16842910};
        r3[1] = new int[]{16842919};
        r3[2] = new int[]{16842908};
        r3[3] = new int[]{16842912};
        r3[4] = new int[]{16843518};
        r3[5] = new int[0];
        return new ColorStateList(r3, new int[]{colorForState, color, color, color, color, defaultColor});
    }

    public static ColorStateList m30881c(Context context) {
        int a = m30837a(context, C6617a.colorAccent);
        int round = (Math.round(((float) Color.alpha(a)) * 0.3f) << 24) | (16777215 & a);
        r2 = new int[2][];
        r2[0] = new int[]{-16842910};
        r2[1] = new int[0];
        return new ColorStateList(r2, new int[]{round, a});
    }

    @TargetApi(21)
    public static void m30852a(Context context, Button button) {
        boolean z = true;
        if (VERSION.SDK_INT >= 21) {
            int a = m30837a(context, 16843829);
            int a2 = m30837a(context, C6617a.internalUicColorWalletButtonDisabled);
            r4 = new int[2][];
            r4[0] = new int[]{-16842910};
            r4[1] = new int[0];
            ColorStateList colorStateList = new ColorStateList(r4, new int[]{a2, a});
            if (VERSION.SDK_INT == 21 && (button instanceof ad)) {
                ((ad) button).setSupportBackgroundTintList(colorStateList);
            } else {
                ai.a(button, colorStateList);
            }
            if (VERSION.SDK_INT >= 11) {
                boolean z2;
                if (button.isActivated()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                button.setActivated(z2);
                if (button.isActivated()) {
                    z = false;
                }
                button.setActivated(z);
            }
        }
    }

    public static void m30864a(ImageView imageView, ColorStateList colorStateList) {
        Drawable e = android.support.v4.b.a.a.e(imageView.getDrawable().mutate());
        android.support.v4.b.a.a.a(e, colorStateList);
        imageView.setImageDrawable(e);
        imageView.setImageState(new int[]{16843518}, true);
    }

    public static C6711b m30847a(com.google.a.a.a.a.b.a.a.f.a aVar, int i, LogContext logContext) {
        if (aVar.z) {
            return C6712a.m30393a(aVar, i, logContext);
        }
        return C6711b.m30377b(aVar, i, logContext);
    }

    public static boolean m30878b(int i) {
        return i == 2 || i == 12;
    }

    public static int m30880c(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
            case 10007:
                return 3;
            case 10001:
            case 10004:
                return 2;
            case 10003:
            case 10005:
            case 10006:
            case 10009:
                return 4;
            default:
                return 0;
        }
    }

    public static int m30884d(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 7:
                return 4;
            case 6:
                return 2;
            default:
                return 0;
        }
    }

    public static int m30888e(int i) {
        switch (i) {
            case 3:
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 4;
            default:
                return 0;
        }
    }

    public static Intent m30842a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        return intent;
    }

    public static boolean m30887d(Context context) {
        int i;
        int[] iArr = new int[]{1};
        C6565a g = m30893g(context);
        if (g == null) {
            i = 0;
        } else {
            for (i = 0; i <= 0; i++) {
                if (!g.m29797a(iArr[0])) {
                    i = 0;
                    break;
                }
            }
            boolean z = true;
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    private static C6565a m30893g(Context context) {
        if (context instanceof C6523b) {
            return ((C6523b) context).mo5480c();
        }
        if (context instanceof ContextThemeWrapper) {
            return m30893g(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean m30890e(Context context) {
        return context.getResources().getBoolean(C6618b.wallet_uic_is_tablet);
    }

    public static Bitmap m30843a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float width = 0.035714287f * ((float) bitmap.getWidth());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, width, width, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static View m30846a(LayoutInflater layoutInflater, ae aeVar, q qVar, ViewGroup viewGroup, bb bbVar, boolean z, at atVar) {
        if (aeVar.c.length == 1) {
            InfoMessageWithImageAndText infoMessageWithImageAndText = (InfoMessageWithImageAndText) layoutInflater.inflate(C6623g.view_info_message_with_image_and_text, viewGroup, false);
            if (aeVar.c.length != 1) {
                throw new IllegalArgumentException("InfoMessageWithImageAndText requires exactly one image.");
            }
            infoMessageWithImageAndText.f33407b = aeVar;
            infoMessageWithImageAndText.f33408c = (InfoMessageView) infoMessageWithImageAndText.findViewById(C6622f.info_message_text_view);
            infoMessageWithImageAndText.f33408c.setParentFormElement(infoMessageWithImageAndText);
            infoMessageWithImageAndText.f33409d = (ImageWithCaptionView) infoMessageWithImageAndText.findViewById(C6622f.image_view);
            infoMessageWithImageAndText.f33408c.setInfoMessage(infoMessageWithImageAndText.f33407b);
            infoMessageWithImageAndText.f33408c.setId(bbVar.m30742a());
            infoMessageWithImageAndText.f33409d.m30637a(infoMessageWithImageAndText.f33407b.c[0], qVar, z);
            infoMessageWithImageAndText.setId(bbVar.m30742a());
            infoMessageWithImageAndText.setParentFormElement(atVar);
            return infoMessageWithImageAndText;
        } else if (aeVar.c.length == 0) {
            InfoMessageView infoMessageView = (InfoMessageView) layoutInflater.inflate(C6623g.view_info_message_text, viewGroup, false);
            infoMessageView.setInfoMessage(aeVar);
            infoMessageView.setId(bbVar.m30742a());
            infoMessageView.setParentFormElement(atVar);
            return infoMessageView;
        } else {
            throw new IllegalArgumentException("InfoMessages with multiple images aren't supported");
        }
    }

    public static boolean m30892f(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6617a.internalUicUseWebViewDialog});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        return z;
    }

    @TargetApi(19)
    public static az m30844a() {
        an azVar = new az();
        an gVar = new g();
        gVar.a("excludeViewFromChangeBounds", true);
        gVar.a(f33635a);
        azVar.a(gVar);
        gVar = new C6815i();
        gVar.a(f33635a);
        azVar.a(gVar);
        azVar.a(400);
        azVar.a(0);
        azVar.a(f33635a);
        return azVar;
    }

    public static int m30841a(View view, View view2) {
        int top = view.getTop();
        while (view.getParent() != view2 && (view.getParent() instanceof View)) {
            View view3 = (View) view.getParent();
            top += view3.getTop();
            view = view3;
        }
        return top;
    }

    public static CharSequence m30848a(CharSequence charSequence) {
        return charSequence != null ? charSequence : "";
    }

    public static void m30863a(ImageView imageView, int i, Context context, CharSequence charSequence) {
        String string;
        int i2;
        int i3;
        if (i == 2) {
            i3 = C6617a.uicClearDrawable;
            string = context.getResources().getString(C6625i.wallet_uic_summary_clear_button_description);
            i2 = i3;
        } else {
            i3 = C6617a.uicEditDrawable;
            string = context.getResources().getString(C6625i.wallet_uic_summary_edit_button_description);
            i2 = i3;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i2, C6617a.internalUicEditAndClearableIconColor});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (VERSION.SDK_INT < 21 || !(drawable instanceof LayerDrawable)) {
            drawable.mutate();
        } else {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i4 = 0; i4 < numberOfLayers; i4++) {
                layerDrawable.setId(i4, i4);
                layerDrawable.setDrawableByLayerId(i4, layerDrawable.getDrawable(i4).mutate());
            }
        }
        Drawable e = android.support.v4.b.a.a.e(drawable);
        android.support.v4.b.a.a.a(e, colorStateList);
        obtainStyledAttributes.recycle();
        imageView.setImageDrawable(e);
        imageView.setContentDescription(String.format(Locale.getDefault(), string, new Object[]{charSequence}));
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(59);
        f33636b = sparseIntArray;
        sparseIntArray.put(1, C6617a.internalUicCreditCardAmexLogoDrawable);
        f33636b.put(2, C6617a.internalUicCreditCardDiscoverLogoDrawable);
        f33636b.put(3, C6617a.internalUicCreditCardJcbLogoDrawable);
        f33636b.put(4, C6617a.internalUicCreditCardMastercardLogoDrawable);
        f33636b.put(5, C6617a.internalUicCreditCardVisaLogoDrawable);
        f33636b.put(6, C6617a.internalUicCreditCardDinersClubLogoDrawable);
        f33636b.put(15, C6617a.internalUicCreditCardEloLogoDrawable);
        f33636b.put(25, C6617a.internalUicCreditCardCartesBancairesLogoDrawable);
        f33636b.put(21, C6617a.internalUicCreditCardUnknownLogoDrawable);
        f33636b.put(13, C6617a.internalUicCreditCardCvcFrontDrawable);
        f33636b.put(14, C6617a.internalUicCreditCardCvcBackDrawable);
        f33636b.put(34, C6617a.internalUicCreditCardCvcFrontLargeDrawable);
        f33636b.put(35, C6617a.internalUicCreditCardCvcBackLargeDrawable);
        f33636b.put(45, C6617a.internalUicCarrierBillingDrawable);
        f33636b.put(26, C6617a.internalUicPaypalLightDrawable);
        f33636b.put(113, C6617a.internalUicSetupWizardPlayIconDrawable);
        f33636b.put(114, C6617a.internalUicSetupWizardAndroidPayIconDrawable);
        f33636b.put(115, C6617a.internalUicSetupWizardGenericCreditCardIconDrawable);
        f33636b.put(149, C6617a.internalUicAndroidPayAcceptanceMarkIconDrawable);
        f33636b.put(116, C6617a.internalUicAndroidPayHeroImageDrawable);
        f33636b.put(304, C6617a.internalUicAndroidPayPaypalHeroImageDrawable);
        f33636b.put(309, C6617a.internalUicAndroidPayVisaCheckoutHeroImageDrawable);
        f33636b.put(150, C6617a.internalUicGoogleLogoHeroImageDrawable);
        f33636b.put(316, C6617a.internalUicGoogleLogoColorHeroImageDrawable);
        f33636b.put(296, C6617a.internalUicNfcIconDrawable);
        f33636b.put(47, C6617a.internalUicSectionIconTaxInformationDrawable);
        f33636b.put(63, C6617a.internalUicSectionIconLocationDrawable);
        f33636b.put(98, C6617a.internalUicSectionIconNumberDrawable);
        f33636b.put(111, C6617a.internalUicSectionIconAccountDrawable);
        f33636b.put(118, C6617a.internalUicSectionIconDateDrawable);
        f33636b.put(119, C6617a.internalUicSectionIconBillingDrawable);
        f33636b.put(104, C6617a.internalUicInfoIconDrawable);
        f33636b.put(109, C6617a.internalUicFilledInfoIconDrawable);
        f33636b.put(120, C6617a.internalUicShippingMethodGroundIconDrawable);
        f33636b.put(151, C6617a.internalUicFingerprintStartIconDrawable);
        f33636b.put(152, C6617a.internalUicFingerprintSuccessIconDrawable);
        f33636b.put(153, C6617a.internalUicFingerprintFailedIconDrawable);
        f33636b.put(155, C6617a.internalUicEditModeIconDrawable);
        f33636b.put(156, C6617a.internalUicSampleAccountNumberUsDrawable);
        f33636b.put(157, C6617a.internalUicSampleRoutingNumberUsDrawable);
        f33636b.put(105, C6617a.internalUicYodleeLinkedDrawable);
        f33636b.put(128, C6617a.internalUicPromoIconDrawable);
        f33636b.put(164, C6617a.internalUicBankAccountIconDarkDrawable);
        f33636b.put(126, C6617a.internalUicSectionIconBillingAccountDrawable);
        f33636b.put(127, C6617a.internalUicCreditCardUnknownLogoDrawable);
        f33636b.put(287, C6617a.internalUicSectionIconListDrawable);
        f33636b.put(102, C6617a.internalUicSectionIconCountryDrawable);
        f33636b.put(112, C6617a.internalUicSectionIconLanguageDrawable);
        f33636b.put(305, C6617a.internalUicSectionIconKeyDrawable);
        f33636b.put(214, C6617a.internalUicUserIconDrawable);
        f33636b.put(189, C6617a.internalUicSectionIconPermissionDrawable);
        f33636b.put(154, C6617a.internalUicEmailIconDrawable);
        f33636b.put(62, C6617a.internalUicWarningRedIconDrawable);
        f33636b.put(311, C6617a.internalUicFilterListWhiteIconDrawable);
        f33636b.put(182, C6617a.internalUicDriveFormIconDrawable);
        f33636b.put(125, C6617a.internalUicSectionIconContactDetailsDrawable);
        f33636b.put(190, C6617a.internalUicPaginationPreviousDrawable);
        f33636b.put(191, C6617a.internalUicPaginationNextDrawable);
        f33636b.put(326, C6617a.internalUicCircleDoneIconBlueDrawable);
    }
}
