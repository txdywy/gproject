package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController.RecycleListView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public final class C0434z {
    public final C0425q f2507a;
    public final int f2508b;

    public C0434z(Context context) {
        this(context, C0433y.m2635a(context, 0));
    }

    public C0434z(Context context, int i) {
        this.f2507a = new C0425q(new ContextThemeWrapper(context, C0433y.m2635a(context, i)));
        this.f2508b = i;
    }

    public final C0434z m2640a(CharSequence charSequence) {
        this.f2507a.f2472f = charSequence;
        return this;
    }

    public final C0434z m2644b(CharSequence charSequence) {
        this.f2507a.f2474h = charSequence;
        return this;
    }

    public final C0434z m2638a(int i, OnClickListener onClickListener) {
        this.f2507a.f2475i = this.f2507a.f2467a.getText(i);
        this.f2507a.f2476j = onClickListener;
        return this;
    }

    public final C0434z m2641a(CharSequence charSequence, OnClickListener onClickListener) {
        this.f2507a.f2475i = charSequence;
        this.f2507a.f2476j = onClickListener;
        return this;
    }

    public final C0434z m2643b(int i, OnClickListener onClickListener) {
        this.f2507a.f2477k = this.f2507a.f2467a.getText(i);
        this.f2507a.f2478l = onClickListener;
        return this;
    }

    public final C0434z m2645b(CharSequence charSequence, OnClickListener onClickListener) {
        this.f2507a.f2477k = charSequence;
        this.f2507a.f2478l = onClickListener;
        return this;
    }

    public final C0434z m2646c(CharSequence charSequence, OnClickListener onClickListener) {
        this.f2507a.f2479m = charSequence;
        this.f2507a.f2480n = onClickListener;
        return this;
    }

    public final C0434z m2642a(boolean z) {
        this.f2507a.f2481o = z;
        return this;
    }

    public final C0434z m2639a(View view) {
        this.f2507a.f2489w = view;
        this.f2507a.f2488v = 0;
        this.f2507a.f2456B = false;
        return this;
    }

    public final C0433y m2637a() {
        C0433y c0433y = new C0433y(this.f2507a.f2467a, this.f2508b);
        C0425q c0425q = this.f2507a;
        AlertController alertController = c0433y.f2506a;
        if (c0425q.f2473g != null) {
            alertController.f2202C = c0425q.f2473g;
        } else {
            if (c0425q.f2472f != null) {
                alertController.m2314a(c0425q.f2472f);
            }
            if (c0425q.f2470d != null) {
                Drawable drawable = c0425q.f2470d;
                alertController.f2239y = drawable;
                alertController.f2238x = 0;
                if (alertController.f2240z != null) {
                    if (drawable != null) {
                        alertController.f2240z.setVisibility(0);
                        alertController.f2240z.setImageDrawable(drawable);
                    } else {
                        alertController.f2240z.setVisibility(8);
                    }
                }
            }
            if (c0425q.f2469c != 0) {
                alertController.m2312a(c0425q.f2469c);
            }
            if (c0425q.f2471e != 0) {
                int i = c0425q.f2471e;
                TypedValue typedValue = new TypedValue();
                alertController.f2215a.getTheme().resolveAttribute(i, typedValue, true);
                alertController.m2312a(typedValue.resourceId);
            }
        }
        if (c0425q.f2474h != null) {
            CharSequence charSequence = c0425q.f2474h;
            alertController.f2219e = charSequence;
            if (alertController.f2201B != null) {
                alertController.f2201B.setText(charSequence);
            }
        }
        if (c0425q.f2475i != null) {
            alertController.m2313a(-1, c0425q.f2475i, c0425q.f2476j, null);
        }
        if (c0425q.f2477k != null) {
            alertController.m2313a(-2, c0425q.f2477k, c0425q.f2478l, null);
        }
        if (c0425q.f2479m != null) {
            alertController.m2313a(-3, c0425q.f2479m, c0425q.f2480n, null);
        }
        if (!(c0425q.f2485s == null && c0425q.f2462H == null && c0425q.f2486t == null)) {
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) c0425q.f2468b.inflate(alertController.f2207H, null);
            Object simpleCursorAdapter;
            if (!c0425q.f2458D) {
                int i2;
                if (c0425q.f2459E) {
                    i2 = alertController.f2209J;
                } else {
                    i2 = alertController.f2210K;
                }
                if (c0425q.f2462H != null) {
                    simpleCursorAdapter = new SimpleCursorAdapter(c0425q.f2467a, i2, c0425q.f2462H, new String[]{c0425q.f2463I}, new int[]{16908308});
                } else if (c0425q.f2486t != null) {
                    listAdapter = c0425q.f2486t;
                } else {
                    listAdapter = new C0432x(c0425q.f2467a, i2, c0425q.f2485s);
                }
            } else if (c0425q.f2462H == null) {
                listAdapter = new C0426r(c0425q, c0425q.f2467a, alertController.f2208I, c0425q.f2485s, recycleListView);
            } else {
                simpleCursorAdapter = new C0427s(c0425q, c0425q.f2467a, c0425q.f2462H, recycleListView, alertController);
            }
            if (c0425q.f2466L != null) {
                c0425q.f2466L.m2634a();
            }
            alertController.f2203D = listAdapter;
            alertController.f2204E = c0425q.f2460F;
            if (c0425q.f2487u != null) {
                recycleListView.setOnItemClickListener(new C0428t(c0425q, alertController));
            } else if (c0425q.f2461G != null) {
                recycleListView.setOnItemClickListener(new C0429u(c0425q, recycleListView, alertController));
            }
            if (c0425q.f2465K != null) {
                recycleListView.setOnItemSelectedListener(c0425q.f2465K);
            }
            if (c0425q.f2459E) {
                recycleListView.setChoiceMode(1);
            } else if (c0425q.f2458D) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f2220f = recycleListView;
        }
        if (c0425q.f2489w != null) {
            if (c0425q.f2456B) {
                View view = c0425q.f2489w;
                int i3 = c0425q.f2490x;
                int i4 = c0425q.f2491y;
                int i5 = c0425q.f2492z;
                int i6 = c0425q.f2455A;
                alertController.f2221g = view;
                alertController.f2222h = 0;
                alertController.f2227m = true;
                alertController.f2223i = i3;
                alertController.f2224j = i4;
                alertController.f2225k = i5;
                alertController.f2226l = i6;
            } else {
                alertController.f2221g = c0425q.f2489w;
                alertController.f2222h = 0;
                alertController.f2227m = false;
            }
        } else if (c0425q.f2488v != 0) {
            i = c0425q.f2488v;
            alertController.f2221g = null;
            alertController.f2222h = i;
            alertController.f2227m = false;
        }
        c0433y.setCancelable(this.f2507a.f2481o);
        if (this.f2507a.f2481o) {
            c0433y.setCanceledOnTouchOutside(true);
        }
        c0433y.setOnCancelListener(this.f2507a.f2482p);
        c0433y.setOnDismissListener(this.f2507a.f2483q);
        if (this.f2507a.f2484r != null) {
            c0433y.setOnKeyListener(this.f2507a.f2484r);
        }
        return c0433y;
    }
}
