package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class av extends C0370o {
    public int f2089j;
    public int f2090k;
    public LayoutInflater f2091l;

    @Deprecated
    public av(Context context, int i) {
        super(context);
        this.f2090k = i;
        this.f2089j = i;
        this.f2091l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View mo474a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2091l.inflate(this.f2089j, viewGroup, false);
    }

    public final View mo475b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2091l.inflate(this.f2090k, viewGroup, false);
    }
}
