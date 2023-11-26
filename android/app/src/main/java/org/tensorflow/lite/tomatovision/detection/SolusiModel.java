package org.tensorflow.lite.tomatovision.detection;

public class SolusiModel {
    private String namaPenyakit;
    private int logopenyakit;

    public SolusiModel(String namaPenyakit, int logopenyakit) {
        this.namaPenyakit = namaPenyakit;
        this.logopenyakit = logopenyakit;
    }

    public String getNamaPenyakit() {
        return namaPenyakit;
    }

    public void setNamaPenyakit(String namaPenyakit) {
        this.namaPenyakit = namaPenyakit;
    }

    public int getLogopenyakit() {
        return logopenyakit;
    }

    public void setLogopenyakit(int logopenyakit) {
        this.logopenyakit = logopenyakit;
    }
}
