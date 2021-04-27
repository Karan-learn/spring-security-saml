package com.comakeit.saml.sso.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comakeit.saml.sso.auth.StoredUser;

@Repository
public interface UserRepository extends JpaRepository<StoredUser, String> {
    Optional<StoredUser> findByUsernameIgnoreCase(String username);
}
