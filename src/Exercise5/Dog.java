package Exercise5;

public class Dog {
    String name;
    String says;

    public String getName() {
        return name;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public String getSays() {
        return says;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Print() {
        System.out.println(name + " says : " + says);
    }

}
