package com.porfolioBER.BER.Repository;

import com.porfolioBER.BER.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Integer> {

    public Optional<Skills> findBySkill(String skill);

    public boolean existsBySkill(String skill);
}
