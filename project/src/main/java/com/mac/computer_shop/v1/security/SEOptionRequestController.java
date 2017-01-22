/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mac.green_leaves.v1.security;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Mohan
 */
@CrossOrigin
@Controller
public class SEOptionRequestController {

    @RequestMapping(value = "/api/v1/**", method = RequestMethod.OPTIONS)
    @ResponseBody
    public ResponseEntity handleOptions() {
        System.out.println("options");
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
