package VotingApplicationSystem.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class ElectionResultResponseDTO {
	@NotBlank(message="Election name required")
	private String electionName;
	private int totalVotes;
	private Long winnerId;
	private int winnerVotes;
	public String getElectionName() {
		return electionName;
	}
	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}
	public int getTotalVotes() {
		return totalVotes;
	}
	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}
	public Long getWinnerId() {
		return winnerId;
	}
	public void setWinnerId(Long winnerId) {
		this.winnerId = winnerId;
	}
	public int getWinnerVotes() {
		return winnerVotes;
	}
	public void setWinnerVotes(int winnerVotes) {
		this.winnerVotes = winnerVotes;
	}
	
}
