package com.algu.alguserver.subscription_product;


import com.algu.alguserver.subscription_product.entity.SubscriptionProductEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  SubscriptionProductRepository extends MongoRepository<SubscriptionProductEntity, ObjectId> {
}
