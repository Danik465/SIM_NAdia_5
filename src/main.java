    public class main {
    public static void main(String[] args) {
        Owner Danila = new Owner("8 996 554", "Колотушкина");

        Cat cat = new Cat("Вася", 15, Danila);

        System.out.println(cat.getOwnerNumber());
        System.out.println(cat);
    }
}
