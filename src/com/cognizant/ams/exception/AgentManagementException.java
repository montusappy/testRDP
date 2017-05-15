package com.cognizant.ams.exception;

public class AgentManagementException extends Exception {
    public AgentManagementException(String message) {
        super(message);
    }

    public AgentManagementException(Throwable throwable) {
        super(throwable);
    }

    public AgentManagementException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
