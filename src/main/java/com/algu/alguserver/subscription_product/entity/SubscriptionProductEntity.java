package com.algu.alguserver.subscription_product.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "subscription_product")
@NoArgsConstructor(access= AccessLevel.PRIVATE)
@Getter
public class SubscriptionProductEntity {

    @Id
    @Setter
    private ObjectId id;

    private String icon;

    private String name;

    private String link;

    private List<String> categories;

    @Builder
    public SubscriptionProductEntity(String id, String name, String icon, List<String> categories) {

    }

}
