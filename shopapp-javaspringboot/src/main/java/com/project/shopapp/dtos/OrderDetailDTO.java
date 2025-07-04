package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetailDTO {
    @JsonProperty("order_id")
    @Min(value = 1, message = "Order's ID must be > 0")
    private Long orderId;


    @JsonProperty("product_id")
    @Min(value = 1, message = "Product's ID must be > 0")
    private Long productId;

    @Min(value = 1, message = "Order's ID must be > 0")
    private Float price;

    @Min(value = 1, message = "number_of_product must be > 1")
    @JsonProperty("number_of_products")
    private int numberOfProduct;

    @JsonProperty("total_money")
    @Min(value = 0,message = "total_money must be > 0")
    private Float totalMoney;

    private String color;
}
