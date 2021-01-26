package com.example.m3;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class NoteData implements Parcelable {
    private int noteIndex;
    private String noteName;

    public NoteData(int noteIndex, String noteName){
        this.noteIndex = noteIndex;
        this.noteName = noteName;
    }

    protected NoteData(Parcel in) {
        noteIndex = in.readInt();
        noteName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(getNoteIndex());
        dest.writeString(getNoteName());

    }


    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<NoteData> CREATOR = new Creator<NoteData>() {
        @Override
        public NoteData createFromParcel(Parcel in) {
            return new NoteData(in);
        }

        @Override
        public NoteData[] newArray(int size) {
            return new NoteData[size];
        }
    };

    public int getNoteIndex() {
        return noteIndex;
    }

    public String getNoteName() {
        return noteName;
    }
}



