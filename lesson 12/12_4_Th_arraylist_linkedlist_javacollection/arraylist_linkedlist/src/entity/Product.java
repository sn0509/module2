package entity;

public class Product implements ProductInterface {
        private int id ;

        private String name;

        private double price;

        public Product(int id, String name, double price) {
                this.id = id;
                this.name = name;
                this.price = price;
            
        }

        public Product(String name, double price){

        }

        @Override
        public int getId() {
                return id;
        }
        @Override
        public void setId(int id) {
                this.id = id;
        }
        @Override
        public String getName() {
                return name;
        }
        @Override
        public void setName(String name) {
                this.name = name;
        }
        @Override
        public double getPrice() {
                return price;
        }
        @Override
        public void setPrice(long price) {
                this.price = price;
        }

        @Override
        public String toString() {
                return "entity.Product{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", price=" + price +
                        '}';
        }
}
