package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@KeepName
public final class DataHolder extends zza implements Closeable {
    public static final Creator CREATOR = new C5103i();
    public static final C5098c f25948k = new C5102h(new String[0]);
    public int f25949a;
    public final String[] f25950b;
    public Bundle f25951c;
    public final CursorWindow[] f25952d;
    public final int f25953e;
    public final Bundle f25954f;
    public int[] f25955g;
    public int f25956h;
    public boolean f25957i;
    public boolean f25958j;

    public final class zzb extends RuntimeException {
        public zzb(String str) {
            super(str);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f25957i = false;
        this.f25958j = true;
        this.f25949a = i;
        this.f25950b = strArr;
        this.f25952d = cursorWindowArr;
        this.f25953e = i2;
        this.f25954f = bundle;
    }

    private DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i) {
        this.f25957i = false;
        this.f25958j = true;
        this.f25949a = 1;
        this.f25950b = (String[]) am.m23733a((Object) strArr);
        this.f25952d = (CursorWindow[]) am.m23733a((Object) cursorWindowArr);
        this.f25953e = i;
        this.f25954f = null;
        m23678a();
    }

    public final int m23676a(int i) {
        int i2 = 0;
        boolean z = i >= 0 && i < this.f25956h;
        am.m23738a(z);
        while (i2 < this.f25955g.length) {
            if (i < this.f25955g[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.f25955g.length ? i2 - 1 : i2;
    }

    public final String m23677a(String str, int i, int i2) {
        m23679a(str, i);
        return this.f25952d[i2].getString(i, this.f25951c.getInt(str));
    }

    public final void m23678a() {
        int i;
        int i2 = 0;
        this.f25951c = new Bundle();
        for (i = 0; i < this.f25950b.length; i++) {
            this.f25951c.putInt(this.f25950b[i], i);
        }
        this.f25955g = new int[this.f25952d.length];
        i = 0;
        while (i2 < this.f25952d.length) {
            this.f25955g[i2] = i;
            i += this.f25952d[i2].getNumRows() - (i - this.f25952d[i2].getStartPosition());
            i2++;
        }
        this.f25956h = i;
    }

    public final void m23679a(String str, int i) {
        if (this.f25951c == null || !this.f25951c.containsKey(str)) {
            String str2 = "No such column: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (m23680b()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f25956h) {
            throw new CursorIndexOutOfBoundsException(i, this.f25956h);
        }
    }

    public final boolean m23680b() {
        boolean z;
        synchronized (this) {
            z = this.f25957i;
        }
        return z;
    }

    public final byte[] m23681b(String str, int i, int i2) {
        m23679a(str, i);
        return this.f25952d[i2].getBlob(i, this.f25951c.getInt(str));
    }

    public final void close() {
        synchronized (this) {
            if (!this.f25957i) {
                this.f25957i = true;
                for (CursorWindow close : this.f25952d) {
                    close.close();
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f25958j && this.f25952d.length > 0 && !m23680b()) {
                close();
                String obj = toString();
                Log.e("DataBuffer", new StringBuilder(String.valueOf(obj).length() + 178).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ").append(obj).append(")").toString());
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    private DataHolder(C5098c c5098c, int i) {
        this(c5098c.f25959a, m23674a(c5098c), i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23850a(parcel, 1, this.f25950b);
        C5130b.m23849a(parcel, 2, this.f25952d, i);
        C5130b.m23854b(parcel, 3, this.f25953e);
        C5130b.m23840a(parcel, 4, this.f25954f);
        C5130b.m23854b(parcel, 1000, this.f25949a);
        C5130b.m23853b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    private static CursorWindow[] m23674a(C5098c c5098c) {
        int i = 0;
        if (c5098c.f25959a.length == 0) {
            return new CursorWindow[0];
        }
        List list = c5098c.f25960b;
        int size = list.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(c5098c.f25959a.length);
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            try {
                int i4;
                int i5;
                CursorWindow cursorWindow2;
                if (!cursorWindow.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i2 + ")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(c5098c.f25959a.length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) list.get(i2);
                boolean z = true;
                for (int i6 = 0; i6 < c5098c.f25959a.length && z; i6++) {
                    String str = c5098c.f25959a[i6];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z = cursorWindow.putNull(i2, i6);
                    } else if (obj instanceof String) {
                        z = cursorWindow.putString((String) obj, i2, i6);
                    } else if (obj instanceof Long) {
                        z = cursorWindow.putLong(((Long) obj).longValue(), i2, i6);
                    } else if (obj instanceof Integer) {
                        z = cursorWindow.putLong((long) ((Integer) obj).intValue(), i2, i6);
                    } else if (obj instanceof Boolean) {
                        z = cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i2, i6);
                    } else if (obj instanceof byte[]) {
                        z = cursorWindow.putBlob((byte[]) obj, i2, i6);
                    } else if (obj instanceof Double) {
                        z = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i6);
                    } else if (obj instanceof Float) {
                        z = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i2, i6);
                    } else {
                        String valueOf = String.valueOf(obj);
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("Unsupported object for column ").append(str).append(": ").append(valueOf).toString());
                    }
                }
                if (z) {
                    i4 = i2;
                    i5 = 0;
                    cursorWindow2 = cursorWindow;
                } else if (i3 != 0) {
                    throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                } else {
                    Log.d("DataHolder", "Couldn't populate window data for row " + i2 + " - allocating new window.");
                    cursorWindow.freeLastRow();
                    CursorWindow cursorWindow3 = new CursorWindow(false);
                    cursorWindow3.setStartPosition(i2);
                    cursorWindow3.setNumColumns(c5098c.f25959a.length);
                    arrayList.add(cursorWindow3);
                    i4 = i2 - 1;
                    cursorWindow2 = cursorWindow3;
                    i5 = 1;
                }
                i3 = i5;
                cursorWindow = cursorWindow2;
                i2 = i4 + 1;
            } catch (RuntimeException e) {
                RuntimeException runtimeException = e;
                i2 = arrayList.size();
                while (i < i2) {
                    ((CursorWindow) arrayList.get(i)).close();
                    i++;
                }
                throw runtimeException;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    public static DataHolder m23675b(int i) {
        return new DataHolder(f25948k, i);
    }
}
