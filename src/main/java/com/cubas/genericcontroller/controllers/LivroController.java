package com.cubas.genericcontroller.controllers;

import com.cubas.genericcontroller.models.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController extends ControllerBasic<Livro>{ }
