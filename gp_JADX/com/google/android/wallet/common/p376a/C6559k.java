package com.google.android.wallet.common.p376a;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.wallet.a.a;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.C6607s;
import com.google.p440g.p441a.p442a.C7147b;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class C6559k extends C6558m {
    public static final Pattern f32673a = Pattern.compile("[\\r\\n]");
    public final Activity f32674b;

    public C6559k(Activity activity) {
        super("DeviceAddressSource", activity);
        this.f32674b = activity;
    }

    protected final int mo5513b() {
        return ((Integer) a.f.a()).intValue();
    }

    private final ArrayList m29770e() {
        Object obj;
        int memoryClass;
        int i;
        ContentResolver contentResolver;
        Cursor query;
        SparseArray sparseArray;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int i2;
        CharSequence string;
        ArrayList arrayList;
        SparseBooleanArray sparseBooleanArray;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        C7147b c7147b;
        ArrayList arrayList2;
        CharSequence a;
        int i3;
        Activity activity = this.f32674b;
        String str = "android.permission.READ_CONTACTS";
        if (C6607s.m29980a(activity, str)) {
            C6607s.m29978a();
            C6607s.m29978a();
            if (C6607s.m29981a(activity, C6589a.m29894a(activity), str)) {
                obj = 1;
                if (obj == null) {
                    return null;
                }
                memoryClass = ((((ActivityManager) this.f32674b.getSystemService("activity")).getMemoryClass() / 16) * MemoryMappedFileBuffer.DEFAULT_PADDING) * MemoryMappedFileBuffer.DEFAULT_PADDING;
                if (memoryClass != 0) {
                    i = 1048576;
                } else {
                    i = memoryClass;
                }
                contentResolver = this.f32674b.getContentResolver();
                query = contentResolver.query(Data.CONTENT_URI, new String[]{"contact_id", "data1"}, "in_visible_group=1 AND mimetype=?", new String[]{"vnd.android.cursor.item/name"}, "contact_id");
                try {
                    sparseArray = new SparseArray(query.getCount());
                    if (query.getCount() > 0) {
                        columnIndexOrThrow = query.getColumnIndexOrThrow("contact_id");
                        columnIndexOrThrow2 = query.getColumnIndexOrThrow("data1");
                        while (query.moveToNext()) {
                            i2 = query.getInt(columnIndexOrThrow);
                            string = query.getString(columnIndexOrThrow2);
                            if (!TextUtils.isEmpty(string)) {
                                sparseArray.append(i2, string);
                            }
                        }
                    }
                    query.close();
                    query = contentResolver.query(StructuredPostal.CONTENT_URI, new String[]{"contact_id", "data4", "data7", "data6", "data8", "data9", "data10", "data5"}, "in_visible_group=1", null, null);
                    try {
                        arrayList = new ArrayList(query.getCount());
                        sparseBooleanArray = new SparseBooleanArray(sparseArray.size());
                        if (query.getCount() > 0) {
                            columnIndexOrThrow2 = query.getColumnIndexOrThrow("contact_id");
                            columnIndexOrThrow3 = query.getColumnIndexOrThrow("data4");
                            columnIndexOrThrow4 = query.getColumnIndexOrThrow("data7");
                            columnIndexOrThrow5 = query.getColumnIndexOrThrow("data6");
                            columnIndexOrThrow6 = query.getColumnIndexOrThrow("data8");
                            columnIndexOrThrow7 = query.getColumnIndexOrThrow("data9");
                            columnIndexOrThrow8 = query.getColumnIndexOrThrow("data10");
                            columnIndexOrThrow9 = query.getColumnIndexOrThrow("data5");
                            while (query.moveToNext()) {
                                c7147b = new C7147b();
                                int i4 = query.getInt(columnIndexOrThrow2);
                                obj = C6559k.m29769a((String) sparseArray.get(i4));
                                if (!TextUtils.isEmpty(obj)) {
                                    c7147b.f34918t = obj;
                                }
                                if (!query.isNull(columnIndexOrThrow3)) {
                                    String[] split = f32673a.split(query.getString(columnIndexOrThrow3));
                                    arrayList2 = new ArrayList(split.length);
                                    for (String a2 : split) {
                                        a = C6559k.m29769a(a2);
                                        if (!TextUtils.isEmpty(a)) {
                                            arrayList2.add(a);
                                        }
                                    }
                                    c7147b.f34916r = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                                }
                                obj = C6559k.m29769a(query.getString(columnIndexOrThrow4));
                                if (!TextUtils.isEmpty(obj)) {
                                    c7147b.f34905g = obj;
                                }
                                obj = C6559k.m29769a(query.getString(columnIndexOrThrow5));
                                if (!TextUtils.isEmpty(obj)) {
                                    c7147b.f34906h = obj;
                                }
                                obj = C6559k.m29769a(query.getString(columnIndexOrThrow6));
                                if (!TextUtils.isEmpty(obj)) {
                                    c7147b.f34903e = obj;
                                }
                                obj = C6559k.m29769a(query.getString(columnIndexOrThrow7));
                                if (!TextUtils.isEmpty(obj)) {
                                    c7147b.f34910l = obj;
                                }
                                obj = C6559k.m29769a(query.getString(columnIndexOrThrow8));
                                if (!TextUtils.isEmpty(obj)) {
                                    c7147b.f34899a = obj;
                                }
                                obj = C6559k.m29769a(query.getString(columnIndexOrThrow9));
                                if (!TextUtils.isEmpty(obj)) {
                                    c7147b.f34913o = obj;
                                }
                                i = C6559k.m29767a(i, C6559k.m29768a(c7147b));
                                arrayList.add(c7147b);
                                sparseBooleanArray.put(i4, true);
                            }
                        }
                        query.close();
                        columnIndexOrThrow3 = sparseArray.size();
                        columnIndexOrThrow2 = 0;
                        i3 = i;
                        while (columnIndexOrThrow2 < columnIndexOrThrow3) {
                            if (sparseBooleanArray.get(sparseArray.keyAt(columnIndexOrThrow2))) {
                                String str2 = (String) sparseArray.valueAt(columnIndexOrThrow2);
                                C7147b c7147b2 = new C7147b();
                                c7147b2.f34918t = str2;
                                memoryClass = C6559k.m29767a(i3, C6559k.m29768a(c7147b2));
                                arrayList.add(c7147b2);
                            } else {
                                memoryClass = i3;
                            }
                            columnIndexOrThrow2++;
                            i3 = memoryClass;
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        query.close();
                    }
                } catch (Throwable th2) {
                    query.close();
                }
            }
        }
        obj = null;
        if (obj == null) {
            return null;
        }
        memoryClass = ((((ActivityManager) this.f32674b.getSystemService("activity")).getMemoryClass() / 16) * MemoryMappedFileBuffer.DEFAULT_PADDING) * MemoryMappedFileBuffer.DEFAULT_PADDING;
        if (memoryClass != 0) {
            i = memoryClass;
        } else {
            i = 1048576;
        }
        contentResolver = this.f32674b.getContentResolver();
        query = contentResolver.query(Data.CONTENT_URI, new String[]{"contact_id", "data1"}, "in_visible_group=1 AND mimetype=?", new String[]{"vnd.android.cursor.item/name"}, "contact_id");
        sparseArray = new SparseArray(query.getCount());
        if (query.getCount() > 0) {
            columnIndexOrThrow = query.getColumnIndexOrThrow("contact_id");
            columnIndexOrThrow2 = query.getColumnIndexOrThrow("data1");
            while (query.moveToNext()) {
                i2 = query.getInt(columnIndexOrThrow);
                string = query.getString(columnIndexOrThrow2);
                if (!TextUtils.isEmpty(string)) {
                    sparseArray.append(i2, string);
                }
            }
        }
        query.close();
        query = contentResolver.query(StructuredPostal.CONTENT_URI, new String[]{"contact_id", "data4", "data7", "data6", "data8", "data9", "data10", "data5"}, "in_visible_group=1", null, null);
        arrayList = new ArrayList(query.getCount());
        sparseBooleanArray = new SparseBooleanArray(sparseArray.size());
        if (query.getCount() > 0) {
            columnIndexOrThrow2 = query.getColumnIndexOrThrow("contact_id");
            columnIndexOrThrow3 = query.getColumnIndexOrThrow("data4");
            columnIndexOrThrow4 = query.getColumnIndexOrThrow("data7");
            columnIndexOrThrow5 = query.getColumnIndexOrThrow("data6");
            columnIndexOrThrow6 = query.getColumnIndexOrThrow("data8");
            columnIndexOrThrow7 = query.getColumnIndexOrThrow("data9");
            columnIndexOrThrow8 = query.getColumnIndexOrThrow("data10");
            columnIndexOrThrow9 = query.getColumnIndexOrThrow("data5");
            while (query.moveToNext()) {
                c7147b = new C7147b();
                int i42 = query.getInt(columnIndexOrThrow2);
                obj = C6559k.m29769a((String) sparseArray.get(i42));
                if (TextUtils.isEmpty(obj)) {
                    c7147b.f34918t = obj;
                }
                if (query.isNull(columnIndexOrThrow3)) {
                    String[] split2 = f32673a.split(query.getString(columnIndexOrThrow3));
                    arrayList2 = new ArrayList(split2.length);
                    while (memoryClass < r20) {
                        a = C6559k.m29769a(a2);
                        if (!TextUtils.isEmpty(a)) {
                            arrayList2.add(a);
                        }
                    }
                    c7147b.f34916r = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                }
                obj = C6559k.m29769a(query.getString(columnIndexOrThrow4));
                if (TextUtils.isEmpty(obj)) {
                    c7147b.f34905g = obj;
                }
                obj = C6559k.m29769a(query.getString(columnIndexOrThrow5));
                if (TextUtils.isEmpty(obj)) {
                    c7147b.f34906h = obj;
                }
                obj = C6559k.m29769a(query.getString(columnIndexOrThrow6));
                if (TextUtils.isEmpty(obj)) {
                    c7147b.f34903e = obj;
                }
                obj = C6559k.m29769a(query.getString(columnIndexOrThrow7));
                if (TextUtils.isEmpty(obj)) {
                    c7147b.f34910l = obj;
                }
                obj = C6559k.m29769a(query.getString(columnIndexOrThrow8));
                if (TextUtils.isEmpty(obj)) {
                    c7147b.f34899a = obj;
                }
                obj = C6559k.m29769a(query.getString(columnIndexOrThrow9));
                if (TextUtils.isEmpty(obj)) {
                    c7147b.f34913o = obj;
                }
                i = C6559k.m29767a(i, C6559k.m29768a(c7147b));
                arrayList.add(c7147b);
                sparseBooleanArray.put(i42, true);
            }
        }
        query.close();
        columnIndexOrThrow3 = sparseArray.size();
        columnIndexOrThrow2 = 0;
        i3 = i;
        while (columnIndexOrThrow2 < columnIndexOrThrow3) {
            if (sparseBooleanArray.get(sparseArray.keyAt(columnIndexOrThrow2))) {
                memoryClass = i3;
            } else {
                String str22 = (String) sparseArray.valueAt(columnIndexOrThrow2);
                C7147b c7147b22 = new C7147b();
                c7147b22.f34918t = str22;
                memoryClass = C6559k.m29767a(i3, C6559k.m29768a(c7147b22));
                arrayList.add(c7147b22);
            }
            columnIndexOrThrow2++;
            i3 = memoryClass;
        }
        return arrayList;
    }

    private static String m29769a(String str) {
        return str != null ? str.trim() : null;
    }

    private static int m29768a(C7147b c7147b) {
        return (((c7147b.m() * 2) + 45) / 8) * 8;
    }

    private static int m29767a(int i, int i2) {
        int i3 = i - i2;
        if (i3 >= 0) {
            return i3;
        }
        throw new OutOfMemoryError("Device data exceeds allowed storage for source");
    }

    protected final /* synthetic */ List mo5514c() {
        return m29770e();
    }
}
