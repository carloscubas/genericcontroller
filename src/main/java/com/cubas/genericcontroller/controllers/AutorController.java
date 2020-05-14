package com.cubas.genericcontroller.controllers;

import com.cubas.genericcontroller.models.Autor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AutorController extends ControllerBasic<Autor>{


}