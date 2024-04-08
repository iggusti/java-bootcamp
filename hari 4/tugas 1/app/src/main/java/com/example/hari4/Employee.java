package com.example.hari4;

import android.os.Parcel;
import android.os.Parcelable;

class Employee implements Parcelable {

    private String name;
    private int age;
    private Boolean married;

    public Employee() {
    }

    protected Employee(Parcel in) {
        name = in.readString();
        age = in.readInt();
        byte tmpMarried = in.readByte();
        married = tmpMarried == 0 ? null : tmpMarried == 1;
    }

    public static final Creator<Employee> CREATOR = new Creator<Employee>() {
        @Override
        public Employee createFromParcel(Parcel in) {
            return new Employee(in);
        }

        @Override
        public Employee[] newArray(int size) {
            return new Employee[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeByte((byte) (married == null ? 0 : married ? 1 : 2));
    }
}
