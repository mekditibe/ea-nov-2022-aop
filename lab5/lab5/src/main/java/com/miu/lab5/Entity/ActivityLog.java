package com.miu.lab5.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.miu.lab5.Entity.CompositeKey.ProductCategoryKey;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class ActivityLog {

//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   private Long Id;
   @EmbeddedId
    private ProductCategoryKey productCategoryKey;
    private LocalDate date;
    private String operation;
    private Long duration;


//    @ManyToOne
//    @MapsId("product_Id")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private Product product;
//
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    @ManyToOne
//    @MapsId("category_Id")
//    private Category category;


}
