package android.support.v4.p035f;

import android.support.v4.p037h.C0324t;
import android.util.Base64;
import java.util.List;

public final class C0287a {
    public final String f1660a;
    public final String f1661b;
    public final String f1662c;
    public final List f1663d;
    public final int f1664e = 0;
    public final String f1665f = new StringBuilder(this.f1660a).append("-").append(this.f1661b).append("-").append(this.f1662c).toString();

    public C0287a(String str, String str2, String str3, List list) {
        this.f1660a = (String) C0324t.m1705a(str);
        this.f1661b = (String) C0324t.m1705a(str2);
        this.f1662c = (String) C0324t.m1705a(str3);
        this.f1663d = (List) C0324t.m1705a(list);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FontRequest {mProviderAuthority: " + this.f1660a + ", mProviderPackage: " + this.f1661b + ", mQuery: " + this.f1662c + ", mCertificates:");
        for (int i = 0; i < this.f1663d.size(); i++) {
            stringBuilder.append(" [");
            List list = (List) this.f1663d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder.append("mCertificatesArray: " + this.f1664e);
        return stringBuilder.toString();
    }
}
