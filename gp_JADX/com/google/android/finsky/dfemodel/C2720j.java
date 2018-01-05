package com.google.android.finsky.dfemodel;

import android.text.TextUtils;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.cv.p177a.cd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.cw;
import java.util.Arrays;
import java.util.Collection;

public final class C2720j extends C2712a {
    public String f14927c;
    public String f14928d;
    public boolean f14929e;
    public boolean f14930f;
    public Collection f14931g;

    C2720j(C1254c c1254c, String str, boolean z, boolean z2) {
        this(c1254c, str, z, z2, null);
    }

    C2720j(C1254c c1254c, String str, boolean z, boolean z2, Collection collection) {
        super(c1254c, str, z);
        this.f14927c = null;
        this.f14928d = str;
        this.f14929e = z2;
        this.f14931g = collection;
    }

    public C2720j(C1254c c1254c, String str) {
        this(c1254c, str, true, false);
    }

    C2720j(C1254c c1254c, Document document, boolean z) {
        super(c1254c, document, z);
        this.f14927c = null;
        this.f14928d = document.m14652g();
        this.f14929e = true;
    }

    public final void mo3118a(String str) {
        this.f14928d = str;
        super.mo3118a(str);
    }

    protected final C0656n mo3123b(String str) {
        if (this.f14931g == null) {
            return this.b.mo1597a(str, this.f14930f, (C0660x) this, (C0657w) this);
        }
        return this.b.mo1598a(str, this.f14930f, this.f14931g, (C0660x) this, (C0657w) this);
    }

    protected final void mo3125f() {
        for (int i = 0; i < this.q.size(); i++) {
            this.b.mo1647e(((aa) this.q.get(i)).f14911b);
        }
    }

    private static int m14726a(cv cvVar) {
        if (cvVar == null || cvVar.f12110q == null) {
            return 0;
        }
        return cvVar.f12110q.length;
    }

