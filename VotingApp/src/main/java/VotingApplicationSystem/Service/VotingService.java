package VotingApplicationSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import VotingApplicationSystem.entity.Candidate;
import VotingApplicationSystem.entity.Vote;
import VotingApplicationSystem.entity.Voter;
import VotingApplicationSystem.exception.ResourceNotFoundException;
import VotingApplicationSystem.exception.VoteNotAllowedException;
import VotingApplicationSystem.repository.CandidateRepository;
import VotingApplicationSystem.repository.VoteRepository;
import VotingApplicationSystem.repository.VoterRepository;
import lombok.Data;
@Data
@Service
public class VotingService {
	private VoteRepository voteRepository;
	private CandidateRepository candidateRepository;
	private VoterRepository voterRepository;
	public VotingService(VoteRepository voteRepository, CandidateRepository candidateRepository,
			VoterRepository voterRepository) {
		
		this.voteRepository = voteRepository;
		this.candidateRepository = candidateRepository;
		this.voterRepository = voterRepository;
	}
	public Vote castVote(Long voterId,Long candidateId) {
		if(!voterRepository.existsById(voterId)) {
			throw new ResourceNotFoundException("Voter not found with ID"+voterId);
			
		}
		if(!candidateRepository.existsById(candidateId)) {
			throw new ResourceNotFoundException("Candidate not found with ID"+candidateId);
			
		}
		Voter voter=voterRepository.findById(voterId).get();
		if(voter.isHasVoted()) {
			throw new VoteNotAllowedException("Voter Id:"+voterId+"has already casted vote");
		}
		Candidate candidate=candidateRepository.findById(candidateId).get();
		Vote vote=new Vote();
		vote.setVoter(voter);
		vote.setCandidate(candidate);
		//voteRepository.save(vote);
		
		candidate.setVoteCount(candidate.getVoteCount()+1);
		candidateRepository.save(candidate);
		voter.setVote(vote);
		voter.setHasVoted(true);
		voterRepository.save(voter);
		return vote;
	}
    public List<Vote> getAllVotes(){
		return voteRepository.findAll();
	}

}
