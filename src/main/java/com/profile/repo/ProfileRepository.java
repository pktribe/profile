package com.profile.repo;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import com.profile.model.UserProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional(isolation = Isolation.SERIALIZABLE)
public interface ProfileRepository extends JpaRepository<UserProfile, String> {
    
}
