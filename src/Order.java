import java.util.Date;

public class Order {
    private User user;
    private Product product;
    private float zje;
    private float sfje;
    private Date CJdate;

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public float getZje() { return zje; }
    public void setZje(float zje) { this.zje = zje; }
    public float getSfje() { return sfje; }
    public void setSfje(float sfje) { this.sfje = sfje; }
    public Date getCJdate() { return CJdate; }
    public void setCJdate(Date CJdate) { this.CJdate = CJdate; }
}
