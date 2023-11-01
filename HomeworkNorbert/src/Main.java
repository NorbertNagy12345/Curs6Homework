public class Main {
    public static void main(String[] args) {
        persons("Nick",22,true);
        persons("Marie",21,false);
        persons("Nora",24,true);

        products("Cola",6,12,"beverage");
        products("Toilet paper",1,200,"household");
        products("beer",3,23,"beverage");
    }

    private static void products(String name, int price, int quantity, String category) {
        Product product = new Product(name,price,quantity,category);
        System.out.println("The product name is: "+product.getName());
        System.out.println("We have it on stock: "+product.hasStock());
        System.out.println("The product price is: "+product.getPrice()+" lei");
        System.out.println("The product is part of the "+category+" category: "+product.isCategory(category));


    }

    private static void persons(String name, int age, boolean married) {
        Person person = new Person(name,age,married);
        System.out.println("Name: "+person.getName()+", Age: "+person.getAge()+", Maried: "+person.getMarried());
    }
}
