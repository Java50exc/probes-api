package telran.probes.dto;

import java.util.Arrays;
import java.util.Objects;

public record AccountDto(String username, String hashPassword, String[] roles) {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(roles);
		result = prime * result + Objects.hash(hashPassword, username);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountDto other = (AccountDto) obj;
		return Objects.equals(hashPassword, other.hashPassword) && Arrays.equals(roles, other.roles)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "AccountDto [username=" + username + ", hashPassword=" + hashPassword + ", roles="
				+ Arrays.toString(roles) + "]";
	}
	
	

}
