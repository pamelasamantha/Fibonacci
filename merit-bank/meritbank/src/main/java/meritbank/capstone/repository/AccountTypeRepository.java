package meritbank.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import meritbank.capstone.model.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

}
