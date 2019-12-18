package com.capgemini.springactuator.SpringActuator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
@RequestMapping("/")
public String message() {
	return "hello World";
}

}
