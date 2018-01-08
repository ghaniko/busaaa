package com.greenfoxacademy.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller

public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", required = false) String urlName) {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    int randomNumber = (int) (Math.random() * hellos.length);
    String[] colors = {"red", "green", "blue", "yellow", "pink", "purple"};
    int randomNumber2 = (int) (Math.random() * colors.length);
    int myRandomSize = (int) (Math.random() * 60) + 15;
    model.addAttribute("mySize", myRandomSize );
    model.addAttribute("myColor", colors[randomNumber2]);
    model.addAttribute("oneHello", hellos[randomNumber]);
    model.addAttribute("name", urlName);
    return "greeting";
  }
}
