package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C5100e();
    public int f25942a;
    public ParcelFileDescriptor f25943b;
    public int f25944c;
    public Bitmap f25945d;
    public boolean f25946e;
    public File f25947f;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f25942a = i;
        this.f25943b = parcelFileDescriptor;
        this.f25944c = i2;
        this.f25945d = null;
        this.f25946e = false;
    }

    public BitmapTeleporter(Bitmap bitmap) {
        this.f25942a = 1;
        this.f25943b = null;
        this.f25944c = 0;
        this.f25945d = bitmap;
        this.f25946e = true;
    }

    private static void m23671a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    private final FileOutputStream m23672b() {
        if (this.f25947f == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", ".tmp", this.f25947f);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.f25943b = ParcelFileDescriptor.open(createTempFile, 268435456);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not create temporary file", e2);
        }
    }

    public final Bitmap m23673a() {
        if (!this.f25946e) {
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f25943b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Config valueOf = Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                m23671a(dataInputStream);
                Buffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.f25945d = createBitmap;
                this.f25946e = true;
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                m23671a(dataInputStream);
            }
        }
        return this.f25945d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f25943b == null) {
            Bitmap bitmap = this.f25945d;
            Buffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            Closeable dataOutputStream = new DataOutputStream(new BufferedOutputStream(m23672b()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m23671a(dataOutputStream);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m23671a(dataOutputStream);
            }
        }
        int i2 = i | 1;
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f25942a);
        C5130b.m23842a(parcel, 2, this.f25943b, i2);
        C5130b.m23854b(parcel, 3, this.f25944c);
        C5130b.m23853b(parcel, a);
        this.f25943b = null;
    }
}
