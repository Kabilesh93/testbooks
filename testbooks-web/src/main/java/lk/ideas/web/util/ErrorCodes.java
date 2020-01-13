package lk.ideas.web.util;

public interface ErrorCodes {
    public static final Integer SUCCESS = 0;
    public static final Integer AGREEMENT_VALIDATION_FAILED = 1;
    public static final Integer INTERNAL_SERVER_ERROR = 2;
    public static final Integer JDBC_CONNECTION_DROPPED = 3;
    public static final Integer BUDGET_RESERVATION_FAILED = 1;
    public static final Integer BAD_REQUEST = 4;
    public static final String THRESHOLD_EXCEEDED = "4";
    public static final String VALID_BUDGET_NOT_FOUND = "5";
    public static final String DATA_INTEGRITY_VIOLATION = "6";
    public static final String INSUFFICIENT_BALANCE = "7";
    public static final String NO_TRANSACTION = "8";
    public static final String INVALID_STATE_CHANGE = "9";
    public static final Integer RESERVATION_VALIDATION_FAILED = 10;
    public static final Integer MIFE_CALL_FAILED = 11;
    public static final Integer BUDGET_AMOUNT_INSUFFICIENT = 12;
    public static final Integer INVALID_BUDGET_ID = 13;
    public static final Integer INVALID_AGREEMENT_ID =14;
}
