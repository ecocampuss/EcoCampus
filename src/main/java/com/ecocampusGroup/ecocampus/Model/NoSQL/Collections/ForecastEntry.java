package com.ecocampusGroup.ecocampus.Model.NoSQL.Collections;

public class ForecastEntry {
    private String hour;
    private double predicted_kw;

    public ForecastEntry() {
    }

    public ForecastEntry(String hour, double predicted_kw) {
        this.hour = hour;
        this.predicted_kw = predicted_kw;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public double getPredicted_kw() {
        return predicted_kw;
    }

    public void setPredicted_kw(double predicted_kw) {
        this.predicted_kw = predicted_kw;
    }
}
