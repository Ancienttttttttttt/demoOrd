package com.example.demoorder;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
public class CPUTable {
    int IDCPU;
    float PriceCPU;
    SimpleStringProperty CPU, PrimechanieCPU, DopCPU, TypeCPU;
    public CPUTable(int IDCPU1, String CPU1, String typeCPU1 , float priceCPU1, String primechanieCPU1, String dopCPU1) {
        this.IDCPU = IDCPU1;
        this.PriceCPU = priceCPU1;
        this.CPU = new SimpleStringProperty(CPU1);
        this.PrimechanieCPU = new SimpleStringProperty(primechanieCPU1);
        this.DopCPU = new SimpleStringProperty(dopCPU1);
        this.TypeCPU = new SimpleStringProperty(typeCPU1);
    }

    public int getIDCPU() {
        return IDCPU;
    }

    public void setIDCPU(int IDCPU) {
        this.IDCPU = IDCPU;
    }

    public float getPriceCPU() {
        return PriceCPU;
    }

    public void setPriceCPU(float priceCPU1) {
        PriceCPU = priceCPU1;
    }

    public String getCPU() {
        return CPU.get();
    }

    public void setCPU(String CPU) {
        this.CPU.set(CPU);
    }

    public String getPrimechanieCPU() {
        return PrimechanieCPU.get();
    }

    public void setPrimechanieCPU(String primechanieCPU) {
        this.PrimechanieCPU.set(primechanieCPU);
    }

    public String getDopCPU() {
        return DopCPU.get();
    }

    public void setDopCPU(String dopCPU) {
        this.DopCPU.set(dopCPU);
    }

    public String getTypeCPU() {
        return TypeCPU.get();
    }

    public void setTypeCPU(String typeCPU) {
        this.TypeCPU.set(typeCPU);
    }
    }




