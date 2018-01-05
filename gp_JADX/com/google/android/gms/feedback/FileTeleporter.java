package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileTeleporter extends zza {
    public static final Creator CREATOR = new C5192e();
    public ParcelFileDescriptor f26194a;
    public String f26195b;
    public String f26196c;
    public byte[] f26197d;
    public File f26198e;

    FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.f26194a = parcelFileDescriptor;
        this.f26195b = str;
        this.f26196c = str2;
    }

    private final FileOutputStream m23960a() {
        if (this.f26198e == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", ".tmp", this.f26198e);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.f26194a = ParcelFileDescriptor.open(createTempFile, 268435456);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted.");
            }
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not create temporary file:", e2);
        }
    }

    private static void m23961a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f26194a == null) {
            Closeable dataOutputStream = new DataOutputStream(m23960a());
            try {
                dataOutputStream.writeInt(this.f26197d.length);
                dataOutputStream.writeUTF(this.f26195b);
                dataOutputStream.writeUTF(this.f26196c);
                dataOutputStream.write(this.f26197d);
                m23961a(dataOutputStream);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m23961a(dataOutputStream);
            }
        }
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23842a(parcel, 2, this.f26194a, i);
        C5130b.m23844a(parcel, 3, this.f26195b);
        C5130b.m23844a(parcel, 4, this.f26196c);
        C5130b.m23853b(parcel, a);
    }
}
