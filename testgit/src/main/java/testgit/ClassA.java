package testgit;

public class ClassA {

    private String field1;
    private String field2;
    private String field3;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public ClassA(String field1, String field2) {
        super();
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "ClassA [field1=" + field1 + ", field2=" + field2 + "]";
    }



}
