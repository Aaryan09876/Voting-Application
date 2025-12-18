package VotingApplicationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import VotingApplicationSystem.entity.Voter;

public interface VoterRepository extends JpaRepository<Voter,Long>{
     boolean existsByEmail(String email);
}
