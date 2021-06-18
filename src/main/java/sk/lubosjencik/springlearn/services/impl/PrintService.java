package sk.lubosjencik.springlearn.services.impl;

public class PrintService {
    private String data;

    public void print(){
        System.out.println(data + " reload");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
