package testgit;

public class ClassB {

    private String field1;

    public ClassB(String field1) {
        super();
        this.field1 = field1;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    @Override
    public String toString() {
        return "ClassB [field1=" + field1 + "]";
    }


}
