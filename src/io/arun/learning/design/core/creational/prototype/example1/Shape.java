package io.arun.learning.design.core.creational.prototype.example1;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }catch(CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }

}
