package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.domain.Periodical;
@Repository
public interface PeriodicalRepository extends JpaRepository<Periodical, Integer>{

}