    protected final /* synthetic */ Object[] mo3124c(Object obj) {
        cw cwVar = (cw) obj;
        if (cwVar.b == null || cwVar.b.length == 0) {
            return new Document[0];
        }
        cv cvVar;
        int length;
        Document[] documentArr;
        int i;
        String str;
        cd cdVar;
        Document document;
        Object[] objArr;
        int i2;
        cv cvVar2 = cwVar.b[0];
        if (this.f14929e) {
            int a = C2720j.m14726a(cvVar2);
            if (a > 0) {
                cv cvVar3 = cvVar2.f12110q[0];
                if (a <= 1 || C2720j.m14726a(cvVar3) != 0) {
                    cvVar = cvVar3;
                    if (cvVar != null) {
                        length = cvVar.f12110q.length;
                        documentArr = new Document[length];
                        for (i = 0; i < length; i++) {
                            documentArr[i] = new Document(cvVar.f12110q[i]);
                        }
                        if (this.f14908a == null) {
                            this.f14908a = new Document(cvVar);
                        } else {
                            if (this.f14908a.m14660o()) {
                                if (cvVar.f12111r != null) {
                                    str = cvVar.f12111r.f12017c;
                                } else {
                                    str = "";
                                }
                                cdVar = this.f14908a.f14885a.f12111r;
                                if (str == null) {
                                    throw new NullPointerException();
                                }
                                cdVar.f12015a |= 2;
                                cdVar.f12017c = str;
                            }
                            document = this.f14908a;
                            objArr = cvVar.f12110q;
                            document.f14885a.f12110q = (cv[]) C4672c.m21806a(document.f14885a.f12110q, objArr);
                            if (document.f14889e == null) {
                                document.f14889e = new Document[document.m14638a()];
                            } else {
                                document.f14889e = (Document[]) Arrays.copyOf(document.f14889e, document.f14885a.f12110q.length);
                            }
                        }
                        objArr = documentArr;
                    } else {
                        objArr = new Document[0];
                    }
                    if (!TextUtils.isEmpty(this.f14927c)) {
                        return objArr;
                    }
                    i2 = 0;
                    while (i2 < objArr.length) {
                        if (!objArr[i2].f14885a.f12096c.equals(this.f14927c)) {
                            break;
                        }
                        i2++;
                    }
                    i2 = -1;
                    if (i2 != -1) {
                        return (Document[]) C4672c.m21805a(objArr, i2);
                    }
                    return objArr;
                } else if (!this.s) {
                    FinskyLog.m21669e("Expect three-level list response, but got two levels: %s", cvVar2);
                    cvVar = cvVar2;
                    if (cvVar != null) {
                        objArr = new Document[0];
                    } else {
                        length = cvVar.f12110q.length;
                        documentArr = new Document[length];
                        for (i = 0; i < length; i++) {
                            documentArr[i] = new Document(cvVar.f12110q[i]);
                        }
                        if (this.f14908a == null) {
                            if (this.f14908a.m14660o()) {
                                if (cvVar.f12111r != null) {
                                    str = "";
                                } else {
                                    str = cvVar.f12111r.f12017c;
                                }
                                cdVar = this.f14908a.f14885a.f12111r;
                                if (str == null) {
                                    cdVar.f12015a |= 2;
                                    cdVar.f12017c = str;
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                            document = this.f14908a;
                            objArr = cvVar.f12110q;
                            document.f14885a.f12110q = (cv[]) C4672c.m21806a(document.f14885a.f12110q, objArr);
                            if (document.f14889e == null) {
                                document.f14889e = (Document[]) Arrays.copyOf(document.f14889e, document.f14885a.f12110q.length);
                            } else {
                                document.f14889e = new Document[document.m14638a()];
                            }
                        } else {
                            this.f14908a = new Document(cvVar);
                        }
                        objArr = documentArr;
                    }
                    if (!TextUtils.isEmpty(this.f14927c)) {
                        return objArr;
                    }
                    i2 = 0;
                    while (i2 < objArr.length) {
                        if (!objArr[i2].f14885a.f12096c.equals(this.f14927c)) {
                            break;
                        }
                        i2++;
                    }
                    i2 = -1;
                    if (i2 != -1) {
                        return objArr;
                    }
                    return (Document[]) C4672c.m21805a(objArr, i2);
                }
            }
        }
        cvVar = cvVar2;
        if (cvVar != null) {
            length = cvVar.f12110q.length;
            documentArr = new Document[length];
            for (i = 0; i < length; i++) {
                documentArr[i] = new Document(cvVar.f12110q[i]);
            }
            if (this.f14908a == null) {
                this.f14908a = new Document(cvVar);
            } else {
                if (this.f14908a.m14660o()) {
                    if (cvVar.f12111r != null) {
                        str = cvVar.f12111r.f12017c;
                    } else {
                        str = "";
                    }
                    cdVar = this.f14908a.f14885a.f12111r;
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    cdVar.f12015a |= 2;
                    cdVar.f12017c = str;
                }
                document = this.f14908a;
                objArr = cvVar.f12110q;
                document.f14885a.f12110q = (cv[]) C4672c.m21806a(document.f14885a.f12110q, objArr);
                if (document.f14889e == null) {
                    document.f14889e = new Document[document.m14638a()];
                } else {
                    document.f14889e = (Document[]) Arrays.copyOf(document.f14889e, document.f14885a.f12110q.length);
                }
            }
            objArr = documentArr;
        } else {
            objArr = new Document[0];
        }
        if (!TextUtils.isEmpty(this.f14927c)) {
            return objArr;
        }
        i2 = 0;
        while (i2 < objArr.length) {
            if (!objArr[i2].f14885a.f12096c.equals(this.f14927c)) {
                break;
            }
            i2++;
        }
        i2 = -1;
        if (i2 != -1) {
            return (Document[]) C4672c.m21805a(objArr, i2);
        }
        return objArr;
    }
}
