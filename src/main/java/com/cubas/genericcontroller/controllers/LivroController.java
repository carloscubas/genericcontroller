package com.cubas.genericcontroller.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cubas.genericcontroller.models.Livro;

@RestController
@RequestMapping("/livros")
public class LivroController extends ControllerBasic<Livro> {
}
