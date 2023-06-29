package ejercicio_practico_1;

import javax.swing.JOptionPane;

public class Register {

    String CName;
    int CId ;
    int FNumber;
    double FAmount;
    int FMonth;
    int FYear;
    int FStatus;

    public Register(String CName, int CId, int FNumber, double FAmount, int FMonth, int FYear, int FStatus) {
        this.CName = CName;
        this.CId = CId;
        this.FNumber = FNumber;
        this.FAmount = FAmount;
        this.FMonth = FMonth;
        this.FYear = FYear;
        this.FStatus = FStatus;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public int getCId() {
        return CId;
    }

    public void setCId(int CId) {
        this.CId = CId;
    }

    public int getFNumber() {
        return FNumber;
    }

    public void setFNumber(int FNumber) {
        this.FNumber = FNumber;
    }

    public double getFAmount() {
        return FAmount;
    }

    public void setFAmount(double FAmount) {
        this.FAmount = FAmount;
    }

    public int getFMonth() {
        return FMonth;
    }

    public void setFMonth(int FMonth) {
        this.FMonth = FMonth;
    }

    public int getFYear() {
        return FYear;
    }

    public void setFYear(int FYear) {
        this.FYear = FYear;
    }

    public int getFStatus() {
        return FStatus;
    }

    public void setFStatus(int FStatus) {
        this.FStatus = FStatus;
    }

    
    
}
