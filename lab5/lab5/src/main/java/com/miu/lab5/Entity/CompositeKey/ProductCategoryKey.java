package com.miu.lab5.Entity.CompositeKey;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProductCategoryKey implements Serializable {

    private Long product_Id;
    private Long category_Id;
}
