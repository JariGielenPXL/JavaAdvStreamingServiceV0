package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Account;
import be.pxl.ja.streamingservice.model.Profile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AccountConstructorTest {
    private Account account;
    private Profile profile;

    @Test
    public void createdNewProfileWithDateOfBirthIsNull(){
        account = new Account("jari.gielen@gmail.com","pass123");

        assertNull(account.getFirstProfile().getDateOfBirth());

    }
}
