package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class C0370o extends BaseAdapter implements C0369s, Filterable {
    public boolean f2080a = false;
    public boolean f2081b = true;
    public Cursor f2082c = null;
    public Context f2083d;
    public int f2084e;
    public C0384p f2085f;
    public DataSetObserver f2086g;
    public C0386r f2087h;
    public FilterQueryProvider f2088i;

    public C0370o(Context context) {
        this.f2083d = context;
        this.f2084e = -1;
        this.f2085f = new C0384p(this);
        this.f2086g = new C0385q(this);
    }

    public abstract View mo474a(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void mo877a(View view, Cursor cursor);

    public final Cursor mo470a() {
        return this.f2082c;
    }

    public int getCount() {
        if (!this.f2080a || this.f2082c == null) {
            return 0;
        }
        return this.f2082c.getCount();
    }

    public Object getItem(int i) {
        if (!this.f2080a || this.f2082c == null) {
            return null;
        }
        this.f2082c.moveToPosition(i);
        return this.f2082c;
    }

    public long getItemId(int i) {
        if (this.f2080a && this.f2082c != null && this.f2082c.moveToPosition(i)) {
            return this.f2082c.getLong(this.f2084e);
        }
        return 0;
    }

    public boolean hasStableIds() {
        return true;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2080a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2082c.moveToPosition(i)) {
            if (view == null) {
                view = mo474a(this.f2083d, this.f2082c, viewGroup);
            }
            mo877a(view, this.f2082c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2080a) {
            return null;
        }
        this.f2082c.moveToPosition(i);
        if (view == null) {
            view = mo475b(this.f2083d, this.f2082c, viewGroup);
        }
        mo877a(view, this.f2082c);
        return view;
    }

    public View mo475b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo474a(context, cursor, viewGroup);
    }

    public void mo472a(Cursor cursor) {
        Cursor cursor2;
        if (cursor == this.f2082c) {
            cursor2 = null;
        } else {
            cursor2 = this.f2082c;
            if (cursor2 != null) {
                if (this.f2085f != null) {
                    cursor2.unregisterContentObserver(this.f2085f);
                }
                if (this.f2086g != null) {
                    cursor2.unregisterDataSetObserver(this.f2086g);
                }
            }
            this.f2082c = cursor;
            if (cursor != null) {
                if (this.f2085f != null) {
                    cursor.registerContentObserver(this.f2085f);
                }
                if (this.f2086g != null) {
                    cursor.registerDataSetObserver(this.f2086g);
                }
                this.f2084e = cursor.getColumnIndexOrThrow("_id");
                this.f2080a = true;
                notifyDataSetChanged();
            } else {
                this.f2084e = -1;
                this.f2080a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public CharSequence mo473b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor mo471a(CharSequence charSequence) {
        if (this.f2088i != null) {
            return this.f2088i.runQuery(charSequence);
        }
        return this.f2082c;
    }

    public Filter getFilter() {
        if (this.f2087h == null) {
            this.f2087h = new C0386r(this);
        }
        return this.f2087h;
    }
}
