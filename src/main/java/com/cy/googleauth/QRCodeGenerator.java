package com.cy.googleauth;

/**
 * Created by mars on 2015/4/22.
 */
public class QRCodeGenerator {


    public static QRCode buildCode(String key) {
        return new QRCode(key);
    }


}

