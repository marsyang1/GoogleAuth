package com.cy.googleauth;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by mars on 2015/4/22.
 */
@Data
public class QRCode implements Serializable {

    private String renderMethod = "canvas";
    private String label = "";
    private int mode = 2;
    private int size = 200;
    private String fillColor = "7d767d";
    private String text;

    public QRCode(String text) {
        this.text = text;
    }

}
