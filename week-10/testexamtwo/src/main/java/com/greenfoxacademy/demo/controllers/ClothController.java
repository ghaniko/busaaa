package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.collections.ClothItem;
import com.greenfoxacademy.demo.collections.ClothSize;
import com.greenfoxacademy.demo.models.Cloth;
import com.greenfoxacademy.demo.services.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ClothController {

  @Autowired
  ClothService clothService;

  @Autowired
  ClothSize clothSize;

  @Autowired
  ClothItem clothItem;

  @GetMapping("/warehouse")
  public String showAllClothes(Model model){
    model.addAttribute("myClothes", clothService.findAllClothes());
    model.addAttribute("myClothItem", clothItem.getClothItem());
    model.addAttribute("myClothSize", clothSize.getClothSize());
    return "index";
  }

  @GetMapping("/warehouse/summary")
  public String showCloths(Model model,
                           @RequestParam/*(name = "clothItem", required = false)*/ String myClothItem,
                           @RequestParam/*(name = "clothSize", required = false*/ String myClothSize,
                           @RequestParam/*(name = "q", required = false)*/ int q) {
    List<Cloth> selectedCloth = clothService.findClothWithItemNameAndSize(myClothItem, myClothSize);
    for (int i = 0; i < selectedCloth.size(); i++) {
      selectedCloth.get(i).setInStore(q);
    }

    model.addAttribute("selectedClothes", selectedCloth);
    return "basket";
  }
}
