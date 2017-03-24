package domain;

import java.io.Serializable;

/**
 * Created by zhaoke on 2017/3/24.
 */
public class ProductForm implements Serializable{
    private static final long serialVersionUID = 4992642221596771476L;

    private String name;
    private String description;
    private String  price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
