package org.bgs.entity.goods;

import jakarta.persistence.*;
import lombok.*;
import org.bgs.entity.Producer;
import org.bgs.entity.CartGoods;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "producer")
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("accessories")
public class Accessories extends Goods {

    @ManyToOne(fetch = FetchType.LAZY)
    private Producer producer;

    @Builder
    public Accessories(String name, String description, Integer quantity,
                       Integer price, List<CartGoods> cartGoods, Producer producer) {
        super(name, description, quantity, price, cartGoods);
        this.producer = producer;
    }
}
