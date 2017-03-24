package validator;

import domain.Product;
import form.ProductForm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoke on 2017/3/23.
 */
public class ProductValidator {
    public List<String> validate(ProductForm productForm) {
        List<String> errors = new ArrayList<String>();

        String name = productForm.getName();
        if (null == name || name.trim().isEmpty()) {
            errors.add("Product must have a name");
        }

        String price = productForm.getPrice();
        if (null == price || price.trim().isEmpty()) {
            errors.add("Product must have a price");
        } else {
            try {
                new BigDecimal(price);
            }catch (Exception e){
                errors.add("Invalid price value");
            }
        }

        return errors;
    }
}
