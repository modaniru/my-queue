package Object;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(o.getClass()!=this.getClass()) return false;
        if(this.name != ((Animal) o).name) return false;
        if(this.age != ((Animal) o ).age) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = name.hashCode() * 31;
        hash += age * 31;
        return hash;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
