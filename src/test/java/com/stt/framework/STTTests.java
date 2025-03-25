package com.stt.framework;

import org.testng.annotations.Test;

public class STTTests extends BaseSTT{

    @Test
    public void verifyLogin(){
        STTLoginPage sttLoginPage = new STTLoginPage(driver);
        sttLoginPage.login("standard_user", "secret_sauce");
    }
}
