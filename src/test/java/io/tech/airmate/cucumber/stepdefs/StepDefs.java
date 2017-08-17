package io.tech.airmate.cucumber.stepdefs;

import io.tech.airmate.AirmateApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AirmateApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
