package telran.probes.messages;

public interface ErrorMessages {

	String MISSING_SENSOR_ID = "Missing sensor id";
	String MISSING_EMAILS = "Missing email addresses for sensor";
	String MISSING_RANGE = "Missing range values for sensor";
	String MISSING_MIN_VALUE = "Missing min value in range";
	String MISSING_MAX_VALUE = "Missing max value in range";
	
	String SENSOR_RANGE_ALREADY_EXISTS = "Range for a given sensor already exists";
	String SENSOR_EMAILS_ALREADY_EXISTS = "Emails for a given sensor already exists";
}
