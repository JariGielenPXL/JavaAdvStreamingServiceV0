package be.pxl.ja.streamingservice.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String email;
    private String password;
    private PaymentInfo paymentInfo;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles = new ArrayList<>();

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
        Profile profile1 = new Profile();
        profiles.add(profile1);
    }

    public Profile getFirstProfile() {
        return profiles.get(0);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }

    public boolean verifyPassword(String password){
        return false; // ONTBREEKT CODE
    }
}
