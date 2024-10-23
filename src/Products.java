class Product {
    private int number; // Номер товара
    private String name; // Название товара
    private double price; // Цена товара

    public Product(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return number + ". " + name + " - " + price + " euro";
    }
}

