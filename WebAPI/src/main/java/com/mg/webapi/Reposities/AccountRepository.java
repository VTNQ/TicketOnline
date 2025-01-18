package com.mg.webapi.Reposities;

import com.mg.webapi.Entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query("from Account a where a.email=:Email")
    Account findByEmail(@Param("Email") String email);
}