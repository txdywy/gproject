package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AlertController.RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

final class C0427s extends CursorAdapter {
    public final int f2495a;
    public final int f2496b;
    public final /* synthetic */ RecycleListView f2497c;
    public final /* synthetic */ AlertController f2498d;
    public final /* synthetic */ C0425q f2499e;

    C0427s(C0425q c0425q, Context context, Cursor cursor, RecycleListView recycleListView, AlertController alertController) {
        this.f2499e = c0425q;
        this.f2497c = recycleListView;
        this.f2498d = alertController;
        super(context, cursor, false);
        Cursor cursor2 = getCursor();
        this.f2495a = cursor2.getColumnIndexOrThrow(this.f2499e.f2463I);
        this.f2496b = cursor2.getColumnIndexOrThrow(this.f2499e.f2464J);
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f2495a));
        this.f2497c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f2496b) == 1);
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2499e.f2468b.inflate(this.f2498d.f2208I, viewGroup, false);
    }
}
