package VotingApplicationSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class ElectionResult {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	@NotBlank(message="ElectionName is Required")
	private String electionName;
	private int totalVotes;
	@OneToOne
	@JoinColumn(name="winner_id")
	@JsonIgnore
	private Candidate winner;
	@JsonProperty("winnerId")
	public Long getWinnerId() {
		return winner!=null?winner.getId():null;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
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
	public Candidate getWinner() {
		return winner;
	}
	public void setWinner(Candidate winner) {
		this.winner = winner;
	}
	

}
