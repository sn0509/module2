package entity;

public interface ProductInterface {
    public int getId() ;

    public void setId(int id) ;

    public String getName();

    public void setName(String name) ;

    public double getPrice() ;

    public void setPrice(long price) ;

   @Override
    public String toString();
}
