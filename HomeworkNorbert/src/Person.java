public class Person {
    private String name;
    private int age;
    private Boolean married;

    public Person(String name, int age, boolean married) {
    setName(name);
    setAge(age);
    setMarried(married);

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }
}
