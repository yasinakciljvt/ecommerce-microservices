package com.ecommerce.user.repository;


import com.ecommerce.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    // Email adresine göre kullanıcıyı bulur
    Optional<User> findByEmail(String email);

    // Email adresinin kullanımda olup olmadığını kontrol eder (Kayıt olurken faydalıdır)
    boolean existsByEmail(String email);
}