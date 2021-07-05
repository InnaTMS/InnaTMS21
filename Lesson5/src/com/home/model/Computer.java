package com.home.model;

public class Computer {
    String processor;
    int ram;
    String hdd;
    int resource;
    public Computer(String processor, int ram, String hdd, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }
    // добавляем метод описание(вывод всех полей)
   @Override
    public String toString() {
        return "Computer{"+
        "processor='"+ processor + '\'' +
                ",ram='" + ram + '\'' +
                ",hdd='" + hdd + '\'' +
                ",resource'" + resource + '\'' +
                '}';

    }
}
