package com.hendisantika.adminlte.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

public class SuVuController {

    @GetMapping(value = { "/", "/index" })
    public String index(HttpServletRequest repquest) {
        return "suvu/index";
    }

    @PostMapping(value = {"/xlsv"})
    public String xuLySuVu(HttpServletRequest request) {
        String maBuuGui = request.getParameter("maBuuGui");
        String loaiBuuGui = request.getParameter("loaiBuuGui");

        System.out.println(maBuuGui);
        System.out.println(loaiBuuGui);

        return "suvu/index";

//        XuLySuVu xlsv = new XuLySuVu();
//        if(xlsv.xulysuvu(maBuuGui, loaiBuuGui)) {
//            return "index";
//        } else {
//            return "addPerson";
//        }
    }

}
