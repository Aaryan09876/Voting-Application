package VotingApplicationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import VotingApplicationSystem.entity.Vote;

public interface VoteRepository extends JpaRepository<Vote,Long>{

}
