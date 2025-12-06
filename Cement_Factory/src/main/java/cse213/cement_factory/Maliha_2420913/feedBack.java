package cse213.cement_factory.Maliha_2420913;

import java.io.Serializable;

public class feedBack implements Serializable {
    private String name, type, feedbackText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public feedBack(String name, String type, String feedbackText) {
        this.name = name;
        this.type = type;
        this.feedbackText = feedbackText;
    }
}
