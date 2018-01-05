package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ai;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController.RecycleListView;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0399f;
import android.support.v7.widget.di;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.StackFrame;

public final class C0433y extends be implements DialogInterface {
    public final AlertController f2506a = new AlertController(getContext(), this, getWindow());

    protected C0433y(Context context, int i) {
        super(context, C0433y.m2635a(context, i));
    }

    static int m2635a(Context context, int i) {
        if (((i >>> 24) & HprofParser.ROOT_UNKNOWN) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0394a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button m2636a(int i) {
        AlertController alertController = this.f2506a;
        switch (i) {
            case StackFrame.NATIVE_METHOD /*-3*/:
                return alertController.f2234t;
            case StackFrame.COMPILED_METHOD /*-2*/:
                return alertController.f2231q;
            case -1:
                return alertController.f2228n;
            default:
                return null;
        }
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2506a.m2314a(charSequence);
    }

    protected final void onCreate(Bundle bundle) {
        int i;
        View view;
        int indexOfChild;
        Object obj;
        int i2;
        super.onCreate(bundle);
        AlertController alertController = this.f2506a;
        if (alertController.f2206G == 0 || alertController.f2212M != 1) {
            i = alertController.f2205F;
        } else {
            i = alertController.f2206G;
        }
        alertController.f2216b.setContentView(i);
        View findViewById = alertController.f2217c.findViewById(C0399f.parentPanel);
        View findViewById2 = findViewById.findViewById(C0399f.topPanel);
        View findViewById3 = findViewById.findViewById(C0399f.contentPanel);
        View findViewById4 = findViewById.findViewById(C0399f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0399f.customPanel);
        if (alertController.f2221g != null) {
            view = alertController.f2221g;
        } else if (alertController.f2222h != 0) {
            view = LayoutInflater.from(alertController.f2215a).inflate(alertController.f2222h, viewGroup, false);
        } else {
            view = null;
        }
        Object obj2 = view != null ? 1 : null;
        if (obj2 == null || !AlertController.m2311a(view)) {
            alertController.f2217c.setFlags(131072, 131072);
        }
        if (obj2 != null) {
            FrameLayout frameLayout = (FrameLayout) alertController.f2217c.findViewById(C0399f.custom);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (alertController.f2227m) {
                frameLayout.setPadding(alertController.f2223i, alertController.f2224j, alertController.f2225k, alertController.f2226l);
            }
            if (alertController.f2220f != null) {
                ((di) viewGroup.getLayoutParams()).f3374g = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById5 = viewGroup.findViewById(C0399f.topPanel);
        view = viewGroup.findViewById(C0399f.contentPanel);
        View findViewById6 = viewGroup.findViewById(C0399f.buttonPanel);
        ViewGroup a = AlertController.m2308a(findViewById5, findViewById2);
        ViewGroup a2 = AlertController.m2308a(view, findViewById3);
        ViewGroup a3 = AlertController.m2308a(findViewById6, findViewById4);
        alertController.f2237w = (NestedScrollView) alertController.f2217c.findViewById(C0399f.scrollView);
        alertController.f2237w.setFocusable(false);
        alertController.f2237w.setNestedScrollingEnabled(false);
        alertController.f2201B = (TextView) a2.findViewById(16908299);
        if (alertController.f2201B != null) {
            if (alertController.f2219e != null) {
                alertController.f2201B.setText(alertController.f2219e);
            } else {
                alertController.f2201B.setVisibility(8);
                alertController.f2237w.removeView(alertController.f2201B);
                if (alertController.f2220f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f2237w.getParent();
                    indexOfChild = viewGroup2.indexOfChild(alertController.f2237w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f2220f, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    a2.setVisibility(8);
                }
            }
        }
        indexOfChild = 0;
        alertController.f2228n = (Button) a3.findViewById(16908313);
        alertController.f2228n.setOnClickListener(alertController.f2214O);
        if (TextUtils.isEmpty(alertController.f2229o)) {
            alertController.f2228n.setVisibility(8);
        } else {
            alertController.f2228n.setText(alertController.f2229o);
            alertController.f2228n.setVisibility(0);
            indexOfChild = 1;
        }
        alertController.f2231q = (Button) a3.findViewById(16908314);
        alertController.f2231q.setOnClickListener(alertController.f2214O);
        if (TextUtils.isEmpty(alertController.f2232r)) {
            alertController.f2231q.setVisibility(8);
        } else {
            alertController.f2231q.setText(alertController.f2232r);
            alertController.f2231q.setVisibility(0);
            indexOfChild |= 2;
        }
        alertController.f2234t = (Button) a3.findViewById(16908315);
        alertController.f2234t.setOnClickListener(alertController.f2214O);
        if (TextUtils.isEmpty(alertController.f2235u)) {
            alertController.f2234t.setVisibility(8);
        } else {
            alertController.f2234t.setText(alertController.f2235u);
            alertController.f2234t.setVisibility(0);
            indexOfChild |= 4;
        }
        Context context = alertController.f2215a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0394a.alertDialogCenterButtons, typedValue, true);
        if ((typedValue.data != 0 ? 1 : null) != null) {
            if (indexOfChild == 1) {
                AlertController.m2310a(alertController.f2228n);
            } else if (indexOfChild == 2) {
                AlertController.m2310a(alertController.f2231q);
            } else if (indexOfChild == 4) {
                AlertController.m2310a(alertController.f2234t);
            }
        }
        if ((indexOfChild != 0 ? 1 : null) == null) {
            a3.setVisibility(8);
        }
        if (alertController.f2202C != null) {
            a.addView(alertController.f2202C, 0, new LayoutParams(-1, -2));
            alertController.f2217c.findViewById(C0399f.title_template).setVisibility(8);
        } else {
            alertController.f2240z = (ImageView) alertController.f2217c.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.f2218d) ? 1 : null) == null || !alertController.f2211L) {
                alertController.f2217c.findViewById(C0399f.title_template).setVisibility(8);
                alertController.f2240z.setVisibility(8);
                a.setVisibility(8);
            } else {
                alertController.f2200A = (TextView) alertController.f2217c.findViewById(C0399f.alertTitle);
                alertController.f2200A.setText(alertController.f2218d);
                if (alertController.f2238x != 0) {
                    alertController.f2240z.setImageResource(alertController.f2238x);
                } else if (alertController.f2239y != null) {
                    alertController.f2240z.setImageDrawable(alertController.f2239y);
                } else {
                    alertController.f2200A.setPadding(alertController.f2240z.getPaddingLeft(), alertController.f2240z.getPaddingTop(), alertController.f2240z.getPaddingRight(), alertController.f2240z.getPaddingBottom());
                    alertController.f2240z.setVisibility(8);
                }
            }
        }
        Object obj3 = (viewGroup == null || viewGroup.getVisibility() == 8) ? null : 1;
        Object obj4 = (a == null || a.getVisibility() == 8) ? null : 1;
        if (a3 == null || a3.getVisibility() == 8) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null && a2 != null) {
            findViewById = a2.findViewById(C0399f.textSpacerNoButtons);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        if (obj4 != null) {
            if (alertController.f2237w != null) {
                alertController.f2237w.setClipToPadding(true);
            }
            findViewById = null;
            if (!(alertController.f2219e == null && alertController.f2220f == null)) {
                findViewById = a.findViewById(C0399f.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else if (a2 != null) {
            findViewById = a2.findViewById(C0399f.textSpacerNoTitle);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        if (alertController.f2220f instanceof RecycleListView) {
            RecycleListView recycleListView = (RecycleListView) alertController.f2220f;
            if (obj == null || obj4 == null) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), obj4 != null ? recycleListView.getPaddingTop() : recycleListView.f2198a, recycleListView.getPaddingRight(), obj != null ? recycleListView.getPaddingBottom() : recycleListView.f2199b);
            }
        }
        if (obj3 == null) {
            view = alertController.f2220f != null ? alertController.f2220f : alertController.f2237w;
            if (view != null) {
                if (obj4 != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (obj != null) {
                    i = 2;
                } else {
                    i = 0;
                }
                int i3 = i2 | i;
                findViewById5 = alertController.f2217c.findViewById(C0399f.scrollIndicatorUp);
                findViewById = alertController.f2217c.findViewById(C0399f.scrollIndicatorDown);
                if (VERSION.SDK_INT >= 23) {
                    ai.f1848a.mo428d(view, i3);
                    if (findViewById5 != null) {
                        a2.removeView(findViewById5);
                    }
                    if (findViewById != null) {
                        a2.removeView(findViewById);
                    }
                } else {
                    if (findViewById5 != null && (i3 & 1) == 0) {
                        a2.removeView(findViewById5);
                        findViewById5 = null;
                    }
                    if (findViewById != null && (i3 & 2) == 0) {
                        a2.removeView(findViewById);
                        findViewById = null;
                    }
                    if (!(findViewById5 == null && findViewById == null)) {
                        if (alertController.f2219e != null) {
                            alertController.f2237w.setOnScrollChangeListener(new C0421m(findViewById5, findViewById));
                            alertController.f2237w.post(new C0422n(alertController, findViewById5, findViewById));
                        } else if (alertController.f2220f != null) {
                            alertController.f2220f.setOnScrollListener(new C0423o(findViewById5, findViewById));
                            alertController.f2220f.post(new C0424p(alertController, findViewById5, findViewById));
                        } else {
                            if (findViewById5 != null) {
                                a2.removeView(findViewById5);
                            }
                            if (findViewById != null) {
                                a2.removeView(findViewById);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = alertController.f2220f;
        if (listView != null && alertController.f2203D != null) {
            listView.setAdapter(alertController.f2203D);
            i2 = alertController.f2204E;
            if (i2 >= 0) {
                listView.setItemChecked(i2, true);
                listView.setSelection(i2);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f2506a;
        boolean z = alertController.f2237w != null && alertController.f2237w.m2127a(keyEvent);
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f2506a;
        boolean z = alertController.f2237w != null && alertController.f2237w.m2127a(keyEvent);
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
