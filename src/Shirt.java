public class Shirt {
    public int shirtID = 0;
    public String description = "Descrição da camisa";
    public char colorCode = 'U';
    public double price = 0.0;
    public int quantityInStock = 0;

    public void displayShirtInformation() {
        System.out.println("Shirt ID:" + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code:" + colorCode);
        System.out.println("Shirt Price:" + price);
        System.out.println("Quantity in stock:" + quantityInStock);
    }
}

