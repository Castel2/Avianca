package com.Aviana.test.Avianca.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/", glue="com.Aviana.test.Avianca")
public class AcceptanceTestSuite {}
