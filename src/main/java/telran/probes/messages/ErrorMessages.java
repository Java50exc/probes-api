package telran.probes.messages;

public interface ErrorMessages {

	String MISSING_SENSOR_ID = "Missing sensor id";
	String MISSING_EMAILS = "Missing email addresses for sensor";
	String EMPTY_EMAILS = "Received empty list of emails";
	String MISSING_RANGE = "Missing range values for sensor";
	String MISSING_ACCOUNT = "Missing account for provided email";
	String MISSING_MIN_VALUE = "Missing min value in range";
	String MISSING_MAX_VALUE = "Missing max value in range";
	String RANGE_MIN_GREATER_THEN_MAX = "Max value must be greater then min value";
	String INVALID_EMAIL_FORMAT = "Email format is not valid: ";
	String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	
	String SENSOR_RANGE_ALREADY_EXISTS = "Range for a given sensor already exists";
	String SENSOR_EMAILS_ALREADY_EXISTS = "Emails for a given sensor already exists";
	String WRONG_EMAIL_FORMAT = "Wrong email format";
	String EMPTY_EMAIL = "Email must not be empty";

	
}
