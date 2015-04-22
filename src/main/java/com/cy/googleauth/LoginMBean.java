package com.cy.googleauth;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;
import lombok.Getter;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 * stopwatch
 * Created by mars on 2015/4/22.
 */
@ManagedBean
@ViewScoped
public class LoginMBean implements Serializable {

    @Getter
    private String welcome;
    @Getter
    private QRCode code = QRCodeGenerator.buildCode("test");
    @Getter
    private String key1;

    @PostConstruct
    void init() {
        auth();
    }

    public void auth() {
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        final GoogleAuthenticatorKey key = gAuth.createCredentials();
        key1 = key.getKey();
        List<Integer> scratchCodes = key.getScratchCodes();
        int verificationCode = key.getVerificationCode();
        code = QRCodeGenerator.buildCode(key.getKey());
    }


}
