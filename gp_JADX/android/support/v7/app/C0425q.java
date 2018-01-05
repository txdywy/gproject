package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;

public final class C0425q {
    public int f2455A;
    public boolean f2456B = false;
    public boolean[] f2457C;
    public boolean f2458D;
    public boolean f2459E;
    public int f2460F = -1;
    public OnMultiChoiceClickListener f2461G;
    public Cursor f2462H;
    public String f2463I;
    public String f2464J;
    public OnItemSelectedListener f2465K;
    public C0430v f2466L;
    public final Context f2467a;
    public final LayoutInflater f2468b;
    public int f2469c = 0;
    public Drawable f2470d;
    public int f2471e = 0;
    public CharSequence f2472f;
    public View f2473g;
    public CharSequence f2474h;
    public CharSequence f2475i;
    public OnClickListener f2476j;
    public CharSequence f2477k;
    public OnClickListener f2478l;
    public CharSequence f2479m;
    public OnClickListener f2480n;
    public boolean f2481o;
    public OnCancelListener f2482p;
    public OnDismissListener f2483q;
    public OnKeyListener f2484r;
    public CharSequence[] f2485s;
    public ListAdapter f2486t;
    public OnClickListener f2487u;
    public int f2488v;
    public View f2489w;
    public int f2490x;
    public int f2491y;
    public int f2492z;

    public C0425q(Context context) {
        this.f2467a = context;
        this.f2481o = true;
        this.f2468b = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
