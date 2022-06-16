package com.example.model;

public class Declare {
    String fullName, gender, nation, document, went, vehincle, dueStart, dueEnd, where, birthDay;
    int seats;

    public Declare () {
    }

    public Declare (String fullName , String gender , String nation ,
                    String document , String went , String vehincle ,
                    String dueStart , String dueEnd , String where ,
                    String birthDay , int seats) {
        this.fullName = fullName;
        this.gender = gender;
        this.nation = nation;
        this.document = document;
        this.went = went;
        this.vehincle = vehincle;
        this.dueStart = dueStart;
        this.dueEnd = dueEnd;
        this.where = where;
        this.birthDay = birthDay;
        this.seats = seats;
    }

    public String getFullName () {
        return fullName;
    }

    public void setFullName (String fullName) {
        this.fullName = fullName;
    }

    public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public String getNation () {
        return nation;
    }

    public void setNation (String nation) {
        this.nation = nation;
    }

    public String getDocument () {
        return document;
    }

    public void setDocument (String document) {
        this.document = document;
    }

    public String getWent () {
        return went;
    }

    public void setWent (String went) {
        this.went = went;
    }

    public String getVehincle () {
        return vehincle;
    }

    public void setVehincle (String vehincle) {
        this.vehincle = vehincle;
    }

    public String getDueStart () {
        return dueStart;
    }

    public void setDueStart (String dueStart) {
        this.dueStart = dueStart;
    }

    public String getDueEnd () {
        return dueEnd;
    }

    public void setDueEnd (String dueEnd) {
        this.dueEnd = dueEnd;
    }

    public String getWhere () {
        return where;
    }

    public void setWhere (String where) {
        this.where = where;
    }

    public String getBirthDay () {
        return birthDay;
    }

    public void setBirthDay (String birthDay) {
        this.birthDay = birthDay;
    }

    public int getSeats () {
        return seats;
    }

    public void setSeats (int seats) {
        this.seats = seats;
    }
}
