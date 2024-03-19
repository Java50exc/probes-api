package telran.probes.dto;

import java.util.Arrays;
import java.util.Objects;

public record SensorUpdateData(long id, Range range, String[] emails) {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(emails);
		result = prime * result + Objects.hash(id, range);
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
		SensorUpdateData other = (SensorUpdateData) obj;
		return Arrays.equals(emails, other.emails) && id == other.id && Objects.equals(range, other.range);
	}
	

}
