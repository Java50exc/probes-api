package telran.probes.dto;

import jakarta.validation.constraints.NotNull;
import static telran.probes.messages.ErrorMessages.*;

public record Range(@NotNull(message = MISSING_MIN_VALUE) Double minValue, @NotNull(message = MISSING_MAX_VALUE) Double maxValue) {
	
	

}
