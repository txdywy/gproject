package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.haha.perflib.StackFrame;

public final class AlertController {
    public TextView f2200A;
    public TextView f2201B;
    public View f2202C;
    public ListAdapter f2203D;
    public int f2204E = -1;
    public int f2205F;
    public int f2206G;
    public int f2207H;
    public int f2208I;
    public int f2209J;
    public int f2210K;
    public boolean f2211L;
    public int f2212M = 0;
    public Handler f2213N;
    public final OnClickListener f2214O = new C0420l(this);
    public final Context f2215a;
    public final be f2216b;
    public final Window f2217c;
    public CharSequence f2218d;
    public CharSequence f2219e;
    public ListView f2220f;
    public View f2221g;
    public int f2222h;
    public int f2223i;
    public int f2224j;
    public int f2225k;
    public int f2226l;
    public boolean f2227m = false;
    public Button f2228n;
    public CharSequence f2229o;
    public Message f2230p;
    public Button f2231q;
    public CharSequence f2232r;
    public Message f2233s;
    public Button f2234t;
    public CharSequence f2235u;
    public Message f2236v;
    public NestedScrollView f2237w;
    public int f2238x = 0;
    public Drawable f2239y;
    public ImageView f2240z;

    public class RecycleListView extends ListView {
        public final int f2198a;
        public final int f2199b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.RecycleListView);
            this.f2199b = obtainStyledAttributes.getDimensionPixelOffset(C0403j.RecycleListView_paddingBottomNoButtons, -1);
            this.f2198a = obtainStyledAttributes.getDimensionPixelOffset(C0403j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public AlertController(Context context, be beVar, Window window) {
        this.f2215a = context;
        this.f2216b = beVar;
        this.f2217c = window;
        this.f2213N = new C0431w(beVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0403j.AlertDialog, C0394a.alertDialogStyle, 0);
        this.f2205F = obtainStyledAttributes.getResourceId(C0403j.AlertDialog_android_layout, 0);
        this.f2206G = obtainStyledAttributes.getResourceId(C0403j.AlertDialog_buttonPanelSideLayout, 0);
        this.f2207H = obtainStyledAttributes.getResourceId(C0403j.AlertDialog_listLayout, 0);
        this.f2208I = obtainStyledAttributes.getResourceId(C0403j.AlertDialog_multiChoiceItemLayout, 0);
        this.f2209J = obtainStyledAttributes.getResourceId(C0403j.AlertDialog_singleChoiceItemLayout, 0);
        this.f2210K = obtainStyledAttributes.getResourceId(C0403j.AlertDialog_listItemLayout, 0);
        this.f2211L = obtainStyledAttributes.getBoolean(C0403j.AlertDialog_showTitle, true);
        obtainStyledAttributes.recycle();
        beVar.m536a();
    }

    static boolean m2311a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2311a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void m2314a(CharSequence charSequence) {
        this.f2218d = charSequence;
        if (this.f2200A != null) {
            this.f2200A.setText(charSequence);
        }
    }

    public final void m2313a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f2213N.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case StackFrame.NATIVE_METHOD /*-3*/:
                this.f2235u = charSequence;
                this.f2236v = message;
                return;
            case StackFrame.COMPILED_METHOD /*-2*/:
                this.f2232r = charSequence;
                this.f2233s = message;
                return;
            case -1:
                this.f2229o = charSequence;
                this.f2230p = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public final void m2312a(int i) {
        this.f2239y = null;
        this.f2238x = i;
        if (this.f2240z == null) {
            return;
        }
        if (i != 0) {
            this.f2240z.setVisibility(0);
            this.f2240z.setImageResource(this.f2238x);
            return;
        }
        this.f2240z.setVisibility(8);
    }

    static ViewGroup m2308a(View view, View view2) {
        View inflate;
        if (view == null) {
            if (view2 instanceof ViewStub) {
                inflate = ((ViewStub) view2).inflate();
            } else {
                inflate = view2;
            }
            return (ViewGroup) inflate;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            inflate = ((ViewStub) view).inflate();
        } else {
            inflate = view;
        }
        return (ViewGroup) inflate;
    }

    static void m2309a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    static void m2310a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
