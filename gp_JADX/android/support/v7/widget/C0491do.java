package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.ai;
import android.support.v4.widget.aq;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0403j;
import android.support.v7.view.menu.al;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.squareup.haha.perflib.StackFrame;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.lang.reflect.Method;

public class C0491do implements al {
    public static Method f3140e;
    public static Method f3141f;
    public static Method f3142g;
    public OnItemClickListener f3143A;
    public OnItemSelectedListener f3144B;
    public final dv f3145C;
    public final du f3146D;
    public final dt f3147E;
    public final dr f3148F;
    public final Handler f3149G;
    public final Rect f3150H;
    public Rect f3151I;
    public boolean f3152J;
    public PopupWindow f3153K;
    public ListAdapter f3154b;
    public Context f3155h;
    public ck f3156i;
    public int f3157j;
    public int f3158k;
    public int f3159l;
    public int f3160m;
    public int f3161n;
    public boolean f3162o;
    public boolean f3163p;
    public boolean f3164q;
    public int f3165r;
    public boolean f3166s;
    public boolean f3167t;
    public int f3168u;
    public View f3169v;
    public int f3170w;
    public DataSetObserver f3171x;
    public View f3172y;
    public Drawable f3173z;

    public C0491do(Context context) {
        this(context, null, C0394a.listPopupWindowStyle);
    }

