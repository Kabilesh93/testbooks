package lk.ideas.web.util;

import java.util.Collections;
import java.util.Map;

public class APIResponse<T> {
    private int executionCode;
    private T response;
    private String executionMessage;
    private Map<String, Object> additionalParams = Collections.EMPTY_MAP;

    protected APIResponse() {
    }

    public APIResponse(int executionCode, String executionMessage, T response) {
        this.executionCode = executionCode;
        this.response = response;
        this.executionMessage = executionMessage;
    }

    public Map<String, Object> getAdditionalParams() {
        return additionalParams;
    }

    public void setAdditionalParams(Map<String, Object> additionalParams) {
        this.additionalParams = additionalParams;
    }

    public int getExecutionCode() {
        return executionCode;
    }

    public void setExecutionCode(int executionCode) {
        this.executionCode = executionCode;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public String getExecutionMessage() {
        return executionMessage;
    }

    public void setExecutionMessage(String executionMessage) {
        this.executionMessage = executionMessage;
    }

    @Override
    public String toString() {
        return "APIResponse{" +
                "executionCode=" + executionCode +
                ", response=" + response +
                ", executionMessage='" + executionMessage + '\'' +
                '}';
    }
}
