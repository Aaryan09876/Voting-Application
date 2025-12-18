package VotingApplicationSystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class VoteRequestDTO {
	@NotNull(message="Voter ID is Request")
	Long voterId;
	@NotNull(message="Candidate ID is Request")
	Long candidateId;
	public Long getVoterId() {
		return voterId;
	}
	public void setVoterId(Long voterId) {
		this.voterId = voterId;
	}
	public Long getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}

}
