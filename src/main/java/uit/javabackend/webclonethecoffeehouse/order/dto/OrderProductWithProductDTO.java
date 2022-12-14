package uit.javabackend.webclonethecoffeehouse.order.dto;

import lombok.*;
import uit.javabackend.webclonethecoffeehouse.product.dto.ProductDTO;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductWithProductDTO {
    private UUID id;
    private String note;
    private String size;
    private String topping;
    private int totalPrice;
    private int quantity;
    private ProductDTO product;
}
