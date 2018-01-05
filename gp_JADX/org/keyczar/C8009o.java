package org.keyczar;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p570b.C7985a;
import org.keyczar.p571c.C7988e;
import org.keyczar.p572d.C7996b;

public final class C8009o implements C7988e {
    public String f41043a;

    public C8009o(String str) {
        if (!(str == null || str.endsWith(File.separator))) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(File.separator);
            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        this.f41043a = str;
    }

    public final String mo6660a(int i) {
        String str = this.f41043a;
        return C8009o.m38234a(new StringBuilder(String.valueOf(str).length() + 11).append(str).append(i).toString());
    }

    public final String mo6659a() {
        String valueOf = String.valueOf(this.f41043a);
        String valueOf2 = String.valueOf("meta");
        return C8009o.m38234a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    private static String m38234a(String str) {
        InputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(str));
            String str2 = new String(C7996b.m38194a(fileInputStream));
            fileInputStream.close();
            return str2;
        } catch (Throwable e) {
            throw new KeyczarException(C7985a.m38177a("KeyczarFileReader.FileError", str), e);
        } catch (Throwable th) {
            fileInputStream.close();
        }
    }
}
