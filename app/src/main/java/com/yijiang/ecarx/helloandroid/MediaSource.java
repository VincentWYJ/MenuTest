package com.yijiang.ecarx.helloandroid;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yijiangwang on 2017/12/16.
 */

public class MediaSource implements Parcelable {
    private int mId;
    private String mName;

    public MediaSource() {
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public MediaSource(Parcel in) {
        mId = in.readInt();
        mName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mId);
        dest.writeString(mName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MediaSource> CREATOR = new Creator<MediaSource>() {
        @Override
        public MediaSource createFromParcel(Parcel in) {
            return new MediaSource(in);
        }

        @Override
        public MediaSource[] newArray(int size) {
            return new MediaSource[size];
        }
    };
}
