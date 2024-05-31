package com.example.demoorder;

public class AllClients {
    public AllClients(int idClient, String FIOClient, String contact, String commentary, String dataSdachi, float predoplatasql) {
        IdClient = idClient;
        this.FIOClient = FIOClient;
        Contact = contact;
        Commentary = commentary;
        DataSdachi = dataSdachi;
        Predoplatasql = predoplatasql;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int idClient) {
        IdClient = idClient;
    }

    public String getFIOClient() {
        return FIOClient;
    }

    public void setFIOClient(String FIOClient) {
        this.FIOClient = FIOClient;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getCommentary() {
        return Commentary;
    }

    public void setCommentary(String commentary) {
        Commentary = commentary;
    }

    public String getDataSdachi() {
        return DataSdachi;
    }

    public void setDataSdachi(String dataSdachi) {
        DataSdachi = dataSdachi;
    }

    public float getPredoplatasql() {
        return Predoplatasql;
    }

    public void setPredoplatasql(float predoplatasql) {
        Predoplatasql = predoplatasql;
    }

    int IdClient;
    String FIOClient, Contact, Commentary, DataSdachi;
    float Predoplatasql;

}
