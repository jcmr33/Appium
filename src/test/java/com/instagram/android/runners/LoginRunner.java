package com.instagram.android.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/instagram/android/features/login.feature",
        glue = "com.instagram.android.definitions",
       tags = "@Login2",
        snippets = SnippetType.CAMELCASE
        
)
public class LoginRunner {

}
