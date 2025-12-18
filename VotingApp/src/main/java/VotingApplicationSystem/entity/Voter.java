package VotingApplicationSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Voter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message="Name is Required")
	private String name;
	@NotBlank(message="Email is Required")
	@Email(message="Invalid mail format")
	private String email;
	
	private boolean hasVoted=false;
	@OneToOne(mappedBy="voter",cascade=CascadeType.ALL)
	@JsonIgnore
	private Vote vote;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isHasVoted() {
		return hasVoted;
	}
	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	public Vote getVote() {
		return vote;
	}
	public void setVote(Vote vote) {
		this.vote = vote;
	}
	
}