    public C0491do(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0491do(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3157j = -2;
        this.f3158k = -2;
        this.f3161n = 1002;
        this.f3165r = 0;
        this.f3166s = false;
        this.f3167t = false;
        this.f3168u = Integer.MAX_VALUE;
        this.f3170w = 0;
        this.f3145C = new dv(this);
        this.f3146D = new du(this);
        this.f3147E = new dt(this);
        this.f3148F = new dr(this);
        this.f3150H = new Rect();
        this.f3155h = context;
        this.f3149G = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.ListPopupWindow, i, i2);
        this.f3159l = obtainStyledAttributes.getDimensionPixelOffset(C0403j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f3160m = obtainStyledAttributes.getDimensionPixelOffset(C0403j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f3160m != 0) {
            this.f3162o = true;
        }
        obtainStyledAttributes.recycle();
        this.f3153K = new ar(context, attributeSet, i, i2);
        this.f3153K.setInputMethodMode(1);
    }

    public void mo753a(ListAdapter listAdapter) {
        if (this.f3171x == null) {
            this.f3171x = new ds(this);
        } else if (this.f3154b != null) {
            this.f3154b.unregisterDataSetObserver(this.f3171x);
        }
        this.f3154b = listAdapter;
        if (this.f3154b != null) {
            listAdapter.registerDataSetObserver(this.f3171x);
        }
        if (this.f3156i != null) {
            this.f3156i.setAdapter(this.f3154b);
        }
    }

    public final void m3217f() {
        this.f3152J = true;
        this.f3153K.setFocusable(true);
    }

    public final void m3209a(Drawable drawable) {
        this.f3153K.setBackgroundDrawable(drawable);
    }

    public final int m3218g() {
        if (this.f3162o) {
            return this.f3160m;
        }
        return 0;
    }

    public final void m3208a(int i) {
        this.f3160m = i;
        this.f3162o = true;
    }

    public final void m3213b(int i) {
        Drawable background = this.f3153K.getBackground();
        if (background != null) {
            background.getPadding(this.f3150H);
            this.f3158k = (this.f3150H.left + this.f3150H.right) + i;
            return;
        }
        this.f3158k = i;
    }

    public void mo671b() {
        int i;
        int i2;
        boolean z;
        int makeMeasureSpec;
        boolean z2 = true;
        LayoutParams layoutParams;
        View view;
        if (this.f3156i == null) {
            Context context = this.f3155h;
            dp dpVar = new dp(this);
            this.f3156i = mo823a(context, !this.f3152J);
            if (this.f3173z != null) {
                this.f3156i.setSelector(this.f3173z);
            }
            this.f3156i.setAdapter(this.f3154b);
            this.f3156i.setOnItemClickListener(this.f3143A);
            this.f3156i.setFocusable(true);
            this.f3156i.setFocusableInTouchMode(true);
            this.f3156i.setOnItemSelectedListener(new dq(this));
            this.f3156i.setOnScrollListener(this.f3147E);
            if (this.f3144B != null) {
                this.f3156i.setOnItemSelectedListener(this.f3144B);
            }
            View view2 = this.f3156i;
            View view3 = this.f3169v;
            if (view3 != null) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0, 1.0f);
                switch (this.f3170w) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams2);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams2);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f3170w);
                        break;
                }
                if (this.f3158k >= 0) {
                    i = this.f3158k;
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = 0;
                    i = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i, i2), 0);
                layoutParams = (LayoutParams) view3.getLayoutParams();
                i2 = layoutParams.bottomMargin + (view3.getMeasuredHeight() + layoutParams.topMargin);
                view = linearLayout;
            } else {
                view = view2;
                i2 = 0;
            }
            this.f3153K.setContentView(view);
        } else {
            this.f3153K.getContentView();
            view = this.f3169v;
            if (view != null) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                i2 = layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.f3153K.getBackground();
        if (background != null) {
            background.getPadding(this.f3150H);
            i = this.f3150H.top + this.f3150H.bottom;
            if (!this.f3162o) {
                this.f3160m = -this.f3150H.top;
            }
        } else {
            this.f3150H.setEmpty();
            i = 0;
        }
        if (this.f3153K.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = m3206a(this.f3172y, this.f3160m, z);
        if (this.f3166s || this.f3157j == -1) {
            i2 = a + i;
        } else {
            switch (this.f3158k) {
                case StackFrame.COMPILED_METHOD /*-2*/:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f3155h.getResources().getDisplayMetrics().widthPixels - (this.f3150H.left + this.f3150H.right), Integer.MIN_VALUE);
                    break;
                case -1:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f3155h.getResources().getDisplayMetrics().widthPixels - (this.f3150H.left + this.f3150H.right), MemoryMappedFileBuffer.DEFAULT_SIZE);
                    break;
                default:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f3158k, MemoryMappedFileBuffer.DEFAULT_SIZE);
                    break;
            }
            makeMeasureSpec = this.f3156i.m3403a(makeMeasureSpec, a - i2);
            if (makeMeasureSpec > 0) {
                i2 += i + (this.f3156i.getPaddingTop() + this.f3156i.getPaddingBottom());
            }
            i2 += makeMeasureSpec;
        }
        z = m3221j();
        aq.m2196a(this.f3153K, this.f3161n);
        if (this.f3153K.isShowing()) {
            if (ai.f1848a.mo410t(this.f3172y)) {
                if (this.f3158k == -1) {
                    i = -1;
                } else if (this.f3158k == -2) {
                    i = this.f3172y.getWidth();
                } else {
                    i = this.f3158k;
                }
                if (this.f3157j == -1) {
                    if (z) {
                        makeMeasureSpec = i2;
                    } else {
                        makeMeasureSpec = -1;
                    }
                    PopupWindow popupWindow;
                    if (z) {
                        popupWindow = this.f3153K;
                        if (this.f3158k == -1) {
                            i2 = -1;
                        } else {
                            i2 = 0;
                        }
                        popupWindow.setWidth(i2);
                        this.f3153K.setHeight(0);
                        a = makeMeasureSpec;
                    } else {
                        popupWindow = this.f3153K;
                        if (this.f3158k == -1) {
                            i2 = -1;
                        } else {
                            i2 = 0;
                        }
                        popupWindow.setWidth(i2);
                        this.f3153K.setHeight(-1);
                        a = makeMeasureSpec;
                    }
                } else if (this.f3157j == -2) {
                    a = i2;
                } else {
                    a = this.f3157j;
                }
                PopupWindow popupWindow2 = this.f3153K;
                if (this.f3167t || this.f3166s) {
                    z2 = false;
                }
                popupWindow2.setOutsideTouchable(z2);
                popupWindow2 = this.f3153K;
                View view4 = this.f3172y;
                int i3 = this.f3159l;
                makeMeasureSpec = this.f3160m;
                if (i < 0) {
                    i = -1;
                }
                if (a < 0) {
                    a = -1;
                }
                popupWindow2.update(view4, i3, makeMeasureSpec, i, a);
                return;
            }
            return;
        }
        if (this.f3158k == -1) {
            makeMeasureSpec = -1;
        } else if (this.f3158k == -2) {
            makeMeasureSpec = this.f3172y.getWidth();
        } else {
            makeMeasureSpec = this.f3158k;
        }
        if (this.f3157j == -1) {
            i2 = -1;
        } else if (this.f3157j != -2) {
            i2 = this.f3157j;
        }
        this.f3153K.setWidth(makeMeasureSpec);
        this.f3153K.setHeight(i2);
        if (f3140e != null) {
            try {
                f3140e.invoke(this.f3153K, new Object[]{Boolean.valueOf(true)});
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
        popupWindow2 = this.f3153K;
        if (this.f3167t || this.f3166s) {
            z2 = false;
        }
        popupWindow2.setOutsideTouchable(z2);
        this.f3153K.setTouchInterceptor(this.f3146D);
        if (this.f3164q) {
            aq.m2197a(this.f3153K, this.f3163p);
        }
        if (f3142g != null) {
            try {
                f3142g.invoke(this.f3153K, new Object[]{this.f3151I});
            } catch (Throwable e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        aq.f2076a.mo467a(this.f3153K, this.f3172y, this.f3159l, this.f3160m, this.f3165r);
        this.f3156i.setSelection(-1);
        if (!this.f3152J || this.f3156i.isInTouchMode()) {
            m3220i();
        }
        if (!this.f3152J) {
            this.f3149G.post(this.f3148F);
        }
    }

    public final void mo674c() {
        this.f3153K.dismiss();
        if (this.f3169v != null) {
            ViewParent parent = this.f3169v.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3169v);
            }
        }
        this.f3153K.setContentView(null);
        this.f3156i = null;
        this.f3149G.removeCallbacks(this.f3145C);
    }

    public final void m3211a(OnDismissListener onDismissListener) {
        this.f3153K.setOnDismissListener(onDismissListener);
    }

    public final void m3219h() {
        this.f3153K.setInputMethodMode(2);
    }

    public final void m3220i() {
        ck ckVar = this.f3156i;
        if (ckVar != null) {
            ckVar.f3288a = true;
            ckVar.requestLayout();
        }
    }

    public final boolean mo677d() {
        return this.f3153K.isShowing();
    }

    public final boolean m3221j() {
        return this.f3153K.getInputMethodMode() == 2;
    }

    public final ListView mo678e() {
        return this.f3156i;
    }

    ck mo823a(Context context, boolean z) {
        return new ck(context, z);
    }

    private final int m3206a(View view, int i, boolean z) {
        if (f3141f != null) {
            try {
                return ((Integer) f3141f.invoke(this.f3153K, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f3153K.getMaxAvailableHeight(view, i);
    }

    static {
        try {
            f3140e = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f3141f = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f3142g = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }
}
