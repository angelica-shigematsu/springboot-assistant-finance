package br.com.assistantfinance.finance.repositories;

import br.com.assistantfinance.finance.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByCpf(String id);
    Optional<User> findUserById(Long id);
}
